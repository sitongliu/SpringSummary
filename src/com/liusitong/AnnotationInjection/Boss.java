package com.liusitong.AnnotationInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LiuSitong on 2017/4/23.
 */
@Component("annotationboss")
//@Repository
//@Service
public class Boss {
    //字面值注入属性
    @Value("1414010315刘思彤")
    String name;

    //默认按照名字找到
    @Resource(name = "car4")
   /* //如果注入错误也不报错
    @Autowired(required = false)
    //按照名字找到
    @Qualifier("carcar")*/
    Car car;

    public Boss() {
    }

    public Boss(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
