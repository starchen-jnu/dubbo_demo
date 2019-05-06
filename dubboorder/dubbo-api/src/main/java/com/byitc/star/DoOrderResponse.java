package com.byitc.star;

import java.io.Serializable;

/**
 * @Author: StarC
 * @Date: 2019/4/19 15:44
 */
public class DoOrderResponse implements Serializable {

    private static final long serialVersionUID = 3210621196447812995L;
    private Object data;
    private String code;
    private String memo;



    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
