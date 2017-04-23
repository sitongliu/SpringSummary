package com.liusitong.AOP;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class Test3 {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new
                ClassPathXmlApplicationContext("beans.xml");
        Waiter waiter = (Waiter)ctx.getBean("waiter1");
        waiter.greetTo("Tom");
    }
}
