package S3;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f9182a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.d f9183b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9184b = new a("MARKET_OR_REGION_RESTRICTION", 0, "RE01");

        /* renamed from: c, reason: collision with root package name */
        public static final a f9185c = new a("PLATFORM_VERSION", 1, "RE02");

        /* renamed from: d, reason: collision with root package name */
        public static final a f9186d = new a("PERMISSION", 2, "RE03");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f9187e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f9188f;

        /* renamed from: a, reason: collision with root package name */
        private final String f9189a;

        static {
            a[] a8 = a();
            f9187e = a8;
            f9188f = R5.b.a(a8);
        }

        private a(String str, int i8, String str2) {
            this.f9189a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f9184b, f9185c, f9186d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9187e.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9189a;
        }
    }

    public i(int i8, Z3.d hardwareIdSupplier) {
        AbstractC3159y.i(hardwareIdSupplier, "hardwareIdSupplier");
        this.f9182a = i8;
        this.f9183b = hardwareIdSupplier;
    }

    @Override // S3.h
    public Map a() {
        return Q.q(Q.q(b(), d()), c());
    }

    public final Map b() {
        HashMap hashMap = new HashMap();
        List p8 = AbstractC1246t.p(g.f9111b, g.f9114c, g.f9117d, g.f9120e, g.f9123f, g.f9126g, g.f9129h, g.f9132i);
        for (g gVar : g.b()) {
            if (!p8.contains(gVar)) {
                hashMap.put(gVar.toString(), a.f9184b.toString());
            }
        }
        return hashMap;
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        String gVar = g.f9073O.toString();
        a aVar = a.f9186d;
        hashMap.put(gVar, aVar.toString());
        hashMap.put(g.f9076P.toString(), aVar.toString());
        hashMap.put(g.f9079Q.toString(), aVar.toString());
        hashMap.put(g.f9082R.toString(), aVar.toString());
        hashMap.put(g.f9085S.toString(), aVar.toString());
        hashMap.put(g.f9088T.toString(), aVar.toString());
        hashMap.put(g.f9091U.toString(), aVar.toString());
        hashMap.put(g.f9094V.toString(), aVar.toString());
        hashMap.put(g.f9097W.toString(), aVar.toString());
        hashMap.put(g.f9100X.toString(), aVar.toString());
        hashMap.put(g.f9103Y.toString(), aVar.toString());
        hashMap.put(g.f9140l.toString(), aVar.toString());
        hashMap.put(g.f9142m.toString(), aVar.toString());
        if (!((j) this.f9183b.get()).c()) {
            hashMap.put(g.f9129h.toString(), a.f9185c.toString());
        }
        hashMap.put(g.f9135j.toString(), aVar.toString());
        hashMap.put(g.f9106Z.toString(), aVar.toString());
        hashMap.put(g.f9149p0.toString(), aVar.toString());
        hashMap.put(g.f9152q0.toString(), aVar.toString());
        hashMap.put(g.f9144n.toString(), aVar.toString());
        hashMap.put(g.f9146o.toString(), aVar.toString());
        hashMap.put(g.f9148p.toString(), aVar.toString());
        hashMap.put(g.f9151q.toString(), aVar.toString());
        hashMap.put(g.f9040D.toString(), aVar.toString());
        hashMap.put(g.f9046F.toString(), aVar.toString());
        hashMap.put(g.f9049G.toString(), aVar.toString());
        hashMap.put(g.f9064L.toString(), aVar.toString());
        hashMap.put(g.f9070N.toString(), aVar.toString());
        hashMap.put(g.f9038C0.toString(), aVar.toString());
        hashMap.put(g.f9107Z0.toString(), aVar.toString());
        return hashMap;
    }

    public final Map d() {
        HashMap hashMap = new HashMap();
        if (this.f9182a < 26) {
            String gVar = g.f9148p.toString();
            a aVar = a.f9185c;
            hashMap.put(gVar, aVar.toString());
            hashMap.put(g.f9038C0.toString(), aVar.toString());
            hashMap.put(g.f9107Z0.toString(), aVar.toString());
        }
        if (this.f9182a < 23) {
            String gVar2 = g.f9175y.toString();
            a aVar2 = a.f9185c;
            hashMap.put(gVar2, aVar2.toString());
            hashMap.put(g.f9055I.toString(), aVar2.toString());
            hashMap.put(g.f9064L.toString(), aVar2.toString());
            hashMap.put(g.f9070N.toString(), aVar2.toString());
            hashMap.put(g.f9065L0.toString(), aVar2.toString());
            hashMap.put(g.f9068M0.toString(), aVar2.toString());
            hashMap.put(g.f9071N0.toString(), aVar2.toString());
            hashMap.put(g.f9033A1.toString(), aVar2.toString());
            hashMap.put(g.f9093U1.toString(), aVar2.toString());
        }
        if (this.f9182a > 23) {
            hashMap.put(g.f9115c1.toString(), a.f9185c.toString());
        }
        if (this.f9182a < 22) {
            hashMap.put(g.f9067M.toString(), a.f9185c.toString());
        }
        return hashMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Z3.d hardwareIdSupplier) {
        this(Build.VERSION.SDK_INT, hardwareIdSupplier);
        AbstractC3159y.i(hardwareIdSupplier, "hardwareIdSupplier");
    }
}
