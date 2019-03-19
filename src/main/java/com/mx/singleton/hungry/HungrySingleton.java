package com.mx.singleton.hungry;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */

/**
 * 饿汉式单例
 * 缺点：浪费内存空间
 */
public class HungrySingleton {

    private final static HungrySingleton INSTANCE= new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
