package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes4.dex */
public final class z extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f21149a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f21150b;

    /* renamed from: c, reason: collision with root package name */
    private final c f21151c;

    public z(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f21149a = bVar;
        this.f21150b = aVar;
        this.f21151c = cVar;
        cVar.b(true);
        cVar.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        if (xVar != null) {
            xVar.a(this.f21149a, this.f21150b, this);
            xVar.b(this.f21149a, this.f21150b, this);
        }
    }
}
