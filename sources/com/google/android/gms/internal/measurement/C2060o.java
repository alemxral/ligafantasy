package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2060o implements r, InterfaceC2052n {

    /* renamed from: a, reason: collision with root package name */
    final Map f15760a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final boolean a(String str) {
        return this.f15760a.containsKey(str);
    }

    public final List b() {
        return new ArrayList(this.f15760a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        C2060o c2060o = new C2060o();
        for (Map.Entry entry : this.f15760a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2052n) {
                c2060o.f15760a.put((String) entry.getKey(), (r) entry.getValue());
            } else {
                c2060o.f15760a.put((String) entry.getKey(), ((r) entry.getValue()).d());
            }
        }
        return c2060o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2060o)) {
            return false;
        }
        return this.f15760a.equals(((C2060o) obj).f15760a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f15760a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return AbstractC2036l.b(this.f15760a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final void l(String str, r rVar) {
        if (rVar == null) {
            this.f15760a.remove(str);
        } else {
            this.f15760a.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r m(String str, T1 t12, List list) {
        if ("toString".equals(str)) {
            return new C2115v(toString());
        }
        return AbstractC2036l.a(this, new C2115v(str), t12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2052n
    public final r p(String str) {
        if (this.f15760a.containsKey(str)) {
            return (r) this.f15760a.get(str);
        }
        return r.f15853c0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f15760a.isEmpty()) {
            for (String str : this.f15760a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f15760a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
