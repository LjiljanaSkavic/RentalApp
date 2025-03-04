package rentalapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "invoice", schema = "rentaldb", catalog = "")
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "rental_id")
    private int rentalId;

    @Basic
    @Column(name = "pdf_file_id")
    private int pdfFileId;

}
