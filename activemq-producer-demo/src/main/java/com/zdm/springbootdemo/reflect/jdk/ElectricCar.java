package com.zdm.springbootdemo.reflect.jdk;

/**
 * @class: ElectricCar
 * @description:
 * @author: zhaoDongMing
 * @create: 2019-05-31 09:24
 */
public class ElectricCar implements Rechargable, Vehicle {


    @Override
    public void recharge() {
        System.out.println("Electric Car is Recharging...");
    }
}
