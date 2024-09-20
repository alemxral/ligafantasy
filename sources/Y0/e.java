package y0;

import B0.C1062c;
import B0.C1066g;
import B0.o;
import B0.x;
import R.AbstractC1317n;
import R.AbstractC1319p;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1937a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e1.C2576a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l1.AbstractC3165c;
import l1.C3164b;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f39635k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map f39636l = new ArrayMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f39637a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39638b;

    /* renamed from: c, reason: collision with root package name */
    private final m f39639c;

    /* renamed from: d, reason: collision with root package name */
    private final o f39640d;

    /* renamed from: g, reason: collision with root package name */
    private final x f39643g;

    /* renamed from: h, reason: collision with root package name */
    private final Z0.b f39644h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f39641e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f39642f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f39645i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f39646j = new CopyOnWriteArrayList();

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements ComponentCallbacks2C1937a.InterfaceC0376a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f39647a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (W.k.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f39647a.get() == null) {
                    b bVar = new b();
                    if (androidx.compose.animation.core.d.a(f39647a, null, bVar)) {
                        ComponentCallbacks2C1937a.c(application);
                        ComponentCallbacks2C1937a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1937a.InterfaceC0376a
        public void a(boolean z8) {
            synchronized (e.f39635k) {
                try {
                    Iterator it = new ArrayList(e.f39636l.values()).iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (eVar.f39641e.get()) {
                            eVar.y(z8);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f39648b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f39649a;

        public c(Context context) {
            this.f39649a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f39648b.get() == null) {
                c cVar = new c(context);
                if (androidx.compose.animation.core.d.a(f39648b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f39649a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f39635k) {
                try {
                    Iterator it = e.f39636l.values().iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, m mVar) {
        this.f39637a = (Context) AbstractC1319p.l(context);
        this.f39638b = AbstractC1319p.f(str);
        this.f39639c = (m) AbstractC1319p.l(mVar);
        n b8 = FirebaseInitProvider.b();
        AbstractC3165c.b("Firebase");
        AbstractC3165c.b("ComponentDiscovery");
        List b9 = C1066g.c(context, ComponentDiscoveryService.class).b();
        AbstractC3165c.a();
        AbstractC3165c.b("Runtime");
        o.b g8 = o.m(C0.m.INSTANCE).d(b9).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C1062c.s(context, Context.class, new Class[0])).b(C1062c.s(this, e.class, new Class[0])).b(C1062c.s(mVar, m.class, new Class[0])).g(new C3164b());
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.c()) {
            g8.b(C1062c.s(b8, n.class, new Class[0]));
        }
        o e8 = g8.e();
        this.f39640d = e8;
        AbstractC3165c.a();
        this.f39643g = new x(new Z0.b() { // from class: y0.c
            @Override // Z0.b
            public final Object get() {
                C2576a v8;
                v8 = e.this.v(context);
                return v8;
            }
        });
        this.f39644h = e8.d(X0.f.class);
        g(new a() { // from class: y0.d
            @Override // y0.e.a
            public final void a(boolean z8) {
                e.this.w(z8);
            }
        });
        AbstractC3165c.a();
    }

    private void i() {
        AbstractC1319p.p(!this.f39642f.get(), "FirebaseApp was deleted");
    }

    public static e l() {
        e eVar;
        synchronized (f39635k) {
            try {
                eVar = (e) f39636l.get("[DEFAULT]");
                if (eVar != null) {
                    ((X0.f) eVar.f39644h.get()).l();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + W.m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!UserManagerCompat.isUserUnlocked(this.f39637a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f39637a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f39640d.p(u());
        ((X0.f) this.f39644h.get()).l();
    }

    public static e q(Context context) {
        synchronized (f39635k) {
            try {
                if (f39636l.containsKey("[DEFAULT]")) {
                    return l();
                }
                m a8 = m.a(context);
                if (a8 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, a8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e r(Context context, m mVar) {
        return s(context, mVar, "[DEFAULT]");
    }

    public static e s(Context context, m mVar, String str) {
        e eVar;
        b.c(context);
        String x8 = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f39635k) {
            Map map = f39636l;
            AbstractC1319p.p(!map.containsKey(x8), "FirebaseApp name " + x8 + " already exists!");
            AbstractC1319p.m(context, "Application context cannot be null.");
            eVar = new e(context, x8, mVar);
            map.put(x8, eVar);
        }
        eVar.p();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2576a v(Context context) {
        return new C2576a(context, o(), (W0.c) this.f39640d.a(W0.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z8) {
        if (!z8) {
            ((X0.f) this.f39644h.get()).l();
        }
    }

    private static String x(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z8) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f39645i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z8);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f39638b.equals(((e) obj).m());
    }

    public void g(a aVar) {
        i();
        if (this.f39641e.get() && ComponentCallbacks2C1937a.b().d()) {
            aVar.a(true);
        }
        this.f39645i.add(aVar);
    }

    public void h(f fVar) {
        i();
        AbstractC1319p.l(fVar);
        this.f39646j.add(fVar);
    }

    public int hashCode() {
        return this.f39638b.hashCode();
    }

    public Object j(Class cls) {
        i();
        return this.f39640d.a(cls);
    }

    public Context k() {
        i();
        return this.f39637a;
    }

    public String m() {
        i();
        return this.f39638b;
    }

    public m n() {
        i();
        return this.f39639c;
    }

    public String o() {
        return W.c.a(m().getBytes(Charset.defaultCharset())) + "+" + W.c.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return ((C2576a) this.f39643g.get()).b();
    }

    public String toString() {
        return AbstractC1317n.c(this).a("name", this.f39638b).a("options", this.f39639c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
