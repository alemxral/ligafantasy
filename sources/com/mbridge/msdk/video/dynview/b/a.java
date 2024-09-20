package com.mbridge.msdk.video.dynview.b;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.e.e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f21987b;

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.d.a f21988a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f21987b == null) {
            synchronized (a.class) {
                try {
                    if (f21987b == null) {
                        f21987b = new a();
                    }
                    aVar = f21987b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return f21987b;
    }

    public final void b() {
        com.mbridge.msdk.video.dynview.d.a aVar = this.f21988a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void a(View view, c cVar, Map map, e eVar) {
        int h8 = cVar.h();
        if (h8 == 1) {
            com.mbridge.msdk.video.dynview.j.a aVar = new com.mbridge.msdk.video.dynview.j.a();
            aVar.a(cVar, view, map, eVar);
            this.f21988a = aVar.f22088a;
        } else {
            if (h8 == 2) {
                new com.mbridge.msdk.video.dynview.j.a().b(cVar, view, map, eVar);
                return;
            }
            if (h8 == 4) {
                new com.mbridge.msdk.video.dynview.j.a().a(cVar, view, eVar);
            } else if (h8 != 5) {
                eVar.a(view, new ArrayList());
            } else {
                new com.mbridge.msdk.video.dynview.j.a().c(cVar, view, map, eVar);
            }
        }
    }
}
