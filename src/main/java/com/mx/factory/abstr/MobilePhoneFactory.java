package com.mx.factory.abstr;

import com.mx.factory.HuaWeiPhone;
import com.mx.factory.IMobilePhone;
import com.mx.factory.IPhone;

/**
 * @author fei-fan
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class MobilePhoneFactory extends AbstrMobilePhoneFactory {
    @Override
    public IMobilePhone createHuaWeiPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IMobilePhone createIPhone() {
        return new IPhone();
    }
}
