package com.stripe.android.stripe3ds2.views;

import L5.x;
import T3.m;
import X3.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Y3.b f27077a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.a f27078b;

    /* renamed from: c, reason: collision with root package name */
    private final m f27079c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f27080d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b f27081e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27082f;

    /* renamed from: g, reason: collision with root package name */
    private final n f27083g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f27076h = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(Bundle extras) {
            AbstractC3159y.i(extras, "extras");
            Object parcelable = BundleCompat.getParcelable(extras, "extra_args", d.class);
            if (parcelable != null) {
                return (d) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new d(Y3.b.CREATOR.createFromParcel(parcel), Y3.a.CREATOR.createFromParcel(parcel), (m) parcel.readParcelable(d.class.getClassLoader()), c.a.CREATOR.createFromParcel(parcel), (c.b) parcel.readSerializable(), parcel.readInt(), n.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    public d(Y3.b cresData, Y3.a creqData, m uiCustomization, c.a creqExecutorConfig, c.b creqExecutorFactory, int i8, n intentData) {
        AbstractC3159y.i(cresData, "cresData");
        AbstractC3159y.i(creqData, "creqData");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        AbstractC3159y.i(creqExecutorConfig, "creqExecutorConfig");
        AbstractC3159y.i(creqExecutorFactory, "creqExecutorFactory");
        AbstractC3159y.i(intentData, "intentData");
        this.f27077a = cresData;
        this.f27078b = creqData;
        this.f27079c = uiCustomization;
        this.f27080d = creqExecutorConfig;
        this.f27081e = creqExecutorFactory;
        this.f27082f = i8;
        this.f27083g = intentData;
    }

    public final Y3.a b() {
        return this.f27078b;
    }

    public final c.a c() {
        return this.f27080d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final c.b e() {
        return this.f27081e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3159y.d(this.f27077a, dVar.f27077a) && AbstractC3159y.d(this.f27078b, dVar.f27078b) && AbstractC3159y.d(this.f27079c, dVar.f27079c) && AbstractC3159y.d(this.f27080d, dVar.f27080d) && AbstractC3159y.d(this.f27081e, dVar.f27081e) && this.f27082f == dVar.f27082f && AbstractC3159y.d(this.f27083g, dVar.f27083g);
    }

    public final Y3.b f() {
        return this.f27077a;
    }

    public int hashCode() {
        return (((((((((((this.f27077a.hashCode() * 31) + this.f27078b.hashCode()) * 31) + this.f27079c.hashCode()) * 31) + this.f27080d.hashCode()) * 31) + this.f27081e.hashCode()) * 31) + this.f27082f) * 31) + this.f27083g.hashCode();
    }

    public final n i() {
        return this.f27083g;
    }

    public final q j() {
        return this.f27078b.n();
    }

    public final int k() {
        return this.f27082f;
    }

    public final m n() {
        return this.f27079c;
    }

    public final Bundle o() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.f27077a + ", creqData=" + this.f27078b + ", uiCustomization=" + this.f27079c + ", creqExecutorConfig=" + this.f27080d + ", creqExecutorFactory=" + this.f27081e + ", timeoutMins=" + this.f27082f + ", intentData=" + this.f27083g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f27077a.writeToParcel(out, i8);
        this.f27078b.writeToParcel(out, i8);
        out.writeParcelable(this.f27079c, i8);
        this.f27080d.writeToParcel(out, i8);
        out.writeSerializable(this.f27081e);
        out.writeInt(this.f27082f);
        this.f27083g.writeToParcel(out, i8);
    }
}
