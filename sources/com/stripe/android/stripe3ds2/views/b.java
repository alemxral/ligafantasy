package com.stripe.android.stripe3ds2.views;

import L5.I;
import L5.t;
import P5.g;
import X3.v;
import X5.n;
import Y3.b;
import Z3.b;
import a4.C1570n;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.stripe3ds2.transaction.h;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f27002a;

    /* renamed from: b, reason: collision with root package name */
    private final v f27003b;

    /* renamed from: c, reason: collision with root package name */
    private final Z3.b f27004c;

    /* renamed from: d, reason: collision with root package name */
    private final C1570n f27005d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableLiveData f27006e;

    /* renamed from: f, reason: collision with root package name */
    private final LiveData f27007f;

    /* renamed from: g, reason: collision with root package name */
    private final MutableLiveData f27008g;

    /* renamed from: h, reason: collision with root package name */
    private final LiveData f27009h;

    /* renamed from: i, reason: collision with root package name */
    private final MutableLiveData f27010i;

    /* renamed from: j, reason: collision with root package name */
    private final LiveData f27011j;

    /* renamed from: k, reason: collision with root package name */
    private final MutableLiveData f27012k;

    /* renamed from: l, reason: collision with root package name */
    private final LiveData f27013l;

    /* renamed from: m, reason: collision with root package name */
    private final c f27014m;

    /* renamed from: n, reason: collision with root package name */
    private final LiveData f27015n;

    /* renamed from: o, reason: collision with root package name */
    private final c f27016o;

    /* renamed from: p, reason: collision with root package name */
    private final LiveData f27017p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27018q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC2855x0 f27019r;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f27020a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f27020a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = b.this.f27003b;
                this.f27020a = 1;
                if (vVar.b(this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.views.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0682b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.transaction.b f27022a;

        /* renamed from: b, reason: collision with root package name */
        private final v f27023b;

        /* renamed from: c, reason: collision with root package name */
        private final U3.c f27024c;

        /* renamed from: d, reason: collision with root package name */
        private final g f27025d;

        public C0682b(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, v transactionTimer, U3.c errorReporter, g workContext) {
            AbstractC3159y.i(challengeActionHandler, "challengeActionHandler");
            AbstractC3159y.i(transactionTimer, "transactionTimer");
            AbstractC3159y.i(errorReporter, "errorReporter");
            AbstractC3159y.i(workContext, "workContext");
            this.f27022a = challengeActionHandler;
            this.f27023b = transactionTimer;
            this.f27024c = errorReporter;
            this.f27025d = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            return new b(this.f27022a, this.f27023b, this.f27024c, null, this.f27025d, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c extends MutableLiveData {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f27026a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27027b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b.d f27029d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b.d dVar, int i8, P5.d dVar2) {
            super(2, dVar2);
            this.f27029d = dVar;
            this.f27030e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(this.f27029d, this.f27030e, dVar);
            dVar2.f27027b = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(LiveDataScope liveDataScope, P5.d dVar) {
            return ((d) create(liveDataScope, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            Object e8 = Q5.b.e();
            int i8 = this.f27026a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f27027b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f27027b;
                C1570n c1570n = b.this.f27005d;
                b.d dVar = this.f27029d;
                if (dVar != null) {
                    str = dVar.c(this.f27030e);
                } else {
                    str = null;
                }
                this.f27027b = liveDataScope;
                this.f27026a = 1;
                obj = c1570n.e(str, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f27027b = null;
            this.f27026a = 2;
            if (liveDataScope.emit(obj, this) == e8) {
                return e8;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f27031a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27032b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f27034a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f27035b;

            a(P5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                a aVar = new a(dVar);
                aVar.f27035b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (P5.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f27034a == 0) {
                    t.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f27035b);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(boolean z8, P5.d dVar) {
                return ((a) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f6474a);
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            e eVar = new e(dVar);
            eVar.f27032b = obj;
            return eVar;
        }

        @Override // X5.n
        public final Object invoke(LiveDataScope liveDataScope, P5.d dVar) {
            return ((e) create(liveDataScope, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object e8 = Q5.b.e();
            int i8 = this.f27031a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f27032b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f27032b;
                InterfaceC3358f a8 = b.this.f27003b.a();
                a aVar = new a(null);
                this.f27032b = liveDataScope;
                this.f27031a = 1;
                obj = AbstractC3360h.w(a8, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f27032b = null;
            this.f27031a = 2;
            if (liveDataScope.emit(obj, this) == e8) {
                return e8;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f27036a;

        /* renamed from: b, reason: collision with root package name */
        int f27037b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f27039d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.stripe3ds2.transaction.a aVar, P5.d dVar) {
            super(2, dVar);
            this.f27039d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f27039d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object e8 = Q5.b.e();
            int i8 = this.f27037b;
            if (i8 != 0) {
                if (i8 == 1) {
                    cVar = (c) this.f27036a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar2 = b.this.f27014m;
                com.stripe.android.stripe3ds2.transaction.b bVar = b.this.f27002a;
                com.stripe.android.stripe3ds2.transaction.a aVar = this.f27039d;
                this.f27036a = cVar2;
                this.f27037b = 1;
                Object a8 = bVar.a(aVar, this);
                if (a8 == e8) {
                    return e8;
                }
                cVar = cVar2;
                obj = a8;
            }
            cVar.postValue(obj);
            return I.f6474a;
        }
    }

    public /* synthetic */ b(com.stripe.android.stripe3ds2.transaction.b bVar, v vVar, U3.c cVar, Z3.b bVar2, g gVar, int i8, AbstractC3151p abstractC3151p) {
        this(bVar, vVar, cVar, (i8 & 8) != 0 ? b.a.f13388a : bVar2, gVar);
    }

    public final LiveData e() {
        return this.f27015n;
    }

    public final LiveData f() {
        return this.f27013l;
    }

    public final LiveData g(b.d dVar, int i8) {
        return CoroutineLiveDataKt.liveData$default((g) null, 0L, new d(dVar, i8, null), 3, (Object) null);
    }

    public final LiveData h() {
        return this.f27017p;
    }

    public final LiveData i() {
        return this.f27007f;
    }

    public final LiveData j() {
        return this.f27011j;
    }

    public final boolean k() {
        return this.f27018q;
    }

    public final LiveData l() {
        return this.f27009h;
    }

    public final LiveData m() {
        return CoroutineLiveDataKt.liveData$default((g) null, 0L, new e(null), 3, (Object) null);
    }

    public final void n(h challengeResult) {
        AbstractC3159y.i(challengeResult, "challengeResult");
        this.f27010i.postValue(challengeResult);
    }

    public final void o() {
        this.f27004c.clear();
    }

    public final void p(Y3.b cres) {
        AbstractC3159y.i(cres, "cres");
        this.f27016o.setValue(cres);
    }

    public final void q() {
        this.f27006e.setValue(I.f6474a);
    }

    public final void r(com.stripe.android.stripe3ds2.transaction.a challengeAction) {
        AbstractC3159y.i(challengeAction, "challengeAction");
        this.f27008g.postValue(challengeAction);
    }

    public final void s(boolean z8) {
        this.f27018q = z8;
    }

    public final void t() {
        InterfaceC2855x0.a.a(this.f27019r, null, 1, null);
    }

    public final void u(com.stripe.android.stripe3ds2.transaction.a action) {
        AbstractC3159y.i(action, "action");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new f(action, null), 3, null);
    }

    public b(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, v transactionTimer, U3.c errorReporter, Z3.b imageCache, g workContext) {
        InterfaceC2855x0 d8;
        AbstractC3159y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3159y.i(transactionTimer, "transactionTimer");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(imageCache, "imageCache");
        AbstractC3159y.i(workContext, "workContext");
        this.f27002a = challengeActionHandler;
        this.f27003b = transactionTimer;
        this.f27004c = imageCache;
        this.f27005d = new C1570n(errorReporter, workContext);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f27006e = mutableLiveData;
        this.f27007f = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.f27008g = mutableLiveData2;
        this.f27009h = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.f27010i = mutableLiveData3;
        this.f27011j = mutableLiveData3;
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.f27012k = mutableLiveData4;
        this.f27013l = mutableLiveData4;
        c cVar = new c();
        this.f27014m = cVar;
        this.f27015n = cVar;
        c cVar2 = new c();
        this.f27016o = cVar2;
        this.f27017p = cVar2;
        d8 = AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        this.f27019r = d8;
    }
}
