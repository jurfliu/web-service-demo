package com.ljf.spring.jax.ws.server.serviceImpl;

import com.ljf.spring.jax.ws.server.service.BeiJingUserService;

public class BeiJingUserServiceImpl implements BeiJingUserService {
    @Override
    public String sayHelloToBeijingName(String name) {
        return name+":nihao ,today is 端午节!!!!";
    }
}
