package T;

import P.a;
import P.e;
import Q.i;
import R.C1322t;
import R.C1325w;
import R.InterfaceC1324v;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC1940d;
import com.google.android.gms.tasks.Task;
import e0.AbstractC2572d;
import r0.C3679j;

/* loaded from: classes3.dex */
public final class d extends P.e implements InterfaceC1324v {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f9673k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0166a f9674l;

    /* renamed from: m, reason: collision with root package name */
    private static final P.a f9675m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9676n = 0;

    static {
        a.g gVar = new a.g();
        f9673k = gVar;
        c cVar = new c();
        f9674l = cVar;
        f9675m = new P.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C1325w c1325w) {
        super(context, f9675m, c1325w, e.a.f7833c);
    }

    @Override // R.InterfaceC1324v
    public final Task a(final C1322t c1322t) {
        AbstractC1940d.a a8 = AbstractC1940d.a();
        a8.d(AbstractC2572d.f30206a);
        a8.c(false);
        a8.b(new i() { // from class: T.b
            @Override // Q.i
            public final void a(Object obj, Object obj2) {
                int i8 = d.f9676n;
                ((a) ((e) obj).D()).m0(C1322t.this);
                ((C3679j) obj2).c(null);
            }
        });
        return d(a8.a());
    }
}
