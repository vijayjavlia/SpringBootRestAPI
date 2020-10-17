/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringExample.Controller;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author vijay
 */
@Controller
public class MyMvcController {
    @RequestMapping(value="/index",method = RequestMethod.GET)
   public String indexPage(Model model)
   {
       
       model.addAttribute("name","vijay kumar");
       model.addAttribute("date",new Date().toString());
       return "index";
   }
    
}
