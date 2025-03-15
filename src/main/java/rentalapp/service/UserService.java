package rentalapp.service;

import rentalapp.dto.Employee;
import rentalapp.dto.PasswordRequest;

public interface UserService {
    Employee loginEmployee(String username, String password);

    Employee changePassword(Integer id, PasswordRequest passwordRequest);

}