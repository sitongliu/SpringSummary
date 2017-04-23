package com.liusitong.AnnotationInjection;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class TestInjection {
    public static void main(String[] args) {
        AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");

        Boss boss =(Boss) cxt.getBean("annotationboss");
        System.out.println(boss.getName() +"   "+ boss.getCar());

    }
}
