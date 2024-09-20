package com.mbridge.msdk.foundation.same.report.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f19792a;

    /* renamed from: b, reason: collision with root package name */
    protected h f19793b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.h f19794c;

    public a(h hVar) {
        Context context;
        this.f19794c = null;
        this.f19793b = hVar;
        Context c8 = c.m().c();
        this.f19792a = c8;
        this.f19794c = com.mbridge.msdk.foundation.db.h.a(c8);
        if (this.f19793b != null && (context = this.f19792a) != null) {
            int l8 = z.l(context);
            this.f19793b.d(l8);
            this.f19793b.c(z.a(this.f19792a, l8));
        }
    }

    public final void a() {
        if (this.f19793b != null) {
            l.a(this.f19794c).a(this.f19793b);
        }
    }

    public final void b(int i8) {
        h hVar = this.f19793b;
        if (hVar != null) {
            hVar.a(i8);
        }
    }

    public final void c(int i8) {
        h hVar = this.f19793b;
        if (hVar != null) {
            hVar.c(i8);
        }
    }

    public final void b(String str) {
        h hVar = this.f19793b;
        if (hVar != null) {
            hVar.b(str);
        }
    }

    public final void a(int i8) {
        h hVar = this.f19793b;
        if (hVar != null) {
            hVar.b(i8);
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19793b.a(str);
    }
}
