package com.stripe.android.stripe3ds2.transaction;

import L5.I;
import L5.s;
import L5.t;
import Y3.d;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.d;
import com.stripe.android.stripe3ds2.transaction.g;
import i6.M;
import i6.Y0;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements com.stripe.android.stripe3ds2.transaction.c {

    /* renamed from: l, reason: collision with root package name */
    public static final a f26882l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    private static final long f26883m = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    private final V3.k f26884a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26885b;

    /* renamed from: c, reason: collision with root package name */
    private final PrivateKey f26886c;

    /* renamed from: d, reason: collision with root package name */
    private final ECPublicKey f26887d;

    /* renamed from: e, reason: collision with root package name */
    private final U3.c f26888e;

    /* renamed from: f, reason: collision with root package name */
    private final V3.d f26889f;

    /* renamed from: g, reason: collision with root package name */
    private final P5.g f26890g;

    /* renamed from: h, reason: collision with root package name */
    private final X3.k f26891h;

    /* renamed from: i, reason: collision with root package name */
    private final c.a f26892i;

    /* renamed from: j, reason: collision with root package name */
    private final SecretKey f26893j;

    /* renamed from: k, reason: collision with root package name */
    private final f f26894k;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d.e b(Y3.a aVar) {
            X3.q n8 = aVar.n();
            String k8 = aVar.k();
            String e8 = aVar.e();
            String o8 = aVar.o();
            Y3.f fVar = Y3.f.f13155j;
            return new d.e(new Y3.d(o8, e8, null, String.valueOf(fVar.b()), d.c.f13135c, fVar.c(), "Challenge request timed-out", "CReq", k8, n8, 4, null));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final c.a f26895a;

        public b(c.a config) {
            AbstractC3159y.i(config, "config");
            this.f26895a = config;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.c.b
        public com.stripe.android.stripe3ds2.transaction.c s(U3.c errorReporter, P5.g workContext) {
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(workContext, "workContext");
            V3.f fVar = new V3.f(errorReporter);
            return new p(this.f26895a.e(), this.f26895a.f(), fVar.a(this.f26895a.c().c()), fVar.b(this.f26895a.c().b()), this.f26895a.b(), errorReporter, new V3.m(errorReporter), workContext, null, this.f26895a, null, 1280, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26896a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26897b;

        /* renamed from: d, reason: collision with root package name */
        int f26899d;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26897b = obj;
            this.f26899d |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26900a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26901b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y3.a f26903d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y3.a aVar, P5.d dVar) {
            super(2, dVar);
            this.f26903d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(this.f26903d, dVar);
            dVar2.f26901b = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f26900a;
            try {
            } catch (Throwable th) {
                s.a aVar = s.f6498b;
                b8 = s.b(t.a(th));
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return (com.stripe.android.stripe3ds2.transaction.d) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                p pVar = p.this;
                Y3.a aVar2 = this.f26903d;
                s.a aVar3 = s.f6498b;
                X3.k kVar = pVar.f26891h;
                String g8 = pVar.g(aVar2.I());
                this.f26900a = 1;
                obj = kVar.a(g8, "application/jose; charset=UTF-8", this);
                if (obj == e8) {
                    return e8;
                }
            }
            b8 = s.b((X3.l) obj);
            p pVar2 = p.this;
            Throwable e9 = s.e(b8);
            if (e9 != null) {
                pVar2.f26888e.i(e9);
            }
            p pVar3 = p.this;
            Y3.a aVar4 = this.f26903d;
            Throwable e10 = s.e(b8);
            if (e10 == null) {
                f fVar = pVar3.f26894k;
                this.f26900a = 2;
                obj = fVar.a(aVar4, (X3.l) b8, this);
                if (obj == e8) {
                    return e8;
                }
                return (com.stripe.android.stripe3ds2.transaction.d) obj;
            }
            if (e10 instanceof Y0) {
                return p.f26882l.b(aVar4);
            }
            return new d.c(e10);
        }
    }

    public p(V3.k messageTransformer, String sdkReferenceId, PrivateKey sdkPrivateKey, ECPublicKey acsPublicKey, String acsUrl, U3.c errorReporter, V3.d dhKeyGenerator, P5.g workContext, X3.k httpClient, c.a creqExecutorConfig, g responseProcessorFactory) {
        AbstractC3159y.i(messageTransformer, "messageTransformer");
        AbstractC3159y.i(sdkReferenceId, "sdkReferenceId");
        AbstractC3159y.i(sdkPrivateKey, "sdkPrivateKey");
        AbstractC3159y.i(acsPublicKey, "acsPublicKey");
        AbstractC3159y.i(acsUrl, "acsUrl");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(dhKeyGenerator, "dhKeyGenerator");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(httpClient, "httpClient");
        AbstractC3159y.i(creqExecutorConfig, "creqExecutorConfig");
        AbstractC3159y.i(responseProcessorFactory, "responseProcessorFactory");
        this.f26884a = messageTransformer;
        this.f26885b = sdkReferenceId;
        this.f26886c = sdkPrivateKey;
        this.f26887d = acsPublicKey;
        this.f26888e = errorReporter;
        this.f26889f = dhKeyGenerator;
        this.f26890g = workContext;
        this.f26891h = httpClient;
        this.f26892i = creqExecutorConfig;
        SecretKey f8 = f();
        this.f26893j = f8;
        this.f26894k = responseProcessorFactory.a(f8);
    }

    private final SecretKey f() {
        V3.d dVar = this.f26889f;
        ECPublicKey eCPublicKey = this.f26887d;
        PrivateKey privateKey = this.f26886c;
        AbstractC3159y.g(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        return dVar.z(eCPublicKey, (ECPrivateKey) privateKey, this.f26885b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(JSONObject jSONObject) {
        return this.f26884a.V(jSONObject, this.f26893j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.stripe.android.stripe3ds2.transaction.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(Y3.a r7, P5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.stripe3ds2.transaction.p.c
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.stripe3ds2.transaction.p$c r0 = (com.stripe.android.stripe3ds2.transaction.p.c) r0
            int r1 = r0.f26899d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26899d = r1
            goto L18
        L13:
            com.stripe.android.stripe3ds2.transaction.p$c r0 = new com.stripe.android.stripe3ds2.transaction.p$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26897b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f26899d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f26896a
            Y3.a r7 = (Y3.a) r7
            L5.t.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            L5.t.b(r8)
            long r4 = com.stripe.android.stripe3ds2.transaction.p.f26883m
            com.stripe.android.stripe3ds2.transaction.p$d r8 = new com.stripe.android.stripe3ds2.transaction.p$d
            r2 = 0
            r8.<init>(r7, r2)
            r0.f26896a = r7
            r0.f26899d = r3
            java.lang.Object r8 = i6.a1.d(r4, r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            com.stripe.android.stripe3ds2.transaction.d r8 = (com.stripe.android.stripe3ds2.transaction.d) r8
            if (r8 != 0) goto L55
            com.stripe.android.stripe3ds2.transaction.p$a r8 = com.stripe.android.stripe3ds2.transaction.p.f26882l
            com.stripe.android.stripe3ds2.transaction.d$e r8 = com.stripe.android.stripe3ds2.transaction.p.a.a(r8, r7)
        L55:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.p.a(Y3.a, P5.d):java.lang.Object");
    }

    public /* synthetic */ p(V3.k kVar, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, U3.c cVar, V3.d dVar, P5.g gVar, X3.k kVar2, c.a aVar, g gVar2, int i8, AbstractC3151p abstractC3151p) {
        this(kVar, str, privateKey, eCPublicKey, str2, cVar, dVar, gVar, (i8 & 256) != 0 ? new r(str2, null, cVar, gVar, 2, null) : kVar2, aVar, (i8 & 1024) != 0 ? new g.a(kVar, cVar, aVar) : gVar2);
    }
}
