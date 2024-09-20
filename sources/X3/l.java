package X3;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f12273a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12274b;

    public l(String content, String str) {
        AbstractC3159y.i(content, "content");
        this.f12273a = content;
        boolean z8 = false;
        if (str != null && g6.n.C(str, "application/json", false, 2, null)) {
            z8 = true;
        }
        this.f12274b = z8;
    }

    public final String a() {
        return this.f12273a;
    }

    public final boolean b() {
        return this.f12274b;
    }
}
