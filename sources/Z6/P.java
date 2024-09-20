package z6;

import M5.a0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f40516a = a0.i(AbstractC3808a.r(L5.A.f6458b).a(), AbstractC3808a.s(L5.C.f6463b).a(), AbstractC3808a.q(L5.y.f6512b).a(), AbstractC3808a.t(L5.F.f6469b).a());

    public static final boolean a(v6.f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        if (fVar.isInline() && AbstractC3159y.d(fVar, y6.j.j())) {
            return true;
        }
        return false;
    }

    public static final boolean b(v6.f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        if (fVar.isInline() && f40516a.contains(fVar)) {
            return true;
        }
        return false;
    }
}
