package com.liusitong.AOP;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcher;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuSitong on 2017/4/23.
 */
public class MyPointCut extends DynamicMethodMatcherPointcut {
    private static List<String> matchedArgs = new ArrayList<String>();
    static {
        //定义想要匹配的参数
        matchedArgs.add("Tom");
        matchedArgs.add("Jerry");
    }
    //先匹配类名
    public boolean matches(Method method, Class<?> aClass) {
        return method.getName().equals("greetTo")||method.getName().equals("serveTo");
    }
    //类名相同之后再匹配参数
    @Override
    public boolean matches(Method method, Class<?> aClass, Object[] objects) {
        String arg = (String)objects[0];
        return  matchedArgs.contains(arg);
    }
    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                //获取类名看看是不是匹配的，要拦截的类名
                return aClass.getSimpleName().equals("NaiveWaiter");
            }
        };
    }
}
