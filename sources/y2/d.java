package Y2;

import L5.p;
import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import Y2.g;
import Y2.h;
import Z2.D;
import android.os.Parcel;
import android.os.Parcelable;
import b4.C1880b;
import c4.InterfaceC1925a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import e4.C2600b0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o3.C3527a;
import r3.C3686a;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final StripeIntent f13020a;

    /* renamed from: b, reason: collision with root package name */
    private final u.d f13021b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13022c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13023d;

    /* renamed from: e, reason: collision with root package name */
    private final List f13024e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1925a f13025f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13026g;

    /* renamed from: h, reason: collision with root package name */
    private final u.c f13027h;

    /* renamed from: i, reason: collision with root package name */
    private final C3686a f13028i;

    /* renamed from: j, reason: collision with root package name */
    private final List f13029j;

    /* renamed from: k, reason: collision with root package name */
    private final List f13030k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f13031l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f13032m;

    /* renamed from: n, reason: collision with root package name */
    private final a3.b f13033n;

    /* renamed from: o, reason: collision with root package name */
    private final g f13034o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f13035p;

    /* renamed from: q, reason: collision with root package name */
    public static final a f13018q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f13019r = 8;
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(j elementsSession, B2.a configuration, List sharedDataSpecs, boolean z8, o3.d isFinancialConnectionsAvailable) {
            AbstractC3159y.i(elementsSession, "elementsSession");
            AbstractC3159y.i(configuration, "configuration");
            AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            StripeIntent s8 = elementsSession.s();
            u.d e8 = configuration.e();
            List n8 = configuration.n();
            InterfaceC1925a a8 = InterfaceC1925a.f14967b0.a(elementsSession.u(), configuration.o());
            String k8 = configuration.k();
            u.c f8 = configuration.f();
            boolean invoke = isFinancialConnectionsAvailable.invoke();
            return new d(s8, e8, true, false, n8, a8, k8, f8, null, sharedDataSpecs, AbstractC1246t.m(), true, z8, null, g.c.f13044a, invoke);
        }

        public final d b(j elementsSession, u.g configuration, List sharedDataSpecs, List externalPaymentMethodSpecs, boolean z8, a3.b bVar) {
            boolean z9;
            AbstractC3159y.i(elementsSession, "elementsSession");
            AbstractC3159y.i(configuration, "configuration");
            AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3159y.i(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
            StripeIntent s8 = elementsSession.s();
            u.d i8 = configuration.i();
            boolean b8 = configuration.b();
            boolean c8 = configuration.c();
            List z10 = configuration.z();
            InterfaceC1925a a8 = InterfaceC1925a.f14967b0.a(elementsSession.u(), configuration.G());
            String s9 = configuration.s();
            u.c k8 = configuration.k();
            C3686a t8 = configuration.t();
            if (configuration.j() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new d(s8, i8, b8, c8, z10, a8, s9, k8, t8, sharedDataSpecs, externalPaymentMethodSpecs, z9, z8, bVar, e.a(elementsSession), false, 32768, null);
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
            boolean z8;
            boolean z9;
            u.c createFromParcel;
            C3686a createFromParcel2;
            boolean z10;
            boolean z11;
            a3.b createFromParcel3;
            boolean z12;
            AbstractC3159y.i(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(d.class.getClassLoader());
            u.d createFromParcel4 = u.d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            InterfaceC1925a interfaceC1925a = (InterfaceC1925a) parcel.readParcelable(d.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = u.c.CREATOR.createFromParcel(parcel);
            }
            u.c cVar = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = C3686a.CREATOR.createFromParcel(parcel);
            }
            C3686a c3686a = createFromParcel2;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(d.class.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                arrayList2.add(parcel.readParcelable(d.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel3 = null;
            } else {
                createFromParcel3 = a3.b.CREATOR.createFromParcel(parcel);
            }
            a3.b bVar = createFromParcel3;
            g gVar = (g) parcel.readParcelable(d.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            return new d(stripeIntent, createFromParcel4, z8, z9, createStringArrayList, interfaceC1925a, readString, cVar, c3686a, arrayList, arrayList2, z10, z11, bVar, gVar, z12);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f13036a;

        public c(Map map) {
            this.f13036a = map;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a((Integer) this.f13036a.get((String) obj), (Integer) this.f13036a.get((String) obj2));
        }
    }

    public d(StripeIntent stripeIntent, u.d billingDetailsCollectionConfiguration, boolean z8, boolean z9, List paymentMethodOrder, InterfaceC1925a cbcEligibility, String merchantName, u.c cVar, C3686a c3686a, List sharedDataSpecs, List externalPaymentMethodSpecs, boolean z10, boolean z11, a3.b bVar, g paymentMethodSaveConsentBehavior, boolean z12) {
        AbstractC3159y.i(stripeIntent, "stripeIntent");
        AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC3159y.i(paymentMethodOrder, "paymentMethodOrder");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
        AbstractC3159y.i(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
        AbstractC3159y.i(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        this.f13020a = stripeIntent;
        this.f13021b = billingDetailsCollectionConfiguration;
        this.f13022c = z8;
        this.f13023d = z9;
        this.f13024e = paymentMethodOrder;
        this.f13025f = cbcEligibility;
        this.f13026g = merchantName;
        this.f13027h = cVar;
        this.f13028i = c3686a;
        this.f13029j = sharedDataSpecs;
        this.f13030k = externalPaymentMethodSpecs;
        this.f13031l = z10;
        this.f13032m = z11;
        this.f13033n = bVar;
        this.f13034o = paymentMethodSaveConsentBehavior;
        this.f13035p = z12;
    }

    private final h.d X(String str) {
        Object obj;
        Iterator it = this.f13030k.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((C2600b0) obj).getType(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C2600b0 c2600b0 = (C2600b0) obj;
        if (c2600b0 == null) {
            return null;
        }
        return new D(c2600b0);
    }

    private final Map b0(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list2, 10));
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1246t.w();
            }
            arrayList.add(x.a((String) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        return Q.w(arrayList);
    }

    private final o.b c(AbstractC3991f.a aVar) {
        g gVar = this.f13034o;
        if (gVar instanceof g.c) {
            return o.b.f24421b;
        }
        if (gVar instanceof g.a) {
            return o.b.f24421b;
        }
        if (gVar instanceof g.b) {
            if (aVar == AbstractC3991f.a.f39745b) {
                return o.b.f24423d;
            }
            return o.b.f24421b;
        }
        throw new p();
    }

    private final List c0() {
        List Z02 = AbstractC1246t.Z0(AbstractC1246t.G0(this.f13020a.g(), i()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.f13024e) {
            if (Z02.contains(str)) {
                arrayList.add(str);
                Z02.remove(str);
            }
        }
        arrayList.addAll(Z02);
        return arrayList;
    }

    private final o.b e(AbstractC3991f.a aVar) {
        g gVar = this.f13034o;
        if (gVar instanceof g.c) {
            return o.b.f24421b;
        }
        if (gVar instanceof g.a) {
            o.b b8 = ((g.a) gVar).b();
            if (b8 == null) {
                return o.b.f24422c;
            }
            return b8;
        }
        if (gVar instanceof g.b) {
            if (aVar == AbstractC3991f.a.f39745b) {
                return o.b.f24423d;
            }
            return o.b.f24422c;
        }
        throw new p();
    }

    private final List f0() {
        List g8 = this.f13020a.g();
        ArrayList arrayList = new ArrayList();
        Iterator it = g8.iterator();
        while (it.hasNext()) {
            Y2.b bVar = (Y2.b) f.f13037a.b().get((String) it.next());
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Y2.c.a((Y2.b) obj, this)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            Y2.b bVar2 = (Y2.b) obj2;
            if (!this.f13020a.a() || !this.f13020a.D().contains(bVar2.getType().f24537a)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            Y2.b bVar3 = (Y2.b) obj3;
            if (bVar3.b().h(bVar3, this.f13029j)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    private final List i() {
        List list = this.f13030k;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2600b0) it.next()).getType());
        }
        return arrayList;
    }

    public final boolean G() {
        return this.f13035p;
    }

    public final boolean I() {
        return this.f13031l;
    }

    public final a3.b L() {
        return this.f13033n;
    }

    public final String Q() {
        return this.f13026g;
    }

    public final g T() {
        return this.f13034o;
    }

    public final StripeIntent V() {
        return this.f13020a;
    }

    public final boolean Y() {
        StripeIntent stripeIntent = this.f13020a;
        if (stripeIntent instanceof n) {
            if (((n) stripeIntent).E() != null) {
                return true;
            }
            return false;
        }
        if (stripeIntent instanceof com.stripe.android.model.u) {
            return true;
        }
        throw new p();
    }

    public final boolean Z(String code) {
        AbstractC3159y.i(code, "code");
        return i().contains(code);
    }

    public final boolean a0() {
        return this.f13032m;
    }

    public final o.b b(AbstractC3991f.a customerRequestedSave) {
        AbstractC3159y.i(customerRequestedSave, "customerRequestedSave");
        if (Y()) {
            return e(customerRequestedSave);
        }
        return c(customerRequestedSave);
    }

    public final boolean d0(String paymentMethodCode) {
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        Y2.b bVar = (Y2.b) f.f13037a.b().get(paymentMethodCode);
        if (bVar != null) {
            return bVar.c(this);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List e0() {
        List h02 = h0();
        ArrayList arrayList = new ArrayList();
        Iterator it = h02.iterator();
        while (it.hasNext()) {
            X2.g g02 = g0((String) it.next());
            if (g02 != null) {
                arrayList.add(g02);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f13020a, dVar.f13020a) && AbstractC3159y.d(this.f13021b, dVar.f13021b) && this.f13022c == dVar.f13022c && this.f13023d == dVar.f13023d && AbstractC3159y.d(this.f13024e, dVar.f13024e) && AbstractC3159y.d(this.f13025f, dVar.f13025f) && AbstractC3159y.d(this.f13026g, dVar.f13026g) && AbstractC3159y.d(this.f13027h, dVar.f13027h) && AbstractC3159y.d(this.f13028i, dVar.f13028i) && AbstractC3159y.d(this.f13029j, dVar.f13029j) && AbstractC3159y.d(this.f13030k, dVar.f13030k) && this.f13031l == dVar.f13031l && this.f13032m == dVar.f13032m && AbstractC3159y.d(this.f13033n, dVar.f13033n) && AbstractC3159y.d(this.f13034o, dVar.f13034o) && this.f13035p == dVar.f13035p) {
            return true;
        }
        return false;
    }

    public final C1880b f() {
        if (this.f13020a instanceof n) {
            Long e8 = ((n) this.f13020a).e();
            if (e8 != null) {
                long longValue = e8.longValue();
                String K8 = ((n) this.f13020a).K();
                if (K8 != null) {
                    return new C1880b(longValue, K8);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return null;
    }

    public final X2.g g0(String code) {
        Object obj;
        AbstractC3159y.i(code, "code");
        if (Z(code)) {
            h.d X7 = X(code);
            if (X7 == null) {
                return null;
            }
            return X7.j();
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((Y2.b) obj).getType().f24537a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Y2.b bVar = (Y2.b) obj;
        if (bVar == null) {
            return null;
        }
        return bVar.b().f(bVar, this.f13029j);
    }

    public final List h0() {
        List f02 = f0();
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(f02, 10));
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            arrayList.add(((Y2.b) it.next()).getType().f24537a);
        }
        List G02 = AbstractC1246t.G0(arrayList, i());
        if (!this.f13024e.isEmpty()) {
            return AbstractC1246t.P0(G02, new c(b0(c0())));
        }
        return G02;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((((this.f13020a.hashCode() * 31) + this.f13021b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f13022c)) * 31) + androidx.compose.foundation.a.a(this.f13023d)) * 31) + this.f13024e.hashCode()) * 31) + this.f13025f.hashCode()) * 31) + this.f13026g.hashCode()) * 31;
        u.c cVar = this.f13027h;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        C3686a c3686a = this.f13028i;
        if (c3686a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c3686a.hashCode();
        }
        int hashCode4 = (((((((((i9 + hashCode2) * 31) + this.f13029j.hashCode()) * 31) + this.f13030k.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f13031l)) * 31) + androidx.compose.foundation.a.a(this.f13032m)) * 31;
        a3.b bVar = this.f13033n;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((((hashCode4 + i8) * 31) + this.f13034o.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f13035p);
    }

    public final List i0() {
        List f02 = f0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f02) {
            if (((Y2.b) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Y2.b) it.next()).getType());
        }
        return arrayList2;
    }

    public final List j(String code, h.a.InterfaceC0245a uiDefinitionFactoryArgumentsFactory) {
        Object obj;
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(uiDefinitionFactoryArgumentsFactory, "uiDefinitionFactoryArgumentsFactory");
        if (Z(code)) {
            h.d X7 = X(code);
            if (X7 == null) {
                return null;
            }
            return X7.g(this, uiDefinitionFactoryArgumentsFactory.a(this, false));
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((Y2.b) obj).getType().f24537a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Y2.b bVar = (Y2.b) obj;
        if (bVar == null) {
            return null;
        }
        return bVar.b().i(bVar, this, this.f13029j, uiDefinitionFactoryArgumentsFactory.a(this, bVar.c(this)));
    }

    public final W2.a k(String code, boolean z8) {
        Object obj;
        AbstractC3159y.i(code, "code");
        if (Z(code)) {
            h.d X7 = X(code);
            if (X7 == null) {
                return null;
            }
            return X7.b(z8);
        }
        Iterator it = f0().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((Y2.b) obj).getType().f24537a, code)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Y2.b bVar = (Y2.b) obj;
        if (bVar == null) {
            return null;
        }
        return bVar.b().e(bVar, this, this.f13029j, z8);
    }

    public final boolean n() {
        return this.f13022c;
    }

    public final boolean o() {
        return this.f13023d;
    }

    public final u.d s() {
        return this.f13021b;
    }

    public final C3686a t() {
        return this.f13028i;
    }

    public String toString() {
        return "PaymentMethodMetadata(stripeIntent=" + this.f13020a + ", billingDetailsCollectionConfiguration=" + this.f13021b + ", allowsDelayedPaymentMethods=" + this.f13022c + ", allowsPaymentMethodsRequiringShippingAddress=" + this.f13023d + ", paymentMethodOrder=" + this.f13024e + ", cbcEligibility=" + this.f13025f + ", merchantName=" + this.f13026g + ", defaultBillingDetails=" + this.f13027h + ", shippingDetails=" + this.f13028i + ", sharedDataSpecs=" + this.f13029j + ", externalPaymentMethodSpecs=" + this.f13030k + ", hasCustomerConfiguration=" + this.f13031l + ", isGooglePayReady=" + this.f13032m + ", linkInlineConfiguration=" + this.f13033n + ", paymentMethodSaveConsentBehavior=" + this.f13034o + ", financialConnectionsAvailable=" + this.f13035p + ")";
    }

    public final InterfaceC1925a u() {
        return this.f13025f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f13020a, i8);
        this.f13021b.writeToParcel(out, i8);
        out.writeInt(this.f13022c ? 1 : 0);
        out.writeInt(this.f13023d ? 1 : 0);
        out.writeStringList(this.f13024e);
        out.writeParcelable(this.f13025f, i8);
        out.writeString(this.f13026g);
        u.c cVar = this.f13027h;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        C3686a c3686a = this.f13028i;
        if (c3686a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c3686a.writeToParcel(out, i8);
        }
        List list = this.f13029j;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        List list2 = this.f13030k;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeParcelable((Parcelable) it2.next(), i8);
        }
        out.writeInt(this.f13031l ? 1 : 0);
        out.writeInt(this.f13032m ? 1 : 0);
        a3.b bVar = this.f13033n;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
        out.writeParcelable(this.f13034o, i8);
        out.writeInt(this.f13035p ? 1 : 0);
    }

    public final u.c z() {
        return this.f13027h;
    }

    public /* synthetic */ d(StripeIntent stripeIntent, u.d dVar, boolean z8, boolean z9, List list, InterfaceC1925a interfaceC1925a, String str, u.c cVar, C3686a c3686a, List list2, List list3, boolean z10, boolean z11, a3.b bVar, g gVar, boolean z12, int i8, AbstractC3151p abstractC3151p) {
        this(stripeIntent, dVar, z8, z9, list, interfaceC1925a, str, cVar, c3686a, list2, list3, z10, z11, bVar, gVar, (i8 & 32768) != 0 ? C3527a.f36362a.invoke() : z12);
    }
}
