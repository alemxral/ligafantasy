package y6;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import u6.AbstractC3808a;

/* loaded from: classes5.dex */
public final class w implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final w f40006a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f40007b = a.f40008b;

    /* loaded from: classes5.dex */
    private static final class a implements v6.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40008b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f40009c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ v6.f f40010a = AbstractC3808a.i(AbstractC3808a.E(Y.f33752a), k.f39985a).a();

        private a() {
        }

        @Override // v6.f
        public String a() {
            return f40009c;
        }

        @Override // v6.f
        public boolean c() {
            return this.f40010a.c();
        }

        @Override // v6.f
        public int d(String name) {
            AbstractC3159y.i(name, "name");
            return this.f40010a.d(name);
        }

        @Override // v6.f
        public int e() {
            return this.f40010a.e();
        }

        @Override // v6.f
        public String f(int i8) {
            return this.f40010a.f(i8);
        }

        @Override // v6.f
        public List g(int i8) {
            return this.f40010a.g(i8);
        }

        @Override // v6.f
        public List getAnnotations() {
            return this.f40010a.getAnnotations();
        }

        @Override // v6.f
        public v6.j getKind() {
            return this.f40010a.getKind();
        }

        @Override // v6.f
        public v6.f h(int i8) {
            return this.f40010a.h(i8);
        }

        @Override // v6.f
        public boolean i(int i8) {
            return this.f40010a.i(i8);
        }

        @Override // v6.f
        public boolean isInline() {
            return this.f40010a.isInline();
        }
    }

    private w() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f40007b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public v c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        l.g(decoder);
        return new v((Map) AbstractC3808a.i(AbstractC3808a.E(Y.f33752a), k.f39985a).c(decoder));
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, v value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        l.h(encoder);
        AbstractC3808a.i(AbstractC3808a.E(Y.f33752a), k.f39985a).e(encoder, value);
    }
}
