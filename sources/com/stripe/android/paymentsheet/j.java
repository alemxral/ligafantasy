package com.stripe.android.paymentsheet;

import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface j {

    /* loaded from: classes4.dex */
    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3991f.b f26016a;

        public a(AbstractC3991f.b paymentSelection) {
            AbstractC3159y.i(paymentSelection, "paymentSelection");
            this.f26016a = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.q a() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.j
        public String b() {
            return d().getType();
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.p c() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC3991f.b d() {
            return this.f26016a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f26016a, ((a) obj).f26016a);
        }

        @Override // com.stripe.android.paymentsheet.j
        public String getType() {
            return d().getType();
        }

        public int hashCode() {
            return this.f26016a.hashCode();
        }

        public String toString() {
            return "External(paymentSelection=" + this.f26016a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3991f.e f26017a;

        public b(AbstractC3991f.e paymentSelection) {
            AbstractC3159y.i(paymentSelection, "paymentSelection");
            this.f26017a = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.q a() {
            return d().i();
        }

        @Override // com.stripe.android.paymentsheet.j
        public String b() {
            boolean z8;
            AbstractC3991f.e d8 = d();
            if (d8 instanceof AbstractC3991f.e.c) {
                return o.p.f24519i.f24537a;
            }
            boolean z9 = true;
            if (d8 instanceof AbstractC3991f.e.a) {
                z8 = true;
            } else {
                z8 = d8 instanceof AbstractC3991f.e.d;
            }
            if (!z8) {
                z9 = d8 instanceof AbstractC3991f.e.b;
            }
            if (z9) {
                return d().f().o();
            }
            throw new L5.p();
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.p c() {
            return d().f();
        }

        @Override // com.stripe.android.paymentsheet.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC3991f.e d() {
            return this.f26017a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f26017a, ((b) obj).f26017a);
        }

        @Override // com.stripe.android.paymentsheet.j
        public String getType() {
            return d().f().o();
        }

        public int hashCode() {
            return this.f26017a.hashCode();
        }

        public String toString() {
            return "New(paymentSelection=" + this.f26017a + ")";
        }
    }

    com.stripe.android.model.q a();

    String b();

    com.stripe.android.model.p c();

    AbstractC3991f d();

    String getType();
}
