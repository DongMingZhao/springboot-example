package com.zdm.springbootdemo.message.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @class: Comsumer
 * @description:
 * @author: zhaoDongMing
 * @create: 2019-04-11 16:30
 */
@Service
public class Comsumer {

    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "mytest.queue")
    public void receiveQueue(String text) {
        System.out.println("Consumer收到的报文为:"+text);
    }
}
