package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.l;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import p1.C3596a;
import p1.c;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    final Gson f17622a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeToken f17623b;

    /* renamed from: c, reason: collision with root package name */
    private final r f17624c;

    /* renamed from: d, reason: collision with root package name */
    private final b f17625d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17626e;

    /* renamed from: f, reason: collision with root package name */
    private volatile TypeAdapter f17627f;

    /* loaded from: classes3.dex */
    private static final class SingleTypeFactory implements r {

        /* renamed from: a, reason: collision with root package name */
        private final TypeToken f17628a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17629b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f17630c;

        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            boolean isAssignableFrom;
            TypeToken typeToken2 = this.f17628a;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.f17629b || this.f17628a.d() != typeToken.c())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.f17630c.isAssignableFrom(typeToken.c());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(null, null, gson, typeToken, this);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    private final class b {
        private b() {
        }
    }

    public TreeTypeAdapter(l lVar, e eVar, Gson gson, TypeToken typeToken, r rVar, boolean z8) {
        this.f17625d = new b();
        this.f17622a = gson;
        this.f17623b = typeToken;
        this.f17624c = rVar;
        this.f17626e = z8;
    }

    private TypeAdapter f() {
        TypeAdapter typeAdapter = this.f17627f;
        if (typeAdapter == null) {
            TypeAdapter m8 = this.f17622a.m(this.f17624c, this.f17623b);
            this.f17627f = m8;
            return m8;
        }
        return typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C3596a c3596a) {
        return f().b(c3596a);
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        f().d(cVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter e() {
        return f();
    }

    public TreeTypeAdapter(l lVar, e eVar, Gson gson, TypeToken typeToken, r rVar) {
        this(lVar, eVar, gson, typeToken, rVar, true);
    }
}
