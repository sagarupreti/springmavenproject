/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.entity;

import java.util.Date;

/**
 *
 * @author ideapad-520S
 */
public class Course {
    private int id;
    private String name,code;
    private int fees;
    private Date addedDate,modifiedDate;
    private boolean status;

    public Course() {
    }
    
    public Course(int id) {
        this.id=id;
    }
    

    public Course(int id, String name, String code, int fees, boolean status) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.fees = fees;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Course setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Course setCode(String code) {
        this.code = code;
        return this;
    }

    public int getFees() {
        return fees;
    }

    public Course setFees(int fees) {
        this.fees = fees;
        return this;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public Course setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public Course setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public boolean isStatus() {
        return status;
    }

    public Course setStatus(boolean status) {
        this.status = status;
        return this;
    }
    
    
}
