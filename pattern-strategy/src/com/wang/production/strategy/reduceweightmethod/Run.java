package com.wang.production.strategy.reduceweightmethod;

import com.wang.production.strategy.ReduceWeightState;

public class Run implements Reduction{
    @Override
    public ReduceWeightState reduce(String uid, double loseweight) {
        System.out.println("您选择了跑步减肥");
        System.out.println("查询你的减肥目标，制定计划");
        return new ReduceWeightState(200,"减肥成功",loseweight);
    }
}
