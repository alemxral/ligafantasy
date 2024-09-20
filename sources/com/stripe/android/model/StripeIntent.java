package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import b3.M;
import b3.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface StripeIntent extends v2.f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class NextActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24118b;

        /* renamed from: c, reason: collision with root package name */
        public static final NextActionType f24119c = new NextActionType("RedirectToUrl", 0, "redirect_to_url");

        /* renamed from: d, reason: collision with root package name */
        public static final NextActionType f24120d = new NextActionType("UseStripeSdk", 1, "use_stripe_sdk");

        /* renamed from: e, reason: collision with root package name */
        public static final NextActionType f24121e = new NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");

        /* renamed from: f, reason: collision with root package name */
        public static final NextActionType f24122f = new NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");

        /* renamed from: g, reason: collision with root package name */
        public static final NextActionType f24123g = new NextActionType("BlikAuthorize", 4, "blik_authorize");

        /* renamed from: h, reason: collision with root package name */
        public static final NextActionType f24124h = new NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");

        /* renamed from: i, reason: collision with root package name */
        public static final NextActionType f24125i = new NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");

        /* renamed from: j, reason: collision with root package name */
        public static final NextActionType f24126j = new NextActionType("UpiAwaitNotification", 7, "upi_await_notification");

        /* renamed from: k, reason: collision with root package name */
        public static final NextActionType f24127k = new NextActionType("CashAppRedirect", 8, "cashapp_handle_redirect_or_display_qr_code");

        /* renamed from: l, reason: collision with root package name */
        public static final NextActionType f24128l = new NextActionType("DisplayBoletoDetails", 9, "boleto_display_details");

        /* renamed from: m, reason: collision with root package name */
        public static final NextActionType f24129m = new NextActionType("DisplayKonbiniDetails", 10, "konbini_display_details");

        /* renamed from: n, reason: collision with root package name */
        public static final NextActionType f24130n = new NextActionType("DisplayMultibancoDetails", 11, "multibanco_display_details");

        /* renamed from: o, reason: collision with root package name */
        public static final NextActionType f24131o = new NextActionType("SwishRedirect", 12, "swish_handle_redirect_or_display_qr_code");

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ NextActionType[] f24132p;

        /* renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24133q;

        /* renamed from: a, reason: collision with root package name */
        private final String f24134a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final NextActionType a(String str) {
                Object obj;
                Iterator<E> it = NextActionType.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((NextActionType) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (NextActionType) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            NextActionType[] a8 = a();
            f24132p = a8;
            f24133q = R5.b.a(a8);
            f24118b = new a(null);
        }

        private NextActionType(String str, int i8, String str2) {
            this.f24134a = str2;
        }

        private static final /* synthetic */ NextActionType[] a() {
            return new NextActionType[]{f24119c, f24120d, f24121e, f24122f, f24123g, f24124h, f24125i, f24126j, f24127k, f24128l, f24129m, f24130n, f24131o};
        }

        public static R5.a c() {
            return f24133q;
        }

        public static NextActionType valueOf(String str) {
            return (NextActionType) Enum.valueOf(NextActionType.class, str);
        }

        public static NextActionType[] values() {
            return (NextActionType[]) f24132p.clone();
        }

        public final String b() {
            return this.f24134a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24134a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24135b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f24136c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f24137d = new Status("Processing", 1, "processing");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f24138e = new Status("RequiresAction", 2, "requires_action");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f24139f = new Status("RequiresConfirmation", 3, "requires_confirmation");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f24140g = new Status("RequiresPaymentMethod", 4, "requires_payment_method");

        /* renamed from: h, reason: collision with root package name */
        public static final Status f24141h = new Status("Succeeded", 5, "succeeded");

        /* renamed from: i, reason: collision with root package name */
        public static final Status f24142i = new Status("RequiresCapture", 6, "requires_capture");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ Status[] f24143j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24144k;

        /* renamed from: a, reason: collision with root package name */
        private final String f24145a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Status a(String str) {
                Object obj;
                Iterator<E> it = Status.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((Status) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Status[] a8 = a();
            f24143j = a8;
            f24144k = R5.b.a(a8);
            f24135b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f24145a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f24136c, f24137d, f24138e, f24139f, f24140g, f24141h, f24142i};
        }

        public static R5.a c() {
            return f24144k;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f24143j.clone();
        }

        public final String b() {
            return this.f24145a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24145a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24146b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f24147c = new Usage("OnSession", 0, "on_session");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f24148d = new Usage("OffSession", 1, "off_session");

        /* renamed from: e, reason: collision with root package name */
        public static final Usage f24149e = new Usage("OneTime", 2, "one_time");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f24150f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24151g;

        /* renamed from: a, reason: collision with root package name */
        private final String f24152a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Usage a(String str) {
                Object obj;
                Iterator<E> it = Usage.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((Usage) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Usage) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Usage[] a8 = a();
            f24150f = a8;
            f24151g = R5.b.a(a8);
            f24146b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f24152a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f24147c, f24148d, f24149e};
        }

        public static R5.a c() {
            return f24151g;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f24150f.clone();
        }

        public final String b() {
            return this.f24152a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24152a;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a implements v2.f {

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f24159a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0482a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0482a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.readInt();
                    return b.f24159a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            private b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1031794127;
            }

            public String toString() {
                return "BlikAuthorize";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0483a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24160a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0483a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String mobileAuthUrl) {
                super(null);
                AbstractC3159y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f24160a = mobileAuthUrl;
            }

            public final String c() {
                return this.f24160a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3159y.d(this.f24160a, ((c) obj).f24160a);
            }

            public int hashCode() {
                return this.f24160a.hashCode();
            }

            public String toString() {
                return "CashAppRedirect(mobileAuthUrl=" + this.f24160a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24160a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a implements h {
            public static final Parcelable.Creator<d> CREATOR = new C0484a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24161a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0484a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new d(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(String str) {
                super(null);
                this.f24161a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24161a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC3159y.d(this.f24161a, ((d) obj).f24161a);
            }

            public int hashCode() {
                String str = this.f24161a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayBoletoDetails(hostedVoucherUrl=" + this.f24161a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24161a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a implements h {
            public static final Parcelable.Creator<e> CREATOR = new C0485a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24162a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0485a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new e(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            public e(String str) {
                super(null);
                this.f24162a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24162a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC3159y.d(this.f24162a, ((e) obj).f24162a);
            }

            public int hashCode() {
                String str = this.f24162a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayKonbiniDetails(hostedVoucherUrl=" + this.f24162a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24162a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a implements h {
            public static final Parcelable.Creator<f> CREATOR = new C0486a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24163a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$f$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0486a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new f(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i8) {
                    return new f[i8];
                }
            }

            public f(String str) {
                super(null);
                this.f24163a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24163a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC3159y.d(this.f24163a, ((f) obj).f24163a);
            }

            public int hashCode() {
                String str = this.f24163a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayMultibancoDetails(hostedVoucherUrl=" + this.f24163a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24163a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a implements h {
            public static final Parcelable.Creator<g> CREATOR = new C0487a();

            /* renamed from: a, reason: collision with root package name */
            private final int f24164a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24165b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24166c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$g$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0487a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new g(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i8) {
                    return new g[i8];
                }
            }

            public g(int i8, String str, String str2) {
                super(null);
                this.f24164a = i8;
                this.f24165b = str;
                this.f24166c = str2;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24166c;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f24164a == gVar.f24164a && AbstractC3159y.d(this.f24165b, gVar.f24165b) && AbstractC3159y.d(this.f24166c, gVar.f24166c);
            }

            public int hashCode() {
                int i8 = this.f24164a * 31;
                String str = this.f24165b;
                int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f24166c;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.f24164a + ", number=" + this.f24165b + ", hostedVoucherUrl=" + this.f24166c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24164a);
                out.writeString(this.f24165b);
                out.writeString(this.f24166c);
            }
        }

        /* loaded from: classes4.dex */
        public interface h {
            String b();
        }

        /* loaded from: classes4.dex */
        public static final class i extends a {
            public static final Parcelable.Creator<i> CREATOR = new C0488a();

            /* renamed from: a, reason: collision with root package name */
            private final Uri f24167a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24168b;

            /* renamed from: com.stripe.android.model.StripeIntent$a$i$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0488a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new i((Uri) parcel.readParcelable(i.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final i[] newArray(int i8) {
                    return new i[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Uri url, String str) {
                super(null);
                AbstractC3159y.i(url, "url");
                this.f24167a = url;
                this.f24168b = str;
            }

            public final Uri c() {
                return this.f24167a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return AbstractC3159y.d(this.f24167a, iVar.f24167a) && AbstractC3159y.d(this.f24168b, iVar.f24168b);
            }

            public int hashCode() {
                int hashCode = this.f24167a.hashCode() * 31;
                String str = this.f24168b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.f24167a + ", returnUrl=" + this.f24168b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f24167a, i8);
                out.writeString(this.f24168b);
            }

            public final String x() {
                return this.f24168b;
            }
        }

        /* loaded from: classes4.dex */
        public static abstract class j extends a {

            /* renamed from: com.stripe.android.model.StripeIntent$a$j$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0489a extends j {
                public static final Parcelable.Creator<C0489a> CREATOR = new C0490a();

                /* renamed from: a, reason: collision with root package name */
                private final String f24169a;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0490a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final C0489a createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new C0489a(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final C0489a[] newArray(int i8) {
                        return new C0489a[i8];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0489a(String url) {
                    super(null);
                    AbstractC3159y.i(url, "url");
                    this.f24169a = url;
                }

                public final String c() {
                    return this.f24169a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0489a) && AbstractC3159y.d(this.f24169a, ((C0489a) obj).f24169a);
                }

                public int hashCode() {
                    return this.f24169a.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.f24169a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f24169a);
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends j {
                public static final Parcelable.Creator<b> CREATOR = new C0491a();

                /* renamed from: a, reason: collision with root package name */
                private final String f24170a;

                /* renamed from: b, reason: collision with root package name */
                private final String f24171b;

                /* renamed from: c, reason: collision with root package name */
                private final String f24172c;

                /* renamed from: d, reason: collision with root package name */
                private final C0492b f24173d;

                /* renamed from: e, reason: collision with root package name */
                private final String f24174e;

                /* renamed from: f, reason: collision with root package name */
                private final String f24175f;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0491a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new b(parcel.readString(), parcel.readString(), parcel.readString(), C0492b.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0492b implements Parcelable {
                    public static final Parcelable.Creator<C0492b> CREATOR = new C0493a();

                    /* renamed from: a, reason: collision with root package name */
                    private final String f24176a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f24177b;

                    /* renamed from: c, reason: collision with root package name */
                    private final List f24178c;

                    /* renamed from: d, reason: collision with root package name */
                    private final String f24179d;

                    /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0493a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0492b createFromParcel(Parcel parcel) {
                            AbstractC3159y.i(parcel, "parcel");
                            return new C0492b(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0492b[] newArray(int i8) {
                            return new C0492b[i8];
                        }
                    }

                    public C0492b(String directoryServerId, String dsCertificateData, List rootCertsData, String str) {
                        AbstractC3159y.i(directoryServerId, "directoryServerId");
                        AbstractC3159y.i(dsCertificateData, "dsCertificateData");
                        AbstractC3159y.i(rootCertsData, "rootCertsData");
                        this.f24176a = directoryServerId;
                        this.f24177b = dsCertificateData;
                        this.f24178c = rootCertsData;
                        this.f24179d = str;
                    }

                    public final String b() {
                        return this.f24176a;
                    }

                    public final String c() {
                        return this.f24177b;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public final String e() {
                        return this.f24179d;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0492b)) {
                            return false;
                        }
                        C0492b c0492b = (C0492b) obj;
                        return AbstractC3159y.d(this.f24176a, c0492b.f24176a) && AbstractC3159y.d(this.f24177b, c0492b.f24177b) && AbstractC3159y.d(this.f24178c, c0492b.f24178c) && AbstractC3159y.d(this.f24179d, c0492b.f24179d);
                    }

                    public final List f() {
                        return this.f24178c;
                    }

                    public int hashCode() {
                        int hashCode = ((((this.f24176a.hashCode() * 31) + this.f24177b.hashCode()) * 31) + this.f24178c.hashCode()) * 31;
                        String str = this.f24179d;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.f24176a + ", dsCertificateData=" + this.f24177b + ", rootCertsData=" + this.f24178c + ", keyId=" + this.f24179d + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3159y.i(out, "out");
                        out.writeString(this.f24176a);
                        out.writeString(this.f24177b);
                        out.writeStringList(this.f24178c);
                        out.writeString(this.f24179d);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String source, String serverName, String transactionId, C0492b serverEncryption, String str, String str2) {
                    super(null);
                    AbstractC3159y.i(source, "source");
                    AbstractC3159y.i(serverName, "serverName");
                    AbstractC3159y.i(transactionId, "transactionId");
                    AbstractC3159y.i(serverEncryption, "serverEncryption");
                    this.f24170a = source;
                    this.f24171b = serverName;
                    this.f24172c = transactionId;
                    this.f24173d = serverEncryption;
                    this.f24174e = str;
                    this.f24175f = str2;
                }

                public final String c() {
                    return this.f24175f;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final C0492b e() {
                    return this.f24173d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return AbstractC3159y.d(this.f24170a, bVar.f24170a) && AbstractC3159y.d(this.f24171b, bVar.f24171b) && AbstractC3159y.d(this.f24172c, bVar.f24172c) && AbstractC3159y.d(this.f24173d, bVar.f24173d) && AbstractC3159y.d(this.f24174e, bVar.f24174e) && AbstractC3159y.d(this.f24175f, bVar.f24175f);
                }

                public final String f() {
                    return this.f24171b;
                }

                public int hashCode() {
                    int hashCode = ((((((this.f24170a.hashCode() * 31) + this.f24171b.hashCode()) * 31) + this.f24172c.hashCode()) * 31) + this.f24173d.hashCode()) * 31;
                    String str = this.f24174e;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f24175f;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String i() {
                    return this.f24170a;
                }

                public final String j() {
                    return this.f24174e;
                }

                public final String k() {
                    return this.f24172c;
                }

                public String toString() {
                    return "Use3DS2(source=" + this.f24170a + ", serverName=" + this.f24171b + ", transactionId=" + this.f24172c + ", serverEncryption=" + this.f24173d + ", threeDS2IntentId=" + this.f24174e + ", publishableKey=" + this.f24175f + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f24170a);
                    out.writeString(this.f24171b);
                    out.writeString(this.f24172c);
                    this.f24173d.writeToParcel(out, i8);
                    out.writeString(this.f24174e);
                    out.writeString(this.f24175f);
                }
            }

            public /* synthetic */ j(AbstractC3151p abstractC3151p) {
                this();
            }

            private j() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class k extends a {
            public static final Parcelable.Creator<k> CREATOR = new C0494a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24180a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$k$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0494a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new k(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final k[] newArray(int i8) {
                    return new k[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String mobileAuthUrl) {
                super(null);
                AbstractC3159y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f24180a = mobileAuthUrl;
            }

            public final String c() {
                return this.f24180a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && AbstractC3159y.d(this.f24180a, ((k) obj).f24180a);
            }

            public int hashCode() {
                return this.f24180a.hashCode();
            }

            public String toString() {
                return "SwishRedirect(mobileAuthUrl=" + this.f24180a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24180a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f24181a = new l();
            public static final Parcelable.Creator<l> CREATOR = new C0495a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$l$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0495a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.readInt();
                    return l.f24181a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final l[] newArray(int i8) {
                    return new l[i8];
                }
            }

            private l() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public int hashCode() {
                return -1021414879;
            }

            public String toString() {
                return "UpiAwaitNotification";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class m extends a {
            public static final Parcelable.Creator<m> CREATOR = new C0496a();

            /* renamed from: a, reason: collision with root package name */
            private final long f24182a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24183b;

            /* renamed from: c, reason: collision with root package name */
            private final z f24184c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$m$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0496a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new m(parcel.readLong(), parcel.readString(), z.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final m[] newArray(int i8) {
                    return new m[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(long j8, String hostedVerificationUrl, z microdepositType) {
                super(null);
                AbstractC3159y.i(hostedVerificationUrl, "hostedVerificationUrl");
                AbstractC3159y.i(microdepositType, "microdepositType");
                this.f24182a = j8;
                this.f24183b = hostedVerificationUrl;
                this.f24184c = microdepositType;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return this.f24182a == mVar.f24182a && AbstractC3159y.d(this.f24183b, mVar.f24183b) && this.f24184c == mVar.f24184c;
            }

            public int hashCode() {
                return (((androidx.collection.a.a(this.f24182a) * 31) + this.f24183b.hashCode()) * 31) + this.f24184c.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.f24182a + ", hostedVerificationUrl=" + this.f24183b + ", microdepositType=" + this.f24184c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeLong(this.f24182a);
                out.writeString(this.f24183b);
                out.writeString(this.f24184c.name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class n extends a {
            public static final Parcelable.Creator<n> CREATOR = new C0497a();

            /* renamed from: a, reason: collision with root package name */
            private final M f24185a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$n$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0497a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final n createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new n(M.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final n[] newArray(int i8) {
                    return new n[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(M weChat) {
                super(null);
                AbstractC3159y.i(weChat, "weChat");
                this.f24185a = weChat;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && AbstractC3159y.d(this.f24185a, ((n) obj).f24185a);
            }

            public int hashCode() {
                return this.f24185a.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.f24185a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f24185a.writeToParcel(out, i8);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }

        /* renamed from: com.stripe.android.model.StripeIntent$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0480a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f24155a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24156b;

            /* renamed from: c, reason: collision with root package name */
            private final Uri f24157c;

            /* renamed from: d, reason: collision with root package name */
            private final String f24158d;

            /* renamed from: e, reason: collision with root package name */
            private static final C0481a f24153e = new C0481a(null);

            /* renamed from: f, reason: collision with root package name */
            public static final int f24154f = 8;
            public static final Parcelable.Creator<C0480a> CREATOR = new b();

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0481a {
                private C0481a() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.String b(java.lang.String r4) {
                    /*
                        r3 = this;
                        r0 = 0
                        L5.s$a r1 = L5.s.f6498b     // Catch: java.lang.Throwable -> L2e
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                        r1.<init>()     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r2 = "alipay://url?"
                        r1.append(r2)     // Catch: java.lang.Throwable -> L2e
                        r1.append(r4)     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2e
                        android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r1 = "return_url"
                        java.lang.String r4 = r4.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L2e
                        if (r4 == 0) goto L2c
                        w4.c r1 = w4.C3850c.f39032a     // Catch: java.lang.Throwable -> L2e
                        kotlin.jvm.internal.AbstractC3159y.f(r4)     // Catch: java.lang.Throwable -> L2e
                        boolean r1 = r1.a(r4)     // Catch: java.lang.Throwable -> L2e
                        if (r1 == 0) goto L2c
                        goto L30
                    L2c:
                        r4 = r0
                        goto L30
                    L2e:
                        r4 = move-exception
                        goto L35
                    L30:
                        java.lang.Object r4 = L5.s.b(r4)     // Catch: java.lang.Throwable -> L2e
                        goto L3f
                    L35:
                        L5.s$a r1 = L5.s.f6498b
                        java.lang.Object r4 = L5.t.a(r4)
                        java.lang.Object r4 = L5.s.b(r4)
                    L3f:
                        boolean r1 = L5.s.g(r4)
                        if (r1 == 0) goto L46
                        goto L47
                    L46:
                        r0 = r4
                    L47:
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0480a.C0481a.b(java.lang.String):java.lang.String");
                }

                public /* synthetic */ C0481a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0480a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new C0480a(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(C0480a.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0480a[] newArray(int i8) {
                    return new C0480a[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0480a(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                AbstractC3159y.i(data, "data");
                AbstractC3159y.i(webViewUrl, "webViewUrl");
                this.f24155a = data;
                this.f24156b = str;
                this.f24157c = webViewUrl;
                this.f24158d = str2;
            }

            public final Uri c() {
                return this.f24157c;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0480a)) {
                    return false;
                }
                C0480a c0480a = (C0480a) obj;
                return AbstractC3159y.d(this.f24155a, c0480a.f24155a) && AbstractC3159y.d(this.f24156b, c0480a.f24156b) && AbstractC3159y.d(this.f24157c, c0480a.f24157c) && AbstractC3159y.d(this.f24158d, c0480a.f24158d);
            }

            public int hashCode() {
                int hashCode = this.f24155a.hashCode() * 31;
                String str = this.f24156b;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f24157c.hashCode()) * 31;
                String str2 = this.f24158d;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.f24155a + ", authCompleteUrl=" + this.f24156b + ", webViewUrl=" + this.f24157c + ", returnUrl=" + this.f24158d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24155a);
                out.writeString(this.f24156b);
                out.writeParcelable(this.f24157c, i8);
                out.writeString(this.f24158d);
            }

            public final String x() {
                return this.f24158d;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C0480a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r2 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    java.lang.String r0 = "webViewUrl"
                    kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
                    com.stripe.android.model.StripeIntent$a$a$a r0 = com.stripe.android.model.StripeIntent.a.C0480a.f24153e
                    java.lang.String r0 = com.stripe.android.model.StripeIntent.a.C0480a.C0481a.a(r0, r3)
                    android.net.Uri r4 = android.net.Uri.parse(r4)
                    java.lang.String r1 = "parse(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r4, r1)
                    r2.<init>(r3, r0, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0480a.<init>(java.lang.String, java.lang.String, java.lang.String):void");
            }
        }
    }

    List D();

    List H();

    boolean J();

    Map N();

    boolean a();

    String d();

    List g();

    String getId();

    Status getStatus();

    a l();

    NextActionType m();

    String p();

    o v();

    boolean w();
}
