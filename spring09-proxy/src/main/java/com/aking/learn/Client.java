package com.aking.learn;

import com.aking.learn.service.ProxyService;
import com.aking.learn.service.UserService;
import com.aking.learn.service.UserServiceImpl;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserService userService = new UserServiceImpl();
        // 生成代理对象
        ProxyService proxyService = new ProxyService();
        proxyService.setObject(userService);
        UserService proxy = (UserService) proxyService.getProxy();
        // 执行代理方法
        proxy.sayHello("aking");
    }
}
