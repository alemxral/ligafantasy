package y6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4002d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39953a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39954b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39955c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39956d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39957e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39958f;

    /* renamed from: g, reason: collision with root package name */
    private String f39959g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39960h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39961i;

    /* renamed from: j, reason: collision with root package name */
    private String f39962j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39963k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f39964l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39965m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f39966n;

    /* renamed from: o, reason: collision with root package name */
    private A6.b f39967o;

    public C4002d(AbstractC3999a json) {
        AbstractC3159y.i(json, "json");
        this.f39953a = json.d().g();
        this.f39954b = json.d().h();
        this.f39955c = json.d().i();
        this.f39956d = json.d().o();
        this.f39957e = json.d().b();
        this.f39958f = json.d().k();
        this.f39959g = json.d().l();
        this.f39960h = json.d().e();
        this.f39961i = json.d().n();
        this.f39962j = json.d().d();
        this.f39963k = json.d().a();
        this.f39964l = json.d().m();
        json.d().j();
        this.f39965m = json.d().f();
        this.f39966n = json.d().c();
        this.f39967o = json.e();
    }

    public final C4004f a() {
        if (this.f39961i && !AbstractC3159y.d(this.f39962j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (!this.f39958f) {
            if (!AbstractC3159y.d(this.f39959g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!AbstractC3159y.d(this.f39959g, "    ")) {
            String str = this.f39959g;
            for (int i8 = 0; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f39959g).toString());
                }
            }
        }
        return new C4004f(this.f39953a, this.f39955c, this.f39956d, this.f39957e, this.f39958f, this.f39954b, this.f39959g, this.f39960h, this.f39961i, this.f39962j, this.f39963k, this.f39964l, null, this.f39965m, this.f39966n);
    }

    public final A6.b b() {
        return this.f39967o;
    }

    public final void c(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f39962j = str;
    }

    public final void d(boolean z8) {
        this.f39960h = z8;
    }

    public final void e(boolean z8) {
        this.f39953a = z8;
    }

    public final void f(boolean z8) {
        this.f39955c = z8;
    }
}
