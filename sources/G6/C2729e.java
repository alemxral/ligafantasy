package g6;

import f6.InterfaceC2680g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2729e implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f31285a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31286b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31287c;

    /* renamed from: d, reason: collision with root package name */
    private final X5.n f31288d;

    /* renamed from: g6.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private int f31289a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f31290b;

        /* renamed from: c, reason: collision with root package name */
        private int f31291c;

        /* renamed from: d, reason: collision with root package name */
        private d6.i f31292d;

        /* renamed from: e, reason: collision with root package name */
        private int f31293e;

        a() {
            int k8 = d6.m.k(C2729e.this.f31286b, 0, C2729e.this.f31285a.length());
            this.f31290b = k8;
            this.f31291c = k8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f31294f.f31287c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f31291c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f31289a = r1
                r0 = 0
                r6.f31292d = r0
                goto L9e
            Lc:
                g6.e r0 = g6.C2729e.this
                int r0 = g6.C2729e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f31293e
                int r0 = r0 + r3
                r6.f31293e = r0
                g6.e r4 = g6.C2729e.this
                int r4 = g6.C2729e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f31291c
                g6.e r4 = g6.C2729e.this
                java.lang.CharSequence r4 = g6.C2729e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                d6.i r0 = new d6.i
                int r1 = r6.f31290b
                g6.e r4 = g6.C2729e.this
                java.lang.CharSequence r4 = g6.C2729e.c(r4)
                int r4 = g6.n.M(r4)
                r0.<init>(r1, r4)
                r6.f31292d = r0
                r6.f31291c = r2
                goto L9c
            L47:
                g6.e r0 = g6.C2729e.this
                X5.n r0 = g6.C2729e.b(r0)
                g6.e r4 = g6.C2729e.this
                java.lang.CharSequence r4 = g6.C2729e.c(r4)
                int r5 = r6.f31291c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                L5.r r0 = (L5.r) r0
                if (r0 != 0) goto L77
                d6.i r0 = new d6.i
                int r1 = r6.f31290b
                g6.e r4 = g6.C2729e.this
                java.lang.CharSequence r4 = g6.C2729e.c(r4)
                int r4 = g6.n.M(r4)
                r0.<init>(r1, r4)
                r6.f31292d = r0
                r6.f31291c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f31290b
                d6.i r4 = d6.m.s(r4, r2)
                r6.f31292d = r4
                int r2 = r2 + r0
                r6.f31290b = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f31291c = r2
            L9c:
                r6.f31289a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.C2729e.a.b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d6.i next() {
            if (this.f31289a == -1) {
                b();
            }
            if (this.f31289a != 0) {
                d6.i iVar = this.f31292d;
                AbstractC3159y.g(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f31292d = null;
                this.f31289a = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31289a == -1) {
                b();
            }
            if (this.f31289a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2729e(CharSequence input, int i8, int i9, X5.n getNextMatch) {
        AbstractC3159y.i(input, "input");
        AbstractC3159y.i(getNextMatch, "getNextMatch");
        this.f31285a = input;
        this.f31286b = i8;
        this.f31287c = i9;
        this.f31288d = getNextMatch;
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
