package com.aking.learn.service;

import com.aking.learn.dao.UserDao;
import com.aking.learn.dao.UserDaoImpl;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-28
 */
public class UserServiceImpl implements UserService{
    /**
     * 原来实现代码方式
     */
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
