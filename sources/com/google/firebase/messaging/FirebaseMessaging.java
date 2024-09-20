package com.google.firebase.messaging;

import R.AbstractC1319p;
import Y0.a;
import a1.InterfaceC1554e;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.S;
import com.google.firebase.messaging.X;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r0.C3679j;
import r0.InterfaceC3676g;
import r0.InterfaceC3678i;

/* loaded from: classes3.dex */
public class FirebaseMessaging {

    /* renamed from: n, reason: collision with root package name */
    private static final long f17296n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o, reason: collision with root package name */
    private static X f17297o;

    /* renamed from: p, reason: collision with root package name */
    static s.g f17298p;

    /* renamed from: q, reason: collision with root package name */
    static ScheduledExecutorService f17299q;

    /* renamed from: a, reason: collision with root package name */
    private final y0.e f17300a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1554e f17301b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f17302c;

    /* renamed from: d, reason: collision with root package name */
    private final B f17303d;

    /* renamed from: e, reason: collision with root package name */
    private final S f17304e;

    /* renamed from: f, reason: collision with root package name */
    private final a f17305f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f17306g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f17307h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f17308i;

    /* renamed from: j, reason: collision with root package name */
    private final Task f17309j;

    /* renamed from: k, reason: collision with root package name */
    private final G f17310k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17311l;

    /* renamed from: m, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f17312m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private final W0.d f17313a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f17314b;

        /* renamed from: c, reason: collision with root package name */
        private W0.b f17315c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f17316d;

        a(W0.d dVar) {
            this.f17313a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(W0.a aVar) {
            if (c()) {
                FirebaseMessaging.this.C();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context k8 = FirebaseMessaging.this.f17300a.k();
            SharedPreferences sharedPreferences = k8.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = k8.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(k8.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f17314b) {
                    return;
                }
                Boolean e8 = e();
                this.f17316d = e8;
                if (e8 == null) {
                    W0.b bVar = new W0.b() { // from class: com.google.firebase.messaging.y
                        @Override // W0.b
                        public final void a(W0.a aVar) {
                            FirebaseMessaging.a.this.d(aVar);
                        }
                    };
                    this.f17315c = bVar;
                    this.f17313a.a(y0.b.class, bVar);
                }
                this.f17314b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            boolean t8;
            try {
                b();
                Boolean bool = this.f17316d;
                if (bool != null) {
                    t8 = bool.booleanValue();
                } else {
                    t8 = FirebaseMessaging.this.f17300a.t();
                }
            } catch (Throwable th) {
                throw th;
            }
            return t8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(y0.e eVar, Y0.a aVar, Z0.b bVar, Z0.b bVar2, InterfaceC1554e interfaceC1554e, s.g gVar, W0.d dVar) {
        this(eVar, aVar, bVar, bVar2, interfaceC1554e, gVar, dVar, new G(eVar.k()));
    }

    private synchronized void B() {
        if (!this.f17311l) {
            D(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (E(p())) {
            B();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull y0.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.j(FirebaseMessaging.class);
            AbstractC1319p.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(y0.e.l());
        }
        return firebaseMessaging;
    }

    private static synchronized X m(Context context) {
        X x8;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f17297o == null) {
                    f17297o = new X(context);
                }
                x8 = f17297o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x8;
    }

    private String n() {
        if ("[DEFAULT]".equals(this.f17300a.m())) {
            return "";
        }
        return this.f17300a.o();
    }

    public static s.g q() {
        return f17298p;
    }

    private void r(String str) {
        if ("[DEFAULT]".equals(this.f17300a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f17300a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2389n(this.f17302c).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task u(final String str, final X.a aVar) {
        return this.f17303d.e().o(this.f17308i, new InterfaceC3678i() { // from class: com.google.firebase.messaging.x
            @Override // r0.InterfaceC3678i
            public final Task a(Object obj) {
                Task v8;
                v8 = FirebaseMessaging.this.v(str, aVar, (String) obj);
                return v8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task v(String str, X.a aVar, String str2) {
        m(this.f17302c).f(n(), str, str2, this.f17310k.a());
        if (aVar == null || !str2.equals(aVar.f17377a)) {
            r(str2);
        }
        return r0.l.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(C3679j c3679j) {
        try {
            c3679j.c(i());
        } catch (Exception e8) {
            c3679j.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        if (s()) {
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(c0 c0Var) {
        if (s()) {
            c0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        M.c(this.f17302c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void A(boolean z8) {
        this.f17311l = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void D(long j8) {
        j(new Y(this, Math.min(Math.max(30L, 2 * j8), f17296n)), j8);
        this.f17311l = true;
    }

    boolean E(X.a aVar) {
        if (aVar != null && !aVar.b(this.f17310k.a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        final X.a p8 = p();
        if (!E(p8)) {
            return p8.f17377a;
        }
        final String c8 = G.c(this.f17300a);
        try {
            return (String) r0.l.a(this.f17304e.b(c8, new S.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.S.a
                public final Task start() {
                    Task u8;
                    u8 = FirebaseMessaging.this.u(c8, p8);
                    return u8;
                }
            }));
        } catch (InterruptedException | ExecutionException e8) {
            throw new IOException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Runnable runnable, long j8) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f17299q == null) {
                    f17299q = new ScheduledThreadPoolExecutor(1, new X.a("TAG"));
                }
                f17299q.schedule(runnable, j8, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context k() {
        return this.f17302c;
    }

    public Task o() {
        final C3679j c3679j = new C3679j();
        this.f17306g.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.w(c3679j);
            }
        });
        return c3679j.a();
    }

    X.a p() {
        return m(this.f17302c).d(n(), G.c(this.f17300a));
    }

    public boolean s() {
        return this.f17305f.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return this.f17310k.g();
    }

    FirebaseMessaging(y0.e eVar, Y0.a aVar, Z0.b bVar, Z0.b bVar2, InterfaceC1554e interfaceC1554e, s.g gVar, W0.d dVar, G g8) {
        this(eVar, aVar, interfaceC1554e, gVar, dVar, g8, new B(eVar, g8, bVar, bVar2, interfaceC1554e), AbstractC2390o.f(), AbstractC2390o.c(), AbstractC2390o.b());
    }

    FirebaseMessaging(y0.e eVar, Y0.a aVar, InterfaceC1554e interfaceC1554e, s.g gVar, W0.d dVar, G g8, B b8, Executor executor, Executor executor2, Executor executor3) {
        this.f17311l = false;
        f17298p = gVar;
        this.f17300a = eVar;
        this.f17301b = interfaceC1554e;
        this.f17305f = new a(dVar);
        Context k8 = eVar.k();
        this.f17302c = k8;
        C2392q c2392q = new C2392q();
        this.f17312m = c2392q;
        this.f17310k = g8;
        this.f17307h = executor;
        this.f17303d = b8;
        this.f17304e = new S(executor);
        this.f17306g = executor2;
        this.f17308i = executor3;
        Context k9 = eVar.k();
        if (k9 instanceof Application) {
            ((Application) k9).registerActivityLifecycleCallbacks(c2392q);
        } else {
            Log.w("FirebaseMessaging", "Context " + k9 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0242a() { // from class: com.google.firebase.messaging.r
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.x();
            }
        });
        Task e8 = c0.e(this, g8, b8, k8, AbstractC2390o.g());
        this.f17309j = e8;
        e8.e(executor2, new InterfaceC3676g() { // from class: com.google.firebase.messaging.t
            @Override // r0.InterfaceC3676g
            public final void b(Object obj) {
                FirebaseMessaging.this.y((c0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.z();
            }
        });
    }
}
