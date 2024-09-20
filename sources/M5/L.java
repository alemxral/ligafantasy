package M5;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class L implements Iterable, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f7003a;

    public L(Function0 iteratorFactory) {
        AbstractC3159y.i(iteratorFactory, "iteratorFactory");
        this.f7003a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new M((Iterator) this.f7003a.invoke());
    }
}
