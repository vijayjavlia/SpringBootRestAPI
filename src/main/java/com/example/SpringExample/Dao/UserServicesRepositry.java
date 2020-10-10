/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringExample.Dao;

import com.example.SpringExample.Entitys.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vijay
 */
public interface UserServicesRepositry extends JpaRepository<UserEntity,Integer>{
     
    public UserEntity findById(int id);
    
    
}
