package com.meboth.bonc.ljf.jaxws.service;

import javax.jws.WebService;

@WebService
public interface UserService {
    //问好
    public String sayHelloName(String name);
}
