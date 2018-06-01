package com.wangproduction.hungry;

/**
 * Created by Administrator on 2018/5/17 0017.
 */
//饿汉式单例：在类加载的时候就进行初始化，并创建单例对象
    //毁不了的娃娃亲
    //绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
public class Hungry {
    private static final Hungry husband = new Hungry();
    private Hungry(){}
    public static Hungry getInstace(){
        return husband;
    }
}
