package com.mx.factory;

import com.mx.factory.enums.OperationSystemEnum;

/**
 * @author fei-fan
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class HuaWeiPhone extends AbstractMobilePhone{

    public HuaWeiPhone(){
        super("华为手机",OperationSystemEnum.Android);
    }

    @Override
    public String toString() {
        return "HuaWeiPhone{" +
                "name='" + name + '\'' +
                ", os=" + os.name() +
                '}';
    }
}
