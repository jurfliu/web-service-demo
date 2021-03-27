package com.ljf.spring.jax.ws.client.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.server.ws.jax.spring.ljf.com/")
public interface BeiJingClientUserService {
    //注意要和服务端的方法名保持一致，不一致的话，报错
    public String sayHelloToBeijingName(String name);
}
