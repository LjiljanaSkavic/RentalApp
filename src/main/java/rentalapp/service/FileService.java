package rentalapp.service;

import rentalapp.dto.RentalFile;

public interface FileService {
    RentalFile getById(Integer id);
}
