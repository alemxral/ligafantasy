package com.google.android.gms.measurement.internal;

import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.B6;
import com.google.android.gms.internal.measurement.C1949a7;
import com.google.android.gms.internal.measurement.C1966c6;
import com.google.android.gms.internal.measurement.C1976d7;
import com.google.android.gms.internal.measurement.C2002g6;
import com.google.android.gms.internal.measurement.C2027j6;
import com.google.android.gms.internal.measurement.C2051m6;
import com.google.android.gms.internal.measurement.C2075p6;
import com.google.android.gms.internal.measurement.C2098s6;
import com.google.android.gms.internal.measurement.C2122v6;
import com.google.android.gms.internal.measurement.C2146y6;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.H5;
import com.google.android.gms.internal.measurement.I6;
import com.google.android.gms.internal.measurement.K5;
import com.google.android.gms.internal.measurement.L6;
import com.google.android.gms.internal.measurement.N5;
import com.google.android.gms.internal.measurement.O6;
import com.google.android.gms.internal.measurement.Q5;
import com.google.android.gms.internal.measurement.R6;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.U6;
import com.google.android.gms.internal.measurement.W5;
import com.google.android.gms.internal.measurement.X6;
import com.google.android.gms.internal.measurement.Z5;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.w7;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.k1 */
/* loaded from: classes3.dex */
public abstract class AbstractC2217k1 {

    /* renamed from: A */
    public static final C2211j1 f16532A;

    /* renamed from: A0 */
    public static final C2211j1 f16533A0;

    /* renamed from: B */
    public static final C2211j1 f16534B;

    /* renamed from: B0 */
    public static final C2211j1 f16535B0;

    /* renamed from: C */
    public static final C2211j1 f16536C;

    /* renamed from: C0 */
    public static final C2211j1 f16537C0;

    /* renamed from: D */
    public static final C2211j1 f16538D;

    /* renamed from: D0 */
    public static final C2211j1 f16539D0;

    /* renamed from: E */
    public static final C2211j1 f16540E;

    /* renamed from: E0 */
    public static final C2211j1 f16541E0;

    /* renamed from: F */
    public static final C2211j1 f16542F;

    /* renamed from: F0 */
    public static final C2211j1 f16543F0;

    /* renamed from: G */
    public static final C2211j1 f16544G;

    /* renamed from: G0 */
    public static final C2211j1 f16545G0;

    /* renamed from: H */
    public static final C2211j1 f16546H;

    /* renamed from: H0 */
    public static final C2211j1 f16547H0;

    /* renamed from: I */
    public static final C2211j1 f16548I;

    /* renamed from: I0 */
    public static final C2211j1 f16549I0;

    /* renamed from: J */
    public static final C2211j1 f16550J;

    /* renamed from: J0 */
    public static final C2211j1 f16551J0;

    /* renamed from: K */
    public static final C2211j1 f16552K;

    /* renamed from: K0 */
    public static final C2211j1 f16553K0;

    /* renamed from: L */
    public static final C2211j1 f16554L;

    /* renamed from: M */
    public static final C2211j1 f16555M;

    /* renamed from: N */
    public static final C2211j1 f16556N;

    /* renamed from: O */
    public static final C2211j1 f16557O;

    /* renamed from: P */
    public static final C2211j1 f16558P;

    /* renamed from: Q */
    public static final C2211j1 f16559Q;

    /* renamed from: R */
    public static final C2211j1 f16560R;

    /* renamed from: S */
    public static final C2211j1 f16561S;

    /* renamed from: T */
    public static final C2211j1 f16562T;

    /* renamed from: U */
    public static final C2211j1 f16563U;

    /* renamed from: V */
    public static final C2211j1 f16564V;

    /* renamed from: W */
    public static final C2211j1 f16565W;

    /* renamed from: X */
    public static final C2211j1 f16566X;

    /* renamed from: Y */
    public static final C2211j1 f16567Y;

    /* renamed from: Z */
    public static final C2211j1 f16568Z;

    /* renamed from: a0 */
    public static final C2211j1 f16570a0;

    /* renamed from: b0 */
    public static final C2211j1 f16572b0;

    /* renamed from: c */
    public static final C2211j1 f16573c;

    /* renamed from: c0 */
    public static final C2211j1 f16574c0;

    /* renamed from: d */
    public static final C2211j1 f16575d;

    /* renamed from: d0 */
    public static final C2211j1 f16576d0;

    /* renamed from: e */
    public static final C2211j1 f16577e;

    /* renamed from: e0 */
    public static final C2211j1 f16578e0;

    /* renamed from: f */
    public static final C2211j1 f16579f;

    /* renamed from: f0 */
    public static final C2211j1 f16580f0;

    /* renamed from: g */
    public static final C2211j1 f16581g;

    /* renamed from: g0 */
    public static final C2211j1 f16582g0;

    /* renamed from: h */
    public static final C2211j1 f16583h;

    /* renamed from: h0 */
    public static final C2211j1 f16584h0;

    /* renamed from: i */
    public static final C2211j1 f16585i;

    /* renamed from: i0 */
    public static final C2211j1 f16586i0;

    /* renamed from: j */
    public static final C2211j1 f16587j;

    /* renamed from: j0 */
    public static final C2211j1 f16588j0;

    /* renamed from: k */
    public static final C2211j1 f16589k;

    /* renamed from: k0 */
    public static final C2211j1 f16590k0;

    /* renamed from: l */
    public static final C2211j1 f16591l;

    /* renamed from: l0 */
    public static final C2211j1 f16592l0;

    /* renamed from: m */
    public static final C2211j1 f16593m;

    /* renamed from: m0 */
    public static final C2211j1 f16594m0;

    /* renamed from: n */
    public static final C2211j1 f16595n;

    /* renamed from: n0 */
    public static final C2211j1 f16596n0;

    /* renamed from: o */
    public static final C2211j1 f16597o;

    /* renamed from: o0 */
    public static final C2211j1 f16598o0;

    /* renamed from: p */
    public static final C2211j1 f16599p;

    /* renamed from: p0 */
    public static final C2211j1 f16600p0;

    /* renamed from: q */
    public static final C2211j1 f16601q;

    /* renamed from: q0 */
    public static final C2211j1 f16602q0;

    /* renamed from: r */
    public static final C2211j1 f16603r;

    /* renamed from: r0 */
    public static final C2211j1 f16604r0;

    /* renamed from: s */
    public static final C2211j1 f16605s;

    /* renamed from: s0 */
    public static final C2211j1 f16606s0;

    /* renamed from: t */
    public static final C2211j1 f16607t;

    /* renamed from: t0 */
    public static final C2211j1 f16608t0;

    /* renamed from: u */
    public static final C2211j1 f16609u;

    /* renamed from: u0 */
    public static final C2211j1 f16610u0;

    /* renamed from: v */
    public static final C2211j1 f16611v;

    /* renamed from: v0 */
    public static final C2211j1 f16612v0;

    /* renamed from: w */
    public static final C2211j1 f16613w;

    /* renamed from: w0 */
    public static final C2211j1 f16614w0;

    /* renamed from: x */
    public static final C2211j1 f16615x;

    /* renamed from: x0 */
    public static final C2211j1 f16616x0;

    /* renamed from: y */
    public static final C2211j1 f16617y;

    /* renamed from: y0 */
    public static final C2211j1 f16618y0;

    /* renamed from: z */
    public static final C2211j1 f16619z;

    /* renamed from: z0 */
    public static final C2211j1 f16620z0;

    /* renamed from: a */
    private static final List f16569a = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Set f16571b = DesugarCollections.synchronizedSet(new HashSet());

    static {
        Long valueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        f16573c = a("measurement.ad_id_cache_time", valueOf, valueOf, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.I
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.p());
            }
        });
        f16575d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.z
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.q());
            }
        });
        f16577e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.M
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.B());
            }
        });
        f16579f = a("measurement.config.cache_time", 86400000L, 3600000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.Z
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.s());
            }
        });
        f16581g = a("measurement.config.url_scheme", "https", "https", new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.m0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return N5.n();
            }
        });
        f16583h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return N5.m();
            }
        });
        f16585i = a("measurement.upload.max_bundles", 100, 100, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.L0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.M());
            }
        });
        f16587j = a("measurement.upload.max_batch_size", 65536, 65536, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.X0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.h());
            }
        });
        f16589k = a("measurement.upload.max_bundle_size", 65536, 65536, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.L());
            }
        });
        f16591l = a("measurement.upload.max_events_per_bundle", 1000, 1000, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.c());
            }
        });
        f16593m = a("measurement.upload.max_events_per_day", 100000, 100000, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.U
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.d());
            }
        });
        f16595n = a("measurement.upload.max_error_events_per_day", 1000, 1000, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.b());
            }
        });
        Integer valueOf2 = Integer.valueOf(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS);
        f16597o = a("measurement.upload.max_public_events_per_day", valueOf2, valueOf2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.e());
            }
        });
        f16599p = a("measurement.upload.max_conversions_per_day", 10000, 10000, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.C0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.N());
            }
        });
        f16601q = a("measurement.upload.max_realtime_events_per_day", 10, 10, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.O0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.g());
            }
        });
        f16603r = a("measurement.store.max_stored_events_per_app", 100000, 100000, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.Z0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.v());
            }
        });
        f16605s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return N5.o();
            }
        });
        f16607t = a("measurement.upload.backoff_period", 43200000L, 43200000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.I());
            }
        });
        f16609u = a("measurement.upload.window_interval", 3600000L, 3600000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.x
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.k());
            }
        });
        f16611v = a("measurement.upload.interval", 3600000L, 3600000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.y
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.K());
            }
        });
        f16613w = a("measurement.upload.realtime_upload_interval", valueOf, valueOf, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.B
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.C());
            }
        });
        f16615x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.C
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.t());
            }
        });
        f16617y = a("measurement.upload.minimum_delay", 500L, 500L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.D
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.A());
            }
        });
        Long valueOf3 = Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        f16619z = a("measurement.alarm_manager.minimum_interval", valueOf3, valueOf3, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.E
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.z());
            }
        });
        f16532A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.F
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.F());
            }
        });
        f16534B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.G
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.D());
            }
        });
        f16536C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.H
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.J());
            }
        });
        f16538D = a("measurement.upload.retry_time", 1800000L, 1800000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.J
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.j());
            }
        });
        f16540E = a("measurement.upload.retry_count", 6, 6, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.K
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.i());
            }
        });
        f16542F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.L
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.f());
            }
        });
        f16544G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.N
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.u());
            }
        });
        f16546H = a("measurement.audience.filter_result_max_count", 200, 200, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.O
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.x());
            }
        });
        f16548I = a("measurement.upload.max_public_user_properties", 25, 25, null);
        f16550J = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        f16552K = a("measurement.upload.max_public_event_params", 25, 25, null);
        f16554L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.P
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.E());
            }
        });
        Boolean bool = Boolean.FALSE;
        f16555M = a("measurement.test.boolean_flag", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.Q
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(I6.g());
            }
        });
        f16556N = a("measurement.test.string_flag", "---", "---", new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.S
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return I6.f();
            }
        });
        f16557O = a("measurement.test.long_flag", -1L, -1L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.T
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(I6.d());
            }
        });
        f16558P = a("measurement.test.int_flag", -2, -2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.V
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) I6.c());
            }
        });
        Double valueOf4 = Double.valueOf(-3.0d);
        f16559Q = a("measurement.test.double_flag", valueOf4, valueOf4, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.W
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Double.valueOf(I6.b());
            }
        });
        f16560R = a("measurement.experiment.max_ids", 50, 50, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.X
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.w());
            }
        });
        f16561S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.Y
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.y());
            }
        });
        f16562T = a("measurement.max_bundles_per_iteration", 100, 100, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.a0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) N5.r());
            }
        });
        f16563U = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.b0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.G());
            }
        });
        f16564V = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Long.valueOf(N5.H());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f16565W = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(L6.c());
            }
        });
        f16566X = a("measurement.quality.checksum", bool, bool, null);
        f16567Y = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C1966c6.e());
            }
        });
        f16568Z = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C1966c6.d());
            }
        });
        f16570a0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.i0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C1966c6.f());
            }
        });
        f16572b0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(t7.c());
            }
        });
        f16574c0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C2146y6.c());
            }
        });
        f16576d0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(B6.c());
            }
        });
        f16578e0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(q7.d());
            }
        });
        f16580f0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(w7.c());
            }
        });
        f16582g0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(W5.d());
            }
        });
        f16584h0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C2051m6.d());
            }
        });
        f16586i0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(n7.c());
            }
        });
        f16588j0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Integer.valueOf((int) Q5.b());
            }
        });
        f16590k0 = a("measurement.client.click_identifier_control.dev", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(H5.c());
            }
        });
        f16592l0 = a("measurement.service.click_identifier_control", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(K5.c());
            }
        });
        f16594m0 = a("measurement.service.store_null_safelist", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(T5.d());
            }
        });
        f16596n0 = a("measurement.service.store_safelist", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(T5.e());
            }
        });
        f16598o0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.z0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C1949a7.e());
            }
        });
        f16600p0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.A0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C1949a7.d());
            }
        });
        f16602q0 = a("measurement.session_stitching_token_enabled", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.B0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C1949a7.f());
            }
        });
        f16604r0 = a("measurement.sgtm.client.dev", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.E0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(k7.d());
            }
        });
        f16606s0 = a("measurement.sgtm.service", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.F0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(k7.e());
            }
        });
        f16608t0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.G0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(R6.c());
            }
        });
        f16610u0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.H0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(R6.d());
            }
        });
        f16612v0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.I0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C2075p6.d());
            }
        });
        f16614w0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.J0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(X6.d());
            }
        });
        f16616x0 = a("measurement.sfmc.client", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.K0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(h7.d());
            }
        });
        f16618y0 = a("measurement.sfmc.service", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.M0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(h7.e());
            }
        });
        f16620z0 = a("measurement.gmscore_feature_tracking", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.N0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C2098s6.d());
            }
        });
        f16533A0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.P0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C2027j6.d());
            }
        });
        f16535B0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.Q0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C2122v6.d());
            }
        });
        f16537C0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.R0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C2122v6.e());
            }
        });
        f16539D0 = a("measurement.remove_app_background.client", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.S0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(U6.d());
            }
        });
        f16541E0 = a("measurement.rb.attribution.service", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.T0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(O6.c());
            }
        });
        f16543F0 = a("measurement.collection.client.log_target_api_version", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.U0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                return Boolean.valueOf(E6.d());
            }
        });
        f16545G0 = a("measurement.collection.service.log_target_api_version", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.V0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                return Boolean.valueOf(E6.e());
            }
        });
        f16547H0 = a("measurement.client.deep_link_referrer_fix", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.W0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                return Boolean.valueOf(C2002g6.d());
            }
        });
        f16549I0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.Y0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                return Boolean.valueOf(C1976d7.c());
            }
        });
        f16551J0 = a("measurement.link_sst_to_sid", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                C2211j1 c2211j1 = AbstractC2217k1.f16573c;
                return Boolean.valueOf(C1949a7.g());
            }
        });
        f16553K0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, new InterfaceC2199h1() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2199h1
            public final Object a() {
                return Boolean.valueOf(Z5.d());
            }
        });
    }

    static C2211j1 a(String str, Object obj, Object obj2, InterfaceC2199h1 interfaceC2199h1) {
        C2211j1 c2211j1 = new C2211j1(str, obj, obj2, interfaceC2199h1, null);
        f16569a.add(c2211j1);
        return c2211j1;
    }
}
