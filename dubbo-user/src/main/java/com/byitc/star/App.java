package com.byitc.star;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {

        //jar包配置
       /* OrderServiceI orderServiceI =null;
        DoOrderRequest request = new DoOrderRequest();
        request.setName("star");
        DoOrderResponse response = orderServiceI.doOrder(request);
        System.out.println( response );*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-user.xml");
        OrderServiceI services = (OrderServiceI) context.getBean("orderService");

        UserNameI userNameI = (UserNameI) context.getBean("userService");
        DoOrderRequest request = new DoOrderRequest();
        request.setName("star");
        services.doOrder(request);

        //异步通信 async="true"hessian不能进行异步通信
        Future<DoOrderResponse>responseFuture = RpcContext.getContext().getFuture();
        DoOrderResponse response = responseFuture.get();
        System.out.println(response);

        System.out.println(userNameI.getUserName("star"));


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
