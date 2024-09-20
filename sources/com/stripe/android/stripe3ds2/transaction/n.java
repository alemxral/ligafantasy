package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f26875a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26876b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26877c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26878d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f26873e = new a(null);
    public static final Parcelable.Creator<n> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final n f26874f = new n("", "", "", null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final n a() {
            return n.f26874f;
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
            return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    public n(String clientSecret, String sourceId, String publishableKey, String str) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(sourceId, "sourceId");
        AbstractC3159y.i(publishableKey, "publishableKey");
        this.f26875a = clientSecret;
        this.f26876b = sourceId;
        this.f26877c = publishableKey;
        this.f26878d = str;
    }

    public final String c() {
        return this.f26878d;
    }

    public final String d() {
        return this.f26875a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f26877c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3159y.d(this.f26875a, nVar.f26875a) && AbstractC3159y.d(this.f26876b, nVar.f26876b) && AbstractC3159y.d(this.f26877c, nVar.f26877c) && AbstractC3159y.d(this.f26878d, nVar.f26878d);
    }

    public final String f() {
        return this.f26876b;
    }

    public int hashCode() {
        int hashCode = ((((this.f26875a.hashCode() * 31) + this.f26876b.hashCode()) * 31) + this.f26877c.hashCode()) * 31;
        String str = this.f26878d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IntentData(clientSecret=" + this.f26875a + ", sourceId=" + this.f26876b + ", publishableKey=" + this.f26877c + ", accountId=" + this.f26878d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f26875a);
        out.writeString(this.f26876b);
        out.writeString(this.f26877c);
        out.writeString(this.f26878d);
    }
}
