package Q;

import P.a;
import R.AbstractC1317n;

/* renamed from: Q.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8135a;

    /* renamed from: b, reason: collision with root package name */
    private final P.a f8136b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f8137c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8138d;

    private C1301b(P.a aVar, a.d dVar, String str) {
        this.f8136b = aVar;
        this.f8137c = dVar;
        this.f8138d = str;
        this.f8135a = AbstractC1317n.b(aVar, dVar, str);
    }

    public static C1301b a(P.a aVar, a.d dVar, String str) {
        return new C1301b(aVar, dVar, str);
    }

    public final String b() {
        return this.f8136b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1301b)) {
            return false;
        }
        C1301b c1301b = (C1301b) obj;
        if (!AbstractC1317n.a(this.f8136b, c1301b.f8136b) || !AbstractC1317n.a(this.f8137c, c1301b.f8137c) || !AbstractC1317n.a(this.f8138d, c1301b.f8138d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8135a;
    }
}
