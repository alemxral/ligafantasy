package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F5;
import java.util.Map;

/* loaded from: classes3.dex */
final class R1 implements F5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16252a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S1 f16253b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R1(S1 s12, String str) {
        this.f16253b = s12;
        this.f16252a = str;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final String a(String str) {
        Map map;
        map = this.f16253b.f16259d;
        Map map2 = (Map) map.get(this.f16252a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
