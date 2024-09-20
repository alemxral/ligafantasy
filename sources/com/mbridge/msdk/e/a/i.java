package com.mbridge.msdk.e.a;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f18793a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18794b;

    public i(String str, String str2) {
        this.f18793a = str;
        this.f18794b = str2;
    }

    public final String a() {
        return this.f18793a;
    }

    public final String b() {
        return this.f18794b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (TextUtils.equals(this.f18793a, iVar.f18793a) && TextUtils.equals(this.f18794b, iVar.f18794b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18793a.hashCode() * 31) + this.f18794b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f18793a + ",value=" + this.f18794b + "]";
    }
}
