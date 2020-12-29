package com.aking.learn;

import com.aking.learn.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
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
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people2 = context.getBean("people2", People.class);
        System.out.println(people2);
        people2.getCat().shout();
        people2.getDog().shout();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people3 = context.getBean("people3", People.class);
        System.out.println(people3);
        people3.getCat().shout();
        people3.getDog().shout();
    }
}
