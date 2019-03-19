package com.mx.factory.func;

import com.mx.factory.IMobilePhone;
import com.mx.factory.IPhone;

/**
 * @author fei-fan
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class IPhoneFactory implements FuncMobilePhoneFactory {
    @Override
    public IMobilePhone createMobilePhone() {
        return new IPhone();
    }
}
