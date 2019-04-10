package com.isea.design.proxy;

public class ProxyDo implements UserAdd {
    private SelfDo core;

    public ProxyDo(SelfDo core) {
        this.core = core;
    }


    public void add(String user) {

        System.out.println("方法执行开始...");
        long start = System.currentTimeMillis();

       core.add(user);

        long end = System.currentTimeMillis();
        System.out.println("消耗的时间是：" + (end - start));
        System.out.println("方法执行结束...");
    }

    public static void main(String[] args) {
        UserAdd userAdd = new ProxyDo(new SelfDo());
        userAdd.add("isea_you");

        /*执行结果：

        方法执行开始...
        Add the user to the dataBase...
        消耗的时间是：0
        方法执行结束...*/
    }
}
