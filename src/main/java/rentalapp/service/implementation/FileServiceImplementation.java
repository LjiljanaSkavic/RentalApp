package rentalapp.service.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import rentalapp.dto.RentalFile;
import rentalapp.entity.FileEntity;
import rentalapp.repository.FileRepository;
import rentalapp.service.FileService;

import java.util.Optional;

public class FileServiceImplementation implements FileService {
    @Autowired
    private final ModelMapper modelMapper;
    @Autowired
    private FileRepository fileRepository;

    public FileServiceImplementation(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public RentalFile getById(Integer id) {
        Optional<FileEntity> fileEntity = fileRepository.findById(id);
        return fileEntity.map(this::convertFileDTO).orElse(null);
    }

    private RentalFile convertFileDTO(FileEntity fileEntity) {
        return modelMapper.map(fileEntity, RentalFile.class);
    }
}
