package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2214j4 implements InterfaceC2277w1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16528a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r4 f16529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2214j4(r4 r4Var, String str) {
        this.f16529b = r4Var;
        this.f16528a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2277w1
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f16529b.p(i8, th, bArr, this.f16528a);
    }
}
