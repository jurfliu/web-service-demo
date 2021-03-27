package com.bonc.xj.webservice;

import javax.jws.WebService;

@WebService//此注解用在类上指定将此类发布成一个WebService
public interface SaySomething {
    public  String sayToBeijing(String name,int i);
    public void sayToBeijingBye(boolean f);
}
