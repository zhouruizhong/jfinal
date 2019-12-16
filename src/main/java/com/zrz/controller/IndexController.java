package com.zrz.controller;

import com.jfinal.core.Controller;
import com.jfinal.json.FastJson;
import com.zrz.entity.User;

public class IndexController extends Controller {

    public void index(){
        render("index.html");
    }

    public void demo() {

        Integer age = getInt("age");
        // 模板指向 : "/_view/index/index.html"
        setAttr("title", "周渝民");
        render("index.html");
    }

    public void save(){
        String json = getRawData();
        User user = FastJson.getJson().parse(json, User.class);
        System.out.println(json);
    }

    public void qrcode(){
        String data = "123456";
        renderQrCode(data, 200, 200);
    }
}
