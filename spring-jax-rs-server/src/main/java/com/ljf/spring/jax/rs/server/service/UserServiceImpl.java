package com.ljf.spring.jax.rs.server.service;

import com.ljf.spring.jax.rs.server.model.Mobile;
import com.ljf.spring.jax.rs.server.model.BeiJingUser;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    public void saveUser(BeiJingUser user) {
        System.out.println("save user:" + user.getName());
    }

    public void updateUser(BeiJingUser user) {
        System.out.println("update user:" + user);
    }

    public List<BeiJingUser> findAllUsers() {
        List<BeiJingUser> users = new ArrayList<BeiJingUser>();

        // 汽车
        List<Mobile> carList1 = new ArrayList<Mobile>();
        Mobile car1 = new Mobile(101,"apple");
        Mobile car2 = new Mobile(102,"huawei");
        carList1.add(car1);
        carList1.add(car2);

        // 用户
        BeiJingUser user1 = new BeiJingUser(1,"小明","海淀",carList1);
        BeiJingUser user2 = new BeiJingUser(2,"小丽","朝阳",carList1);

        // 用户集合
        users.add(user1);
        users.add(user2);

        return users;
    }

    public BeiJingUser finUserById(Integer id) {
        if (id == 1) {
            Mobile bike=   new Mobile(101,"xiaomi");
            List<Mobile> bList=   new ArrayList<Mobile>();
            bList.add(bike);
            return new BeiJingUser(1,"小明","大兴",bList);
        }
        return null;
    }

    public void deleteUser(Integer id) {
        System.out.println("delete user id :" + id);
    }
}
