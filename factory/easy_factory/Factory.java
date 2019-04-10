package com.isea.design.factory.easy_factory;

public class Factory {
    public static Car getCar(String brand){
        if (brand.equals("宝马")){
            return new BMW();
        }else if(brand.equals("奥迪")){
            return new Audi();
        }
        return null;
    }
}
