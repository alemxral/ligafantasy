package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f19449a;

    /* renamed from: b, reason: collision with root package name */
    private String f19450b;

    /* renamed from: c, reason: collision with root package name */
    private a f19451c;

    /* renamed from: d, reason: collision with root package name */
    private c f19452d;

    public final void a(c cVar, String str) {
        a aVar = new a();
        aVar.f19452d = cVar;
        aVar.f19450b = str;
        a(aVar);
    }

    public final String b() {
        return this.f19450b;
    }

    public final a c() {
        return this.f19451c;
    }

    public final c d() {
        return this.f19452d;
    }

    private void a(a aVar) {
        if (this.f19449a == null) {
            this.f19449a = new ArrayList();
        }
        aVar.f19451c = this;
        this.f19449a.add(aVar);
    }

    public final void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final List<a> a() {
        return this.f19449a;
    }

    public final void a(String str) {
        this.f19450b = str;
    }

    public final void a(c cVar) {
        this.f19452d = cVar;
    }
}
