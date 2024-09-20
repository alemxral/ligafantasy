package L7;

import L5.I;
import c.C1895i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f6719a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f6720b;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f6721a;

        public a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new a((P5.d) obj2).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6721a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                H7.m mVar = H7.m.f3644a;
                this.f6721a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f6722a;

        public b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new b((P5.d) obj2).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6722a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                H7.m mVar = H7.m.f3644a;
                this.f6722a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public j(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        this.f6719a = sharedStorage;
        this.f6720b = choiceCmpCallback;
    }

    @Override // L7.i
    public void a() {
        C1895i c1895i = C1895i.f14826a;
        if (C1895i.f14827b) {
            C1895i.f14828c.setAllOwnedItems();
            SharedStorage sharedStorage = this.f6719a;
            N7.a aVar = N7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c1895i.a(sharedStorage.k(aVar), C1895i.f14828c));
            ChoiceCmpCallback choiceCmpCallback = this.f6720b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c1895i.b());
            }
            AbstractC2829k.d(C2842q0.f31785a, C2812b0.b(), null, new a(null), 2, null);
        }
    }

    @Override // L7.i
    public void b() {
        C1895i c1895i = C1895i.f14826a;
        if (C1895i.f14827b) {
            C1895i.f14828c.unsetAllOwnedItems();
            SharedStorage sharedStorage = this.f6719a;
            N7.a aVar = N7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c1895i.a(sharedStorage.k(aVar), C1895i.f14828c));
            ChoiceCmpCallback choiceCmpCallback = this.f6720b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c1895i.b());
            }
            AbstractC2829k.d(C2842q0.f31785a, C2812b0.b(), null, new b(null), 2, null);
        }
    }
}
