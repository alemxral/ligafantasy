package com.stripe.android.model;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import b3.C1858C;
import b3.EnumC1870e;
import b3.InterfaceC1863H;
import d3.AbstractC2554a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class o implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f24395a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f24396b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24397c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24398d;

    /* renamed from: e, reason: collision with root package name */
    public final p f24399e;

    /* renamed from: f, reason: collision with root package name */
    public final e f24400f;

    /* renamed from: g, reason: collision with root package name */
    public final String f24401g;

    /* renamed from: h, reason: collision with root package name */
    public final g f24402h;

    /* renamed from: i, reason: collision with root package name */
    public final h f24403i;

    /* renamed from: j, reason: collision with root package name */
    public final k f24404j;

    /* renamed from: k, reason: collision with root package name */
    public final l f24405k;

    /* renamed from: l, reason: collision with root package name */
    public final n f24406l;

    /* renamed from: m, reason: collision with root package name */
    public final c f24407m;

    /* renamed from: n, reason: collision with root package name */
    public final d f24408n;

    /* renamed from: o, reason: collision with root package name */
    public final C0520o f24409o;

    /* renamed from: p, reason: collision with root package name */
    public final s f24410p;

    /* renamed from: q, reason: collision with root package name */
    public final m f24411q;

    /* renamed from: r, reason: collision with root package name */
    public final r f24412r;

    /* renamed from: s, reason: collision with root package name */
    public final b f24413s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f24393t = new i(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f24394u = 8;
    public static final Parcelable.Creator<o> CREATOR = new j();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements v2.f {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public static final b f24421b = new b("UNSPECIFIED", 0, "unspecified");

        /* renamed from: c, reason: collision with root package name */
        public static final b f24422c = new b("LIMITED", 1, "limited");

        /* renamed from: d, reason: collision with root package name */
        public static final b f24423d = new b("ALWAYS", 2, "always");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f24424e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24425f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24426a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] b8 = b();
            f24424e = b8;
            f24425f = R5.b.a(b8);
            CREATOR = new a();
        }

        private b(String str, int i8, String str2) {
            this.f24426a = str2;
        }

        private static final /* synthetic */ b[] b() {
            return new b[]{f24421b, f24422c, f24423d};
        }

        public static R5.a c() {
            return f24425f;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24424e.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f24426a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(name());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24427a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24428b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24429c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, String str2, String str3) {
            super(null);
            this.f24427a = str;
            this.f24428b = str2;
            this.f24429c = str3;
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
            return AbstractC3159y.d(this.f24427a, cVar.f24427a) && AbstractC3159y.d(this.f24428b, cVar.f24428b) && AbstractC3159y.d(this.f24429c, cVar.f24429c);
        }

        public int hashCode() {
            String str = this.f24427a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24428b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24429c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f24427a + ", fingerprint=" + this.f24428b + ", last4=" + this.f24429c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24427a);
            out.writeString(this.f24428b);
            out.writeString(this.f24429c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends q {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24430a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24431b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24432c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3) {
            super(null);
            this.f24430a = str;
            this.f24431b = str2;
            this.f24432c = str3;
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
            return AbstractC3159y.d(this.f24430a, dVar.f24430a) && AbstractC3159y.d(this.f24431b, dVar.f24431b) && AbstractC3159y.d(this.f24432c, dVar.f24432c);
        }

        public int hashCode() {
            String str = this.f24430a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24431b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24432c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + this.f24430a + ", last4=" + this.f24431b + ", sortCode=" + this.f24432c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24430a);
            out.writeString(this.f24431b);
            out.writeString(this.f24432c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private String f24443a;

        /* renamed from: b, reason: collision with root package name */
        private Long f24444b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f24445c;

        /* renamed from: d, reason: collision with root package name */
        private p f24446d;

        /* renamed from: e, reason: collision with root package name */
        private String f24447e;

        /* renamed from: f, reason: collision with root package name */
        private e f24448f;

        /* renamed from: g, reason: collision with root package name */
        private b f24449g;

        /* renamed from: h, reason: collision with root package name */
        private String f24450h;

        /* renamed from: i, reason: collision with root package name */
        private g f24451i;

        /* renamed from: j, reason: collision with root package name */
        private h f24452j;

        /* renamed from: k, reason: collision with root package name */
        private l f24453k;

        /* renamed from: l, reason: collision with root package name */
        private k f24454l;

        /* renamed from: m, reason: collision with root package name */
        private n f24455m;

        /* renamed from: n, reason: collision with root package name */
        private c f24456n;

        /* renamed from: o, reason: collision with root package name */
        private d f24457o;

        /* renamed from: p, reason: collision with root package name */
        private C0520o f24458p;

        /* renamed from: q, reason: collision with root package name */
        private m f24459q;

        /* renamed from: r, reason: collision with root package name */
        private r f24460r;

        /* renamed from: s, reason: collision with root package name */
        private s f24461s;

        public final o a() {
            String str = this.f24443a;
            Long l8 = this.f24444b;
            boolean z8 = this.f24445c;
            p pVar = this.f24446d;
            return new o(str, l8, z8, this.f24447e, pVar, this.f24448f, this.f24450h, this.f24451i, this.f24452j, this.f24454l, this.f24453k, this.f24455m, this.f24456n, this.f24457o, this.f24458p, null, this.f24459q, this.f24460r, this.f24449g, 32768, null);
        }

        public final f b(b bVar) {
            this.f24449g = bVar;
            return this;
        }

        public final f c(c cVar) {
            this.f24456n = cVar;
            return this;
        }

        public final f d(d dVar) {
            this.f24457o = dVar;
            return this;
        }

        public final f e(e eVar) {
            this.f24448f = eVar;
            return this;
        }

        public final f f(g gVar) {
            this.f24451i = gVar;
            return this;
        }

        public final f g(h hVar) {
            this.f24452j = hVar;
            return this;
        }

        public final f h(String str) {
            this.f24447e = str;
            return this;
        }

        public final f i(Long l8) {
            this.f24444b = l8;
            return this;
        }

        public final f j(String str) {
            this.f24450h = str;
            return this;
        }

        public final f k(k kVar) {
            this.f24454l = kVar;
            return this;
        }

        public final f l(String str) {
            this.f24443a = str;
            return this;
        }

        public final f m(l lVar) {
            this.f24453k = lVar;
            return this;
        }

        public final f n(boolean z8) {
            this.f24445c = z8;
            return this;
        }

        public final f o(m mVar) {
            this.f24459q = mVar;
            return this;
        }

        public final f p(n nVar) {
            this.f24455m = nVar;
            return this;
        }

        public final f q(C0520o c0520o) {
            this.f24458p = c0520o;
            return this;
        }

        public final f r(p pVar) {
            this.f24446d = pVar;
            return this;
        }

        public final f s(r rVar) {
            this.f24460r = rVar;
            return this;
        }

        public final f t(s sVar) {
            this.f24461s = sVar;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends q {
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final a f24481b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ h f24482c;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f24483a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final h a() {
                return h.f24482c;
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
                return new h(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        static {
            AbstractC3151p abstractC3151p = null;
            f24481b = new a(abstractC3151p);
            f24482c = new h(false, 1, abstractC3151p);
        }

        public /* synthetic */ h(boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? true : z8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f24483a == ((h) obj).f24483a;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f24483a);
        }

        public String toString() {
            return "CardPresent(ignore=" + this.f24483a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f24483a ? 1 : 0);
        }

        public h(boolean z8) {
            super(null);
            this.f24483a = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i {
        private i() {
        }

        public /* synthetic */ i(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new o(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C0520o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : s.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o[] newArray(int i8) {
            return new o[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends q {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24484a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24485b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new k(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        public k(String str, String str2) {
            super(null);
            this.f24484a = str;
            this.f24485b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return AbstractC3159y.d(this.f24484a, kVar.f24484a) && AbstractC3159y.d(this.f24485b, kVar.f24485b);
        }

        public int hashCode() {
            String str = this.f24484a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24485b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + this.f24484a + ", accountHolderType=" + this.f24485b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24484a);
            out.writeString(this.f24485b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends q {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24486a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24487b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new l(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(String str, String str2) {
            super(null);
            this.f24486a = str;
            this.f24487b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return AbstractC3159y.d(this.f24486a, lVar.f24486a) && AbstractC3159y.d(this.f24487b, lVar.f24487b);
        }

        public int hashCode() {
            String str = this.f24486a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24487b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + this.f24486a + ", bankIdentifierCode=" + this.f24487b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24486a);
            out.writeString(this.f24487b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends q {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24488a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new m(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        public m(String str) {
            super(null);
            this.f24488a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && AbstractC3159y.d(this.f24488a, ((m) obj).f24488a);
        }

        public int hashCode() {
            String str = this.f24488a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f24488a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24488a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends q {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24489a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24490b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24491c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24492d;

        /* renamed from: e, reason: collision with root package name */
        public final String f24493e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i8) {
                return new n[i8];
            }
        }

        public n(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.f24489a = str;
            this.f24490b = str2;
            this.f24491c = str3;
            this.f24492d = str4;
            this.f24493e = str5;
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
            return AbstractC3159y.d(this.f24489a, nVar.f24489a) && AbstractC3159y.d(this.f24490b, nVar.f24490b) && AbstractC3159y.d(this.f24491c, nVar.f24491c) && AbstractC3159y.d(this.f24492d, nVar.f24492d) && AbstractC3159y.d(this.f24493e, nVar.f24493e);
        }

        public int hashCode() {
            String str = this.f24489a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24490b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24491c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24492d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24493e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f24489a + ", branchCode=" + this.f24490b + ", country=" + this.f24491c + ", fingerprint=" + this.f24492d + ", last4=" + this.f24493e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24489a);
            out.writeString(this.f24490b);
            out.writeString(this.f24491c);
            out.writeString(this.f24492d);
            out.writeString(this.f24493e);
        }
    }

    /* renamed from: com.stripe.android.model.o$o, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0520o extends q {
        public static final Parcelable.Creator<C0520o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24494a;

        /* renamed from: com.stripe.android.model.o$o$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0520o createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0520o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0520o[] newArray(int i8) {
                return new C0520o[i8];
            }
        }

        public C0520o(String str) {
            super(null);
            this.f24494a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0520o) && AbstractC3159y.d(this.f24494a, ((C0520o) obj).f24494a);
        }

        public int hashCode() {
            String str = this.f24494a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f24494a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24494a);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class q implements v2.f {
        private q() {
        }

        public /* synthetic */ q(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends q {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final b f24543a;

        /* renamed from: b, reason: collision with root package name */
        public final c f24544b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24545c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24546d;

        /* renamed from: e, reason: collision with root package name */
        public final String f24547e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24548f;

        /* renamed from: g, reason: collision with root package name */
        public final d f24549g;

        /* renamed from: h, reason: collision with root package name */
        public final String f24550h;

        /* renamed from: i, reason: collision with root package name */
        public final String f24551i;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new r(b.CREATOR.createFromParcel(parcel), c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i8) {
                return new r[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b implements v2.f {
            public static final Parcelable.Creator<b> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final b f24552b = new b("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final b f24553c = new b("INDIVIDUAL", 1, "individual");

            /* renamed from: d, reason: collision with root package name */
            public static final b f24554d = new b("COMPANY", 2, "company");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ b[] f24555e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24556f;

            /* renamed from: a, reason: collision with root package name */
            private final String f24557a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return b.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            static {
                b[] b8 = b();
                f24555e = b8;
                f24556f = R5.b.a(b8);
                CREATOR = new a();
            }

            private b(String str, int i8, String str2) {
                this.f24557a = str2;
            }

            private static final /* synthetic */ b[] b() {
                return new b[]{f24552b, f24553c, f24554d};
            }

            public static R5.a c() {
                return f24556f;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f24555e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f24557a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c implements v2.f {
            public static final Parcelable.Creator<c> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final c f24558b = new c("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final c f24559c = new c("CHECKING", 1, "checking");

            /* renamed from: d, reason: collision with root package name */
            public static final c f24560d = new c("SAVINGS", 2, "savings");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ c[] f24561e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24562f;

            /* renamed from: a, reason: collision with root package name */
            private final String f24563a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return c.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            static {
                c[] b8 = b();
                f24561e = b8;
                f24562f = R5.b.a(b8);
                CREATOR = new a();
            }

            private c(String str, int i8, String str2) {
                this.f24563a = str2;
            }

            private static final /* synthetic */ c[] b() {
                return new c[]{f24558b, f24559c, f24560d};
            }

            public static R5.a c() {
                return f24562f;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f24561e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f24563a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements v2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24564a;

            /* renamed from: b, reason: collision with root package name */
            private final List f24565b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(String str, List supported) {
                AbstractC3159y.i(supported, "supported");
                this.f24564a = str;
                this.f24565b = supported;
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
                return AbstractC3159y.d(this.f24564a, dVar.f24564a) && AbstractC3159y.d(this.f24565b, dVar.f24565b);
            }

            public int hashCode() {
                String str = this.f24564a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f24565b.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + this.f24564a + ", supported=" + this.f24565b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24564a);
                out.writeStringList(this.f24565b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(b accountHolderType, c accountType, String str, String str2, String str3, String str4, d dVar, String str5) {
            super(null);
            AbstractC3159y.i(accountHolderType, "accountHolderType");
            AbstractC3159y.i(accountType, "accountType");
            this.f24543a = accountHolderType;
            this.f24544b = accountType;
            this.f24545c = str;
            this.f24546d = str2;
            this.f24547e = str3;
            this.f24548f = str4;
            this.f24549g = dVar;
            this.f24550h = str5;
            this.f24551i = str4;
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
            return this.f24543a == rVar.f24543a && this.f24544b == rVar.f24544b && AbstractC3159y.d(this.f24545c, rVar.f24545c) && AbstractC3159y.d(this.f24546d, rVar.f24546d) && AbstractC3159y.d(this.f24547e, rVar.f24547e) && AbstractC3159y.d(this.f24548f, rVar.f24548f) && AbstractC3159y.d(this.f24549g, rVar.f24549g) && AbstractC3159y.d(this.f24550h, rVar.f24550h);
        }

        public int hashCode() {
            int hashCode = ((this.f24543a.hashCode() * 31) + this.f24544b.hashCode()) * 31;
            String str = this.f24545c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24546d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24547e;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24548f;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f24549g;
            int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str5 = this.f24550h;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.f24543a + ", accountType=" + this.f24544b + ", bankName=" + this.f24545c + ", fingerprint=" + this.f24546d + ", last4=" + this.f24547e + ", financialConnectionsAccount=" + this.f24548f + ", networks=" + this.f24549g + ", routingNumber=" + this.f24550h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f24543a.writeToParcel(out, i8);
            this.f24544b.writeToParcel(out, i8);
            out.writeString(this.f24545c);
            out.writeString(this.f24546d);
            out.writeString(this.f24547e);
            out.writeString(this.f24548f);
            d dVar = this.f24549g;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24550h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends q {
        public static final Parcelable.Creator<s> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24566a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new s(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i8) {
                return new s[i8];
            }
        }

        public s(String str) {
            super(null);
            this.f24566a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && AbstractC3159y.d(this.f24566a, ((s) obj).f24566a);
        }

        public int hashCode() {
            String str = this.f24566a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f24566a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24566a);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class t {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24567a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f24519i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f24520j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f24521k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.f24522l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.f24523m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.f24524n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.f24525o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.f24526p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.f24509O.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f24567a = iArr;
        }
    }

    public o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0520o c0520o, s sVar, m mVar, r rVar, b bVar) {
        this.f24395a = str;
        this.f24396b = l8;
        this.f24397c = z8;
        this.f24398d = str2;
        this.f24399e = pVar;
        this.f24400f = eVar;
        this.f24401g = str3;
        this.f24402h = gVar;
        this.f24403i = hVar;
        this.f24404j = kVar;
        this.f24405k = lVar;
        this.f24406l = nVar;
        this.f24407m = cVar;
        this.f24408n = dVar;
        this.f24409o = c0520o;
        this.f24410p = sVar;
        this.f24411q = mVar;
        this.f24412r = rVar;
        this.f24413s = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r3 = this;
            com.stripe.android.model.o$p r0 = r3.f24399e
            if (r0 != 0) goto L6
            r0 = -1
            goto Le
        L6:
            int[] r1 = com.stripe.android.model.o.t.f24567a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        Le:
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L29;
                case 6: goto L24;
                case 7: goto L1f;
                case 8: goto L1a;
                case 9: goto L15;
                default: goto L13;
            }
        L13:
            r1 = 1
            goto L42
        L15:
            com.stripe.android.model.o$r r0 = r3.f24412r
            if (r0 == 0) goto L42
            goto L13
        L1a:
            com.stripe.android.model.o$o r0 = r3.f24409o
            if (r0 == 0) goto L42
            goto L13
        L1f:
            com.stripe.android.model.o$d r0 = r3.f24408n
            if (r0 == 0) goto L42
            goto L13
        L24:
            com.stripe.android.model.o$c r0 = r3.f24407m
            if (r0 == 0) goto L42
            goto L13
        L29:
            com.stripe.android.model.o$n r0 = r3.f24406l
            if (r0 == 0) goto L42
            goto L13
        L2e:
            com.stripe.android.model.o$l r0 = r3.f24405k
            if (r0 == 0) goto L42
            goto L13
        L33:
            com.stripe.android.model.o$k r0 = r3.f24404j
            if (r0 == 0) goto L42
            goto L13
        L38:
            com.stripe.android.model.o$h r0 = r3.f24403i
            if (r0 == 0) goto L42
            goto L13
        L3d:
            com.stripe.android.model.o$g r0 = r3.f24402h
            if (r0 == 0) goto L42
            goto L13
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.o.b():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC3159y.d(this.f24395a, oVar.f24395a) && AbstractC3159y.d(this.f24396b, oVar.f24396b) && this.f24397c == oVar.f24397c && AbstractC3159y.d(this.f24398d, oVar.f24398d) && this.f24399e == oVar.f24399e && AbstractC3159y.d(this.f24400f, oVar.f24400f) && AbstractC3159y.d(this.f24401g, oVar.f24401g) && AbstractC3159y.d(this.f24402h, oVar.f24402h) && AbstractC3159y.d(this.f24403i, oVar.f24403i) && AbstractC3159y.d(this.f24404j, oVar.f24404j) && AbstractC3159y.d(this.f24405k, oVar.f24405k) && AbstractC3159y.d(this.f24406l, oVar.f24406l) && AbstractC3159y.d(this.f24407m, oVar.f24407m) && AbstractC3159y.d(this.f24408n, oVar.f24408n) && AbstractC3159y.d(this.f24409o, oVar.f24409o) && AbstractC3159y.d(this.f24410p, oVar.f24410p) && AbstractC3159y.d(this.f24411q, oVar.f24411q) && AbstractC3159y.d(this.f24412r, oVar.f24412r) && this.f24413s == oVar.f24413s;
    }

    public int hashCode() {
        String str = this.f24395a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f24396b;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24397c)) * 31;
        String str2 = this.f24398d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p pVar = this.f24399e;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        e eVar = this.f24400f;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str3 = this.f24401g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.f24402h;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f24403i;
        int hashCode8 = (hashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        k kVar = this.f24404j;
        int hashCode9 = (hashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.f24405k;
        int hashCode10 = (hashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.f24406l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        c cVar = this.f24407m;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f24408n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C0520o c0520o = this.f24409o;
        int hashCode14 = (hashCode13 + (c0520o == null ? 0 : c0520o.hashCode())) * 31;
        s sVar = this.f24410p;
        int hashCode15 = (hashCode14 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        m mVar = this.f24411q;
        int hashCode16 = (hashCode15 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        r rVar = this.f24412r;
        int hashCode17 = (hashCode16 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        b bVar = this.f24413s;
        return hashCode17 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + this.f24395a + ", created=" + this.f24396b + ", liveMode=" + this.f24397c + ", code=" + this.f24398d + ", type=" + this.f24399e + ", billingDetails=" + this.f24400f + ", customerId=" + this.f24401g + ", card=" + this.f24402h + ", cardPresent=" + this.f24403i + ", fpx=" + this.f24404j + ", ideal=" + this.f24405k + ", sepaDebit=" + this.f24406l + ", auBecsDebit=" + this.f24407m + ", bacsDebit=" + this.f24408n + ", sofort=" + this.f24409o + ", upi=" + this.f24410p + ", netbanking=" + this.f24411q + ", usBankAccount=" + this.f24412r + ", allowRedisplay=" + this.f24413s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24395a);
        Long l8 = this.f24396b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeInt(this.f24397c ? 1 : 0);
        out.writeString(this.f24398d);
        p pVar = this.f24399e;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        e eVar = this.f24400f;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24401g);
        g gVar = this.f24402h;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f24403i;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        k kVar = this.f24404j;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        l lVar = this.f24405k;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        n nVar = this.f24406l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        c cVar = this.f24407m;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        d dVar = this.f24408n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        C0520o c0520o = this.f24409o;
        if (c0520o == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0520o.writeToParcel(out, i8);
        }
        s sVar = this.f24410p;
        if (sVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sVar.writeToParcel(out, i8);
        }
        m mVar = this.f24411q;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        r rVar = this.f24412r;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        b bVar = this.f24413s;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface a extends Parcelable {

        /* renamed from: com.stripe.android.model.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0515a implements a {

            /* renamed from: b, reason: collision with root package name */
            private static final boolean f24415b = false;

            /* renamed from: a, reason: collision with root package name */
            public static final C0515a f24414a = new C0515a();

            /* renamed from: c, reason: collision with root package name */
            private static final int f24416c = 5;
            public static final Parcelable.Creator<C0515a> CREATOR = new C0516a();

            /* renamed from: com.stripe.android.model.o$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0516a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0515a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.readInt();
                    return C0515a.f24414a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0515a[] newArray(int i8) {
                    return new C0515a[i8];
                }
            }

            private C0515a() {
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return f24416c;
            }

            @Override // com.stripe.android.model.o.a
            public boolean U() {
                return f24415b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0515a);
            }

            public int hashCode() {
                return -1728259977;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(1);
            }
        }

        int M();

        boolean U();

        /* loaded from: classes4.dex */
        public static final class b implements a {
            public static final Parcelable.Creator<b> CREATOR = new C0517a();

            /* renamed from: a, reason: collision with root package name */
            private final int f24417a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f24418b;

            /* renamed from: com.stripe.android.model.o$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0517a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(int i8) {
                this.f24417a = i8;
                this.f24418b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return this.f24417a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean U() {
                return this.f24418b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f24417a == ((b) obj).f24417a;
            }

            public int hashCode() {
                return this.f24417a;
            }

            public String toString() {
                return "Poll(retryCount=" + this.f24417a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24417a);
            }

            public /* synthetic */ b(int i8, int i9, AbstractC3151p abstractC3151p) {
                this((i9 & 1) != 0 ? 5 : i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements a {
            public static final Parcelable.Creator<c> CREATOR = new C0518a();

            /* renamed from: a, reason: collision with root package name */
            private final int f24419a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f24420b;

            /* renamed from: com.stripe.android.model.o$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0518a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(int i8) {
                this.f24419a = i8;
                this.f24420b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return this.f24419a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean U() {
                return this.f24420b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f24419a == ((c) obj).f24419a;
            }

            public int hashCode() {
                return this.f24419a;
            }

            public String toString() {
                return "Refresh(retryCount=" + this.f24419a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24419a);
            }

            public /* synthetic */ c(int i8, int i9, AbstractC3151p abstractC3151p) {
                this((i9 & 1) != 0 ? 1 : i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends q {
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final EnumC1870e f24462a;

        /* renamed from: b, reason: collision with root package name */
        public final a f24463b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24464c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f24465d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f24466e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24467f;

        /* renamed from: g, reason: collision with root package name */
        public final String f24468g;

        /* renamed from: h, reason: collision with root package name */
        public final String f24469h;

        /* renamed from: i, reason: collision with root package name */
        public final d f24470i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC2554a f24471j;

        /* renamed from: k, reason: collision with root package name */
        public final c f24472k;

        /* renamed from: l, reason: collision with root package name */
        public final String f24473l;

        /* loaded from: classes4.dex */
        public static final class a implements v2.f {
            public static final Parcelable.Creator<a> CREATOR = new C0519a();

            /* renamed from: a, reason: collision with root package name */
            public final String f24474a;

            /* renamed from: b, reason: collision with root package name */
            public final String f24475b;

            /* renamed from: c, reason: collision with root package name */
            public final String f24476c;

            /* renamed from: com.stripe.android.model.o$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0519a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String str, String str2, String str3) {
                this.f24474a = str;
                this.f24475b = str2;
                this.f24476c = str3;
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
                return AbstractC3159y.d(this.f24474a, aVar.f24474a) && AbstractC3159y.d(this.f24475b, aVar.f24475b) && AbstractC3159y.d(this.f24476c, aVar.f24476c);
            }

            public int hashCode() {
                String str = this.f24474a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f24475b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f24476c;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + this.f24474a + ", addressPostalCodeCheck=" + this.f24475b + ", cvcCheck=" + this.f24476c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24474a);
                out.writeString(this.f24475b);
                out.writeString(this.f24476c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(EnumC1870e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), (AbstractC2554a) parcel.readParcelable(g.class.getClassLoader()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements v2.f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Set f24477a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f24478b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24479c;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(Set available, boolean z8, String str) {
                AbstractC3159y.i(available, "available");
                this.f24477a = available;
                this.f24478b = z8;
                this.f24479c = str;
            }

            public final Set b() {
                return this.f24477a;
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
                return AbstractC3159y.d(this.f24477a, cVar.f24477a) && this.f24478b == cVar.f24478b && AbstractC3159y.d(this.f24479c, cVar.f24479c);
            }

            public int hashCode() {
                int hashCode = ((this.f24477a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24478b)) * 31;
                String str = this.f24479c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.f24477a + ", selectionMandatory=" + this.f24478b + ", preferred=" + this.f24479c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                Set set = this.f24477a;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f24478b ? 1 : 0);
                out.writeString(this.f24479c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements v2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public final boolean f24480a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new d(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(boolean z8) {
                this.f24480a = z8;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f24480a == ((d) obj).f24480a;
            }

            public int hashCode() {
                return androidx.compose.foundation.a.a(this.f24480a);
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.f24480a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24480a ? 1 : 0);
            }
        }

        public /* synthetic */ g(EnumC1870e enumC1870e, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2554a abstractC2554a, c cVar, String str5, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? EnumC1870e.f14433w : enumC1870e, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : num, (i8 & 16) != 0 ? null : num2, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : str4, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : abstractC2554a, (i8 & 1024) != 0 ? null : cVar, (i8 & 2048) == 0 ? str5 : null);
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
            return this.f24462a == gVar.f24462a && AbstractC3159y.d(this.f24463b, gVar.f24463b) && AbstractC3159y.d(this.f24464c, gVar.f24464c) && AbstractC3159y.d(this.f24465d, gVar.f24465d) && AbstractC3159y.d(this.f24466e, gVar.f24466e) && AbstractC3159y.d(this.f24467f, gVar.f24467f) && AbstractC3159y.d(this.f24468g, gVar.f24468g) && AbstractC3159y.d(this.f24469h, gVar.f24469h) && AbstractC3159y.d(this.f24470i, gVar.f24470i) && AbstractC3159y.d(this.f24471j, gVar.f24471j) && AbstractC3159y.d(this.f24472k, gVar.f24472k) && AbstractC3159y.d(this.f24473l, gVar.f24473l);
        }

        public int hashCode() {
            int hashCode = this.f24462a.hashCode() * 31;
            a aVar = this.f24463b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f24464c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f24465d;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f24466e;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f24467f;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24468g;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24469h;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f24470i;
            int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            AbstractC2554a abstractC2554a = this.f24471j;
            int hashCode10 = (hashCode9 + (abstractC2554a == null ? 0 : abstractC2554a.hashCode())) * 31;
            c cVar = this.f24472k;
            int hashCode11 = (hashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.f24473l;
            return hashCode11 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.f24462a + ", checks=" + this.f24463b + ", country=" + this.f24464c + ", expiryMonth=" + this.f24465d + ", expiryYear=" + this.f24466e + ", fingerprint=" + this.f24467f + ", funding=" + this.f24468g + ", last4=" + this.f24469h + ", threeDSecureUsage=" + this.f24470i + ", wallet=" + this.f24471j + ", networks=" + this.f24472k + ", displayBrand=" + this.f24473l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24462a.name());
            a aVar = this.f24463b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24464c);
            Integer num = this.f24465d;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f24466e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f24467f);
            out.writeString(this.f24468g);
            out.writeString(this.f24469h);
            d dVar = this.f24470i;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f24471j, i8);
            c cVar = this.f24472k;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24473l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC1870e brand, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2554a abstractC2554a, c cVar, String str5) {
            super(null);
            AbstractC3159y.i(brand, "brand");
            this.f24462a = brand;
            this.f24463b = aVar;
            this.f24464c = str;
            this.f24465d = num;
            this.f24466e = num2;
            this.f24467f = str2;
            this.f24468g = str3;
            this.f24469h = str4;
            this.f24470i = dVar;
            this.f24471j = abstractC2554a;
            this.f24472k = cVar;
            this.f24473l = str5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements v2.f, InterfaceC1863H {

        /* renamed from: f, reason: collision with root package name */
        public static final int f24434f = 0;

        /* renamed from: a, reason: collision with root package name */
        public final com.stripe.android.model.a f24435a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24436b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24437c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24438d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f24433e = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new c();

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private com.stripe.android.model.a f24439a;

            /* renamed from: b, reason: collision with root package name */
            private String f24440b;

            /* renamed from: c, reason: collision with root package name */
            private String f24441c;

            /* renamed from: d, reason: collision with root package name */
            private String f24442d;

            public final e a() {
                return new e(this.f24439a, this.f24440b, this.f24441c, this.f24442d);
            }

            public final a b(com.stripe.android.model.a aVar) {
                this.f24439a = aVar;
                return this;
            }

            public final a c(String str) {
                this.f24440b = str;
                return this;
            }

            public final a d(String str) {
                this.f24441c = str;
                return this;
            }

            public final a e(String str) {
                this.f24442d = str;
                return this;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final e a(C1858C shippingInformation) {
                AbstractC3159y.i(shippingInformation, "shippingInformation");
                return new e(shippingInformation.b(), null, shippingInformation.c(), shippingInformation.e(), 2, null);
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, String str3) {
            this.f24435a = aVar;
            this.f24436b = str;
            this.f24437c = str2;
            this.f24438d = str3;
        }

        public final boolean b() {
            com.stripe.android.model.a aVar = this.f24435a;
            if ((aVar == null || !aVar.k()) && this.f24436b == null && this.f24437c == null && this.f24438d == null) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f24435a, eVar.f24435a) && AbstractC3159y.d(this.f24436b, eVar.f24436b) && AbstractC3159y.d(this.f24437c, eVar.f24437c) && AbstractC3159y.d(this.f24438d, eVar.f24438d);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f24435a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f24436b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24437c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24438d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.f24435a + ", email=" + this.f24436b + ", name=" + this.f24437c + ", phone=" + this.f24438d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f24435a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24436b);
            out.writeString(this.f24437c);
            out.writeString(this.f24438d);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            Map map2;
            Map map3;
            Map h8 = Q.h();
            com.stripe.android.model.a aVar = this.f24435a;
            Map map4 = null;
            if (aVar != null) {
                map = Q.e(L5.x.a("address", aVar.y()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f24436b;
            if (str != null) {
                map2 = Q.e(L5.x.a(NotificationCompat.CATEGORY_EMAIL, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f24437c;
            if (str2 != null) {
                map3 = Q.e(L5.x.a("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f24438d;
            if (str3 != null) {
                map4 = Q.e(L5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }

        public /* synthetic */ e(com.stripe.android.model.a aVar, String str, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: A, reason: collision with root package name */
        public static final p f24495A;

        /* renamed from: B, reason: collision with root package name */
        public static final p f24496B;
        public static final Parcelable.Creator<p> CREATOR;

        /* renamed from: D, reason: collision with root package name */
        public static final p f24498D;

        /* renamed from: E, reason: collision with root package name */
        public static final p f24499E;

        /* renamed from: F, reason: collision with root package name */
        public static final p f24500F;

        /* renamed from: G, reason: collision with root package name */
        public static final p f24501G;

        /* renamed from: H, reason: collision with root package name */
        public static final p f24502H;

        /* renamed from: I, reason: collision with root package name */
        public static final p f24503I;

        /* renamed from: J, reason: collision with root package name */
        public static final p f24504J;

        /* renamed from: K, reason: collision with root package name */
        public static final p f24505K;

        /* renamed from: L, reason: collision with root package name */
        public static final p f24506L;

        /* renamed from: M, reason: collision with root package name */
        public static final p f24507M;

        /* renamed from: N, reason: collision with root package name */
        public static final p f24508N;

        /* renamed from: O, reason: collision with root package name */
        public static final p f24509O;

        /* renamed from: P, reason: collision with root package name */
        public static final p f24510P;

        /* renamed from: R, reason: collision with root package name */
        public static final p f24512R;

        /* renamed from: S, reason: collision with root package name */
        public static final p f24513S;

        /* renamed from: T, reason: collision with root package name */
        public static final p f24514T;

        /* renamed from: U, reason: collision with root package name */
        private static final /* synthetic */ p[] f24515U;

        /* renamed from: V, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24516V;

        /* renamed from: g, reason: collision with root package name */
        public static final a f24517g;

        /* renamed from: h, reason: collision with root package name */
        public static final p f24518h;

        /* renamed from: i, reason: collision with root package name */
        public static final p f24519i;

        /* renamed from: j, reason: collision with root package name */
        public static final p f24520j;

        /* renamed from: k, reason: collision with root package name */
        public static final p f24521k;

        /* renamed from: l, reason: collision with root package name */
        public static final p f24522l;

        /* renamed from: m, reason: collision with root package name */
        public static final p f24523m;

        /* renamed from: n, reason: collision with root package name */
        public static final p f24524n;

        /* renamed from: o, reason: collision with root package name */
        public static final p f24525o;

        /* renamed from: p, reason: collision with root package name */
        public static final p f24526p;

        /* renamed from: q, reason: collision with root package name */
        public static final p f24527q;

        /* renamed from: s, reason: collision with root package name */
        public static final p f24529s;

        /* renamed from: t, reason: collision with root package name */
        public static final p f24530t;

        /* renamed from: u, reason: collision with root package name */
        public static final p f24531u;

        /* renamed from: v, reason: collision with root package name */
        public static final p f24532v;

        /* renamed from: w, reason: collision with root package name */
        public static final p f24533w;

        /* renamed from: x, reason: collision with root package name */
        public static final p f24534x;

        /* renamed from: y, reason: collision with root package name */
        public static final p f24535y;

        /* renamed from: z, reason: collision with root package name */
        public static final p f24536z;

        /* renamed from: a, reason: collision with root package name */
        public final String f24537a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24538b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f24539c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f24540d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f24541e;

        /* renamed from: f, reason: collision with root package name */
        private final a f24542f;

        /* renamed from: r, reason: collision with root package name */
        public static final p f24528r = new p("P24", 10, "p24", false, false, false, false, null, 32, null);

        /* renamed from: C, reason: collision with root package name */
        public static final p f24497C = new p("WeChatPay", 21, "wechat_pay", false, false, false, false, new a.c(5));

        /* renamed from: Q, reason: collision with root package name */
        public static final p f24511Q = new p("Boleto", 35, "boleto", false, true, false, true, null, 32, 0 == true ? 1 : 0);

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final /* synthetic */ p a(String str) {
                Object obj;
                Iterator<E> it = p.e().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((p) obj).f24537a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (p) obj;
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
                return p.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i8) {
                return new p[i8];
            }
        }

        static {
            boolean z8 = false;
            boolean z9 = false;
            f24518h = new p("Link", 0, "link", false, z8, true, z9, null, 32, null);
            int i8 = 32;
            AbstractC3151p abstractC3151p = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            a aVar = null;
            f24519i = new p("Card", 1, "card", true, z10, z11, z12, aVar, i8, abstractC3151p);
            int i9 = 32;
            AbstractC3151p abstractC3151p2 = null;
            boolean z13 = false;
            boolean z14 = false;
            a aVar2 = null;
            f24520j = new p("CardPresent", 2, "card_present", z8, z13, z9, z14, aVar2, i9, abstractC3151p2);
            boolean z15 = false;
            f24521k = new p("Fpx", 3, "fpx", z15, z10, z11, z12, aVar, i8, abstractC3151p);
            boolean z16 = true;
            f24522l = new p("Ideal", 4, "ideal", z8, z13, z16, z14, aVar2, i9, abstractC3151p2);
            boolean z17 = true;
            boolean z18 = true;
            f24523m = new p("SepaDebit", 5, "sepa_debit", z15, z10, z17, z18, aVar, i8, abstractC3151p);
            boolean z19 = true;
            f24524n = new p("AuBecsDebit", 6, "au_becs_debit", true, z13, z16, z19, aVar2, i9, abstractC3151p2);
            f24525o = new p("BacsDebit", 7, "bacs_debit", true, z10, z17, z18, aVar, i8, abstractC3151p);
            f24526p = new p("Sofort", 8, "sofort", false, z13, z16, z19, aVar2, i9, abstractC3151p2);
            int i10 = 0;
            int i11 = 1;
            AbstractC3151p abstractC3151p3 = null;
            f24527q = new p("Upi", 9, "upi", false, false, false, false, new a.c(i10, i11, abstractC3151p3));
            int i12 = 32;
            AbstractC3151p abstractC3151p4 = null;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = true;
            boolean z23 = false;
            a aVar3 = null;
            f24529s = new p("Bancontact", 11, "bancontact", z20, z21, z22, z23, aVar3, i12, abstractC3151p4);
            int i13 = 32;
            AbstractC3151p abstractC3151p5 = null;
            boolean z24 = false;
            boolean z25 = false;
            f24530t = new p("Giropay", 12, "giropay", z24, false, z25, false, null, i13, abstractC3151p5);
            f24531u = new p("Eps", 13, "eps", z20, z21, z22, z23, aVar3, i12, abstractC3151p4);
            f24532v = new p("Oxxo", 14, "oxxo", z24, true, z25, true, 0 == true ? 1 : 0, i13, abstractC3151p5);
            boolean z26 = false;
            f24533w = new p("Alipay", 15, "alipay", z20, z21, z26, z23, aVar3, i12, abstractC3151p4);
            boolean z27 = false;
            boolean z28 = false;
            f24534x = new p("GrabPay", 16, "grabpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3151p5);
            f24535y = new p("PayPal", 17, "paypal", z20, z21, z26, z23, aVar3, i12, abstractC3151p4);
            f24536z = new p("AfterpayClearpay", 18, "afterpay_clearpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3151p5);
            f24495A = new p("Netbanking", 19, "netbanking", z20, z21, z26, z23, aVar3, i12, abstractC3151p4);
            f24496B = new p("Blik", 20, "blik", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3151p5);
            f24498D = new p("Klarna", 22, "klarna", false, false, z24, z27, null, 32, 0 == true ? 1 : 0);
            int i14 = 32;
            AbstractC3151p abstractC3151p6 = null;
            boolean z29 = false;
            boolean z30 = false;
            a aVar4 = null;
            f24499E = new p("Affirm", 23, "affirm", z29, false, z30, false, aVar4, i14, abstractC3151p6);
            int i15 = 32;
            AbstractC3151p abstractC3151p7 = null;
            a aVar5 = null;
            f24500F = new p("RevolutPay", 24, "revolut_pay", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            int i16 = 32;
            AbstractC3151p abstractC3151p8 = null;
            boolean z31 = false;
            boolean z32 = false;
            f24501G = new p("Sunbit", 25, "sunbit", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24502H = new p("Billie", 26, "billie", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            f24503I = new p("Satispay", 27, "satispay", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24504J = new p("AmazonPay", 28, "amazon_pay", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            f24505K = new p("Alma", 29, "alma", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24506L = new p("MobilePay", 30, "mobilepay", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            boolean z33 = true;
            f24507M = new p("Multibanco", 31, "multibanco", z24, true, z31, z33, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24508N = new p("Zip", 32, "zip", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            f24509O = new p("USBankAccount", 33, "us_bank_account", true, false, true, z33, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24510P = new p("CashAppPay", 34, "cashapp", false, false, false, false, new a.c(i10, i11, abstractC3151p3));
            f24512R = new p("Konbini", 36, "konbini", z29, true, z30, true, aVar4, i14, abstractC3151p6);
            f24513S = new p("Swish", 37, "swish", false, false, false, false, new a.b(i10, i11, abstractC3151p3));
            f24514T = new p("Twint", 38, "twint", false, false, false, false, new a.b(i10, i11, abstractC3151p3));
            p[] b8 = b();
            f24515U = b8;
            f24516V = R5.b.a(b8);
            f24517g = new a(abstractC3151p3);
            CREATOR = new b();
        }

        private p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar) {
            this.f24537a = str2;
            this.f24538b = z8;
            this.f24539c = z9;
            this.f24540d = z10;
            this.f24541e = z11;
            this.f24542f = aVar;
        }

        private static final /* synthetic */ p[] b() {
            return new p[]{f24518h, f24519i, f24520j, f24521k, f24522l, f24523m, f24524n, f24525o, f24526p, f24527q, f24528r, f24529s, f24530t, f24531u, f24532v, f24533w, f24534x, f24535y, f24536z, f24495A, f24496B, f24497C, f24498D, f24499E, f24500F, f24501G, f24502H, f24503I, f24504J, f24505K, f24506L, f24507M, f24508N, f24509O, f24510P, f24511Q, f24512R, f24513S, f24514T};
        }

        public static R5.a e() {
            return f24516V;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) f24515U.clone();
        }

        public final a c() {
            return this.f24542f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean f() {
            return this.f24541e;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f24537a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(name());
        }

        /* synthetic */ p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar, int i9, AbstractC3151p abstractC3151p) {
            this(str, i8, str2, z8, z9, z10, z11, (i9 & 32) != 0 ? a.C0515a.f24414a : aVar);
        }
    }

    public /* synthetic */ o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0520o c0520o, s sVar, m mVar, r rVar, b bVar, int i8, AbstractC3151p abstractC3151p) {
        this(str, l8, z8, str2, pVar, (i8 & 32) != 0 ? null : eVar, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : gVar, (i8 & 256) != 0 ? null : hVar, (i8 & 512) != 0 ? null : kVar, (i8 & 1024) != 0 ? null : lVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : cVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : c0520o, (32768 & i8) != 0 ? null : sVar, (65536 & i8) != 0 ? null : mVar, (131072 & i8) != 0 ? null : rVar, (i8 & 262144) != 0 ? null : bVar);
    }
}
