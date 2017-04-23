package com.liusitong.AOP;

import org.springframework.aop.Advisor;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class Test1 {
    public static void main(String[] args) {


        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new NaiveWaiter());

//        //编程式 不使用切面仅适用增强
//        pf.addAdvice(new MyBeforeAdvice());
//        pf.addAdvice(new MyAfterReturningAdvice());
//        NaiveWaiter waiter =(NaiveWaiter) pf.getProxy();
//        waiter.greetTo("Tom");
//        waiter.serveTo("Lily");






//        //静态方法名匹配
//       // 初始化切面类
//        MyAdvisor advisor = new MyAdvisor();
//        MyAdvisor advisor1 = new MyAdvisor();
//        //给切面添加增强
//        advisor.setAdvice(new MyBeforeAdvice());
//        advisor1.setAdvice(new MyAfterReturningAdvice());
//        //给代理工厂添加切面
//        pf.addAdvisor(advisor);
//        pf.addAdvisor(advisor1);
//
//        Waiter naiveWaiter = (Waiter) pf.getProxy();
//        naiveWaiter.greetTo("Tom");



      //动态
        DefaultPointcutAdvisor advisor1 = new DefaultPointcutAdvisor();
        DefaultPointcutAdvisor advisor2 = new DefaultPointcutAdvisor();
        advisor1.setAdvice(new MyBeforeAdvice());
        advisor2.setAdvice(new MyAfterReturningAdvice());
        advisor1.setPointcut(new MyPointCut());
        pf.addAdvisor(advisor1);
        pf.addAdvisor(advisor2);

        Waiter waiter = (Waiter) pf.getProxy();
        waiter.greetTo("Tom");
        waiter.serveTo("Jerry");
    }
}
