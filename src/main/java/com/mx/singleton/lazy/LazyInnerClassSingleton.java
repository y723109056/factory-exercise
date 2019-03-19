package com.mx.singleton.lazy;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */

import java.io.*;

/**
 * 静态内部类
 * 全程没有使用synchronize关键字，性能较优
 */
public class LazyInnerClassSingleton implements Serializable {

    private static final long serialVersionUID = 2111533967828892741L;

    private LazyInnerClassSingleton(){
        //防止被反射破坏
        if(null != LazyHolder.INSTANCE){
            throw new RuntimeException("this singleton has been initialed");
        }
    }

    public static LazyInnerClassSingleton getInstance(){

        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private final static LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

    //防止序列化破坏
    public Object readResolve(){
        return LazyHolder.INSTANCE;
    }



    public static void main(String[] args) throws Exception {

        //反射破坏
//        Class<?> clazz = LazyInnerClassSingleton.class;
//
//        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
//        constructor.setAccessible(true);//强制访问
//
//        Object o = constructor.newInstance();
//
//        System.out.println(o==getInstance());

        //序列化破坏
        LazyInnerClassSingleton instance = getInstance();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(instance);
        out.flush();
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        in.close();
        LazyInnerClassSingleton o1 = (LazyInnerClassSingleton)in.readObject();
        System.out.println(o1==instance);


    }

}
