package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;

/* loaded from: classes3.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    final String f16746a;

    /* renamed from: b, reason: collision with root package name */
    final String f16747b;

    /* renamed from: c, reason: collision with root package name */
    final long f16748c;

    /* renamed from: d, reason: collision with root package name */
    final long f16749d;

    /* renamed from: e, reason: collision with root package name */
    final long f16750e;

    /* renamed from: f, reason: collision with root package name */
    final long f16751f;

    /* renamed from: g, reason: collision with root package name */
    final long f16752g;

    /* renamed from: h, reason: collision with root package name */
    final Long f16753h;

    /* renamed from: i, reason: collision with root package name */
    final Long f16754i;

    /* renamed from: j, reason: collision with root package name */
    final Long f16755j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f16756k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(String str, String str2, long j8, long j9, long j10, long j11, long j12, Long l8, Long l9, Long l10, Boolean bool) {
        boolean z8;
        boolean z9;
        boolean z10;
        AbstractC1319p.f(str);
        AbstractC1319p.f(str2);
        if (j8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        if (j9 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1319p.a(z9);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1319p.a(z10);
        AbstractC1319p.a(j12 >= 0);
        this.f16746a = str;
        this.f16747b = str2;
        this.f16748c = j8;
        this.f16749d = j9;
        this.f16750e = j10;
        this.f16751f = j11;
        this.f16752g = j12;
        this.f16753h = l8;
        this.f16754i = l9;
        this.f16755j = l10;
        this.f16756k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r a(Long l8, Long l9, Boolean bool) {
        return new r(this.f16746a, this.f16747b, this.f16748c, this.f16749d, this.f16750e, this.f16751f, this.f16752g, this.f16753h, l8, l9, bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(long j8, long j9) {
        return new r(this.f16746a, this.f16747b, this.f16748c, this.f16749d, this.f16750e, this.f16751f, j8, Long.valueOf(j9), this.f16754i, this.f16755j, this.f16756k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r c(long j8) {
        return new r(this.f16746a, this.f16747b, this.f16748c, this.f16749d, this.f16750e, j8, this.f16752g, this.f16753h, this.f16754i, this.f16755j, this.f16756k);
    }
}
