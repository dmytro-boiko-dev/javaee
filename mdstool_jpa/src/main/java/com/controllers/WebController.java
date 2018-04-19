package com.controllers;


import com.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/test")
public class WebController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        //writer.println("show me the money");

        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/webapp/WEB-INF/spring-application.xml");
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
        writer.println(userDAO.getAllUsers());

    }
}
