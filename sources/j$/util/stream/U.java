package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class U extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2897b f32424a;

    /* renamed from: b, reason: collision with root package name */
    private Spliterator f32425b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32426c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f32427d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2975q2 f32428e;

    /* renamed from: f, reason: collision with root package name */
    private final U f32429f;

    /* renamed from: g, reason: collision with root package name */
    private L0 f32430g;

    U(U u8, Spliterator spliterator, U u9) {
        super(u8);
        this.f32424a = u8.f32424a;
        this.f32425b = spliterator;
        this.f32426c = u8.f32426c;
        this.f32427d = u8.f32427d;
        this.f32428e = u8.f32428e;
        this.f32429f = u9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public U(AbstractC2897b abstractC2897b, Spliterator spliterator, InterfaceC2975q2 interfaceC2975q2) {
        super(null);
        this.f32424a = abstractC2897b;
        this.f32425b = spliterator;
        this.f32426c = AbstractC2912e.g(spliterator.estimateSize());
        this.f32427d = new ConcurrentHashMap(Math.max(16, AbstractC2912e.b() << 1));
        this.f32428e = interfaceC2975q2;
        this.f32429f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f32425b;
        long j8 = this.f32426c;
        boolean z8 = false;
        U u8 = this;
        while (spliterator.estimateSize() > j8 && (trySplit = spliterator.trySplit()) != null) {
            U u9 = new U(u8, trySplit, u8.f32429f);
            U u10 = new U(u8, spliterator, u9);
            u8.addToPendingCount(1);
            u10.addToPendingCount(1);
            u8.f32427d.put(u9, u10);
            if (u8.f32429f != null) {
                u9.addToPendingCount(1);
                if (u8.f32427d.replace(u8.f32429f, u8, u9)) {
                    u8.addToPendingCount(-1);
                } else {
                    u9.addToPendingCount(-1);
                }
            }
            if (z8) {
                spliterator = trySplit;
                u8 = u9;
                u9 = u10;
            } else {
                u8 = u10;
            }
            z8 = !z8;
            u9.fork();
        }
        if (u8.getPendingCount() > 0) {
            C2962o c2962o = new C2962o(14);
            AbstractC2897b abstractC2897b = u8.f32424a;
            D0 J8 = abstractC2897b.J(abstractC2897b.C(spliterator), c2962o);
            u8.f32424a.R(spliterator, J8);
            u8.f32430g = J8.a();
            u8.f32425b = null;
        }
        u8.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l02 = this.f32430g;
        if (l02 != null) {
            l02.forEach(this.f32428e);
            this.f32430g = null;
        } else {
            Spliterator spliterator = this.f32425b;
            if (spliterator != null) {
                this.f32424a.R(spliterator, this.f32428e);
                this.f32425b = null;
            }
        }
        U u8 = (U) this.f32427d.remove(this);
        if (u8 != null) {
            u8.tryComplete();
        }
    }
}
