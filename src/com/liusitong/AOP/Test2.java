package com.liusitong.AOP;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiuSitong on 2017/4/23.
 * 基于配置式AOP
 */
public class Test2 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("Jerry");
        waiter.serveTo("Tom");
    }
}
