package com.liusitong.CollectionInjiection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class TestCollectionInjection {
    public static void main(String[] args) {
        AbstractApplicationContext cxt = new
                ClassPathXmlApplicationContext("beans.xml");

        Person p0 = (Person) cxt.getBean("person0");
        Person p = (Person) cxt.getBean("person1");
        System.out.println("年龄："+p0.getAge()+"     姓名："+ p0.getName() +"  朋友："+
        p.getFriend()+"    爱好："+p.getFavorites());

    }
}
