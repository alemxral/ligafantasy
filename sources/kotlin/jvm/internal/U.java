package kotlin.jvm.internal;

import e6.InterfaceC2643c;
import e6.InterfaceC2644d;
import e6.InterfaceC2645e;
import e6.InterfaceC2647g;
import e6.InterfaceC2648h;

/* loaded from: classes5.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final V f33748a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2643c[] f33749b;

    static {
        V v8 = null;
        try {
            v8 = (V) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (v8 == null) {
            v8 = new V();
        }
        f33748a = v8;
        f33749b = new InterfaceC2643c[0];
    }

    public static InterfaceC2645e a(AbstractC3155u abstractC3155u) {
        return f33748a.a(abstractC3155u);
    }

    public static InterfaceC2643c b(Class cls) {
        return f33748a.b(cls);
    }

    public static InterfaceC2644d c(Class cls) {
        return f33748a.c(cls, "");
    }

    public static InterfaceC2647g d(B b8) {
        return f33748a.d(b8);
    }

    public static InterfaceC2648h e(D d8) {
        return f33748a.e(d8);
    }

    public static e6.j f(H h8) {
        return f33748a.f(h8);
    }

    public static e6.k g(J j8) {
        return f33748a.g(j8);
    }

    public static e6.l h(L l8) {
        return f33748a.h(l8);
    }

    public static String i(InterfaceC3154t interfaceC3154t) {
        return f33748a.i(interfaceC3154t);
    }

    public static String j(AbstractC3160z abstractC3160z) {
        return f33748a.j(abstractC3160z);
    }
}
