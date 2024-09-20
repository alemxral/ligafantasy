package com.mbridge.msdk.e.a;

import android.util.Log;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    public static String f18755a = "TrackManager_Volley";

    /* renamed from: b, reason: collision with root package name */
    private static final String f18756b = "com.mbridge.msdk.e.a.aa";

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0394a> f18757a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f18758b;

        /* renamed from: com.mbridge.msdk.e.a.aa$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static class C0394a {

            /* renamed from: a, reason: collision with root package name */
            public final String f18759a;

            /* renamed from: b, reason: collision with root package name */
            public final long f18760b;

            /* renamed from: c, reason: collision with root package name */
            public final long f18761c;
        }

        protected final void finalize() throws Throwable {
            long j8;
            if (!this.f18758b) {
                this.f18758b = true;
                if (this.f18757a.size() == 0) {
                    j8 = 0;
                } else {
                    long j9 = this.f18757a.get(0).f18761c;
                    List<C0394a> list = this.f18757a;
                    j8 = list.get(list.size() - 1).f18761c - j9;
                }
                if (j8 > 0) {
                    long j10 = this.f18757a.get(0).f18761c;
                    aa.b("(%-4d ms) %s", Long.valueOf(j8), "Request on the loose");
                    for (C0394a c0394a : this.f18757a) {
                        long j11 = c0394a.f18761c;
                        aa.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0394a.f18760b), c0394a.f18759a);
                        j10 = j11;
                    }
                }
                aa.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
    }

    public static void b(String str, Object... objArr) {
        Log.d(f18755a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f18755a, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i8 = 2;
        while (true) {
            if (i8 < stackTrace.length) {
                if (!stackTrace[i8].getClassName().equals(f18756b)) {
                    String className = stackTrace[i8].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i8].getMethodName();
                    break;
                }
                i8++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f18755a, d(str, objArr), th);
    }
}
