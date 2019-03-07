package com.mx;

import com.mx.factory.HuaWeiPhone;
import com.mx.factory.IMobilePhone;
import com.mx.factory.abstr.AbstrMobilePhoneFactory;
import com.mx.factory.abstr.MobilePhoneFactory;
import com.mx.factory.func.FuncMobilePhoneFactory;
import com.mx.factory.func.HuaWeiPhoneFactory;
import com.mx.factory.simple.SimpleMobilePhoneFactory;
import org.junit.Test;

/**
 * @author 小米线儿
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class FactoryTest {

    @Test
    public void simpleFactoryTest(){
        IMobilePhone mobilePhone = SimpleMobilePhoneFactory.createMobilePhone(HuaWeiPhone.class);
        System.out.println(mobilePhone);
    }


    @Test
    public void FuncFactoryTest(){
        FuncMobilePhoneFactory factory = new HuaWeiPhoneFactory();
        IMobilePhone mobilePhone = factory.createMobilePhone();
        System.out.println(mobilePhone);

    }

    @Test
    public void AbstrFactoryTest(){
        AbstrMobilePhoneFactory factory = new MobilePhoneFactory();
        IMobilePhone huaWeiPhone = factory.createHuaWeiPhone();
        System.out.println(huaWeiPhone);

    }




}
