package com.zrz.routes;

import com.jfinal.config.Routes;
import com.zrz.controller.AdminController;
import com.zrz.controller.HelloController;
import com.zrz.controller.UserController;
import com.zrz.interceptor.AdminInterceptor;

public class AdminRoutes extends Routes {

    @Override
    public void config() {
        //setBaseViewPath("/view/admin");
        addInterceptor(new AdminInterceptor());
        add("/admin", AdminController.class);
        add("/admin/user", UserController.class);
        add("/hello", HelloController.class);
    }
}
