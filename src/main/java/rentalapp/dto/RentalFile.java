package rentalapp.dto;

import lombok.Data;

@Data
public class RentalFile {
    private Integer id;
    private String name;
    private String type;
    private String path;
}
