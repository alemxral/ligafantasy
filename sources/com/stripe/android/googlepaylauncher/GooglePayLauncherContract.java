package com.stripe.android.googlepaylauncher;

import L5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.googlepaylauncher.f;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GooglePayLauncherContract extends ActivityResultContract<a, f> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23769a = new b(null);

    /* loaded from: classes4.dex */
    public static abstract class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public static final C0468a f23770a = new C0468a(null);

        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0468a {
            private C0468a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0468a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        private a() {
        }

        public abstract String b();

        public abstract e c();

        public final Bundle e() {
            return BundleKt.bundleOf(x.a("extra_args", this));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
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
    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f23771b;

        /* renamed from: c, reason: collision with root package name */
        private final e f23772c;

        /* renamed from: d, reason: collision with root package name */
        private final String f23773d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), e.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String clientSecret, e config, String str) {
            super(null);
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(config, "config");
            this.f23771b = clientSecret;
            this.f23772c = config;
            this.f23773d = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public String b() {
            return this.f23771b;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public e c() {
            return this.f23772c;
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
            return AbstractC3159y.d(this.f23771b, cVar.f23771b) && AbstractC3159y.d(this.f23772c, cVar.f23772c) && AbstractC3159y.d(this.f23773d, cVar.f23773d);
        }

        public final String f() {
            return this.f23773d;
        }

        public int hashCode() {
            int hashCode = ((this.f23771b.hashCode() * 31) + this.f23772c.hashCode()) * 31;
            String str = this.f23773d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentIntentArgs(clientSecret=" + this.f23771b + ", config=" + this.f23772c + ", label=" + this.f23773d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f23771b);
            this.f23772c.writeToParcel(out, i8);
            out.writeString(this.f23773d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f23774b;

        /* renamed from: c, reason: collision with root package name */
        private final e f23775c;

        /* renamed from: d, reason: collision with root package name */
        private final String f23776d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f23777e;

        /* renamed from: f, reason: collision with root package name */
        private final String f23778f;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String clientSecret, e config, String currencyCode, Long l8, String str) {
            super(null);
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(config, "config");
            AbstractC3159y.i(currencyCode, "currencyCode");
            this.f23774b = clientSecret;
            this.f23775c = config;
            this.f23776d = currencyCode;
            this.f23777e = l8;
            this.f23778f = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public String b() {
            return this.f23774b;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        public e c() {
            return this.f23775c;
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
            return AbstractC3159y.d(this.f23774b, dVar.f23774b) && AbstractC3159y.d(this.f23775c, dVar.f23775c) && AbstractC3159y.d(this.f23776d, dVar.f23776d) && AbstractC3159y.d(this.f23777e, dVar.f23777e) && AbstractC3159y.d(this.f23778f, dVar.f23778f);
        }

        public final Long f() {
            return this.f23777e;
        }

        public int hashCode() {
            int hashCode = ((((this.f23774b.hashCode() * 31) + this.f23775c.hashCode()) * 31) + this.f23776d.hashCode()) * 31;
            Long l8 = this.f23777e;
            int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str = this.f23778f;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String i() {
            return this.f23776d;
        }

        public final String j() {
            return this.f23778f;
        }

        public String toString() {
            return "SetupIntentArgs(clientSecret=" + this.f23774b + ", config=" + this.f23775c + ", currencyCode=" + this.f23776d + ", amount=" + this.f23777e + ", label=" + this.f23778f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f23774b);
            this.f23775c.writeToParcel(out, i8);
            out.writeString(this.f23776d);
            Long l8 = this.f23777e;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f23778f);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(input.e());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f parseResult(int i8, Intent intent) {
        f fVar;
        if (intent != null) {
            fVar = (f) intent.getParcelableExtra("extra_result");
        } else {
            fVar = null;
        }
        if (fVar == null) {
            return new f.c(new IllegalStateException("Error while processing result from Google Pay."));
        }
        return fVar;
    }
}
