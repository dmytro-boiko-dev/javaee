package com.service;

import com.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("src/main/webapp/WEB-INF/spring-application.xml");

//        UserService userService = context.getBean("userService", UserService.class);
//        System.out.println(userService.getAllUsers());
    UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
    System.out.println(userDAO.getAllUsers());


    }
}
