package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public final class F4 {

    /* renamed from: a, reason: collision with root package name */
    private final Y1 f16098a;

    public F4(Y1 y12) {
        this.f16098a = y12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Bundle bundle) {
        String uri;
        this.f16098a.f().h();
        if (!this.f16098a.o()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.f16098a.F().f16153v.b(uri);
                this.f16098a.F().f16154w.b(this.f16098a.a().currentTimeMillis());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        String str;
        this.f16098a.f().h();
        if (!d()) {
            return;
        }
        if (e()) {
            this.f16098a.F().f16153v.b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f16098a.I().u("auto", "_cmpx", bundle);
        } else {
            String a8 = this.f16098a.F().f16153v.a();
            if (TextUtils.isEmpty(a8)) {
                this.f16098a.d().t().a("Cache still valid but referrer not found");
            } else {
                long a9 = this.f16098a.F().f16154w.a() / 3600000;
                Uri parse = Uri.parse(a8);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", (a9 - 1) * 3600000);
                Object obj = pair.first;
                if (obj == null) {
                    str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
                } else {
                    str = (String) obj;
                }
                this.f16098a.I().u(str, "_cmp", (Bundle) pair.second);
            }
            this.f16098a.F().f16153v.b(null);
        }
        this.f16098a.F().f16154w.b(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f16098a.F().f16153v.b(null);
        }
    }

    final boolean d() {
        if (this.f16098a.F().f16154w.a() > 0) {
            return true;
        }
        return false;
    }

    final boolean e() {
        if (!d() || this.f16098a.a().currentTimeMillis() - this.f16098a.F().f16154w.a() <= this.f16098a.z().r(null, AbstractC2217k1.f16563U)) {
            return false;
        }
        return true;
    }
}
