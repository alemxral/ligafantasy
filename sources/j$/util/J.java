package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f32087a;

    public /* synthetic */ J(Consumer consumer) {
        this.f32087a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f32087a.accept(Integer.valueOf(i8));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
