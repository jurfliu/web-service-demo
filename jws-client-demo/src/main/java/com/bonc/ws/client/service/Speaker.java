package com.bonc.ws.client.service;


import javax.jws.WebService;

/**
 * 定义服务的接口
 * @author Beauxie
 *
 */
/*
这个接口中targetnamespace的配置原则为：
参考服务端发布的wsdl文档中，<wsdl:import 中的namespace的值，这里配置为http://webservice.xj.bonc.com/  ，其实就是映射成服务端
这个接口speaker所在的包.类的绝对路径。
<wsdl:import location="http://localhost:8002/ws-demo?wsdl=Speaker.wsdl" namespace="http://webservice.xj.bonc.com/"> </wsdl:import>
 */

@WebService(targetNamespace = "http://webservice.xj.bonc.com/")
public interface Speaker {

 String sayHello(String name);

}