package com.mbridge.msdk.foundation.same.net.f;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f19639a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.foundation.same.net.d.b> f19640b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19641c;

    public b(int i8, List<com.mbridge.msdk.foundation.same.net.d.b> list, InputStream inputStream) {
        this.f19641c = i8;
        this.f19640b = list;
        this.f19639a = inputStream;
    }

    public final InputStream a() {
        return this.f19639a;
    }

    public final List<com.mbridge.msdk.foundation.same.net.d.b> b() {
        return DesugarCollections.unmodifiableList(this.f19640b);
    }

    public final int c() {
        return this.f19641c;
    }
}
