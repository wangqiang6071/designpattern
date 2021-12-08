package com.wayne.designpattern.structuralType.singleMode;

/**
 * @author wangqiang
 * @Date: 2021/12/8 10:36
 * 线程安全：类加载的时 就会在堆中开辟一块内存为style。如果当前对象一直不被使用 就会早成资源空间的浪费
 */
public class hungryStyle {
    private final static hungryStyle style=new hungryStyle();
    private hungryStyle(){}

    public static hungryStyle getsingle(){
        return style;
    }
}
