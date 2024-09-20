package com.uptodown.workers;

import L5.I;
import L5.t;
import P5.d;
import X4.Q;
import X5.n;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class GetUserDataWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30019b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f30020a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.workers.GetUserDataWorker$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0713a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f30021a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f30022b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0713a(Context context, d dVar) {
                super(2, dVar);
                this.f30022b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0713a(this.f30022b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((C0713a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String d8;
                int i8;
                Q5.b.e();
                if (this.f30021a == 0) {
                    t.b(obj);
                    X4.I q02 = new C3312F(this.f30022b).q0();
                    if (!q02.b() && (d8 = q02.d()) != null && d8.length() != 0) {
                        String d9 = q02.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            Q e8 = Q.f12424k.e(this.f30022b);
                            JSONObject jsonObjectData = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (e8 != null) {
                                Context context = this.f30022b;
                                AbstractC3159y.h(jsonObjectData, "jsonObjectData");
                                e8.j(context, jsonObjectData);
                            }
                            if (e8 != null) {
                                e8.L(this.f30022b);
                            }
                        }
                    }
                    if (q02.e() == 401) {
                        Q.f12424k.a(this.f30022b);
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f30023a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f30024b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ W4.I f30025c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, W4.I i8, d dVar) {
                super(2, dVar);
                this.f30024b = context;
                this.f30025c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new b(this.f30024b, this.f30025c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String d8;
                int i8;
                Q5.b.e();
                if (this.f30023a == 0) {
                    t.b(obj);
                    X4.I q02 = new C3312F(this.f30024b).q0();
                    if (!q02.b() && (d8 = q02.d()) != null && d8.length() != 0) {
                        String d9 = q02.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            Q e8 = Q.f12424k.e(this.f30024b);
                            JSONObject jsonObjectData = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (e8 != null) {
                                Context context = this.f30024b;
                                AbstractC3159y.h(jsonObjectData, "jsonObjectData");
                                e8.j(context, jsonObjectData);
                            }
                            if (e8 != null) {
                                e8.L(this.f30024b);
                            }
                            if (e8 != null) {
                                this.f30025c.a();
                            }
                        }
                    }
                    if (q02.e() == 401) {
                        Q.f12424k.a(this.f30024b);
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private a() {
        }

        public final Object a(Context context, d dVar) {
            Object g8 = AbstractC2825i.g(C2812b0.b(), new C0713a(context, null), dVar);
            if (g8 == Q5.b.e()) {
                return g8;
            }
            return I.f6474a;
        }

        public final Object b(Context context, W4.I i8, d dVar) {
            Object g8 = AbstractC2825i.g(C2812b0.b(), new b(context, i8, null), dVar);
            if (g8 == Q5.b.e()) {
                return g8;
            }
            return I.f6474a;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f30026a;

        b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f30026a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = GetUserDataWorker.f30019b;
                Context context = GetUserDataWorker.this.f30020a;
                this.f30026a = 1;
                if (aVar.a(context, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserDataWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30020a = context;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new b(null), 3, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        return success;
    }
}
