package com.service;

import com.dao.UserDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    private UserDAO userDAO;


    //defoult constructor for <bean id="userService"
    public UserService() {
    }

    //constructor for bean userService2
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;

    }

    public List getAllUsers(){
        return userDAO.getAllUsers();
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
