package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@jakarta.persistence.Table(name = "invoice", schema = "rentaldb", catalog = "")
@IdClass(entity.InvoiceEntityPK.class)
public class InvoiceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "rental_id")
    private int rentalId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pdf_file_id")
    private int pdfFileId;

}
