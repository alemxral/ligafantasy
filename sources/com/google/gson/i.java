package com.google.gson;

import java.util.Set;

/* loaded from: classes3.dex */
public final class i extends f {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.g f17548a = new com.google.gson.internal.g(false);

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof i) || !((i) obj).f17548a.equals(this.f17548a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f17548a.hashCode();
    }

    public void p(String str, f fVar) {
        com.google.gson.internal.g gVar = this.f17548a;
        if (fVar == null) {
            fVar = h.f17547a;
        }
        gVar.put(str, fVar);
    }

    public Set q() {
        return this.f17548a.entrySet();
    }
}
