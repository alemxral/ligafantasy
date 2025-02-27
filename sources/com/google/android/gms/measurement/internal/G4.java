package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C1953b2;
import com.google.android.gms.internal.measurement.C1962c2;
import com.google.android.gms.internal.measurement.C1966c6;
import com.google.android.gms.internal.measurement.C1971d2;
import com.google.android.gms.internal.measurement.C1980e2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m0.AbstractC3386C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    private String f16110a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16111b;

    /* renamed from: c, reason: collision with root package name */
    private C1962c2 f16112c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f16113d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f16114e;

    /* renamed from: f, reason: collision with root package name */
    private Map f16115f;

    /* renamed from: g, reason: collision with root package name */
    private Map f16116g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2161b f16117h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ G4(C2161b c2161b, String str, AbstractC3386C abstractC3386C) {
        this.f16117h = c2161b;
        this.f16110a = str;
        this.f16111b = true;
        this.f16113d = new BitSet();
        this.f16114e = new BitSet();
        this.f16115f = new ArrayMap();
        this.f16116g = new ArrayMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(G4 g42) {
        return g42.f16113d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.I1 a(int i8) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.H1 C8 = com.google.android.gms.internal.measurement.I1.C();
        C8.o(i8);
        C8.q(this.f16111b);
        C1962c2 c1962c2 = this.f16112c;
        if (c1962c2 != null) {
            C8.r(c1962c2);
        }
        C1953b2 F8 = C1962c2.F();
        F8.p(t4.J(this.f16113d));
        F8.r(t4.J(this.f16114e));
        Map map = this.f16115f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f16115f.keySet()) {
                int intValue = num.intValue();
                Long l8 = (Long) this.f16115f.get(num);
                if (l8 != null) {
                    com.google.android.gms.internal.measurement.J1 D8 = com.google.android.gms.internal.measurement.K1.D();
                    D8.p(intValue);
                    D8.o(l8.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.K1) D8.k());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            F8.o(arrayList);
        }
        Map map2 = this.f16116g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f16116g.keySet()) {
                C1971d2 E8 = C1980e2.E();
                E8.p(num2.intValue());
                List list2 = (List) this.f16116g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    E8.o(list2);
                }
                arrayList3.add((C1980e2) E8.k());
            }
            list = arrayList3;
        }
        F8.q(list);
        C8.p(F8);
        return (com.google.android.gms.internal.measurement.I1) C8.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(J4 j42) {
        int a8 = j42.a();
        if (j42.f16175c != null) {
            this.f16114e.set(a8, true);
        }
        Boolean bool = j42.f16176d;
        if (bool != null) {
            this.f16113d.set(a8, bool.booleanValue());
        }
        if (j42.f16177e != null) {
            Map map = this.f16115f;
            Integer valueOf = Integer.valueOf(a8);
            Long l8 = (Long) map.get(valueOf);
            long longValue = j42.f16177e.longValue() / 1000;
            if (l8 == null || longValue > l8.longValue()) {
                this.f16115f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (j42.f16178f != null) {
            Map map2 = this.f16116g;
            Integer valueOf2 = Integer.valueOf(a8);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f16116g.put(valueOf2, list);
            }
            if (j42.c()) {
                list.clear();
            }
            C1966c6.c();
            C2197h z8 = this.f16117h.f16764a.z();
            String str = this.f16110a;
            C2211j1 c2211j1 = AbstractC2217k1.f16570a0;
            if (z8.B(str, c2211j1) && j42.b()) {
                list.clear();
            }
            C1966c6.c();
            if (this.f16117h.f16764a.z().B(this.f16110a, c2211j1)) {
                Long valueOf3 = Long.valueOf(j42.f16178f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(j42.f16178f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ G4(C2161b c2161b, String str, C1962c2 c1962c2, BitSet bitSet, BitSet bitSet2, Map map, Map map2, AbstractC3386C abstractC3386C) {
        this.f16117h = c2161b;
        this.f16110a = str;
        this.f16113d = bitSet;
        this.f16114e = bitSet2;
        this.f16115f = map;
        this.f16116g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f16116g.put(num, arrayList);
        }
        this.f16111b = false;
        this.f16112c = c1962c2;
    }
}
