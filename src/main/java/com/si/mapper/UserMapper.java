package com.si.mapper;

import com.si.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by wangchongbei on 16-2-3.
 */

@Repository
public interface UserMapper {

    int insertUser(User user);

}
