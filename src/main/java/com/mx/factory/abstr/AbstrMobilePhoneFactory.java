package com.mx.factory.abstr;

import com.mx.factory.IMobilePhone;

/**
 * @author 小米线儿
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public abstract class AbstrMobilePhoneFactory {

    public abstract IMobilePhone createHuaWeiPhone();

    public abstract IMobilePhone createIPhone();

}
