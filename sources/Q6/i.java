package Q6;

import P6.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Q f8340a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8341b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8342c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8343d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8344e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8345f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8346g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f8347h;

    /* renamed from: i, reason: collision with root package name */
    private final long f8348i;

    /* renamed from: j, reason: collision with root package name */
    private final List f8349j;

    public i(Q canonicalPath, boolean z8, String comment, long j8, long j9, long j10, int i8, Long l8, long j11) {
        AbstractC3159y.i(canonicalPath, "canonicalPath");
        AbstractC3159y.i(comment, "comment");
        this.f8340a = canonicalPath;
        this.f8341b = z8;
        this.f8342c = comment;
        this.f8343d = j8;
        this.f8344e = j9;
        this.f8345f = j10;
        this.f8346g = i8;
        this.f8347h = l8;
        this.f8348i = j11;
        this.f8349j = new ArrayList();
    }

    public final Q a() {
        return this.f8340a;
    }

    public final List b() {
        return this.f8349j;
    }

    public final long c() {
        return this.f8344e;
    }

    public final int d() {
        return this.f8346g;
    }

    public final Long e() {
        return this.f8347h;
    }

    public final long f() {
        return this.f8348i;
    }

    public final long g() {
        return this.f8345f;
    }

    public final boolean h() {
        return this.f8341b;
    }

    public /* synthetic */ i(Q q8, boolean z8, String str, long j8, long j9, long j10, int i8, Long l8, long j11, int i9, AbstractC3151p abstractC3151p) {
        this(q8, (i9 & 2) != 0 ? false : z8, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? -1L : j8, (i9 & 16) != 0 ? -1L : j9, (i9 & 32) != 0 ? -1L : j10, (i9 & 64) != 0 ? -1 : i8, (i9 & 128) != 0 ? null : l8, (i9 & 256) == 0 ? j11 : -1L);
    }
}
