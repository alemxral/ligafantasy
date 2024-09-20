package f1;

import com.google.firebase.messaging.I;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2658b {

    /* renamed from: b, reason: collision with root package name */
    private static final C2658b f30987b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C2657a f30988a;

    /* renamed from: f1.b$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C2657a f30989a = null;

        a() {
        }

        public C2658b a() {
            return new C2658b(this.f30989a);
        }

        public a b(C2657a c2657a) {
            this.f30989a = c2657a;
            return this;
        }
    }

    C2658b(C2657a c2657a) {
        this.f30988a = c2657a;
    }

    public static a b() {
        return new a();
    }

    public C2657a a() {
        return this.f30988a;
    }

    public byte[] c() {
        return I.a(this);
    }
}
