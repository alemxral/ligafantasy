package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import L5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import f3.C2662c;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PollingContract extends ActivityResultContract<a, C2662c> {

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26276a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f26277b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26278c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26279d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26280e;

        /* renamed from: f, reason: collision with root package name */
        private final int f26281f;

        /* renamed from: g, reason: collision with root package name */
        public static final C0643a f26275g = new C0643a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0643a {
            private C0643a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            public /* synthetic */ C0643a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String clientSecret, Integer num, int i8, int i9, int i10, int i11) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            this.f26276a = clientSecret;
            this.f26277b = num;
            this.f26278c = i8;
            this.f26279d = i9;
            this.f26280e = i10;
            this.f26281f = i11;
        }

        public final int b() {
            return this.f26281f;
        }

        public final int c() {
            return this.f26279d;
        }

        public final String d() {
            return this.f26276a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f26280e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26276a, aVar.f26276a) && AbstractC3159y.d(this.f26277b, aVar.f26277b) && this.f26278c == aVar.f26278c && this.f26279d == aVar.f26279d && this.f26280e == aVar.f26280e && this.f26281f == aVar.f26281f;
        }

        public final int f() {
            return this.f26278c;
        }

        public int hashCode() {
            int hashCode = this.f26276a.hashCode() * 31;
            Integer num = this.f26277b;
            return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f26278c) * 31) + this.f26279d) * 31) + this.f26280e) * 31) + this.f26281f;
        }

        public String toString() {
            return "Args(clientSecret=" + this.f26276a + ", statusBarColor=" + this.f26277b + ", timeLimitInSeconds=" + this.f26278c + ", initialDelayInSeconds=" + this.f26279d + ", maxAttempts=" + this.f26280e + ", ctaText=" + this.f26281f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26276a);
            Integer num = this.f26277b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f26278c);
            out.writeInt(this.f26279d);
            out.writeInt(this.f26280e);
            out.writeInt(this.f26281f);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) PollingActivity.class).putExtras(BundleKt.bundleOf(x.a("extra_args", input)));
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2662c parseResult(int i8, Intent intent) {
        return C2662c.f30998h.b(intent);
    }
}
