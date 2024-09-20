package com.mbridge.msdk.dycreator.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f18292a;

    /* renamed from: b, reason: collision with root package name */
    private String f18293b;

    public a(b bVar) {
        if (bVar != null) {
            this.f18292a = bVar.a();
            this.f18293b = bVar.b();
        }
    }

    public final String toString() {
        return "DyError{errorCode=" + this.f18292a + '}';
    }

    public a(int i8, String str) {
        this.f18292a = i8;
        this.f18293b = str;
    }
}
