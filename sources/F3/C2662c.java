package f3;

import L5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.stripe.android.model.Source;
import g6.n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2662c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31000a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31001b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3790k f31002c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31003d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31004e;

    /* renamed from: f, reason: collision with root package name */
    private final Source f31005f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31006g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f30998h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f30999i = 8;
    public static final Parcelable.Creator<C2662c> CREATOR = new b();

    /* renamed from: f3.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public C2662c a(Parcel parcel) {
            AbstractC3790k abstractC3790k;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            Serializable readSerializable = parcel.readSerializable();
            if (readSerializable instanceof AbstractC3790k) {
                abstractC3790k = (AbstractC3790k) readSerializable;
            } else {
                abstractC3790k = null;
            }
            AbstractC3790k abstractC3790k2 = abstractC3790k;
            boolean z8 = true;
            if (parcel.readInt() != 1) {
                z8 = false;
            }
            return new C2662c(readString, readInt, abstractC3790k2, z8, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
        }

        public final /* synthetic */ C2662c b(Intent intent) {
            C2662c c2662c;
            if (intent != null) {
                c2662c = (C2662c) intent.getParcelableExtra("extra_args");
            } else {
                c2662c = null;
            }
            if (c2662c == null) {
                return new C2662c(null, 0, null, false, null, null, null, 127, null);
            }
            return c2662c;
        }

        public void c(C2662c c2662c, Parcel parcel, int i8) {
            int i9;
            AbstractC3159y.i(c2662c, "<this>");
            AbstractC3159y.i(parcel, "parcel");
            parcel.writeString(c2662c.d());
            parcel.writeInt(c2662c.i());
            parcel.writeSerializable(c2662c.f());
            Integer num = 1;
            if (!c2662c.e()) {
                num = null;
            }
            if (num != null) {
                i9 = num.intValue();
            } else {
                i9 = 0;
            }
            parcel.writeInt(i9);
            parcel.writeString(c2662c.k());
            parcel.writeParcelable(c2662c.j(), i8);
            parcel.writeString(c2662c.n());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: f3.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2662c createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return C2662c.f30998h.a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2662c[] newArray(int i8) {
            return new C2662c[i8];
        }
    }

    public C2662c(String str, int i8, AbstractC3790k abstractC3790k, boolean z8, String str2, Source source, String str3) {
        this.f31000a = str;
        this.f31001b = i8;
        this.f31002c = abstractC3790k;
        this.f31003d = z8;
        this.f31004e = str2;
        this.f31005f = source;
        this.f31006g = str3;
    }

    public static /* synthetic */ C2662c c(C2662c c2662c, String str, int i8, AbstractC3790k abstractC3790k, boolean z8, String str2, Source source, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c2662c.f31000a;
        }
        if ((i9 & 2) != 0) {
            i8 = c2662c.f31001b;
        }
        int i10 = i8;
        if ((i9 & 4) != 0) {
            abstractC3790k = c2662c.f31002c;
        }
        AbstractC3790k abstractC3790k2 = abstractC3790k;
        if ((i9 & 8) != 0) {
            z8 = c2662c.f31003d;
        }
        boolean z9 = z8;
        if ((i9 & 16) != 0) {
            str2 = c2662c.f31004e;
        }
        String str4 = str2;
        if ((i9 & 32) != 0) {
            source = c2662c.f31005f;
        }
        Source source2 = source;
        if ((i9 & 64) != 0) {
            str3 = c2662c.f31006g;
        }
        return c2662c.b(str, i10, abstractC3790k2, z9, str4, source2, str3);
    }

    public final C2662c b(String str, int i8, AbstractC3790k abstractC3790k, boolean z8, String str2, Source source, String str3) {
        return new C2662c(str, i8, abstractC3790k, z8, str2, source, str3);
    }

    public final String d() {
        return this.f31000a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f31003d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2662c)) {
            return false;
        }
        C2662c c2662c = (C2662c) obj;
        if (AbstractC3159y.d(this.f31000a, c2662c.f31000a) && this.f31001b == c2662c.f31001b && AbstractC3159y.d(this.f31002c, c2662c.f31002c) && this.f31003d == c2662c.f31003d && AbstractC3159y.d(this.f31004e, c2662c.f31004e) && AbstractC3159y.d(this.f31005f, c2662c.f31005f) && AbstractC3159y.d(this.f31006g, c2662c.f31006g)) {
            return true;
        }
        return false;
    }

    public final AbstractC3790k f() {
        return this.f31002c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f31000a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = ((hashCode * 31) + this.f31001b) * 31;
        AbstractC3790k abstractC3790k = this.f31002c;
        if (abstractC3790k == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC3790k.hashCode();
        }
        int a8 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f31003d)) * 31;
        String str2 = this.f31004e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i10 = (a8 + hashCode3) * 31;
        Source source = this.f31005f;
        if (source == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = source.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str3 = this.f31006g;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return i11 + i8;
    }

    public final int i() {
        return this.f31001b;
    }

    public final Source j() {
        return this.f31005f;
    }

    public final String k() {
        return this.f31004e;
    }

    public final String n() {
        return this.f31006g;
    }

    public final /* synthetic */ Bundle o() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    public final C2663d s() {
        boolean z8;
        AbstractC3790k abstractC3790k = this.f31002c;
        if (!(abstractC3790k instanceof Throwable)) {
            String str = this.f31000a;
            if (str != null && !n.u(str)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8) {
                return new C2663d(this.f31000a, this.f31001b, this.f31003d, this.f31004e, this.f31005f, this.f31006g);
            }
            throw new IllegalArgumentException("Invalid client_secret value in result Intent.".toString());
        }
        throw abstractC3790k;
    }

    public String toString() {
        return "Unvalidated(clientSecret=" + this.f31000a + ", flowOutcome=" + this.f31001b + ", exception=" + this.f31002c + ", canCancelSource=" + this.f31003d + ", sourceId=" + this.f31004e + ", source=" + this.f31005f + ", stripeAccountId=" + this.f31006g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        f30998h.c(this, out, i8);
    }

    public /* synthetic */ C2662c(String str, int i8, AbstractC3790k abstractC3790k, boolean z8, String str2, Source source, String str3, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? null : abstractC3790k, (i9 & 8) == 0 ? z8 : false, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : source, (i9 & 64) != 0 ? null : str3);
    }
}
