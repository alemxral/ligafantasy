package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23843a;

    /* renamed from: b, reason: collision with root package name */
    private final b f23844b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23845c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new d(parcel.readInt() != 0, b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f23846b = new b("Min", 0, "MIN");

        /* renamed from: c, reason: collision with root package name */
        public static final b f23847c = new b("Full", 1, "FULL");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f23848d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f23849e;

        /* renamed from: a, reason: collision with root package name */
        private final String f23850a;

        static {
            b[] a8 = a();
            f23848d = a8;
            f23849e = R5.b.a(a8);
        }

        private b(String str, int i8, String str2) {
            this.f23850a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f23846b, f23847c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f23848d.clone();
        }
    }

    public d(boolean z8, b format, boolean z9) {
        AbstractC3159y.i(format, "format");
        this.f23843a = z8;
        this.f23844b = format;
        this.f23845c = z9;
    }

    public final b b() {
        return this.f23844b;
    }

    public final boolean c() {
        return this.f23845c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f23843a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23843a == dVar.f23843a && this.f23844b == dVar.f23844b && this.f23845c == dVar.f23845c;
    }

    public int hashCode() {
        return (((androidx.compose.foundation.a.a(this.f23843a) * 31) + this.f23844b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23845c);
    }

    public String toString() {
        return "BillingAddressConfig(isRequired=" + this.f23843a + ", format=" + this.f23844b + ", isPhoneNumberRequired=" + this.f23845c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(this.f23843a ? 1 : 0);
        out.writeString(this.f23844b.name());
        out.writeInt(this.f23845c ? 1 : 0);
    }
}
