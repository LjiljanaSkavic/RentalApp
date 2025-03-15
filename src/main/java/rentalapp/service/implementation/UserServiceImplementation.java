package rentalapp.service.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentalapp.dto.Employee;
import rentalapp.dto.PasswordRequest;
import rentalapp.dto.RentalFile;
import rentalapp.entity.EmployeeEntity;
import rentalapp.entity.FileEntity;
import rentalapp.entity.UserEntity;
import rentalapp.repository.EmployeeRepository;
import rentalapp.repository.FileRepository;
import rentalapp.repository.UserRepository;
import rentalapp.service.UserService;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private final ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public UserServiceImplementation(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public Employee loginEmployee(String username, String password) {
        try {
            UserEntity user = userRepository.findByUsernameAndPassword(username, password);
            if (user != null) {
                return getEmployeeDTO(user);
            }
        } catch (Exception e) {

            System.err.println("Error during employee login: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Employee changePassword(Integer id, PasswordRequest passwordRequest) {
        UserEntity user = userRepository.findByIdAndPassword(id, passwordRequest.getCurrentPassword());
        if (user != null) {
            user.setPassword(passwordRequest.getNewPassword());
            userRepository.save(user);
        }
        return user != null ? getEmployeeDTO(user) : null;
    }


    private Employee getEmployeeDTO(UserEntity user) {
        EmployeeEntity employeeEntity = employeeRepository.findByUserId(user.getId());
        FileEntity userProfilePictureFile = fileRepository.findById(user.getProfilePictureId()).orElse(null);
        String role = employeeEntity.getRole();
        Employee employee = modelMapper.map(user, Employee.class);
        RentalFile rentalFile = convertFileDTO(userProfilePictureFile);
        employee.setImage(rentalFile);
        employee.setRole(role);
        return employee;
    }

    private RentalFile convertFileDTO(FileEntity fileEntity) {
        return modelMapper.map(fileEntity, RentalFile.class);
    }
}
