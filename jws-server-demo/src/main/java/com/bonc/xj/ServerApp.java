package com.bonc.xj;

import com.bonc.xj.webservice.impl.Person;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class ServerApp
{
    public static void main( String[] args )
    {
        //1.定义发布的地址：端口号，发布的上下文路径，自己定义
        String url = "http://localhost:8002/ws-demo";
        //2.发布服务
        //第一个参数是指定你要发布的地址，第二个参数是你要发布的服务对象
        Endpoint.publish(url, new Person());
        System.out.println("服务器已启动");
        System.out.println( "Hello World!" );

    }
}
