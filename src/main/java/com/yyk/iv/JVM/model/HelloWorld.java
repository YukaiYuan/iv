package com.yyk.iv.JVM.model;


public class HelloWorld {

    //当类被加载
    //MetaSpace元空间存储了类的信息 Class:HelloWord Method:sayHello\setName\main-Field:name Class:System
    //Java堆存储了一个String对象一个HelloWorld对象 Object:String("test") Object:HelloWorld
    //线程独占main线程分配程序计数器、虚拟机栈、本地方法栈
    //栈中存有String类型的引用参数 Parameter reference :"test" to String Object 地址引用
    //HelloWorld类型的引用参数 Variable reference : "hw" to HelloWorld object
    //局部变量a with 1 程序计数器行号1
    private String name;
    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        int a = 1;
        HelloWorld hw = new HelloWorld();
        hw.setName("test");
        hw.sayHello();
    }
}
