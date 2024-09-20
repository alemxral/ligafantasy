package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p1.C3596a;
import p1.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f17632a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f17633b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f17634c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f17632a = gson;
        this.f17633b = typeAdapter;
        this.f17634c = type;
    }

    private static Type e(Type type, Object obj) {
        if (obj != null) {
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    private static boolean f(TypeAdapter typeAdapter) {
        TypeAdapter e8;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (e8 = ((SerializationDelegatingTypeAdapter) typeAdapter).e()) != typeAdapter) {
            typeAdapter = e8;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C3596a c3596a) {
        return this.f17633b.b(c3596a);
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        TypeAdapter typeAdapter = this.f17633b;
        Type e8 = e(this.f17634c, obj);
        if (e8 != this.f17634c) {
            typeAdapter = this.f17632a.k(TypeToken.b(e8));
            if ((typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !f(this.f17633b)) {
                typeAdapter = this.f17633b;
            }
        }
        typeAdapter.d(cVar, obj);
    }
}
