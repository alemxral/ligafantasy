package e4;

import L5.InterfaceC1227k;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
/* loaded from: classes4.dex */
public final class U {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1227k f30589a;

    /* renamed from: b, reason: collision with root package name */
    public static final U f30590b = new U("Country", 0);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ U[] f30591c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ R5.a f30592d;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30593a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.ui.core.elements.DisplayField", U.values(), new String[]{"country"}, new Annotation[][]{null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) U.f30589a.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        U[] a8 = a();
        f30591c = a8;
        f30592d = R5.b.a(a8);
        Companion = new b(null);
        f30589a = L5.l.a(L5.o.f6492b, a.f30593a);
    }

    private U(String str, int i8) {
    }

    private static final /* synthetic */ U[] a() {
        return new U[]{f30590b};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f30591c.clone();
    }
}
