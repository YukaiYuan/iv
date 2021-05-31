package com.yyk.iv.JVM.model;

import java.util.Random;

public class PermGenErrorTest {

    //jdk6 OOM:PermDen space
    //jdk6+ 字符串常量池移动到了堆中
    public static void main(String[] args) {
        for (int i=0;i<=1000;i++){
            getRandomString(100000).intern();
        }
    }

    private static String getRandomString(int length) {
        String resourceStr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0;i<=length;i++){
            sb.append(resourceStr.charAt(random.nextInt(62)));
        }
        return sb.toString();
    }
}
