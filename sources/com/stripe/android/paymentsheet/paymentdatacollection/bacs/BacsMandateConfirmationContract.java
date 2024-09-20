package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class BacsMandateConfirmationContract extends ActivityResultContract<a, c> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26114a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26116a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26117b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26118c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26119d;

        /* renamed from: e, reason: collision with root package name */
        private final u.b f26120e;

        /* renamed from: f, reason: collision with root package name */
        public static final C0624a f26115f = new C0624a(null);
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0624a {
            private C0624a() {
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

            public /* synthetic */ C0624a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), u.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String email, String nameOnAccount, String sortCode, String accountNumber, u.b appearance) {
            AbstractC3159y.i(email, "email");
            AbstractC3159y.i(nameOnAccount, "nameOnAccount");
            AbstractC3159y.i(sortCode, "sortCode");
            AbstractC3159y.i(accountNumber, "accountNumber");
            AbstractC3159y.i(appearance, "appearance");
            this.f26116a = email;
            this.f26117b = nameOnAccount;
            this.f26118c = sortCode;
            this.f26119d = accountNumber;
            this.f26120e = appearance;
        }

        public final String b() {
            return this.f26119d;
        }

        public final u.b c() {
            return this.f26120e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26116a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26116a, aVar.f26116a) && AbstractC3159y.d(this.f26117b, aVar.f26117b) && AbstractC3159y.d(this.f26118c, aVar.f26118c) && AbstractC3159y.d(this.f26119d, aVar.f26119d) && AbstractC3159y.d(this.f26120e, aVar.f26120e);
        }

        public final String f() {
            return this.f26117b;
        }

        public int hashCode() {
            return (((((((this.f26116a.hashCode() * 31) + this.f26117b.hashCode()) * 31) + this.f26118c.hashCode()) * 31) + this.f26119d.hashCode()) * 31) + this.f26120e.hashCode();
        }

        public final String i() {
            return this.f26118c;
        }

        public String toString() {
            return "Args(email=" + this.f26116a + ", nameOnAccount=" + this.f26117b + ", sortCode=" + this.f26118c + ", accountNumber=" + this.f26119d + ", appearance=" + this.f26120e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26116a);
            out.writeString(this.f26117b);
            out.writeString(this.f26118c);
            out.writeString(this.f26119d);
            this.f26120e.writeToParcel(out, i8);
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
        Intent putExtra = new Intent(context, (Class<?>) BacsMandateConfirmationActivity.class).putExtra("extra_activity_args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c parseResult(int i8, Intent intent) {
        return c.f26148k0.a(intent);
    }
}
