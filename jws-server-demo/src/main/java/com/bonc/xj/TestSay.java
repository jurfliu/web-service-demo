package com.bonc.xj;

import com.bonc.xj.webservice.impl.SayBeijing;

import javax.xml.ws.Endpoint;

/**
 * @ClassName: TestSay
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/03/22 11:29:10 
 * @Version: V1.0
 **/
public class TestSay
{
    /**
     * main方法中发布
     * */
    public static void main(String[] args) {
        String address="http://localhost:9001/service/sayweb";
        Endpoint.publish(address, new SayBeijing());
        System.out.println("发布成功");
    }
}
