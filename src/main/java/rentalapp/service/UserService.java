package rentalapp.service;

import rentalapp.dto.Employee;

public interface UserService {
    Employee login(String username, String password);
}