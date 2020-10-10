/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringExample.MyRestController;

import com.example.SpringExample.Helper.FileUploadHelper;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author vijay
 */
public class FileUploadController {
    
    @Autowired
	private FileUploadHelper helper;
	@PostMapping("/file-upload")
	public ResponseEntity<String > fileUpload(@RequestParam("file") MultipartFile file) throws IOException
{
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
//		System.out.println(file.getContentType());
//		String path=new ClassPathResource("/resources").getFile().getAbsolutePath();
	try {
		boolean f=helper.fileUploader(file);
		if (true) {
//			return ResponseEntity.ok("file uploadded Successfully at Location:"+path+ServletUriComponentsBuilder.fromCurrentContextPath().path("/static/image/Screenshot(1).png").toUriString());
			return ResponseEntity.ok("okk");
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong");
	}
    
    
    
}
