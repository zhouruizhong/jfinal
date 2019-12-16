package com.zrz.service;

import com.jfinal.plugin.activerecord.Page;
import com.zrz.entity.User;

import java.util.List;

public class UserService {

    private static final User dao = new User().dao();

    public User login(String username, String password) {

        // 查询id值为25的user, 且仅仅取name与age两个字段的值
        User user = dao.findByIdLoadColumns(25, "name, age");

        // 获取user的name属性
        String userName = user.getStr("name");

        // 获取user的age属性
        Integer userAge = user.getInt("age");

        // 查询所有年龄大于18岁的user
        List<User> users = User.dao.find("select * from user where age>18");

        // 分页查询年龄大于18的user,当前页号为1,每页10个user
        Page<User> userPage = User.dao.paginate(1, 10, "select *", "from user where age > ?", 18);

        return null;
    }

    public void save(String username, String password) {
        // 创建name属性为James,age属性为25的User对象并添加到数据库
        dao.set("name", username).set("age", 25).save();
    }

    public void delete(Integer id) {
        // 删除id值为25的User
        dao.deleteById(id);
    }

    public void update(Integer id, String username) {
        // 查询id值为25的User将其name属性改为James并更新到数据库
        dao.findById(id).set("name", username).update();
    }
}
