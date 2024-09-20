package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.b;

/* loaded from: classes4.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f18841a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f18842b;

    /* renamed from: c, reason: collision with root package name */
    public final z f18843c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18844d;

    /* loaded from: classes4.dex */
    public interface a {
        void a(z zVar);
    }

    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(T t8);
    }

    private r(T t8, b.a aVar) {
        this.f18844d = false;
        this.f18841a = t8;
        this.f18842b = aVar;
        this.f18843c = null;
    }

    public static <T> r<T> a(T t8, b.a aVar) {
        return new r<>(t8, aVar);
    }

    public static <T> r<T> a(z zVar) {
        return new r<>(zVar);
    }

    public final boolean a() {
        return this.f18843c == null;
    }

    private r(z zVar) {
        this.f18844d = false;
        this.f18841a = null;
        this.f18842b = null;
        this.f18843c = zVar;
    }
}
