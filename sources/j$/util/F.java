package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f32084a;

    public /* synthetic */ F(Consumer consumer) {
        this.f32084a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f32084a.accept(Double.valueOf(d8));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
