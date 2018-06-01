package com.wangproduction.test;

import com.wangproduction.lazy.LazyHusbandOne;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2018/5/19 0019.
 */
public class LazyOneTest {
    public static void main(String[] args) {
        int count = 200;
        final CountDownLatch latch =new CountDownLatch(count);

        long start=System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        try{
                            latch.await();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        //可能存在很多线程同时去访问getInstance（）
                        Object obj = LazyHusbandOne.getInstance();
                        System.out.println(System.currentTimeMillis()+":"+obj);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }.start();
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
    }
}
