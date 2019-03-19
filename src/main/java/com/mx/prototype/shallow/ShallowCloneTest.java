package com.mx.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class ShallowCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setName("feifan");
        shallowClone.setId(1);
        List list = new ArrayList();
        list.add("feifan");
        shallowClone.setList(list);

        ShallowClone copy = (ShallowClone)shallowClone.clone();
        System.out.println(shallowClone.getList()==copy.getList());//true


    }

}
