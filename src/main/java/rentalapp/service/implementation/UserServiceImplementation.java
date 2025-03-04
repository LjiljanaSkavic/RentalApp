package rentalapp.service.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentalapp.dto.Employee;
import rentalapp.entity.EmployeeEntity;
import rentalapp.entity.UserEntity;
import rentalapp.repository.EmployeeRepository;
import rentalapp.repository.UserRepository;
import rentalapp.service.UserService;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private final ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public UserServiceImplementation(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public Employee login(String username, String password) {
        UserEntity user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            EmployeeEntity employeeEntity = employeeRepository.findByUserId(user.getId());
            String role = employeeEntity.getRole();
            return getEmployeeDTO(user, role);
        } else {
            return null;
        }
    }

    private Employee getEmployeeDTO(UserEntity user, String role) {
        Employee employee = modelMapper.map(user, Employee.class);
        employee.setRole(role);
        return employee;
    }
}
