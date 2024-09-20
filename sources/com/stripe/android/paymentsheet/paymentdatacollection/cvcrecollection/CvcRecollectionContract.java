package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import b3.EnumC1870e;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class CvcRecollectionContract extends ActivityResultContract<a, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26192a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26194a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC1870e f26195b;

        /* renamed from: c, reason: collision with root package name */
        private final u.b f26196c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f26197d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0633a f26193e = new C0633a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0633a {
            private C0633a() {
            }

            public final a a(Intent intent) {
                Object parcelableExtra;
                AbstractC3159y.i(intent, "intent");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("extra_activity_args", a.class);
                    return (a) parcelableExtra;
                }
                return (a) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ C0633a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), EnumC1870e.valueOf(parcel.readString()), u.b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String lastFour, EnumC1870e cardBrand, u.b appearance, boolean z8) {
            AbstractC3159y.i(lastFour, "lastFour");
            AbstractC3159y.i(cardBrand, "cardBrand");
            AbstractC3159y.i(appearance, "appearance");
            this.f26194a = lastFour;
            this.f26195b = cardBrand;
            this.f26196c = appearance;
            this.f26197d = z8;
        }

        public final u.b b() {
            return this.f26196c;
        }

        public final EnumC1870e c() {
            return this.f26195b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26194a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26194a, aVar.f26194a) && this.f26195b == aVar.f26195b && AbstractC3159y.d(this.f26196c, aVar.f26196c) && this.f26197d == aVar.f26197d;
        }

        public final boolean f() {
            return this.f26197d;
        }

        public int hashCode() {
            return (((((this.f26194a.hashCode() * 31) + this.f26195b.hashCode()) * 31) + this.f26196c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26197d);
        }

        public String toString() {
            return "Args(lastFour=" + this.f26194a + ", cardBrand=" + this.f26195b + ", appearance=" + this.f26196c + ", isTestMode=" + this.f26197d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26194a);
            out.writeString(this.f26195b.name());
            this.f26196c.writeToParcel(out, i8);
            out.writeInt(this.f26197d ? 1 : 0);
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

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) CvcRecollectionActivity.class).putExtra("extra_activity_args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a parseResult(int i8, Intent intent) {
        return com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a.f26198l0.a(intent);
    }
}
