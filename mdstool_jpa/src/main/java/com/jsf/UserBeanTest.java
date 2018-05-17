//package com.jsf;
//
//import com.dao.UserDAO;
//import com.models.UsersEntity;
//
//import javax.faces.bean.RequestScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//import java.io.Serializable;
//import java.util.List;
//
////@ManagedBean(name = "userBeanTest")    // JSF
////@ViewScoped                         // JSF
//
//@Named("userBeanTest")
//@RequestScoped
//
//public class UserBeanTest implements Serializable {
//
//    @Inject
//    private UserDAO userDao;
//
//    private int id;
//    private String name;
//    private String email;
//
//    public List<UsersEntity> users() {
//        return userDao.getAllUsers();
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//
//}