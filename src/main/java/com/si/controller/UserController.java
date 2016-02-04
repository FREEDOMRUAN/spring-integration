package com.si.controller;

import com.si.model.User;
import com.si.service.UserService;
import com.si.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.soap.SOAPBinding;

/**
 * Created by wangchongbei on 16-2-3.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserServiceImpl userService;

    private User user;

    @RequestMapping("/insert_user")
    public void saveUser() {
        userService.insertUser(user);
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
