package com.mx.singleton.lazy;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */

import java.util.concurrent.CountDownLatch;

/**
 * 懒汉式
 * 解决饿汉式浪费内存，在调用时创建
 */
public class LazySingleton {

    private static  LazySingleton INSTANCE = null;

    private LazySingleton(){}

//    public synchronized static LazySingleton getInstance(){
//        if(null == INSTANCE){
//            INSTANCE = new LazySingleton();
//        }
//        return INSTANCE;
//    }

    //双重校验锁
    public static LazySingleton getInstance(){
        if(null == INSTANCE){
            synchronized (LazySingleton.class){
                if(null == INSTANCE){
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        int num = 100;

        final CountDownLatch latch = new CountDownLatch(num);

        for(int i=0 ; i < num ; i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.countDown();
                        latch.await();
                        System.out.println(getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }



}
