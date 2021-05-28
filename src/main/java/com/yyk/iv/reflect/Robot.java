package com.yyk.iv.reflect;

public class Robot {

    static {
        System.out.println("hello robot");
    }
    private String name;
    public void sayHi(String helloSentence){
        System.out.println(helloSentence + "" + name);
    }

    private String throwHello(String tag){
        return "hell0 " + tag;
    }
}
