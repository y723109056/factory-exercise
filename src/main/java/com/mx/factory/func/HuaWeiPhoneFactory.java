package com.mx.factory.func;

import com.mx.factory.HuaWeiPhone;
import com.mx.factory.IMobilePhone;

/**
 * @author fei-fan
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class HuaWeiPhoneFactory implements FuncMobilePhoneFactory {
    @Override
    public IMobilePhone createMobilePhone() {
        return new HuaWeiPhone();
    }
}
