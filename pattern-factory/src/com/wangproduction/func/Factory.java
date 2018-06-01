package com.wangproduction.func;

import com.wangproduction.Tshirt;

/**
 * 工厂方法
 * Created by Administrator on 2018/5/13 0013.
 */
public interface Factory {
    //每个服装工厂都具有生产Tshirt的技能，统一Tshirt出口
    Tshirt getTshirt();
}
