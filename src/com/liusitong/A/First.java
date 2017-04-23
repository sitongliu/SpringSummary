package com.liusitong.A;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class First {
    public static void main(String[] args) {
        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("beans.xml");
    }
}
