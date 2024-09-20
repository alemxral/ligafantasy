package com.stripe.android.model;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1863H;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import v2.C3826b;

/* loaded from: classes4.dex */
public final class a implements v2.f, InterfaceC1863H {

    /* renamed from: h, reason: collision with root package name */
    public static final int f24187h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f24188a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24189b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24190c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24191d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24192e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24193f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f24186g = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: com.stripe.android.model.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0498a {

        /* renamed from: a, reason: collision with root package name */
        private String f24194a;

        /* renamed from: b, reason: collision with root package name */
        private String f24195b;

        /* renamed from: c, reason: collision with root package name */
        private String f24196c;

        /* renamed from: d, reason: collision with root package name */
        private String f24197d;

        /* renamed from: e, reason: collision with root package name */
        private String f24198e;

        /* renamed from: f, reason: collision with root package name */
        private String f24199f;

        public final a a() {
            return new a(this.f24194a, this.f24195b, this.f24196c, this.f24197d, this.f24198e, this.f24199f);
        }

        public final C0498a b(String str) {
            this.f24194a = str;
            return this;
        }

        public final C0498a c(String str) {
            String str2;
            if (str != null) {
                str2 = str.toUpperCase(Locale.ROOT);
                AbstractC3159y.h(str2, "toUpperCase(...)");
            } else {
                str2 = null;
            }
            this.f24195b = str2;
            return this;
        }

        public final C0498a d(C3826b c3826b) {
            String str;
            if (c3826b != null) {
                str = c3826b.c();
            } else {
                str = null;
            }
            this.f24195b = str;
            return this;
        }

        public final C0498a e(String str) {
            this.f24196c = str;
            return this;
        }

        public final C0498a f(String str) {
            this.f24197d = str;
            return this;
        }

        public final C0498a g(String str) {
            this.f24198e = str;
            return this;
        }

        public final C0498a h(String str) {
            this.f24199f = str;
            return this;
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
        this.f24188a = str;
        this.f24189b = str2;
        this.f24190c = str3;
        this.f24191d = str4;
        this.f24192e = str5;
        this.f24193f = str6;
    }

    public final String b() {
        return this.f24188a;
    }

    public final String c() {
        return this.f24189b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f24190c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC3159y.d(this.f24188a, aVar.f24188a) && AbstractC3159y.d(this.f24189b, aVar.f24189b) && AbstractC3159y.d(this.f24190c, aVar.f24190c) && AbstractC3159y.d(this.f24191d, aVar.f24191d) && AbstractC3159y.d(this.f24192e, aVar.f24192e) && AbstractC3159y.d(this.f24193f, aVar.f24193f);
    }

    public final String f() {
        return this.f24191d;
    }

    public int hashCode() {
        String str = this.f24188a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f24189b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24190c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24191d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f24192e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f24193f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String i() {
        return this.f24192e;
    }

    public final String j() {
        return this.f24193f;
    }

    public final boolean k() {
        if (this.f24188a == null && this.f24189b == null && this.f24190c == null && this.f24191d == null && this.f24192e == null && this.f24193f == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Address(city=" + this.f24188a + ", country=" + this.f24189b + ", line1=" + this.f24190c + ", line2=" + this.f24191d + ", postalCode=" + this.f24192e + ", state=" + this.f24193f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24188a);
        out.writeString(this.f24189b);
        out.writeString(this.f24190c);
        out.writeString(this.f24191d);
        out.writeString(this.f24192e);
        out.writeString(this.f24193f);
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        String str = this.f24188a;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        L5.r a8 = L5.x.a("city", str);
        String str3 = this.f24189b;
        if (str3 == null) {
            str3 = "";
        }
        L5.r a9 = L5.x.a("country", str3);
        String str4 = this.f24190c;
        if (str4 == null) {
            str4 = "";
        }
        L5.r a10 = L5.x.a("line1", str4);
        String str5 = this.f24191d;
        if (str5 == null) {
            str5 = "";
        }
        L5.r a11 = L5.x.a("line2", str5);
        String str6 = this.f24192e;
        if (str6 == null) {
            str6 = "";
        }
        L5.r a12 = L5.x.a("postal_code", str6);
        String str7 = this.f24193f;
        if (str7 != null) {
            str2 = str7;
        }
        Map k8 = Q.k(a8, a9, a10, a11, a12, L5.x.a("state", str2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : k8.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6);
    }
}
