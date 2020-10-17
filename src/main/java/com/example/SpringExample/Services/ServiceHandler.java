/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringExample.Services;

import com.example.SpringExample.Dao.UserServiceRegister;
import com.example.SpringExample.Dao.UserServicesRepositry;
import com.example.SpringExample.Entitys.UserEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author vijay
 */
@Component
@Service
public class ServiceHandler {
    @Autowired
	private UserServicesRepositry userserviceimple;
         
	   UserEntity us=new UserEntity();
//	List<User> list=new ArrayList<>();;
	
	public ServiceHandler()
	{
//	list.add(new User(1,"vijay","moga"));
	}
   
	//Get all User
		public List<UserEntity> getallUser() {
		
			List<UserEntity> list=(List<UserEntity>)userserviceimple.findAll();
	          return list;
	}
		

		//Add User in List
		public UserEntity addUserinfo(UserEntity user) {
		
			// TODO Auto-generated method stub
			UserEntity resultUser=userserviceimple.save(user);
//			list.add(user);
			return resultUser;
			
		}
//user find by id
		public UserEntity findbyid(int id)
		{
			
			UserEntity user=userserviceimple.findById(id);
			return user;
		}
	
		//update data by id
		public UserEntity updateUserById(UserEntity us) 
                {
			UserEntity user=userserviceimple.save(us);
			return user;
			
		}

		
		//Delete By Id
		public String deleteUserById(int id)
		{
                    
                    userserviceimple.deleteById(id);
			if (us.getId()== id) {
				
				return "false";
			
			}
			return "deleted";
		}
		
                //user register data
                public void userRegister(UserEntity us)
                {
                    try {
                        
                   userserviceimple.save(us);
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                 
                }
    
    
    
}
