package u;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;
import s.C3700b;

/* loaded from: classes3.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f38456e;

    /* renamed from: a, reason: collision with root package name */
    private final E.a f38457a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f38458b;

    /* renamed from: c, reason: collision with root package name */
    private final A.e f38459c;

    /* renamed from: d, reason: collision with root package name */
    private final B.r f38460d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(E.a aVar, E.a aVar2, A.e eVar, B.r rVar, B.v vVar) {
        this.f38457a = aVar;
        this.f38458b = aVar2;
        this.f38459c = eVar;
        this.f38460d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        return i.a().i(this.f38457a.a()).k(this.f38458b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public static u c() {
        v vVar = f38456e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        if (fVar instanceof g) {
            return DesugarCollections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(C3700b.b("proto"));
    }

    public static void f(Context context) {
        if (f38456e == null) {
            synchronized (u.class) {
                try {
                    if (f38456e == null) {
                        f38456e = e.e().a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    @Override // u.t
    public void a(o oVar, s.h hVar) {
        this.f38459c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public B.r e() {
        return this.f38460d;
    }

    public s.g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
