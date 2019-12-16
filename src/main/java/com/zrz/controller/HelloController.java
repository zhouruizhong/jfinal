package com.zrz.controller;

import com.jfinal.core.Controller;

/**
 * @author zrz
 *
 */
public class HelloController extends Controller {

    public void index() {
        renderText("此方法是一个action");
    }

    public String test() {
        return "index.html";
    }
}
