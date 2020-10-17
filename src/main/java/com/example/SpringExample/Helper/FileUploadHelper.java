///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.example.SpringExample.Helper;
//
// *
// * @author vijay
// */
//
//import java.io.IOException;
//import java.nio.file.Files;
//import javax.servlet.ServletContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//import javax.servlet.ServletContext;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Service;
//
//import org.springframework.stereotype.Component;
//
//@Component
//@Service
//public class FileUploadHelper 
//{
//@Autowired
//	ServletContext context;
//
////	private final String DIR=new ClassPathResource("resources/static/image/").getFile().getAbsolutePath();
////	public Helper() throws IOException {
////		// TODO Auto-generated constructor stub
////	}
////	
//public boolean fileUploader(MultipartFile multipartFile) throws IOException
//{
//	boolean f=false;
//
////	byte[] bytesd=multipartFile.getBytes();
////	Path paths=(Path) Paths.get(context.getRealPath("upload")+multipartFile.getOriginalFilename());	
////        System.out.println("paths...:"+paths.toAbsolutePath());
//
//    public String DIR;
//        public FileUploadHelper()throws IOException
//        {
//        DIR = new ClassPathResource("resources/static/image/").getFile().getAbsolutePath();
//            
//       }
//		Files.copy(multipartFile.getInputStream(),Paths.get(DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
////     		Files.copy(multipartFile.getInputStream(),Paths.get(context.getRealPath("upload")+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
//
//                //	Files.write(paths,bytes);
//                //        Files.write(paths, bytesd,);
//               
//	return f=true;
//
//}
//}
