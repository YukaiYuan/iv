package com.yyk.iv.JVM.gc;

import java.lang.ref.ReferenceQueue;

public class Finalization {
    public static Finalization finalization;


    //当对象变成(GC Roots)不可达时，GC会判断该对象是否覆盖了finalize方法，若未覆盖，则直接将其回收。
    //否则，若对象未执行过finalize方法，将其放入F-Queue队列，由一低优先级线程执行该队列中对象的finalize方法。
    //执行finalize方法完毕后，GC会再次判断该对象是否可达，若不可达，则进行回收，否则，对象“复活”。
    @Override
    protected void finalize(){
        System.out.println("Finalized");
        //主要作用:使对象重生(重新获得引用)
        finalization = this;
    }

    public static void main(String[] args) {
        Finalization f = new Finalization();
        System.out.println("First Print :" + f);
        f = null;
        System.gc();

        //finalize并不能保证被完全执行,休眠一段时间保证能完全执行
        try {
            Thread.currentThread().sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Second Print: " + f);
        System.out.println(f.finalization);

    }
}
