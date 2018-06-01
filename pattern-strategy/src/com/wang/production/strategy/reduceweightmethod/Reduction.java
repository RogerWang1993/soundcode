package com.wang.production.strategy.reduceweightmethod;

import com.wang.production.strategy.ReduceWeightState;

public interface Reduction {

    public ReduceWeightState reduce(String uid, double loseweight);
}
