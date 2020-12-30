package com.aking.learn.log;

import org.springframework.aop.MethodBeforeAdvice;
import sun.reflect.MethodAccessor;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     * @param method: 要执行的目标方法
     * @param args:   参数
     * @param target  目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行");
    }
}
