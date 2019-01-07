/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.dao.impl;

import com.cibt.web.dao.EnquiryDAO;
import com.cibt.web.entity.Enquiry;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ideapad-520S
 */
@Repository
public class EnquiryDAOImpl extends GenericDAOImpl<Enquiry> implements EnquiryDAO {

    @Override
    public List<Enquiry> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Enquiry model) {
        String sql="insert into enquiries(first_name,"
                + "last_name,email,contact_no,course_id)"
                + "values(?,?,?,?,?)";
        return jdbcTemplate
                .update(sql,new Object[]{
                    model.getFirstName(),
                    model.getLastName(),
                    model.getEmial(),
                    model.getContactNo(),
                    model.getCourse().getId()
                });
    }
    
}
