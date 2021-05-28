package com.yyk.iv.ClassLoaderDemo;

public class ClassLoaderCheck {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        MyClassLoader classLoader = new MyClassLoader("","MyClassLoader");
        Class c = classLoader.findClass("");
        System.out.println(c.getClassLoader());
        //触发静态代码
        c.newInstance();
    }
}
