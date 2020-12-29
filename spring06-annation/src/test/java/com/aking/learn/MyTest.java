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
        ApplicationContext context = new ClassPathXmlApplicationContext("autobeans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();
    }
}
