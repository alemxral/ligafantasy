package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import b3.InterfaceC1863H;
import b3.InterfaceC1874i;
import com.stripe.android.model.m;
import com.stripe.android.model.r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b implements InterfaceC1874i {

    /* renamed from: a, reason: collision with root package name */
    private final p f24202a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24203b;

    /* renamed from: c, reason: collision with root package name */
    private final w f24204c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24205d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24206e;

    /* renamed from: f, reason: collision with root package name */
    private String f24207f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f24208g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24209h;

    /* renamed from: i, reason: collision with root package name */
    private r f24210i;

    /* renamed from: j, reason: collision with root package name */
    private String f24211j;

    /* renamed from: k, reason: collision with root package name */
    private m f24212k;

    /* renamed from: l, reason: collision with root package name */
    private c f24213l;

    /* renamed from: m, reason: collision with root package name */
    private d f24214m;

    /* renamed from: n, reason: collision with root package name */
    private String f24215n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f24200o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f24201p = 8;
    public static final Parcelable.Creator<b> CREATOR = new C0499b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ b c(a aVar, p pVar, String str, Boolean bool, String str2, m mVar, c cVar, d dVar, r rVar, int i8, Object obj) {
            Boolean bool2;
            String str3;
            m mVar2;
            c cVar2;
            d dVar2;
            r rVar2;
            if ((i8 & 4) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i8 & 8) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if ((i8 & 16) != 0) {
                mVar2 = null;
            } else {
                mVar2 = mVar;
            }
            if ((i8 & 32) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 64) != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if ((i8 & 128) != 0) {
                rVar2 = null;
            } else {
                rVar2 = rVar;
            }
            return aVar.b(pVar, str, bool2, str3, mVar2, cVar2, dVar2, rVar2);
        }

        public static /* synthetic */ b e(a aVar, String str, String str2, Boolean bool, r rVar, String str3, m mVar, c cVar, d dVar, int i8, Object obj) {
            Boolean bool2;
            r rVar2;
            String str4;
            m mVar2;
            c cVar2;
            d dVar2;
            if ((i8 & 4) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i8 & 8) != 0) {
                rVar2 = null;
            } else {
                rVar2 = rVar;
            }
            if ((i8 & 16) != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if ((i8 & 32) != 0) {
                mVar2 = null;
            } else {
                mVar2 = mVar;
            }
            if ((i8 & 64) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 128) != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            return aVar.d(str, str2, bool2, rVar2, str4, mVar2, cVar2, dVar2);
        }

        public final b a(String clientSecret, String paymentMethodId, r rVar) {
            r.b bVar;
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            c cVar = null;
            if (rVar instanceof r.b) {
                bVar = (r.b) rVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                cVar = bVar.f();
            }
            AbstractC3151p abstractC3151p = null;
            return new b(null, paymentMethodId, null, null, clientSecret, null, Boolean.FALSE, true, new r.b(null, null, cVar, Boolean.TRUE, 3, abstractC3151p), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 15917, abstractC3151p);
        }

        public final b b(p paymentMethodCreateParams, String clientSecret, Boolean bool, String str, m mVar, c cVar, d dVar, r rVar) {
            AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3159y.i(clientSecret, "clientSecret");
            return new b(paymentMethodCreateParams, null, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8366, null);
        }

        public final b d(String paymentMethodId, String clientSecret, Boolean bool, r rVar, String str, m mVar, c cVar, d dVar) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            AbstractC3159y.i(clientSecret, "clientSecret");
            return new b(null, paymentMethodId, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8365, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0499b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AbstractC3159y.i(parcel, "parcel");
            p createFromParcel = parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            w createFromParcel2 = parcel.readInt() == 0 ? null : w.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b(createFromParcel, readString, createFromParcel2, readString2, readString3, readString4, valueOf, parcel.readInt() != 0, (r) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f24216b = new c("OnSession", 0, "on_session");

        /* renamed from: c, reason: collision with root package name */
        public static final c f24217c = new c("OffSession", 1, "off_session");

        /* renamed from: d, reason: collision with root package name */
        public static final c f24218d = new c("Blank", 2, "");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f24219e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24220f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24221a;

        static {
            c[] a8 = a();
            f24219e = a8;
            f24220f = R5.b.a(a8);
        }

        private c(String str, int i8, String str2) {
            this.f24221a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f24216b, f24217c, f24218d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f24219e.clone();
        }

        public final String b() {
            return this.f24221a;
        }
    }

    public b(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f24202a = pVar;
        this.f24203b = str;
        this.f24204c = wVar;
        this.f24205d = str2;
        this.f24206e = clientSecret;
        this.f24207f = str3;
        this.f24208g = bool;
        this.f24209h = z8;
        this.f24210i = rVar;
        this.f24211j = str4;
        this.f24212k = mVar;
        this.f24213l = cVar;
        this.f24214m = dVar;
        this.f24215n = str5;
    }

    public static /* synthetic */ b c(b bVar, p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, Object obj) {
        return bVar.b((i8 & 1) != 0 ? bVar.f24202a : pVar, (i8 & 2) != 0 ? bVar.f24203b : str, (i8 & 4) != 0 ? bVar.f24204c : wVar, (i8 & 8) != 0 ? bVar.f24205d : str2, (i8 & 16) != 0 ? bVar.f24206e : str3, (i8 & 32) != 0 ? bVar.f24207f : str4, (i8 & 64) != 0 ? bVar.f24208g : bool, (i8 & 128) != 0 ? bVar.f24209h : z8, (i8 & 256) != 0 ? bVar.f24210i : rVar, (i8 & 512) != 0 ? bVar.f24211j : str5, (i8 & 1024) != 0 ? bVar.f24212k : mVar, (i8 & 2048) != 0 ? bVar.f24213l : cVar, (i8 & 4096) != 0 ? bVar.f24214m : dVar, (i8 & 8192) != 0 ? bVar.f24215n : str6);
    }

    private final Map e() {
        Map y8;
        m mVar = this.f24212k;
        if (mVar == null || (y8 = mVar.y()) == null) {
            p pVar = this.f24202a;
            if (pVar != null && pVar.n() && this.f24211j == null) {
                return new m(m.c.a.f24307e.a()).y();
            }
            return null;
        }
        return y8;
    }

    private final Map j() {
        p pVar = this.f24202a;
        if (pVar != null) {
            return Q.e(L5.x.a("payment_method_data", pVar.y()));
        }
        String str = this.f24203b;
        if (str != null) {
            return Q.e(L5.x.a("payment_method", str));
        }
        w wVar = this.f24204c;
        if (wVar != null) {
            return Q.e(L5.x.a("source_data", wVar.y()));
        }
        String str2 = this.f24205d;
        if (str2 != null) {
            return Q.e(L5.x.a("source", str2));
        }
        return Q.h();
    }

    @Override // b3.InterfaceC1874i
    public void W(String str) {
        this.f24207f = str;
    }

    public final b b(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        return new b(pVar, str, wVar, str2, clientSecret, str3, bool, z8, rVar, str4, mVar, cVar, dVar, str5);
    }

    @Override // b3.InterfaceC1874i
    public String d() {
        return this.f24206e;
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
        return AbstractC3159y.d(this.f24202a, bVar.f24202a) && AbstractC3159y.d(this.f24203b, bVar.f24203b) && AbstractC3159y.d(this.f24204c, bVar.f24204c) && AbstractC3159y.d(this.f24205d, bVar.f24205d) && AbstractC3159y.d(this.f24206e, bVar.f24206e) && AbstractC3159y.d(this.f24207f, bVar.f24207f) && AbstractC3159y.d(this.f24208g, bVar.f24208g) && this.f24209h == bVar.f24209h && AbstractC3159y.d(this.f24210i, bVar.f24210i) && AbstractC3159y.d(this.f24211j, bVar.f24211j) && AbstractC3159y.d(this.f24212k, bVar.f24212k) && this.f24213l == bVar.f24213l && AbstractC3159y.d(this.f24214m, bVar.f24214m) && AbstractC3159y.d(this.f24215n, bVar.f24215n);
    }

    public final p f() {
        return this.f24202a;
    }

    public int hashCode() {
        p pVar = this.f24202a;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        String str = this.f24203b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f24204c;
        int hashCode3 = (hashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str2 = this.f24205d;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24206e.hashCode()) * 31;
        String str3 = this.f24207f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f24208g;
        int hashCode6 = (((hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24209h)) * 31;
        r rVar = this.f24210i;
        int hashCode7 = (hashCode6 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str4 = this.f24211j;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        m mVar = this.f24212k;
        int hashCode9 = (hashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        c cVar = this.f24213l;
        int hashCode10 = (hashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f24214m;
        int hashCode11 = (hashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str5 = this.f24215n;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final r i() {
        return this.f24210i;
    }

    public final w k() {
        return this.f24204c;
    }

    @Override // b3.InterfaceC1874i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b C(boolean z8) {
        return c(this, null, null, null, null, null, null, null, z8, null, null, null, null, null, null, 16255, null);
    }

    public String toString() {
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + this.f24202a + ", paymentMethodId=" + this.f24203b + ", sourceParams=" + this.f24204c + ", sourceId=" + this.f24205d + ", clientSecret=" + this.f24206e + ", returnUrl=" + this.f24207f + ", savePaymentMethod=" + this.f24208g + ", useStripeSdk=" + this.f24209h + ", paymentMethodOptions=" + this.f24210i + ", mandateId=" + this.f24211j + ", mandateData=" + this.f24212k + ", setupFutureUsage=" + this.f24213l + ", shipping=" + this.f24214m + ", receiptEmail=" + this.f24215n + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        p pVar = this.f24202a;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24203b);
        w wVar = this.f24204c;
        if (wVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24205d);
        out.writeString(this.f24206e);
        out.writeString(this.f24207f);
        Boolean bool = this.f24208g;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.f24209h ? 1 : 0);
        out.writeParcelable(this.f24210i, i8);
        out.writeString(this.f24211j);
        m mVar = this.f24212k;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        c cVar = this.f24213l;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cVar.name());
        }
        d dVar = this.f24214m;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24215n);
    }

    @Override // b3.InterfaceC1874i
    public String x() {
        return this.f24207f;
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map k8 = Q.k(L5.x.a("client_secret", d()), L5.x.a("use_stripe_sdk", Boolean.valueOf(this.f24209h)));
        Boolean bool = this.f24208g;
        Map map8 = null;
        if (bool != null) {
            map = Q.e(L5.x.a("save_payment_method", bool));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(k8, map);
        String str = this.f24211j;
        if (str != null) {
            map2 = Q.e(L5.x.a("mandate", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        Map e8 = e();
        if (e8 != null) {
            map3 = Q.e(L5.x.a("mandate_data", e8));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q10 = Q.q(q9, map3);
        String x8 = x();
        if (x8 != null) {
            map4 = Q.e(L5.x.a("return_url", x8));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        Map q11 = Q.q(q10, map4);
        r rVar = this.f24210i;
        if (rVar != null) {
            map5 = Q.e(L5.x.a("payment_method_options", rVar.y()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = Q.h();
        }
        Map q12 = Q.q(q11, map5);
        c cVar = this.f24213l;
        if (cVar != null) {
            map6 = Q.e(L5.x.a("setup_future_usage", cVar.b()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = Q.h();
        }
        Map q13 = Q.q(q12, map6);
        d dVar = this.f24214m;
        if (dVar != null) {
            map7 = Q.e(L5.x.a("shipping", dVar.y()));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = Q.h();
        }
        Map q14 = Q.q(Q.q(q13, map7), j());
        String str2 = this.f24215n;
        if (str2 != null) {
            map8 = Q.e(L5.x.a("receipt_email", str2));
        }
        if (map8 == null) {
            map8 = Q.h();
        }
        return Q.q(q14, map8);
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f24223a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24224b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24225c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24226d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24227e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f24222f = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new C0500b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0500b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a address, String name, String str, String str2, String str3) {
            AbstractC3159y.i(address, "address");
            AbstractC3159y.i(name, "name");
            this.f24223a = address;
            this.f24224b = name;
            this.f24225c = str;
            this.f24226d = str2;
            this.f24227e = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f24223a, dVar.f24223a) && AbstractC3159y.d(this.f24224b, dVar.f24224b) && AbstractC3159y.d(this.f24225c, dVar.f24225c) && AbstractC3159y.d(this.f24226d, dVar.f24226d) && AbstractC3159y.d(this.f24227e, dVar.f24227e);
        }

        public int hashCode() {
            int hashCode = ((this.f24223a.hashCode() * 31) + this.f24224b.hashCode()) * 31;
            String str = this.f24225c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24226d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24227e;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f24223a + ", name=" + this.f24224b + ", carrier=" + this.f24225c + ", phone=" + this.f24226d + ", trackingNumber=" + this.f24227e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f24223a.writeToParcel(out, i8);
            out.writeString(this.f24224b);
            out.writeString(this.f24225c);
            out.writeString(this.f24226d);
            out.writeString(this.f24227e);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            List<L5.r> p8 = AbstractC1246t.p(L5.x.a("address", this.f24223a.y()), L5.x.a("name", this.f24224b), L5.x.a("carrier", this.f24225c), L5.x.a(HintConstants.AUTOFILL_HINT_PHONE, this.f24226d), L5.x.a("tracking_number", this.f24227e));
            Map h8 = Q.h();
            for (L5.r rVar : p8) {
                String str = (String) rVar.a();
                Object b8 = rVar.b();
                if (b8 != null) {
                    map = Q.e(L5.x.a(str, b8));
                } else {
                    map = null;
                }
                if (map == null) {
                    map = Q.h();
                }
                h8 = Q.q(h8, map);
            }
            return h8;
        }

        public /* synthetic */ d(com.stripe.android.model.a aVar, String str, String str2, String str3, String str4, int i8, AbstractC3151p abstractC3151p) {
            this(aVar, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ b(p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : pVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : wVar, (i8 & 8) != 0 ? null : str2, str3, (i8 & 32) != 0 ? null : str4, (i8 & 64) != 0 ? null : bool, (i8 & 128) != 0 ? false : z8, (i8 & 256) != 0 ? null : rVar, (i8 & 512) != 0 ? null : str5, (i8 & 1024) != 0 ? null : mVar, (i8 & 2048) != 0 ? null : cVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : str6);
    }
}
