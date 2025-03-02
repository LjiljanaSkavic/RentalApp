package service;

import dto.Employee;

public interface UserService {
    Employee login(String username, String password);
}