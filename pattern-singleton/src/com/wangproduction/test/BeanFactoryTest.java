package com.wangproduction.test;

import com.wangproduction.register.BeanFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2018/5/19 0019.
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        int count =200;
        //发令枪，都准备好了开始，然后依次到达目的地
        final CountDownLatch  latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for(int i= 0;i<count;i++){
            new Thread(){
                @Override
                public void run() {
                    try{
                        try{
                            //阻塞到count=0时释放所有共享锁
                            latch.await();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        //可能会很多多线程同时访问个体Instance()
                        Object obj= BeanFactory.getBean("com.wangproduction.test.Pojo");
                        System.out.println(System.currentTimeMillis()+":"+obj);
                    }catch (Exception e){
                        e.printStackTrace();
                }
            }

        }.start();
            //每启动一个线程，count--
            latch.countDown();
    }
        long end=System.currentTimeMillis();
        System.out.println("总时长"+(end-start));
}
}
