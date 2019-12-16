package com.zrz.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.zrz.entity.Blog;
import com.zrz.interceptor.BlogInterceptor;
import com.zrz.service.BlogService;
import com.zrz.validator.BlogValidator;

@Before(BlogInterceptor.class)
public class BlogController extends Controller {

    static BlogService service = new BlogService();

    public void index() {
        setAttr("blogPage", service.paginate(getParaToInt(0, 1), 10));
        render("blog.html");
    }

    public void add() {
    }

    @Before(BlogValidator.class)
    public void save() {
        getModel(Blog.class).save();
        redirect("/blog");
    }

    public void edit() {
        setAttr("blog", service.findById(getParaToInt()));
    }

    @Before(BlogValidator.class)
    public void update() {
        getModel(Blog.class).update();
        redirect("/blog");
    }

    public void delete() {
        service.deleteById(getParaToInt());
        redirect("/blog");
    }
}
