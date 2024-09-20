package M2;

import K2.b;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final e f6872a;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6873a;

        static {
            int[] iArr = new int[b.a.EnumC0111b.values().length];
            try {
                iArr[b.a.EnumC0111b.f5870a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.EnumC0111b.f5871b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6873a = iArr;
        }
    }

    public c(e linkEventsReporter) {
        AbstractC3159y.i(linkEventsReporter, "linkEventsReporter");
        this.f6872a = linkEventsReporter;
    }

    public final void a() {
        this.f6872a.g();
    }

    public final void b() {
        this.f6872a.e();
    }

    public final void c(K2.b linkActivityResult) {
        AbstractC3159y.i(linkActivityResult, "linkActivityResult");
        if (linkActivityResult instanceof b.a) {
            int i8 = a.f6873a[((b.a) linkActivityResult).b().ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    this.f6872a.l();
                    return;
                }
                return;
            }
            this.f6872a.d();
            return;
        }
        if (linkActivityResult instanceof b.C0112b) {
            this.f6872a.k();
        } else if (linkActivityResult instanceof b.c) {
            this.f6872a.f(((b.c) linkActivityResult).b());
        }
    }
}
