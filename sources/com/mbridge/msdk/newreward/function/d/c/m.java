package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class m extends c {

    /* renamed from: c, reason: collision with root package name */
    private final String f21103c;

    public m(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, String str) {
        super(bVar, aVar);
        this.f21103c = str;
        b(true);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.c
    protected final boolean a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 7;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        if (TextUtils.isEmpty(this.f21103c)) {
            return "";
        }
        return this.f21103c;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return new v(a(), b(), this);
    }
}
