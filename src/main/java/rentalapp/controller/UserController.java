package rentalapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rentalapp.dto.Employee;
import rentalapp.dto.LoginRequest;
import rentalapp.dto.PasswordRequest;
import rentalapp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        try {
            String username = loginRequest.getUsername();
            String password = loginRequest.getPassword();

            Employee employee = userService.loginEmployee(username, password);
            if (employee != null) {
                return ResponseEntity.ok(employee);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while logging in.");
        }
    }

    @PostMapping("/change-password/{id}")
    public Employee changePassword(@PathVariable Integer id, @RequestBody PasswordRequest passwordRequest) {
        try {
            return userService.changePassword(id, passwordRequest);
        } catch (Exception e) {
            throw e;
        }
    }
}
