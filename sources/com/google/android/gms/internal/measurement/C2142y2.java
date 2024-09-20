package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2142y2 extends U2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15950a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2016i3 f15951b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2142y2(Context context, InterfaceC2016i3 interfaceC2016i3) {
        this.f15950a = context;
        this.f15951b = interfaceC2016i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.U2
    public final Context a() {
        return this.f15950a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.U2
    public final InterfaceC2016i3 b() {
        return this.f15951b;
    }

    public final boolean equals(Object obj) {
        InterfaceC2016i3 interfaceC2016i3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof U2) {
            U2 u22 = (U2) obj;
            if (this.f15950a.equals(u22.a()) && ((interfaceC2016i3 = this.f15951b) != null ? interfaceC2016i3.equals(u22.b()) : u22.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f15950a.hashCode() ^ 1000003;
        InterfaceC2016i3 interfaceC2016i3 = this.f15951b;
        if (interfaceC2016i3 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC2016i3.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f15950a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f15951b) + "}";
    }
}
