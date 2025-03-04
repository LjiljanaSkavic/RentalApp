package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "employee", schema = "rentaldb", catalog = "")
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "role")
    private Object role;

    @Basic
    @Column(name = "user_id")
    private int userId;

    @Basic
    @Column(name = "user_profile_picture_id")
    private int userProfilePictureId;

}
