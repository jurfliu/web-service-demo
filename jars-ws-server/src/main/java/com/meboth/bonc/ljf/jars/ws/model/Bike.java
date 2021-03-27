package com.meboth.bonc.ljf.jars.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "myBike")
public class Bike {
    private int id;
    private String carName;
    private float price;

    public Bike() {
    }

    public Bike(int id, String carName, float price) {
        this.id = id;
        this.carName = carName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
