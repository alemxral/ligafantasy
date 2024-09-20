package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1863H;
import com.mbridge.msdk.MBridgeConstans;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class r implements InterfaceC1863H, Parcelable {

    /* renamed from: b */
    public static final int f24643b = 0;

    /* renamed from: a */
    private final o.p f24644a;

    /* loaded from: classes4.dex */
    public static final class a extends r {

        /* renamed from: c */
        private String f24647c;

        /* renamed from: d */
        public static final C0525a f24645d = new C0525a(null);

        /* renamed from: e */
        public static final int f24646e = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.r$a$a */
        /* loaded from: classes4.dex */
        public static final class C0525a {
            private C0525a() {
            }

            public /* synthetic */ C0525a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String code) {
            super(o.p.f24496B, null);
            AbstractC3159y.i(code, "code");
            this.f24647c = code;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.e(L5.x.a("code", this.f24647c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f24647c, ((a) obj).f24647c);
        }

        public int hashCode() {
            return this.f24647c.hashCode();
        }

        public String toString() {
            return "Blik(code=" + this.f24647c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24647c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r {

        /* renamed from: c */
        private String f24650c;

        /* renamed from: d */
        private String f24651d;

        /* renamed from: e */
        private b.c f24652e;

        /* renamed from: f */
        private Boolean f24653f;

        /* renamed from: g */
        private static final a f24648g = new a(null);

        /* renamed from: h */
        public static final int f24649h = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0526b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.r$b$b */
        /* loaded from: classes4.dex */
        public static final class C0526b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Boolean bool = null;
                b.c valueOf = parcel.readInt() == 0 ? null : b.c.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new b(readString, readString2, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public /* synthetic */ b(String str, String str2, b.c cVar, Boolean bool, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ b e(b bVar, String str, String str2, b.c cVar, Boolean bool, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = bVar.f24650c;
            }
            if ((i8 & 2) != 0) {
                str2 = bVar.f24651d;
            }
            if ((i8 & 4) != 0) {
                cVar = bVar.f24652e;
            }
            if ((i8 & 8) != 0) {
                bool = bVar.f24653f;
            }
            return bVar.c(str, str2, cVar, bool);
        }

        @Override // com.stripe.android.model.r
        public List b() {
            String str;
            L5.r a8 = L5.x.a("cvc", this.f24650c);
            L5.r a9 = L5.x.a("network", this.f24651d);
            L5.r a10 = L5.x.a("moto", this.f24653f);
            b.c cVar = this.f24652e;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1246t.p(a8, a9, a10, L5.x.a("setup_future_usage", str));
        }

        public final b c(String str, String str2, b.c cVar, Boolean bool) {
            return new b(str, str2, cVar, bool);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f24650c, bVar.f24650c) && AbstractC3159y.d(this.f24651d, bVar.f24651d) && this.f24652e == bVar.f24652e && AbstractC3159y.d(this.f24653f, bVar.f24653f);
        }

        public final b.c f() {
            return this.f24652e;
        }

        public int hashCode() {
            String str = this.f24650c;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24651d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            b.c cVar = this.f24652e;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Boolean bool = this.f24653f;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Card(cvc=" + this.f24650c + ", network=" + this.f24651d + ", setupFutureUsage=" + this.f24652e + ", moto=" + this.f24653f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24650c);
            out.writeString(this.f24651d);
            b.c cVar = this.f24652e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
            Boolean bool = this.f24653f;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public b(String str, String str2, b.c cVar, Boolean bool) {
            super(o.p.f24519i, null);
            this.f24650c = str;
            this.f24651d = str2;
            this.f24652e = cVar;
            this.f24653f = bool;
        }

        public /* synthetic */ b(String str, String str2, b.c cVar, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar);
        }

        public b(String str, String str2, b.c cVar) {
            this(str, str2, cVar, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends r {

        /* renamed from: c */
        private final String f24655c;

        /* renamed from: d */
        public static final a f24654d = new a(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

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
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String confirmationNumber) {
            super(o.p.f24512R, null);
            AbstractC3159y.i(confirmationNumber, "confirmationNumber");
            this.f24655c = confirmationNumber;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.e(L5.x.a("confirmation_number", this.f24655c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f24655c, ((c) obj).f24655c);
        }

        public int hashCode() {
            return this.f24655c.hashCode();
        }

        public String toString() {
            return "Konbini(confirmationNumber=" + this.f24655c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24655c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends r {

        /* renamed from: c */
        private b.c f24658c;

        /* renamed from: d */
        public static final a f24656d = new a(null);

        /* renamed from: e */
        public static final int f24657e = 8;
        public static final Parcelable.Creator<d> CREATOR = new b();

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
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : b.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(b.c cVar) {
            super(o.p.f24509O, null);
            this.f24658c = cVar;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            String str;
            b.c cVar = this.f24658c;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1246t.e(L5.x.a("setup_future_usage", str));
        }

        public final b.c c() {
            return this.f24658c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f24658c == ((d) obj).f24658c;
        }

        public int hashCode() {
            b.c cVar = this.f24658c;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "USBankAccount(setupFutureUsage=" + this.f24658c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            b.c cVar = this.f24658c;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends r {

        /* renamed from: c */
        private String f24661c;

        /* renamed from: d */
        public static final a f24659d = new a(null);

        /* renamed from: e */
        public static final int f24660e = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

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
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String appId) {
            super(o.p.f24497C, null);
            AbstractC3159y.i(appId, "appId");
            this.f24661c = appId;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.p(L5.x.a("client", "android"), L5.x.a(MBridgeConstans.APP_ID, this.f24661c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC3159y.d(this.f24661c, ((e) obj).f24661c);
        }

        public int hashCode() {
            return this.f24661c.hashCode();
        }

        public String toString() {
            return "WeChatPay(appId=" + this.f24661c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24661c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends r {

        /* renamed from: c */
        public static final f f24662c = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return f.f24662c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        private f() {
            super(o.p.f24497C, null);
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.e(L5.x.a("client", "mobile_web"));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    public /* synthetic */ r(o.p pVar, AbstractC3151p abstractC3151p) {
        this(pVar);
    }

    public abstract List b();

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        List<L5.r> b8 = b();
        Map h8 = Q.h();
        for (L5.r rVar : b8) {
            String str = (String) rVar.a();
            Object b9 = rVar.b();
            if (b9 != null) {
                map = Q.e(L5.x.a(str, b9));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        if (!h8.isEmpty()) {
            return Q.e(L5.x.a(this.f24644a.f24537a, h8));
        }
        return Q.h();
    }

    private r(o.p pVar) {
        this.f24644a = pVar;
    }
}
