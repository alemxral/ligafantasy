package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2252r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f16758a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16759b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f16760c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f16761d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f16762e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2267u1 f16763f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2252r1(C2267u1 c2267u1, int i8, String str, Object obj, Object obj2, Object obj3) {
        this.f16763f = c2267u1;
        this.f16758a = i8;
        this.f16759b = str;
        this.f16760c = obj;
        this.f16761d = obj2;
        this.f16762e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c8;
        long j8;
        char c9;
        long j9;
        I1 F8 = this.f16763f.f16764a.F();
        if (F8.n()) {
            C2267u1 c2267u1 = this.f16763f;
            c8 = c2267u1.f16817c;
            if (c8 == 0) {
                if (c2267u1.f16764a.z().H()) {
                    C2267u1 c2267u12 = this.f16763f;
                    c2267u12.f16764a.b();
                    c2267u12.f16817c = 'C';
                } else {
                    C2267u1 c2267u13 = this.f16763f;
                    c2267u13.f16764a.b();
                    c2267u13.f16817c = 'c';
                }
            }
            C2267u1 c2267u14 = this.f16763f;
            j8 = c2267u14.f16818d;
            if (j8 < 0) {
                c2267u14.f16764a.z().q();
                c2267u14.f16818d = 79000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f16758a);
            C2267u1 c2267u15 = this.f16763f;
            c9 = c2267u15.f16817c;
            j9 = c2267u15.f16818d;
            String str = "2" + charAt + c9 + j9 + ":" + C2267u1.A(true, this.f16759b, this.f16760c, this.f16761d, this.f16762e);
            if (str.length() > 1024) {
                str = this.f16759b.substring(0, 1024);
            }
            G1 g12 = F8.f16135d;
            if (g12 != null) {
                g12.b(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f16763f.D(), "Persisted config not initialized. Not logging error/warn");
    }
}
