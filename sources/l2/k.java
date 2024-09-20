package l2;

import M5.AbstractC1246t;
import M5.a0;
import b3.C1866a;
import b3.C1868c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;

/* loaded from: classes4.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33836a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final List f33837b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f33838c;

    /* renamed from: d, reason: collision with root package name */
    private static final List f33839d;

    /* renamed from: e, reason: collision with root package name */
    private static final List f33840e;

    /* renamed from: f, reason: collision with root package name */
    private static final List f33841f;

    /* renamed from: g, reason: collision with root package name */
    private static final List f33842g;

    /* renamed from: h, reason: collision with root package name */
    private static final List f33843h;

    /* renamed from: i, reason: collision with root package name */
    private static final List f33844i;

    /* renamed from: j, reason: collision with root package name */
    private static final List f33845j;

    /* renamed from: k, reason: collision with root package name */
    private static final List f33846k;

    /* renamed from: l, reason: collision with root package name */
    private static final List f33847l;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        Set d8 = a0.d(new C1868c("4000000000000000", "4999999999999999"));
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(d8, 10));
        Iterator it = d8.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1866a((C1868c) it.next(), 16, C1866a.EnumC0355a.f14386c, null, 8, null));
        }
        f33837b = arrayList;
        Set i8 = a0.i(new C1868c("2221000000000000", "2720999999999999"), new C1868c("5100000000000000", "5599999999999999"));
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(i8, 10));
        Iterator it2 = i8.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C1866a((C1868c) it2.next(), 16, C1866a.EnumC0355a.f14387d, null, 8, null));
        }
        f33838c = arrayList2;
        Set i9 = a0.i(new C1868c("340000000000000", "349999999999999"), new C1868c("370000000000000", "379999999999999"));
        ArrayList arrayList3 = new ArrayList(AbstractC1246t.x(i9, 10));
        Iterator it3 = i9.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new C1866a((C1868c) it3.next(), 15, C1866a.EnumC0355a.f14388e, null, 8, null));
        }
        f33839d = arrayList3;
        Set i10 = a0.i(new C1868c("6000000000000000", "6099999999999999"), new C1868c("6400000000000000", "6499999999999999"), new C1868c("6500000000000000", "6599999999999999"));
        ArrayList arrayList4 = new ArrayList(AbstractC1246t.x(i10, 10));
        Iterator it4 = i10.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new C1866a((C1868c) it4.next(), 16, C1866a.EnumC0355a.f14391h, null, 8, null));
        }
        f33840e = arrayList4;
        Set d9 = a0.d(new C1868c("3528000000000000", "3589999999999999"));
        ArrayList arrayList5 = new ArrayList(AbstractC1246t.x(d9, 10));
        Iterator it5 = d9.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new C1866a((C1868c) it5.next(), 16, C1866a.EnumC0355a.f14389f, null, 8, null));
        }
        f33841f = arrayList5;
        Set i11 = a0.i(new C1868c("6200000000000000", "6216828049999999"), new C1868c("6216828060000000", "6299999999999999"), new C1868c("8100000000000000", "8199999999999999"));
        ArrayList arrayList6 = new ArrayList(AbstractC1246t.x(i11, 10));
        Iterator it6 = i11.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new C1866a((C1868c) it6.next(), 16, C1866a.EnumC0355a.f14392i, null, 8, null));
        }
        f33842g = arrayList6;
        Set d10 = a0.d(new C1868c("6216828050000000000", "6216828059999999999"));
        ArrayList arrayList7 = new ArrayList(AbstractC1246t.x(d10, 10));
        Iterator it7 = d10.iterator();
        while (it7.hasNext()) {
            arrayList7.add(new C1866a((C1868c) it7.next(), 19, C1866a.EnumC0355a.f14392i, null, 8, null));
        }
        f33843h = arrayList7;
        Set i12 = a0.i(new C1868c("3000000000000000", "3059999999999999"), new C1868c("3095000000000000", "3095999999999999"), new C1868c("3800000000000000", "3999999999999999"));
        ArrayList arrayList8 = new ArrayList(AbstractC1246t.x(i12, 10));
        Iterator it8 = i12.iterator();
        while (it8.hasNext()) {
            arrayList8.add(new C1866a((C1868c) it8.next(), 16, C1866a.EnumC0355a.f14390g, null, 8, null));
        }
        f33844i = arrayList8;
        Set d11 = a0.d(new C1868c("36000000000000", "36999999999999"));
        ArrayList arrayList9 = new ArrayList(AbstractC1246t.x(d11, 10));
        Iterator it9 = d11.iterator();
        while (it9.hasNext()) {
            arrayList9.add(new C1866a((C1868c) it9.next(), 14, C1866a.EnumC0355a.f14390g, null, 8, null));
        }
        f33845j = arrayList9;
        Set i13 = a0.i(new C1868c("4000002500001001", "4000002500001001"), new C1868c("5555552500001001", "5555552500001001"));
        ArrayList arrayList10 = new ArrayList(AbstractC1246t.x(i13, 10));
        Iterator it10 = i13.iterator();
        while (it10.hasNext()) {
            arrayList10.add(new C1866a((C1868c) it10.next(), 16, C1866a.EnumC0355a.f14393j, null, 8, null));
        }
        f33846k = arrayList10;
        f33847l = AbstractC1246t.G0(AbstractC1246t.G0(AbstractC1246t.G0(AbstractC1246t.G0(AbstractC1246t.G0(AbstractC1246t.G0(AbstractC1246t.G0(AbstractC1246t.G0(AbstractC1246t.G0(f33837b, f33838c), f33839d), f33840e), f33841f), f33842g), f33843h), f33844i), f33845j), arrayList10);
    }

    @Override // l2.p
    public C1866a a(f.b cardNumber) {
        AbstractC3159y.i(cardNumber, "cardNumber");
        return (C1866a) AbstractC1246t.o0(b(cardNumber));
    }

    @Override // l2.p
    public List b(f.b cardNumber) {
        AbstractC3159y.i(cardNumber, "cardNumber");
        List list = f33847l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C1866a) obj).b().b(cardNumber)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
