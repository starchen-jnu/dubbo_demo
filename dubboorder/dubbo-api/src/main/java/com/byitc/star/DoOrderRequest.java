package com.byitc.star;

import java.io.Serializable;

/**
 * @Author: StarC
 * @Date: 2019/4/19 15:44
 */
public class DoOrderRequest implements Serializable {

    private static final long serialVersionUID = 5545253439590765735L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
