package com.zrz.validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;
import com.zrz.entity.Blog;

public class BlogValidator extends Validator {

    @Override
    protected void validate(Controller controller) {
        validateRequiredString("blog.title", "titleMsg", "请输入Blog标题!");
        validateRequiredString("blog.content", "contentMsg", "请输入Blog内容!");
    }

    @Override
    protected void handleError(Controller controller) {
        controller.keepModel(Blog.class);
    }
}
