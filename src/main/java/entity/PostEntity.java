package entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "post", schema = "rentaldb", catalog = "")
public class PostEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "content")
    private String content;

    @Basic
    @Column(name = "date")
    private Timestamp date;

}
