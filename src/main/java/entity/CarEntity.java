package entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "car", schema = "rentaldb", catalog = "")
public class CarEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "aquisition_date")
    private Timestamp aquisitionDate;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "vehicle_id")
    private int vehicleId;

    @Basic
    @Column(name = "vehicle_vehicle_picture_id")
    private int vehicleVehiclePictureId;

}
