package com.mx.factory;

import com.mx.factory.enums.OperationSystemEnum;

import java.io.Serializable;

/**
 * @author 小米线儿
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public abstract class AbstractMobilePhone implements IMobilePhone,Serializable {

    private static final long serialVersionUID = -3238761865985269052L;
    protected final String name;
    protected final OperationSystemEnum os;

    protected AbstractMobilePhone(String name, OperationSystemEnum os) {
        this.name = name;
        this.os = os;
    }

    public String getName(){
        return name;
    }

    public String getOperationSystem(){
        return os.name();
    }
}
