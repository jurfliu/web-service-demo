package com.bonc.xj.webservice.impl;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/03/18 10:26:08 
 * @Version: V1.0
 **/

import com.bonc.xj.webservice.Speaker;

import javax.jws.WebService;

/**
 * 定义服务的实现类
 * @author Beauxie
 */
@WebService(endpointInterface="com.bonc.xj.webservice.Speaker")
public class Person implements Speaker {

    public String sayHello(String name) {

        return "Hello,"+name+"我在美丽的新疆吉木萨尔！";
    }

}