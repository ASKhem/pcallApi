package com.pcallserver.pcall.image;

import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.util.StringUtils;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

@Service
public class ImageService {
    private final Path rootLocation = Paths.get("src/main/resources/static/images/components/");

    public String store(MultipartFile file) throws Exception {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        String extension = StringUtils.getFilenameExtension(filename);
        String storedFilename = System.currentTimeMillis() + "." + extension;
        if (file.isEmpty())
            throw new Exception("archivo enviado vacío");
        if (filename.contains(".."))
            throw new Exception("nombre de archivo incorrecto");
        try (InputStream inputStream = file.getInputStream()) {
            Files.copy(inputStream, this.rootLocation.resolve(storedFilename),
                    StandardCopyOption.REPLACE_EXISTING);
            return storedFilename;
        } catch (IOException ioe) {
            throw new Exception("Error al almacenar el archivo");
        }
    }

    public Resource loadAsResource(String filename) {
        try {
            Path file = rootLocation.resolve(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("Error IO");
        }
        return null;
    }

    public boolean delete(String filename) {
        try {
            Path file = rootLocation.resolve(filename);
            if (Files.exists(file)) {
                Files.delete(file);
                return true;
            } else
                return false;
        } catch (IOException ioe) {
            return false;
        }
    }
}
