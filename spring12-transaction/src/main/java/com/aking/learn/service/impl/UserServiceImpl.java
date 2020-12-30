package com.aking.learn.service.impl;

import com.aking.learn.mapper.UserMapper;
import com.aking.learn.pojo.User;
import com.aking.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUsers() {
        User user = new User().setName("libai").setPwd("wangwei");
        userMapper.addUser(user);
        userMapper.delUser(16L);
    }
}
