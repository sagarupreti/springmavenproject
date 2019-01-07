/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.dao.CourseDAO;
import com.cibt.web.dao.EnquiryDAO;
import com.cibt.web.dto.EnquiryDTO;
import com.cibt.web.entity.Course;
import com.cibt.web.entity.Enquiry;
import com.cibt.web.service.EnquiryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ideapad-520S
 */
@Controller
@RequestMapping(value = "/enquiry")
public class EnquiryController {
    
    @Autowired
    private EnquiryService enquiryService;
    
    
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("courses",enquiryService.getCourses());
        return "enquiry/index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    String save(@ModelAttribute("EnquiryDTO") EnquiryDTO enquiryDTO) {
   
        return "<h1>Result: " + 
                enquiryService.insert(enquiryDTO) + "</h1>";
    }
}
