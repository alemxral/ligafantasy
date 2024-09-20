package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2024j3 implements Serializable, InterfaceC2016i3 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC2016i3 f15726a;

    /* renamed from: b, reason: collision with root package name */
    volatile transient boolean f15727b;

    /* renamed from: c, reason: collision with root package name */
    transient Object f15728c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2024j3(InterfaceC2016i3 interfaceC2016i3) {
        interfaceC2016i3.getClass();
        this.f15726a = interfaceC2016i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2016i3
    public final Object a() {
        if (!this.f15727b) {
            synchronized (this) {
                try {
                    if (!this.f15727b) {
                        Object a8 = this.f15726a.a();
                        this.f15728c = a8;
                        this.f15727b = true;
                        return a8;
                    }
                } finally {
                }
            }
        }
        return this.f15728c;
    }

    public final String toString() {
        Object obj;
        if (this.f15727b) {
            obj = "<supplier that returned " + String.valueOf(this.f15728c) + ">";
        } else {
            obj = this.f15726a;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
