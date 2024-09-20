package Y2;

import L5.InterfaceC1227k;
import L5.l;
import M5.AbstractC1246t;
import M5.a0;
import Z2.B;
import Z2.C1518a;
import Z2.C1520c;
import Z2.C1522e;
import Z2.C1524g;
import Z2.C1526i;
import Z2.C1528k;
import Z2.C1530m;
import Z2.C1532o;
import Z2.C1534q;
import Z2.C1535s;
import Z2.C1537u;
import Z2.C1539w;
import Z2.C1542z;
import Z2.E;
import Z2.G;
import Z2.I;
import Z2.K;
import Z2.M;
import Z2.O;
import Z2.Q;
import Z2.T;
import Z2.V;
import Z2.X;
import Z2.Z;
import Z2.b0;
import Z2.d0;
import Z2.f0;
import Z2.h0;
import Z2.j0;
import Z2.l0;
import Z2.n0;
import Z2.p0;
import Z2.r0;
import Z2.t0;
import Z2.v0;
import Z2.x0;
import d6.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f13037a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f13038b = a0.i(C1518a.f13286a, C1520c.f13294a, C1522e.f13302a, C1524g.f13310a, C1526i.f13318a, C1528k.f13326a, C1530m.f13334a, C1532o.f13342a, C1534q.f13350a, C1535s.f13358a, C1537u.f13366a, C1539w.f13374a, C1542z.f13384a, B.f13237a, E.f13243a, G.f13247a, I.f13251a, K.f13255a, M.f13259a, O.f13263a, Q.f13267a, T.f13271a, V.f13275a, X.f13279a, Z.f13283a, b0.f13291a, d0.f13299a, f0.f13307a, h0.f13315a, j0.f13323a, l0.f13331a, n0.f13339a, p0.f13347a, r0.f13355a, t0.f13363a, v0.f13371a, x0.f13379a);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1227k f13039c = l.b(a.f13041a);

    /* renamed from: d, reason: collision with root package name */
    public static final int f13040d = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13041a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            Set a8 = f.f13037a.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(M5.Q.d(AbstractC1246t.x(a8, 10)), 16));
            for (Object obj : a8) {
                linkedHashMap.put(((b) obj).getType().f24537a, obj);
            }
            return linkedHashMap;
        }
    }

    private f() {
    }

    public final Set a() {
        return f13038b;
    }

    public final Map b() {
        return (Map) f13039c.getValue();
    }
}
