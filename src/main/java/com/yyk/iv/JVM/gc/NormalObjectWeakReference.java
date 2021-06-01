package com.yyk.iv.JVM.gc;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class NormalObjectWeakReference extends WeakReference<NormalObject> {
    public String name;

    //指定引用队列,GC时会添加到该队列中
    public NormalObjectWeakReference(NormalObject normalObject, ReferenceQueue<NormalObject> q) {
        super(normalObject, q);
    }

    @Override
    protected void finalize() {
        System.out.println("Finalizing NormalObjectWeakReference :" + name);
    }
}
