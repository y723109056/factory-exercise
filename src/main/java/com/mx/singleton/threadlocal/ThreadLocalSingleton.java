package com.mx.singleton.threadlocal;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class ThreadLocalSingleton {

    private final static ThreadLocal<ThreadLocalSingleton> LOCAL = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return LOCAL.get();

    }


}
