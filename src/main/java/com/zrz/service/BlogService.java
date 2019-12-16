package com.zrz.service;

import com.jfinal.plugin.activerecord.Page;
import com.zrz.entity.Blog;

public class BlogService {
    private static final Blog dao = new Blog().dao();

    public Page<Blog> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
    }

    public Blog findById(int id) {
        return dao.findById(id);
    }

    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
