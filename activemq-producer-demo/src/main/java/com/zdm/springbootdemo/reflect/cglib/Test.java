package com.zdm.springbootdemo.reflect.cglib;

import org.springframework.cglib.proxy.Enhancer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @class: Test
 * @description:
 * @author: zhaoDongMing
 * @create: 2019-05-23 17:33
 */
public class Test {

    public static void main1(String[] args) {
        Programmer progammer = new Programmer();

        Hacker hacker = new Hacker();
        //cglib 中加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类
        enhancer.setSuperclass(progammer.getClass());
        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(hacker);
        Programmer proxy =(Programmer)enhancer.create();
        proxy.code();

    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String put = map.put("zdm", "zdm");
        String put2 = map.put("zdm", "zdm");
        System.out.println(put2);

        List<String> strs = new ArrayList<>();
        strs.add("a");
        strs.add("b");
        strs.add("c");
        String[] hh = strs.toArray(new String[0]);
        for(String a : hh) {
            System.out.println(a);
        }
    }
}
