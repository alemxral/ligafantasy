package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import g6.n;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final I2.d f23851a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23852b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23853c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23854d;

    /* renamed from: e, reason: collision with root package name */
    private d f23855e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23856f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23857g;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new e(I2.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, d.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(I2.d environment, String merchantCountryCode, String merchantName, boolean z8, d billingAddressConfig, boolean z9, boolean z10) {
        AbstractC3159y.i(environment, "environment");
        AbstractC3159y.i(merchantCountryCode, "merchantCountryCode");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(billingAddressConfig, "billingAddressConfig");
        this.f23851a = environment;
        this.f23852b = merchantCountryCode;
        this.f23853c = merchantName;
        this.f23854d = z8;
        this.f23855e = billingAddressConfig;
        this.f23856f = z9;
        this.f23857g = z10;
    }

    public final boolean b() {
        return this.f23857g;
    }

    public final d c() {
        return this.f23855e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final I2.d e() {
        return this.f23851a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f23851a == eVar.f23851a && AbstractC3159y.d(this.f23852b, eVar.f23852b) && AbstractC3159y.d(this.f23853c, eVar.f23853c) && this.f23854d == eVar.f23854d && AbstractC3159y.d(this.f23855e, eVar.f23855e) && this.f23856f == eVar.f23856f && this.f23857g == eVar.f23857g;
    }

    public final boolean f() {
        return this.f23856f;
    }

    public int hashCode() {
        return (((((((((((this.f23851a.hashCode() * 31) + this.f23852b.hashCode()) * 31) + this.f23853c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23854d)) * 31) + this.f23855e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f23856f)) * 31) + androidx.compose.foundation.a.a(this.f23857g);
    }

    public final String i() {
        return this.f23852b;
    }

    public final String j() {
        return this.f23853c;
    }

    public final boolean k() {
        return this.f23854d;
    }

    public final boolean n() {
        return n.s(this.f23852b, Locale.JAPAN.getCountry(), true);
    }

    public String toString() {
        return "Config(environment=" + this.f23851a + ", merchantCountryCode=" + this.f23852b + ", merchantName=" + this.f23853c + ", isEmailRequired=" + this.f23854d + ", billingAddressConfig=" + this.f23855e + ", existingPaymentMethodRequired=" + this.f23856f + ", allowCreditCards=" + this.f23857g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f23851a.name());
        out.writeString(this.f23852b);
        out.writeString(this.f23853c);
        out.writeInt(this.f23854d ? 1 : 0);
        this.f23855e.writeToParcel(out, i8);
        out.writeInt(this.f23856f ? 1 : 0);
        out.writeInt(this.f23857g ? 1 : 0);
    }
}
