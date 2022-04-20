package ru.sbt.uploadfile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sbt.uploadfile.service.FilesStorageService;

import javax.annotation.Resource;

@SpringBootApplication
public class FileUploadRestfulWebServiceApplication implements CommandLineRunner {

    @Resource
    FilesStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(FileUploadRestfulWebServiceApplication.class, args);
    }

    @Override
    public void run(String... arg) throws Exception {
        storageService.deleteAll();
        storageService.init();
    }
}