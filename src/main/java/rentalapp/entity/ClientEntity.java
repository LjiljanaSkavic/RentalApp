package rentalapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "client", schema = "rentaldb", catalog = "")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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
