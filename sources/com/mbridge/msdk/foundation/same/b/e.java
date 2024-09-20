package com.mbridge.msdk.foundation.same.b;

import android.util.Log;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f19468a;

    /* renamed from: b, reason: collision with root package name */
    private b f19469b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f19470c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public File f19471a;

        /* renamed from: b, reason: collision with root package name */
        public c f19472b;

        public a(c cVar, File file) {
            this.f19472b = cVar;
            this.f19471a = file;
        }
    }

    private e(b bVar) {
        this.f19469b = bVar;
    }

    public static String a(c cVar) {
        File b8 = b(cVar);
        if (b8 != null) {
            return b8.getAbsolutePath();
        }
        return null;
    }

    public static File b(c cVar) {
        try {
            if (a() == null || a().f19470c == null || a().f19470c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().f19470c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f19472b.equals(cVar)) {
                    return next.f19471a;
                }
            }
            return null;
        } catch (Throwable th) {
            ad.a("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f19468a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                    ag.a(com.mbridge.msdk.foundation.controller.c.m().c());
                }
                if (f19468a == null) {
                    Log.e("MBridgeDirManager", "mDirectoryManager == null");
                }
                eVar = f19468a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final boolean b() {
        return a(this.f19469b.b());
    }

    public static synchronized void a(b bVar) {
        synchronized (e.class) {
            if (f19468a == null) {
                f19468a = new e(bVar);
            }
        }
    }

    private boolean a(com.mbridge.msdk.foundation.same.b.a aVar) {
        String str;
        com.mbridge.msdk.foundation.same.b.a c8 = aVar.c();
        if (c8 == null) {
            str = aVar.b();
        } else {
            File b8 = b(c8.d());
            if (b8 == null) {
                return false;
            }
            str = b8.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f19470c.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.b.a> a8 = aVar.a();
        if (a8 != null) {
            Iterator<com.mbridge.msdk.foundation.same.b.a> it = a8.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
