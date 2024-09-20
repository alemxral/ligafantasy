package com.mbridge.msdk.foundation.same.net.d;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f19614a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19615b;

    public b(String str, String str2) {
        this.f19614a = str;
        this.f19615b = str2;
    }

    public final String a() {
        return this.f19614a;
    }

    public final String b() {
        return this.f19615b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f19614a, bVar.f19614a) && TextUtils.equals(this.f19615b, bVar.f19615b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19614a.hashCode() * 31) + this.f19615b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f19614a + ",value=" + this.f19615b + "]";
    }
}
