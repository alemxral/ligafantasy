package com.mbridge.msdk.dycreator.g;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a extends com.mbridge.msdk.dycreator.c.a {

    /* renamed from: b, reason: collision with root package name */
    private List<Object> f18678b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f18677a = new ConcurrentHashMap<>();

    public final synchronized void a(Object obj, int i8) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f18677a;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f18677a.put(Integer.valueOf(i8), obj);
            }
        }
    }

    public final synchronized void a() {
        this.f18677a.clear();
    }
}
