package com.zrz.controller;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.aop.Inject;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.zrz.entity.User;
import com.zrz.interceptor.AuthInterceptor;
import com.zrz.service.UserService;

@Before(AuthInterceptor.class)
public class UserController extends Controller {

    @Inject
    private UserService userService;

    /**
     * AuthInterceptor 已被Clear清除掉，不会被其拦截
     */
    @Clear
    @ActionKey("/login")
    public void login(){
        String username = get("username");
        String password = get("password");
        User user = userService.login(username, password);
        render("login.html");
    }

    /**
     * 此方法将被AuthInterceptor拦截
     */
    public void show(){

    }
}
