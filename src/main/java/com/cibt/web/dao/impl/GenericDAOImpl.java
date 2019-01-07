 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.dao.impl;

import com.cibt.web.dao.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author ideapad-520S
 */
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
