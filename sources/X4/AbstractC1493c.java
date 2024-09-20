package X4;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3319g;
import l5.C3330r;

/* renamed from: X4.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1493c {

    /* renamed from: j, reason: collision with root package name */
    public static final a f12472j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f12473a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12474b;

    /* renamed from: c, reason: collision with root package name */
    private String f12475c;

    /* renamed from: d, reason: collision with root package name */
    private String f12476d;

    /* renamed from: e, reason: collision with root package name */
    private long f12477e;

    /* renamed from: f, reason: collision with root package name */
    private int f12478f;

    /* renamed from: g, reason: collision with root package name */
    private long f12479g;

    /* renamed from: h, reason: collision with root package name */
    private int f12480h;

    /* renamed from: i, reason: collision with root package name */
    private long f12481i;

    /* renamed from: X4.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(AbstractC1493c abstractC1493c, long j8) {
            if (abstractC1493c != null && abstractC1493c.o() > -1 && abstractC1493c.k() == j8 && System.currentTimeMillis() - abstractC1493c.o() < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public AbstractC1493c(long j8, String packageName, String imageUrl, String type) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(imageUrl, "imageUrl");
        AbstractC3159y.i(type, "type");
        this.f12473a = j8;
        this.f12474b = packageName;
        this.f12475c = imageUrl;
        this.f12476d = type;
        this.f12477e = -1L;
        this.f12478f = -1;
        this.f12479g = -1L;
        this.f12481i = -1L;
    }

    private final boolean b(Context context) {
        if (new C3319g().z(context, r()) == null) {
            return true;
        }
        return false;
    }

    private final boolean c(Context context) {
        boolean z8;
        boolean z9;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j8 = this.f12477e;
        if (currentTimeMillis - j8 > 3600 && this.f12480h < 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (currentTimeMillis - j8 > 86400) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f12480h = 0;
            t(context);
        }
        if (z8 || z9) {
            return true;
        }
        return false;
    }

    public final boolean a(Context context) {
        AbstractC3159y.i(context, "context");
        if (c(context)) {
            return b(context);
        }
        return false;
    }

    public final boolean d() {
        if ((System.currentTimeMillis() / 1000) - this.f12481i > 86400) {
            return true;
        }
        return false;
    }

    public final void e(Context context) {
        AbstractC3159y.i(context, "context");
        this.f12479g = System.currentTimeMillis();
        t(context);
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        bundle.putString("adView", this.f12476d);
        new C3330r(context).b("ad", bundle);
    }

    public final void f(Context context) {
        AbstractC3159y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        bundle.putString("adView", this.f12476d);
        new C3330r(context).b("ad", bundle);
    }

    public final void g(Context context) {
        AbstractC3159y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", "imageFailed");
        bundle.putString("adView", this.f12476d);
        new C3330r(context).b("ad", bundle);
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", "imageLoaded");
        bundle.putString("adView", this.f12476d);
        new C3330r(context).b("ad", bundle);
    }

    public final void i(Context context) {
        AbstractC3159y.i(context, "context");
        this.f12478f = -1;
        t(context);
    }

    public final void j(Context context) {
        AbstractC3159y.i(context, "context");
        this.f12477e = System.currentTimeMillis() / 1000;
        this.f12480h++;
        t(context);
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDOE_IMPRESSION);
        bundle.putString("adView", this.f12476d);
        new C3330r(context).b("ad", bundle);
    }

    public abstract long k();

    public final int l() {
        return this.f12480h;
    }

    public final int m() {
        return this.f12478f;
    }

    public abstract String n();

    public final long o() {
        return this.f12479g;
    }

    public final long p() {
        return this.f12481i;
    }

    public final long q() {
        return this.f12477e;
    }

    public abstract String r();

    public final String s() {
        return this.f12476d;
    }

    public abstract void t(Context context);

    public String toString() {
        return "AdInfo(appId=" + k() + ", packageName=" + r() + ", imageUrl=" + n() + ", lastTimeShown=" + this.f12477e + ", downloadId=" + this.f12478f + ", lastTimeClicked=" + this.f12479g + ", type=" + this.f12476d + ", counterImpressions=" + this.f12480h + ", lastTimeRequested=" + this.f12481i + ')';
    }

    public final void u(int i8) {
        this.f12480h = i8;
    }

    public final void v(int i8) {
        this.f12478f = i8;
    }

    public final void w(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        this.f12478f = i8;
        t(context);
    }

    public final void x(long j8) {
        this.f12479g = j8;
    }

    public final void y(long j8) {
        this.f12481i = j8;
    }

    public final void z(long j8) {
        this.f12477e = j8;
    }
}
