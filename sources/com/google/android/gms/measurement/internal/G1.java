package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes3.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    final String f16101a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16102b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16103c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16104d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I1 f16105e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ G1(I1 i12, String str, long j8, m0.g gVar) {
        boolean z8;
        this.f16105e = i12;
        AbstractC1319p.f("health_monitor");
        if (j8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        this.f16101a = "health_monitor:start";
        this.f16102b = "health_monitor:count";
        this.f16103c = "health_monitor:value";
        this.f16104d = j8;
    }

    private final long c() {
        return this.f16105e.o().getLong(this.f16101a, 0L);
    }

    private final void d() {
        this.f16105e.h();
        long currentTimeMillis = this.f16105e.f16764a.a().currentTimeMillis();
        SharedPreferences.Editor edit = this.f16105e.o().edit();
        edit.remove(this.f16102b);
        edit.remove(this.f16103c);
        edit.putLong(this.f16101a, currentTimeMillis);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.f16105e.h();
        this.f16105e.h();
        long c8 = c();
        if (c8 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c8 - this.f16105e.f16764a.a().currentTimeMillis());
        }
        long j8 = this.f16104d;
        if (abs < j8) {
            return null;
        }
        if (abs > j8 + j8) {
            d();
            return null;
        }
        String string = this.f16105e.o().getString(this.f16103c, null);
        long j9 = this.f16105e.o().getLong(this.f16102b, 0L);
        d();
        if (string != null && j9 > 0) {
            return new Pair(string, Long.valueOf(j9));
        }
        return I1.f16133y;
    }

    public final void b(String str, long j8) {
        this.f16105e.h();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.f16105e.o().getLong(this.f16102b, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor edit = this.f16105e.o().edit();
            edit.putString(this.f16103c, str);
            edit.putLong(this.f16102b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f16105e.f16764a.N().u().nextLong() & Long.MAX_VALUE;
        long j10 = j9 + 1;
        long j11 = Long.MAX_VALUE / j10;
        SharedPreferences.Editor edit2 = this.f16105e.o().edit();
        if (nextLong < j11) {
            edit2.putString(this.f16103c, str);
        }
        edit2.putLong(this.f16102b, j10);
        edit2.apply();
    }
}
