package com.google.android.gms.common.api.internal;

import P.g;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f15141a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f15142b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, BasePendingResult basePendingResult) {
        this.f15142b = gVar;
        this.f15141a = basePendingResult;
    }

    @Override // P.g.a
    public final void a(Status status) {
        Map map;
        map = this.f15142b.f15145a;
        map.remove(this.f15141a);
    }
}
