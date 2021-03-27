package com.meboth.bonc.ljf.jaxws.service;

public class UserServiceImpl implements UserService {
    @Override
    public String sayHelloName(String name) {
        return name+":nihao ,today is duanwujie!!!!";
    }
}
