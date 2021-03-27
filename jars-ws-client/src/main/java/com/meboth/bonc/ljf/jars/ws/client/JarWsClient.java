package com.meboth.bonc.ljf.jars.ws.client;

import com.meboth.bonc.ljf.jars.ws.client.model.Bike;
import com.meboth.bonc.ljf.jars.ws.client.model.People;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JarWsClient {
    /**
     *  .create()     指定服务端地址

     .type()      指定请求数据格式（xml、json）

     .accept()    指定响应数据格式

     .post()/put()/delete()/get()  指定请求类型
     */
    public static void main(String args[])throws Exception{
        //save();
        //update();
        //findOne();
        findAll();
    }

    /**
     * 添加
     * @throws Exception
     */
    public static  void save() throws Exception {
        // 基于restful风格的webservice开发的客户端调用，直接通过一个类：WebClient类完成
        Bike bike=   new Bike(101,"haval h6",1000000f);
        List<Bike> bList=   new ArrayList<Bike>();
        bList.add(bike);
        bList.add(new Bike(101,"linken",3000000f));
        WebClient.create("http://localhost:8001/rs/tjService/tjUser")  // 地址
                .type(MediaType.APPLICATION_JSON)                     // 请求数据格式是json
                .post(new People(100,"Kobe",bList));                  // 发送请求的类型
    }

    /**
     * 修改
     * @throws Exception
     */
    public static  void update() throws Exception {
        WebClient.create("http://localhost:8001/rs/tjService/tjUser")  // 地址
                .type(MediaType.APPLICATION_JSON)                     // 请求数据格式是json
                .put(new People(100,"Kobe",null));                   // 发送请求的类型
    }

    /**
     * 通过id查找
     * @throws Exception
     */
    public static void findOne() throws Exception {
        People user =
                WebClient
                        .create("http://localhost:8001/rs/tjService/tjUser/1")  // 地址
                        .accept(MediaType.APPLICATION_JSON)  // 响应的数据格式
                        .get(People.class);
        System.out.println(user);
    }

    /**
     * 查询全部
     * @throws Exception
     */
    public static void findAll() throws Exception {
        Collection<? extends People> collection =
                WebClient
                        .create("http://localhost:8001/rs/tjService/tjUser/")
                        .accept(MediaType.APPLICATION_JSON)
                        .getCollection(People.class);
        System.out.println(collection);
    }

}
