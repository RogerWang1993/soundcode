package com.wangproduction.deep;

/**
 * Created by Administrator on 2018/5/20 0020.
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        Naruto naruto = new Naruto();
        try{

            Naruto clone =(Naruto)naruto.clone();
            System.out.println(naruto == clone);
        }catch (Exception e){
            e.printStackTrace();
        }

        Naruto q = new Naruto();
        Naruto p = q.copy(q);
        System.out.println(q.birthday == p.birthday);
    }
}
