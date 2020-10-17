//package com.example.SpringExample.MyRestController;
//import com.example.SpringExample.Helper.FileUploadHelper;
//import java.io.IOException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
///**
// *
// * @author vijay
// */
//@RestController
//public class FileUploadController {
//    
//        @Autowired
//	private FileUploadHelper helper;
//	@PostMapping("/file-upload")
//	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file)throws IOException
//                          {
////    return ResponseEntity.ok("hello");
//	try {
//		boolean f=helper.fileUploader(file);
//		if (true) {
////			return ResponseEntity.ok("file uploadded Successfully at Location:"+path+ServletUriComponentsBuilder.fromCurrentContextPath().path("/static/image/Screenshot(1).png").toUriString());
//			return ResponseEntity.ok("okk");
//		}
//        }   catch(Exception e)
//        {
//		e.printStackTrace();
//	                                  }
//		
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong");
//                          }
//}
