/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web;

import java.util.Properties;
import javax.sql.DataSource;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author ideapad-520S
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.cibt.web")
@PropertySource(value = "classpath:application.properties")
public class AppConfigurer {
    
    @Value(value = "${jdbc.driverClassName}")
    private String jdbcDriver;
    @Value(value = "${jdbc.url}")
    private String jdbcURL;
    @Value(value = "${jdbc.username}")
    private String jdbcUser;
    @Value(value = "${jdbc.password}")
    private String jdbcPassword;
    @Value(value = "${mvc.web.prefix}")
    private String mvcPrefix;
    @Value(value = "${mvc.web.suffix}")
    private String mvcSuffix;
    
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource
                ds=new DriverManagerDataSource(jdbcURL, jdbcUser, jdbcPassword);
        ds.setDriverClassName(jdbcDriver);
        return ds;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate(){
      return new JdbcTemplate(getDataSource());
    }
    
    @Bean
    public Properties getHibernateProperties(){
        Properties properties=new Properties();
        properties.put("hibernate.dialect","org.hibernate.dialect");
        properties.put("show_sql",true);
        return properties;
    }
    
    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean bean
                =new LocalSessionFactoryBean();
        bean.setPackagesToScan("com.cibt.web.entity");
        bean.setDataSource(getDataSource());
        bean.setHibernateProperties(getHibernateProperties());
        return bean;
    }
    
    @Bean
    public ModelMapper  getModelMaapper(){
        return new ModelMapper();
    }
    
    @Bean
    public InternalResourceViewResolver getViewResolver(){
        return
        new InternalResourceViewResolver(
        mvcPrefix,mvcSuffix);
    }
    
}
