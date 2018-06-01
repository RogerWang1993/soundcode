package com.wangproduction.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2018/5/19 0019.
 */
public class RegisterMap {
    private RegisterMap(){}
    private static Map<String,Object> register = new ConcurrentHashMap<String, Object>();
    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getName();

        }
        if(register.get(name) ==null){
            try{
                register.put(name,new RegisterMap());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return (RegisterMap) register.get(name);
    }
}