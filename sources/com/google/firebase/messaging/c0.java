package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r0.C3679j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f17421i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f17422a;

    /* renamed from: b, reason: collision with root package name */
    private final G f17423b;

    /* renamed from: c, reason: collision with root package name */
    private final B f17424c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f17425d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f17427f;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f17429h;

    /* renamed from: e, reason: collision with root package name */
    private final Map f17426e = new ArrayMap();

    /* renamed from: g, reason: collision with root package name */
    private boolean f17428g = false;

    private c0(FirebaseMessaging firebaseMessaging, G g8, a0 a0Var, B b8, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f17425d = firebaseMessaging;
        this.f17423b = g8;
        this.f17429h = a0Var;
        this.f17424c = b8;
        this.f17422a = context;
        this.f17427f = scheduledExecutorService;
    }

    private static void b(Task task) {
        try {
            r0.l.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            e = e8;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e9);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void c(String str) {
        b(this.f17424c.k(this.f17425d.i(), str));
    }

    private void d(String str) {
        b(this.f17424c.l(this.f17425d.i(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Task e(final FirebaseMessaging firebaseMessaging, final G g8, final B b8, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return r0.l.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                c0 i8;
                i8 = c0.i(context, scheduledExecutorService, firebaseMessaging, g8, b8);
                return i8;
            }
        });
    }

    static boolean g() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, G g8, B b8) {
        return new c0(firebaseMessaging, g8, a0.a(context, scheduledExecutorService), b8, context, scheduledExecutorService);
    }

    private void j(Z z8) {
        synchronized (this.f17426e) {
            try {
                String e8 = z8.e();
                if (!this.f17426e.containsKey(e8)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f17426e.get(e8);
                C3679j c3679j = (C3679j) arrayDeque.poll();
                if (c3679j != null) {
                    c3679j.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f17426e.remove(e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        if (!h()) {
            q(0L);
        }
    }

    boolean f() {
        if (this.f17429h.b() != null) {
            return true;
        }
        return false;
    }

    synchronized boolean h() {
        return this.f17428g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x0003, B:12:0x0033, B:14:0x0039, B:17:0x0053, B:19:0x0060, B:20:0x007c, B:22:0x0089, B:23:0x0015, B:26:0x0022), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean k(com.google.firebase.messaging.Z r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = 1
            goto L2d
        L1f:
            r7 = move-exception
            goto La5
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = 0
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L7c
            if (r2 == r5) goto L53
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L53:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.d(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto La4
        L7c:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.c(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = g()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto La4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
        La4:
            return r5
        La5:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lcb
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lbe
            goto Lcb
        Lbe:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lca
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Lca:
            throw r7
        Lcb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c0.k(com.google.firebase.messaging.Z):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j8) {
        this.f17427f.schedule(runnable, j8, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void m(boolean z8) {
        this.f17428g = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (f()) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.a0 r0 = r2.f17429h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.Z r0 = r0.b()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.a0 r1 = r2.f17429h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c0.p():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(long j8) {
        l(new d0(this, this.f17422a, this.f17423b, Math.min(Math.max(30L, 2 * j8), f17421i)), j8);
        m(true);
    }
}
