package com.zdm.springbootdemo.message.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {

    @Autowired
    private Producer producer;

    @Test
    public void sendMessage() {


        Destination destination = new ActiveMQQueue("mytest.queue");

        for(int i=0; i<1; i++) {
           //producer.sendMessage(destination, "myname is chhliu!!!");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            producer.delaySend(destination,"哈哈哈" + sdf.format(new Date()),30000L);
        }

    }
}