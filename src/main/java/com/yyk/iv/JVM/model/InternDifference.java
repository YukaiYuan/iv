package com.yyk.iv.JVM.model;

public class InternDifference {

    //JDK6:当调用intern方法时,如果字符串常量池先前已创建出该字符串对象,则返回池中该字符串的引用.否则,将此字符串对象添加到字符串常量池中,并且返回该字符串对象的引用
    //JDK6+:当调用intern方法时,如果字符串常量池先前已创建出该字符串对象,则返回池中该字符串的引用.否则,如果该字符串对象已经存在于Java堆中,则将堆中对此对象的引用添加到字符串常量池中,并且返回该引用;如果堆中不存在,则在池中创建该字符串并返回其引用;
    public static void main(String[] args) {
        String s = new String("a");
        s.intern();
        String s2 = "a";
        System.out.println(s == s2);

        //双引号引用字符串就会往字符串常量池放入
        String s3 = new String("a") + new String("a");
//        String s3 = new String("aa");
        s3.intern();
        String s4 = "aa";
        System.out.println(s3 == s4);
    }
}
