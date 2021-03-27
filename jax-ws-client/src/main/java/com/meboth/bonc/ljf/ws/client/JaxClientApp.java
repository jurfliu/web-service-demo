package com.meboth.bonc.ljf.ws.client;

import com.meboth.bonc.ljf.ws.client.service.UserClientService;
import com.meboth.bonc.ljf.ws.client.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Hello world!
 *
 */
public class JaxClientApp
{
    public static void main( String[] args )
    {
        JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost:8091/user?wsdl");
        factoryBean.setServiceClass(UserClientService.class);
        UserClientService ucs=factoryBean.create(UserClientService.class);
        String result=ucs.sayHelloName("china,中国:");
        System.out.println(""+result);
        System.out.println( "ws client 调用成功!!!" );
    }
}
