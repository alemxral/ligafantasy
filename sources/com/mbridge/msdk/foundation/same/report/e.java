package com.mbridge.msdk.foundation.same.report;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f19861a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19862b = false;

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f19861a == null) {
                    f19861a = new e();
                }
                eVar = f19861a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final synchronized boolean b() {
        return false;
    }

    public final synchronized void a(String str) {
    }
}
