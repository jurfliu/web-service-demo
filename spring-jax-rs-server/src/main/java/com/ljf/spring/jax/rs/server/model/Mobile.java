package com.ljf.spring.jax.rs.server.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "myCellPhone")
public class Mobile {
    private int id;
    private String name;

    public Mobile() {
    }

    public Mobile(int id, String name) {
        this.id = id;
        this.name = name;
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
}
