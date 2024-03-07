package com.latha.springweb.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RestController
public class FileController {
    private String UPLOAd_DIR ="/home/latha/Pictures/Photos/";
    @PostMapping("/upload")
    public boolean upload(@RequestParam("file")MultipartFile file) throws IOException {
        file.transferTo(new File(UPLOAd_DIR + file.getOriginalFilename()));
        return  true;

    }
@GetMapping("/download/{filename}")
    public ResponseEntity<byte[]>download(@PathVariable("filename") String fileName) throws IOException {
    byte[] fileData = Files.readAllBytes(new File(UPLOAd_DIR + fileName).toPath());

    HttpHeaders  headers= new HttpHeaders();
    headers.setContentType(MediaType.IMAGE_JPEG);

    return new ResponseEntity<byte[]>(fileData, HttpStatus.OK)
    }
}
