package com.yyk.iv.JVM.model;

public class ByteCodeSample {
    //javac
    //javap -verbose
    //stack操作数栈 locals 局部变量表  line代码行号对应字节码行号
    public static int add(int a,int b){
        int c= 0;
        c= a+b;
        return c;
    }
}
