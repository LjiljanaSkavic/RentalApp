package rentalapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "electric_scooter", schema = "rentaldb", catalog = "")
public class ElectricScooterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "max_speed")
    private int maxSpeed;

    @Basic
    @Column(name = "vehicle_id")
    private int vehicleId;

    @Basic
    @Column(name = "vehicle_vehicle_picture_id")
    private int vehicleVehiclePictureId;

}
