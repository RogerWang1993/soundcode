package com.wangproduction.abstr;

import com.wangproduction.Tshirt;

/**
 * 抽象工厂为用户主入口
 * 在Spring中应用得最为广泛的设计模式
 * 已于扩展
 * Created by Administrator on 2018/5/13 0013.
 */
public abstract  class AbstractFactory  {
    /**
     * 获得一个nike品牌的Tshirt
     * @return
     */
    public abstract Tshirt getNike();

    /**
     * 获得一个adidas品牌的Tshirt
     * @return
     */
    public abstract  Tshirt getAdidas();

    /**
     * 获得一个UA品牌的Tshirt
     * @return
     */
    public abstract Tshirt getUA();
}
