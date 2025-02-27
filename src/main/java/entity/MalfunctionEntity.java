package entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "malfunction", schema = "rentaldb", catalog = "")
public class MalfunctionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "date")
    private Date date;

    @Basic
    @Column(name = "time")
    private Time time;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "vehicle_id")
    private int vehicleId;

}
