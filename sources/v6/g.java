package v6;

import L5.InterfaceC1227k;
import L5.l;
import L5.x;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.K;
import M5.Q;
import d6.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.f;
import x6.AbstractC3940c0;
import x6.AbstractC3946f0;
import x6.InterfaceC3952l;

/* loaded from: classes5.dex */
public final class g implements f, InterfaceC3952l {

    /* renamed from: a, reason: collision with root package name */
    private final String f38884a;

    /* renamed from: b, reason: collision with root package name */
    private final j f38885b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38886c;

    /* renamed from: d, reason: collision with root package name */
    private final List f38887d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f38888e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f38889f;

    /* renamed from: g, reason: collision with root package name */
    private final f[] f38890g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f38891h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f38892i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f38893j;

    /* renamed from: k, reason: collision with root package name */
    private final f[] f38894k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1227k f38895l;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(AbstractC3946f0.a(gVar, gVar.f38894k));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return g.this.f(i8) + ": " + g.this.h(i8).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(String serialName, j kind, int i8, List typeParameters, C3834a builder) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(kind, "kind");
        AbstractC3159y.i(typeParameters, "typeParameters");
        AbstractC3159y.i(builder, "builder");
        this.f38884a = serialName;
        this.f38885b = kind;
        this.f38886c = i8;
        this.f38887d = builder.c();
        this.f38888e = AbstractC1246t.U0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f38889f = strArr;
        this.f38890g = AbstractC3940c0.b(builder.e());
        this.f38891h = (List[]) builder.d().toArray(new List[0]);
        this.f38892i = AbstractC1246t.R0(builder.g());
        Iterable<K> b12 = AbstractC1239l.b1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(b12, 10));
        for (K k8 : b12) {
            arrayList.add(x.a(k8.b(), Integer.valueOf(k8.a())));
        }
        this.f38893j = Q.w(arrayList);
        this.f38894k = AbstractC3940c0.b(typeParameters);
        this.f38895l = l.b(new a());
    }

    private final int k() {
        return ((Number) this.f38895l.getValue()).intValue();
    }

    @Override // v6.f
    public String a() {
        return this.f38884a;
    }

    @Override // x6.InterfaceC3952l
    public Set b() {
        return this.f38888e;
    }

    @Override // v6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // v6.f
    public int d(String name) {
        AbstractC3159y.i(name, "name");
        Integer num = (Integer) this.f38893j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // v6.f
    public int e() {
        return this.f38886c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (AbstractC3159y.d(a(), fVar.a()) && Arrays.equals(this.f38894k, ((g) obj).f38894k) && e() == fVar.e()) {
                int e8 = e();
                for (int i8 = 0; i8 < e8; i8++) {
                    if (AbstractC3159y.d(h(i8).a(), fVar.h(i8).a()) && AbstractC3159y.d(h(i8).getKind(), fVar.h(i8).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // v6.f
    public String f(int i8) {
        return this.f38889f[i8];
    }

    @Override // v6.f
    public List g(int i8) {
        return this.f38891h[i8];
    }

    @Override // v6.f
    public List getAnnotations() {
        return this.f38887d;
    }

    @Override // v6.f
    public j getKind() {
        return this.f38885b;
    }

    @Override // v6.f
    public f h(int i8) {
        return this.f38890g[i8];
    }

    public int hashCode() {
        return k();
    }

    @Override // v6.f
    public boolean i(int i8) {
        return this.f38892i[i8];
    }

    @Override // v6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return AbstractC1246t.w0(m.s(0, e()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
