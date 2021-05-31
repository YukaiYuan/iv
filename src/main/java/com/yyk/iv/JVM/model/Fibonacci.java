package com.yyk.iv.JVM.model;

public class Fibonacci {
    //斐波那契数列
    //F(0)=1,F(1)=1,当n>=2的时候,F(n)=F(n-1) + F(n-2)
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1) + fibonacci( n-2);
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(3));

        //一个方法的执行就代表一个栈帧的入栈和出栈
        //当递归过深,栈帧数超出虚拟机栈深度,造成stackOverFlowError
        System.out.println(fibonacci(1000000));
    }
}
