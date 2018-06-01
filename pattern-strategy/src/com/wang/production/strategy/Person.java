package com.wang.production.strategy;

import com.wang.production.strategy.reduceweightmethod.ReduceMethod;
import com.wang.production.strategy.reduceweightmethod.Reduction;

public class Person {
    private String uid;
    private String name;
    private double loseWeight;

    public Person(String uid, String name, double loseWeight){
        this.uid = uid;
        this.name = name;
        this.loseWeight = loseWeight;

    }

    //完美地解决了switch的过程，不需要在代码逻辑中写switch了
    //更不需要写if    else if
    public ReduceWeightState Reduce(ReduceMethod reduceMethod){
        //return reduction.reduce(this.uid,this.loseWeight);
        return reduceMethod.get().reduce(this.uid,this.loseWeight);
    }
}
