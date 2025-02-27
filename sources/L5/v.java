package L5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class v implements InterfaceC1227k, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f6506a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f6507b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6508c;

    public v(Function0 initializer, Object obj) {
        AbstractC3159y.i(initializer, "initializer");
        this.f6506a = initializer;
        this.f6507b = E.f6468a;
        this.f6508c = obj == null ? this : obj;
    }

    @Override // L5.InterfaceC1227k
    public Object getValue() {
        Object obj;
        Object obj2 = this.f6507b;
        E e8 = E.f6468a;
        if (obj2 != e8) {
            return obj2;
        }
        synchronized (this.f6508c) {
            obj = this.f6507b;
            if (obj == e8) {
                Function0 function0 = this.f6506a;
                AbstractC3159y.f(function0);
                obj = function0.invoke();
                this.f6507b = obj;
                this.f6506a = null;
            }
        }
        return obj;
    }

    @Override // L5.InterfaceC1227k
    public boolean isInitialized() {
        if (this.f6507b != E.f6468a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ v(Function0 function0, Object obj, int i8, AbstractC3151p abstractC3151p) {
        this(function0, (i8 & 2) != 0 ? null : obj);
    }
}
