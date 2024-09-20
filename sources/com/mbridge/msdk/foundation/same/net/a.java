package com.mbridge.msdk.foundation.same.net;

import android.net.TrafficStats;
import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f19563a;

    /* renamed from: b, reason: collision with root package name */
    private static long f19564b;

    /* renamed from: c, reason: collision with root package name */
    private static long f19565c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0402a {

        /* renamed from: a, reason: collision with root package name */
        private static a f19566a = new a();
    }

    public static a a() {
        return C0402a.f19566a;
    }

    public final synchronized void b() {
        try {
            if (f19565c != 0 && f19564b != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - f19565c;
                if (elapsedRealtime != 0) {
                    try {
                        if (TrafficStats.getTotalRxBytes() != -1) {
                            long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f19564b) * 1000) / elapsedRealtime;
                            if (totalRxBytes == 0) {
                                f19563a = 1L;
                            } else {
                                f19563a = totalRxBytes;
                            }
                        } else {
                            f19563a = 0L;
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        f19564b = 0L;
        f19565c = 0L;
    }

    public final long d() {
        return f19563a;
    }

    public final synchronized void e() {
        if (f19565c == 0) {
            f19565c = SystemClock.elapsedRealtime();
            f19564b = TrafficStats.getTotalRxBytes();
        }
    }

    private a() {
    }
}
