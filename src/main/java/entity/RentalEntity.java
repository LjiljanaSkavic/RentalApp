package entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "rental", schema = "rentaldb", catalog = "")
public class RentalEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "start")
    private Timestamp start;

    @Basic
    @Column(name = "end")
    private Timestamp end;

    @Basic
    @Column(name = "start_location")
    private Object startLocation;

    @Basic
    @Column(name = "end_location")
    private Object endLocation;

    @Basic
    @Column(name = "duration")
    private Time duration;

    @Basic
    @Column(name = "identification_card")
    private String identificationCard;

    @Basic
    @Column(name = "driver_licence")
    private String driverLicence;

    @Basic
    @Column(name = "client_id")
    private int clientId;

}
