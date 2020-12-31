package com.aking.learn.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
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
@Scope("prototype")
public class User {
    /**
     * 相当于<property name="name" value="aking"/>
     */
    @Value("aking")
    public String name;
}
