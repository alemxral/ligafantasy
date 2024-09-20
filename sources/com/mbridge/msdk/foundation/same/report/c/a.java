package com.mbridge.msdk.foundation.same.report.c;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19817a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static a f19818b;

    private a() {
    }

    public static a a() {
        if (f19818b == null) {
            synchronized (a.class) {
                try {
                    if (f19818b == null) {
                        f19818b = new a();
                    }
                } finally {
                }
            }
        }
        return f19818b;
    }
}
