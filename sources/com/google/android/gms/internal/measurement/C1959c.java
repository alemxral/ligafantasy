package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1959c {

    /* renamed from: a, reason: collision with root package name */
    private C1950b f15654a;

    /* renamed from: b, reason: collision with root package name */
    private C1950b f15655b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15656c;

    public C1959c() {
        this.f15654a = new C1950b("", 0L, null);
        this.f15655b = new C1950b("", 0L, null);
        this.f15656c = new ArrayList();
    }

    public final C1950b a() {
        return this.f15654a;
    }

    public final C1950b b() {
        return this.f15655b;
    }

    public final List c() {
        return this.f15656c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1959c c1959c = new C1959c(this.f15654a.clone());
        Iterator it = this.f15656c.iterator();
        while (it.hasNext()) {
            c1959c.f15656c.add(((C1950b) it.next()).clone());
        }
        return c1959c;
    }

    public final void d(C1950b c1950b) {
        this.f15654a = c1950b;
        this.f15655b = c1950b.clone();
        this.f15656c.clear();
    }

    public final void e(String str, long j8, Map map) {
        this.f15656c.add(new C1950b(str, j8, map));
    }

    public final void f(C1950b c1950b) {
        this.f15655b = c1950b;
    }

    public C1959c(C1950b c1950b) {
        this.f15654a = c1950b;
        this.f15655b = c1950b.clone();
        this.f15656c = new ArrayList();
    }
}
