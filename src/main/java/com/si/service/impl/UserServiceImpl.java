package com.si.service.impl;

import com.si.mapper.UserMapper;
import com.si.model.User;
import com.si.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchongbei on 16-2-4.
 */

@Service
public class UserServiceImpl implements UserService {

    private static final Log LOG = LogFactory.getLog(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    public int insertUser(User user) {
        user.setUserName("hahahahaha");
        return userMapper.insertUser(user);
    }

    public List<User> queryUserList(Map params) {
        return userMapper.findUserByParams(params);
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
