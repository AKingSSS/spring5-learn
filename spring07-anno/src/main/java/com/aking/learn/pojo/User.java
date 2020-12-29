package com.aking.learn.pojo;

import lombok.Data;
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
 * 等价于 <bean id="user" class="com.aking.learn.pojo.User" />
 * Component 组件放到类上，说明这个类被 spring 管理了，就是bean
 */
@Component
public class User {
    public String name = "aking";
}
