/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author ideapad-520S
 */
public class AppStarter implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext ctx) 
            throws ServletException {
        AnnotationConfigWebApplicationContext configuration
                =new AnnotationConfigWebApplicationContext();
        configuration.register(AppConfigurer.class);
        
        ServletRegistration.Dynamic
                dispatcher=ctx.addServlet("dispatcher",
                        new DispatcherServlet(configuration));
        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);
    }
    
} 
