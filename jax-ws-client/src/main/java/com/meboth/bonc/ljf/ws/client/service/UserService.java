package com.meboth.bonc.ljf.ws.client.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.jaxws.ljf.bonc.meboth.com/")
public interface UserService {
    public String sayHelloName(String name);
}

