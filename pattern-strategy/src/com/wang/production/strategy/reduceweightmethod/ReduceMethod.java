package com.wang.production.strategy.reduceweightmethod;

public enum ReduceMethod {
    DIET(new Diet()),
    RUN(new Run())
    ;
//枚举只能为reduction的继承类
    private  Reduction reduction;
    ReduceMethod(Reduction reduction){
        this.reduction = reduction;

    }
    public Reduction get(){
        return this.reduction;
    }

}
