package com.aking.learn;

import com.aking.learn.pojo.Student;
import com.aking.learn.pojo.User;
import lombok.Data;
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
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("student = " + student);
    }


    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println("user = " + user);
        User user2 = context.getBean("user2  ", User.class);
        System.out.println("user2 = " + user);
    }
}
