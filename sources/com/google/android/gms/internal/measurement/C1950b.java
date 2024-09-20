package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1950b {

    /* renamed from: a, reason: collision with root package name */
    private String f15630a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15631b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15632c;

    public C1950b(String str, long j8, Map map) {
        this.f15630a = str;
        this.f15631b = j8;
        HashMap hashMap = new HashMap();
        this.f15632c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final long a() {
        return this.f15631b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1950b clone() {
        return new C1950b(this.f15630a, this.f15631b, new HashMap(this.f15632c));
    }

    public final Object c(String str) {
        if (this.f15632c.containsKey(str)) {
            return this.f15632c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.f15630a;
    }

    public final Map e() {
        return this.f15632c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1950b)) {
            return false;
        }
        C1950b c1950b = (C1950b) obj;
        if (this.f15631b != c1950b.f15631b || !this.f15630a.equals(c1950b.f15630a)) {
            return false;
        }
        return this.f15632c.equals(c1950b.f15632c);
    }

    public final void f(String str) {
        this.f15630a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.f15632c.remove(str);
        } else {
            this.f15632c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f15630a.hashCode() * 31;
        long j8 = this.f15631b;
        return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f15632c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f15630a + "', timestamp=" + this.f15631b + ", params=" + this.f15632c.toString() + "}";
    }
}
