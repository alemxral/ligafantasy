package com.uptodown.workers;

import E4.j;
import L5.I;
import L5.t;
import S4.i;
import W4.r;
import X4.C1498h;
import X4.D;
import X5.n;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.squareup.picasso.s;
import i2.InterfaceC2774b;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import l5.C3326n;
import l5.C3330r;
import l5.C3335w;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class PreRegisterWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30030b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f30031a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f30032a;

        /* loaded from: classes5.dex */
        public static final class a implements r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f30034a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ D f30035b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f30036c;

            a(PreRegisterWorker preRegisterWorker, D d8, int i8) {
                this.f30034a = preRegisterWorker;
                this.f30035b = d8;
                this.f30036c = i8;
            }

            @Override // W4.r
            public void c(int i8) {
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                this.f30034a.h(this.f30035b, appInfo, this.f30036c);
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f30032a == 0) {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                X4.I P8 = new C3312F(PreRegisterWorker.this.f30031a).P();
                if (!P8.b() && P8.d() != null) {
                    String d8 = P8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = P8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i8 = 0; i8 < length; i8++) {
                                D.a aVar = D.f12322f;
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                                AbstractC3159y.h(jSONObject2, "jsonArrayUpcomingReleases.getJSONObject(i)");
                                D b8 = aVar.b(jSONObject2);
                                arrayList.add(b8);
                                b8.h(PreRegisterWorker.this.f30031a);
                            }
                        }
                        C3326n a8 = C3326n.f34490t.a(PreRegisterWorker.this.f30031a);
                        a8.a();
                        ArrayList i9 = PreRegisterWorker.this.i(a8.p0(), a8);
                        a8.g();
                        Iterator it = i9.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            int i11 = i10 + 1;
                            D d10 = (D) it.next();
                            Iterator it2 = arrayList.iterator();
                            boolean z8 = false;
                            while (it2.hasNext()) {
                                if (d10.b() == ((D) it2.next()).b()) {
                                    z8 = true;
                                }
                            }
                            if (!z8) {
                                new i(PreRegisterWorker.this.f30031a, d10.b(), new a(PreRegisterWorker.this, d10, i10), N.a(C2812b0.b()));
                            }
                            i10 = i11;
                        }
                    }
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f30037a;

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f30037a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PreRegisterWorker preRegisterWorker = PreRegisterWorker.this;
                this.f30037a = 1;
                if (preRegisterWorker.f(this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f30039a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30040b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PreRegisterWorker f30041c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1498h f30042d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30043e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D f30044f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, PreRegisterWorker preRegisterWorker, C1498h c1498h, int i8, D d8, P5.d dVar) {
            super(2, dVar);
            this.f30040b = str;
            this.f30041c = preRegisterWorker;
            this.f30042d = c1498h;
            this.f30043e = i8;
            this.f30044f = d8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f30040b, this.f30041c, this.f30042d, this.f30043e, this.f30044f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            Q5.b.e();
            if (this.f30039a == 0) {
                t.b(obj);
                try {
                    bitmap = s.h().l(this.f30040b).g();
                } catch (IOException unused) {
                    bitmap = null;
                }
                C3335w.f34532a.o(this.f30041c.f30031a, this.f30042d, this.f30043e, bitmap, this.f30044f);
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC2774b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30046b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f30047c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1498h f30048d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30049e;

        /* loaded from: classes5.dex */
        static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f30050a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f30051b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30052c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ D f30053d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C1498h f30054e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f30055f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PreRegisterWorker preRegisterWorker, String str, D d8, C1498h c1498h, int i8, P5.d dVar) {
                super(2, dVar);
                this.f30051b = preRegisterWorker;
                this.f30052c = str;
                this.f30053d = d8;
                this.f30054e = c1498h;
                this.f30055f = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f30051b, this.f30052c, this.f30053d, this.f30054e, this.f30055f, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f30050a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    PreRegisterWorker preRegisterWorker = this.f30051b;
                    String str = this.f30052c;
                    D d8 = this.f30053d;
                    C1498h c1498h = this.f30054e;
                    int i9 = this.f30055f;
                    this.f30050a = 1;
                    if (preRegisterWorker.g(str, d8, c1498h, i9, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        e(String str, D d8, C1498h c1498h, int i8) {
            this.f30046b = str;
            this.f30047c = d8;
            this.f30048d = c1498h;
            this.f30049e = i8;
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception exc) {
            C3335w.f34532a.o(PreRegisterWorker.this.f30031a, this.f30048d, this.f30049e, null, this.f30047c);
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(PreRegisterWorker.this, this.f30046b, this.f30047c, this.f30048d, this.f30049e, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreRegisterWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30031a = context;
        this.f30031a = j.f2272g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(String str, D d8, C1498h c1498h, int i8, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(str, this, c1498h, i8, d8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(D d8, C1498h c1498h, int i8) {
        String l02 = c1498h.l0();
        if (l02 != null) {
            s.h().l(l02).e(new e(l02, d8, c1498h, i8));
        } else {
            C3335w.f34532a.o(this.f30031a, c1498h, i8, null, d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList i(ArrayList arrayList, C3326n c3326n) {
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                D d8 = (D) it.next();
                Iterator it2 = arrayList.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    if (d8.b() == ((D) it2.next()).b()) {
                        i8++;
                    }
                }
                if (i8 > 1) {
                    d8.i(this.f30031a);
                    d8.h(this.f30031a);
                    z8 = true;
                }
            }
            if (z8) {
                new C3330r(this.f30031a).a("preregister_repeated");
                return c3326n.p0();
            }
            return arrayList;
        }
        return arrayList;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        try {
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new c(null), 3, null);
            return success;
        } catch (Exception e8) {
            e8.printStackTrace();
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            AbstractC3159y.h(failure, "failure()");
            return failure;
        }
    }
}
