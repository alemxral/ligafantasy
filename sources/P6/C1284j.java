package P6;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1284j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8068a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8069b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f8070c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f8071d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f8072e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f8073f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f8074g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f8075h;

    public C1284j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map extras) {
        AbstractC3159y.i(extras, "extras");
        this.f8068a = z8;
        this.f8069b = z9;
        this.f8070c = q8;
        this.f8071d = l8;
        this.f8072e = l9;
        this.f8073f = l10;
        this.f8074g = l11;
        this.f8075h = M5.Q.y(extras);
    }

    public final Long a() {
        return this.f8073f;
    }

    public final Long b() {
        return this.f8071d;
    }

    public final boolean c() {
        return this.f8069b;
    }

    public final boolean d() {
        return this.f8068a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f8068a) {
            arrayList.add("isRegularFile");
        }
        if (this.f8069b) {
            arrayList.add("isDirectory");
        }
        if (this.f8071d != null) {
            arrayList.add("byteCount=" + this.f8071d);
        }
        if (this.f8072e != null) {
            arrayList.add("createdAt=" + this.f8072e);
        }
        if (this.f8073f != null) {
            arrayList.add("lastModifiedAt=" + this.f8073f);
        }
        if (this.f8074g != null) {
            arrayList.add("lastAccessedAt=" + this.f8074g);
        }
        if (!this.f8075h.isEmpty()) {
            arrayList.add("extras=" + this.f8075h);
        }
        return AbstractC1246t.w0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C1284j(boolean z8, boolean z9, Q q8, Long l8, Long l9, Long l10, Long l11, Map map, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) == 0 ? z9 : false, (i8 & 4) != 0 ? null : q8, (i8 & 8) != 0 ? null : l8, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : l10, (i8 & 64) == 0 ? l11 : null, (i8 & 128) != 0 ? M5.Q.h() : map);
    }
}
