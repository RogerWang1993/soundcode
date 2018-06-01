package com.wangproduction.abstr;

import com.wangproduction.func.Factory;

/**
 * Created by Administrator on 2018/5/13 0013.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        TshirtFactory factory1 = new TshirtFactory();
        //用户只有选择的权力，保证了程序的健壮性
        System.out.println(factory1.getAdidas());
    }
}
