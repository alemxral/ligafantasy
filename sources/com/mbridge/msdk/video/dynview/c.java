package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f21990a;

    /* renamed from: b, reason: collision with root package name */
    private String f21991b;

    /* renamed from: c, reason: collision with root package name */
    private int f21992c;

    /* renamed from: d, reason: collision with root package name */
    private float f21993d;

    /* renamed from: e, reason: collision with root package name */
    private float f21994e;

    /* renamed from: f, reason: collision with root package name */
    private int f21995f;

    /* renamed from: g, reason: collision with root package name */
    private int f21996g;

    /* renamed from: h, reason: collision with root package name */
    private View f21997h;

    /* renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f21998i;

    /* renamed from: j, reason: collision with root package name */
    private int f21999j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22000k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f22001l;

    /* renamed from: m, reason: collision with root package name */
    private int f22002m;

    /* renamed from: n, reason: collision with root package name */
    private String f22003n;

    /* renamed from: o, reason: collision with root package name */
    private int f22004o;

    /* renamed from: p, reason: collision with root package name */
    private int f22005p;

    /* renamed from: q, reason: collision with root package name */
    private String f22006q;

    /* loaded from: classes4.dex */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f22007a;

        /* renamed from: b, reason: collision with root package name */
        private String f22008b;

        /* renamed from: c, reason: collision with root package name */
        private int f22009c;

        /* renamed from: d, reason: collision with root package name */
        private float f22010d;

        /* renamed from: e, reason: collision with root package name */
        private float f22011e;

        /* renamed from: f, reason: collision with root package name */
        private int f22012f;

        /* renamed from: g, reason: collision with root package name */
        private int f22013g;

        /* renamed from: h, reason: collision with root package name */
        private View f22014h;

        /* renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f22015i;

        /* renamed from: j, reason: collision with root package name */
        private int f22016j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f22017k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f22018l;

        /* renamed from: m, reason: collision with root package name */
        private int f22019m;

        /* renamed from: n, reason: collision with root package name */
        private String f22020n;

        /* renamed from: o, reason: collision with root package name */
        private int f22021o;

        /* renamed from: p, reason: collision with root package name */
        private int f22022p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f22023q;

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(Context context) {
            this.f22007a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(float f8) {
            this.f22011e = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(int i8) {
            this.f22013g = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b d(int i8) {
            this.f22016j = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b e(int i8) {
            this.f22019m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b f(int i8) {
            this.f22021o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b g(int i8) {
            this.f22022p = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(String str) {
            this.f22008b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(int i8) {
            this.f22012f = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(String str) {
            this.f22023q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(int i8) {
            this.f22009c = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(List<String> list) {
            this.f22018l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(float f8) {
            this.f22010d = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(String str) {
            this.f22020n = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(View view) {
            this.f22014h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(List<CampaignEx> list) {
            this.f22015i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(boolean z8) {
            this.f22017k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final c a() {
            return new c(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(float f8);

        b a(int i8);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<CampaignEx> list);

        b a(boolean z8);

        c a();

        b b(float f8);

        b b(int i8);

        b b(String str);

        b b(List<String> list);

        b c(int i8);

        b c(String str);

        b d(int i8);

        b e(int i8);

        b f(int i8);

        b g(int i8);
    }

    public final Context a() {
        return this.f21990a;
    }

    public final String b() {
        return this.f21991b;
    }

    public final float c() {
        return this.f21993d;
    }

    public final float d() {
        return this.f21994e;
    }

    public final int e() {
        return this.f21995f;
    }

    public final View f() {
        return this.f21997h;
    }

    public final List<CampaignEx> g() {
        return this.f21998i;
    }

    public final int h() {
        return this.f21992c;
    }

    public final int i() {
        return this.f21999j;
    }

    public final int j() {
        return this.f21996g;
    }

    public final boolean k() {
        return this.f22000k;
    }

    public final List<String> l() {
        return this.f22001l;
    }

    public final int m() {
        return this.f22004o;
    }

    public final int n() {
        return this.f22005p;
    }

    public final String o() {
        return this.f22006q;
    }

    private c(a aVar) {
        this.f21994e = aVar.f22011e;
        this.f21993d = aVar.f22010d;
        this.f21995f = aVar.f22012f;
        this.f21996g = aVar.f22013g;
        this.f21990a = aVar.f22007a;
        this.f21991b = aVar.f22008b;
        this.f21992c = aVar.f22009c;
        this.f21997h = aVar.f22014h;
        this.f21998i = aVar.f22015i;
        this.f21999j = aVar.f22016j;
        this.f22000k = aVar.f22017k;
        this.f22001l = aVar.f22018l;
        this.f22002m = aVar.f22019m;
        this.f22003n = aVar.f22020n;
        this.f22004o = aVar.f22021o;
        this.f22005p = aVar.f22022p;
        this.f22006q = aVar.f22023q;
    }
}
