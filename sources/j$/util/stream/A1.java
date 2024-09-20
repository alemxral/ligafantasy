package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class A1 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    protected final L0 f32251a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f32252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32253c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f32254d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, K0 k02, int i8) {
        this(a12, k02, i8, (byte) 0);
        this.f32253c = 0;
        this.f32254d = a12.f32254d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, L0 l02, int i8) {
        this(a12, l02, i8, (byte) 0);
        this.f32253c = 1;
        this.f32254d = (Object[]) a12.f32254d;
    }

    A1(A1 a12, L0 l02, int i8, byte b8) {
        super(a12);
        this.f32251a = l02;
        this.f32252b = i8;
    }

    public A1(L0 l02, Object obj, int i8) {
        this.f32253c = i8;
        this.f32251a = l02;
        this.f32252b = 0;
        this.f32254d = obj;
    }

    final void a() {
        switch (this.f32253c) {
            case 0:
                ((K0) this.f32251a).q(this.f32252b, this.f32254d);
                return;
            default:
                this.f32251a.h((Object[]) this.f32254d, this.f32252b);
                return;
        }
    }

    final A1 b(int i8, int i9) {
        switch (this.f32253c) {
            case 0:
                return new A1(this, ((K0) this.f32251a).b(i8), i9);
            default:
                return new A1(this, this.f32251a.b(i8), i9);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        A1 a12 = this;
        while (a12.f32251a.p() != 0) {
            a12.setPendingCount(a12.f32251a.p() - 1);
            int i8 = 0;
            int i9 = 0;
            while (i8 < a12.f32251a.p() - 1) {
                A1 b8 = a12.b(i8, a12.f32252b + i9);
                i9 = (int) (i9 + b8.f32251a.count());
                b8.fork();
                i8++;
            }
            a12 = a12.b(i8, a12.f32252b + i9);
        }
        a12.a();
        a12.propagateCompletion();
    }
}
