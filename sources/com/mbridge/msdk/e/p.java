package com.mbridge.msdk.e;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private final g f18922a;

    public p(g gVar) {
        this.f18922a = gVar;
    }

    @Override // com.mbridge.msdk.e.l
    public final void a(e eVar) {
        if (y.a(this.f18922a)) {
            return;
        }
        this.f18922a.a(eVar);
    }

    @Override // com.mbridge.msdk.e.l
    public final void b(e eVar) {
        if (y.a(this.f18922a)) {
            return;
        }
        try {
            h i8 = eVar.i();
            if (y.b(i8)) {
                eVar.a(i8.a(eVar));
            }
            this.f18922a.b(eVar);
        } catch (Exception e8) {
            if (a.f18736a) {
                Log.e("TrackManager", "process event error", e8);
            }
        }
    }

    @Override // com.mbridge.msdk.e.l
    public final long[] a() {
        if (y.a(this.f18922a)) {
            return new long[]{0, 0};
        }
        return this.f18922a.a();
    }
}
