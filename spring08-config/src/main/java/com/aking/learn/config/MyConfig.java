package com.aking.learn.config;

import com.aking.learn.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */

/**
 * @author Y10003453
 * @Configuration 注解在类上，会被 spring 托管，注解到容器中，本身是一个component，
 * configuration 代表一个配置类，   等价于 spring <beans/> xml
 */
@Configuration
public class MyConfig {
    /**
     *  注册一个bean，相当于我们之前写的 bean 标签
     *  这个方法的名字，等价于bean 标签的id属性
     *  这个方法的返回值，等价于bean标签的class属性
     */
    @Bean
    public User getUser() {
        // 返回要注入的bean的对象
        return new User();
    }
}
