package com.isea.design.singleton;

/**
 * 单例模式之：懒汉式
 */
public class Lazy {
    private static Lazy instance;
    private Lazy(){}
    public static Lazy getInstance(){
        if (instance == null){
            instance = new Lazy();
        }
        return instance;
    }
}
