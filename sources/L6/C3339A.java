package l6;

import L5.s;
import i6.C2839p;
import i6.InterfaceC2816d0;
import java.util.Arrays;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3159y;
import n6.C3486F;

/* renamed from: l6.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3339A extends m6.b implements u, InterfaceC3358f, m6.p {

    /* renamed from: e, reason: collision with root package name */
    private final int f34540e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34541f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC3132a f34542g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f34543h;

    /* renamed from: i, reason: collision with root package name */
    private long f34544i;

    /* renamed from: j, reason: collision with root package name */
    private long f34545j;

    /* renamed from: k, reason: collision with root package name */
    private int f34546k;

    /* renamed from: l, reason: collision with root package name */
    private int f34547l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6.A$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC2816d0 {

        /* renamed from: a, reason: collision with root package name */
        public final C3339A f34548a;

        /* renamed from: b, reason: collision with root package name */
        public long f34549b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f34550c;

        /* renamed from: d, reason: collision with root package name */
        public final P5.d f34551d;

        public a(C3339A c3339a, long j8, Object obj, P5.d dVar) {
            this.f34548a = c3339a;
            this.f34549b = j8;
            this.f34550c = obj;
            this.f34551d = dVar;
        }

        @Override // i6.InterfaceC2816d0
        public void dispose() {
            this.f34548a.y(this);
        }
    }

    /* renamed from: l6.A$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34552a;

        static {
            int[] iArr = new int[EnumC3132a.values().length];
            try {
                iArr[EnumC3132a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3132a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3132a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34552a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.A$c */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34553a;

        /* renamed from: b, reason: collision with root package name */
        Object f34554b;

        /* renamed from: c, reason: collision with root package name */
        Object f34555c;

        /* renamed from: d, reason: collision with root package name */
        Object f34556d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f34557e;

        /* renamed from: g, reason: collision with root package name */
        int f34559g;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34557e = obj;
            this.f34559g |= Integer.MIN_VALUE;
            return C3339A.A(C3339A.this, null, this);
        }
    }

    public C3339A(int i8, int i9, EnumC3132a enumC3132a) {
        this.f34540e = i8;
        this.f34541f = i9;
        this.f34542g = enumC3132a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(2:18|(9:26|(1:28)|29|(1:31)|15|16|17|18|(0)(1:20))(0))|23)(2:33|34))(5:35|36|17|(2:18|(0)(0))|23))(4:37|38|39|40))(1:51)|41|42|16|17|(2:18|(0)(0))|23))|41|42|16|17|(2:18|(0)(0))|23)|53|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0042, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003b, B:18:0x0092, B:20:0x009a, B:28:0x00ad, B:29:0x00b0, B:36:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [m6.b] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, l6.A] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [l6.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [m6.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, l6.C] */
    /* JADX WARN: Type inference failed for: r9v9, types: [l6.C] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00be -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object A(l6.C3339A r8, l6.InterfaceC3359g r9, P5.d r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.C3339A.A(l6.A, l6.g, P5.d):java.lang.Object");
    }

    private final void B(long j8) {
        m6.d[] g8;
        if (m6.b.f(this) != 0 && (g8 = m6.b.g(this)) != null) {
            for (m6.d dVar : g8) {
                if (dVar != null) {
                    C3341C c3341c = (C3341C) dVar;
                    long j9 = c3341c.f34561a;
                    if (j9 >= 0 && j9 < j8) {
                        c3341c.f34561a = j8;
                    }
                }
            }
        }
        this.f34545j = j8;
    }

    private final void E() {
        Object[] objArr = this.f34543h;
        AbstractC3159y.f(objArr);
        AbstractC3340B.g(objArr, K(), null);
        this.f34546k--;
        long K8 = K() + 1;
        if (this.f34544i < K8) {
            this.f34544i = K8;
        }
        if (this.f34545j < K8) {
            B(K8);
        }
    }

    static /* synthetic */ Object F(C3339A c3339a, Object obj, P5.d dVar) {
        if (c3339a.d(obj)) {
            return L5.I.f6474a;
        }
        Object G8 = c3339a.G(obj, dVar);
        if (G8 == Q5.b.e()) {
            return G8;
        }
        return L5.I.f6474a;
    }

    private final Object G(Object obj, P5.d dVar) {
        P5.d[] dVarArr;
        a aVar;
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        P5.d[] dVarArr2 = m6.c.f35861a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    s.a aVar2 = L5.s.f6498b;
                    c2839p.resumeWith(L5.s.b(L5.I.f6474a));
                    dVarArr = I(dVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, P() + K(), obj, c2839p);
                    H(aVar3);
                    this.f34547l++;
                    if (this.f34541f == 0) {
                        dVarArr2 = I(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            i6.r.a(c2839p, aVar);
        }
        for (P5.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                s.a aVar4 = L5.s.f6498b;
                dVar2.resumeWith(L5.s.b(L5.I.f6474a));
            }
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == Q5.b.e()) {
            return y8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int P8 = P();
        Object[] objArr = this.f34543h;
        if (objArr == null) {
            objArr = Q(null, 0, 2);
        } else if (P8 >= objArr.length) {
            objArr = Q(objArr, P8, objArr.length * 2);
        }
        AbstractC3340B.g(objArr, K() + P8, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final P5.d[] I(P5.d[] dVarArr) {
        m6.d[] g8;
        C3341C c3341c;
        P5.d dVar;
        int length = dVarArr.length;
        if (m6.b.f(this) != 0 && (g8 = m6.b.g(this)) != null) {
            int length2 = g8.length;
            int i8 = 0;
            dVarArr = dVarArr;
            while (i8 < length2) {
                m6.d dVar2 = g8[i8];
                if (dVar2 != null && (dVar = (c3341c = (C3341C) dVar2).f34562b) != null && T(c3341c) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        AbstractC3159y.h(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    c3341c.f34562b = null;
                    length++;
                }
                i8++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long J() {
        return K() + this.f34546k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f34545j, this.f34544i);
    }

    private final Object M(long j8) {
        Object f8;
        Object[] objArr = this.f34543h;
        AbstractC3159y.f(objArr);
        f8 = AbstractC3340B.f(objArr, j8);
        if (f8 instanceof a) {
            return ((a) f8).f34550c;
        }
        return f8;
    }

    private final long N() {
        return K() + this.f34546k + this.f34547l;
    }

    private final int O() {
        return (int) ((K() + this.f34546k) - this.f34544i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.f34546k + this.f34547l;
    }

    private final Object[] Q(Object[] objArr, int i8, int i9) {
        Object f8;
        if (i9 > 0) {
            Object[] objArr2 = new Object[i9];
            this.f34543h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long K8 = K();
            for (int i10 = 0; i10 < i8; i10++) {
                long j8 = i10 + K8;
                f8 = AbstractC3340B.f(objArr, j8);
                AbstractC3340B.g(objArr2, j8, f8);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f34546k >= this.f34541f && this.f34545j <= this.f34544i) {
            int i8 = b.f34552a[this.f34542g.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        H(obj);
        int i9 = this.f34546k + 1;
        this.f34546k = i9;
        if (i9 > this.f34541f) {
            E();
        }
        if (O() > this.f34540e) {
            V(this.f34544i + 1, this.f34545j, J(), N());
        }
        return true;
    }

    private final boolean S(Object obj) {
        if (this.f34540e == 0) {
            return true;
        }
        H(obj);
        int i8 = this.f34546k + 1;
        this.f34546k = i8;
        if (i8 > this.f34540e) {
            E();
        }
        this.f34545j = K() + this.f34546k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(C3341C c3341c) {
        long j8 = c3341c.f34561a;
        if (j8 < J()) {
            return j8;
        }
        if (this.f34541f > 0 || j8 > K() || this.f34547l == 0) {
            return -1L;
        }
        return j8;
    }

    private final Object U(C3341C c3341c) {
        Object obj;
        P5.d[] dVarArr = m6.c.f35861a;
        synchronized (this) {
            try {
                long T7 = T(c3341c);
                if (T7 < 0) {
                    obj = AbstractC3340B.f34560a;
                } else {
                    long j8 = c3341c.f34561a;
                    Object M8 = M(T7);
                    c3341c.f34561a = T7 + 1;
                    dVarArr = W(j8);
                    obj = M8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (P5.d dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = L5.s.f6498b;
                dVar.resumeWith(L5.s.b(L5.I.f6474a));
            }
        }
        return obj;
    }

    private final void V(long j8, long j9, long j10, long j11) {
        long min = Math.min(j9, j8);
        for (long K8 = K(); K8 < min; K8++) {
            Object[] objArr = this.f34543h;
            AbstractC3159y.f(objArr);
            AbstractC3340B.g(objArr, K8, null);
        }
        this.f34544i = j8;
        this.f34545j = j9;
        this.f34546k = (int) (j10 - min);
        this.f34547l = (int) (j11 - j10);
    }

    private final Object x(C3341C c3341c, P5.d dVar) {
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        synchronized (this) {
            try {
                if (T(c3341c) < 0) {
                    c3341c.f34562b = c2839p;
                } else {
                    s.a aVar = L5.s.f6498b;
                    c2839p.resumeWith(L5.s.b(L5.I.f6474a));
                }
                L5.I i8 = L5.I.f6474a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == Q5.b.e()) {
            return y8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        Object f8;
        synchronized (this) {
            if (aVar.f34549b < K()) {
                return;
            }
            Object[] objArr = this.f34543h;
            AbstractC3159y.f(objArr);
            f8 = AbstractC3340B.f(objArr, aVar.f34549b);
            if (f8 == aVar) {
                AbstractC3340B.g(objArr, aVar.f34549b, AbstractC3340B.f34560a);
                z();
                L5.I i8 = L5.I.f6474a;
            }
        }
    }

    private final void z() {
        Object f8;
        if (this.f34541f == 0 && this.f34547l <= 1) {
            return;
        }
        Object[] objArr = this.f34543h;
        AbstractC3159y.f(objArr);
        while (this.f34547l > 0) {
            f8 = AbstractC3340B.f(objArr, (K() + P()) - 1);
            if (f8 == AbstractC3340B.f34560a) {
                this.f34547l--;
                AbstractC3340B.g(objArr, K() + P(), null);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C3341C i() {
        return new C3341C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3341C[] j(int i8) {
        return new C3341C[i8];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object L() {
        Object f8;
        Object[] objArr = this.f34543h;
        AbstractC3159y.f(objArr);
        f8 = AbstractC3340B.f(objArr, (this.f34544i + O()) - 1);
        return f8;
    }

    public final P5.d[] W(long j8) {
        int i8;
        long j9;
        long j10;
        long j11;
        boolean z8;
        Object f8;
        Object f9;
        long j12;
        m6.d[] g8;
        if (j8 > this.f34545j) {
            return m6.c.f35861a;
        }
        long K8 = K();
        long j13 = this.f34546k + K8;
        if (this.f34541f == 0 && this.f34547l > 0) {
            j13++;
        }
        if (m6.b.f(this) != 0 && (g8 = m6.b.g(this)) != null) {
            for (m6.d dVar : g8) {
                if (dVar != null) {
                    long j14 = ((C3341C) dVar).f34561a;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.f34545j) {
            return m6.c.f35861a;
        }
        long J8 = J();
        if (l() > 0) {
            i8 = Math.min(this.f34547l, this.f34541f - ((int) (J8 - j13)));
        } else {
            i8 = this.f34547l;
        }
        P5.d[] dVarArr = m6.c.f35861a;
        long j15 = this.f34547l + J8;
        if (i8 > 0) {
            dVarArr = new P5.d[i8];
            Object[] objArr = this.f34543h;
            AbstractC3159y.f(objArr);
            long j16 = J8;
            int i9 = 0;
            while (true) {
                if (J8 < j15) {
                    f9 = AbstractC3340B.f(objArr, J8);
                    j9 = j13;
                    C3486F c3486f = AbstractC3340B.f34560a;
                    if (f9 != c3486f) {
                        AbstractC3159y.g(f9, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) f9;
                        int i10 = i9 + 1;
                        j10 = j15;
                        dVarArr[i9] = aVar.f34551d;
                        AbstractC3340B.g(objArr, J8, c3486f);
                        AbstractC3340B.g(objArr, j16, aVar.f34550c);
                        j12 = 1;
                        j16++;
                        if (i10 >= i8) {
                            break;
                        }
                        i9 = i10;
                    } else {
                        j10 = j15;
                        j12 = 1;
                    }
                    J8 += j12;
                    j13 = j9;
                    j15 = j10;
                } else {
                    j9 = j13;
                    j10 = j15;
                    break;
                }
            }
            J8 = j16;
        } else {
            j9 = j13;
            j10 = j15;
        }
        int i11 = (int) (J8 - K8);
        if (l() == 0) {
            j11 = J8;
        } else {
            j11 = j9;
        }
        long max = Math.max(this.f34544i, J8 - Math.min(this.f34540e, i11));
        if (this.f34541f == 0 && max < j10) {
            Object[] objArr2 = this.f34543h;
            AbstractC3159y.f(objArr2);
            f8 = AbstractC3340B.f(objArr2, max);
            if (AbstractC3159y.d(f8, AbstractC3340B.f34560a)) {
                J8++;
                max++;
            }
        }
        V(max, j11, J8, j10);
        z();
        if (dVarArr.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return I(dVarArr);
        }
        return dVarArr;
    }

    public final long X() {
        long j8 = this.f34544i;
        if (j8 < this.f34545j) {
            this.f34545j = j8;
        }
        return j8;
    }

    @Override // m6.p
    public InterfaceC3358f b(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return AbstractC3340B.e(this, gVar, i8, enumC3132a);
    }

    @Override // l6.u
    public void c() {
        synchronized (this) {
            V(J(), this.f34545j, J(), N());
            L5.I i8 = L5.I.f6474a;
        }
    }

    @Override // l6.z, l6.InterfaceC3358f
    public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        return A(this, interfaceC3359g, dVar);
    }

    @Override // l6.u
    public boolean d(Object obj) {
        int i8;
        boolean z8;
        P5.d[] dVarArr = m6.c.f35861a;
        synchronized (this) {
            if (R(obj)) {
                dVarArr = I(dVarArr);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (P5.d dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = L5.s.f6498b;
                dVar.resumeWith(L5.s.b(L5.I.f6474a));
            }
        }
        return z8;
    }

    @Override // l6.u, l6.InterfaceC3359g
    public Object emit(Object obj, P5.d dVar) {
        return F(this, obj, dVar);
    }
}
