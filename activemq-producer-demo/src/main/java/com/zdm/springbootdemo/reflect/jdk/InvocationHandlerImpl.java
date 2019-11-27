package com.zdm.springbootdemo.reflect.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @class: InvocationHandlerImpl
 * @description:
 * @author: zhaoDongMing
 * @create: 2019-05-31 09:26
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private ElectricCar car;

    public InvocationHandlerImpl(ElectricCar car) {
        this.car=car;
    }

    @Override
    public Object invoke(Object paramObject, Method paramMethod,
                         Object[] paramArrayOfObject) throws Throwable {
        System.out.println("You are going to invoke " + paramMethod.getName() +" ...");
        paramMethod.invoke(car, paramMethod.getParameterTypes());
        System.out.println(paramMethod.getName() + " invocation Has Been finished...");
        return null;
    }

}
