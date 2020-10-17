/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringExample.MyRestController;
import com.example.SpringExample.Entitys.UserEntity;
import com.example.SpringExample.Services.ServiceHandler;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author vijay
 */
@RestController
public class MyRestController {
    
    
    @Autowired
	private ServiceHandler userServices;
   
	// Get all data from database
	@GetMapping("/user")	
	public ResponseEntity<List<UserEntity>> getAllUser()
	{
		
	List<UserEntity>list=userServices.getallUser();
	if(list.size()<=0)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	 
	return ResponseEntity.of(Optional.of(list));

	}
   
	//Save data in database
	@PostMapping("/user")
	public UserEntity addUser(@RequestBody UserEntity user) {
		
		UserEntity resultUser=null;
		try {
			resultUser=userServices.addUserinfo(user);
			
		} catch (Exception e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
		}
		return resultUser;
	}
	
	// Get User By Id
	@GetMapping("/user/{userid}")
	public UserEntity userfindbyid(@PathVariable("userid") int userid)
	{
		return this.userServices.findbyid(userid);
	}
	
	//Update data By Id
	@PutMapping("/user")
	public UserEntity updateUserByd(@RequestBody UserEntity us)
	{
	return this.userServices.updateUserById(us);
	}
	
	//Delete by Id
	@DeleteMapping(path="/user/{id}")
	public String deleteById(@PathVariable int id)
	{
	return userServices.deleteUserById(id);
	}
	
//    @PostMapping("/file")
//    	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file)
//        {
//        return ResponseEntity.ok("hello okk");
//    }
        //consume rest Sace User register form
        @PostMapping(path = "/register")
        public String userSaveInDatabase(@RequestBody  UserEntity us)
        {
            userServices.userRegister(us);
            return "okk";
        }
}
