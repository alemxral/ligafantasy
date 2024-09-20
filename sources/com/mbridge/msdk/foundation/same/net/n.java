package com.mbridge.msdk.foundation.same.net;

import android.content.Context;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static n f19764a;

    /* renamed from: b, reason: collision with root package name */
    private j f19765b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.e.b f19766c;

    /* renamed from: d, reason: collision with root package name */
    private j f19767d;

    private n() {
    }

    public static void a(i iVar) {
        b().a(iVar);
    }

    private static j b() {
        n nVar = f19764a;
        if (nVar != null) {
            j jVar = nVar.f19767d;
            if (jVar != null) {
                return jVar;
            }
            nVar.f19767d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
            return f19764a.f19767d;
        }
        n nVar2 = new n();
        f19764a = nVar2;
        if (nVar2.f19767d == null) {
            nVar2.f19767d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f19764a.f19767d;
    }

    public static com.mbridge.msdk.foundation.same.net.e.b a() {
        n nVar = f19764a;
        if (nVar != null) {
            com.mbridge.msdk.foundation.same.net.e.b bVar = nVar.f19766c;
            if (bVar != null) {
                return bVar;
            }
            nVar.f19766c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
            return f19764a.f19766c;
        }
        n nVar2 = new n();
        f19764a = nVar2;
        if (nVar2.f19766c == null) {
            nVar2.f19766c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
        return f19764a.f19766c;
    }

    public static void b(i iVar) {
        n nVar = f19764a;
        if (nVar != null) {
            if (nVar.f19765b == null) {
                nVar.f19765b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        } else {
            n nVar2 = new n();
            f19764a = nVar2;
            if (nVar2.f19765b == null) {
                nVar2.f19765b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        }
        f19764a.f19765b.a(iVar);
    }

    public static void a(Context context) {
        if (f19764a == null) {
            n nVar = new n();
            f19764a = nVar;
            nVar.f19767d = new j(context.getApplicationContext());
            f19764a.f19766c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
    }
}
