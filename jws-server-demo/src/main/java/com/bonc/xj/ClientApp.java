package com.bonc.xj;



import com.bonc.xj.webservice.Speaker;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class ClientApp
{
    public static void main( String[] args ) throws MalformedURLException {
        //1.声明所发布的服务对应的wsdl地址
        URL url=new URL("http://localhost:8002/ws-demo?wsdl");
        //2.声明所要调用的Qname
        QName qname=new QName("http://impl.webservice.xj.bonc.com/", "PersonService");
        //3.创建客户端的服务代理对象
        Service service=Service.create(url,qname);
        Speaker speaker = service.getPort(Speaker.class);

        //4.调用服务的方法
        String str=speaker.sayHello("Beauxie");

        System.out.println(str);

    }
}
