package com.isea.design.factory.abstract_factory;

public class Customer {
    public static void main(String[] args) {
        BMW car1 = BMWFactory.getBMW();
        car1.run();//BMW is running....

        Audi car2 = AudiFactory.getAudi();
        car2.run();//Audi is running...
    }
}
