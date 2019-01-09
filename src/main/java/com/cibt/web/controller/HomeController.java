/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.dao.CourseDAO;
import com.cibt.web.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ideapad-520S
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    
    @Autowired
    private CourseDAO CourseDAO;
    
    @Autowired
    private JdbcTemplate JdbcTemplate;
    
    @GetMapping("/")
    public String index(Model model) {
        
        model.addAttribute("courses",CourseDAO.getAll());
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact/index";   

    }
    @PostMapping("/contact")
    @ResponseBody
    public String contactPost(@ModelAttribute("contact")
    Contact contact,@RequestParam(value = "sendMe",required = false) boolean sendMe){
       
        String sql="insert into contacts(name,emial,"
                + "subjects,message,status)values(?,?,?,?,?)";
        int result = JdbcTemplate
                .update(sql,new Object[]{
                    contact.getName(),
                    contact.getEmial(),
                    contact.getSubject(),
                    contact.getMessage(),
                    contact.isStatus()
                
                });
        String message="<h1>Result: " + result;
        message +=(sendMe)?"send copy":"do not send copy";
        message +="</h1>";
        return message;
    }
    }
   
    

   