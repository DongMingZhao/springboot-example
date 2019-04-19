package com.zdm.springbootdemo.message.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @class: XY_ThreadData
 * @description: 测试Threadlocals
 * @author: zhaoDongMing
 * @create: 2019-04-19 11:02
 */
public class XY_ThreadData {
    private static Integer data = 0;

    private static Map<Thread, Integer> map = new HashMap<Thread, Integer>();

    private static ThreadLocal<Integer> local = new ThreadLocal<Integer>();

    public static void setData(Integer value) {

        data = value;

    }

    public static Integer getData() {

        System.out.println("ThreadName：" + Thread.currentThread() + " data value：" + data);

        return data;

    }

    public static void setMapData(Integer value) {

        map.put(Thread.currentThread(), value);

    }

    public static Integer getMapData() {

        Object obj = map.get(Thread.currentThread());

        System.out.println("ThreadName：" + Thread.currentThread() + "map value：" + obj);

        return Integer.parseInt(obj.toString());

    }

    public static void setThreadLocalData(Integer value) {

        local.set(value);

    }

    public static Integer getThreadLocalData() {

        Object obj = local.get();

        System.out.println("ThreadName：" + Thread.currentThread() + "threadlocal value：" + obj);

        return Integer.parseInt(obj.toString());

    }
}
