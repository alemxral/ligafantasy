package com.google.firebase.installations;

import b1.AbstractC1854d;
import r0.C3679j;

/* loaded from: classes3.dex */
class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final i f17273a;

    /* renamed from: b, reason: collision with root package name */
    private final C3679j f17274b;

    public e(i iVar, C3679j c3679j) {
        this.f17273a = iVar;
        this.f17274b = c3679j;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(AbstractC1854d abstractC1854d) {
        if (abstractC1854d.k() && !this.f17273a.f(abstractC1854d)) {
            this.f17274b.c(g.a().b(abstractC1854d.b()).d(abstractC1854d.c()).c(abstractC1854d.h()).a());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f17274b.d(exc);
        return true;
    }
}
