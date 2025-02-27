package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1965c5 implements InterfaceC2026j5 {

    /* renamed from: a, reason: collision with root package name */
    private final Y4 f15661a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2074p5 f15662b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15663c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2033k4 f15664d;

    private C1965c5(AbstractC2074p5 abstractC2074p5, AbstractC2033k4 abstractC2033k4, Y4 y42) {
        this.f15662b = abstractC2074p5;
        this.f15663c = abstractC2033k4.c(y42);
        this.f15664d = abstractC2033k4;
        this.f15661a = y42;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1965c5 j(AbstractC2074p5 abstractC2074p5, AbstractC2033k4 abstractC2033k4, Y4 y42) {
        return new C1965c5(abstractC2074p5, abstractC2033k4, y42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final void a(Object obj) {
        this.f15662b.g(obj);
        this.f15664d.b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final void b(Object obj, G5 g52) {
        this.f15664d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final boolean c(Object obj) {
        this.f15664d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final int d(Object obj) {
        int hashCode = this.f15662b.d(obj).hashCode();
        if (!this.f15663c) {
            return hashCode;
        }
        this.f15664d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final Object e() {
        Y4 y42 = this.f15661a;
        if (y42 instanceof AbstractC2112u4) {
            return ((AbstractC2112u4) y42).l();
        }
        return y42.c().u();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final void f(Object obj, byte[] bArr, int i8, int i9, K3 k32) {
        AbstractC2112u4 abstractC2112u4 = (AbstractC2112u4) obj;
        if (abstractC2112u4.zzc == C2082q5.c()) {
            abstractC2112u4.zzc = C2082q5.f();
        }
        android.support.v4.media.a.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final int g(Object obj) {
        AbstractC2074p5 abstractC2074p5 = this.f15662b;
        int b8 = abstractC2074p5.b(abstractC2074p5.d(obj));
        if (!this.f15663c) {
            return b8;
        }
        this.f15664d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final void h(Object obj, Object obj2) {
        AbstractC2042l5.b(this.f15662b, obj, obj2);
        if (!this.f15663c) {
            return;
        }
        this.f15664d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2026j5
    public final boolean i(Object obj, Object obj2) {
        if (!this.f15662b.d(obj).equals(this.f15662b.d(obj2))) {
            return false;
        }
        if (!this.f15663c) {
            return true;
        }
        this.f15664d.a(obj);
        this.f15664d.a(obj2);
        throw null;
    }
}
