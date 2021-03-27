package com.bonc.xj.webservice.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @ClassName: SayBeijing
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/03/22 11:27:44 
 * @Version: V1.0
 **/
//@WebService(endpointInterface="com.bonc.xj.webservice.SaySomething")
@WebService
public class SayBeijing {
    @WebMethod(operationName="sayHello")
    @WebResult(name="helloName")
    public  String sayToBeijing(@WebParam(name="oldName")String name, @WebParam(name="age")int i){
        i++;
        return "hello"+name;
    }
    @WebMethod(operationName="bye")
    public void sayToBeijingBye(@WebParam(name="flag")boolean f){
        System.out.println("bye");
    }


}
