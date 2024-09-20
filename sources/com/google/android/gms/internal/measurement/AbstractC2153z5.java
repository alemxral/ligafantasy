package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2153z5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f15962a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f15963b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15964c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2145y5 f15965d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f15966e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f15967f;

    /* renamed from: g, reason: collision with root package name */
    static final long f15968g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f15969h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    static {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2153z5.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i8 = J3.f15347a;
        try {
            Class cls2 = f15963b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(Object obj, long j8) {
        return f15965d.g(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C() {
        return f15967f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D() {
        return f15966e;
    }

    private static int E(Class cls) {
        if (f15967f) {
            return f15965d.f15953a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f15967f) {
            return f15965d.f15953a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i8 = J3.f15347a;
        Field c8 = c(Buffer.class, "effectiveDirectAddress");
        if (c8 == null) {
            Field c9 = c(Buffer.class, "address");
            if (c9 != null && c9.getType() == Long.TYPE) {
                return c9;
            }
            return null;
        }
        return c8;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j8, byte b8) {
        AbstractC2145y5 abstractC2145y5 = f15965d;
        long j9 = (-4) & j8;
        int i8 = abstractC2145y5.f15953a.getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        abstractC2145y5.f15953a.putInt(obj, j9, ((255 & b8) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j8, byte b8) {
        AbstractC2145y5 abstractC2145y5 = f15965d;
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        abstractC2145y5.f15953a.putInt(obj, j9, ((255 & b8) << i8) | (abstractC2145y5.f15953a.getInt(obj, j9) & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double f(Object obj, long j8) {
        return f15965d.a(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(Object obj, long j8) {
        return f15965d.b(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(Object obj, long j8) {
        return f15965d.f15953a.getInt(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long i(Object obj, long j8) {
        return f15965d.f15953a.getLong(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object j(Class cls) {
        try {
            return f15962a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object k(Object obj, long j8) {
        return f15965d.f15953a.getObject(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2121v5());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(AbstractC2153z5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(Object obj, long j8, boolean z8) {
        f15965d.c(obj, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(byte[] bArr, long j8, byte b8) {
        f15965d.d(bArr, f15968g + j8, b8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(Object obj, long j8, double d8) {
        f15965d.e(obj, j8, d8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(Object obj, long j8, float f8) {
        f15965d.f(obj, j8, f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(Object obj, long j8, int i8) {
        f15965d.f15953a.putInt(obj, j8, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Object obj, long j8, long j9) {
        f15965d.f15953a.putLong(obj, j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(Object obj, long j8, Object obj2) {
        f15965d.f15953a.putObject(obj, j8, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j8) {
        if (((byte) ((f15965d.f15953a.getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean z(Object obj, long j8) {
        if (((byte) ((f15965d.f15953a.getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
