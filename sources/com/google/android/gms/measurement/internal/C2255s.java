package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2255s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f16799a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2260t f16800b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2255s(C2260t c2260t) {
        Bundle bundle;
        this.f16800b = c2260t;
        bundle = c2260t.f16810a;
        this.f16799a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f16799a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16799a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
