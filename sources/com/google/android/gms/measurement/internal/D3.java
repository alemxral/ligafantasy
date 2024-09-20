package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16042a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16043b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16044c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ D4 f16045d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f16046e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K3 f16047f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(K3 k32, AtomicReference atomicReference, String str, String str2, String str3, D4 d42, boolean z8) {
        this.f16047f = k32;
        this.f16042a = atomicReference;
        this.f16043b = str2;
        this.f16044c = str3;
        this.f16045d = d42;
        this.f16046e = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        K3 k32;
        InterfaceC3391d interfaceC3391d;
        synchronized (this.f16042a) {
            try {
                try {
                    k32 = this.f16047f;
                    interfaceC3391d = k32.f16189d;
                } catch (RemoteException e8) {
                    this.f16047f.f16764a.d().r().d("(legacy) Failed to get user properties; remote exception", null, this.f16043b, e8);
                    this.f16042a.set(Collections.emptyList());
                    atomicReference = this.f16042a;
                }
                if (interfaceC3391d == null) {
                    k32.f16764a.d().r().d("(legacy) Failed to get user properties; not connected to service", null, this.f16043b, this.f16044c);
                    this.f16042a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC1319p.l(this.f16045d);
                    this.f16042a.set(interfaceC3391d.W(this.f16043b, this.f16044c, this.f16046e, this.f16045d));
                } else {
                    this.f16042a.set(interfaceC3391d.t(null, this.f16043b, this.f16044c, this.f16046e));
                }
                this.f16047f.E();
                atomicReference = this.f16042a;
                atomicReference.notify();
            } finally {
                this.f16042a.notify();
            }
        }
    }
}
