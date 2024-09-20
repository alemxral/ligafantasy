package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.AbstractC2380e;
import java.util.Map;

/* loaded from: classes3.dex */
public final class O extends S.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    Bundle f17329a;

    /* renamed from: b, reason: collision with root package name */
    private Map f17330b;

    /* renamed from: c, reason: collision with root package name */
    private b f17331c;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f17332a;

        /* renamed from: b, reason: collision with root package name */
        private final String f17333b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f17334c;

        /* renamed from: d, reason: collision with root package name */
        private final String f17335d;

        /* renamed from: e, reason: collision with root package name */
        private final String f17336e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f17337f;

        /* renamed from: g, reason: collision with root package name */
        private final String f17338g;

        /* renamed from: h, reason: collision with root package name */
        private final String f17339h;

        /* renamed from: i, reason: collision with root package name */
        private final String f17340i;

        /* renamed from: j, reason: collision with root package name */
        private final String f17341j;

        /* renamed from: k, reason: collision with root package name */
        private final String f17342k;

        /* renamed from: l, reason: collision with root package name */
        private final String f17343l;

        /* renamed from: m, reason: collision with root package name */
        private final String f17344m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f17345n;

        /* renamed from: o, reason: collision with root package name */
        private final String f17346o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f17347p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f17348q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f17349r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f17350s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f17351t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f17352u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f17353v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f17354w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f17355x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f17356y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f17357z;

        private static String[] b(H h8, String str) {
            Object[] g8 = h8.g(str);
            if (g8 == null) {
                return null;
            }
            String[] strArr = new String[g8.length];
            for (int i8 = 0; i8 < g8.length; i8++) {
                strArr[i8] = String.valueOf(g8[i8]);
            }
            return strArr;
        }

        public String a() {
            return this.f17335d;
        }

        public String c() {
            return this.f17332a;
        }

        private b(H h8) {
            this.f17332a = h8.p("gcm.n.title");
            this.f17333b = h8.h("gcm.n.title");
            this.f17334c = b(h8, "gcm.n.title");
            this.f17335d = h8.p("gcm.n.body");
            this.f17336e = h8.h("gcm.n.body");
            this.f17337f = b(h8, "gcm.n.body");
            this.f17338g = h8.p("gcm.n.icon");
            this.f17340i = h8.o();
            this.f17341j = h8.p("gcm.n.tag");
            this.f17342k = h8.p("gcm.n.color");
            this.f17343l = h8.p("gcm.n.click_action");
            this.f17344m = h8.p("gcm.n.android_channel_id");
            this.f17345n = h8.f();
            this.f17339h = h8.p("gcm.n.image");
            this.f17346o = h8.p("gcm.n.ticker");
            this.f17347p = h8.b("gcm.n.notification_priority");
            this.f17348q = h8.b("gcm.n.visibility");
            this.f17349r = h8.b("gcm.n.notification_count");
            this.f17352u = h8.a("gcm.n.sticky");
            this.f17353v = h8.a("gcm.n.local_only");
            this.f17354w = h8.a("gcm.n.default_sound");
            this.f17355x = h8.a("gcm.n.default_vibrate_timings");
            this.f17356y = h8.a("gcm.n.default_light_settings");
            this.f17351t = h8.j("gcm.n.event_time");
            this.f17350s = h8.e();
            this.f17357z = h8.q();
        }
    }

    public O(Bundle bundle) {
        this.f17329a = bundle;
    }

    public Map s() {
        if (this.f17330b == null) {
            this.f17330b = AbstractC2380e.a.a(this.f17329a);
        }
        return this.f17330b;
    }

    public b u() {
        if (this.f17331c == null && H.t(this.f17329a)) {
            this.f17331c = new b(new H(this.f17329a));
        }
        return this.f17331c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        P.c(this, parcel, i8);
    }
}
