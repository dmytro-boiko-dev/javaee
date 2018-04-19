package com.service;

import com.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext
            ("/spring-application.xml");

    UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
    System.out.println(userDAO.getAllUsers());
    }
}
