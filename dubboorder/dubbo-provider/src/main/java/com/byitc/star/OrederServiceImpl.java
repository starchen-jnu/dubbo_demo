package com.byitc.star;

import org.springframework.stereotype.Service;

/**
 * @Author: StarC
 * @Date: 2019/4/19 15:54
 */


public class OrederServiceImpl implements  OrderServiceI{
    @Override
    public DoOrderResponse doOrder(DoOrderRequest request) {

        System.out.println("曾经来过" + request);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("200");
        response.setMemo("success");
        return response;
    }
}
