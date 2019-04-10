package com.isea.design.factory.easy_factory;

public class Customer {
    public static void main(String[] args) {
        Car car1 = Factory.getCar("宝马");
        car1.run();//i am a BMW!

        Car car2 = Factory.getCar("奥迪");
        car2.run();//This is an Audi!!
    }
}
