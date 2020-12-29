package com.aking.learn;

import com.aking.learn.config.TotalConfig;
import com.aking.learn.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TotalConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.name);
    }
}
