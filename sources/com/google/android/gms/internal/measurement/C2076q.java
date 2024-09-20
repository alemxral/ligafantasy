package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2076q extends AbstractC2028k implements InterfaceC2052n {

    /* renamed from: c, reason: collision with root package name */
    protected final List f15829c;

    /* renamed from: d, reason: collision with root package name */
    protected final List f15830d;

    /* renamed from: e, reason: collision with root package name */
    protected T1 f15831e;

    private C2076q(C2076q c2076q) {
        super(c2076q.f15736a);
        ArrayList arrayList = new ArrayList(c2076q.f15829c.size());
        this.f15829c = arrayList;
        arrayList.addAll(c2076q.f15829c);
        ArrayList arrayList2 = new ArrayList(c2076q.f15830d.size());
        this.f15830d = arrayList2;
        arrayList2.addAll(c2076q.f15830d);
        this.f15831e = c2076q.f15831e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k
    public final r b(T1 t12, List list) {
        T1 a8 = this.f15831e.a();
        for (int i8 = 0; i8 < this.f15829c.size(); i8++) {
            if (i8 < list.size()) {
                a8.e((String) this.f15829c.get(i8), t12.b((r) list.get(i8)));
            } else {
                a8.e((String) this.f15829c.get(i8), r.f15853c0);
            }
        }
        for (r rVar : this.f15830d) {
            r b8 = a8.b(rVar);
            if (b8 instanceof C2091s) {
                b8 = a8.b(rVar);
            }
            if (b8 instanceof C2004h) {
                return ((C2004h) b8).a();
            }
        }
        return r.f15853c0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2028k, com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C2076q(this);
    }

    public C2076q(String str, List list, List list2, T1 t12) {
        super(str);
        this.f15829c = new ArrayList();
        this.f15831e = t12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f15829c.add(((r) it.next()).g());
            }
        }
        this.f15830d = new ArrayList(list2);
    }
}
