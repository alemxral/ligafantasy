package m4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: m4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3417g extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f35480b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35481c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f35482d;

    /* renamed from: e, reason: collision with root package name */
    private final C3416f f35483e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3417g(G identifier, v0 config, Function0 function0) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(config, "config");
        this.f35480b = identifier;
        this.f35481c = true;
        this.f35483e = new C3416f(config, function0, null, 4, null);
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35480b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35482d;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35481c;
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3416f i() {
        return this.f35483e;
    }
}
