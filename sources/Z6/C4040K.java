package z6;

import L5.AbstractC1218b;
import L5.AbstractC1219c;
import L5.C1217a;
import L5.C1224h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3159y;
import y6.AbstractC4007i;
import y6.C4000b;
import y6.C4004f;

/* renamed from: z6.K, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4040K {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4041a f40481a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40482b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40483c;

    /* renamed from: d, reason: collision with root package name */
    private int f40484d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.K$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f40485a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40486b;

        a(P5.d dVar) {
            super(3, dVar);
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC1219c abstractC1219c, L5.I i8, P5.d dVar) {
            a aVar = new a(dVar);
            aVar.f40486b = abstractC1219c;
            return aVar.invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f40485a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                AbstractC1219c abstractC1219c = (AbstractC1219c) this.f40486b;
                byte F8 = C4040K.this.f40481a.F();
                if (F8 == 1) {
                    return C4040K.this.j(true);
                }
                if (F8 == 0) {
                    return C4040K.this.j(false);
                }
                if (F8 == 6) {
                    C4040K c4040k = C4040K.this;
                    this.f40485a = 1;
                    obj = c4040k.h(abstractC1219c, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (F8 == 8) {
                        return C4040K.this.f();
                    }
                    AbstractC4041a.x(C4040K.this.f40481a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C1224h();
                }
            }
            return (AbstractC4007i) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.K$b */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40488a;

        /* renamed from: b, reason: collision with root package name */
        Object f40489b;

        /* renamed from: c, reason: collision with root package name */
        Object f40490c;

        /* renamed from: d, reason: collision with root package name */
        Object f40491d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40492e;

        /* renamed from: g, reason: collision with root package name */
        int f40494g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40492e = obj;
            this.f40494g |= Integer.MIN_VALUE;
            return C4040K.this.h(null, this);
        }
    }

    public C4040K(C4004f configuration, AbstractC4041a lexer) {
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(lexer, "lexer");
        this.f40481a = lexer;
        this.f40482b = configuration.o();
        this.f40483c = configuration.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4007i f() {
        boolean z8;
        byte j8 = this.f40481a.j();
        if (this.f40481a.F() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f40481a.e()) {
                arrayList.add(e());
                j8 = this.f40481a.j();
                if (j8 != 4) {
                    AbstractC4041a abstractC4041a = this.f40481a;
                    if (j8 == 9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = abstractC4041a.f40528a;
                    if (!z8) {
                        AbstractC4041a.x(abstractC4041a, "Expected end of the array or comma", i8, null, 4, null);
                        throw new C1224h();
                    }
                }
            }
            if (j8 == 8) {
                this.f40481a.k((byte) 9);
            } else if (j8 == 4) {
                if (this.f40483c) {
                    this.f40481a.k((byte) 9);
                } else {
                    AbstractC4031B.g(this.f40481a, "array");
                    throw new C1224h();
                }
            }
            return new C4000b(arrayList);
        }
        AbstractC4041a.x(this.f40481a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1224h();
    }

    private final AbstractC4007i g() {
        return (AbstractC4007i) AbstractC1218b.b(new C1217a(new a(null)), L5.I.f6474a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0096 -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(L5.AbstractC1219c r21, P5.d r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.C4040K.h(L5.c, P5.d):java.lang.Object");
    }

    private final AbstractC4007i i() {
        String o8;
        byte k8 = this.f40481a.k((byte) 6);
        if (this.f40481a.F() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f40481a.e()) {
                    break;
                }
                if (this.f40482b) {
                    o8 = this.f40481a.q();
                } else {
                    o8 = this.f40481a.o();
                }
                this.f40481a.k((byte) 5);
                linkedHashMap.put(o8, e());
                k8 = this.f40481a.j();
                if (k8 != 4) {
                    if (k8 != 7) {
                        AbstractC4041a.x(this.f40481a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new C1224h();
                    }
                }
            }
            if (k8 == 6) {
                this.f40481a.k((byte) 7);
            } else if (k8 == 4) {
                if (this.f40483c) {
                    this.f40481a.k((byte) 7);
                } else {
                    AbstractC4031B.h(this.f40481a, null, 1, null);
                    throw new C1224h();
                }
            }
            return new y6.v(linkedHashMap);
        }
        AbstractC4041a.x(this.f40481a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1224h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y6.x j(boolean z8) {
        String q8;
        if (!this.f40482b && z8) {
            q8 = this.f40481a.o();
        } else {
            q8 = this.f40481a.q();
        }
        String str = q8;
        if (!z8 && AbstractC3159y.d(str, "null")) {
            return y6.t.INSTANCE;
        }
        return new y6.p(str, z8, null, 4, null);
    }

    public final AbstractC4007i e() {
        AbstractC4007i i8;
        byte F8 = this.f40481a.F();
        if (F8 == 1) {
            return j(true);
        }
        if (F8 == 0) {
            return j(false);
        }
        if (F8 == 6) {
            int i9 = this.f40484d + 1;
            this.f40484d = i9;
            if (i9 == 200) {
                i8 = g();
            } else {
                i8 = i();
            }
            this.f40484d--;
            return i8;
        }
        if (F8 == 8) {
            return f();
        }
        AbstractC4041a.x(this.f40481a, "Cannot read Json element because of unexpected " + AbstractC4042b.c(F8), 0, null, 6, null);
        throw new C1224h();
    }
}
