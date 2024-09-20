package H0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: H0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1182p {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3357a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.e f3358b;

    /* renamed from: c, reason: collision with root package name */
    private final C1187v f3359c;

    /* renamed from: f, reason: collision with root package name */
    private C1183q f3362f;

    /* renamed from: g, reason: collision with root package name */
    private C1183q f3363g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3364h;

    /* renamed from: i, reason: collision with root package name */
    private C1180n f3365i;

    /* renamed from: j, reason: collision with root package name */
    private final z f3366j;

    /* renamed from: k, reason: collision with root package name */
    private final M0.f f3367k;

    /* renamed from: l, reason: collision with root package name */
    public final G0.b f3368l;

    /* renamed from: m, reason: collision with root package name */
    private final F0.a f3369m;

    /* renamed from: n, reason: collision with root package name */
    private final ExecutorService f3370n;

    /* renamed from: o, reason: collision with root package name */
    private final C1178l f3371o;

    /* renamed from: p, reason: collision with root package name */
    private final C1177k f3372p;

    /* renamed from: q, reason: collision with root package name */
    private final E0.a f3373q;

    /* renamed from: e, reason: collision with root package name */
    private final long f3361e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final E f3360d = new E();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$a */
    /* loaded from: classes3.dex */
    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O0.i f3374a;

        a(O0.i iVar) {
            this.f3374a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            return C1182p.this.f(this.f3374a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O0.i f3376a;

        b(O0.i iVar) {
            this.f3376a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1182p.this.f(this.f3376a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$c */
    /* loaded from: classes3.dex */
    public class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean d8 = C1182p.this.f3362f.d();
                if (!d8) {
                    E0.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d8);
            } catch (Exception e8) {
                E0.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e8);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$d */
    /* loaded from: classes3.dex */
    public class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C1182p.this.f3365i.s());
        }
    }

    public C1182p(y0.e eVar, z zVar, E0.a aVar, C1187v c1187v, G0.b bVar, F0.a aVar2, M0.f fVar, ExecutorService executorService, C1177k c1177k) {
        this.f3358b = eVar;
        this.f3359c = c1187v;
        this.f3357a = eVar.k();
        this.f3366j = zVar;
        this.f3373q = aVar;
        this.f3368l = bVar;
        this.f3369m = aVar2;
        this.f3370n = executorService;
        this.f3367k = fVar;
        this.f3371o = new C1178l(executorService);
        this.f3372p = c1177k;
    }

    private void d() {
        try {
            this.f3364h = Boolean.TRUE.equals((Boolean) W.f(this.f3371o.g(new d())));
        } catch (Exception unused) {
            this.f3364h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task f(O0.i iVar) {
        m();
        try {
            this.f3368l.a(new G0.a() { // from class: H0.o
                @Override // G0.a
                public final void a(String str) {
                    C1182p.this.k(str);
                }
            });
            this.f3365i.S();
            if (!iVar.b().f7682b.f7689a) {
                E0.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return r0.l.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f3365i.z(iVar)) {
                E0.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f3365i.U(iVar.a());
        } catch (Exception e8) {
            E0.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e8);
            return r0.l.d(e8);
        } finally {
            l();
        }
    }

    private void h(O0.i iVar) {
        Future<?> submit = this.f3370n.submit(new b(iVar));
        E0.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            E0.f.f().e("Crashlytics was interrupted during initialization.", e8);
        } catch (ExecutionException e9) {
            E0.f.f().e("Crashlytics encountered a problem during initialization.", e9);
        } catch (TimeoutException e10) {
            E0.f.f().e("Crashlytics timed out during initialization.", e10);
        }
    }

    public static String i() {
        return "18.4.1";
    }

    static boolean j(String str, boolean z8) {
        if (!z8) {
            E0.f.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    boolean e() {
        return this.f3362f.c();
    }

    public Task g(O0.i iVar) {
        return W.h(this.f3370n, new a(iVar));
    }

    public void k(String str) {
        this.f3365i.X(System.currentTimeMillis() - this.f3361e, str);
    }

    void l() {
        this.f3371o.g(new c());
    }

    void m() {
        this.f3371o.b();
        this.f3362f.a();
        E0.f.f().i("Initialization marker file was created.");
    }

    public boolean n(C1168b c1168b, O0.i iVar) {
        if (j(c1168b.f3267b, AbstractC1176j.k(this.f3357a, "com.crashlytics.RequireBuildId", true))) {
            String c1175i = new C1175i(this.f3366j).toString();
            try {
                this.f3363g = new C1183q("crash_marker", this.f3367k);
                this.f3362f = new C1183q("initialization_marker", this.f3367k);
                I0.h hVar = new I0.h(c1175i, this.f3367k, this.f3371o);
                I0.c cVar = new I0.c(this.f3367k);
                this.f3365i = new C1180n(this.f3357a, this.f3371o, this.f3366j, this.f3359c, this.f3367k, this.f3363g, c1168b, hVar, cVar, O.g(this.f3357a, this.f3366j, this.f3367k, c1168b, cVar, hVar, new P0.a(1024, new P0.c(10)), iVar, this.f3360d, this.f3372p), this.f3373q, this.f3369m);
                boolean e8 = e();
                d();
                this.f3365i.x(c1175i, Thread.getDefaultUncaughtExceptionHandler(), iVar);
                if (e8 && AbstractC1176j.c(this.f3357a)) {
                    E0.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    h(iVar);
                    return false;
                }
                E0.f.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e9) {
                E0.f.f().e("Crashlytics was not started due to an exception during initialization", e9);
                this.f3365i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public void o(Boolean bool) {
        this.f3359c.h(bool);
    }
}
