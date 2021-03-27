package com.ljf.spring.jax.ws.server.service;

import javax.jws.WebService;

@WebService
public interface BeiJingUserService {
    //问好
    public String sayHelloToBeijingName(String name);
}
