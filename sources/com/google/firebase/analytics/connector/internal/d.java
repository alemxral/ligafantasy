package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;
import l0.C3162a;
import z0.InterfaceC4011a;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final Set f17178a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4011a.b f17179b;

    /* renamed from: c, reason: collision with root package name */
    private final C3162a f17180c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17181d;

    public d(C3162a c3162a, InterfaceC4011a.b bVar) {
        this.f17179b = bVar;
        this.f17180c = c3162a;
        c cVar = new c(this);
        this.f17181d = cVar;
        c3162a.b(cVar);
        this.f17178a = new HashSet();
    }
}
