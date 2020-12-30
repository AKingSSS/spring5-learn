package com.aking.learn.mapper;

import com.aking.learn.pojo.User;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-30
 */
public interface UserMapper {
    List<User> getUserList();

    int addUser(User user);

    int delUser(Long id);

}
