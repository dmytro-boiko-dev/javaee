package com_2;

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
public class WelcomeController2 {

    @Autowired
    private UserService2 userService2;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String sayHello(){
        return "hello from spring controller" + userService2.getAllUsers().toString();
    }
}
