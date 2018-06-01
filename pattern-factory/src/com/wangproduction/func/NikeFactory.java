package com.wangproduction.func;

import com.wangproduction.Nike;
import com.wangproduction.Tshirt;

/**
 * Created by Administrator on 2018/5/13 0013.
 */
public class NikeFactory implements Factory{
    @Override
    public Tshirt getTshirt() {
        return new Nike();
    }
}
