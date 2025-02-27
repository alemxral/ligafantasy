package U0;

import S0.g;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements T0.b {

    /* renamed from: e, reason: collision with root package name */
    private static final S0.d f11040e = new S0.d() { // from class: U0.a
        @Override // S0.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (S0.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final S0.f f11041f = new S0.f() { // from class: U0.b
        @Override // S0.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).f((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final S0.f f11042g = new S0.f() { // from class: U0.c
        @Override // S0.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f11043h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f11044a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f11045b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private S0.d f11046c = f11040e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11047d = false;

    /* loaded from: classes3.dex */
    class a implements S0.a {
        a() {
        }

        @Override // S0.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f11044a, d.this.f11045b, d.this.f11046c, d.this.f11047d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // S0.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements S0.f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f11049a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f11049a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // S0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.f(f11049a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f11041f);
        p(Boolean.class, f11042g);
        p(Date.class, f11043h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, S0.e eVar) {
        throw new S0.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.g(bool.booleanValue());
    }

    public S0.a i() {
        return new a();
    }

    public d j(T0.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z8) {
        this.f11047d = z8;
        return this;
    }

    @Override // T0.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, S0.d dVar) {
        this.f11044a.put(cls, dVar);
        this.f11045b.remove(cls);
        return this;
    }

    public d p(Class cls, S0.f fVar) {
        this.f11045b.put(cls, fVar);
        this.f11044a.remove(cls);
        return this;
    }
}
