package com.google.android.gms.common.api.internal;

import O.C1260d;
import P.a;
import R.AbstractC1319p;
import r0.C3679j;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1940d {

    /* renamed from: a, reason: collision with root package name */
    private final C1260d[] f15134a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15135b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15136c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Q.i f15137a;

        /* renamed from: c, reason: collision with root package name */
        private C1260d[] f15139c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15138b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f15140d = 0;

        /* synthetic */ a(Q.z zVar) {
        }

        public AbstractC1940d a() {
            boolean z8;
            if (this.f15137a != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC1319p.b(z8, "execute parameter required");
            return new t(this, this.f15139c, this.f15138b, this.f15140d);
        }

        public a b(Q.i iVar) {
            this.f15137a = iVar;
            return this;
        }

        public a c(boolean z8) {
            this.f15138b = z8;
            return this;
        }

        public a d(C1260d... c1260dArr) {
            this.f15139c = c1260dArr;
            return this;
        }

        public a e(int i8) {
            this.f15140d = i8;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1940d(C1260d[] c1260dArr, boolean z8, int i8) {
        this.f15134a = c1260dArr;
        boolean z9 = false;
        if (c1260dArr != null && z8) {
            z9 = true;
        }
        this.f15135b = z9;
        this.f15136c = i8;
    }

    public static a a() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(a.b bVar, C3679j c3679j);

    public boolean c() {
        return this.f15135b;
    }

    public final int d() {
        return this.f15136c;
    }

    public final C1260d[] e() {
        return this.f15134a;
    }
}
