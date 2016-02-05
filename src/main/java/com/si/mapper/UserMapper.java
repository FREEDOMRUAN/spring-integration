package com.si.mapper;

import com.si.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by wangchongbei on 16-2-3.
 */

@Repository
public interface UserMapper {

    int insertUser(User user);

    List<User> findUserByParams(Map params);

    int deleteUserById(Long id);

    int updateUser(User user);


}
