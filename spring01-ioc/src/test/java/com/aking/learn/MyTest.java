package com.aking.learn;

import com.aking.learn.dao.UserDaoMysqlImpl;
import com.aking.learn.service.UserService;
import com.aking.learn.service.UserServiceImpl;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-28
 */
public class MyTest {
    public static void main(String[] args) {
        // 用户调用的是service层，dao层不需要接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());

        userService.getUser();

    }
}
