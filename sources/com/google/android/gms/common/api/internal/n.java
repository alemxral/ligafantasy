package com.google.android.gms.common.api.internal;

import O.C1258b;
import O.C1260d;
import O.C1263g;
import P.a;
import P.f;
import Q.C1301b;
import R.AbstractC1317n;
import R.AbstractC1319p;
import R.G;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import r0.C3679j;

/* loaded from: classes3.dex */
public final class n implements f.a, f.b {

    /* renamed from: b */
    private final a.f f15156b;

    /* renamed from: k */
    private final C1301b f15157k;

    /* renamed from: l */
    private final g f15158l;

    /* renamed from: o */
    private final int f15161o;

    /* renamed from: p */
    private final Q.y f15162p;

    /* renamed from: q */
    private boolean f15163q;

    /* renamed from: u */
    final /* synthetic */ C1939c f15167u;

    /* renamed from: a */
    private final Queue f15155a = new LinkedList();

    /* renamed from: m */
    private final Set f15159m = new HashSet();

    /* renamed from: n */
    private final Map f15160n = new HashMap();

    /* renamed from: r */
    private final List f15164r = new ArrayList();

    /* renamed from: s */
    private C1258b f15165s = null;

    /* renamed from: t */
    private int f15166t = 0;

    public n(C1939c c1939c, P.e eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f15167u = c1939c;
        handler = c1939c.f15132n;
        a.f o8 = eVar.o(handler.getLooper(), this);
        this.f15156b = o8;
        this.f15157k = eVar.i();
        this.f15158l = new g();
        this.f15161o = eVar.n();
        if (o8.n()) {
            context = c1939c.f15123e;
            handler2 = c1939c.f15132n;
            this.f15162p = eVar.p(context, handler2);
            return;
        }
        this.f15162p = null;
    }

    public static /* bridge */ /* synthetic */ void B(n nVar, o oVar) {
        if (nVar.f15164r.contains(oVar) && !nVar.f15163q) {
            if (!nVar.f15156b.g()) {
                nVar.E();
            } else {
                nVar.g();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void C(n nVar, o oVar) {
        Handler handler;
        Handler handler2;
        C1260d c1260d;
        C1260d[] g8;
        if (nVar.f15164r.remove(oVar)) {
            handler = nVar.f15167u.f15132n;
            handler.removeMessages(15, oVar);
            handler2 = nVar.f15167u.f15132n;
            handler2.removeMessages(16, oVar);
            c1260d = oVar.f15169b;
            ArrayList arrayList = new ArrayList(nVar.f15155a.size());
            for (y yVar : nVar.f15155a) {
                if ((yVar instanceof Q.t) && (g8 = ((Q.t) yVar).g(nVar)) != null && W.b.b(g8, c1260d)) {
                    arrayList.add(yVar);
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                y yVar2 = (y) arrayList.get(i8);
                nVar.f15155a.remove(yVar2);
                yVar2.b(new P.k(c1260d));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C1260d c(C1260d[] c1260dArr) {
        if (c1260dArr != null && c1260dArr.length != 0) {
            C1260d[] l8 = this.f15156b.l();
            if (l8 == null) {
                l8 = new C1260d[0];
            }
            ArrayMap arrayMap = new ArrayMap(l8.length);
            for (C1260d c1260d : l8) {
                arrayMap.put(c1260d.s(), Long.valueOf(c1260d.u()));
            }
            for (C1260d c1260d2 : c1260dArr) {
                Long l9 = (Long) arrayMap.get(c1260d2.s());
                if (l9 == null || l9.longValue() < c1260d2.u()) {
                    return c1260d2;
                }
            }
        }
        return null;
    }

    private final void d(C1258b c1258b) {
        Iterator it = this.f15159m.iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            if (AbstractC1317n.a(c1258b, C1258b.f7638e)) {
                this.f15156b.f();
            }
            throw null;
        }
        this.f15159m.clear();
    }

    public final void e(Status status) {
        Handler handler;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z8) {
        Handler handler;
        boolean z9;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        boolean z10 = true;
        if (status != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (exc != null) {
            z10 = false;
        }
        if (z9 != z10) {
            Iterator it = this.f15155a.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                if (!z8 || yVar.f15193a == 2) {
                    if (status != null) {
                        yVar.a(status);
                    } else {
                        yVar.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f15155a);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            y yVar = (y) arrayList.get(i8);
            if (this.f15156b.g()) {
                if (p(yVar)) {
                    this.f15155a.remove(yVar);
                }
            } else {
                return;
            }
        }
    }

    public final void h() {
        D();
        d(C1258b.f7638e);
        o();
        Iterator it = this.f15160n.values().iterator();
        if (!it.hasNext()) {
            g();
            m();
        } else {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
    }

    public final void k(int i8) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        G g8;
        D();
        this.f15163q = true;
        this.f15158l.e(i8, this.f15156b.m());
        C1301b c1301b = this.f15157k;
        C1939c c1939c = this.f15167u;
        handler = c1939c.f15132n;
        handler2 = c1939c.f15132n;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, c1301b), 5000L);
        C1301b c1301b2 = this.f15157k;
        C1939c c1939c2 = this.f15167u;
        handler3 = c1939c2.f15132n;
        handler4 = c1939c2.f15132n;
        handler3.sendMessageDelayed(Message.obtain(handler4, 11, c1301b2), 120000L);
        g8 = this.f15167u.f15125g;
        g8.c();
        Iterator it = this.f15160n.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    private final void m() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j8;
        C1301b c1301b = this.f15157k;
        handler = this.f15167u.f15132n;
        handler.removeMessages(12, c1301b);
        C1301b c1301b2 = this.f15157k;
        C1939c c1939c = this.f15167u;
        handler2 = c1939c.f15132n;
        handler3 = c1939c.f15132n;
        Message obtainMessage = handler3.obtainMessage(12, c1301b2);
        j8 = this.f15167u.f15119a;
        handler2.sendMessageDelayed(obtainMessage, j8);
    }

    private final void n(y yVar) {
        yVar.d(this.f15158l, a());
        try {
            yVar.c(this);
        } catch (DeadObjectException unused) {
            i(1);
            this.f15156b.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        Handler handler;
        Handler handler2;
        if (this.f15163q) {
            C1939c c1939c = this.f15167u;
            C1301b c1301b = this.f15157k;
            handler = c1939c.f15132n;
            handler.removeMessages(11, c1301b);
            C1939c c1939c2 = this.f15167u;
            C1301b c1301b2 = this.f15157k;
            handler2 = c1939c2.f15132n;
            handler2.removeMessages(9, c1301b2);
            this.f15163q = false;
        }
    }

    private final boolean p(y yVar) {
        boolean z8;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        if (!(yVar instanceof Q.t)) {
            n(yVar);
            return true;
        }
        Q.t tVar = (Q.t) yVar;
        C1260d c8 = c(tVar.g(this));
        if (c8 == null) {
            n(yVar);
            return true;
        }
        Log.w("GoogleApiManager", this.f15156b.getClass().getName() + " could not execute call because it requires feature (" + c8.s() + ", " + c8.u() + ").");
        z8 = this.f15167u.f15133o;
        if (z8 && tVar.f(this)) {
            o oVar = new o(this.f15157k, c8, null);
            int indexOf = this.f15164r.indexOf(oVar);
            if (indexOf >= 0) {
                o oVar2 = (o) this.f15164r.get(indexOf);
                handler5 = this.f15167u.f15132n;
                handler5.removeMessages(15, oVar2);
                C1939c c1939c = this.f15167u;
                handler6 = c1939c.f15132n;
                handler7 = c1939c.f15132n;
                handler6.sendMessageDelayed(Message.obtain(handler7, 15, oVar2), 5000L);
                return false;
            }
            this.f15164r.add(oVar);
            C1939c c1939c2 = this.f15167u;
            handler = c1939c2.f15132n;
            handler2 = c1939c2.f15132n;
            handler.sendMessageDelayed(Message.obtain(handler2, 15, oVar), 5000L);
            C1939c c1939c3 = this.f15167u;
            handler3 = c1939c3.f15132n;
            handler4 = c1939c3.f15132n;
            handler3.sendMessageDelayed(Message.obtain(handler4, 16, oVar), 120000L);
            C1258b c1258b = new C1258b(2, null);
            if (!q(c1258b)) {
                this.f15167u.f(c1258b, this.f15161o);
                return false;
            }
            return false;
        }
        tVar.b(new P.k(c8));
        return true;
    }

    private final boolean q(C1258b c1258b) {
        Object obj;
        h hVar;
        Set set;
        h hVar2;
        obj = C1939c.f15117r;
        synchronized (obj) {
            try {
                C1939c c1939c = this.f15167u;
                hVar = c1939c.f15129k;
                if (hVar != null) {
                    set = c1939c.f15130l;
                    if (set.contains(this.f15157k)) {
                        hVar2 = this.f15167u.f15129k;
                        hVar2.s(c1258b, this.f15161o);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean r(boolean z8) {
        Handler handler;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        if (this.f15156b.g() && this.f15160n.isEmpty()) {
            if (this.f15158l.g()) {
                if (z8) {
                    m();
                    return false;
                }
                return false;
            }
            this.f15156b.d("Timing out service connection.");
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ C1301b w(n nVar) {
        return nVar.f15157k;
    }

    public static /* bridge */ /* synthetic */ void y(n nVar, Status status) {
        nVar.e(status);
    }

    public final void D() {
        Handler handler;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        this.f15165s = null;
    }

    public final void E() {
        Handler handler;
        G g8;
        Context context;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        if (!this.f15156b.g() && !this.f15156b.e()) {
            try {
                C1939c c1939c = this.f15167u;
                g8 = c1939c.f15125g;
                context = c1939c.f15123e;
                int b8 = g8.b(context, this.f15156b);
                if (b8 != 0) {
                    C1258b c1258b = new C1258b(b8, null);
                    Log.w("GoogleApiManager", "The service for " + this.f15156b.getClass().getName() + " is not available: " + c1258b.toString());
                    H(c1258b, null);
                    return;
                }
                C1939c c1939c2 = this.f15167u;
                a.f fVar = this.f15156b;
                q qVar = new q(c1939c2, fVar, this.f15157k);
                if (fVar.n()) {
                    ((Q.y) AbstractC1319p.l(this.f15162p)).p0(qVar);
                }
                try {
                    this.f15156b.h(qVar);
                } catch (SecurityException e8) {
                    H(new C1258b(10), e8);
                }
            } catch (IllegalStateException e9) {
                H(new C1258b(10), e9);
            }
        }
    }

    public final void F(y yVar) {
        Handler handler;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        if (this.f15156b.g()) {
            if (p(yVar)) {
                m();
                return;
            } else {
                this.f15155a.add(yVar);
                return;
            }
        }
        this.f15155a.add(yVar);
        C1258b c1258b = this.f15165s;
        if (c1258b != null && c1258b.G()) {
            H(this.f15165s, null);
        } else {
            E();
        }
    }

    public final void G() {
        this.f15166t++;
    }

    public final void H(C1258b c1258b, Exception exc) {
        Handler handler;
        G g8;
        boolean z8;
        Status g9;
        Status g10;
        Status g11;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        Q.y yVar = this.f15162p;
        if (yVar != null) {
            yVar.q0();
        }
        D();
        g8 = this.f15167u.f15125g;
        g8.c();
        d(c1258b);
        if ((this.f15156b instanceof T.e) && c1258b.s() != 24) {
            this.f15167u.f15120b = true;
            C1939c c1939c = this.f15167u;
            handler5 = c1939c.f15132n;
            handler6 = c1939c.f15132n;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (c1258b.s() == 4) {
            status = C1939c.f15116q;
            e(status);
            return;
        }
        if (this.f15155a.isEmpty()) {
            this.f15165s = c1258b;
            return;
        }
        if (exc != null) {
            handler4 = this.f15167u.f15132n;
            AbstractC1319p.d(handler4);
            f(null, exc, false);
            return;
        }
        z8 = this.f15167u.f15133o;
        if (z8) {
            g10 = C1939c.g(this.f15157k, c1258b);
            f(g10, null, true);
            if (!this.f15155a.isEmpty() && !q(c1258b) && !this.f15167u.f(c1258b, this.f15161o)) {
                if (c1258b.s() == 18) {
                    this.f15163q = true;
                }
                if (!this.f15163q) {
                    g11 = C1939c.g(this.f15157k, c1258b);
                    e(g11);
                    return;
                }
                C1939c c1939c2 = this.f15167u;
                C1301b c1301b = this.f15157k;
                handler2 = c1939c2.f15132n;
                handler3 = c1939c2.f15132n;
                handler2.sendMessageDelayed(Message.obtain(handler3, 9, c1301b), 5000L);
                return;
            }
            return;
        }
        g9 = C1939c.g(this.f15157k, c1258b);
        e(g9);
    }

    public final void I(C1258b c1258b) {
        Handler handler;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        a.f fVar = this.f15156b;
        fVar.d("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c1258b));
        H(c1258b, null);
    }

    public final void J() {
        Handler handler;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        if (this.f15163q) {
            E();
        }
    }

    public final void K() {
        Handler handler;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        e(C1939c.f15115p);
        this.f15158l.f();
        for (Q.f fVar : (Q.f[]) this.f15160n.keySet().toArray(new Q.f[0])) {
            F(new x(null, new C3679j()));
        }
        d(new C1258b(4));
        if (this.f15156b.g()) {
            this.f15156b.j(new m(this));
        }
    }

    public final void L() {
        Handler handler;
        C1263g c1263g;
        Context context;
        Status status;
        handler = this.f15167u.f15132n;
        AbstractC1319p.d(handler);
        if (this.f15163q) {
            o();
            C1939c c1939c = this.f15167u;
            c1263g = c1939c.f15124f;
            context = c1939c.f15123e;
            if (c1263g.g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            e(status);
            this.f15156b.d("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f15156b.n();
    }

    public final boolean b() {
        return r(true);
    }

    @Override // Q.InterfaceC1302c
    public final void i(int i8) {
        Handler handler;
        Handler handler2;
        C1939c c1939c = this.f15167u;
        Looper myLooper = Looper.myLooper();
        handler = c1939c.f15132n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f15167u.f15132n;
            handler2.post(new k(this, i8));
        } else {
            k(i8);
        }
    }

    @Override // Q.h
    public final void j(C1258b c1258b) {
        H(c1258b, null);
    }

    @Override // Q.InterfaceC1302c
    public final void l(Bundle bundle) {
        Handler handler;
        Handler handler2;
        C1939c c1939c = this.f15167u;
        Looper myLooper = Looper.myLooper();
        handler = c1939c.f15132n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f15167u.f15132n;
            handler2.post(new j(this));
        } else {
            h();
        }
    }

    public final int s() {
        return this.f15161o;
    }

    public final int t() {
        return this.f15166t;
    }

    public final a.f v() {
        return this.f15156b;
    }

    public final Map x() {
        return this.f15160n;
    }
}
