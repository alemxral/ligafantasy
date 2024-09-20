package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2028k f15277a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T1 f15278b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(AbstractC2028k abstractC2028k, T1 t12) {
        this.f15277a = abstractC2028k;
        this.f15278b = t12;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        boolean z8 = rVar instanceof C2123w;
        r rVar2 = (r) obj2;
        AbstractC2028k abstractC2028k = this.f15277a;
        T1 t12 = this.f15278b;
        if (z8) {
            if (rVar2 instanceof C2123w) {
                return 0;
            }
            return 1;
        }
        if (rVar2 instanceof C2123w) {
            return -1;
        }
        if (abstractC2028k == null) {
            return rVar.g().compareTo(rVar2.g());
        }
        return (int) AbstractC2110u2.a(abstractC2028k.b(t12, Arrays.asList(rVar, rVar2)).f().doubleValue());
    }
}
