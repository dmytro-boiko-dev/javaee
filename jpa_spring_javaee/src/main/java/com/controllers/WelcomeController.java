package com.controllers;

import com.models.UsersEntity;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/welcome-spring") // http://localhost:8888/abc/welcome-spring/hello
public class WelcomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String sayHello(){
        return "hello from spring controller";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getMenuPage(){
        ModelAndView modelAndView = new ModelAndView("menu");
        return modelAndView;
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUsersPage(){
        ModelAndView modelAndView = new ModelAndView("users");
        List<UsersEntity> allUsers = userService.getAllUsers();
        modelAndView.addObject("userList", allUsers);
        return modelAndView;
    }

}
