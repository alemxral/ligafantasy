package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2099t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f15883a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2115v f15884b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2099t(C2115v c2115v) {
        this.f15884b = c2115v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f15883a;
        str = this.f15884b.f15903a;
        return i8 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i8 = this.f15883a;
        str = this.f15884b.f15903a;
        if (i8 < str.length()) {
            this.f15883a = i8 + 1;
            return new C2115v(String.valueOf(i8));
        }
        throw new NoSuchElementException();
    }
}
