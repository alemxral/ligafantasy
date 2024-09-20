package R;

import O.C1258b;
import O.C1260d;
import O.C1264h;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: R.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1306c {

    /* renamed from: A, reason: collision with root package name */
    private boolean f8471A;

    /* renamed from: B, reason: collision with root package name */
    private volatile h0 f8472B;

    /* renamed from: C, reason: collision with root package name */
    protected AtomicInteger f8473C;

    /* renamed from: a, reason: collision with root package name */
    private int f8474a;

    /* renamed from: b, reason: collision with root package name */
    private long f8475b;

    /* renamed from: c, reason: collision with root package name */
    private long f8476c;

    /* renamed from: d, reason: collision with root package name */
    private int f8477d;

    /* renamed from: e, reason: collision with root package name */
    private long f8478e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f8479f;

    /* renamed from: g, reason: collision with root package name */
    s0 f8480g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f8481h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f8482i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC1311h f8483j;

    /* renamed from: k, reason: collision with root package name */
    private final C1264h f8484k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f8485l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f8486m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f8487n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1315l f8488o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0181c f8489p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f8490q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f8491r;

    /* renamed from: s, reason: collision with root package name */
    private e0 f8492s;

    /* renamed from: t, reason: collision with root package name */
    private int f8493t;

    /* renamed from: u, reason: collision with root package name */
    private final a f8494u;

    /* renamed from: v, reason: collision with root package name */
    private final b f8495v;

    /* renamed from: w, reason: collision with root package name */
    private final int f8496w;

    /* renamed from: x, reason: collision with root package name */
    private final String f8497x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f8498y;

    /* renamed from: z, reason: collision with root package name */
    private C1258b f8499z;

    /* renamed from: E, reason: collision with root package name */
    private static final C1260d[] f8470E = new C1260d[0];

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f8469D = {"service_esmobile", "service_googleme"};

    /* renamed from: R.c$a */
    /* loaded from: classes3.dex */
    public interface a {
        void i(int i8);

        void l(Bundle bundle);
    }

    /* renamed from: R.c$b */
    /* loaded from: classes3.dex */
    public interface b {
        void j(C1258b c1258b);
    }

    /* renamed from: R.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0181c {
        void b(C1258b c1258b);
    }

    /* renamed from: R.c$d */
    /* loaded from: classes3.dex */
    protected class d implements InterfaceC0181c {
        public d() {
        }

        @Override // R.AbstractC1306c.InterfaceC0181c
        public final void b(C1258b c1258b) {
            if (c1258b.I()) {
                AbstractC1306c abstractC1306c = AbstractC1306c.this;
                abstractC1306c.p(null, abstractC1306c.C());
            } else if (AbstractC1306c.this.f8495v != null) {
                AbstractC1306c.this.f8495v.j(c1258b);
            }
        }
    }

    /* renamed from: R.c$e */
    /* loaded from: classes3.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1306c(android.content.Context r10, android.os.Looper r11, int r12, R.AbstractC1306c.a r13, R.AbstractC1306c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            R.h r3 = R.AbstractC1311h.a(r10)
            O.h r4 = O.C1264h.f()
            R.AbstractC1319p.l(r13)
            R.AbstractC1319p.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R.AbstractC1306c.<init>(android.content.Context, android.os.Looper, int, R.c$a, R.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c0(AbstractC1306c abstractC1306c, h0 h0Var) {
        r L8;
        abstractC1306c.f8472B = h0Var;
        if (abstractC1306c.S()) {
            C1308e c1308e = h0Var.f8559d;
            C1320q b8 = C1320q.b();
            if (c1308e == null) {
                L8 = null;
            } else {
                L8 = c1308e.L();
            }
            b8.c(L8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d0(AbstractC1306c abstractC1306c, int i8) {
        int i9;
        int i10;
        synchronized (abstractC1306c.f8486m) {
            i9 = abstractC1306c.f8493t;
        }
        if (i9 == 3) {
            abstractC1306c.f8471A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        Handler handler = abstractC1306c.f8485l;
        handler.sendMessage(handler.obtainMessage(i10, abstractC1306c.f8473C.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean g0(AbstractC1306c abstractC1306c, int i8, int i9, IInterface iInterface) {
        synchronized (abstractC1306c.f8486m) {
            try {
                if (abstractC1306c.f8493t != i8) {
                    return false;
                }
                abstractC1306c.i0(i9, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:945)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean h0(R.AbstractC1306c r2) {
        /*
            boolean r0 = r2.f8471A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.E()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R.AbstractC1306c.h0(R.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i8, IInterface iInterface) {
        boolean z8;
        boolean z9;
        s0 s0Var;
        s0 s0Var2;
        boolean z10 = false;
        if (i8 != 4) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (iInterface == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z8 == z9) {
            z10 = true;
        }
        AbstractC1319p.a(z10);
        synchronized (this.f8486m) {
            try {
                this.f8493t = i8;
                this.f8490q = iInterface;
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        if (i8 == 4) {
                            AbstractC1319p.l(iInterface);
                            K(iInterface);
                        }
                    } else {
                        e0 e0Var = this.f8492s;
                        if (e0Var != null && (s0Var2 = this.f8480g) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + s0Var2.b() + " on " + s0Var2.a());
                            AbstractC1311h abstractC1311h = this.f8483j;
                            String b8 = this.f8480g.b();
                            AbstractC1319p.l(b8);
                            abstractC1311h.d(b8, this.f8480g.a(), 4225, e0Var, X(), this.f8480g.c());
                            this.f8473C.incrementAndGet();
                        }
                        e0 e0Var2 = new e0(this, this.f8473C.get());
                        this.f8492s = e0Var2;
                        if (this.f8493t == 3 && B() != null) {
                            s0Var = new s0(y().getPackageName(), B(), true, 4225, false);
                        } else {
                            s0Var = new s0(G(), F(), false, 4225, I());
                        }
                        this.f8480g = s0Var;
                        if (s0Var.c() && k() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f8480g.b())));
                        }
                        AbstractC1311h abstractC1311h2 = this.f8483j;
                        String b9 = this.f8480g.b();
                        AbstractC1319p.l(b9);
                        if (!abstractC1311h2.e(new l0(b9, this.f8480g.a(), 4225, this.f8480g.c()), e0Var2, X(), w())) {
                            Log.w("GmsClient", "unable to connect to service: " + this.f8480g.b() + " on " + this.f8480g.a());
                            e0(16, null, this.f8473C.get());
                        }
                    }
                } else {
                    e0 e0Var3 = this.f8492s;
                    if (e0Var3 != null) {
                        AbstractC1311h abstractC1311h3 = this.f8483j;
                        String b10 = this.f8480g.b();
                        AbstractC1319p.l(b10);
                        abstractC1311h3.d(b10, this.f8480g.a(), 4225, e0Var3, X(), this.f8480g.c());
                        this.f8492s = null;
                    }
                }
            } finally {
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set C() {
        return Collections.emptySet();
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.f8486m) {
            try {
                if (this.f8493t != 5) {
                    r();
                    iInterface = this.f8490q;
                    AbstractC1319p.m(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public C1308e H() {
        h0 h0Var = this.f8472B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f8559d;
    }

    protected boolean I() {
        if (k() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean J() {
        if (this.f8472B != null) {
            return true;
        }
        return false;
    }

    protected void K(IInterface iInterface) {
        this.f8476c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(C1258b c1258b) {
        this.f8477d = c1258b.s();
        this.f8478e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(int i8) {
        this.f8474a = i8;
        this.f8475b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N(int i8, IBinder iBinder, Bundle bundle, int i9) {
        this.f8485l.sendMessage(this.f8485l.obtainMessage(1, i9, -1, new f0(this, i8, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f8498y = str;
    }

    public void Q(int i8) {
        this.f8485l.sendMessage(this.f8485l.obtainMessage(6, this.f8473C.get(), i8));
    }

    protected void R(InterfaceC0181c interfaceC0181c, int i8, PendingIntent pendingIntent) {
        AbstractC1319p.m(interfaceC0181c, "Connection progress callbacks cannot be null.");
        this.f8489p = interfaceC0181c;
        this.f8485l.sendMessage(this.f8485l.obtainMessage(3, this.f8473C.get(), i8, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.f8497x;
        if (str == null) {
            return this.f8481h.getClass().getName();
        }
        return str;
    }

    public void b() {
        this.f8473C.incrementAndGet();
        synchronized (this.f8491r) {
            try {
                int size = this.f8491r.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((c0) this.f8491r.get(i8)).d();
                }
                this.f8491r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f8487n) {
            this.f8488o = null;
        }
        i0(1, null);
    }

    public void d(String str) {
        this.f8479f = str;
        b();
    }

    public boolean e() {
        boolean z8;
        synchronized (this.f8486m) {
            int i8 = this.f8493t;
            z8 = true;
            if (i8 != 2 && i8 != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e0(int i8, Bundle bundle, int i9) {
        this.f8485l.sendMessage(this.f8485l.obtainMessage(7, i9, -1, new g0(this, i8, null)));
    }

    public String f() {
        s0 s0Var;
        if (g() && (s0Var = this.f8480g) != null) {
            return s0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public boolean g() {
        boolean z8;
        synchronized (this.f8486m) {
            if (this.f8493t == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public void h(InterfaceC0181c interfaceC0181c) {
        AbstractC1319p.m(interfaceC0181c, "Connection progress callbacks cannot be null.");
        this.f8489p = interfaceC0181c;
        i0(2, null);
    }

    public boolean i() {
        return true;
    }

    public void j(e eVar) {
        eVar.a();
    }

    public abstract int k();

    public final C1260d[] l() {
        h0 h0Var = this.f8472B;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f8557b;
    }

    public String m() {
        return this.f8479f;
    }

    public boolean n() {
        return false;
    }

    public void p(InterfaceC1313j interfaceC1313j, Set set) {
        Bundle A8 = A();
        String str = this.f8498y;
        int i8 = C1264h.f7653a;
        Scope[] scopeArr = C1309f.f8529o;
        Bundle bundle = new Bundle();
        int i9 = this.f8496w;
        C1260d[] c1260dArr = C1309f.f8530p;
        C1309f c1309f = new C1309f(6, i9, i8, null, null, scopeArr, bundle, null, c1260dArr, c1260dArr, true, 0, false, str);
        c1309f.f8534d = this.f8481h.getPackageName();
        c1309f.f8537g = A8;
        if (set != null) {
            c1309f.f8536f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            Account u8 = u();
            if (u8 == null) {
                u8 = new Account("<<default account>>", "com.google");
            }
            c1309f.f8538h = u8;
            if (interfaceC1313j != null) {
                c1309f.f8535e = interfaceC1313j.asBinder();
            }
        } else if (O()) {
            c1309f.f8538h = u();
        }
        c1309f.f8539i = f8470E;
        c1309f.f8540j = v();
        if (S()) {
            c1309f.f8543m = true;
        }
        try {
            synchronized (this.f8487n) {
                try {
                    InterfaceC1315l interfaceC1315l = this.f8488o;
                    if (interfaceC1315l != null) {
                        interfaceC1315l.K(new d0(this, this.f8473C.get()), c1309f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            Q(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f8473C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f8473C.get());
        }
    }

    public void q() {
        int h8 = this.f8484k.h(this.f8481h, k());
        if (h8 != 0) {
            i0(1, null);
            R(new d(), h8, null);
        } else {
            h(new d());
        }
    }

    protected final void r() {
        if (g()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface s(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C1260d[] v() {
        return f8470E;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f8481h;
    }

    public int z() {
        return this.f8496w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1306c(Context context, Looper looper, AbstractC1311h abstractC1311h, C1264h c1264h, int i8, a aVar, b bVar, String str) {
        this.f8479f = null;
        this.f8486m = new Object();
        this.f8487n = new Object();
        this.f8491r = new ArrayList();
        this.f8493t = 1;
        this.f8499z = null;
        this.f8471A = false;
        this.f8472B = null;
        this.f8473C = new AtomicInteger(0);
        AbstractC1319p.m(context, "Context must not be null");
        this.f8481h = context;
        AbstractC1319p.m(looper, "Looper must not be null");
        this.f8482i = looper;
        AbstractC1319p.m(abstractC1311h, "Supervisor must not be null");
        this.f8483j = abstractC1311h;
        AbstractC1319p.m(c1264h, "API availability must not be null");
        this.f8484k = c1264h;
        this.f8485l = new b0(this, looper);
        this.f8496w = i8;
        this.f8494u = aVar;
        this.f8495v = bVar;
        this.f8497x = str;
    }
}
