package o4;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3529a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f36371a = ConstraintsKt.Constraints(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final float f36372b = Dp.m5178constructorimpl(16);

    /* renamed from: c, reason: collision with root package name */
    private static final float f36373c = Dp.m5178constructorimpl(12);

    /* renamed from: d, reason: collision with root package name */
    private static final Modifier f36374d;

    static {
        float f8 = 48;
        f36374d = SizeKt.m631defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8));
    }

    public static final float a() {
        return f36373c;
    }

    public static final Modifier b() {
        return f36374d;
    }

    public static final float c() {
        return f36372b;
    }

    public static final long d() {
        return f36371a;
    }
}
