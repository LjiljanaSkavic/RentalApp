package rentalapp.dto;

import lombok.Data;

@Data
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String phone;
    private String role;
    private RentalFile image;
}
