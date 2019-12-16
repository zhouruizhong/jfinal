package com.zrz.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

public class FrontInterceptor implements Interceptor {

    @Override
    public void intercept(Invocation invocation) {
        System.out.println("Before method invoking");
        invocation.invoke();
        System.out.println("After method invoking");

        Controller controller = invocation.getController();
    }
}
