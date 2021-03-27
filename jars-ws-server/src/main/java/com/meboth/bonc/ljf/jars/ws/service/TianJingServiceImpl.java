package com.meboth.bonc.ljf.jars.ws.service;

import com.meboth.bonc.ljf.jars.ws.model.Bike;
import com.meboth.bonc.ljf.jars.ws.model.People;

import java.util.ArrayList;
import java.util.List;

public class TianJingServiceImpl implements TianJingService {
    public void saveUser(People user) {
        System.out.println("save user:" + user.getUserName());
    }

    public void updateUser(People user) {
        System.out.println("update user:" + user);
    }

    public List<People> findAllUsers() {
        List<People> users = new ArrayList<People>();

        // 汽车
        List<Bike> carList1 = new ArrayList<Bike>();
        Bike car1 = new Bike(101,"保时捷",1000000f);
        Bike car2 = new Bike(102,"林肯",400000f);
        carList1.add(car1);
        carList1.add(car2);

        // 用户
        People user1 = new People(1,"小明",carList1);
        People user2 = new People(2,"小丽",carList1);

        // 用户集合
        users.add(user1);
        users.add(user2);

        return users;
    }

    public People finUserById(Integer id) {
        if (id == 1) {
         Bike bike=   new Bike(101,"保时捷",1000000f);
         List<Bike> bList=   new ArrayList<Bike>();
         bList.add(bike);
            return new People(1,"小明",bList);
        }
        return null;
    }

    public void deleteUser(Integer id) {
        System.out.println("delete user id :" + id);
    }
}
