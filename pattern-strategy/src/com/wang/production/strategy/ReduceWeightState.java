package com.wang.production.strategy;

/**
 * 完成减肥之后的状态
 */
public class ReduceWeightState {
    private int code;
    private Object data;
    private String msg;

    public ReduceWeightState(int code, String msg, Object data){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString(){
        return ("减肥结果：["+code+"]"+msg+",减掉体重："+data);
    }
}
