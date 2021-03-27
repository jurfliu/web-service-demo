package com.ljf.spring.jax.rs.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "myBeiJingUser")
public class BeiJingUser {
    private int id;
    private String name;
    private  String address;
    private List<Mobile> mobileList=new ArrayList<Mobile>();

    public BeiJingUser() {
    }

    public BeiJingUser(int id, String name, String address, List<Mobile> mobileList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobileList = mobileList;
    }

    public BeiJingUser(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Mobile> getMobileList() {
        return mobileList;
    }

    public void setMobileList(List<Mobile> mobileList) {
        this.mobileList = mobileList;
    }
}
