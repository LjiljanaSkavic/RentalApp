package rentalapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee", schema = "rentaldb", catalog = "")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "role")
    private String role;

    @Basic
    @Column(name = "user_id")
    private int userId;
}
