package com.bonc.ws.client;

import com.bonc.ws.client.webservice.PersonService;
import com.bonc.ws.client.webservice.Speaker;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/03/18 11:48:48 
 * @Version: V1.0
 **/
public class Test {
    public static void main(String args[]){
        //1.创建service
        PersonService service = new PersonService();
        //2.获取代理对象
        Speaker speaker = service.getPersonPort();
        //3.调用服务端方法
        String str = speaker.sayHello("JURF");
        System.out.println(str);

    }
}
