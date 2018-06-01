package com.wangproduction.lazy;

/**
 * Created by Administrator on 2018/5/18 0018.
 */
//懒汉式单利
    //此种形式兼顾懒汉式内存浪费，也兼顾synchronized性能问题
    //内部类一定要在方法调用之前初始化
public class LazyHusbandThree {
    private boolean initialized = false;
    //默认使用LazyHusbandThree时，会先初始化内部类
    private LazyHusbandThree(){
        synchronized(LazyHusbandThree.class){
            if(initialized == false){
                initialized = !initialized;

            }else{
                throw  new RuntimeException("单例已经被侵犯");
            }
        }
    }
    //static为了使单例的空间共享
    //保证这方法不会被重写，重载
    public static final LazyHusbandThree getInstance() {
    return  LazyHolder.LAZY;}

    //默认不加载，使用外部类的时候加载内部类
    private static class LazyHolder{
        private static final LazyHusbandThree LAZY = new LazyHusbandThree();
    }
}
