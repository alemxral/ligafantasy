package P;

import P.a;
import Q.C1300a;
import Q.C1301b;
import Q.q;
import Q.y;
import R.AbstractC1306c;
import R.AbstractC1319p;
import R.C1307d;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC1938b;
import com.google.android.gms.common.api.internal.AbstractC1940d;
import com.google.android.gms.common.api.internal.C1939c;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import r0.C3679j;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7823a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7824b;

    /* renamed from: c, reason: collision with root package name */
    private final P.a f7825c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f7826d;

    /* renamed from: e, reason: collision with root package name */
    private final C1301b f7827e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f7828f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7829g;

    /* renamed from: h, reason: collision with root package name */
    private final f f7830h;

    /* renamed from: i, reason: collision with root package name */
    private final Q.k f7831i;

    /* renamed from: j, reason: collision with root package name */
    protected final C1939c f7832j;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f7833c = new C0168a().a();

        /* renamed from: a, reason: collision with root package name */
        public final Q.k f7834a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f7835b;

        /* renamed from: P.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0168a {

            /* renamed from: a, reason: collision with root package name */
            private Q.k f7836a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f7837b;

            public a a() {
                if (this.f7836a == null) {
                    this.f7836a = new C1300a();
                }
                if (this.f7837b == null) {
                    this.f7837b = Looper.getMainLooper();
                }
                return new a(this.f7836a, this.f7837b);
            }

            public C0168a b(Q.k kVar) {
                AbstractC1319p.m(kVar, "StatusExceptionMapper must not be null.");
                this.f7836a = kVar;
                return this;
            }
        }

        private a(Q.k kVar, Account account, Looper looper) {
            this.f7834a = kVar;
            this.f7835b = looper;
        }
    }

    private e(Context context, Activity activity, P.a aVar, a.d dVar, a aVar2) {
        String h8;
        AbstractC1319p.m(context, "Null context is not permitted.");
        AbstractC1319p.m(aVar, "Api must not be null.");
        AbstractC1319p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC1319p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f7823a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            h8 = context.getAttributionTag();
        } else {
            h8 = h(context);
        }
        this.f7824b = h8;
        this.f7825c = aVar;
        this.f7826d = dVar;
        this.f7828f = aVar2.f7835b;
        C1301b a8 = C1301b.a(aVar, dVar, h8);
        this.f7827e = a8;
        this.f7830h = new q(this);
        C1939c u8 = C1939c.u(context2);
        this.f7832j = u8;
        this.f7829g = u8.l();
        this.f7831i = aVar2.f7834a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, u8, a8);
        }
        u8.F(this);
    }

    private final AbstractC1938b q(int i8, AbstractC1938b abstractC1938b) {
        abstractC1938b.i();
        this.f7832j.A(this, i8, abstractC1938b);
        return abstractC1938b;
    }

    private final Task r(int i8, AbstractC1940d abstractC1940d) {
        C3679j c3679j = new C3679j();
        this.f7832j.B(this, i8, abstractC1940d, c3679j, this.f7831i);
        return c3679j.a();
    }

    public f b() {
        return this.f7830h;
    }

    protected C1307d.a c() {
        Account account;
        C1307d.a aVar = new C1307d.a();
        a.d dVar = this.f7826d;
        if (dVar instanceof a.d.InterfaceC0167a) {
            account = ((a.d.InterfaceC0167a) dVar).i();
        } else {
            account = null;
        }
        aVar.d(account);
        aVar.c(Collections.emptySet());
        aVar.e(this.f7823a.getClass().getName());
        aVar.b(this.f7823a.getPackageName());
        return aVar;
    }

    public Task d(AbstractC1940d abstractC1940d) {
        return r(2, abstractC1940d);
    }

    public Task e(AbstractC1940d abstractC1940d) {
        return r(0, abstractC1940d);
    }

    public AbstractC1938b f(AbstractC1938b abstractC1938b) {
        q(1, abstractC1938b);
        return abstractC1938b;
    }

    public Task g(AbstractC1940d abstractC1940d) {
        return r(1, abstractC1940d);
    }

    protected String h(Context context) {
        return null;
    }

    public final C1301b i() {
        return this.f7827e;
    }

    public a.d j() {
        return this.f7826d;
    }

    public Context k() {
        return this.f7823a;
    }

    protected String l() {
        return this.f7824b;
    }

    public Looper m() {
        return this.f7828f;
    }

    public final int n() {
        return this.f7829g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f o(Looper looper, n nVar) {
        C1307d a8 = c().a();
        a.f a9 = ((a.AbstractC0166a) AbstractC1319p.l(this.f7825c.a())).a(this.f7823a, looper, a8, this.f7826d, nVar, nVar);
        String l8 = l();
        if (l8 != null && (a9 instanceof AbstractC1306c)) {
            ((AbstractC1306c) a9).P(l8);
        }
        if (l8 != null && (a9 instanceof Q.g)) {
            android.support.v4.media.a.a(a9);
            throw null;
        }
        return a9;
    }

    public final y p(Context context, Handler handler) {
        return new y(context, handler, c().a());
    }

    public e(Context context, P.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
