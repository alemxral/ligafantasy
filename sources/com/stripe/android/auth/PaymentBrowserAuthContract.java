package com.stripe.android.auth;

import L5.p;
import L5.x;
import T3.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import f3.C2660a;
import f3.C2662c;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentBrowserAuthContract extends ActivityResultContract<a, C2662c> {

    /* renamed from: a */
    public static final b f23436a = new b(null);

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final a a(Intent intent) {
            AbstractC3159y.i(intent, "intent");
            return (a) intent.getParcelableExtra("extra_args");
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a */
    public Intent createIntent(Context context, a input) {
        boolean z8;
        Class cls;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        C2660a a8 = C2660a.f30995b.a(context);
        if (!input.f() && (input.I(a8) || input.L())) {
            z8 = true;
        } else {
            z8 = false;
        }
        Bundle Q8 = input.Q();
        if (z8) {
            cls = StripeBrowserLauncherActivity.class;
        } else if (!z8) {
            cls = PaymentAuthWebViewActivity.class;
        } else {
            throw new p();
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtras(Q8);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b */
    public C2662c parseResult(int i8, Intent intent) {
        C2662c c2662c;
        if (intent != null) {
            c2662c = (C2662c) intent.getParcelableExtra("extra_args");
        } else {
            c2662c = null;
        }
        if (c2662c == null) {
            return new C2662c(null, 0, null, false, null, null, null, 127, null);
        }
        return c2662c;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final C0451a CREATOR = new C0451a(null);

        /* renamed from: p */
        public static final int f23437p = 8;

        /* renamed from: a */
        private final String f23438a;

        /* renamed from: b */
        private final int f23439b;

        /* renamed from: c */
        private final String f23440c;

        /* renamed from: d */
        private final String f23441d;

        /* renamed from: e */
        private final String f23442e;

        /* renamed from: f */
        private final boolean f23443f;

        /* renamed from: g */
        private final k f23444g;

        /* renamed from: h */
        private final String f23445h;

        /* renamed from: i */
        private final boolean f23446i;

        /* renamed from: j */
        private final boolean f23447j;

        /* renamed from: k */
        private final Integer f23448k;

        /* renamed from: l */
        private final String f23449l;

        /* renamed from: m */
        private final boolean f23450m;

        /* renamed from: n */
        private final String f23451n;

        /* renamed from: o */
        private final boolean f23452o;

        /* renamed from: com.stripe.android.auth.PaymentBrowserAuthContract$a$a */
        /* loaded from: classes4.dex */
        public static final class C0451a implements Parcelable.Creator {
            private C0451a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public a[] newArray(int i8) {
                return new a[i8];
            }

            public /* synthetic */ C0451a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public a(String objectId, int i8, String clientSecret, String url, String str, boolean z8, k kVar, String str2, boolean z9, boolean z10, Integer num, String publishableKey, boolean z11, String str3, boolean z12) {
            AbstractC3159y.i(objectId, "objectId");
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(url, "url");
            AbstractC3159y.i(publishableKey, "publishableKey");
            this.f23438a = objectId;
            this.f23439b = i8;
            this.f23440c = clientSecret;
            this.f23441d = url;
            this.f23442e = str;
            this.f23443f = z8;
            this.f23444g = kVar;
            this.f23445h = str2;
            this.f23446i = z9;
            this.f23447j = z10;
            this.f23448k = num;
            this.f23449l = publishableKey;
            this.f23450m = z11;
            this.f23451n = str3;
            this.f23452o = z12;
        }

        public static /* synthetic */ a c(a aVar, String str, int i8, String str2, String str3, String str4, boolean z8, k kVar, String str5, boolean z9, boolean z10, Integer num, String str6, boolean z11, String str7, boolean z12, int i9, Object obj) {
            String str8;
            int i10;
            String str9;
            String str10;
            String str11;
            boolean z13;
            k kVar2;
            String str12;
            boolean z14;
            boolean z15;
            Integer num2;
            String str13;
            boolean z16;
            String str14;
            boolean z17;
            if ((i9 & 1) != 0) {
                str8 = aVar.f23438a;
            } else {
                str8 = str;
            }
            if ((i9 & 2) != 0) {
                i10 = aVar.f23439b;
            } else {
                i10 = i8;
            }
            if ((i9 & 4) != 0) {
                str9 = aVar.f23440c;
            } else {
                str9 = str2;
            }
            if ((i9 & 8) != 0) {
                str10 = aVar.f23441d;
            } else {
                str10 = str3;
            }
            if ((i9 & 16) != 0) {
                str11 = aVar.f23442e;
            } else {
                str11 = str4;
            }
            if ((i9 & 32) != 0) {
                z13 = aVar.f23443f;
            } else {
                z13 = z8;
            }
            if ((i9 & 64) != 0) {
                kVar2 = aVar.f23444g;
            } else {
                kVar2 = kVar;
            }
            if ((i9 & 128) != 0) {
                str12 = aVar.f23445h;
            } else {
                str12 = str5;
            }
            if ((i9 & 256) != 0) {
                z14 = aVar.f23446i;
            } else {
                z14 = z9;
            }
            if ((i9 & 512) != 0) {
                z15 = aVar.f23447j;
            } else {
                z15 = z10;
            }
            if ((i9 & 1024) != 0) {
                num2 = aVar.f23448k;
            } else {
                num2 = num;
            }
            if ((i9 & 2048) != 0) {
                str13 = aVar.f23449l;
            } else {
                str13 = str6;
            }
            if ((i9 & 4096) != 0) {
                z16 = aVar.f23450m;
            } else {
                z16 = z11;
            }
            if ((i9 & 8192) != 0) {
                str14 = aVar.f23451n;
            } else {
                str14 = str7;
            }
            if ((i9 & 16384) != 0) {
                z17 = aVar.f23452o;
            } else {
                z17 = z12;
            }
            return aVar.b(str8, i10, str9, str10, str11, z13, kVar2, str12, z14, z15, num2, str13, z16, str14, z17);
        }

        public final String G() {
            return this.f23441d;
        }

        public final boolean I(C2660a defaultReturnUrl) {
            AbstractC3159y.i(defaultReturnUrl, "defaultReturnUrl");
            return AbstractC3159y.d(this.f23442e, defaultReturnUrl.a());
        }

        public final boolean L() {
            return this.f23450m;
        }

        public final Bundle Q() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public final a b(String objectId, int i8, String clientSecret, String url, String str, boolean z8, k kVar, String str2, boolean z9, boolean z10, Integer num, String publishableKey, boolean z11, String str3, boolean z12) {
            AbstractC3159y.i(objectId, "objectId");
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(url, "url");
            AbstractC3159y.i(publishableKey, "publishableKey");
            return new a(objectId, i8, clientSecret, url, str, z8, kVar, str2, z9, z10, num, publishableKey, z11, str3, z12);
        }

        public final String d() {
            return this.f23440c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f23443f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f23438a, aVar.f23438a) && this.f23439b == aVar.f23439b && AbstractC3159y.d(this.f23440c, aVar.f23440c) && AbstractC3159y.d(this.f23441d, aVar.f23441d) && AbstractC3159y.d(this.f23442e, aVar.f23442e) && this.f23443f == aVar.f23443f && AbstractC3159y.d(this.f23444g, aVar.f23444g) && AbstractC3159y.d(this.f23445h, aVar.f23445h) && this.f23446i == aVar.f23446i && this.f23447j == aVar.f23447j && AbstractC3159y.d(this.f23448k, aVar.f23448k) && AbstractC3159y.d(this.f23449l, aVar.f23449l) && this.f23450m == aVar.f23450m && AbstractC3159y.d(this.f23451n, aVar.f23451n) && this.f23452o == aVar.f23452o;
        }

        public final boolean f() {
            return this.f23452o;
        }

        public int hashCode() {
            int hashCode = ((((((this.f23438a.hashCode() * 31) + this.f23439b) * 31) + this.f23440c.hashCode()) * 31) + this.f23441d.hashCode()) * 31;
            String str = this.f23442e;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23443f)) * 31;
            k kVar = this.f23444g;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            String str2 = this.f23445h;
            int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f23446i)) * 31) + androidx.compose.foundation.a.a(this.f23447j)) * 31;
            Integer num = this.f23448k;
            int hashCode5 = (((((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.f23449l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23450m)) * 31;
            String str3 = this.f23451n;
            return ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f23452o);
        }

        public final String i() {
            return this.f23449l;
        }

        public final String j() {
            return this.f23451n;
        }

        public final int k() {
            return this.f23439b;
        }

        public final boolean n() {
            return this.f23447j;
        }

        public final boolean o() {
            return this.f23446i;
        }

        public final Integer s() {
            return this.f23448k;
        }

        public String toString() {
            return "Args(objectId=" + this.f23438a + ", requestCode=" + this.f23439b + ", clientSecret=" + this.f23440c + ", url=" + this.f23441d + ", returnUrl=" + this.f23442e + ", enableLogging=" + this.f23443f + ", toolbarCustomization=" + this.f23444g + ", stripeAccountId=" + this.f23445h + ", shouldCancelSource=" + this.f23446i + ", shouldCancelIntentOnUserNavigation=" + this.f23447j + ", statusBarColor=" + this.f23448k + ", publishableKey=" + this.f23449l + ", isInstantApp=" + this.f23450m + ", referrer=" + this.f23451n + ", forceInAppWebView=" + this.f23452o + ")";
        }

        public final String u() {
            return this.f23445h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            AbstractC3159y.i(parcel, "parcel");
            parcel.writeString(this.f23438a);
            parcel.writeInt(this.f23439b);
            parcel.writeString(this.f23440c);
            parcel.writeString(this.f23441d);
            parcel.writeString(this.f23442e);
            parcel.writeByte(this.f23443f ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f23444g, i8);
            parcel.writeString(this.f23445h);
            parcel.writeByte(this.f23446i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f23447j ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.f23448k);
            parcel.writeString(this.f23449l);
            parcel.writeByte(this.f23450m ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f23451n);
            parcel.writeByte(this.f23452o ? (byte) 1 : (byte) 0);
        }

        public final String x() {
            return this.f23442e;
        }

        public final k z() {
            return this.f23444g;
        }

        public /* synthetic */ a(String str, int i8, String str2, String str3, String str4, boolean z8, k kVar, String str5, boolean z9, boolean z10, Integer num, String str6, boolean z11, String str7, boolean z12, int i9, AbstractC3151p abstractC3151p) {
            this(str, i8, str2, str3, (i9 & 16) != 0 ? null : str4, (i9 & 32) != 0 ? false : z8, (i9 & 64) != 0 ? null : kVar, (i9 & 128) != 0 ? null : str5, (i9 & 256) != 0 ? false : z9, (i9 & 512) != 0 ? true : z10, num, str6, z11, (i9 & 8192) != 0 ? null : str7, (i9 & 16384) != 0 ? false : z12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.os.Parcel r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "parcel"
                kotlin.jvm.internal.AbstractC3159y.i(r0, r1)
                java.lang.String r1 = r20.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L11
                r4 = r2
                goto L12
            L11:
                r4 = r1
            L12:
                int r5 = r20.readInt()
                java.lang.String r1 = r20.readString()
                if (r1 != 0) goto L1e
                r6 = r2
                goto L1f
            L1e:
                r6 = r1
            L1f:
                java.lang.String r1 = r20.readString()
                if (r1 != 0) goto L27
                r7 = r2
                goto L28
            L27:
                r7 = r1
            L28:
                java.lang.String r8 = r20.readString()
                byte r1 = r20.readByte()
                r3 = 0
                r9 = 1
                if (r1 == 0) goto L36
                r1 = 1
                goto L37
            L36:
                r1 = 0
            L37:
                java.lang.Class<T3.k> r10 = T3.k.class
                java.lang.ClassLoader r10 = r10.getClassLoader()
                android.os.Parcelable r10 = r0.readParcelable(r10)
                T3.k r10 = (T3.k) r10
                java.lang.String r11 = r20.readString()
                byte r12 = r20.readByte()
                if (r12 == 0) goto L4f
                r12 = 1
                goto L50
            L4f:
                r12 = 0
            L50:
                byte r13 = r20.readByte()
                if (r13 == 0) goto L58
                r13 = 1
                goto L59
            L58:
                r13 = 0
            L59:
                java.lang.Class r14 = java.lang.Integer.TYPE
                java.lang.ClassLoader r14 = r14.getClassLoader()
                java.lang.Object r14 = r0.readValue(r14)
                boolean r15 = r14 instanceof java.lang.Integer
                if (r15 == 0) goto L6a
                java.lang.Integer r14 = (java.lang.Integer) r14
                goto L6b
            L6a:
                r14 = 0
            L6b:
                java.lang.String r15 = r20.readString()
                if (r15 != 0) goto L72
                r15 = r2
            L72:
                byte r2 = r20.readByte()
                if (r2 == 0) goto L7b
                r16 = 1
                goto L7d
            L7b:
                r16 = 0
            L7d:
                java.lang.String r17 = r20.readString()
                byte r0 = r20.readByte()
                if (r0 == 0) goto L8a
                r18 = 1
                goto L8c
            L8a:
                r18 = 0
            L8c:
                r3 = r19
                r9 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.auth.PaymentBrowserAuthContract.a.<init>(android.os.Parcel):void");
        }
    }
}
