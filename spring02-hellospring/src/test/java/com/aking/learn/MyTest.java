package com.aking.learn;

import com.aking.learn.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 使用 import 导入其他beans
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hello hello =  context.getBean("hello", Hello.class);
        System.out.println("普通调用：" + hello.toString());
        // 使用name别名
        Hello hello2 =  context.getBean("hello2", Hello.class);
        System.out.println("使用name别名调用：" + hello2.toString());
        // 使用name别名
        Hello hello3 =  context.getBean("hello3", Hello.class);
        System.out.println("使用name别名调用：" + hello3.toString());
        // 使用alias别名
        Hello helloDto =  context.getBean("helloDto", Hello.class);
        System.out.println("使用alias别名调用：" + helloDto.toString());
    }
}
