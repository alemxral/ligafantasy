package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.app.Activity;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2219k3 extends A1 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C2177d3 f16624c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C2177d3 f16625d;

    /* renamed from: e, reason: collision with root package name */
    protected C2177d3 f16626e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f16627f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f16628g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f16629h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C2177d3 f16630i;

    /* renamed from: j, reason: collision with root package name */
    private C2177d3 f16631j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16632k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f16633l;

    public C2219k3(Y1 y12) {
        super(y12);
        this.f16633l = new Object();
        this.f16627f = new ConcurrentHashMap();
    }

    private final C2177d3 F(Activity activity) {
        AbstractC1319p.l(activity);
        C2177d3 c2177d3 = (C2177d3) this.f16627f.get(activity);
        if (c2177d3 == null) {
            C2177d3 c2177d32 = new C2177d3(null, t(activity.getClass(), "Activity"), this.f16764a.N().t0());
            this.f16627f.put(activity, c2177d32);
            c2177d3 = c2177d32;
        }
        if (this.f16630i != null) {
            return this.f16630i;
        }
        return c2177d3;
    }

    private final void G(Activity activity, C2177d3 c2177d3, boolean z8) {
        C2177d3 c2177d32;
        C2177d3 c2177d33;
        String str;
        if (this.f16624c == null) {
            c2177d32 = this.f16625d;
        } else {
            c2177d32 = this.f16624c;
        }
        C2177d3 c2177d34 = c2177d32;
        if (c2177d3.f16451b == null) {
            if (activity != null) {
                str = t(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            c2177d33 = new C2177d3(c2177d3.f16450a, str, c2177d3.f16452c, c2177d3.f16454e, c2177d3.f16455f);
        } else {
            c2177d33 = c2177d3;
        }
        this.f16625d = this.f16624c;
        this.f16624c = c2177d33;
        this.f16764a.f().z(new RunnableC2189f3(this, c2177d33, c2177d34, this.f16764a.a().elapsedRealtime(), z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C2177d3 c2177d3, C2177d3 c2177d32, long j8, boolean z8, Bundle bundle) {
        boolean z9;
        Bundle bundle2;
        String str;
        long j9;
        long j10;
        h();
        boolean z10 = false;
        if (c2177d32 == null || c2177d32.f16452c != c2177d3.f16452c || !m0.x.a(c2177d32.f16451b, c2177d3.f16451b) || !m0.x.a(c2177d32.f16450a, c2177d3.f16450a)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && this.f16626e != null) {
            z10 = true;
        }
        if (z9) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            y4.y(c2177d3, bundle3, true);
            if (c2177d32 != null) {
                String str2 = c2177d32.f16450a;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = c2177d32.f16451b;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", c2177d32.f16452c);
            }
            if (z10) {
                Y3 y32 = this.f16764a.M().f16412f;
                long j11 = j8 - y32.f16383b;
                y32.f16383b = j8;
                if (j11 > 0) {
                    this.f16764a.N().w(bundle3, j11);
                }
            }
            if (!this.f16764a.z().D()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != c2177d3.f16454e) {
                str = "auto";
            } else {
                str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            }
            String str4 = str;
            long currentTimeMillis = this.f16764a.a().currentTimeMillis();
            if (c2177d3.f16454e) {
                j9 = currentTimeMillis;
                long j12 = c2177d3.f16455f;
                if (j12 != 0) {
                    j10 = j12;
                    this.f16764a.I().v(str4, "_vs", j10, bundle3);
                }
            } else {
                j9 = currentTimeMillis;
            }
            j10 = j9;
            this.f16764a.I().v(str4, "_vs", j10, bundle3);
        }
        if (z10) {
            p(this.f16626e, true, j8);
        }
        this.f16626e = c2177d3;
        if (c2177d3.f16454e) {
            this.f16631j = c2177d3;
        }
        this.f16764a.L().u(c2177d3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(C2177d3 c2177d3, boolean z8, long j8) {
        boolean z9;
        this.f16764a.y().n(this.f16764a.a().elapsedRealtime());
        if (c2177d3 != null && c2177d3.f16453d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f16764a.M().f16412f.d(z9, z8, j8) && c2177d3 != null) {
            c2177d3.f16453d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void w(C2219k3 c2219k3, Bundle bundle, C2177d3 c2177d3, C2177d3 c2177d32, long j8) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c2219k3.o(c2177d3, c2177d32, j8, true, c2219k3.f16764a.N().x0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.f16633l) {
            this.f16632k = false;
            this.f16629h = true;
        }
        long elapsedRealtime = this.f16764a.a().elapsedRealtime();
        if (!this.f16764a.z().D()) {
            this.f16624c = null;
            this.f16764a.f().z(new RunnableC2201h3(this, elapsedRealtime));
        } else {
            C2177d3 F8 = F(activity);
            this.f16625d = this.f16624c;
            this.f16624c = null;
            this.f16764a.f().z(new RunnableC2207i3(this, F8, elapsedRealtime));
        }
    }

    public final void B(Activity activity) {
        synchronized (this.f16633l) {
            this.f16632k = true;
            if (activity != this.f16628g) {
                synchronized (this.f16633l) {
                    this.f16628g = activity;
                    this.f16629h = false;
                }
                if (this.f16764a.z().D()) {
                    this.f16630i = null;
                    this.f16764a.f().z(new RunnableC2213j3(this));
                }
            }
        }
        if (!this.f16764a.z().D()) {
            this.f16624c = this.f16630i;
            this.f16764a.f().z(new RunnableC2195g3(this));
        } else {
            G(activity, F(activity), false);
            D0 y8 = this.f16764a.y();
            y8.f16764a.f().z(new RunnableC2168c0(y8, y8.f16764a.a().elapsedRealtime()));
        }
    }

    public final void C(Activity activity, Bundle bundle) {
        C2177d3 c2177d3;
        if (!this.f16764a.z().D() || bundle == null || (c2177d3 = (C2177d3) this.f16627f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2177d3.f16452c);
        bundle2.putString("name", c2177d3.f16450a);
        bundle2.putString("referrer_name", c2177d3.f16451b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.Y1 r0 = r3.f16764a
            com.google.android.gms.measurement.internal.h r0 = r0.z()
            boolean r0 = r0.D()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.Y1 r4 = r3.f16764a
            com.google.android.gms.measurement.internal.u1 r4 = r4.d()
            com.google.android.gms.measurement.internal.s1 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.d3 r0 = r3.f16624c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.Y1 r4 = r3.f16764a
            com.google.android.gms.measurement.internal.u1 r4 = r4.d()
            com.google.android.gms.measurement.internal.s1 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L30:
            java.util.Map r1 = r3.f16627f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.Y1 r4 = r3.f16764a
            com.google.android.gms.measurement.internal.u1 r4 = r4.d()
            com.google.android.gms.measurement.internal.s1 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.t(r6, r1)
        L54:
            java.lang.String r1 = r0.f16451b
            boolean r1 = m0.x.a(r1, r6)
            java.lang.String r0 = r0.f16450a
            boolean r0 = m0.x.a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.Y1 r4 = r3.f16764a
            com.google.android.gms.measurement.internal.u1 r4 = r4.d()
            com.google.android.gms.measurement.internal.s1 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            int r1 = r5.length()
            com.google.android.gms.measurement.internal.Y1 r2 = r3.f16764a
            r2.z()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.Y1 r4 = r3.f16764a
            com.google.android.gms.measurement.internal.u1 r4 = r4.d()
            com.google.android.gms.measurement.internal.s1 r4 = r4.x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            int r1 = r6.length()
            com.google.android.gms.measurement.internal.Y1 r2 = r3.f16764a
            r2.z()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.Y1 r4 = r3.f16764a
            com.google.android.gms.measurement.internal.u1 r4 = r4.d()
            com.google.android.gms.measurement.internal.s1 r4 = r4.x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.Y1 r0 = r3.f16764a
            com.google.android.gms.measurement.internal.u1 r0 = r0.d()
            com.google.android.gms.measurement.internal.s1 r0 = r0.v()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.google.android.gms.measurement.internal.d3 r0 = new com.google.android.gms.measurement.internal.d3
            com.google.android.gms.measurement.internal.Y1 r1 = r3.f16764a
            com.google.android.gms.measurement.internal.y4 r1 = r1.N()
            long r1 = r1.t0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f16627f
            r5.put(r4, r0)
            r5 = 1
            r3.G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2219k3.D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2219k3.E(android.os.Bundle, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.A1
    protected final boolean n() {
        return false;
    }

    public final C2177d3 r() {
        return this.f16624c;
    }

    public final C2177d3 s(boolean z8) {
        i();
        h();
        if (!z8) {
            return this.f16626e;
        }
        C2177d3 c2177d3 = this.f16626e;
        if (c2177d3 != null) {
            return c2177d3;
        }
        return this.f16631j;
    }

    final String t(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f16764a.z();
        if (length2 > 100) {
            this.f16764a.z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f16764a.z().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f16627f.put(activity, new C2177d3(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void z(Activity activity) {
        synchronized (this.f16633l) {
            try {
                if (activity == this.f16628g) {
                    this.f16628g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f16764a.z().D()) {
            return;
        }
        this.f16627f.remove(activity);
    }
}
