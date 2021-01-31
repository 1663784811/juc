package com.cyyaw.proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ChinesePoxy implements MethodInterceptor {

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object intercept = methodProxy.invokeSuper(object, args);
        System.out.println("-------- end ---------");
        return intercept;
    }

}
