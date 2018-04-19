package com.service;

import com.dao.UserDAO;
import com.models.TaggingTaskEntity;
import com.models.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserDAO userDAO;

    //public List<UsersEntity> getAllUsers(){
    public List<TaggingTaskEntity> getAllUsers(){
        return userDAO.getAllUsers();
    }

//    //new part from spring1
//    public void setUserDAO(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
}
