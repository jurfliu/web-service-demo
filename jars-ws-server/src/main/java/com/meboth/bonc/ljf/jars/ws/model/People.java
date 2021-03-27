package com.meboth.bonc.ljf.jars.ws.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name = "myPeople")
public class People {
    private int id;
    private String userName;
    private List<Bike> bikeList=new ArrayList<Bike>();

    public People() {
    }

    public People(int id, String userName, List<Bike> bikeList) {
        this.id = id;
        this.userName = userName;
        this.bikeList = bikeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Bike> getBikeList() {
        return bikeList;
    }

    public void setBikeList(List<Bike> bikeList) {
        this.bikeList = bikeList;
    }
}
