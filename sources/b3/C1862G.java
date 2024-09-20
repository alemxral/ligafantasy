package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1862G implements v2.f {
    public static final Parcelable.Creator<C1862G> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String f14299a;

    /* renamed from: b, reason: collision with root package name */
    private final a f14300b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f14301c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14302d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14303e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14304f;

    /* renamed from: g, reason: collision with root package name */
    private final d f14305g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14306h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14307i;

    /* renamed from: b3.G$a */
    /* loaded from: classes4.dex */
    public static final class a implements v2.f {

        /* renamed from: a, reason: collision with root package name */
        private final String f14310a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14311b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14312c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14313d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14314e;

        /* renamed from: f, reason: collision with root package name */
        private final String f14315f;

        /* renamed from: g, reason: collision with root package name */
        private final String f14316g;

        /* renamed from: h, reason: collision with root package name */
        private final List f14317h;

        /* renamed from: i, reason: collision with root package name */
        private final String f14318i;

        /* renamed from: j, reason: collision with root package name */
        private final String f14319j;

        /* renamed from: k, reason: collision with root package name */
        private final String f14320k;

        /* renamed from: l, reason: collision with root package name */
        private final String f14321l;

        /* renamed from: m, reason: collision with root package name */
        public static final C0354a f14308m = new C0354a(null);

        /* renamed from: n, reason: collision with root package name */
        public static final int f14309n = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: b3.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0354a {
            private C0354a() {
            }

            public /* synthetic */ C0354a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: b3.G$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(c.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new a(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11) {
            this.f14310a = str;
            this.f14311b = str2;
            this.f14312c = str3;
            this.f14313d = str4;
            this.f14314e = str5;
            this.f14315f = str6;
            this.f14316g = str7;
            this.f14317h = list;
            this.f14318i = str8;
            this.f14319j = str9;
            this.f14320k = str10;
            this.f14321l = str11;
        }

        public final String b() {
            return this.f14312c;
        }

        public final String c() {
            return this.f14313d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f14310a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f14310a, aVar.f14310a) && AbstractC3159y.d(this.f14311b, aVar.f14311b) && AbstractC3159y.d(this.f14312c, aVar.f14312c) && AbstractC3159y.d(this.f14313d, aVar.f14313d) && AbstractC3159y.d(this.f14314e, aVar.f14314e) && AbstractC3159y.d(this.f14315f, aVar.f14315f) && AbstractC3159y.d(this.f14316g, aVar.f14316g) && AbstractC3159y.d(this.f14317h, aVar.f14317h) && AbstractC3159y.d(this.f14318i, aVar.f14318i) && AbstractC3159y.d(this.f14319j, aVar.f14319j) && AbstractC3159y.d(this.f14320k, aVar.f14320k) && AbstractC3159y.d(this.f14321l, aVar.f14321l)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return AbstractC3159y.d("C", this.f14321l);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11;
            String str = this.f14310a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f14311b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14312c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f14313d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f14314e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f14315f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f14316g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            List list = this.f14317h;
            if (list == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = list.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str8 = this.f14318i;
            if (str8 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str8.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str9 = this.f14319j;
            if (str9 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str9.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str10 = this.f14320k;
            if (str10 == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = str10.hashCode();
            }
            int i19 = (i18 + hashCode11) * 31;
            String str11 = this.f14321l;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i19 + i8;
        }

        public String toString() {
            return "Ares(threeDSServerTransId=" + this.f14310a + ", acsChallengeMandated=" + this.f14311b + ", acsSignedContent=" + this.f14312c + ", acsTransId=" + this.f14313d + ", acsUrl=" + this.f14314e + ", authenticationType=" + this.f14315f + ", cardholderInfo=" + this.f14316g + ", messageExtension=" + this.f14317h + ", messageType=" + this.f14318i + ", messageVersion=" + this.f14319j + ", sdkTransId=" + this.f14320k + ", transStatus=" + this.f14321l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14310a);
            out.writeString(this.f14311b);
            out.writeString(this.f14312c);
            out.writeString(this.f14313d);
            out.writeString(this.f14314e);
            out.writeString(this.f14315f);
            out.writeString(this.f14316g);
            List list = this.f14317h;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).writeToParcel(out, i8);
                }
            }
            out.writeString(this.f14318i);
            out.writeString(this.f14319j);
            out.writeString(this.f14320k);
            out.writeString(this.f14321l);
        }
    }

    /* renamed from: b3.G$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1862G createFromParcel(Parcel parcel) {
            a createFromParcel;
            Long valueOf;
            boolean z8;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            d dVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = a.CREATOR.createFromParcel(parcel);
            }
            a aVar = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                dVar = d.CREATOR.createFromParcel(parcel);
            }
            return new C1862G(readString, aVar, valueOf, readString2, readString3, z8, dVar, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1862G[] newArray(int i8) {
            return new C1862G[i8];
        }
    }

    /* renamed from: b3.G$c */
    /* loaded from: classes4.dex */
    public static final class c implements v2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14322a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f14323b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14324c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f14325d;

        /* renamed from: b3.G$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                boolean z8;
                LinkedHashMap linkedHashMap;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new c(readString, z8, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, boolean z8, String str2, Map map) {
            this.f14322a = str;
            this.f14323b = z8;
            this.f14324c = str2;
            this.f14325d = map;
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
            if (AbstractC3159y.d(this.f14322a, cVar.f14322a) && this.f14323b == cVar.f14323b && AbstractC3159y.d(this.f14324c, cVar.f14324c) && AbstractC3159y.d(this.f14325d, cVar.f14325d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f14322a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int a8 = ((hashCode * 31) + androidx.compose.foundation.a.a(this.f14323b)) * 31;
            String str2 = this.f14324c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i9 = (a8 + hashCode2) * 31;
            Map map = this.f14325d;
            if (map != null) {
                i8 = map.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "MessageExtension(name=" + this.f14322a + ", criticalityIndicator=" + this.f14323b + ", id=" + this.f14324c + ", data=" + this.f14325d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14322a);
            out.writeInt(this.f14323b ? 1 : 0);
            out.writeString(this.f14324c);
            Map map = this.f14325d;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
    }

    /* renamed from: b3.G$d */
    /* loaded from: classes4.dex */
    public static final class d implements v2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14326a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14327b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14328c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14329d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14330e;

        /* renamed from: f, reason: collision with root package name */
        private final String f14331f;

        /* renamed from: g, reason: collision with root package name */
        private final String f14332g;

        /* renamed from: h, reason: collision with root package name */
        private final String f14333h;

        /* renamed from: i, reason: collision with root package name */
        private final String f14334i;

        /* renamed from: j, reason: collision with root package name */
        private final String f14335j;

        /* renamed from: k, reason: collision with root package name */
        private final String f14336k;

        /* renamed from: b3.G$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f14326a = str;
            this.f14327b = str2;
            this.f14328c = str3;
            this.f14329d = str4;
            this.f14330e = str5;
            this.f14331f = str6;
            this.f14332g = str7;
            this.f14333h = str8;
            this.f14334i = str9;
            this.f14335j = str10;
            this.f14336k = str11;
        }

        public final String b() {
            return this.f14329d;
        }

        public final String c() {
            return this.f14330e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f14331f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3159y.d(this.f14326a, dVar.f14326a) && AbstractC3159y.d(this.f14327b, dVar.f14327b) && AbstractC3159y.d(this.f14328c, dVar.f14328c) && AbstractC3159y.d(this.f14329d, dVar.f14329d) && AbstractC3159y.d(this.f14330e, dVar.f14330e) && AbstractC3159y.d(this.f14331f, dVar.f14331f) && AbstractC3159y.d(this.f14332g, dVar.f14332g) && AbstractC3159y.d(this.f14333h, dVar.f14333h) && AbstractC3159y.d(this.f14334i, dVar.f14334i) && AbstractC3159y.d(this.f14335j, dVar.f14335j) && AbstractC3159y.d(this.f14336k, dVar.f14336k)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f14332g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            String str = this.f14326a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f14327b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f14328c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.f14329d;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str5 = this.f14330e;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (i12 + hashCode5) * 31;
            String str6 = this.f14331f;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str7 = this.f14332g;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i15 = (i14 + hashCode7) * 31;
            String str8 = this.f14333h;
            if (str8 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str8.hashCode();
            }
            int i16 = (i15 + hashCode8) * 31;
            String str9 = this.f14334i;
            if (str9 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str9.hashCode();
            }
            int i17 = (i16 + hashCode9) * 31;
            String str10 = this.f14335j;
            if (str10 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str10.hashCode();
            }
            int i18 = (i17 + hashCode10) * 31;
            String str11 = this.f14336k;
            if (str11 != null) {
                i8 = str11.hashCode();
            }
            return i18 + i8;
        }

        public String toString() {
            return "ThreeDS2Error(threeDSServerTransId=" + this.f14326a + ", acsTransId=" + this.f14327b + ", dsTransId=" + this.f14328c + ", errorCode=" + this.f14329d + ", errorComponent=" + this.f14330e + ", errorDescription=" + this.f14331f + ", errorDetail=" + this.f14332g + ", errorMessageType=" + this.f14333h + ", messageType=" + this.f14334i + ", messageVersion=" + this.f14335j + ", sdkTransId=" + this.f14336k + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14326a);
            out.writeString(this.f14327b);
            out.writeString(this.f14328c);
            out.writeString(this.f14329d);
            out.writeString(this.f14330e);
            out.writeString(this.f14331f);
            out.writeString(this.f14332g);
            out.writeString(this.f14333h);
            out.writeString(this.f14334i);
            out.writeString(this.f14335j);
            out.writeString(this.f14336k);
        }
    }

    public C1862G(String str, a aVar, Long l8, String str2, String str3, boolean z8, d dVar, String str4, String str5) {
        this.f14299a = str;
        this.f14300b = aVar;
        this.f14301c = l8;
        this.f14302d = str2;
        this.f14303e = str3;
        this.f14304f = z8;
        this.f14305g = dVar;
        this.f14306h = str4;
        this.f14307i = str5;
    }

    public final a b() {
        return this.f14300b;
    }

    public final d c() {
        return this.f14305g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f14306h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1862G)) {
            return false;
        }
        C1862G c1862g = (C1862G) obj;
        if (AbstractC3159y.d(this.f14299a, c1862g.f14299a) && AbstractC3159y.d(this.f14300b, c1862g.f14300b) && AbstractC3159y.d(this.f14301c, c1862g.f14301c) && AbstractC3159y.d(this.f14302d, c1862g.f14302d) && AbstractC3159y.d(this.f14303e, c1862g.f14303e) && this.f14304f == c1862g.f14304f && AbstractC3159y.d(this.f14305g, c1862g.f14305g) && AbstractC3159y.d(this.f14306h, c1862g.f14306h) && AbstractC3159y.d(this.f14307i, c1862g.f14307i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.f14299a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f14300b;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Long l8 = this.f14301c;
        if (l8 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l8.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str2 = this.f14302d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f14303e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int a8 = (((i12 + hashCode5) * 31) + androidx.compose.foundation.a.a(this.f14304f)) * 31;
        d dVar = this.f14305g;
        if (dVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dVar.hashCode();
        }
        int i13 = (a8 + hashCode6) * 31;
        String str4 = this.f14306h;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        String str5 = this.f14307i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i14 + i8;
    }

    public String toString() {
        return "Stripe3ds2AuthResult(id=" + this.f14299a + ", ares=" + this.f14300b + ", created=" + this.f14301c + ", source=" + this.f14302d + ", state=" + this.f14303e + ", liveMode=" + this.f14304f + ", error=" + this.f14305g + ", fallbackRedirectUrl=" + this.f14306h + ", creq=" + this.f14307i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14299a);
        a aVar = this.f14300b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        Long l8 = this.f14301c;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f14302d);
        out.writeString(this.f14303e);
        out.writeInt(this.f14304f ? 1 : 0);
        d dVar = this.f14305g;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f14306h);
        out.writeString(this.f14307i);
    }
}
