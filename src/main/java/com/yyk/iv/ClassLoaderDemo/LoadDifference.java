package com.yyk.iv.ClassLoaderDemo;

import com.yyk.iv.reflect.Robot;

public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
        //不执行静态代码块 loadClass可传参是否进行解析
        ClassLoader cl  = Robot.class.getClassLoader();
        //执行静态代码块 forName源码的initialize属性默认为true
        Class r = Class.forName("com.yyk.iv.reflect.Robot");
    }
}
