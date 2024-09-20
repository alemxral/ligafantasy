package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.e.w;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static x f18886a = null;

    /* renamed from: o, reason: collision with root package name */
    private static String f18887o = "";

    /* renamed from: b, reason: collision with root package name */
    private final String f18888b;

    /* renamed from: c, reason: collision with root package name */
    private final m f18889c;

    /* renamed from: d, reason: collision with root package name */
    private Context f18890d;

    /* renamed from: e, reason: collision with root package name */
    private w f18891e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f18892f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f18893g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f18894h;

    /* renamed from: i, reason: collision with root package name */
    private volatile c f18895i;

    /* renamed from: j, reason: collision with root package name */
    private volatile l f18896j;

    /* renamed from: k, reason: collision with root package name */
    private volatile d f18897k;

    /* renamed from: l, reason: collision with root package name */
    private volatile j f18898l;

    /* renamed from: m, reason: collision with root package name */
    private volatile r f18899m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f18900n = true;

    /* renamed from: p, reason: collision with root package name */
    private n f18901p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, m mVar) {
        this.f18888b = str;
        this.f18889c = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        if (!y.a((Object) this.f18890d) && !y.a(this.f18891e)) {
            try {
                o().a();
                this.f18900n = false;
                if (TextUtils.isEmpty(f18887o)) {
                    f18887o = UUID.randomUUID().toString();
                }
                if (!y.a(f18886a)) {
                    try {
                        f18886a.a(b(), this.f18888b, this.f18889c);
                        t.a().b();
                    } catch (Exception e8) {
                        if (a.f18736a) {
                            Log.e("TrackManager", "track manager start exception", e8);
                        }
                    }
                }
                return f18887o;
            } catch (Exception e9) {
                if (a.f18736a) {
                    Log.e("TrackManager", "start error", e9);
                }
                this.f18900n = true;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        if (TextUtils.isEmpty(f18887o)) {
            String uuid = UUID.randomUUID().toString();
            f18887o = uuid;
            return uuid;
        }
        return f18887o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.f18888b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w d() {
        w wVar = this.f18891e;
        if (wVar == null) {
            w a8 = new w.a().a();
            this.f18891e = a8;
            return a8;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context e() {
        return this.f18890d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject f() {
        JSONObject jSONObject = this.f18892f;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f18892f = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c g() {
        String format;
        if (y.a(this.f18895i)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18895i)) {
                        Context context = this.f18890d;
                        if (TextUtils.isEmpty(this.f18888b)) {
                            format = String.format("track_manager_%s.db", "default");
                        } else {
                            format = String.format("track_manager_%s.db", this.f18888b);
                        }
                        this.f18895i = new c(new b(context, format, "event_table"), "event_table");
                    }
                } finally {
                }
            }
        }
        return this.f18895i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l h() {
        if (y.a(this.f18896j)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18896j)) {
                        this.f18896j = new p(new g(g(), o(), i()));
                    }
                } finally {
                }
            }
        }
        return this.f18896j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j i() {
        if (y.a(this.f18898l)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18898l)) {
                        this.f18898l = new j();
                    }
                } finally {
                }
            }
        }
        return this.f18898l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d j() {
        if (y.a(this.f18897k)) {
            this.f18897k = d().f18960h;
        }
        return this.f18897k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m k() {
        return this.f18889c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l() {
        if (d().f18953a < 0) {
            return 50;
        }
        return d().f18953a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m() {
        return Math.max(d().f18954b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n() {
        return Math.max(d().f18957e, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r o() {
        if (y.a(this.f18899m)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18899m)) {
                        this.f18899m = new r(this);
                    }
                } finally {
                }
            }
        }
        return this.f18899m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() throws IllegalStateException {
        if (!y.a(d())) {
            if (!y.a(j())) {
                if (!y.a(d().f18961i)) {
                    if (!y.a(d().f18959g) && !y.a(d().f18959g.c())) {
                        if (!TextUtils.isEmpty(d().f18959g.b())) {
                            return true;
                        }
                        throw new IllegalStateException("report url is null");
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n q() {
        int i8;
        if (y.a(this.f18901p)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18901p)) {
                        if (d().f18956d <= 0) {
                            i8 = 2;
                        } else {
                            i8 = d().f18956d;
                        }
                        this.f18901p = new n(i8, d().f18959g, d().f18961i, d().f18955c);
                    }
                } finally {
                }
            }
        }
        return this.f18901p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return this.f18900n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context) {
        this.f18890d = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(w wVar) {
        this.f18891e = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        this.f18892f = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(e eVar) {
        if (y.a(eVar)) {
            return false;
        }
        f fVar = d().f18962j;
        if (y.b(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e8) {
                if (a.f18736a) {
                    Log.e("TrackManager", "event filter apply exception", e8);
                }
            }
        }
        String a8 = eVar.a();
        if (TextUtils.isEmpty(a8)) {
            return false;
        }
        if (this.f18894h != null) {
            try {
                return !r0.contains(a8);
            } catch (Exception e9) {
                if (a.f18736a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e9);
                }
            }
        }
        List<String> list = this.f18893g;
        if (list != null) {
            try {
                return list.contains(a8);
            } catch (Exception e10) {
                if (a.f18736a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e10);
                }
            }
        }
        return true;
    }
}
