package com.meboth.bonc.ljf.ws.client.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.jaxws.ljf.bonc.meboth.com/")
public interface UserClientService {
   // public String sayHey(String name);
    public String sayHelloName(String name);
}
