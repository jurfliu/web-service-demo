package com.meboth.bonc.ljf.jaxws;

import com.meboth.bonc.ljf.jaxws.service.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Hello world!
 *
 */
public class JaxServerApp
{
    public static void main( String[] args )
    {
        // 服务工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        // 设置服务地址：/user 为自己随便起的名字
        factory.setAddress("http://localhost:8091/user");
        // 设置服务类
        factory.setServiceBean(new UserServiceImpl());
        //添加日志输入输出拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        // 发布服务
        factory.create();
        // 提示
        System.out.println("webservice服务端启动成功.......");
    }
}
