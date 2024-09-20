package com.stripe.android.paymentsheet;

import M5.AbstractC1246t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.graphics.ColorKt;
import b3.EnumC1870e;
import com.stripe.android.googlepaylauncher.h;
import j4.C3086l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import n2.C3451a;
import r3.C3686a;
import y3.C3990e;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final f f26355b = new f(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f26356c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final w f26357a;

    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {

        /* renamed from: m, reason: collision with root package name */
        private static final e f26390m;

        /* renamed from: n, reason: collision with root package name */
        private static final e f26391n;

        /* renamed from: a, reason: collision with root package name */
        private final int f26392a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26393b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26394c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26395d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26396e;

        /* renamed from: f, reason: collision with root package name */
        private final int f26397f;

        /* renamed from: g, reason: collision with root package name */
        private final int f26398g;

        /* renamed from: h, reason: collision with root package name */
        private final int f26399h;

        /* renamed from: i, reason: collision with root package name */
        private final int f26400i;

        /* renamed from: j, reason: collision with root package name */
        private final int f26401j;

        /* renamed from: k, reason: collision with root package name */
        private final int f26402k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f26389l = new a(null);
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final e a() {
                return e.f26391n;
            }

            public final e b() {
                return e.f26390m;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33222a;
            f26390m = new e(c3086l.c().g().m1178getPrimary0d7_KjU(), c3086l.c().g().m1182getSurface0d7_KjU(), c3086l.c().d(), c3086l.c().e(), c3086l.c().f(), c3086l.c().h(), c3086l.c().j(), c3086l.c().i(), c3086l.c().g().m1177getOnSurface0d7_KjU(), c3086l.c().c(), c3086l.c().g().m1172getError0d7_KjU(), null);
            f26391n = new e(c3086l.b().g().m1178getPrimary0d7_KjU(), c3086l.b().g().m1182getSurface0d7_KjU(), c3086l.b().d(), c3086l.b().e(), c3086l.b().f(), c3086l.b().h(), c3086l.b().j(), c3086l.b().i(), c3086l.b().g().m1177getOnSurface0d7_KjU(), c3086l.b().c(), c3086l.b().g().m1172getError0d7_KjU(), null);
        }

        public /* synthetic */ e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, AbstractC3151p abstractC3151p) {
            this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
        }

        public final int G() {
            return this.f26393b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f26401j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f26392a == eVar.f26392a && this.f26393b == eVar.f26393b && this.f26394c == eVar.f26394c && this.f26395d == eVar.f26395d && this.f26396e == eVar.f26396e && this.f26397f == eVar.f26397f && this.f26398g == eVar.f26398g && this.f26399h == eVar.f26399h && this.f26400i == eVar.f26400i && this.f26401j == eVar.f26401j && this.f26402k == eVar.f26402k;
        }

        public final int f() {
            return this.f26394c;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f26392a * 31) + this.f26393b) * 31) + this.f26394c) * 31) + this.f26395d) * 31) + this.f26396e) * 31) + this.f26397f) * 31) + this.f26398g) * 31) + this.f26399h) * 31) + this.f26400i) * 31) + this.f26401j) * 31) + this.f26402k;
        }

        public final int i() {
            return this.f26395d;
        }

        public final int j() {
            return this.f26396e;
        }

        public final int k() {
            return this.f26402k;
        }

        public final int n() {
            return this.f26397f;
        }

        public final int o() {
            return this.f26398g;
        }

        public final int s() {
            return this.f26400i;
        }

        public String toString() {
            return "Colors(primary=" + this.f26392a + ", surface=" + this.f26393b + ", component=" + this.f26394c + ", componentBorder=" + this.f26395d + ", componentDivider=" + this.f26396e + ", onComponent=" + this.f26397f + ", onSurface=" + this.f26398g + ", subtitle=" + this.f26399h + ", placeholderText=" + this.f26400i + ", appBarIcon=" + this.f26401j + ", error=" + this.f26402k + ")";
        }

        public final int u() {
            return this.f26392a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f26392a);
            out.writeInt(this.f26393b);
            out.writeInt(this.f26394c);
            out.writeInt(this.f26395d);
            out.writeInt(this.f26396e);
            out.writeInt(this.f26397f);
            out.writeInt(this.f26398g);
            out.writeInt(this.f26399h);
            out.writeInt(this.f26400i);
            out.writeInt(this.f26401j);
            out.writeInt(this.f26402k);
        }

        public final int z() {
            return this.f26399h;
        }

        public e(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f26392a = i8;
            this.f26393b = i9;
            this.f26394c = i10;
            this.f26395d = i11;
            this.f26396e = i12;
            this.f26397f = i13;
            this.f26398g = i14;
            this.f26399h = i15;
            this.f26400i = i16;
            this.f26401j = i17;
            this.f26402k = i18;
        }

        private e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            this(ColorKt.m3025toArgb8_81llA(j8), ColorKt.m3025toArgb8_81llA(j9), ColorKt.m3025toArgb8_81llA(j10), ColorKt.m3025toArgb8_81llA(j11), ColorKt.m3025toArgb8_81llA(j12), ColorKt.m3025toArgb8_81llA(j13), ColorKt.m3025toArgb8_81llA(j16), ColorKt.m3025toArgb8_81llA(j14), ColorKt.m3025toArgb8_81llA(j15), ColorKt.m3025toArgb8_81llA(j17), ColorKt.m3025toArgb8_81llA(j18));
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface h extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements h {
            public static final Parcelable.Creator<a> CREATOR = new C0650a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26421a;

            /* renamed from: b, reason: collision with root package name */
            private final String f26422b;

            /* renamed from: com.stripe.android.paymentsheet.u$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0650a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String customerSessionClientSecret) {
                AbstractC3159y.i(customerSessionClientSecret, "customerSessionClientSecret");
                this.f26421a = customerSessionClientSecret;
                this.f26422b = "customer_session";
            }

            public final String F() {
                return this.f26421a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3159y.d(this.f26421a, ((a) obj).f26421a);
            }

            @Override // com.stripe.android.paymentsheet.u.h
            public String h() {
                return this.f26422b;
            }

            public int hashCode() {
                return this.f26421a.hashCode();
            }

            public String toString() {
                return "CustomerSession(customerSessionClientSecret=" + this.f26421a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26421a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements h {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26423a;

            /* renamed from: b, reason: collision with root package name */
            private final String f26424b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(String ephemeralKeySecret) {
                AbstractC3159y.i(ephemeralKeySecret, "ephemeralKeySecret");
                this.f26423a = ephemeralKeySecret;
                this.f26424b = "legacy";
            }

            public final String b() {
                return this.f26423a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3159y.d(this.f26423a, ((b) obj).f26423a);
            }

            @Override // com.stripe.android.paymentsheet.u.h
            public String h() {
                return this.f26424b;
            }

            public int hashCode() {
                return this.f26423a.hashCode();
            }

            public String toString() {
                return "LegacyCustomerEphemeralKey(ephemeralKeySecret=" + this.f26423a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26423a);
            }
        }

        String h();
    }

    /* loaded from: classes4.dex */
    public static final class i implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26427a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26428b;

        /* renamed from: c, reason: collision with root package name */
        private final h f26429c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f26425d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f26426e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new i(parcel.readString(), parcel.readString(), (h) parcel.readParcelable(i.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(String id, String ephemeralKeySecret, h accessType) {
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(ephemeralKeySecret, "ephemeralKeySecret");
            AbstractC3159y.i(accessType, "accessType");
            this.f26427a = id;
            this.f26428b = ephemeralKeySecret;
            this.f26429c = accessType;
        }

        public final h b() {
            return this.f26429c;
        }

        public final String c() {
            return this.f26428b;
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
            return AbstractC3159y.d(this.f26427a, iVar.f26427a) && AbstractC3159y.d(this.f26428b, iVar.f26428b) && AbstractC3159y.d(this.f26429c, iVar.f26429c);
        }

        public final String getId() {
            return this.f26427a;
        }

        public int hashCode() {
            return (((this.f26427a.hashCode() * 31) + this.f26428b.hashCode()) * 31) + this.f26429c.hashCode();
        }

        public String toString() {
            return "CustomerConfiguration(id=" + this.f26427a + ", ephemeralKeySecret=" + this.f26428b + ", accessType=" + this.f26429c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26427a);
            out.writeString(this.f26428b);
            out.writeParcelable(this.f26429c, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26430a = a.f26431a;

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f26431a = new a();

            /* renamed from: b, reason: collision with root package name */
            private static com.stripe.android.paymentsheet.h f26432b;

            private a() {
            }

            public final void a(com.stripe.android.paymentsheet.h hVar) {
                f26432b = hVar;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final c f26433a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26434b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26435c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f26436d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26437e;

        /* renamed from: f, reason: collision with root package name */
        private final a f26438f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26439a = new a("Buy", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f26440b = new a("Book", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f26441c = new a("Checkout", 2);

            /* renamed from: d, reason: collision with root package name */
            public static final a f26442d = new a("Donate", 3);

            /* renamed from: e, reason: collision with root package name */
            public static final a f26443e = new a("Order", 4);

            /* renamed from: f, reason: collision with root package name */
            public static final a f26444f = new a("Pay", 5);

            /* renamed from: g, reason: collision with root package name */
            public static final a f26445g = new a("Subscribe", 6);

            /* renamed from: h, reason: collision with root package name */
            public static final a f26446h = new a("Plain", 7);

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ a[] f26447i;

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26448j;

            static {
                a[] a8 = a();
                f26447i = a8;
                f26448j = R5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26439a, f26440b, f26441c, f26442d, f26443e, f26444f, f26445g, f26446h};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26447i.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new k(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public static final c f26449a = new c("Production", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final c f26450b = new c("Test", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ c[] f26451c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26452d;

            static {
                c[] a8 = a();
                f26451c = a8;
                f26452d = R5.b.a(a8);
            }

            private c(String str, int i8) {
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f26449a, f26450b};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f26451c.clone();
            }
        }

        public k(c environment, String countryCode, String str, Long l8, String str2, a buttonType) {
            AbstractC3159y.i(environment, "environment");
            AbstractC3159y.i(countryCode, "countryCode");
            AbstractC3159y.i(buttonType, "buttonType");
            this.f26433a = environment;
            this.f26434b = countryCode;
            this.f26435c = str;
            this.f26436d = l8;
            this.f26437e = str2;
            this.f26438f = buttonType;
        }

        public final Long b() {
            return this.f26436d;
        }

        public final a c() {
            return this.f26438f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26435c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f26433a == kVar.f26433a && AbstractC3159y.d(this.f26434b, kVar.f26434b) && AbstractC3159y.d(this.f26435c, kVar.f26435c) && AbstractC3159y.d(this.f26436d, kVar.f26436d) && AbstractC3159y.d(this.f26437e, kVar.f26437e) && this.f26438f == kVar.f26438f;
        }

        public final c f() {
            return this.f26433a;
        }

        public int hashCode() {
            int hashCode = ((this.f26433a.hashCode() * 31) + this.f26434b.hashCode()) * 31;
            String str = this.f26435c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l8 = this.f26436d;
            int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str2 = this.f26437e;
            return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f26438f.hashCode();
        }

        public final String i() {
            return this.f26437e;
        }

        public final String p() {
            return this.f26434b;
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.f26433a + ", countryCode=" + this.f26434b + ", currencyCode=" + this.f26435c + ", amount=" + this.f26436d + ", label=" + this.f26437e + ", buttonType=" + this.f26438f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26433a.name());
            out.writeString(this.f26434b);
            out.writeString(this.f26435c);
            Long l8 = this.f26436d;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f26437e);
            out.writeString(this.f26438f.name());
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class l implements Parcelable {

        /* loaded from: classes4.dex */
        public static final class a extends l {
            public static final Parcelable.Creator<a> CREATOR = new C0651a();

            /* renamed from: a, reason: collision with root package name */
            private final m f26453a;

            /* renamed from: com.stripe.android.paymentsheet.u$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0651a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(m.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m intentConfiguration) {
                super(null);
                AbstractC3159y.i(intentConfiguration, "intentConfiguration");
                this.f26453a = intentConfiguration;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void b() {
            }

            public final m c() {
                return this.f26453a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3159y.d(this.f26453a, ((a) obj).f26453a);
            }

            public int hashCode() {
                return this.f26453a.hashCode();
            }

            public String toString() {
                return "DeferredIntent(intentConfiguration=" + this.f26453a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f26453a.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26454a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String clientSecret) {
                super(null);
                AbstractC3159y.i(clientSecret, "clientSecret");
                this.f26454a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void b() {
                new C3990e(this.f26454a).c();
            }

            public final String d() {
                return this.f26454a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3159y.d(this.f26454a, ((b) obj).f26454a);
            }

            public int hashCode() {
                return this.f26454a.hashCode();
            }

            public String toString() {
                return "PaymentIntent(clientSecret=" + this.f26454a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26454a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends l {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26455a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
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
            public c(String clientSecret) {
                super(null);
                AbstractC3159y.i(clientSecret, "clientSecret");
                this.f26455a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void b() {
                new y3.k(this.f26455a).c();
            }

            public final String d() {
                return this.f26455a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3159y.d(this.f26455a, ((c) obj).f26455a);
            }

            public int hashCode() {
                return this.f26455a.hashCode();
            }

            public String toString() {
                return "SetupIntent(clientSecret=" + this.f26455a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26455a);
            }
        }

        private l() {
        }

        public abstract void b();

        public /* synthetic */ l(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26478a;

        /* renamed from: b, reason: collision with root package name */
        private static final n f26479b;

        /* renamed from: c, reason: collision with root package name */
        public static final n f26480c;

        /* renamed from: d, reason: collision with root package name */
        public static final n f26481d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ n[] f26482e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f26483f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final n a() {
                return n.f26479b;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            n nVar = new n("Horizontal", 0);
            f26480c = nVar;
            f26481d = new n("Vertical", 1);
            n[] a8 = a();
            f26482e = a8;
            f26483f = R5.b.a(a8);
            f26478a = new a(null);
            f26479b = nVar;
        }

        private n(String str, int i8) {
        }

        private static final /* synthetic */ n[] a() {
            return new n[]{f26480c, f26481d};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f26482e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        private static final p f26489g;

        /* renamed from: h, reason: collision with root package name */
        private static final p f26490h;

        /* renamed from: a, reason: collision with root package name */
        private final Integer f26491a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26492b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26493c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26494d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26495e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f26488f = new a(null);
        public static final Parcelable.Creator<p> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final p a() {
                return p.f26490h;
            }

            public final p b() {
                return p.f26489g;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new p(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i8) {
                return new p[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33222a;
            f26489g = new p(null, ColorKt.m3025toArgb8_81llA(c3086l.d().c().c()), ColorKt.m3025toArgb8_81llA(c3086l.d().c().b()), ColorKt.m3025toArgb8_81llA(c3086l.d().c().e()), ColorKt.m3025toArgb8_81llA(c3086l.d().c().c()));
            f26490h = new p(null, ColorKt.m3025toArgb8_81llA(c3086l.d().b().c()), ColorKt.m3025toArgb8_81llA(c3086l.d().b().b()), ColorKt.m3025toArgb8_81llA(c3086l.d().b().e()), ColorKt.m3025toArgb8_81llA(c3086l.d().b().c()));
        }

        public p(Integer num, int i8, int i9, int i10, int i11) {
            this.f26491a = num;
            this.f26492b = i8;
            this.f26493c = i9;
            this.f26494d = i10;
            this.f26495e = i11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.f26491a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return AbstractC3159y.d(this.f26491a, pVar.f26491a) && this.f26492b == pVar.f26492b && this.f26493c == pVar.f26493c && this.f26494d == pVar.f26494d && this.f26495e == pVar.f26495e;
        }

        public final int f() {
            return this.f26493c;
        }

        public int hashCode() {
            Integer num = this.f26491a;
            return ((((((((num == null ? 0 : num.hashCode()) * 31) + this.f26492b) * 31) + this.f26493c) * 31) + this.f26494d) * 31) + this.f26495e;
        }

        public final int i() {
            return this.f26492b;
        }

        public final int j() {
            return this.f26495e;
        }

        public final int k() {
            return this.f26494d;
        }

        public String toString() {
            return "PrimaryButtonColors(background=" + this.f26491a + ", onBackground=" + this.f26492b + ", border=" + this.f26493c + ", successBackgroundColor=" + this.f26494d + ", onSuccessBackgroundColor=" + this.f26495e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            Integer num = this.f26491a;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f26492b);
            out.writeInt(this.f26493c);
            out.writeInt(this.f26494d);
            out.writeInt(this.f26495e);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final s f26501d;

        /* renamed from: a, reason: collision with root package name */
        private final float f26502a;

        /* renamed from: b, reason: collision with root package name */
        private final float f26503b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26500c = new a(null);
        public static final Parcelable.Creator<s> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final s a() {
                return s.f26501d;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new s(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i8) {
                return new s[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33222a;
            f26501d = new s(c3086l.e().e(), c3086l.e().c());
        }

        public s(float f8, float f9) {
            this.f26502a = f8;
            this.f26503b = f9;
        }

        public final float c() {
            return this.f26503b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final float e() {
            return this.f26502a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Float.compare(this.f26502a, sVar.f26502a) == 0 && Float.compare(this.f26503b, sVar.f26503b) == 0;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f26502a) * 31) + Float.floatToIntBits(this.f26503b);
        }

        public String toString() {
            return "Shapes(cornerRadiusDp=" + this.f26502a + ", borderStrokeWidthDp=" + this.f26503b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeFloat(this.f26502a);
            out.writeFloat(this.f26503b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class t implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final t f26505d;

        /* renamed from: a, reason: collision with root package name */
        private final float f26506a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f26507b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26504c = new a(null);
        public static final Parcelable.Creator<t> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final t a() {
                return t.f26505d;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new t(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t[] newArray(int i8) {
                return new t[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33222a;
            f26505d = new t(c3086l.f().g(), c3086l.f().f());
        }

        public t(float f8, Integer num) {
            this.f26506a = f8;
            this.f26507b = num;
        }

        public final Integer c() {
            return this.f26507b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final float e() {
            return this.f26506a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return Float.compare(this.f26506a, tVar.f26506a) == 0 && AbstractC3159y.d(this.f26507b, tVar.f26507b);
        }

        public int hashCode() {
            int hashCode;
            int floatToIntBits = Float.floatToIntBits(this.f26506a) * 31;
            Integer num = this.f26507b;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return floatToIntBits + hashCode;
        }

        public String toString() {
            return "Typography(sizeScaleFactor=" + this.f26506a + ", fontResId=" + this.f26507b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            out.writeFloat(this.f26506a);
            Integer num = this.f26507b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    public u(w paymentSheetLauncher) {
        AbstractC3159y.i(paymentSheetLauncher, "paymentSheetLauncher");
        this.f26357a = paymentSheetLauncher;
    }

    public final void a(String paymentIntentClientSecret, g gVar) {
        AbstractC3159y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.f26357a.a(new l.b(paymentIntentClientSecret), gVar);
    }

    /* loaded from: classes4.dex */
    public static final class q implements Parcelable {
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Float f26496a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f26497b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new q(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q[] newArray(int i8) {
                return new q[i8];
            }
        }

        public q(Float f8, Float f9) {
            this.f26496a = f8;
            this.f26497b = f9;
        }

        public final Float b() {
            return this.f26497b;
        }

        public final Float c() {
            return this.f26496a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return AbstractC3159y.d(this.f26496a, qVar.f26496a) && AbstractC3159y.d(this.f26497b, qVar.f26497b);
        }

        public int hashCode() {
            Float f8 = this.f26496a;
            int hashCode = (f8 == null ? 0 : f8.hashCode()) * 31;
            Float f9 = this.f26497b;
            return hashCode + (f9 != null ? f9.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonShape(cornerRadiusDp=" + this.f26496a + ", borderStrokeWidthDp=" + this.f26497b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            Float f8 = this.f26496a;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
            Float f9 = this.f26497b;
            if (f9 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f9.floatValue());
            }
        }

        public /* synthetic */ q(Float f8, Float f9, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : f8, (i8 & 2) != 0 ? null : f9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements Parcelable {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Integer f26498a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f26499b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new r(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i8) {
                return new r[i8];
            }
        }

        public r(Integer num, Float f8) {
            this.f26498a = num;
            this.f26499b = f8;
        }

        public final Integer b() {
            return this.f26498a;
        }

        public final Float c() {
            return this.f26499b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return AbstractC3159y.d(this.f26498a, rVar.f26498a) && AbstractC3159y.d(this.f26499b, rVar.f26499b);
        }

        public int hashCode() {
            Integer num = this.f26498a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f8 = this.f26499b;
            return hashCode + (f8 != null ? f8.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonTypography(fontResId=" + this.f26498a + ", fontSizeSp=" + this.f26499b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            Integer num = this.f26498a;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Float f8 = this.f26499b;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
        }

        public /* synthetic */ r(Integer num, Float f8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : num, (i8 & 2) != 0 ? null : f8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(ComponentActivity activity, q3.p callback) {
        this(new C2433b(activity, callback));
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(callback, "callback");
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final a f26369a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26370b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26371c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26372d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(a aVar, String str, String str2, String str3) {
            this.f26369a = aVar;
            this.f26370b = str;
            this.f26371c = str2;
            this.f26372d = str3;
        }

        public final a b() {
            return this.f26369a;
        }

        public final String c() {
            return this.f26370b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26371c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f26369a, cVar.f26369a) && AbstractC3159y.d(this.f26370b, cVar.f26370b) && AbstractC3159y.d(this.f26371c, cVar.f26371c) && AbstractC3159y.d(this.f26372d, cVar.f26372d);
        }

        public final String f() {
            return this.f26372d;
        }

        public int hashCode() {
            a aVar = this.f26369a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f26370b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26371c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26372d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean i() {
            if (this.f26369a == null && this.f26370b == null && this.f26371c == null && this.f26372d == null) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "BillingDetails(address=" + this.f26369a + ", email=" + this.f26370b + ", name=" + this.f26371c + ", phone=" + this.f26372d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            a aVar = this.f26369a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f26370b);
            out.writeString(this.f26371c);
            out.writeString(this.f26372d);
        }

        public /* synthetic */ c(a aVar, String str, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements Parcelable {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final p f26484a;

        /* renamed from: b, reason: collision with root package name */
        private final p f26485b;

        /* renamed from: c, reason: collision with root package name */
        private final q f26486c;

        /* renamed from: d, reason: collision with root package name */
        private final r f26487d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                Parcelable.Creator<p> creator = p.CREATOR;
                return new o(creator.createFromParcel(parcel), creator.createFromParcel(parcel), q.CREATOR.createFromParcel(parcel), r.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(p colorsLight, p colorsDark, q shape, r typography) {
            AbstractC3159y.i(colorsLight, "colorsLight");
            AbstractC3159y.i(colorsDark, "colorsDark");
            AbstractC3159y.i(shape, "shape");
            AbstractC3159y.i(typography, "typography");
            this.f26484a = colorsLight;
            this.f26485b = colorsDark;
            this.f26486c = shape;
            this.f26487d = typography;
        }

        public final p b() {
            return this.f26485b;
        }

        public final p c() {
            return this.f26484a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final q e() {
            return this.f26486c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return AbstractC3159y.d(this.f26484a, oVar.f26484a) && AbstractC3159y.d(this.f26485b, oVar.f26485b) && AbstractC3159y.d(this.f26486c, oVar.f26486c) && AbstractC3159y.d(this.f26487d, oVar.f26487d);
        }

        public final r f() {
            return this.f26487d;
        }

        public int hashCode() {
            return (((((this.f26484a.hashCode() * 31) + this.f26485b.hashCode()) * 31) + this.f26486c.hashCode()) * 31) + this.f26487d.hashCode();
        }

        public String toString() {
            return "PrimaryButton(colorsLight=" + this.f26484a + ", colorsDark=" + this.f26485b + ", shape=" + this.f26486c + ", typography=" + this.f26487d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26484a.writeToParcel(out, i8);
            this.f26485b.writeToParcel(out, i8);
            this.f26486c.writeToParcel(out, i8);
            this.f26487d.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ o(com.stripe.android.paymentsheet.u.p r3, com.stripe.android.paymentsheet.u.p r4, com.stripe.android.paymentsheet.u.q r5, com.stripe.android.paymentsheet.u.r r6, int r7, kotlin.jvm.internal.AbstractC3151p r8) {
            /*
                r2 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                com.stripe.android.paymentsheet.u$p$a r3 = com.stripe.android.paymentsheet.u.p.f26488f
                com.stripe.android.paymentsheet.u$p r3 = r3.b()
            La:
                r8 = r7 & 2
                if (r8 == 0) goto L14
                com.stripe.android.paymentsheet.u$p$a r4 = com.stripe.android.paymentsheet.u.p.f26488f
                com.stripe.android.paymentsheet.u$p r4 = r4.a()
            L14:
                r8 = r7 & 4
                r0 = 3
                r1 = 0
                if (r8 == 0) goto L1f
                com.stripe.android.paymentsheet.u$q r5 = new com.stripe.android.paymentsheet.u$q
                r5.<init>(r1, r1, r0, r1)
            L1f:
                r7 = r7 & 8
                if (r7 == 0) goto L28
                com.stripe.android.paymentsheet.u$r r6 = new com.stripe.android.paymentsheet.u$r
                r6.<init>(r1, r1, r0, r1)
            L28:
                r2.<init>(r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.u.o.<init>(com.stripe.android.paymentsheet.u$p, com.stripe.android.paymentsheet.u$p, com.stripe.android.paymentsheet.u$q, com.stripe.android.paymentsheet.u$r, int, kotlin.jvm.internal.p):void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final e f26364a;

        /* renamed from: b, reason: collision with root package name */
        private final e f26365b;

        /* renamed from: c, reason: collision with root package name */
        private final s f26366c;

        /* renamed from: d, reason: collision with root package name */
        private final t f26367d;

        /* renamed from: e, reason: collision with root package name */
        private final o f26368e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                Parcelable.Creator<e> creator = e.CREATOR;
                return new b(creator.createFromParcel(parcel), creator.createFromParcel(parcel), s.CREATOR.createFromParcel(parcel), t.CREATOR.createFromParcel(parcel), o.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(e colorsLight, e colorsDark, s shapes, t typography, o primaryButton) {
            AbstractC3159y.i(colorsLight, "colorsLight");
            AbstractC3159y.i(colorsDark, "colorsDark");
            AbstractC3159y.i(shapes, "shapes");
            AbstractC3159y.i(typography, "typography");
            AbstractC3159y.i(primaryButton, "primaryButton");
            this.f26364a = colorsLight;
            this.f26365b = colorsDark;
            this.f26366c = shapes;
            this.f26367d = typography;
            this.f26368e = primaryButton;
        }

        public final e b() {
            return this.f26365b;
        }

        public final e c() {
            return this.f26364a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final o e() {
            return this.f26368e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f26364a, bVar.f26364a) && AbstractC3159y.d(this.f26365b, bVar.f26365b) && AbstractC3159y.d(this.f26366c, bVar.f26366c) && AbstractC3159y.d(this.f26367d, bVar.f26367d) && AbstractC3159y.d(this.f26368e, bVar.f26368e);
        }

        public final s f() {
            return this.f26366c;
        }

        public int hashCode() {
            return (((((((this.f26364a.hashCode() * 31) + this.f26365b.hashCode()) * 31) + this.f26366c.hashCode()) * 31) + this.f26367d.hashCode()) * 31) + this.f26368e.hashCode();
        }

        public final t i() {
            return this.f26367d;
        }

        public String toString() {
            return "Appearance(colorsLight=" + this.f26364a + ", colorsDark=" + this.f26365b + ", shapes=" + this.f26366c + ", typography=" + this.f26367d + ", primaryButton=" + this.f26368e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26364a.writeToParcel(out, i8);
            this.f26365b.writeToParcel(out, i8);
            this.f26366c.writeToParcel(out, i8);
            this.f26367d.writeToParcel(out, i8);
            this.f26368e.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b() {
            /*
                r13 = this;
                com.stripe.android.paymentsheet.u$e$a r0 = com.stripe.android.paymentsheet.u.e.f26389l
                com.stripe.android.paymentsheet.u$e r2 = r0.b()
                com.stripe.android.paymentsheet.u$e r3 = r0.a()
                com.stripe.android.paymentsheet.u$s$a r0 = com.stripe.android.paymentsheet.u.s.f26500c
                com.stripe.android.paymentsheet.u$s r4 = r0.a()
                com.stripe.android.paymentsheet.u$t$a r0 = com.stripe.android.paymentsheet.u.t.f26504c
                com.stripe.android.paymentsheet.u$t r5 = r0.a()
                com.stripe.android.paymentsheet.u$o r0 = new com.stripe.android.paymentsheet.u$o
                r11 = 15
                r12 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r6 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r1 = r13
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.u.b.<init>():void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        private final b f26373a;

        /* renamed from: b, reason: collision with root package name */
        private final b f26374b;

        /* renamed from: c, reason: collision with root package name */
        private final b f26375c;

        /* renamed from: d, reason: collision with root package name */
        private final a f26376d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26377e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26378a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f26379b = new a("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f26380c = new a("Full", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f26381d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26382e;

            static {
                a[] a8 = a();
                f26381d = a8;
                f26382e = R5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26378a, f26379b, f26380c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26381d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f26383a = new b("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final b f26384b = new b("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final b f26385c = new b("Always", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ b[] f26386d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26387e;

            static {
                b[] a8 = a();
                f26386d = a8;
                f26387e = R5.b.a(a8);
            }

            private b(String str, int i8) {
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f26383a, f26384b, f26385c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f26386d.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.u$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0649d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f26388a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.f26379b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.f26378a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.f26380c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f26388a = iArr;
            }
        }

        public d(b name, b phone, b email, a address, boolean z8) {
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(phone, "phone");
            AbstractC3159y.i(email, "email");
            AbstractC3159y.i(address, "address");
            this.f26373a = name;
            this.f26374b = phone;
            this.f26375c = email;
            this.f26376d = address;
            this.f26377e = z8;
        }

        public final a b() {
            return this.f26376d;
        }

        public final boolean c() {
            return this.f26377e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            b bVar = this.f26373a;
            b bVar2 = b.f26385c;
            if (bVar != bVar2 && this.f26374b != bVar2 && this.f26375c != bVar2 && this.f26376d != a.f26380c) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f26373a == dVar.f26373a && this.f26374b == dVar.f26374b && this.f26375c == dVar.f26375c && this.f26376d == dVar.f26376d && this.f26377e == dVar.f26377e;
        }

        public final boolean f() {
            if (this.f26375c == b.f26385c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f26373a.hashCode() * 31) + this.f26374b.hashCode()) * 31) + this.f26375c.hashCode()) * 31) + this.f26376d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26377e);
        }

        public final boolean i() {
            if (this.f26373a == b.f26385c) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            if (this.f26374b == b.f26385c) {
                return true;
            }
            return false;
        }

        public final b k() {
            return this.f26375c;
        }

        public final b n() {
            return this.f26373a;
        }

        public final b o() {
            return this.f26374b;
        }

        public final h.b s() {
            boolean z8;
            boolean z9;
            h.b.EnumC0476b enumC0476b;
            a aVar = this.f26376d;
            boolean z10 = false;
            if (aVar == a.f26380c) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f26374b == b.f26385c) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i8 = C0649d.f26388a[aVar.ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    enumC0476b = h.b.EnumC0476b.f23920c;
                } else {
                    throw new L5.p();
                }
            } else {
                enumC0476b = h.b.EnumC0476b.f23919b;
            }
            if (z8 || z9) {
                z10 = true;
            }
            return new h.b(z10, enumC0476b, z9);
        }

        public String toString() {
            return "BillingDetailsCollectionConfiguration(name=" + this.f26373a + ", phone=" + this.f26374b + ", email=" + this.f26375c + ", address=" + this.f26376d + ", attachDefaultsToPaymentMethod=" + this.f26377e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26373a.name());
            out.writeString(this.f26374b.name());
            out.writeString(this.f26375c.name());
            out.writeString(this.f26376d.name());
            out.writeInt(this.f26377e ? 1 : 0);
        }

        public /* synthetic */ d(b bVar, b bVar2, b bVar3, a aVar, boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? b.f26383a : bVar, (i8 & 2) != 0 ? b.f26383a : bVar2, (i8 & 4) != 0 ? b.f26383a : bVar3, (i8 & 8) != 0 ? a.f26378a : aVar, (i8 & 16) != 0 ? false : z8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final d f26458a;

        /* renamed from: b, reason: collision with root package name */
        private final List f26459b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26460c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26461d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26462e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f26456f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f26457g = 8;
        public static final Parcelable.Creator<m> CREATOR = new c();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26463a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f26464b = new a("AutomaticAsync", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f26465c = new a("Manual", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f26466d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26467e;

            static {
                a[] a8 = a();
                f26466d = a8;
                f26467e = R5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26463a, f26464b, f26465c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26466d.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new m((d) parcel.readParcelable(m.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static abstract class d implements Parcelable {

            /* loaded from: classes4.dex */
            public static final class a extends d {
                public static final Parcelable.Creator<a> CREATOR = new C0652a();

                /* renamed from: a, reason: collision with root package name */
                private final long f26468a;

                /* renamed from: b, reason: collision with root package name */
                private final String f26469b;

                /* renamed from: c, reason: collision with root package name */
                private final e f26470c;

                /* renamed from: d, reason: collision with root package name */
                private final a f26471d;

                /* renamed from: com.stripe.android.paymentsheet.u$m$d$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0652a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final a createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), a.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final a[] newArray(int i8) {
                        return new a[i8];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j8, String currency, e eVar, a captureMethod) {
                    super(null);
                    AbstractC3159y.i(currency, "currency");
                    AbstractC3159y.i(captureMethod, "captureMethod");
                    this.f26468a = j8;
                    this.f26469b = currency;
                    this.f26470c = eVar;
                    this.f26471d = captureMethod;
                }

                public final String K() {
                    return this.f26469b;
                }

                @Override // com.stripe.android.paymentsheet.u.m.d
                public e b() {
                    return this.f26470c;
                }

                public final long c() {
                    return this.f26468a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public a e() {
                    return this.f26471d;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeLong(this.f26468a);
                    out.writeString(this.f26469b);
                    e eVar = this.f26470c;
                    if (eVar == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeString(eVar.name());
                    }
                    out.writeString(this.f26471d.name());
                }
            }

            private d() {
            }

            public abstract e b();

            /* loaded from: classes4.dex */
            public static final class b extends d {
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* renamed from: a, reason: collision with root package name */
                private final String f26472a;

                /* renamed from: b, reason: collision with root package name */
                private final e f26473b;

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new b(parcel.readString(), e.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                public /* synthetic */ b(String str, e eVar, int i8, AbstractC3151p abstractC3151p) {
                    this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? e.f26475b : eVar);
                }

                public final String K() {
                    return this.f26472a;
                }

                @Override // com.stripe.android.paymentsheet.u.m.d
                public e b() {
                    return this.f26473b;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f26472a);
                    out.writeString(this.f26473b.name());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, e setupFutureUse) {
                    super(null);
                    AbstractC3159y.i(setupFutureUse, "setupFutureUse");
                    this.f26472a = str;
                    this.f26473b = setupFutureUse;
                }
            }

            public /* synthetic */ d(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            public static final e f26474a = new e("OnSession", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final e f26475b = new e("OffSession", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ e[] f26476c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26477d;

            static {
                e[] a8 = a();
                f26476c = a8;
                f26477d = R5.b.a(a8);
            }

            private e(String str, int i8) {
            }

            private static final /* synthetic */ e[] a() {
                return new e[]{f26474a, f26475b};
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) f26476c.clone();
            }
        }

        public m(d mode, List paymentMethodTypes, String str, String str2, boolean z8) {
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
            this.f26458a = mode;
            this.f26459b = paymentMethodTypes;
            this.f26460c = str;
            this.f26461d = str2;
            this.f26462e = z8;
        }

        public final d b() {
            return this.f26458a;
        }

        public final String c() {
            return this.f26461d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26460c;
        }

        public final boolean f() {
            return this.f26462e;
        }

        public final List g() {
            return this.f26459b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26458a, i8);
            out.writeStringList(this.f26459b);
            out.writeString(this.f26460c);
            out.writeString(this.f26461d);
            out.writeInt(this.f26462e ? 1 : 0);
        }

        public /* synthetic */ m(d dVar, List list, String str, String str2, int i8, AbstractC3151p abstractC3151p) {
            this(dVar, (i8 & 2) != 0 ? AbstractC1246t.m() : list, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public m(d mode, List paymentMethodTypes, String str, String str2) {
            this(mode, paymentMethodTypes, str, str2, false);
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0648a();

        /* renamed from: a, reason: collision with root package name */
        private final String f26358a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26359b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26360c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26361d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26362e;

        /* renamed from: f, reason: collision with root package name */
        private final String f26363f;

        /* renamed from: com.stripe.android.paymentsheet.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0648a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f26358a = str;
            this.f26359b = str2;
            this.f26360c = str3;
            this.f26361d = str4;
            this.f26362e = str5;
            this.f26363f = str6;
        }

        public final String b() {
            return this.f26358a;
        }

        public final String c() {
            return this.f26359b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26360c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26358a, aVar.f26358a) && AbstractC3159y.d(this.f26359b, aVar.f26359b) && AbstractC3159y.d(this.f26360c, aVar.f26360c) && AbstractC3159y.d(this.f26361d, aVar.f26361d) && AbstractC3159y.d(this.f26362e, aVar.f26362e) && AbstractC3159y.d(this.f26363f, aVar.f26363f);
        }

        public final String f() {
            return this.f26361d;
        }

        public int hashCode() {
            String str = this.f26358a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26359b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26360c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f26361d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f26362e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f26363f;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String i() {
            return this.f26362e;
        }

        public final String j() {
            return this.f26363f;
        }

        public String toString() {
            return "Address(city=" + this.f26358a + ", country=" + this.f26359b + ", line1=" + this.f26360c + ", line2=" + this.f26361d + ", postalCode=" + this.f26362e + ", state=" + this.f26363f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26358a);
            out.writeString(this.f26359b);
            out.writeString(this.f26360c);
            out.writeString(this.f26361d);
            out.writeString(this.f26362e);
            out.writeString(this.f26363f);
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26405a;

        /* renamed from: b, reason: collision with root package name */
        private final i f26406b;

        /* renamed from: c, reason: collision with root package name */
        private final k f26407c;

        /* renamed from: d, reason: collision with root package name */
        private final ColorStateList f26408d;

        /* renamed from: e, reason: collision with root package name */
        private final c f26409e;

        /* renamed from: f, reason: collision with root package name */
        private final C3686a f26410f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f26411g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f26412h;

        /* renamed from: i, reason: collision with root package name */
        private final b f26413i;

        /* renamed from: j, reason: collision with root package name */
        private final String f26414j;

        /* renamed from: k, reason: collision with root package name */
        private final d f26415k;

        /* renamed from: l, reason: collision with root package name */
        private final List f26416l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f26417m;

        /* renamed from: n, reason: collision with root package name */
        private final List f26418n;

        /* renamed from: o, reason: collision with root package name */
        private final List f26419o;

        /* renamed from: p, reason: collision with root package name */
        private final n f26420p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f26403q = new a(null);

        /* renamed from: r, reason: collision with root package name */
        public static final int f26404r = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final g a(Context context) {
                AbstractC3159y.i(context, "context");
                return new g(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), null, null, null, null, null, false, false, null, null, null, null, 4094, null);
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                i createFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
                k createFromParcel2 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
                ColorStateList colorStateList = (ColorStateList) parcel.readParcelable(g.class.getClassLoader());
                c createFromParcel3 = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                C3686a createFromParcel4 = parcel.readInt() != 0 ? C3686a.CREATOR.createFromParcel(parcel) : null;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                b createFromParcel5 = b.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                d createFromParcel6 = d.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC1870e.valueOf(parcel.readString()));
                }
                return new g(readString, createFromParcel, createFromParcel2, colorStateList, createFromParcel3, createFromParcel4, z8, z9, createFromParcel5, readString2, createFromParcel6, arrayList, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks, boolean z10, List paymentMethodOrder, List externalPaymentMethods, n paymentMethodLayout) {
            AbstractC3159y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3159y.i(appearance, "appearance");
            AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3159y.i(preferredNetworks, "preferredNetworks");
            AbstractC3159y.i(paymentMethodOrder, "paymentMethodOrder");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            AbstractC3159y.i(paymentMethodLayout, "paymentMethodLayout");
            this.f26405a = merchantDisplayName;
            this.f26406b = iVar;
            this.f26407c = kVar;
            this.f26408d = colorStateList;
            this.f26409e = cVar;
            this.f26410f = c3686a;
            this.f26411g = z8;
            this.f26412h = z9;
            this.f26413i = appearance;
            this.f26414j = str;
            this.f26415k = billingDetailsCollectionConfiguration;
            this.f26416l = preferredNetworks;
            this.f26417m = z10;
            this.f26418n = paymentMethodOrder;
            this.f26419o = externalPaymentMethods;
            this.f26420p = paymentMethodLayout;
        }

        public final List G() {
            return this.f26416l;
        }

        public final ColorStateList I() {
            return this.f26408d;
        }

        public final String L() {
            return this.f26414j;
        }

        public final boolean b() {
            return this.f26411g;
        }

        public final boolean c() {
            return this.f26412h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f26417m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3159y.d(this.f26405a, gVar.f26405a) && AbstractC3159y.d(this.f26406b, gVar.f26406b) && AbstractC3159y.d(this.f26407c, gVar.f26407c) && AbstractC3159y.d(this.f26408d, gVar.f26408d) && AbstractC3159y.d(this.f26409e, gVar.f26409e) && AbstractC3159y.d(this.f26410f, gVar.f26410f) && this.f26411g == gVar.f26411g && this.f26412h == gVar.f26412h && AbstractC3159y.d(this.f26413i, gVar.f26413i) && AbstractC3159y.d(this.f26414j, gVar.f26414j) && AbstractC3159y.d(this.f26415k, gVar.f26415k) && AbstractC3159y.d(this.f26416l, gVar.f26416l) && this.f26417m == gVar.f26417m && AbstractC3159y.d(this.f26418n, gVar.f26418n) && AbstractC3159y.d(this.f26419o, gVar.f26419o) && this.f26420p == gVar.f26420p;
        }

        public final b f() {
            return this.f26413i;
        }

        public int hashCode() {
            int hashCode = this.f26405a.hashCode() * 31;
            i iVar = this.f26406b;
            int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            k kVar = this.f26407c;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            ColorStateList colorStateList = this.f26408d;
            int hashCode4 = (hashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            c cVar = this.f26409e;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            C3686a c3686a = this.f26410f;
            int hashCode6 = (((((((hashCode5 + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26411g)) * 31) + androidx.compose.foundation.a.a(this.f26412h)) * 31) + this.f26413i.hashCode()) * 31;
            String str = this.f26414j;
            return ((((((((((((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.f26415k.hashCode()) * 31) + this.f26416l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26417m)) * 31) + this.f26418n.hashCode()) * 31) + this.f26419o.hashCode()) * 31) + this.f26420p.hashCode();
        }

        public final d i() {
            return this.f26415k;
        }

        public final i j() {
            return this.f26406b;
        }

        public final c k() {
            return this.f26409e;
        }

        public final List n() {
            return this.f26419o;
        }

        public final k o() {
            return this.f26407c;
        }

        public final String s() {
            return this.f26405a;
        }

        public final C3686a t() {
            return this.f26410f;
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.f26405a + ", customer=" + this.f26406b + ", googlePay=" + this.f26407c + ", primaryButtonColor=" + this.f26408d + ", defaultBillingDetails=" + this.f26409e + ", shippingDetails=" + this.f26410f + ", allowsDelayedPaymentMethods=" + this.f26411g + ", allowsPaymentMethodsRequiringShippingAddress=" + this.f26412h + ", appearance=" + this.f26413i + ", primaryButtonLabel=" + this.f26414j + ", billingDetailsCollectionConfiguration=" + this.f26415k + ", preferredNetworks=" + this.f26416l + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f26417m + ", paymentMethodOrder=" + this.f26418n + ", externalPaymentMethods=" + this.f26419o + ", paymentMethodLayout=" + this.f26420p + ")";
        }

        public final n u() {
            return this.f26420p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26405a);
            i iVar = this.f26406b;
            if (iVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                iVar.writeToParcel(out, i8);
            }
            k kVar = this.f26407c;
            if (kVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                kVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f26408d, i8);
            c cVar = this.f26409e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            C3686a c3686a = this.f26410f;
            if (c3686a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c3686a.writeToParcel(out, i8);
            }
            out.writeInt(this.f26411g ? 1 : 0);
            out.writeInt(this.f26412h ? 1 : 0);
            this.f26413i.writeToParcel(out, i8);
            out.writeString(this.f26414j);
            this.f26415k.writeToParcel(out, i8);
            List list = this.f26416l;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC1870e) it.next()).name());
            }
            out.writeInt(this.f26417m ? 1 : 0);
            out.writeStringList(this.f26418n);
            out.writeStringList(this.f26419o);
            out.writeString(this.f26420p.name());
        }

        public final List z() {
            return this.f26418n;
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, boolean z10, List list2, List list3, n nVar, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? C3451a.f35969a.d() : iVar, (i8 & 4) != 0 ? C3451a.f35969a.f() : kVar, (i8 & 8) != 0 ? C3451a.f35969a.i() : colorStateList, (i8 & 16) != 0 ? C3451a.f35969a.b() : cVar, (i8 & 32) != 0 ? C3451a.f35969a.k() : c3686a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3451a.f35969a.a() : bVar, (i8 & 512) != 0 ? C3451a.f35969a.j() : str2, (i8 & 1024) != 0 ? C3451a.f35969a.c() : dVar, (i8 & 2048) != 0 ? C3451a.f35969a.h() : list, (i8 & 4096) != 0 ? true : z10, (i8 & 8192) != 0 ? C3451a.f35969a.g() : list2, (i8 & 16384) != 0 ? C3451a.f35969a.e() : list3, (i8 & 32768) != 0 ? n.f26478a.a() : nVar);
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? C3451a.f35969a.d() : iVar, (i8 & 4) != 0 ? C3451a.f35969a.f() : kVar, (i8 & 8) != 0 ? C3451a.f35969a.i() : colorStateList, (i8 & 16) != 0 ? C3451a.f35969a.b() : cVar, (i8 & 32) != 0 ? C3451a.f35969a.k() : c3686a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3451a.f35969a.a() : bVar, (i8 & 512) != 0 ? C3451a.f35969a.j() : str2, (i8 & 1024) != 0 ? C3451a.f35969a.c() : dVar, (i8 & 2048) != 0 ? C3451a.f35969a.h() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks) {
            this(merchantDisplayName, iVar, kVar, colorStateList, cVar, c3686a, z8, z9, appearance, str, billingDetailsCollectionConfiguration, preferredNetworks, true, null, C3451a.f35969a.e(), null, 40960, null);
            AbstractC3159y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3159y.i(appearance, "appearance");
            AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3159y.i(preferredNetworks, "preferredNetworks");
        }
    }
}
