package com.stripe.android.model;

import M5.Q;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import w4.AbstractC3849b;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f24237a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24238b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24239c;

        public a(String clientSecret, String str, String str2) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            this.f24237a = clientSecret;
            this.f24238b = str;
            this.f24239c = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return AbstractC3849b.a(Q.k(L5.x.a("client_secret", this.f24237a), L5.x.a("hosted_surface", this.f24239c), L5.x.a("product", "instant_debits"), L5.x.a("attach_required", Boolean.TRUE), L5.x.a("payment_method_data", new p(o.p.f24518h, null, null, null, null, null, null, null, null, null, null, null, null, null, new o.e(null, this.f24238b, null, null, 13, null), null, null, null, null, 507902, null).y())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f24237a, aVar.f24237a) && AbstractC3159y.d(this.f24238b, aVar.f24238b) && AbstractC3159y.d(this.f24239c, aVar.f24239c);
        }

        public int hashCode() {
            int hashCode = this.f24237a.hashCode() * 31;
            String str = this.f24238b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24239c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(clientSecret=" + this.f24237a + ", customerEmailAddress=" + this.f24238b + ", hostedSurface=" + this.f24239c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f24240a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24241b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24242c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24243d;

        public b(String clientSecret, String customerName, String str, String str2) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(customerName, "customerName");
            this.f24240a = clientSecret;
            this.f24241b = customerName;
            this.f24242c = str;
            this.f24243d = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return AbstractC3849b.a(Q.k(L5.x.a("client_secret", this.f24240a), L5.x.a("hosted_surface", this.f24243d), L5.x.a("payment_method_data", p.e.n(p.f24568u, new o.e(null, this.f24242c, this.f24241b, null, 9, null), null, null, 6, null).y())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f24240a, bVar.f24240a) && AbstractC3159y.d(this.f24241b, bVar.f24241b) && AbstractC3159y.d(this.f24242c, bVar.f24242c) && AbstractC3159y.d(this.f24243d, bVar.f24243d);
        }

        public int hashCode() {
            int hashCode = ((this.f24240a.hashCode() * 31) + this.f24241b.hashCode()) * 31;
            String str = this.f24242c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24243d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(clientSecret=" + this.f24240a + ", customerName=" + this.f24241b + ", customerEmailAddress=" + this.f24242c + ", hostedSurface=" + this.f24243d + ")";
        }
    }

    Map a();
}
