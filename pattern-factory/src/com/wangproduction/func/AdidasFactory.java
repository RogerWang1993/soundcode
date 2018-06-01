package com.wangproduction.func;

import com.wangproduction.Adidas;
import com.wangproduction.Tshirt;

/**
 * Created by Administrator on 2018/5/13 0013.
 */
public class AdidasFactory implements Factory {
    @Override
    public Tshirt getTshirt() {
        return new Adidas();
    }
}
