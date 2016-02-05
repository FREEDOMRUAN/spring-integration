package com.si.service;

import com.si.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by wangchongbei on 16-2-4.
 */
public interface UserService {

    int insertUser(User user);

    List<User> queryUserList(Map params);

}
