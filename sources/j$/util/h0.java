package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class h0 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    boolean f32207a = false;

    /* renamed from: b, reason: collision with root package name */
    Object f32208b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator f32209c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Spliterator spliterator) {
        this.f32209c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32207a = true;
        this.f32208b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f32207a) {
            this.f32209c.tryAdvance(this);
        }
        return this.f32207a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f32207a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32207a = false;
        return this.f32208b;
    }
}
