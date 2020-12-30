package com.aking.learn.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */

/**
 * 注解实现 aop
 * 标注这个类是一个切面
 */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.aking.learn.service.impl.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前=================");
    }
    @After("execution(* com.aking.learn.service.impl.UserServiceImpl.*(..)))")
    public void after() {
        System.out.println("方法执行后=================");
    }

    /**
     * 在环绕增强中，我们可以指定一个参数，代表我们要获取处理的切入点
     */
    @Around("execution(* com.aking.learn.service.impl.UserServiceImpl.*(..)))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前=================");
        // 执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后=================");
    }

}
