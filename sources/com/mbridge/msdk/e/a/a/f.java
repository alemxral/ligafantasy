package com.mbridge.msdk.e.a.a;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f18744a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.e.a.i> f18745b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18746c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f18747d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f18748e;

    public f(int i8, List<com.mbridge.msdk.e.a.i> list) {
        this(i8, list, -1, null);
    }

    public final int a() {
        return this.f18744a;
    }

    public final List<com.mbridge.msdk.e.a.i> b() {
        return DesugarCollections.unmodifiableList(this.f18745b);
    }

    public final int c() {
        return this.f18746c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f18747d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f18748e != null) {
            return new ByteArrayInputStream(this.f18748e);
        }
        return null;
    }

    public f(int i8, List<com.mbridge.msdk.e.a.i> list, int i9, InputStream inputStream) {
        this.f18744a = i8;
        this.f18745b = list;
        this.f18746c = i9;
        this.f18747d = inputStream;
        this.f18748e = null;
    }
}
