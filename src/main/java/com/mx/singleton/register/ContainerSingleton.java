package com.mx.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class ContainerSingleton {

    private final static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    private ContainerSingleton(){}

    public static Object getInstance(String className){

        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object o = null;
                try {
                    o = Class.forName(className).newInstance();
                    ioc.put(className,o);
                } catch (Exception e){
                    e.printStackTrace();
                }
                return o;
            }
            return ioc.get(className);
        }

    }

}
