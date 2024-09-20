package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1966c6;
import com.google.android.gms.internal.measurement.C1979e1;
import com.google.android.gms.internal.measurement.C1998g2;
import com.google.android.gms.internal.measurement.C2038l1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K4 extends J4 {

    /* renamed from: g, reason: collision with root package name */
    private final C2038l1 f16195g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2161b f16196h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4(C2161b c2161b, String str, int i8, C2038l1 c2038l1) {
        super(str, i8);
        this.f16196h = c2161b;
        this.f16195g = c2038l1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.J4
    public final int a() {
        return this.f16195g.B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.J4
    public final boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.J4
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(Long l8, Long l9, C1998g2 c1998g2, boolean z8) {
        boolean z9;
        Object obj;
        C1966c6.c();
        boolean B8 = this.f16196h.f16764a.z().B(this.f16173a, AbstractC2217k1.f16567Y);
        boolean H8 = this.f16195g.H();
        boolean J8 = this.f16195g.J();
        boolean K8 = this.f16195g.K();
        if (H8 || J8 || K8) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z8 && !z9) {
            C2257s1 v8 = this.f16196h.f16764a.d().v();
            Integer valueOf = Integer.valueOf(this.f16174b);
            if (this.f16195g.M()) {
                num = Integer.valueOf(this.f16195g.B());
            }
            v8.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        C1979e1 C8 = this.f16195g.C();
        boolean H9 = C8.H();
        if (c1998g2.T()) {
            if (!C8.K()) {
                this.f16196h.f16764a.d().w().b("No number filter for long property. property", this.f16196h.f16764a.D().f(c1998g2.G()));
            } else {
                bool = J4.j(J4.h(c1998g2.C(), C8.D()), H9);
            }
        } else if (c1998g2.S()) {
            if (!C8.K()) {
                this.f16196h.f16764a.d().w().b("No number filter for double property. property", this.f16196h.f16764a.D().f(c1998g2.G()));
            } else {
                bool = J4.j(J4.g(c1998g2.B(), C8.D()), H9);
            }
        } else if (c1998g2.V()) {
            if (!C8.N()) {
                if (!C8.K()) {
                    this.f16196h.f16764a.d().w().b("No string or number filter defined. property", this.f16196h.f16764a.D().f(c1998g2.G()));
                } else if (t4.P(c1998g2.H())) {
                    bool = J4.j(J4.i(c1998g2.H(), C8.D()), H9);
                } else {
                    this.f16196h.f16764a.d().w().c("Invalid user property value for Numeric number filter. property, value", this.f16196h.f16764a.D().f(c1998g2.G()), c1998g2.H());
                }
            } else {
                bool = J4.j(J4.f(c1998g2.H(), C8.E(), this.f16196h.f16764a.d()), H9);
            }
        } else {
            this.f16196h.f16764a.d().w().b("User property has no value, property", this.f16196h.f16764a.D().f(c1998g2.G()));
        }
        C2257s1 v9 = this.f16196h.f16764a.d().v();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        v9.b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f16175c = Boolean.TRUE;
        if (K8 && !bool.booleanValue()) {
            return true;
        }
        if (!z8 || this.f16195g.H()) {
            this.f16176d = bool;
        }
        if (bool.booleanValue() && z9 && c1998g2.U()) {
            long D8 = c1998g2.D();
            if (l8 != null) {
                D8 = l8.longValue();
            }
            if (B8 && this.f16195g.H() && !this.f16195g.J() && l9 != null) {
                D8 = l9.longValue();
            }
            if (this.f16195g.J()) {
                this.f16178f = Long.valueOf(D8);
            } else {
                this.f16177e = Long.valueOf(D8);
            }
        }
        return true;
    }
}
