package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "electric_scooter", schema = "rentaldb", catalog = "")
public class ElectricScooterEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
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
