package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "manufacturer", schema = "rentaldb", catalog = "")
public class ManufacturerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "county")
    private String county;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "phone")
    private String phone;

    @Basic
    @Column(name = "fax")
    private String fax;

}
