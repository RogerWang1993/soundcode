package com.wangproduction.test;

import com.wangproduction.lazy.LazyHusbandOne;
import com.wangproduction.lazy.LazyHusbandThree;

import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2018/5/19 0019.
 */
public class LazyThreeTest {
    public static void main(String[] args) {
        try{
            Class<?> clazz = LazyHusbandThree.class;
            Constructor c = clazz.getDeclaredConstructor(null);
           //强制访问，强吻，不愿意也要吻
            c.setAccessible(true);
            //暴力初始化
            //暴力初始化
            Object o1=c.newInstance();

            //调用了两次构造方法，相当于两次new
            //犯了原则性问题
            Object o2=c.newInstance();
            System.out.println(o1==o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
