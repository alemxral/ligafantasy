package com.mbridge.msdk.newreward.function.c.b.b;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f20943a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.b.b.a f20944b;

    /* renamed from: c, reason: collision with root package name */
    private b f20945c;

    /* renamed from: d, reason: collision with root package name */
    private d f20946d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20947e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20948f = false;

    public c(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f20943a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: b, reason: collision with root package name */
        private final c f20952b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f20953c;

        public a(c cVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f20952b = cVar;
            this.f20953c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            if (this.f20952b.f20947e) {
                return;
            }
            this.f20952b.f20947e = true;
            this.f20953c.a(obj);
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            if (bVar.a() == 1) {
                if (!c.this.f20944b.a() || !c.this.f20945c.a() || this.f20952b.f20948f) {
                    return;
                } else {
                    this.f20952b.f20948f = true;
                }
            }
            this.f20953c.a(bVar);
        }
    }

    public final void a(e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        int c8 = eVar.c();
        if (c8 == 1) {
            if (this.f20944b == null) {
                a();
            }
            this.f20944b.a(eVar, new a(this, bVar));
        } else if (c8 == 2) {
            if (this.f20946d == null) {
                this.f20946d = new d();
            }
            this.f20946d.a(eVar, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.c.1
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    com.mbridge.msdk.newreward.a.b.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(obj);
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                    com.mbridge.msdk.newreward.a.b.b bVar3 = bVar;
                    if (bVar3 != null) {
                        bVar3.a(bVar2);
                    }
                }
            });
        } else {
            if (c8 != 3) {
                return;
            }
            if (this.f20945c == null) {
                this.f20945c = new b(this.f20943a);
            }
            this.f20945c.a(eVar, new a(this, bVar));
        }
    }

    private void a() {
        this.f20944b = new com.mbridge.msdk.newreward.function.c.b.b.a(this.f20943a);
    }

    public final boolean a(e eVar) {
        if (eVar.c() == 1) {
            if (this.f20944b == null) {
                a();
            }
            return this.f20944b.a(eVar.a(), eVar, eVar.b());
        }
        if (eVar.c() == 2) {
            if (this.f20946d == null) {
                this.f20946d = new d();
            }
            return this.f20946d.a(eVar);
        }
        if (eVar.c() != 3) {
            return false;
        }
        if (this.f20945c == null) {
            this.f20945c = new b(this.f20943a);
        }
        return true;
    }
}
