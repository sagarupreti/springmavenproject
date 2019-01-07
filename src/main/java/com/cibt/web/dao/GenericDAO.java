/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.dao;

import java.util.List;

/**
 *
 * @author ideapad-520S
 */
public interface GenericDAO<T> {
    List<T> getAll();
    int insert(T model);
    
}
