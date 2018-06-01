package com.wang.production.strategy;

import com.wang.production.strategy.reduceweightmethod.Diet;
import com.wang.production.strategy.reduceweightmethod.ReduceMethod;
import com.wang.production.strategy.reduceweightmethod.Run;

public class ReduceWeightTest {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person("1","zhangsan",10);
        //System.out.println(person.Reduce(new Run()));
        System.out.println(person.Reduce(ReduceMethod.RUN));
    }
}
