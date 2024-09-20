package X2;

import com.stripe.android.paymentsheet.u;
import e4.P0;
import e4.Y;
import e4.w0;
import e4.y0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.D;
import m4.G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12197a = new a("Name", 0) { // from class: X2.a.b
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // X2.a
        public u.d.b b(u.d configuration) {
            AbstractC3159y.i(configuration, "configuration");
            return configuration.n();
        }

        @Override // X2.a
        public D c(Map initialValues) {
            AbstractC3159y.i(initialValues, "initialValues");
            return new w0((G) null, (P0) (0 == true ? 1 : 0), 3, (AbstractC3151p) (0 == true ? 1 : 0)).j(initialValues);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final a f12198b = new a("Phone", 1) { // from class: X2.a.c
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // X2.a
        public u.d.b b(u.d configuration) {
            AbstractC3159y.i(configuration, "configuration");
            return configuration.o();
        }

        @Override // X2.a
        public D c(Map initialValues) {
            AbstractC3159y.i(initialValues, "initialValues");
            return new y0((G) null, 1, (AbstractC3151p) (0 == true ? 1 : 0)).i(initialValues);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final a f12199c = new a("Email", 2) { // from class: X2.a.a
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // X2.a
        public u.d.b b(u.d configuration) {
            AbstractC3159y.i(configuration, "configuration");
            return configuration.k();
        }

        @Override // X2.a
        public D c(Map initialValues) {
            AbstractC3159y.i(initialValues, "initialValues");
            return new Y((G) null, 1, (AbstractC3151p) (0 == true ? 1 : 0)).i(initialValues);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f12200d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f12201e;

    static {
        a[] a8 = a();
        f12200d = a8;
        f12201e = R5.b.a(a8);
    }

    public /* synthetic */ a(String str, int i8, AbstractC3151p abstractC3151p) {
        this(str, i8);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f12197a, f12198b, f12199c};
    }

    public static R5.a d() {
        return f12201e;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12200d.clone();
    }

    public abstract u.d.b b(u.d dVar);

    public abstract D c(Map map);

    public final boolean e(u.d configuration) {
        AbstractC3159y.i(configuration, "configuration");
        if (b(configuration) != u.d.b.f26384b) {
            return true;
        }
        return false;
    }

    public final boolean f(u.d configuration) {
        AbstractC3159y.i(configuration, "configuration");
        if (b(configuration) == u.d.b.f26385c) {
            return true;
        }
        return false;
    }

    private a(String str, int i8) {
    }
}
