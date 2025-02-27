package com.mbridge.msdk.foundation.same.net.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f19567a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f19568b;

    /* renamed from: c, reason: collision with root package name */
    private CronetEngine.Builder f19569c;

    /* renamed from: d, reason: collision with root package name */
    private CronetEngine f19570d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.foundation.same.net.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0403a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f19571a = new a();
    }

    public static a a() {
        return C0403a.f19571a;
    }

    private CronetEngine.Builder d() {
        if (this.f19569c == null) {
            this.f19569c = new CronetEngine.Builder(com.mbridge.msdk.foundation.controller.c.m().c());
            this.f19569c.setStoragePath(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER)).enableHttpCache(2, 5242880L).enableHttp2(true).enableQuic(true);
        }
        return this.f19569c;
    }

    public final ExecutorService b() {
        return this.f19567a;
    }

    public final CronetEngine c() {
        if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return null;
        }
        CronetEngine cronetEngine = this.f19570d;
        if (cronetEngine != null) {
            return cronetEngine;
        }
        if (this.f19569c == null) {
            this.f19569c = d();
        }
        CronetEngine build = this.f19569c.build();
        this.f19570d = build;
        return build;
    }

    private a() {
        this.f19567a = Executors.newCachedThreadPool();
        this.f19568b = new ArrayList<>();
        if (this.f19569c == null) {
            this.f19569c = d();
        }
        this.f19570d = this.f19569c.build();
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f19568b.contains(str)) {
                return;
            }
            this.f19568b.add(str);
            if (this.f19569c == null) {
                this.f19569c = d();
            }
            CronetEngine.Builder builder = this.f19569c;
            if (builder != null) {
                builder.addQuicHint(str, 443, 443);
            }
        } catch (Throwable th) {
            ad.b("CronetEngineManager", th.getMessage());
        }
    }
}
