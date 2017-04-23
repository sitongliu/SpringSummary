package com.liusitong.BaseInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class IOCInjectionTest {
    public static void main(String[] args) {
        AbstractApplicationContext cxt = new
                ClassPathXmlApplicationContext("beans.xml");

            Car car = (Car)cxt.getBean("car3");
            Boss boss = (Boss)cxt.getBean("boss3");

        System.out.println(car.getBrand()+";"+car.getMaxSpeed()+";"+car.getPrice());
        System.out.println(boss.getName()+";"+boss.getCar());

    }
}
