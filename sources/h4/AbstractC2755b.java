package h4;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2755b {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f31384a = CompositionLocalKt.staticCompositionLocalOf(a.f31385a);

    /* renamed from: h4.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31385a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2754a invoke() {
            return C2756c.f31386a;
        }
    }

    public static final ProvidableCompositionLocal a() {
        return f31384a;
    }
}
