package com.mx.factory;

import com.mx.factory.enums.OperationSystemEnum;

/**
 * @author 小米线儿
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class IPhone extends AbstractMobilePhone {

    public IPhone(){
        super("苹果手机-.-",OperationSystemEnum.iOS);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "name='" + name + '\'' +
                ", os=" + os.name() +
                '}';
    }
}
