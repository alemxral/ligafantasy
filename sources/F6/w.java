package F6;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class w implements e {

    /* renamed from: a, reason: collision with root package name */
    final u f3009a;

    /* renamed from: b, reason: collision with root package name */
    final J6.j f3010b;

    /* renamed from: c, reason: collision with root package name */
    private o f3011c;

    /* renamed from: d, reason: collision with root package name */
    final x f3012d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f3013e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3014f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends G6.b {
    }

    private w(u uVar, x xVar, boolean z8) {
        this.f3009a = uVar;
        this.f3012d = xVar;
        this.f3013e = z8;
        this.f3010b = new J6.j(uVar, z8);
    }

    private void a() {
        this.f3010b.h(N6.f.i().m("response.body().close()"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w d(u uVar, x xVar, boolean z8) {
        w wVar = new w(uVar, xVar, z8);
        wVar.f3011c = uVar.k().a(wVar);
        return wVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w clone() {
        return d(this.f3009a, this.f3012d, this.f3013e);
    }

    z c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3009a.o());
        arrayList.add(this.f3010b);
        arrayList.add(new J6.a(this.f3009a.h()));
        arrayList.add(new H6.a(this.f3009a.p()));
        arrayList.add(new I6.a(this.f3009a));
        if (!this.f3013e) {
            arrayList.addAll(this.f3009a.q());
        }
        arrayList.add(new J6.b(this.f3013e));
        return new J6.g(arrayList, null, null, null, 0, this.f3012d, this, this.f3011c, this.f3009a.e(), this.f3009a.x(), this.f3009a.D()).a(this.f3012d);
    }

    @Override // F6.e
    public z execute() {
        synchronized (this) {
            if (!this.f3014f) {
                this.f3014f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f3011c.c(this);
        try {
            try {
                this.f3009a.i().a(this);
                z c8 = c();
                if (c8 != null) {
                    return c8;
                }
                throw new IOException("Canceled");
            } catch (IOException e8) {
                this.f3011c.b(this, e8);
                throw e8;
            }
        } finally {
            this.f3009a.i().c(this);
        }
    }
}
