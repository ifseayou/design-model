package com.isea.design.proxy;


public class SelfDo implements UserAdd {
    public void add(String user) {
//        System.out.println("方法执行开始...");
//        long start = System.currentTimeMillis();

        System.out.println("Add the user to the dataBase... ");

//        long end = System.currentTimeMillis();
//        System.out.println("消耗的时间是：" + (end - start));
//        System.out.println("方式执行结束...");
    }
}
