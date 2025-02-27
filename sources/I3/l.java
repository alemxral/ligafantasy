package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final u.g f4059a;

    /* renamed from: b, reason: collision with root package name */
    private final I3.a f4060b;

    /* renamed from: c, reason: collision with root package name */
    private final g f4061c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3991f f4062d;

    /* renamed from: e, reason: collision with root package name */
    private final j f4063e;

    /* renamed from: f, reason: collision with root package name */
    private final Y2.d f4064f;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            I3.a createFromParcel;
            AbstractC3159y.i(parcel, "parcel");
            u.g createFromParcel2 = u.g.CREATOR.createFromParcel(parcel);
            g gVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = I3.a.CREATOR.createFromParcel(parcel);
            }
            I3.a aVar = createFromParcel;
            if (parcel.readInt() != 0) {
                gVar = g.CREATOR.createFromParcel(parcel);
            }
            return new l(createFromParcel2, aVar, gVar, (AbstractC3991f) parcel.readParcelable(l.class.getClassLoader()), (j) parcel.readSerializable(), Y2.d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i8) {
            return new l[i8];
        }
    }

    public l(u.g config, I3.a aVar, g gVar, AbstractC3991f abstractC3991f, j jVar, Y2.d paymentMethodMetadata) {
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        this.f4059a = config;
        this.f4060b = aVar;
        this.f4061c = gVar;
        this.f4062d = abstractC3991f;
        this.f4063e = jVar;
        this.f4064f = paymentMethodMetadata;
    }

    public final u.g b() {
        return this.f4059a;
    }

    public final I3.a c() {
        return this.f4060b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final g e() {
        return this.f4061c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3159y.d(this.f4059a, lVar.f4059a) && AbstractC3159y.d(this.f4060b, lVar.f4060b) && AbstractC3159y.d(this.f4061c, lVar.f4061c) && AbstractC3159y.d(this.f4062d, lVar.f4062d) && AbstractC3159y.d(this.f4063e, lVar.f4063e) && AbstractC3159y.d(this.f4064f, lVar.f4064f)) {
            return true;
        }
        return false;
    }

    public final Y2.d f() {
        return this.f4064f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f4059a.hashCode() * 31;
        I3.a aVar = this.f4060b;
        int i8 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i9 = (hashCode4 + hashCode) * 31;
        g gVar = this.f4061c;
        if (gVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        AbstractC3991f abstractC3991f = this.f4062d;
        if (abstractC3991f == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = abstractC3991f.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        j jVar = this.f4063e;
        if (jVar != null) {
            i8 = jVar.hashCode();
        }
        return ((i11 + i8) * 31) + this.f4064f.hashCode();
    }

    public final AbstractC3991f i() {
        return this.f4062d;
    }

    public final boolean j() {
        if ((this.f4060b != null && (!r0.f().isEmpty())) || this.f4064f.a0()) {
            return true;
        }
        return false;
    }

    public final StripeIntent k() {
        return this.f4064f.V();
    }

    public final j n() {
        return this.f4063e;
    }

    public String toString() {
        return "Full(config=" + this.f4059a + ", customer=" + this.f4060b + ", linkState=" + this.f4061c + ", paymentSelection=" + this.f4062d + ", validationError=" + this.f4063e + ", paymentMethodMetadata=" + this.f4064f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f4059a.writeToParcel(out, i8);
        I3.a aVar = this.f4060b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        g gVar = this.f4061c;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        out.writeParcelable(this.f4062d, i8);
        out.writeSerializable(this.f4063e);
        this.f4064f.writeToParcel(out, i8);
    }
}
