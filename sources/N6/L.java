package n6;

import P5.g;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class L implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f36235a;

    public L(ThreadLocal threadLocal) {
        this.f36235a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L) && AbstractC3159y.d(this.f36235a, ((L) obj).f36235a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f36235a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f36235a + ')';
    }
}
