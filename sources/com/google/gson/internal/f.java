package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f17728a;

    public f(String str) {
        this.f17728a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f17728a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f17728a;
        String str2 = ((f) obj).f17728a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f17728a);
    }

    public int hashCode() {
        return this.f17728a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f17728a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f17728a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f17728a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f17728a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f17728a).longValue();
        }
    }

    public String toString() {
        return this.f17728a;
    }
}
