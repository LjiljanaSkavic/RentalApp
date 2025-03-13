package rentalapp.service;

import rentalapp.dto.Employee;

public interface UserService {
    Employee loginEmployee(String username, String password);

}