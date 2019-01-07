/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.dao.impl;

import com.cibt.web.dao.CourseDAO;
import com.cibt.web.entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ideapad-520S
 */
@Repository
public class CourseDAOImpl extends GenericDAOImpl<Course>
implements CourseDAO {
    @Override
    public List<Course> getAll() {
         System.out.println("I really really got hit here");
        return jdbcTemplate
                .query("select * from Courses",
                        new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
                return
                        new Course()
                        .setId(rs.getInt("id"))
                        .setName(rs.getString("name"))
                        .setCode(rs.getString("code"))
                        .setAddedDate(rs.getDate("added_date"))
                        .setModifiedDate(rs.getDate("modified_date"))
                        .setStatus(rs.getBoolean("status"));
           }
        });
        
    }

    @Override
    public int insert(Course model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
