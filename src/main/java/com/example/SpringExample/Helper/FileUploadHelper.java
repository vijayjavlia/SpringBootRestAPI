/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringExample.Helper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort.Path;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author vijay
 */
public class FileUploadHelper 
{
@Autowired
	ServletContext context;
	
	
	
//	private final String DIR=new ClassPathResource("resources/static/image/").getFile().getAbsolutePath();
//	public Helper() throws IOException {
//		// TODO Auto-generated constructor stub
//	}
//	
public boolean fileUploader(MultipartFile multipartFile) throws IOException
{
	boolean f=false;

	byte[] bytesd=multipartFile.getBytes();
//	Path paths=(Path) Paths.get(context.getRealPath("image")+multipartFile.getOriginalFilename());	
	try {
//		Files.copy(multipartFile.getInputStream(),Paths.get(DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
     		Files.copy(multipartFile.getInputStream(),Paths.get(context.getRealPath("image")+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);

//	Files.write(paths,bytes);
//        Files.write(paths, bytesd,);
         
	f=true;
	} catch (Exception e) {
//		// TODO: handle exception
		e.printStackTrace();
	}
	return f;

}
    


    
}
