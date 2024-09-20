package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16003a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16004b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16005c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ D4 f16006d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K3 f16007e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(K3 k32, AtomicReference atomicReference, String str, String str2, String str3, D4 d42) {
        this.f16007e = k32;
        this.f16003a = atomicReference;
        this.f16004b = str2;
        this.f16005c = str3;
        this.f16006d = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        K3 k32;
        InterfaceC3391d interfaceC3391d;
        synchronized (this.f16003a) {
            try {
                try {
                    k32 = this.f16007e;
                    interfaceC3391d = k32.f16189d;
                } catch (RemoteException e8) {
                    this.f16007e.f16764a.d().r().d("(legacy) Failed to get conditional properties; remote exception", null, this.f16004b, e8);
                    this.f16003a.set(Collections.emptyList());
                    atomicReference = this.f16003a;
                }
                if (interfaceC3391d == null) {
                    k32.f16764a.d().r().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f16004b, this.f16005c);
                    this.f16003a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC1319p.l(this.f16006d);
                    this.f16003a.set(interfaceC3391d.P(this.f16004b, this.f16005c, this.f16006d));
                } else {
                    this.f16003a.set(interfaceC3391d.D(null, this.f16004b, this.f16005c));
                }
                this.f16007e.E();
                atomicReference = this.f16003a;
                atomicReference.notify();
            } finally {
                this.f16003a.notify();
            }
        }
    }
}
