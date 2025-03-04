package rentalapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "electric_bike", schema = "rentaldb", catalog = "")
public class ElectricBikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "range_per_charge")
    private int rangePerCharge;

    @Basic
    @Column(name = "vehicle_id")
    private int vehicleId;

    @Basic
    @Column(name = "vehicle_vehicle_picture_id")
    private int vehicleVehiclePictureId;

}
