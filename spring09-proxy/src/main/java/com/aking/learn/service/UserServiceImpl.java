package com.aking.learn.service;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
public class UserServiceImpl implements UserService{
    /**
     * 打招呼
     *
     * @param name
     */
    @Override
    public void sayHello(String name) {
        System.out.println(name + ": say hello world");
    }
}
