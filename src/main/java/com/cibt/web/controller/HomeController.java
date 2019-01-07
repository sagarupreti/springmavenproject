/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.dao.CourseDAO;
import com.cibt.web.entity.Contact;
import com.cibt.web.entity.Course;
import com.cibt.web.entity.Enquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private JdbcTemplate jdbcTemplate;
    
    @GetMapping("/")
    public String index(Model model) {
        
        model.addAttribute("courses", CourseDAO.getAll());
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact/index";   

    }

    @PostMapping("/contact")
    @ResponseBody
    public String contactPost(@ModelAttribute("Contact") 
            Contact contact,@RequestParam(value = "sendMe",required = false)boolean sendMe){
               
        String sql="insert into contacts(name,email,"
                +"subject,message,status)values(?,?,?,?,?)";
                int result = jdbcTemplate
                        .update(sql,new Object[]{
                          contact.getName(),
                          contact.getEmial(),
                          contact.getSubject(),
                          contact.getMessage(),
                          contact.isStatus() 
                        });
                String message="<h1>Result: " + result;
                message +=(sendMe)?"Send copy":"do not send copy";
                message +="</h1>";
                return message ;
    }
}
   