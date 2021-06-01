package com.yyk.iv.JVM.gc;

public class NormalObject {
    public String name;

    public NormalObject(String name){
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("finalizing obj :" + name);
    }
}
