package com.mbridge.msdk.e;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f18953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18954b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18955c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18956d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18957e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18958f;

    /* renamed from: g, reason: collision with root package name */
    public final o f18959g;

    /* renamed from: h, reason: collision with root package name */
    public final d f18960h;

    /* renamed from: i, reason: collision with root package name */
    public final v f18961i;

    /* renamed from: j, reason: collision with root package name */
    public final f f18962j;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private o f18966d;

        /* renamed from: h, reason: collision with root package name */
        private d f18970h;

        /* renamed from: i, reason: collision with root package name */
        private v f18971i;

        /* renamed from: j, reason: collision with root package name */
        private f f18972j;

        /* renamed from: a, reason: collision with root package name */
        private int f18963a = 50;

        /* renamed from: b, reason: collision with root package name */
        private int f18964b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;

        /* renamed from: c, reason: collision with root package name */
        private int f18965c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f18967e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f18968f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f18969g = 604800000;

        public final a a(int i8) {
            if (i8 <= 0) {
                this.f18963a = 50;
            } else {
                this.f18963a = i8;
            }
            return this;
        }

        public final a b(int i8) {
            if (i8 < 0) {
                this.f18964b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            } else {
                this.f18964b = i8;
            }
            return this;
        }

        public final a c(int i8) {
            if (i8 <= 0) {
                this.f18967e = 2;
            } else {
                this.f18967e = i8;
            }
            return this;
        }

        public final a d(int i8) {
            if (i8 < 0) {
                this.f18968f = 50;
            } else {
                this.f18968f = i8;
            }
            return this;
        }

        public final a e(int i8) {
            if (i8 < 0) {
                this.f18969g = 604800000;
            } else {
                this.f18969g = i8;
            }
            return this;
        }

        public final a a(int i8, o oVar) {
            this.f18965c = i8;
            this.f18966d = oVar;
            return this;
        }

        public final a a(d dVar) {
            this.f18970h = dVar;
            return this;
        }

        public final a a(v vVar) {
            this.f18971i = vVar;
            return this;
        }

        public final a a(f fVar) {
            this.f18972j = fVar;
            return this;
        }

        public final w a() {
            if (y.a(this.f18970h) && com.mbridge.msdk.e.a.f18736a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.a(this.f18971i) && com.mbridge.msdk.e.a.f18736a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.a(this.f18966d) || y.a(this.f18966d.c())) && com.mbridge.msdk.e.a.f18736a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new w(this);
        }
    }

    private w(a aVar) {
        this.f18953a = aVar.f18963a;
        this.f18954b = aVar.f18964b;
        this.f18955c = aVar.f18965c;
        this.f18956d = aVar.f18967e;
        this.f18957e = aVar.f18968f;
        this.f18958f = aVar.f18969g;
        this.f18959g = aVar.f18966d;
        this.f18960h = aVar.f18970h;
        this.f18961i = aVar.f18971i;
        this.f18962j = aVar.f18972j;
    }
}
