package com.liusitong.AOP;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by LiuSitong on 2017/4/23.
 */
//将他定义为一个切面
@Aspect
public class MyAspect {

    @Before("execution(* greetTo(..))")
    public void doBefore(){
        System.out.println("do before.....");
    }

    @AfterReturning("execution(* greetTo(..))")
    public void myAfter(){
        System.out.println("do after...");
    }

}
