package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes4.dex */
public abstract class c extends d<String> {

    /* renamed from: b, reason: collision with root package name */
    protected Boolean f21097b;

    /* renamed from: c, reason: collision with root package name */
    private String f21098c;

    public c(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.f21097b = null;
    }

    public final void a(String str) {
        this.f21098c = str;
    }

    protected abstract boolean a_();

    @Override // com.mbridge.msdk.newreward.function.d.c.d
    protected final boolean f() {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean g() {
        Boolean bool = this.f21097b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean a_ = a_();
        this.f21097b = Boolean.valueOf(a_);
        return a_;
    }
}
