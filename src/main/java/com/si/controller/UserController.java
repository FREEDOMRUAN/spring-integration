package com.si.controller;

import com.si.model.User;
import com.si.service.UserService;
import com.si.service.impl.UserServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * Created by wangchongbei on 16-2-3.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController implements ApplicationContextAware {

    private static final Log LOG = LogFactory.getLog(UserController.class);


    private ApplicationContext applicationContext;

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    private String register() {
        return "user/register";
    }

    @RequestMapping("/insert")
    private String saveUser() {

        userService.insertUser(new User());

        return "index";
    }

    @RequestMapping("/listUsers")
    public String listUser(HttpServletRequest request, HttpServletResponse response) {

        request.setAttribute("userList", userService.queryUserList(null));

        return "/user/userList";
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    private void init() {
        LOG.info(System.getProperty("line.separator") + "-----------BeanDefinitionCount:" + applicationContext.getBeanDefinitionCount() + "   BeanDefinitionNames" +
                "-------------" + Arrays.asList(applicationContext.getBeanDefinitionNames()));
    }
}
