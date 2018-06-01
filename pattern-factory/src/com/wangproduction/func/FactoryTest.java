package com.wangproduction.func;

/**
 * Created by Administrator on 2018/5/13 0013.
 */
public class FactoryTest {
    public static void main(String[] args) {
        //相当于客户和品牌工厂产生联系
        Factory factory =new AdidasFactory();
        System.out.println(factory.getTshirt());
    }
}
