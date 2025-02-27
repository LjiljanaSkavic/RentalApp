package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "file", schema = "rentaldb", catalog = "")
public class FileEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "path")
    private String path;

    @Basic
    @Column(name = "is_deleted")
    private byte isDeleted;

}
