package com.mx.factory.enums;

/**
 * @author fei-fan
 * @time 2019/3/7
 * @QQ 723109056
 * @blog https://blog.csdn.net/qq_31407255
 */
public enum OperationSystemEnum {

    Android("Android（谷歌)"),
    iOS("iOS（苹果）"),
    windows_phone("windows phone（微软）"),
    Symbian("Symbian（诺基亚）"),
    BlackBerry("BlackBerry OS（黑莓）");

    protected String name;

    OperationSystemEnum(String name) {
        this.name = name;
    }
}
