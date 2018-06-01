package com.wangproduction.func;

import com.wangproduction.Tshirt;
import com.wangproduction.UA;

/**
 * Created by Administrator on 2018/5/13 0013.
 */
public class UAFactory implements Factory {
    @Override
    public Tshirt getTshirt() {
        return new UA();
    }
}
