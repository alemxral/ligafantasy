package e3;

import g6.C2728d;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t2.C3785f;
import x2.AbstractC3869G;
import x2.t;
import x2.y;

/* renamed from: e3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2584f extends AbstractC3869G {

    /* renamed from: k, reason: collision with root package name */
    private static final a f30224k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f30225l = 8;

    /* renamed from: c, reason: collision with root package name */
    private final Map f30226c;

    /* renamed from: d, reason: collision with root package name */
    private final y.e f30227d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3869G.a f30228e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3869G.b f30229f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterable f30230g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30231h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f30232i;

    /* renamed from: j, reason: collision with root package name */
    private Map f30233j;

    /* renamed from: e3.f$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2584f(Map params, String guid) {
        AbstractC3159y.i(params, "params");
        AbstractC3159y.i(guid, "guid");
        this.f30226c = params;
        y.e eVar = new y.e(guid);
        this.f30227d = eVar;
        this.f30228e = AbstractC3869G.a.f39104c;
        this.f30229f = AbstractC3869G.b.f39111d;
        this.f30230g = t.a();
        this.f30231h = "https://m.stripe.com/6";
        this.f30232i = eVar.b();
        this.f30233j = eVar.c();
    }

    private final String h() {
        return String.valueOf(v2.e.f38770a.d(this.f30226c));
    }

    private final byte[] i() {
        try {
            byte[] bytes = h().getBytes(C2728d.f31279b);
            AbstractC3159y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C3785f(null, null, 0, "Unable to encode parameters to " + C2728d.f31279b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // x2.AbstractC3869G
    public Map a() {
        return this.f30232i;
    }

    @Override // x2.AbstractC3869G
    public AbstractC3869G.a b() {
        return this.f30228e;
    }

    @Override // x2.AbstractC3869G
    public Map c() {
        return this.f30233j;
    }

    @Override // x2.AbstractC3869G
    public Iterable d() {
        return this.f30230g;
    }

    @Override // x2.AbstractC3869G
    public String f() {
        return this.f30231h;
    }

    @Override // x2.AbstractC3869G
    public void g(OutputStream outputStream) {
        AbstractC3159y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }
}
