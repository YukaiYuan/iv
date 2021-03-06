package com.yyk.iv.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //类会进行初始化,执行静态代码
        Class robotClass = Class.forName("com.yyk.iv.reflect.Robot");

        //不会初始化
        Class robotClass1 = Robot.class;//不会初始化

        //不会初始化化
        Class robotClass2 = Robot.class.getClassLoader().loadClass("com.yyk.iv.reflect.Robot");

        Robot r = new Robot();
        Class robotClass3 = r.getClass();

        Robot robot= (Robot) robotClass.newInstance();
        //一切皆为对象
        //getDeclaredMethod可获得所有方法包括私有方法,不能获得父类方法
        Method getHello = robotClass.getDeclaredMethod("throwHello", String.class);
        //throwHello为私有方法,需要设置可达
        getHello.setAccessible(true);
        Object str = getHello.invoke(robot,"Bob");
        //只能获得public方法,但是可获得父类public方法
        Method sayHi = robotClass.getMethod("sayHi", String.class);
        sayHi.invoke(robot,"Welcome");

        //获取属性
        Field name = robotClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot,"Alice");
        sayHi.invoke(robot,"Welcome");
    }
}
