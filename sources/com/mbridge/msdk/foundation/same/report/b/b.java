package com.mbridge.msdk.foundation.same.report.b;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f19796a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f19797b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f19798c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.b.a f19799d;

    /* renamed from: e, reason: collision with root package name */
    private int f19800e;

    /* loaded from: classes4.dex */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private long f19802b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f19803c;

        /* renamed from: d, reason: collision with root package name */
        private long f19804d;

        private a() {
            this.f19802b = SystemClock.uptimeMillis();
        }

        final void b() {
            this.f19803c = false;
            this.f19804d = SystemClock.uptimeMillis();
            b.this.f19797b.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                this.f19803c = true;
                this.f19802b = SystemClock.uptimeMillis();
            }
        }

        final boolean a() {
            return !this.f19803c || this.f19802b - this.f19804d >= ((long) b.this.f19800e);
        }
    }

    private b() {
        super("AnrMonitor-Thread");
        this.f19797b = new Handler(Looper.getMainLooper());
        this.f19800e = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.f19798c == null || this.f19798c.f19803c)) {
                synchronized (this) {
                    try {
                        if (this.f19798c == null) {
                            this.f19798c = new a();
                        }
                        this.f19798c.b();
                        long j8 = this.f19800e;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (j8 > 0) {
                            try {
                                wait(j8);
                            } catch (InterruptedException e8) {
                                Log.w("AnrMonitor", e8.toString());
                            }
                            j8 = this.f19800e - (SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        if (!this.f19798c.a()) {
                            com.mbridge.msdk.foundation.same.report.b.a aVar = this.f19799d;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f19799d != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f19799d.a(c.a(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                try {
                    Thread.sleep(this.f19800e);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static b a() {
        if (f19796a == null) {
            synchronized (b.class) {
                try {
                    if (f19796a == null) {
                        f19796a = new b();
                    }
                } finally {
                }
            }
        }
        return f19796a;
    }

    public final b a(int i8, com.mbridge.msdk.foundation.same.report.b.a aVar) {
        this.f19800e = i8;
        this.f19799d = aVar;
        return this;
    }
}
