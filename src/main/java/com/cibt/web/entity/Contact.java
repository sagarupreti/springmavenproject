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
public class Contact {
    private int id;
    private String name,emial,subject,message;
    private Date addedDate,modifiedDate;
    private boolean status;

    public Contact() {
    }

    public Contact(int id, String name, String emial, String subject, String message, boolean status) {
        this.id = id;
        this.name = name;
        this.emial = emial;
        this.subject = subject;
        this.message = message;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    
    

    public boolean isStatus () {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" + name + ", emial=" + emial + ", subject=" + subject + ", message=" + message + ", status=" + status + '}';
    }
    
    
    
}
