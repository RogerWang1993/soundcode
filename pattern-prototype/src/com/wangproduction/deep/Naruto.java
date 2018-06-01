package com.wangproduction.deep;

import java.io.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/20 0020.
 */
public class Naruto extends Kagebunsin implements Cloneable,Serializable {
    public Naruto(){
        this.birthday =new Date();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    //通过序列化和反序列化进行深拷贝
    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Naruto copy = (Naruto)ois.readObject();
            copy.birthday =new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //新实例化对象
    public Naruto copy(Naruto target){
        Naruto naruto = new Naruto();
        naruto.height = target.height;
        naruto.weight = target.weight;
        naruto.clothing = target.clothing;
        naruto.birthday = new Date();
        return  naruto;
    }
}
