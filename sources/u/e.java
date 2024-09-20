package u;

import C.C1073g;
import C.C1074h;
import C.C1075i;
import C.C1076j;
import C.InterfaceC1070d;
import C.N;
import C.V;
import android.content.Context;
import u.v;
import w.AbstractC3838d;
import w.C3835a;
import w.C3837c;
import w.InterfaceC3836b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e extends v {

    /* renamed from: a, reason: collision with root package name */
    private I5.a f38428a;

    /* renamed from: b, reason: collision with root package name */
    private I5.a f38429b;

    /* renamed from: c, reason: collision with root package name */
    private I5.a f38430c;

    /* renamed from: d, reason: collision with root package name */
    private I5.a f38431d;

    /* renamed from: e, reason: collision with root package name */
    private I5.a f38432e;

    /* renamed from: f, reason: collision with root package name */
    private I5.a f38433f;

    /* renamed from: g, reason: collision with root package name */
    private I5.a f38434g;

    /* renamed from: h, reason: collision with root package name */
    private I5.a f38435h;

    /* renamed from: i, reason: collision with root package name */
    private I5.a f38436i;

    /* renamed from: j, reason: collision with root package name */
    private I5.a f38437j;

    /* renamed from: k, reason: collision with root package name */
    private I5.a f38438k;

    /* renamed from: l, reason: collision with root package name */
    private I5.a f38439l;

    /* renamed from: m, reason: collision with root package name */
    private I5.a f38440m;

    /* loaded from: classes3.dex */
    private static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38441a;

        private b() {
        }

        @Override // u.v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f38441a = (Context) AbstractC3838d.b(context);
            return this;
        }

        @Override // u.v.a
        public v build() {
            AbstractC3838d.a(this.f38441a, Context.class);
            return new e(this.f38441a);
        }
    }

    public static v.a e() {
        return new b();
    }

    private void f(Context context) {
        this.f38428a = C3835a.a(k.a());
        InterfaceC3836b a8 = C3837c.a(context);
        this.f38429b = a8;
        v.j a9 = v.j.a(a8, E.c.a(), E.d.a());
        this.f38430c = a9;
        this.f38431d = C3835a.a(v.l.a(this.f38429b, a9));
        this.f38432e = V.a(this.f38429b, C1073g.a(), C1075i.a());
        this.f38433f = C3835a.a(C1074h.a(this.f38429b));
        this.f38434g = C3835a.a(N.a(E.c.a(), E.d.a(), C1076j.a(), this.f38432e, this.f38433f));
        A.g b8 = A.g.b(E.c.a());
        this.f38435h = b8;
        A.i a10 = A.i.a(this.f38429b, this.f38434g, b8, E.d.a());
        this.f38436i = a10;
        I5.a aVar = this.f38428a;
        I5.a aVar2 = this.f38431d;
        I5.a aVar3 = this.f38434g;
        this.f38437j = A.d.a(aVar, aVar2, a10, aVar3, aVar3);
        I5.a aVar4 = this.f38429b;
        I5.a aVar5 = this.f38431d;
        I5.a aVar6 = this.f38434g;
        this.f38438k = B.s.a(aVar4, aVar5, aVar6, this.f38436i, this.f38428a, aVar6, E.c.a(), E.d.a(), this.f38434g);
        I5.a aVar7 = this.f38428a;
        I5.a aVar8 = this.f38434g;
        this.f38439l = B.w.a(aVar7, aVar8, this.f38436i, aVar8);
        this.f38440m = C3835a.a(w.a(E.c.a(), E.d.a(), this.f38437j, this.f38438k, this.f38439l));
    }

    @Override // u.v
    InterfaceC1070d a() {
        return (InterfaceC1070d) this.f38434g.get();
    }

    @Override // u.v
    u b() {
        return (u) this.f38440m.get();
    }

    private e(Context context) {
        f(context);
    }
}
