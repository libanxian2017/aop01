package com.centit.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    public static Object getInstance(final MyCalculatorImpl myCalculator){
        return Proxy.newProxyInstance(CalculatorProxy.class.getClassLoader(), myCalculator.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+"：这个方法开始执行了");
                Object invoke = method.invoke(myCalculator,args);
                System.out.println(method.getName()+"：这个方法已经结束了");
                return invoke;
            }
        });
    }
}
