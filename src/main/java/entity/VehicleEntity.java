package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "vehicle", schema = "rentaldb", catalog = "")
@IdClass(entity.VehicleEntityPK.class)
public class VehicleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "vehicle_code")
    private String vehicleCode;

    @Basic
    @Column(name = "purchase_price")
    private double purchasePrice;

    @Basic
    @Column(name = "model")
    private String model;

    @Basic
    @Column(name = "status")
    private Object status;

    @Basic
    @Column(name = "manufacturer_id")
    private int manufacturerId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "vehicle_picture_id")
    private int vehiclePictureId;

}
