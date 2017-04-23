package com.liusitong.AOP;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class Test4 {
    public static void main(String[] args) {
        /**
         * 基于注解
         */
        AspectJProxyFactory pf = new AspectJProxyFactory();
        pf.setTarget(new NaiveWaiter());
        pf.addAspect(MyAspect.class);
//        pf.addAspect(new MyAspect());//两种写法都可以
        NaiveWaiter waiter = (NaiveWaiter) pf.getProxy();
        waiter.greetTo("Tom");
    }

}
