package com.stripe.android.payments.core.authentication.threeds2;

import X3.q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.x;
import f3.C2662c;
import j2.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.j;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class Stripe3ds2TransactionContract extends ActivityResultContract<a, C2662c> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final q f25179a;

        /* renamed from: b, reason: collision with root package name */
        private final p.c f25180b;

        /* renamed from: c, reason: collision with root package name */
        private final StripeIntent f25181c;

        /* renamed from: d, reason: collision with root package name */
        private final StripeIntent.a.j.b f25182d;

        /* renamed from: e, reason: collision with root package name */
        private final j.c f25183e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f25184f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f25185g;

        /* renamed from: h, reason: collision with root package name */
        private final String f25186h;

        /* renamed from: i, reason: collision with root package name */
        private final Set f25187i;

        /* renamed from: j, reason: collision with root package name */
        public static final C0549a f25177j = new C0549a(null);

        /* renamed from: k, reason: collision with root package name */
        public static final int f25178k = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0549a {
            private C0549a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0549a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                q qVar = (q) parcel.readParcelable(a.class.getClassLoader());
                p.c createFromParcel = p.c.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(a.class.getClassLoader());
                StripeIntent.a.j.b createFromParcel2 = StripeIntent.a.j.b.CREATOR.createFromParcel(parcel);
                j.c cVar = (j.c) parcel.readParcelable(a.class.getClassLoader());
                boolean z8 = parcel.readInt() != 0;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(qVar, createFromParcel, stripeIntent, createFromParcel2, cVar, z8, valueOf, readString, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(q sdkTransactionId, p.c config, StripeIntent stripeIntent, StripeIntent.a.j.b nextActionData, j.c requestOptions, boolean z8, Integer num, String publishableKey, Set productUsage) {
            AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
            AbstractC3159y.i(config, "config");
            AbstractC3159y.i(stripeIntent, "stripeIntent");
            AbstractC3159y.i(nextActionData, "nextActionData");
            AbstractC3159y.i(requestOptions, "requestOptions");
            AbstractC3159y.i(publishableKey, "publishableKey");
            AbstractC3159y.i(productUsage, "productUsage");
            this.f25179a = sdkTransactionId;
            this.f25180b = config;
            this.f25181c = stripeIntent;
            this.f25182d = nextActionData;
            this.f25183e = requestOptions;
            this.f25184f = z8;
            this.f25185g = num;
            this.f25186h = publishableKey;
            this.f25187i = productUsage;
        }

        public final p.c b() {
            return this.f25180b;
        }

        public final boolean c() {
            return this.f25184f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final x e() {
            return new x(this.f25182d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f25179a, aVar.f25179a) && AbstractC3159y.d(this.f25180b, aVar.f25180b) && AbstractC3159y.d(this.f25181c, aVar.f25181c) && AbstractC3159y.d(this.f25182d, aVar.f25182d) && AbstractC3159y.d(this.f25183e, aVar.f25183e) && this.f25184f == aVar.f25184f && AbstractC3159y.d(this.f25185g, aVar.f25185g) && AbstractC3159y.d(this.f25186h, aVar.f25186h) && AbstractC3159y.d(this.f25187i, aVar.f25187i);
        }

        public final StripeIntent.a.j.b f() {
            return this.f25182d;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f25179a.hashCode() * 31) + this.f25180b.hashCode()) * 31) + this.f25181c.hashCode()) * 31) + this.f25182d.hashCode()) * 31) + this.f25183e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25184f)) * 31;
            Integer num = this.f25185g;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f25186h.hashCode()) * 31) + this.f25187i.hashCode();
        }

        public final Set i() {
            return this.f25187i;
        }

        public final String j() {
            return this.f25186h;
        }

        public final j.c k() {
            return this.f25183e;
        }

        public final q n() {
            return this.f25179a;
        }

        public final Integer o() {
            return this.f25185g;
        }

        public final StripeIntent s() {
            return this.f25181c;
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.f25179a + ", config=" + this.f25180b + ", stripeIntent=" + this.f25181c + ", nextActionData=" + this.f25182d + ", requestOptions=" + this.f25183e + ", enableLogging=" + this.f25184f + ", statusBarColor=" + this.f25185g + ", publishableKey=" + this.f25186h + ", productUsage=" + this.f25187i + ")";
        }

        public final Bundle u() {
            return BundleKt.bundleOf(L5.x.a("extra_args", this));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25179a, i8);
            this.f25180b.writeToParcel(out, i8);
            out.writeParcelable(this.f25181c, i8);
            this.f25182d.writeToParcel(out, i8);
            out.writeParcelable(this.f25183e, i8);
            out.writeInt(this.f25184f ? 1 : 0);
            Integer num = this.f25185g;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.f25186h);
            Set set = this.f25187i;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(input.u());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2662c parseResult(int i8, Intent intent) {
        return C2662c.f30998h.b(intent);
    }
}
