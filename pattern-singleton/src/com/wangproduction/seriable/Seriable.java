package com.wangproduction.seriable;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/19 0019.
 */
//反序列化时导致单利破坏
public class Seriable implements Serializable{
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方（可以是磁盘/网络IO）
    //内存中状态给永久保存下来了
    //反序列化
    //将已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建Java对象
    public final static Seriable INSTANCE = new Seriable();
    private Seriable(){}
    public static Seriable getInstance(){return INSTANCE;}
    //自动调用，返回同一实例
    private Object readResolve(){
        return INSTANCE;
    }
}
