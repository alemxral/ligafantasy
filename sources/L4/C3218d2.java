package l4;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.List;
import k4.C3124d;
import k4.C3125e;
import k4.EnumC3126f;
import k4.InterfaceC3121a;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: l4.d2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3218d2 implements InterfaceC3121a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3218d2 f34235a = new C3218d2();

    /* renamed from: b, reason: collision with root package name */
    private static final String f34236b = "NR";

    private C3218d2() {
    }

    @Override // k4.InterfaceC3121a
    public List a() {
        return AbstractC1246t.p(new C3124d(EnumC3126f.f33457e, true, null), new C3124d(EnumC3126f.f33458f, false, null), new C3124d(EnumC3126f.f33463k, true, new C3125e(false, (ArrayList) null, k4.g.f33481i, 2, (AbstractC3151p) null)));
    }

    public String b() {
        return f34236b;
    }
}
