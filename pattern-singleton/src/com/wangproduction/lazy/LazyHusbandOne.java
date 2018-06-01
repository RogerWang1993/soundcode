package com.wangproduction.lazy;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/5/18 0018.
 */
//懒汉式单例
    //在外部需要使用的时候才进行实例化
public class LazyHusbandOne {
    private LazyHusbandOne(){};

    //静态块，公共内存区域
    private static LazyHusbandOne husband=null;
    public static LazyHusbandOne getInstance(){
        //调用方法前判断，如果没有实例化，则将其进行实例化，赋初值
        //将该实力缓存
        if(husband == null){
            //两个线程都会进入这个if中
            husband = new LazyHusbandOne();
        }
        //如果已经初始化，则返回保存好了结果
        return husband;
    }
}
