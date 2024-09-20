package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class w0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f39612a;

    /* renamed from: b, reason: collision with root package name */
    private int f39613b;

    public /* synthetic */ w0(int[] iArr, AbstractC3151p abstractC3151p) {
        this(iArr);
    }

    @Override // x6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return L5.B.a(f());
    }

    @Override // x6.h0
    public void b(int i8) {
        if (L5.B.s(this.f39612a) < i8) {
            int[] iArr = this.f39612a;
            int[] copyOf = Arrays.copyOf(iArr, d6.m.d(i8, L5.B.s(iArr) * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39612a = L5.B.h(copyOf);
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39613b;
    }

    public final void e(int i8) {
        h0.c(this, 0, 1, null);
        int[] iArr = this.f39612a;
        int d8 = d();
        this.f39613b = d8 + 1;
        L5.B.w(iArr, d8, i8);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f39612a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return L5.B.h(copyOf);
    }

    private w0(int[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39612a = bufferWithData;
        this.f39613b = L5.B.s(bufferWithData);
        b(10);
    }
}
