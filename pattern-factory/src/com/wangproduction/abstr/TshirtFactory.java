package com.wangproduction.abstr;

import com.wangproduction.Adidas;
import com.wangproduction.Nike;
import com.wangproduction.Tshirt;
import com.wangproduction.UA;

/**
 * Created by Administrator on 2018/5/13 0013.
 */
public class TshirtFactory extends  AbstractFactory{

    @Override
    public Tshirt getNike() {
        return new Nike();
    }

    @Override
    public Tshirt getAdidas() {
        return new Adidas();
    }

    @Override
    public Tshirt getUA() {
        return new UA();
    }
}
