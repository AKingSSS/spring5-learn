package com.aking.learn.diy;

/**
 * <p>
 *
 * </p>
 *
 * @author yk
 * @date 2020-12-29
 */
public class DiyPointCut {
    public void  before() {
        System.out.println("方法执行前");
    }

    public void  after() {
        System.out.println("方法执行后");
    }
}
