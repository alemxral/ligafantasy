package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class i implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0377b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0377b c0377b = new DynamiteModule.b.C0377b();
        c0377b.f15214a = aVar.b(context, str);
        int i8 = 1;
        int a8 = aVar.a(context, str, true);
        c0377b.f15215b = a8;
        int i9 = c0377b.f15214a;
        if (i9 == 0) {
            i9 = 0;
            if (a8 == 0) {
                i8 = 0;
                c0377b.f15216c = i8;
                return c0377b;
            }
        }
        if (a8 < i9) {
            i8 = -1;
        }
        c0377b.f15216c = i8;
        return c0377b;
    }
}
