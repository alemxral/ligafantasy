package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class D7 extends AbstractC2028k {

    /* renamed from: c, reason: collision with root package name */
    private final C2127w3 f15285c;

    /* renamed from: d, reason: collision with root package name */
    final Map f15286d;

    public D7(C2127w3 c2127w3) {
        super("require");
        this.f15286d = new HashMap();
        this.f15285c = c2127w3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        r rVar;
        AbstractC2110u2.h("require", 1, list);
        String g8 = t12.b((r) list.get(0)).g();
        if (this.f15286d.containsKey(g8)) {
            return (r) this.f15286d.get(g8);
        }
        C2127w3 c2127w3 = this.f15285c;
        if (c2127w3.f15935a.containsKey(g8)) {
            try {
                rVar = (r) ((Callable) c2127w3.f15935a.get(g8)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(g8)));
            }
        } else {
            rVar = r.f15853c0;
        }
        if (rVar instanceof AbstractC2028k) {
            this.f15286d.put(g8, (AbstractC2028k) rVar);
        }
        return rVar;
    }
}
