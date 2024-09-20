package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f17761a = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f17762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f17763c;

        a(Method method, Object obj) {
            this.f17762b = method;
            this.f17763c = obj;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f17762b.invoke(this.f17763c, cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f17764b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17765c;

        b(Method method, int i8) {
            this.f17764b = method;
            this.f17765c = i8;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f17764b.invoke(null, cls, Integer.valueOf(this.f17765c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f17766b;

        c(Method method) {
            this.f17766b = method;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f17766b.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends m {
        d() {
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String a8 = com.google.gson.internal.c.a(cls);
        if (a8 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a8);
    }

    private static m c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new c(declaredMethod3);
        }
    }

    public abstract Object d(Class cls);
}
