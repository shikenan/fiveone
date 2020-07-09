package com.bjsxt.orderprovider.pojo;

import java.io.Serializable;

public class Order implements Serializable {

    private String er;

    public Order() {
    }

    public Order(String er) {
        this.er = er;
    }

    public String getEr() {
        return er;
    }

    public void setEr(String er) {
        this.er = er;
    }
}
