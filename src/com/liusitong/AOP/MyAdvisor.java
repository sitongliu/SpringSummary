package com.liusitong.AOP;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class MyAdvisor extends StaticMethodMatcherPointcutAdvisor {
    // 拦截匹配的方法名
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        boolean ret = false;
        ret = method.getName().equals("greetTo")||method.getName().equals("serveTo");
        return ret;
    }
    //拦截的类名
    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                boolean ret = false;
                ret = aClass.getSimpleName().equals("NaiveWaiter");
                return ret;
            }
        };
    }
}
