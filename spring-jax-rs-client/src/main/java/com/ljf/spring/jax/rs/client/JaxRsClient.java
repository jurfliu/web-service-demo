package com.ljf.spring.jax.rs.client;

import com.ljf.spring.jax.rs.client.model.BeiJingUser;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import java.util.Collection;

public class JaxRsClient {
    public static void main(String args[])throws Exception{
        findAll();
       // save();
    }
    public  static void  save() {
        // 测试1： 保存
        WebClient
                .create("http://localhost:8080/ws/mlgbUser/bjService/bjUser")
                .post(new BeiJingUser(100,"tongzhou","tongzhou"));

    }
    public static  void delete(){
        // 测试2：删除（传入id）
        WebClient
                .create("http://localhost:8080/ws/mlgbUser/bjService/bjUser/100")
                .delete();
    }
    /**
     * 查询全部
     * @throws Exception
     */
    public static void findAll() throws Exception {
        Collection<? extends BeiJingUser> collection =
                WebClient
                        .create("http://localhost:8080/ws/mlgbUser/bjService/bjUser")
                        .accept(MediaType.APPLICATION_JSON)
                        .getCollection(BeiJingUser.class);
        System.out.println(collection);
    }
}


