package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class B7 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f15264c;

    public B7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f15264c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        try {
            return V2.b(this.f15264c.call());
        } catch (Exception unused) {
            return r.f15853c0;
        }
    }
}
