package com.google.gson;

import j$.util.Objects;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Field f17537a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f17537a = field;
    }

    public String toString() {
        return this.f17537a.toString();
    }
}
