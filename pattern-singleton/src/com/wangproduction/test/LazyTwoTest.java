package com.wangproduction.test;

import com.wangproduction.lazy.LazyHusbandOne;
import com.wangproduction.lazy.LazyHusbandTwo;

/**
 * Created by Administrator on 2018/5/19 0019.
 */
public class LazyTwoTest {
    //检测加锁后对性能的影响
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <200000000 ; i++) {
            Object obj = LazyHusbandTwo.getInstace();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end- start));
    }
}
