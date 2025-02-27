package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "client", schema = "rentaldb", catalog = "")
public class ClientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "card_number")
    private String cardNumber;

    @Basic
    @Column(name = "user_id")
    private int userId;

    @Basic
    @Column(name = "user_profile_picture_id")
    private int userProfilePictureId;

}
