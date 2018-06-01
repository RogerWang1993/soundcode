package com.wangproduction.lazy;

/**
 * Created by Administrator on 2018/5/18 0018.
 */
public class LazyHusbandTwo {
    private  LazyHusbandTwo(){}
    private static LazyHusbandTwo husband =null;
    public static synchronized LazyHusbandTwo getInstace(){
        if(husband == null){
            husband = new LazyHusbandTwo();

        }
        return husband;
    }
}