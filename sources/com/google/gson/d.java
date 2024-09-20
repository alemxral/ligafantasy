package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d extends f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f17546a = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof d) || !((d) obj).f17546a.equals(this.f17546a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f17546a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f17546a.iterator();
    }

    public void p(f fVar) {
        if (fVar == null) {
            fVar = h.f17547a;
        }
        this.f17546a.add(fVar);
    }
}
