package I3;

import L5.p;
import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.j;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f3907a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3908b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3909c;

    /* renamed from: d, reason: collision with root package name */
    private final c f3910d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0058a f3905e = new C0058a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f3906f = 8;
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: I3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0058a {
        private C0058a() {
        }

        public final a a(j.c customer, List supportedSavedPaymentMethodTypes) {
            boolean z8;
            AbstractC3159y.i(customer, "customer");
            AbstractC3159y.i(supportedSavedPaymentMethodTypes, "supportedSavedPaymentMethodTypes");
            j.c.a.InterfaceC0508c b8 = customer.c().c().b();
            if (b8 instanceof j.c.a.InterfaceC0508c.b) {
                z8 = ((j.c.a.InterfaceC0508c.b) b8).c();
            } else if (b8 instanceof j.c.a.InterfaceC0508c.C0509a) {
                z8 = false;
            } else {
                throw new p();
            }
            String e8 = customer.c().e();
            String b9 = customer.c().b();
            List b10 = customer.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : b10) {
                if (AbstractC1246t.d0(supportedSavedPaymentMethodTypes, ((o) obj).f24399e)) {
                    arrayList.add(obj);
                }
            }
            return new a(e8, b9, arrayList, new c(z8, true));
        }

        public final a b(String customerId, u.h.b accessType, List paymentMethods) {
            AbstractC3159y.i(customerId, "customerId");
            AbstractC3159y.i(accessType, "accessType");
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            return new a(customerId, accessType.b(), paymentMethods, new c(true, false));
        }

        public /* synthetic */ C0058a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(a.class.getClassLoader()));
            }
            return new a(readString, readString2, arrayList, c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0059a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f3911a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3912b;

        /* renamed from: I3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0059a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3159y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new c(z8, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(boolean z8, boolean z9) {
            this.f3911a = z8;
            this.f3912b = z9;
        }

        public final boolean b() {
            return this.f3912b;
        }

        public final boolean c() {
            return this.f3911a;
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
            if (this.f3911a == cVar.f3911a && this.f3912b == cVar.f3912b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f3911a) * 31) + androidx.compose.foundation.a.a(this.f3912b);
        }

        public String toString() {
            return "Permissions(canRemovePaymentMethods=" + this.f3911a + ", canRemoveDuplicates=" + this.f3912b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f3911a ? 1 : 0);
            out.writeInt(this.f3912b ? 1 : 0);
        }
    }

    public a(String id, String ephemeralKeySecret, List paymentMethods, c permissions) {
        AbstractC3159y.i(id, "id");
        AbstractC3159y.i(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(permissions, "permissions");
        this.f3907a = id;
        this.f3908b = ephemeralKeySecret;
        this.f3909c = paymentMethods;
        this.f3910d = permissions;
    }

    public static /* synthetic */ a c(a aVar, String str, String str2, List list, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = aVar.f3907a;
        }
        if ((i8 & 2) != 0) {
            str2 = aVar.f3908b;
        }
        if ((i8 & 4) != 0) {
            list = aVar.f3909c;
        }
        if ((i8 & 8) != 0) {
            cVar = aVar.f3910d;
        }
        return aVar.b(str, str2, list, cVar);
    }

    public final a b(String id, String ephemeralKeySecret, List paymentMethods, c permissions) {
        AbstractC3159y.i(id, "id");
        AbstractC3159y.i(ephemeralKeySecret, "ephemeralKeySecret");
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(permissions, "permissions");
        return new a(id, ephemeralKeySecret, paymentMethods, permissions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f3908b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f3907a, aVar.f3907a) && AbstractC3159y.d(this.f3908b, aVar.f3908b) && AbstractC3159y.d(this.f3909c, aVar.f3909c) && AbstractC3159y.d(this.f3910d, aVar.f3910d)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f3909c;
    }

    public final String getId() {
        return this.f3907a;
    }

    public int hashCode() {
        return (((((this.f3907a.hashCode() * 31) + this.f3908b.hashCode()) * 31) + this.f3909c.hashCode()) * 31) + this.f3910d.hashCode();
    }

    public final c i() {
        return this.f3910d;
    }

    public String toString() {
        return "CustomerState(id=" + this.f3907a + ", ephemeralKeySecret=" + this.f3908b + ", paymentMethods=" + this.f3909c + ", permissions=" + this.f3910d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f3907a);
        out.writeString(this.f3908b);
        List list = this.f3909c;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        this.f3910d.writeToParcel(out, i8);
    }
}
