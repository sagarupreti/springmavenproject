/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.service.impl;

import com.cibt.web.dao.CourseDAO;
import com.cibt.web.dao.EnquiryDAO;
import com.cibt.web.dto.EnquiryDTO;
import com.cibt.web.entity.Course;
import com.cibt.web.entity.Enquiry;
import com.cibt.web.service.EnquiryService;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ideapad-520S
 */
@Service
public class EnquiryServiceImpl implements EnquiryService {
     @Autowired
    private EnquiryDAO enquiryDAO;
     
     List<Course> courses=null;
     
     @Autowired
    private CourseDAO courseDAO;
   
      @Autowired
    private ModelMapper ModelMapper;
     
    @Override
    public int insert(EnquiryDTO enquiryDTO) {
         Enquiry enquiry=ModelMapper.map(enquiryDTO,Enquiry.class);
         return enquiryDAO.insert(enquiry);
    
    }

    @Override
    public List<Course> getCourses() {
       
        if(courses==null){
            courses=courseDAO.getAll();
            
        }
        return courses;
    }
}
