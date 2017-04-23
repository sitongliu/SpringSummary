package com.liusitong.AOP;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o)
            throws Throwable {
        System.out.println("before advice......");
    }
}
