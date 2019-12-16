package com.zrz.routes;

import com.jfinal.config.Routes;
import com.zrz.controller.BlogController;
import com.zrz.controller.IndexController;
import com.zrz.controller.WeixinController;

public class FrontRoutes extends Routes {

    @Override
    public void config() {
        // 这里配置只对 FrontRoutes 下的路由有效，建议这样配置以提升性能
        setMappingSuperClass(true);

        setBaseViewPath("/view/front");
        add("/", IndexController.class);
        add("/blog", BlogController.class);
        add("/weixin", WeixinController.class);
    }
}
