package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class W implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2975q2 f32441a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f32441a.accept(i8);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
