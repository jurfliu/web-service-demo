package com.meboth.bonc.ljf.jars.ws;

import com.meboth.bonc.ljf.jars.ws.service.TianJingServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Hello world!
 *
 */
public class JaxRsServer
{
    /**
     * 发布restful风格的webservice的服务
     */
    public static void main( String[] args ) {
            //1.创建服务工厂
            JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

            //2.设置服务地址、
            factory.setAddress("http://localhost:8001/rs");

            //3.实例化服务类、
            factory.setServiceBean(new TianJingServiceImpl());

            // 添加日志拦截器
            factory.getInInterceptors().add(new LoggingInInterceptor());
            factory.getOutInterceptors().add(new LoggingOutInterceptor());

            //4.创建服务
            factory.create();

            System.out.println("发布服务成功.......端口：8001");
        }
}
