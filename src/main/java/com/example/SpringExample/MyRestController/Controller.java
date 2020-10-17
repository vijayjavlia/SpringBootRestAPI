/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringExample.MyRestController;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author vijay
 */
@org.springframework.stereotype.Controller
public class Controller {
    
    @GetMapping("/register")
   public String register()
   {
       return "register";
   }
    
}
