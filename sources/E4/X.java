package e4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class X extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30605b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30606c;

    /* renamed from: d, reason: collision with root package name */
    private final m4.w0 f30607d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30608e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3983b f30609f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ X(m4.G r7, java.lang.String r8, m4.w0 r9, int r10, kotlin.jvm.internal.AbstractC3151p r11) {
        /*
            r6 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            m4.G$b r7 = m4.G.Companion
            m4.G r7 = r7.n()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto L10
            java.lang.String r8 = ""
        L10:
            r10 = r10 & 4
            if (r10 == 0) goto L26
            m4.s0 r9 = new m4.s0
            m4.A r1 = new m4.A
            r10 = 0
            r11 = 0
            r0 = 1
            r1.<init>(r10, r0, r11)
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r9
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L26:
            r6.<init>(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.X.<init>(m4.G, java.lang.String, m4.w0, int, kotlin.jvm.internal.p):void");
    }

    @Override // m4.o0, m4.k0
    public m4.G a() {
        return this.f30605b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30609f;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30608e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x8 = (X) obj;
        if (AbstractC3159y.d(this.f30605b, x8.f30605b) && AbstractC3159y.d(this.f30606c, x8.f30606c) && AbstractC3159y.d(this.f30607d, x8.f30607d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f30605b.hashCode() * 31;
        String str = this.f30606c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f30607d.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m4.w0 i() {
        return this.f30607d;
    }

    public String toString() {
        return "EmailElement(identifier=" + this.f30605b + ", initialValue=" + this.f30606c + ", controller=" + this.f30607d + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(m4.G identifier, String str, m4.w0 controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30605b = identifier;
        this.f30606c = str;
        this.f30607d = controller;
        this.f30608e = true;
    }
}
