package com.mx.factory.simple;

import com.mx.factory.AbstractMobilePhone;
import com.mx.factory.IMobilePhone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fei-fan
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public class SimpleMobilePhoneFactory {

    private final static Logger LOG = LoggerFactory.getLogger(SimpleMobilePhoneFactory.class);

    public static <T extends AbstractMobilePhone> IMobilePhone createMobilePhone(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e){
            LOG.error(e.getMessage());
        }
        return null;
    }
}
