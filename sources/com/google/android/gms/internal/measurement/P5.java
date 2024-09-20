package com.google.android.gms.internal.measurement;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes3.dex */
public final class P5 implements O5 {

    /* renamed from: A, reason: collision with root package name */
    public static final X2 f15476A;

    /* renamed from: B, reason: collision with root package name */
    public static final X2 f15477B;

    /* renamed from: C, reason: collision with root package name */
    public static final X2 f15478C;

    /* renamed from: D, reason: collision with root package name */
    public static final X2 f15479D;

    /* renamed from: E, reason: collision with root package name */
    public static final X2 f15480E;

    /* renamed from: F, reason: collision with root package name */
    public static final X2 f15481F;

    /* renamed from: G, reason: collision with root package name */
    public static final X2 f15482G;

    /* renamed from: H, reason: collision with root package name */
    public static final X2 f15483H;

    /* renamed from: I, reason: collision with root package name */
    public static final X2 f15484I;

    /* renamed from: J, reason: collision with root package name */
    public static final X2 f15485J;

    /* renamed from: K, reason: collision with root package name */
    public static final X2 f15486K;

    /* renamed from: L, reason: collision with root package name */
    public static final X2 f15487L;

    /* renamed from: M, reason: collision with root package name */
    public static final X2 f15488M;

    /* renamed from: N, reason: collision with root package name */
    public static final X2 f15489N;

    /* renamed from: O, reason: collision with root package name */
    public static final X2 f15490O;

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15491a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15492b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15493c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15494d;

    /* renamed from: e, reason: collision with root package name */
    public static final X2 f15495e;

    /* renamed from: f, reason: collision with root package name */
    public static final X2 f15496f;

    /* renamed from: g, reason: collision with root package name */
    public static final X2 f15497g;

    /* renamed from: h, reason: collision with root package name */
    public static final X2 f15498h;

    /* renamed from: i, reason: collision with root package name */
    public static final X2 f15499i;

    /* renamed from: j, reason: collision with root package name */
    public static final X2 f15500j;

    /* renamed from: k, reason: collision with root package name */
    public static final X2 f15501k;

    /* renamed from: l, reason: collision with root package name */
    public static final X2 f15502l;

    /* renamed from: m, reason: collision with root package name */
    public static final X2 f15503m;

    /* renamed from: n, reason: collision with root package name */
    public static final X2 f15504n;

    /* renamed from: o, reason: collision with root package name */
    public static final X2 f15505o;

    /* renamed from: p, reason: collision with root package name */
    public static final X2 f15506p;

    /* renamed from: q, reason: collision with root package name */
    public static final X2 f15507q;

    /* renamed from: r, reason: collision with root package name */
    public static final X2 f15508r;

    /* renamed from: s, reason: collision with root package name */
    public static final X2 f15509s;

    /* renamed from: t, reason: collision with root package name */
    public static final X2 f15510t;

    /* renamed from: u, reason: collision with root package name */
    public static final X2 f15511u;

    /* renamed from: v, reason: collision with root package name */
    public static final X2 f15512v;

    /* renamed from: w, reason: collision with root package name */
    public static final X2 f15513w;

    /* renamed from: x, reason: collision with root package name */
    public static final X2 f15514x;

    /* renamed from: y, reason: collision with root package name */
    public static final X2 f15515y;

    /* renamed from: z, reason: collision with root package name */
    public static final X2 f15516z;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15491a = a8.d("measurement.ad_id_cache_time", WorkRequest.MIN_BACKOFF_MILLIS);
        f15492b = a8.d("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f15493c = a8.d("measurement.max_bundles_per_iteration", 100L);
        f15494d = a8.d("measurement.config.cache_time", 86400000L);
        f15495e = a8.e("measurement.log_tag", "FA");
        f15496f = a8.e("measurement.config.url_authority", "app-measurement.com");
        f15497g = a8.e("measurement.config.url_scheme", "https");
        f15498h = a8.d("measurement.upload.debug_upload_interval", 1000L);
        f15499i = a8.d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f15500j = a8.d("measurement.store.max_stored_events_per_app", 100000L);
        f15501k = a8.d("measurement.experiment.max_ids", 50L);
        f15502l = a8.d("measurement.audience.filter_result_max_count", 200L);
        f15503m = a8.d("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f15504n = a8.d("measurement.alarm_manager.minimum_interval", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        f15505o = a8.d("measurement.upload.minimum_delay", 500L);
        f15506p = a8.d("measurement.monitoring.sample_period_millis", 86400000L);
        f15507q = a8.d("measurement.upload.realtime_upload_interval", WorkRequest.MIN_BACKOFF_MILLIS);
        f15508r = a8.d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f15509s = a8.d("measurement.config.cache_time.service", 3600000L);
        f15510t = a8.d("measurement.service_client.idle_disconnect_millis", 5000L);
        f15511u = a8.e("measurement.log_tag.service", "FA-SVC");
        f15512v = a8.d("measurement.upload.stale_data_deletion_interval", 86400000L);
        f15513w = a8.d("measurement.sdk.attribution.cache.ttl", 604800000L);
        f15514x = a8.d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f15515y = a8.d("measurement.upload.backoff_period", 43200000L);
        f15516z = a8.d("measurement.upload.initial_upload_delay_time", 15000L);
        f15476A = a8.d("measurement.upload.interval", 3600000L);
        f15477B = a8.d("measurement.upload.max_bundle_size", 65536L);
        f15478C = a8.d("measurement.upload.max_bundles", 100L);
        f15479D = a8.d("measurement.upload.max_conversions_per_day", 500L);
        f15480E = a8.d("measurement.upload.max_error_events_per_day", 1000L);
        f15481F = a8.d("measurement.upload.max_events_per_bundle", 1000L);
        f15482G = a8.d("measurement.upload.max_events_per_day", 100000L);
        f15483H = a8.d("measurement.upload.max_public_events_per_day", 50000L);
        f15484I = a8.d("measurement.upload.max_queue_time", 2419200000L);
        f15485J = a8.d("measurement.upload.max_realtime_events_per_day", 10L);
        f15486K = a8.d("measurement.upload.max_batch_size", 65536L);
        f15487L = a8.d("measurement.upload.retry_count", 6L);
        f15488M = a8.d("measurement.upload.retry_time", 1800000L);
        f15489N = a8.e("measurement.upload.url", "https://app-measurement.com/a");
        f15490O = a8.d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final String A() {
        return (String) f15496f.b();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long B() {
        return ((Long) f15482G.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long C() {
        return ((Long) f15516z.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long D() {
        return ((Long) f15506p.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final String E() {
        return (String) f15497g.b();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long F() {
        return ((Long) f15476A.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long G() {
        return ((Long) f15483H.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long H() {
        return ((Long) f15488M.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long I() {
        return ((Long) f15514x.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long J() {
        return ((Long) f15490O.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long K() {
        return ((Long) f15481F.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long L() {
        return ((Long) f15515y.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long a() {
        return ((Long) f15491a.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long b() {
        return ((Long) f15492b.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long c() {
        return ((Long) f15493c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long d() {
        return ((Long) f15494d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long e() {
        return ((Long) f15498h.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long f() {
        return ((Long) f15501k.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long g() {
        return ((Long) f15502l.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long h() {
        return ((Long) f15500j.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long i() {
        return ((Long) f15505o.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long j() {
        return ((Long) f15503m.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long k() {
        return ((Long) f15504n.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long l() {
        return ((Long) f15510t.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long m() {
        return ((Long) f15486K.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long n() {
        return ((Long) f15479D.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long o() {
        return ((Long) f15512v.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long p() {
        return ((Long) f15480E.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long q() {
        return ((Long) f15487L.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long r() {
        return ((Long) f15513w.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long s() {
        return ((Long) f15507q.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final String t() {
        return (String) f15489N.b();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long u() {
        return ((Long) f15477B.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long v() {
        return ((Long) f15499i.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long w() {
        return ((Long) f15484I.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long x() {
        return ((Long) f15508r.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long y() {
        return ((Long) f15485J.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long z() {
        return ((Long) f15478C.b()).longValue();
    }
}
