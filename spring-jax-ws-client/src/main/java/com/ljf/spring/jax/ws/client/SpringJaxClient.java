package com.ljf.spring.jax.ws.client;

import com.ljf.spring.jax.ws.client.service.BeiJingClientUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;


public class SpringJaxClient {
    // 注入远程访问服务端的接口的代理对象。

    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        BeiJingClientUserService userService = (BeiJingClientUserService) context.getBean("bcuserClient");
        // org.apache.cxf.jaxws.JaxWsClientProxy@2826f61
        System.out.println(userService);
        // class com.sun.proxy.$Proxy45
        System.out.println(userService.getClass());
        // 远程调用服务接口
        String content = userService.sayHelloToBeijingName("球球");
        System.out.println(content);




    }
}
