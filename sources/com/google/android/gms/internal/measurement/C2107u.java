package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2107u implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f15894a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2115v f15895b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2107u(C2115v c2115v) {
        this.f15895b = c2115v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f15894a;
        str = this.f15895b.f15903a;
        return i8 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i8 = this.f15894a;
        C2115v c2115v = this.f15895b;
        str = c2115v.f15903a;
        if (i8 < str.length()) {
            str2 = c2115v.f15903a;
            this.f15894a = i8 + 1;
            return new C2115v(String.valueOf(str2.charAt(i8)));
        }
        throw new NoSuchElementException();
    }
}
