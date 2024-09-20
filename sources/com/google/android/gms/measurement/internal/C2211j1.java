package com.google.android.gms.measurement.internal;

import m0.AbstractC3389b;

/* renamed from: com.google.android.gms.measurement.internal.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2211j1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f16516h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f16517a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2199h1 f16518b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f16519c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f16520d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f16521e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f16522f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile Object f16523g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2211j1(String str, Object obj, Object obj2, InterfaceC2199h1 interfaceC2199h1, AbstractC3389b abstractC3389b) {
        this.f16517a = str;
        this.f16519c = obj;
        this.f16520d = obj2;
        this.f16518b = interfaceC2199h1;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f16521e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC2205i1.f16502a == null) {
            return this.f16519c;
        }
        synchronized (f16516h) {
            try {
                if (C2167c.a()) {
                    if (this.f16523g == null) {
                        obj2 = this.f16519c;
                    } else {
                        obj2 = this.f16523g;
                    }
                    return obj2;
                }
                try {
                    for (C2211j1 c2211j1 : AbstractC2217k1.b()) {
                        if (!C2167c.a()) {
                            Object obj3 = null;
                            try {
                                InterfaceC2199h1 interfaceC2199h1 = c2211j1.f16518b;
                                if (interfaceC2199h1 != null) {
                                    obj3 = interfaceC2199h1.a();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f16516h) {
                                c2211j1.f16523g = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC2199h1 interfaceC2199h12 = this.f16518b;
                if (interfaceC2199h12 == null) {
                    return this.f16519c;
                }
                try {
                    return interfaceC2199h12.a();
                } catch (IllegalStateException unused3) {
                    return this.f16519c;
                } catch (SecurityException unused4) {
                    return this.f16519c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f16517a;
    }
}
