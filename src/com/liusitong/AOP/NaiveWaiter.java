package com.liusitong.AOP;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class NaiveWaiter  implements Waiter{
    @Override
    public void greetTo(String name) {System.out.println("greetTo " +name);
    }
    @Override
    public void serveTo(String name) {
        System.out.println("serveTo " +name);
    }
}
