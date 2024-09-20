package w3;

import L5.I;
import L5.t;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.a0;
import X5.n;
import X5.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.u;
import e4.C2587A;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.v;
import m4.D;
import m4.G;
import m4.h0;
import m6.k;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final List f38991a;

    /* renamed from: b, reason: collision with root package name */
    private final A3.a f38992b;

    /* renamed from: c, reason: collision with root package name */
    private final C2587A f38993c;

    /* renamed from: d, reason: collision with root package name */
    private v f38994d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f38995e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3358f f38996f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3358f f38997g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f38998h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3349K f38999i;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f39000a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f39000a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                w3.f fVar = w3.f.f39028a;
                List d8 = d.this.d();
                this.f39000a = 1;
                if (fVar.b(d8, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final List f39002a;

        /* renamed from: b, reason: collision with root package name */
        private final A3.a f39003b;

        public b(List formElements, A3.a formArguments) {
            AbstractC3159y.i(formElements, "formElements");
            AbstractC3159y.i(formArguments, "formArguments");
            this.f39002a = formElements;
            this.f39003b = formArguments;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            return new d(this.f39002a, this.f39003b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f39004a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f39005a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f39005a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f39005a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements o {

            /* renamed from: a, reason: collision with root package name */
            int f39006a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f39007b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f39008c;

            public b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f39006a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f39007b;
                    List z8 = AbstractC1246t.z(AbstractC1239l.V0((List[]) ((Object[]) this.f39008c)));
                    this.f39006a = 1;
                    if (interfaceC3359g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar);
                bVar.f39007b = interfaceC3359g;
                bVar.f39008c = objArr;
                return bVar.invokeSuspend(I.f6474a);
            }
        }

        public c(InterfaceC3358f[] interfaceC3358fArr) {
            this.f39004a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f39004a;
            Object a8 = k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return I.f6474a;
        }
    }

    /* renamed from: w3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0903d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0903d f39009a = new C0903d();

        C0903d() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(Set cardBillingIdentifiers, Set externalHiddenIdentifiers) {
            AbstractC3159y.i(cardBillingIdentifiers, "cardBillingIdentifiers");
            AbstractC3159y.i(externalHiddenIdentifiers, "externalHiddenIdentifiers");
            return a0.m(externalHiddenIdentifiers, cardBillingIdentifiers);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f39010a = new e();

        e() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(Set hiddenIds, List textFieldControllerIds) {
            Object obj;
            AbstractC3159y.i(hiddenIds, "hiddenIds");
            AbstractC3159y.i(textFieldControllerIds, "textFieldControllerIds");
            ListIterator listIterator = textFieldControllerIds.listIterator(textFieldControllerIds.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (!hiddenIds.contains((G) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (G) obj;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f39011a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f39012a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f39012a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f39012a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements o {

            /* renamed from: a, reason: collision with root package name */
            int f39013a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f39014b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f39015c;

            public b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f39013a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f39014b;
                    List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f39015c)));
                    this.f39013a = 1;
                    if (interfaceC3359g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar);
                bVar.f39014b = interfaceC3359g;
                bVar.f39015c = objArr;
                return bVar.invokeSuspend(I.f6474a);
            }
        }

        public f(InterfaceC3358f[] interfaceC3358fArr) {
            this.f39011a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f39011a;
            Object a8 = k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f39016a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(0);
            this.f39016a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f39016a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f39017a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f39018a;

            /* renamed from: w3.d$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0904a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f39019a;

                /* renamed from: b, reason: collision with root package name */
                int f39020b;

                public C0904a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f39019a = obj;
                    this.f39020b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3359g interfaceC3359g) {
                this.f39018a = interfaceC3359g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, P5.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof w3.d.h.a.C0904a
                    if (r0 == 0) goto L13
                    r0 = r9
                    w3.d$h$a$a r0 = (w3.d.h.a.C0904a) r0
                    int r1 = r0.f39020b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f39020b = r1
                    goto L18
                L13:
                    w3.d$h$a$a r0 = new w3.d$h$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f39019a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f39020b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    L5.t.b(r9)
                    goto Ld1
                L2a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L32:
                    L5.t.b(r9)
                    l6.g r9 = r7.f39018a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L44:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L65
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    L5.r r5 = (L5.r) r5
                    java.lang.Object r5 = r5.c()
                    m4.G$b r6 = m4.G.Companion
                    m4.G r6 = r6.x()
                    boolean r5 = kotlin.jvm.internal.AbstractC3159y.d(r5, r6)
                    if (r5 == 0) goto L44
                    r2.add(r4)
                    goto L44
                L65:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r4 = 10
                    int r5 = M5.AbstractC1246t.x(r2, r4)
                    r8.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L74:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L96
                    java.lang.Object r5 = r2.next()
                    L5.r r5 = (L5.r) r5
                    java.lang.Object r5 = r5.d()
                    r4.a r5 = (r4.C3688a) r5
                    java.lang.String r5 = r5.c()
                    boolean r5 = java.lang.Boolean.parseBoolean(r5)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r8.add(r5)
                    goto L74
                L96:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    int r4 = M5.AbstractC1246t.x(r8, r4)
                    r2.<init>(r4)
                    java.util.Iterator r8 = r8.iterator()
                La3:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto Lbe
                    java.lang.Object r4 = r8.next()
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto Lb8
                    y3.f$a r4 = y3.AbstractC3991f.a.f39745b
                    goto Lba
                Lb8:
                    y3.f$a r4 = y3.AbstractC3991f.a.f39746c
                Lba:
                    r2.add(r4)
                    goto La3
                Lbe:
                    java.lang.Object r8 = M5.AbstractC1246t.o0(r2)
                    y3.f$a r8 = (y3.AbstractC3991f.a) r8
                    if (r8 != 0) goto Lc8
                    y3.f$a r8 = y3.AbstractC3991f.a.f39747d
                Lc8:
                    r0.f39020b = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto Ld1
                    return r1
                Ld1:
                    L5.I r8 = L5.I.f6474a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: w3.d.h.a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public h(InterfaceC3358f interfaceC3358f) {
            this.f39017a = interfaceC3358f;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f39017a.collect(new a(interfaceC3359g), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f39022a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3359g f39023a;

            /* renamed from: w3.d$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0905a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f39024a;

                /* renamed from: b, reason: collision with root package name */
                int f39025b;

                public C0905a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f39024a = obj;
                    this.f39025b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3359g interfaceC3359g) {
                this.f39023a = interfaceC3359g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // l6.InterfaceC3359g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, P5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof w3.d.i.a.C0905a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w3.d$i$a$a r0 = (w3.d.i.a.C0905a) r0
                    int r1 = r0.f39025b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f39025b = r1
                    goto L18
                L13:
                    w3.d$i$a$a r0 = new w3.d$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f39024a
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f39025b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    L5.t.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    L5.t.b(r6)
                    l6.g r6 = r4.f39023a
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.Map r5 = M5.Q.w(r5)
                    r0.f39025b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    L5.I r5 = L5.I.f6474a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: w3.d.i.a.emit(java.lang.Object, P5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3358f interfaceC3358f) {
            this.f39022a = interfaceC3358f;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            Object collect = this.f39022a.collect(new a(interfaceC3359g), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return I.f6474a;
        }
    }

    public d(List elements, A3.a formArguments) {
        InterfaceC3358f fVar;
        InterfaceC3349K w8;
        AbstractC3159y.i(elements, "elements");
        AbstractC3159y.i(formArguments, "formArguments");
        this.f38991a = elements;
        this.f38992b = formArguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof h0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1246t.D(arrayList2, ((h0) it.next()).g());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof C2587A) {
                arrayList3.add(obj2);
            }
        }
        C2587A c2587a = (C2587A) AbstractC1246t.o0(arrayList3);
        this.f38993c = c2587a;
        this.f38994d = AbstractC3351M.a(a0.f());
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        InterfaceC3349K d8 = v4.g.d((c2587a == null || (w8 = c2587a.w()) == null) ? v4.g.n(a0.f()) : w8, this.f38994d, C0903d.f39009a);
        this.f38995e = d8;
        h hVar = new h(a());
        this.f38996f = hVar;
        this.f38997g = new C3846a(new i(a()), d8, hVar, c()).c();
        List list = this.f38991a;
        ArrayList arrayList4 = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((D) it2.next()).e());
        }
        if (arrayList4.isEmpty()) {
            fVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
        } else {
            fVar = new f((InterfaceC3358f[]) AbstractC1246t.W0(arrayList4).toArray(new InterfaceC3358f[0]));
        }
        v4.e eVar = new v4.e(fVar, new g(arrayList4));
        this.f38998h = eVar;
        this.f38999i = v4.g.d(this.f38995e, eVar, e.f39010a);
    }

    private final InterfaceC3358f a() {
        if (this.f38991a.isEmpty()) {
            return AbstractC3360h.z(AbstractC1246t.m());
        }
        List list = this.f38991a;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((D) it.next()).d());
        }
        return new c((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
    }

    public final InterfaceC3358f b() {
        return this.f38997g;
    }

    public final Map c() {
        u.c b8;
        String c8;
        String i8;
        String j8;
        String b9;
        String f8;
        String e8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f38992b.c().c() && (b8 = this.f38992b.b()) != null) {
            String e9 = b8.e();
            if (e9 != null) {
                linkedHashMap.put(G.Companion.r(), e9);
            }
            String c9 = b8.c();
            if (c9 != null) {
                linkedHashMap.put(G.Companion.n(), c9);
            }
            String f9 = b8.f();
            if (f9 != null) {
                linkedHashMap.put(G.Companion.t(), f9);
            }
            u.a b10 = b8.b();
            if (b10 != null && (e8 = b10.e()) != null) {
                linkedHashMap.put(G.Companion.p(), e8);
            }
            u.a b11 = b8.b();
            if (b11 != null && (f8 = b11.f()) != null) {
                linkedHashMap.put(G.Companion.q(), f8);
            }
            u.a b12 = b8.b();
            if (b12 != null && (b9 = b12.b()) != null) {
                linkedHashMap.put(G.Companion.k(), b9);
            }
            u.a b13 = b8.b();
            if (b13 != null && (j8 = b13.j()) != null) {
                linkedHashMap.put(G.Companion.z(), j8);
            }
            u.a b14 = b8.b();
            if (b14 != null && (i8 = b14.i()) != null) {
                linkedHashMap.put(G.Companion.u(), i8);
            }
            u.a b15 = b8.b();
            if (b15 != null && (c8 = b15.c()) != null) {
                linkedHashMap.put(G.Companion.l(), c8);
            }
        }
        return linkedHashMap;
    }

    public final List d() {
        return this.f38991a;
    }

    public final InterfaceC3349K e() {
        return this.f38995e;
    }

    public final InterfaceC3349K f() {
        return this.f38999i;
    }
}
