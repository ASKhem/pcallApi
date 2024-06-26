package com.pcallserver.pcall.image;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class ImageServeController {

    @GetMapping("/images/{filename:.+}")
    ResponseEntity<Resource> serveFile(@PathVariable String filename) {

        Path file = Paths.get("src/main/resources/static/images/" + filename);
        Resource resource = null;
        try {
            resource = new UrlResource(file.toUri());
        } catch (MalformedURLException e) {
            
        }

        return ResponseEntity.ok().body(resource);
    }
}