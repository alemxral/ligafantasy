package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.payments.bankaccount.navigation.d;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.payments.bankaccount.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0547a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final d f25117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0547a(d result) {
            super(null);
            AbstractC3159y.i(result, "result");
            this.f25117a = result;
        }

        public final d a() {
            return this.f25117a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0547a) && AbstractC3159y.d(this.f25117a, ((C0547a) obj).f25117a);
        }

        public int hashCode() {
            return this.f25117a.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.f25117a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final String f25118a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25119b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25120c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String publishableKey, String financialConnectionsSessionSecret, String str) {
            super(null);
            AbstractC3159y.i(publishableKey, "publishableKey");
            AbstractC3159y.i(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.f25118a = publishableKey;
            this.f25119b = financialConnectionsSessionSecret;
            this.f25120c = str;
        }

        public final String a() {
            return this.f25119b;
        }

        public final String b() {
            return this.f25118a;
        }

        public final String c() {
            return this.f25120c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f25118a, bVar.f25118a) && AbstractC3159y.d(this.f25119b, bVar.f25119b) && AbstractC3159y.d(this.f25120c, bVar.f25120c);
        }

        public int hashCode() {
            int hashCode = ((this.f25118a.hashCode() * 31) + this.f25119b.hashCode()) * 31;
            String str = this.f25120c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.f25118a + ", financialConnectionsSessionSecret=" + this.f25119b + ", stripeAccountId=" + this.f25120c + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3151p abstractC3151p) {
        this();
    }
}
