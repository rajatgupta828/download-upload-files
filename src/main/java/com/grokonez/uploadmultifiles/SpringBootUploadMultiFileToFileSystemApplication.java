package com.grokonez.uploadmultifiles;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.grokonez.uploadmultifiles.filestorage.FileStorage;

@SpringBootApplication
public class SpringBootUploadMultiFileToFileSystemApplication implements CommandLineRunner {

	@Resource
	FileStorage fileStorage;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadMultiFileToFileSystemApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		fileStorage.deleteAll();
		fileStorage.init();
	}
}
