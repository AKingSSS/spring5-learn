package com.aking.learn.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
@Data
public class People {
    /**
     * @Autowired 默认是按照类型来注入的，默认情况下要求依赖对象必须存在。
     * 如果允许依赖对象为 null，需设置 required 属性为 false，
     * 成员属性字段使用 @Autowired，无需字段的 set 方法
     * 配合 @Qualifier 指定按照名称去装配 bean。
     *
     *  如果发现多个，那么将会抛出异常。如果没有找到，即属性值为 null。
     */

    /**
     * Resource
     * 如果既没有指定 name，又没有指定 type，则自动按照 byName 方式进行装配；
     * 如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配；
     */
    @Resource
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog1")
    private Dog dog;
    private String name;
}
