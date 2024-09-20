package com.stripe.android.googlepaylauncher;

import L5.I;
import L5.t;
import X5.n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.model.o;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import i6.AbstractC2829k;
import i6.M;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final c f23905g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f23906h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final d f23907a;

    /* renamed from: b, reason: collision with root package name */
    private final e f23908b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f23909c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23910d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f23911e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23912f;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f23913a;

        /* renamed from: b, reason: collision with root package name */
        int f23914b;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object e8 = Q5.b.e();
            int i8 = this.f23914b;
            if (i8 != 0) {
                if (i8 == 1) {
                    eVar = (e) this.f23913a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                I2.g gVar = (I2.g) h.this.f23911e.invoke(h.this.f23907a.e());
                e eVar2 = h.this.f23908b;
                InterfaceC3358f isReady = gVar.isReady();
                this.f23913a = eVar2;
                this.f23914b = 1;
                obj = AbstractC3360h.u(isReady, this);
                if (obj == e8) {
                    return e8;
                }
                eVar = eVar2;
            }
            Boolean bool = (Boolean) obj;
            h.this.f23912f = bool.booleanValue();
            eVar.a(bool.booleanValue());
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(boolean z8);
    }

    /* loaded from: classes4.dex */
    public static abstract class f implements Parcelable {

        /* loaded from: classes4.dex */
        public static final class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f23931a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C0477a();

            /* renamed from: com.stripe.android.googlepaylauncher.h$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0477a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.readInt();
                    return a.f23931a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -299418266;
            }

            public String toString() {
                return "Canceled";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends f {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final o f23932a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(o.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f23932a = paymentMethod;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3159y.d(this.f23932a, ((b) obj).f23932a);
            }

            public int hashCode() {
                return this.f23932a.hashCode();
            }

            public String toString() {
                return "Completed(paymentMethod=" + this.f23932a + ")";
            }

            public final o v() {
                return this.f23932a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f23932a.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f23933a;

            /* renamed from: b, reason: collision with root package name */
            private final int f23934b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c((Throwable) parcel.readSerializable(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable error, int i8) {
                super(null);
                AbstractC3159y.i(error, "error");
                this.f23933a = error;
                this.f23934b = i8;
            }

            public final Throwable b() {
                return this.f23933a;
            }

            public final int c() {
                return this.f23934b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3159y.d(this.f23933a, cVar.f23933a) && this.f23934b == cVar.f23934b;
            }

            public int hashCode() {
                return (this.f23933a.hashCode() * 31) + this.f23934b;
            }

            public String toString() {
                return "Failed(error=" + this.f23933a + ", errorCode=" + this.f23934b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeSerializable(this.f23933a);
                out.writeInt(this.f23934b);
            }
        }

        private f() {
        }

        public /* synthetic */ f(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public h(M lifecycleScope, d config, e readyCallback, ActivityResultLauncher activityResultLauncher, boolean z8, Context context, Function1 googlePayRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3873c analyticsRequestExecutor) {
        AbstractC3159y.i(lifecycleScope, "lifecycleScope");
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(readyCallback, "readyCallback");
        AbstractC3159y.i(activityResultLauncher, "activityResultLauncher");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.f23907a = config;
        this.f23908b = readyCallback;
        this.f23909c = activityResultLauncher;
        this.f23910d = z8;
        this.f23911e = googlePayRepositoryFactory;
        analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.v(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.f24858y0, null, null, null, null, null, 62, null));
        if (!z8) {
            AbstractC2829k.d(lifecycleScope, null, null, new a(null), 3, null);
        }
    }

    public final void e(String currencyCode, long j8, String str, String str2) {
        AbstractC3159y.i(currencyCode, "currencyCode");
        if (!this.f23910d && !this.f23912f) {
            throw new IllegalStateException("present() may only be called when Google Pay is available on this device.".toString());
        }
        this.f23909c.launch(new GooglePayPaymentMethodLauncherContractV2.a(this.f23907a, currencyCode, j8, str2, str));
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f23916a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC0476b f23917b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f23918c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readInt() != 0, EnumC0476b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.stripe.android.googlepaylauncher.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0476b {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0476b f23919b = new EnumC0476b("Min", 0, "MIN");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0476b f23920c = new EnumC0476b("Full", 1, "FULL");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0476b[] f23921d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f23922e;

            /* renamed from: a, reason: collision with root package name */
            private final String f23923a;

            static {
                EnumC0476b[] a8 = a();
                f23921d = a8;
                f23922e = R5.b.a(a8);
            }

            private EnumC0476b(String str, int i8, String str2) {
                this.f23923a = str2;
            }

            private static final /* synthetic */ EnumC0476b[] a() {
                return new EnumC0476b[]{f23919b, f23920c};
            }

            public static EnumC0476b valueOf(String str) {
                return (EnumC0476b) Enum.valueOf(EnumC0476b.class, str);
            }

            public static EnumC0476b[] values() {
                return (EnumC0476b[]) f23921d.clone();
            }
        }

        public b(boolean z8, EnumC0476b format, boolean z9) {
            AbstractC3159y.i(format, "format");
            this.f23916a = z8;
            this.f23917b = format;
            this.f23918c = z9;
        }

        public final EnumC0476b b() {
            return this.f23917b;
        }

        public final boolean c() {
            return this.f23918c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f23916a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23916a == bVar.f23916a && this.f23917b == bVar.f23917b && this.f23918c == bVar.f23918c;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f23916a) * 31) + this.f23917b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23918c);
        }

        public String toString() {
            return "BillingAddressConfig(isRequired=" + this.f23916a + ", format=" + this.f23917b + ", isPhoneNumberRequired=" + this.f23918c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f23916a ? 1 : 0);
            out.writeString(this.f23917b.name());
            out.writeInt(this.f23918c ? 1 : 0);
        }

        public /* synthetic */ b(boolean z8, EnumC0476b enumC0476b, boolean z9, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? EnumC0476b.f23919b : enumC0476b, (i8 & 4) != 0 ? false : z9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final I2.d f23924a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23925b;

        /* renamed from: c, reason: collision with root package name */
        private final String f23926c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f23927d;

        /* renamed from: e, reason: collision with root package name */
        private b f23928e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f23929f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f23930g;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(I2.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(I2.d environment, String merchantCountryCode, String merchantName, boolean z8, b billingAddressConfig, boolean z9, boolean z10) {
            AbstractC3159y.i(environment, "environment");
            AbstractC3159y.i(merchantCountryCode, "merchantCountryCode");
            AbstractC3159y.i(merchantName, "merchantName");
            AbstractC3159y.i(billingAddressConfig, "billingAddressConfig");
            this.f23924a = environment;
            this.f23925b = merchantCountryCode;
            this.f23926c = merchantName;
            this.f23927d = z8;
            this.f23928e = billingAddressConfig;
            this.f23929f = z9;
            this.f23930g = z10;
        }

        public final boolean b() {
            return this.f23930g;
        }

        public final b c() {
            return this.f23928e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final I2.d e() {
            return this.f23924a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f23924a == dVar.f23924a && AbstractC3159y.d(this.f23925b, dVar.f23925b) && AbstractC3159y.d(this.f23926c, dVar.f23926c) && this.f23927d == dVar.f23927d && AbstractC3159y.d(this.f23928e, dVar.f23928e) && this.f23929f == dVar.f23929f && this.f23930g == dVar.f23930g;
        }

        public final boolean f() {
            return this.f23929f;
        }

        public int hashCode() {
            return (((((((((((this.f23924a.hashCode() * 31) + this.f23925b.hashCode()) * 31) + this.f23926c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23927d)) * 31) + this.f23928e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23929f)) * 31) + androidx.compose.foundation.a.a(this.f23930g);
        }

        public final String i() {
            return this.f23925b;
        }

        public final String j() {
            return this.f23926c;
        }

        public final boolean k() {
            return this.f23927d;
        }

        public final boolean n() {
            return g6.n.s(this.f23925b, Locale.JAPAN.getCountry(), true);
        }

        public String toString() {
            return "Config(environment=" + this.f23924a + ", merchantCountryCode=" + this.f23925b + ", merchantName=" + this.f23926c + ", isEmailRequired=" + this.f23927d + ", billingAddressConfig=" + this.f23928e + ", existingPaymentMethodRequired=" + this.f23929f + ", allowCreditCards=" + this.f23930g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f23924a.name());
            out.writeString(this.f23925b);
            out.writeString(this.f23926c);
            out.writeInt(this.f23927d ? 1 : 0);
            this.f23928e.writeToParcel(out, i8);
            out.writeInt(this.f23929f ? 1 : 0);
            out.writeInt(this.f23930g ? 1 : 0);
        }

        public /* synthetic */ d(I2.d dVar, String str, String str2, boolean z8, b bVar, boolean z9, boolean z10, int i8, AbstractC3151p abstractC3151p) {
            this(dVar, str, str2, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? new b(false, null, false, 7, null) : bVar, (i8 & 32) != 0 ? true : z9, (i8 & 64) != 0 ? true : z10);
        }
    }
}
