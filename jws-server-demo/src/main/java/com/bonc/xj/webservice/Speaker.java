package com.bonc.xj.webservice;


import javax.jws.WebService;

/**
 * 定义服务的接口
 * @author Beauxie
 *
 */
@WebService//此注解用在类上指定将此类发布成一个WebService
public interface Speaker {

 String sayHello(String name);

}