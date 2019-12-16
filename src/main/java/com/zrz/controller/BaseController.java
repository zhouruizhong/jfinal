package com.zrz.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.NotAction;

public class BaseController extends Controller {

    private String loginUser;

    /**
     * 不希望成为 action，仅供子类调用，或拦截器中调用
     */
    @NotAction
    public void getLoginUser(){

    }
}
