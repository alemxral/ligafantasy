package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import b3.C1864I;
import b3.C1869d;
import b3.InterfaceC1863H;
import b3.K;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.stripe.android.model.o;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24570a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24571b;

    /* renamed from: c, reason: collision with root package name */
    private final c f24572c;

    /* renamed from: d, reason: collision with root package name */
    private final h f24573d;

    /* renamed from: e, reason: collision with root package name */
    private final g f24574e;

    /* renamed from: f, reason: collision with root package name */
    private final k f24575f;

    /* renamed from: g, reason: collision with root package name */
    private final a f24576g;

    /* renamed from: h, reason: collision with root package name */
    private final b f24577h;

    /* renamed from: i, reason: collision with root package name */
    private final l f24578i;

    /* renamed from: j, reason: collision with root package name */
    private final o f24579j;

    /* renamed from: k, reason: collision with root package name */
    private final j f24580k;

    /* renamed from: l, reason: collision with root package name */
    private final n f24581l;

    /* renamed from: m, reason: collision with root package name */
    private final i f24582m;

    /* renamed from: n, reason: collision with root package name */
    private final d f24583n;

    /* renamed from: o, reason: collision with root package name */
    private final m f24584o;

    /* renamed from: p, reason: collision with root package name */
    private final o.e f24585p;

    /* renamed from: q, reason: collision with root package name */
    private final o.b f24586q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f24587r;

    /* renamed from: s, reason: collision with root package name */
    private final Set f24588s;

    /* renamed from: t, reason: collision with root package name */
    private final Map f24589t;

    /* renamed from: u, reason: collision with root package name */
    public static final e f24568u = new e(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f24569v = 8;
    public static final Parcelable.Creator<p> CREATOR = new f();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24592a;

        /* renamed from: b, reason: collision with root package name */
        private String f24593b;

        /* renamed from: c, reason: collision with root package name */
        private static final C0521a f24590c = new C0521a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f24591d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0521a {
            private C0521a() {
            }

            public /* synthetic */ C0521a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String bsbNumber, String accountNumber) {
            AbstractC3159y.i(bsbNumber, "bsbNumber");
            AbstractC3159y.i(accountNumber, "accountNumber");
            this.f24592a = bsbNumber;
            this.f24593b = accountNumber;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f24592a, aVar.f24592a) && AbstractC3159y.d(this.f24593b, aVar.f24593b);
        }

        public int hashCode() {
            return (this.f24592a.hashCode() * 31) + this.f24593b.hashCode();
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f24592a + ", accountNumber=" + this.f24593b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24592a);
            out.writeString(this.f24593b);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            return Q.k(L5.x.a("bsb_number", this.f24592a), L5.x.a("account_number", this.f24593b));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24596a;

        /* renamed from: b, reason: collision with root package name */
        private String f24597b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24594c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f24595d = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0522b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final b a(p params) {
                Map map;
                Object obj;
                String str;
                Object obj2;
                String str2;
                AbstractC3159y.i(params, "params");
                Object obj3 = params.y().get(o.p.f24525o.f24537a);
                if (obj3 instanceof Map) {
                    map = (Map) obj3;
                } else {
                    map = null;
                }
                if (map != null) {
                    obj = map.get("account_number");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (map != null) {
                    obj2 = map.get("sort_code");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                if (str == null || str2 == null) {
                    return null;
                }
                return new b(str, str2);
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.p$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0522b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String accountNumber, String sortCode) {
            AbstractC3159y.i(accountNumber, "accountNumber");
            AbstractC3159y.i(sortCode, "sortCode");
            this.f24596a = accountNumber;
            this.f24597b = sortCode;
        }

        public final String b() {
            return this.f24596a;
        }

        public final String c() {
            return this.f24597b;
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
            return AbstractC3159y.d(this.f24596a, bVar.f24596a) && AbstractC3159y.d(this.f24597b, bVar.f24597b);
        }

        public int hashCode() {
            return (this.f24596a.hashCode() * 31) + this.f24597b.hashCode();
        }

        public String toString() {
            return "BacsDebit(accountNumber=" + this.f24596a + ", sortCode=" + this.f24597b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24596a);
            out.writeString(this.f24597b);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            return Q.k(L5.x.a("account_number", this.f24596a), L5.x.a("sort_code", this.f24597b));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1863H, Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return new d();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
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

    /* loaded from: classes4.dex */
    public static final class e {
        private e() {
        }

        public static /* synthetic */ p e(e eVar, c cVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.a(cVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p f(e eVar, g gVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.b(gVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p g(e eVar, j jVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.c(jVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p h(e eVar, n nVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.d(nVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p n(e eVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                eVar2 = null;
            }
            if ((i8 & 2) != 0) {
                map = null;
            }
            if ((i8 & 4) != 0) {
                bVar = null;
            }
            return eVar.m(eVar2, map, bVar);
        }

        private final String p(p pVar, String str) {
            Object obj;
            Map map;
            Object obj2;
            Map map2 = pVar.f24589t;
            if (map2 != null) {
                obj = map2.get("billing_details");
            } else {
                obj = null;
            }
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                obj2 = map.get(str);
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String)) {
                return null;
            }
            return (String) obj2;
        }

        public final p a(c card, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(card, "card");
            return new p(card, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final p b(g fpx, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(fpx, "fpx");
            return new p(fpx, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final p c(j netbanking, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(netbanking, "netbanking");
            return new p(netbanking, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final p d(n usBankAccount, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(usBankAccount, "usBankAccount");
            return new p(usBankAccount, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final b i(p params) {
            AbstractC3159y.i(params, "params");
            return b.f24594c.a(params);
        }

        public final p j(JSONObject googlePayPaymentData) {
            String str;
            C1869d b8;
            K b9;
            AbstractC3159y.i(googlePayPaymentData, "googlePayPaymentData");
            com.stripe.android.model.k b10 = com.stripe.android.model.k.f24290g.b(googlePayPaymentData);
            C1864I i8 = b10.i();
            String str2 = null;
            if (i8 != null) {
                str = i8.getId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str3 = str;
            if (i8 != null && (b8 = i8.b()) != null && (b9 = b8.b()) != null) {
                str2 = b9.toString();
            }
            return e(this, new c(null, null, null, null, str3, a0.j(str2), null, 79, null), new o.e(b10.b(), b10.c(), b10.e(), b10.f()), null, null, 12, null);
        }

        public final p k(String paymentMethodId, boolean z8, Set productUsage) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            AbstractC3159y.i(productUsage, "productUsage");
            return new p(o.p.f24518h.f24537a, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, productUsage, Q.e(L5.x.a("link", Q.e(L5.x.a("payment_method_id", paymentMethodId)))), 262140, null);
        }

        public final p l(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
            AbstractC3159y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3159y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new p(o.p.f24518h, null, null, null, null, null, null, null, null, null, null, new i(paymentDetailsId, consumerSessionClientSecret, map), null, null, null, null, null, null, null, 522238, null);
        }

        public final p m(o.e eVar, Map map, o.b bVar) {
            return new p(o.p.f24509O, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409598, null);
        }

        public final p o(String code, o.e eVar, boolean z8, Map map, Set productUsage, o.b bVar) {
            AbstractC3159y.i(code, "code");
            AbstractC3159y.i(productUsage, "productUsage");
            return new p(code, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, null, productUsage, map, 163836, null);
        }

        public final String q(p params) {
            String str;
            AbstractC3159y.i(params, "params");
            o.e j8 = params.j();
            if (j8 == null || (str = j8.f24436b) == null) {
                return p(params, NotificationCompat.CATEGORY_EMAIL);
            }
            return str;
        }

        public final String r(p params) {
            String str;
            AbstractC3159y.i(params, "params");
            o.e j8 = params.j();
            if (j8 == null || (str = j8.f24437c) == null) {
                return p(params, "name");
            }
            return str;
        }

        public /* synthetic */ e(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p createFromParcel(Parcel parcel) {
            i iVar;
            n nVar;
            LinkedHashMap linkedHashMap;
            LinkedHashSet linkedHashSet;
            LinkedHashMap linkedHashMap2;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            boolean z8 = parcel.readInt() != 0;
            c createFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            h createFromParcel2 = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
            g createFromParcel3 = parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel);
            k createFromParcel4 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
            a createFromParcel5 = parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel);
            b createFromParcel6 = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            l createFromParcel7 = parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel);
            o createFromParcel8 = parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel);
            j createFromParcel9 = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            n createFromParcel10 = parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel);
            i createFromParcel11 = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            d createFromParcel12 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            m createFromParcel13 = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            o.e createFromParcel14 = parcel.readInt() == 0 ? null : o.e.CREATOR.createFromParcel(parcel);
            o.b createFromParcel15 = parcel.readInt() == 0 ? null : o.b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                nVar = createFromParcel10;
                iVar = createFromParcel11;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                iVar = createFromParcel11;
                int i8 = 0;
                while (i8 != readInt) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                    i8++;
                    readInt = readInt;
                    createFromParcel10 = createFromParcel10;
                }
                nVar = createFromParcel10;
                linkedHashMap = linkedHashMap3;
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt3);
                int i10 = 0;
                while (i10 != readInt3) {
                    linkedHashMap4.put(parcel.readString(), parcel.readValue(p.class.getClassLoader()));
                    i10++;
                    readInt3 = readInt3;
                    linkedHashSet2 = linkedHashSet2;
                }
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = linkedHashMap4;
            }
            return new p(readString, z8, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, nVar, iVar, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, linkedHashMap, linkedHashSet, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p[] newArray(int i8) {
            return new p[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24611a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24609b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24610c = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String str) {
            this.f24611a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && AbstractC3159y.d(this.f24611a, ((g) obj).f24611a);
        }

        public int hashCode() {
            String str = this.f24611a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Fpx(bank=" + this.f24611a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24611a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24611a;
            if (str != null) {
                map = Q.e(L5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24614a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24612b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24613c = 8;
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final h createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new h(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(String str) {
            this.f24614a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC3159y.d(this.f24614a, ((h) obj).f24614a);
        }

        public int hashCode() {
            String str = this.f24614a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Ideal(bank=" + this.f24614a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24614a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24614a;
            if (str != null) {
                map = Q.e(L5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24617a;

        /* renamed from: b, reason: collision with root package name */
        private String f24618b;

        /* renamed from: c, reason: collision with root package name */
        private Map f24619c;

        /* renamed from: d, reason: collision with root package name */
        private static final a f24615d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f24616e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
                LinkedHashMap linkedHashMap;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(i.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new i(readString, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
            AbstractC3159y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3159y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.f24617a = paymentDetailsId;
            this.f24618b = consumerSessionClientSecret;
            this.f24619c = map;
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
            return AbstractC3159y.d(this.f24617a, iVar.f24617a) && AbstractC3159y.d(this.f24618b, iVar.f24618b) && AbstractC3159y.d(this.f24619c, iVar.f24619c);
        }

        public int hashCode() {
            int hashCode = ((this.f24617a.hashCode() * 31) + this.f24618b.hashCode()) * 31;
            Map map = this.f24619c;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Link(paymentDetailsId=" + this.f24617a + ", consumerSessionClientSecret=" + this.f24618b + ", extraParams=" + this.f24619c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24617a);
            out.writeString(this.f24618b);
            Map map = this.f24619c;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map k8 = Q.k(L5.x.a("payment_details_id", this.f24617a), L5.x.a("credentials", Q.e(L5.x.a("consumer_session_client_secret", this.f24618b))));
            Map map = this.f24619c;
            if (map == null) {
                map = Q.h();
            }
            return Q.q(k8, map);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24622a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24620b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24621c = 8;
        public static final Parcelable.Creator<j> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final j createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new j(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i8) {
                return new j[i8];
            }
        }

        public j(String bank) {
            AbstractC3159y.i(bank, "bank");
            this.f24622a = bank;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && AbstractC3159y.d(this.f24622a, ((j) obj).f24622a);
        }

        public int hashCode() {
            return this.f24622a.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f24622a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24622a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            String lowerCase = this.f24622a.toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "toLowerCase(...)");
            return Q.e(L5.x.a("bank", lowerCase));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24625a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24623b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24624c = 8;
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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

        public k(String str) {
            this.f24625a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && AbstractC3159y.d(this.f24625a, ((k) obj).f24625a);
        }

        public int hashCode() {
            String str = this.f24625a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SepaDebit(iban=" + this.f24625a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24625a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24625a;
            if (str != null) {
                map = Q.e(L5.x.a("iban", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24628a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24626b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24627c = 8;
        public static final Parcelable.Creator<l> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final l createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new l(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(String country) {
            AbstractC3159y.i(country, "country");
            this.f24628a = country;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && AbstractC3159y.d(this.f24628a, ((l) obj).f24628a);
        }

        public int hashCode() {
            return this.f24628a.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f24628a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24628a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            String upperCase = this.f24628a.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            return Q.e(L5.x.a("country", upperCase));
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC1863H, Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return new m();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
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

    /* loaded from: classes4.dex */
    public static final class n implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24631a;

        /* renamed from: b, reason: collision with root package name */
        private String f24632b;

        /* renamed from: c, reason: collision with root package name */
        private String f24633c;

        /* renamed from: d, reason: collision with root package name */
        private o.r.c f24634d;

        /* renamed from: e, reason: collision with root package name */
        private o.r.b f24635e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f24629f = new a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f24630g = 8;
        public static final Parcelable.Creator<n> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final n createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.r.c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? o.r.b.CREATOR.createFromParcel(parcel) : null, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i8) {
                return new n[i8];
            }
        }

        public /* synthetic */ n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar, AbstractC3151p abstractC3151p) {
            this(str, str2, str3, cVar, bVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return AbstractC3159y.d(this.f24631a, nVar.f24631a) && AbstractC3159y.d(this.f24632b, nVar.f24632b) && AbstractC3159y.d(this.f24633c, nVar.f24633c) && this.f24634d == nVar.f24634d && this.f24635e == nVar.f24635e;
        }

        public int hashCode() {
            String str = this.f24631a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24632b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24633c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            o.r.c cVar = this.f24634d;
            int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            o.r.b bVar = this.f24635e;
            return hashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(linkAccountSessionId=" + this.f24631a + ", accountNumber=" + this.f24632b + ", routingNumber=" + this.f24633c + ", accountType=" + this.f24634d + ", accountHolderType=" + this.f24635e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24631a);
            out.writeString(this.f24632b);
            out.writeString(this.f24633c);
            o.r.c cVar = this.f24634d;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            o.r.b bVar = this.f24635e;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                bVar.writeToParcel(out, i8);
            }
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            String str = this.f24631a;
            if (str != null) {
                AbstractC3159y.f(str);
                return Q.e(L5.x.a("link_account_session", str));
            }
            String str2 = this.f24632b;
            AbstractC3159y.f(str2);
            L5.r a8 = L5.x.a("account_number", str2);
            String str3 = this.f24633c;
            AbstractC3159y.f(str3);
            L5.r a9 = L5.x.a("routing_number", str3);
            o.r.c cVar = this.f24634d;
            AbstractC3159y.f(cVar);
            L5.r a10 = L5.x.a("account_type", cVar.e());
            o.r.b bVar = this.f24635e;
            AbstractC3159y.f(bVar);
            return Q.k(a8, a9, a10, L5.x.a("account_holder_type", bVar.e()));
        }

        private n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar) {
            this.f24631a = str;
            this.f24632b = str2;
            this.f24633c = str3;
            this.f24634d = cVar;
            this.f24635e = bVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public n(String linkAccountSessionId) {
            this(linkAccountSessionId, null, null, null, null);
            AbstractC3159y.i(linkAccountSessionId, "linkAccountSessionId");
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f24637a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24636b = new a(null);
        public static final Parcelable.Creator<o> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final o createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(String str) {
            this.f24637a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && AbstractC3159y.d(this.f24637a, ((o) obj).f24637a);
        }

        public int hashCode() {
            String str = this.f24637a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f24637a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24637a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24637a;
            if (str != null) {
                map = Q.e(L5.x.a("vpa", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    public /* synthetic */ p(c cVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(cVar, bVar, eVar, map);
    }

    private final Map s() {
        i iVar;
        Map y8;
        String str = this.f24570a;
        Map map = null;
        if (AbstractC3159y.d(str, o.p.f24519i.f24537a)) {
            c cVar = this.f24572c;
            if (cVar != null) {
                y8 = cVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24522l.f24537a)) {
            h hVar = this.f24573d;
            if (hVar != null) {
                y8 = hVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24521k.f24537a)) {
            g gVar = this.f24574e;
            if (gVar != null) {
                y8 = gVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24523m.f24537a)) {
            k kVar = this.f24575f;
            if (kVar != null) {
                y8 = kVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24524n.f24537a)) {
            a aVar = this.f24576g;
            if (aVar != null) {
                y8 = aVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24525o.f24537a)) {
            b bVar = this.f24577h;
            if (bVar != null) {
                y8 = bVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24526p.f24537a)) {
            l lVar = this.f24578i;
            if (lVar != null) {
                y8 = lVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24527q.f24537a)) {
            o oVar = this.f24579j;
            if (oVar != null) {
                y8 = oVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24495A.f24537a)) {
            j jVar = this.f24580k;
            if (jVar != null) {
                y8 = jVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24509O.f24537a)) {
            n nVar = this.f24581l;
            if (nVar != null) {
                y8 = nVar.y();
            }
            y8 = null;
        } else {
            if (AbstractC3159y.d(str, o.p.f24518h.f24537a) && (iVar = this.f24582m) != null) {
                y8 = iVar.y();
            }
            y8 = null;
        }
        if (y8 == null || y8.isEmpty()) {
            y8 = null;
        }
        if (y8 != null) {
            map = Q.e(L5.x.a(this.f24570a, y8));
        }
        if (map == null) {
            return Q.h();
        }
        return map;
    }

    public final String c() {
        Map map;
        Object obj;
        String str;
        Object obj2 = y().get("card");
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            obj = map.get("number");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return g6.n.V0(str, 4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final p e(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(productUsage, "productUsage");
        return new p(code, z8, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC3159y.d(this.f24570a, pVar.f24570a) && this.f24571b == pVar.f24571b && AbstractC3159y.d(this.f24572c, pVar.f24572c) && AbstractC3159y.d(this.f24573d, pVar.f24573d) && AbstractC3159y.d(this.f24574e, pVar.f24574e) && AbstractC3159y.d(this.f24575f, pVar.f24575f) && AbstractC3159y.d(this.f24576g, pVar.f24576g) && AbstractC3159y.d(this.f24577h, pVar.f24577h) && AbstractC3159y.d(this.f24578i, pVar.f24578i) && AbstractC3159y.d(this.f24579j, pVar.f24579j) && AbstractC3159y.d(this.f24580k, pVar.f24580k) && AbstractC3159y.d(this.f24581l, pVar.f24581l) && AbstractC3159y.d(this.f24582m, pVar.f24582m) && AbstractC3159y.d(this.f24583n, pVar.f24583n) && AbstractC3159y.d(this.f24584o, pVar.f24584o) && AbstractC3159y.d(this.f24585p, pVar.f24585p) && this.f24586q == pVar.f24586q && AbstractC3159y.d(this.f24587r, pVar.f24587r) && AbstractC3159y.d(this.f24588s, pVar.f24588s) && AbstractC3159y.d(this.f24589t, pVar.f24589t);
    }

    public int hashCode() {
        int hashCode = ((this.f24570a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24571b)) * 31;
        c cVar = this.f24572c;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        h hVar = this.f24573d;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.f24574e;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        k kVar = this.f24575f;
        int hashCode5 = (hashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        a aVar = this.f24576g;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f24577h;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        l lVar = this.f24578i;
        int hashCode8 = (hashCode7 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        o oVar = this.f24579j;
        int hashCode9 = (hashCode8 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        j jVar = this.f24580k;
        int hashCode10 = (hashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        n nVar = this.f24581l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        i iVar = this.f24582m;
        int hashCode12 = (hashCode11 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        d dVar = this.f24583n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m mVar = this.f24584o;
        int hashCode14 = (hashCode13 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o.e eVar = this.f24585p;
        int hashCode15 = (hashCode14 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        o.b bVar2 = this.f24586q;
        int hashCode16 = (hashCode15 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Map map = this.f24587r;
        int hashCode17 = (((hashCode16 + (map == null ? 0 : map.hashCode())) * 31) + this.f24588s.hashCode()) * 31;
        Map map2 = this.f24589t;
        return hashCode17 + (map2 != null ? map2.hashCode() : 0);
    }

    public final /* synthetic */ Set i() {
        Set f8;
        if (AbstractC3159y.d(this.f24570a, o.p.f24519i.f24537a)) {
            c cVar = this.f24572c;
            if (cVar == null || (f8 = cVar.b()) == null) {
                f8 = a0.f();
            }
            return a0.m(f8, this.f24588s);
        }
        return this.f24588s;
    }

    public final o.e j() {
        return this.f24585p;
    }

    public final String k() {
        return this.f24570a;
    }

    public final boolean n() {
        return this.f24571b;
    }

    public final String o() {
        return this.f24570a;
    }

    public String toString() {
        return "PaymentMethodCreateParams(code=" + this.f24570a + ", requiresMandate=" + this.f24571b + ", card=" + this.f24572c + ", ideal=" + this.f24573d + ", fpx=" + this.f24574e + ", sepaDebit=" + this.f24575f + ", auBecsDebit=" + this.f24576g + ", bacsDebit=" + this.f24577h + ", sofort=" + this.f24578i + ", upi=" + this.f24579j + ", netbanking=" + this.f24580k + ", usBankAccount=" + this.f24581l + ", link=" + this.f24582m + ", cashAppPay=" + this.f24583n + ", swish=" + this.f24584o + ", billingDetails=" + this.f24585p + ", allowRedisplay=" + this.f24586q + ", metadata=" + this.f24587r + ", productUsage=" + this.f24588s + ", overrideParamMap=" + this.f24589t + ")";
    }

    public final String u() {
        Map map;
        Object obj = y().get("link");
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map == null) {
            return null;
        }
        Object obj2 = map.get("payment_method_id");
        if (!(obj2 instanceof String)) {
            return null;
        }
        return (String) obj2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24570a);
        out.writeInt(this.f24571b ? 1 : 0);
        c cVar = this.f24572c;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        h hVar = this.f24573d;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        g gVar = this.f24574e;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        k kVar = this.f24575f;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        a aVar = this.f24576g;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        b bVar = this.f24577h;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
        l lVar = this.f24578i;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        o oVar = this.f24579j;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        j jVar = this.f24580k;
        if (jVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            jVar.writeToParcel(out, i8);
        }
        n nVar = this.f24581l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        i iVar = this.f24582m;
        if (iVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            iVar.writeToParcel(out, i8);
        }
        d dVar = this.f24583n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        m mVar = this.f24584o;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        o.e eVar = this.f24585p;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        o.b bVar2 = this.f24586q;
        if (bVar2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar2.writeToParcel(out, i8);
        }
        Map map = this.f24587r;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
        Set set = this.f24588s;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        Map map2 = this.f24589t;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            out.writeString((String) entry2.getKey());
            out.writeValue(entry2.getValue());
        }
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map map2;
        Map map3 = this.f24589t;
        Map map4 = null;
        if (map3 == null) {
            Map e8 = Q.e(L5.x.a("type", this.f24570a));
            o.e eVar = this.f24585p;
            if (eVar != null) {
                map = Q.e(L5.x.a("billing_details", eVar.y()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(Q.q(e8, map), s());
            Map map5 = this.f24587r;
            if (map5 != null) {
                map2 = Q.e(L5.x.a(TtmlNode.TAG_METADATA, map5));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            map3 = Q.q(q8, map2);
        }
        o.b bVar = this.f24586q;
        if (bVar != null) {
            map4 = Q.e(L5.x.a("allow_redisplay", bVar.e()));
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        return Q.q(map3, map4);
    }

    public /* synthetic */ p(g gVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(gVar, bVar, eVar, map);
    }

    public /* synthetic */ p(j jVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(jVar, bVar, eVar, map);
    }

    public /* synthetic */ p(n nVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(nVar, bVar, eVar, map);
    }

    public p(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(productUsage, "productUsage");
        this.f24570a = code;
        this.f24571b = z8;
        this.f24572c = cVar;
        this.f24573d = hVar;
        this.f24574e = gVar;
        this.f24575f = kVar;
        this.f24576g = aVar;
        this.f24577h = bVar;
        this.f24578i = lVar;
        this.f24579j = oVar;
        this.f24580k = jVar;
        this.f24581l = nVar;
        this.f24582m = iVar;
        this.f24583n = dVar;
        this.f24584o = mVar;
        this.f24585p = eVar;
        this.f24586q = bVar2;
        this.f24587r = map;
        this.f24588s = productUsage;
        this.f24589t = map2;
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f24600a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f24601b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f24602c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24603d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24604e;

        /* renamed from: f, reason: collision with root package name */
        private final Set f24605f;

        /* renamed from: g, reason: collision with root package name */
        private final C0523c f24606g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f24598h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f24599i = 8;
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
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new c(readString, valueOf, valueOf2, readString2, readString3, linkedHashSet, parcel.readInt() != 0 ? C0523c.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* renamed from: com.stripe.android.model.p$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0523c implements InterfaceC1863H, Parcelable {

            /* renamed from: a, reason: collision with root package name */
            private final String f24608a;

            /* renamed from: b, reason: collision with root package name */
            private static final a f24607b = new a(null);
            public static final Parcelable.Creator<C0523c> CREATOR = new b();

            /* renamed from: com.stripe.android.model.p$c$c$a */
            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.p$c$c$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0523c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new C0523c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0523c[] newArray(int i8) {
                    return new C0523c[i8];
                }
            }

            public C0523c(String str) {
                this.f24608a = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if ((obj instanceof C0523c) && AbstractC3159y.d(((C0523c) obj).f24608a, this.f24608a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.f24608a);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.f24608a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24608a);
            }

            @Override // b3.InterfaceC1863H
            public Map y() {
                String str = this.f24608a;
                if (str != null) {
                    return Q.e(L5.x.a("preferred", str));
                }
                return Q.h();
            }
        }

        public c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0523c c0523c) {
            this.f24600a = str;
            this.f24601b = num;
            this.f24602c = num2;
            this.f24603d = str2;
            this.f24604e = str3;
            this.f24605f = set;
            this.f24606g = c0523c;
        }

        public final Set b() {
            return this.f24605f;
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
            return AbstractC3159y.d(this.f24600a, cVar.f24600a) && AbstractC3159y.d(this.f24601b, cVar.f24601b) && AbstractC3159y.d(this.f24602c, cVar.f24602c) && AbstractC3159y.d(this.f24603d, cVar.f24603d) && AbstractC3159y.d(this.f24604e, cVar.f24604e) && AbstractC3159y.d(this.f24605f, cVar.f24605f) && AbstractC3159y.d(this.f24606g, cVar.f24606g);
        }

        public int hashCode() {
            String str = this.f24600a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f24601b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f24602c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f24603d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24604e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set set = this.f24605f;
            int hashCode6 = (hashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            C0523c c0523c = this.f24606g;
            return hashCode6 + (c0523c != null ? c0523c.hashCode() : 0);
        }

        public String toString() {
            return "Card(number=" + this.f24600a + ", expiryMonth=" + this.f24601b + ", expiryYear=" + this.f24602c + ", cvc=" + this.f24603d + ", token=" + this.f24604e + ", attribution=" + this.f24605f + ", networks=" + this.f24606g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24600a);
            Integer num = this.f24601b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f24602c;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f24603d);
            out.writeString(this.f24604e);
            Set set = this.f24605f;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            C0523c c0523c = this.f24606g;
            if (c0523c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c0523c.writeToParcel(out, i8);
            }
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            L5.r rVar;
            L5.r a8 = L5.x.a("number", this.f24600a);
            L5.r a9 = L5.x.a("exp_month", this.f24601b);
            L5.r a10 = L5.x.a("exp_year", this.f24602c);
            L5.r a11 = L5.x.a("cvc", this.f24603d);
            L5.r a12 = L5.x.a("token", this.f24604e);
            C0523c c0523c = this.f24606g;
            if (c0523c != null) {
                map = c0523c.y();
            } else {
                map = null;
            }
            List<L5.r> p8 = AbstractC1246t.p(a8, a9, a10, a11, a12, L5.x.a("networks", map));
            ArrayList arrayList = new ArrayList();
            for (L5.r rVar2 : p8) {
                Object d8 = rVar2.d();
                if (d8 != null) {
                    rVar = L5.x.a(rVar2.c(), d8);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            return Q.w(arrayList);
        }

        public /* synthetic */ c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0523c c0523c, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? null : num2, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? null : set, (i8 & 64) != 0 ? null : c0523c);
        }
    }

    public /* synthetic */ p(String str, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3151p abstractC3151p) {
        this(str, z8, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : hVar, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? null : kVar, (i8 & 64) != 0 ? null : aVar, (i8 & 128) != 0 ? null : bVar, (i8 & 256) != 0 ? null : lVar, (i8 & 512) != 0 ? null : oVar, (i8 & 1024) != 0 ? null : jVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : iVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : mVar, (32768 & i8) != 0 ? null : eVar, (65536 & i8) != 0 ? null : bVar2, (131072 & i8) != 0 ? null : map, (262144 & i8) != 0 ? a0.f() : set, (i8 & 524288) != 0 ? null : map2);
    }

    public /* synthetic */ p(o.p pVar, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3151p abstractC3151p) {
        this(pVar, (i8 & 2) != 0 ? null : cVar, (i8 & 4) != 0 ? null : hVar, (i8 & 8) != 0 ? null : gVar, (i8 & 16) != 0 ? null : kVar, (i8 & 32) != 0 ? null : aVar, (i8 & 64) != 0 ? null : bVar, (i8 & 128) != 0 ? null : lVar, (i8 & 256) != 0 ? null : oVar, (i8 & 512) != 0 ? null : jVar, (i8 & 1024) != 0 ? null : nVar, (i8 & 2048) != 0 ? null : iVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : mVar, (i8 & 16384) != 0 ? null : eVar, (i8 & 32768) != 0 ? null : bVar2, (i8 & 65536) != 0 ? null : map, (i8 & 131072) != 0 ? a0.f() : set, (i8 & 262144) == 0 ? map2 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(o.p type, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        this(type.f24537a, type.f24540d, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(productUsage, "productUsage");
    }

    private p(c cVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24519i, cVar, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409596, null);
    }

    private p(g gVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24521k, null, null, gVar, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409590, null);
    }

    private p(j jVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24495A, null, null, null, null, null, null, null, null, jVar, null, null, null, null, eVar, bVar, map, null, null, 409086, null);
    }

    private p(n nVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24509O, null, null, null, null, null, null, null, null, null, nVar, null, null, null, eVar, bVar, map, null, null, 408574, null);
    }
}
