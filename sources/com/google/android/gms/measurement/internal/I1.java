package com.google.android.gms.measurement.internal;

import G.a;
import R.AbstractC1319p;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.internal.measurement.Z5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I1 extends AbstractC2258s2 {

    /* renamed from: y, reason: collision with root package name */
    static final Pair f16133y = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f16134c;

    /* renamed from: d, reason: collision with root package name */
    public G1 f16135d;

    /* renamed from: e, reason: collision with root package name */
    public final F1 f16136e;

    /* renamed from: f, reason: collision with root package name */
    public final F1 f16137f;

    /* renamed from: g, reason: collision with root package name */
    public final H1 f16138g;

    /* renamed from: h, reason: collision with root package name */
    private String f16139h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16140i;

    /* renamed from: j, reason: collision with root package name */
    private long f16141j;

    /* renamed from: k, reason: collision with root package name */
    public final F1 f16142k;

    /* renamed from: l, reason: collision with root package name */
    public final D1 f16143l;

    /* renamed from: m, reason: collision with root package name */
    public final H1 f16144m;

    /* renamed from: n, reason: collision with root package name */
    public final D1 f16145n;

    /* renamed from: o, reason: collision with root package name */
    public final F1 f16146o;

    /* renamed from: p, reason: collision with root package name */
    public final F1 f16147p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16148q;

    /* renamed from: r, reason: collision with root package name */
    public final D1 f16149r;

    /* renamed from: s, reason: collision with root package name */
    public final D1 f16150s;

    /* renamed from: t, reason: collision with root package name */
    public final F1 f16151t;

    /* renamed from: u, reason: collision with root package name */
    public final H1 f16152u;

    /* renamed from: v, reason: collision with root package name */
    public final H1 f16153v;

    /* renamed from: w, reason: collision with root package name */
    public final F1 f16154w;

    /* renamed from: x, reason: collision with root package name */
    public final E1 f16155x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I1(Y1 y12) {
        super(y12);
        this.f16142k = new F1(this, "session_timeout", 1800000L);
        this.f16143l = new D1(this, "start_new_session", true);
        this.f16146o = new F1(this, "last_pause_time", 0L);
        this.f16147p = new F1(this, "session_id", 0L);
        this.f16144m = new H1(this, "non_personalized_ads", null);
        this.f16145n = new D1(this, "allow_remote_dynamite", false);
        this.f16136e = new F1(this, "first_open_time", 0L);
        this.f16137f = new F1(this, "app_install_time", 0L);
        this.f16138g = new H1(this, "app_instance_id", null);
        this.f16149r = new D1(this, "app_backgrounded", false);
        this.f16150s = new D1(this, "deep_link_retrieval_complete", false);
        this.f16151t = new F1(this, "deep_link_retrieval_attempts", 0L);
        this.f16152u = new H1(this, "firebase_feature_rollouts", null);
        this.f16153v = new H1(this, "deferred_attribution_cache", null);
        this.f16154w = new F1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f16155x = new E1(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final void i() {
        SharedPreferences sharedPreferences = this.f16764a.c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f16134c = sharedPreferences;
        boolean z8 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f16148q = z8;
        if (!z8) {
            SharedPreferences.Editor edit = this.f16134c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f16764a.z();
        this.f16135d = new G1(this, "health_monitor", Math.max(0L, ((Long) AbstractC2217k1.f16577e.a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences o() {
        h();
        k();
        AbstractC1319p.l(this.f16134c);
        return this.f16134c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair p(String str) {
        h();
        Z5.c();
        if (this.f16764a.z().B(null, AbstractC2217k1.f16553K0) && !q().j(m0.o.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long elapsedRealtime = this.f16764a.a().elapsedRealtime();
        String str2 = this.f16139h;
        if (str2 != null && elapsedRealtime < this.f16141j) {
            return new Pair(str2, Boolean.valueOf(this.f16140i));
        }
        this.f16141j = elapsedRealtime + this.f16764a.z().r(str, AbstractC2217k1.f16573c);
        G.a.b(true);
        try {
            a.C0045a a8 = G.a.a(this.f16764a.c());
            this.f16139h = "";
            String a9 = a8.a();
            if (a9 != null) {
                this.f16139h = a9;
            }
            this.f16140i = a8.b();
        } catch (Exception e8) {
            this.f16764a.d().q().b("Unable to get advertising id", e8);
            this.f16139h = "";
        }
        G.a.b(false);
        return new Pair(this.f16139h, Boolean.valueOf(this.f16140i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m0.p q() {
        h();
        return m0.p.c(o().getString("consent_settings", "G1"), o().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean r() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(boolean z8) {
        h();
        this.f16764a.d().v().b("App measurement setting deferred collection", Boolean.valueOf(z8));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z8);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        SharedPreferences sharedPreferences = this.f16134c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(long j8) {
        if (j8 - this.f16142k.a() > this.f16146o.a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(int i8) {
        return m0.p.k(i8, o().getInt("consent_source", 100));
    }
}
