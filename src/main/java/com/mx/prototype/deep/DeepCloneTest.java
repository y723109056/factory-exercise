package com.mx.prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * @author feifan
 * @time 2019/03/19
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        DeepClone deepClone = new DeepClone();
        deepClone.setName("feifan");
        deepClone.setId(1);
        List list = new ArrayList();
        list.add("feifan");
        deepClone.setList(list);

        DeepClone copy = (DeepClone)deepClone.deepClone();
        System.out.println(deepClone.getList()==copy.getList());//false
    }
}
