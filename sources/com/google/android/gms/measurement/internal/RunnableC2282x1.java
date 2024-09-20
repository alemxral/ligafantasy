package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.util.Map;
import m0.AbstractC3393f;

/* renamed from: com.google.android.gms.measurement.internal.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2282x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2277w1 f16904a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16905b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f16906c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f16907d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16908e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f16909f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC2282x1(String str, InterfaceC2277w1 interfaceC2277w1, int i8, Throwable th, byte[] bArr, Map map, AbstractC3393f abstractC3393f) {
        AbstractC1319p.l(interfaceC2277w1);
        this.f16904a = interfaceC2277w1;
        this.f16905b = i8;
        this.f16906c = th;
        this.f16907d = bArr;
        this.f16908e = str;
        this.f16909f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16904a.a(this.f16908e, this.f16905b, this.f16906c, this.f16907d, this.f16909f);
    }
}
