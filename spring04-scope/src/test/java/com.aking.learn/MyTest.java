package com.aking.learn;

import com.aking.learn.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
public class MyTest {
    /**
     * scope 默认是单例
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        // 默认是单例模式
        System.out.println(user == user2);
    }

    /**
     * protype 模式
     */
    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        // protype 模式：每次从容器中获取产生新的对象
        System.out.println(user == user2);
    }
}
