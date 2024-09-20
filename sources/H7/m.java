package H7;

import L5.I;
import L5.t;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import c.C1894h;
import c.C1895i;
import c.C1896j;
import c.C1897k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f3644a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static UUID f3645b = UUID.randomUUID();

    /* renamed from: c, reason: collision with root package name */
    public static g f3646c = O7.d.f7793a.o();

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3647a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[1] = 1;
            iArr[5] = 2;
            iArr[0] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            f3647a = iArr;
            int[] iArr2 = new int[n.values().length];
            iArr2[5] = 1;
            iArr2[6] = 2;
            iArr2[4] = 3;
            int[] iArr3 = new int[H7.a.values().length];
            iArr3[0] = 1;
            iArr3[2] = 2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f3648a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3649b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f3650c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f3651d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Boolean f3652e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f3653f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Boolean bool, f fVar, P5.d dVar) {
            super(2, dVar);
            this.f3650c = str;
            this.f3651d = str2;
            this.f3652e = bool;
            this.f3653f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f3650c, this.f3651d, this.f3652e, this.f3653f, dVar);
            bVar.f3649b = obj;
            return bVar;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return ((b) create((LiveDataScope) obj, (P5.d) obj2)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            String str2;
            Object e8 = Q5.b.e();
            int i8 = this.f3648a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f3649b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f3649b;
                g gVar = m.f3646c;
                String str3 = this.f3650c;
                if (str3 != null && str3.length() != 0) {
                    str = this.f3650c;
                } else {
                    str = null;
                }
                String j8 = O7.d.f7793a.m().j(N7.a.NON_IAB_CONSENT_ENCODED);
                String str4 = this.f3651d;
                if (str4.length() == 0) {
                    str2 = null;
                } else {
                    str2 = str4;
                }
                Boolean bool = this.f3652e;
                f fVar = this.f3653f;
                this.f3649b = liveDataScope;
                this.f3648a = 1;
                obj = g.c(gVar, bool, str, str2, j8, null, fVar, this, 16);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f3649b = null;
            this.f3648a = 2;
            if (liveDataScope.emit((String) obj, this) == e8) {
                return e8;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f3654a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3655b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f3656c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ H7.a f3657d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f3658e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, H7.a aVar, int i8, P5.d dVar) {
            super(2, dVar);
            this.f3656c = str;
            this.f3657d = aVar;
            this.f3658e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            c cVar = new c(this.f3656c, this.f3657d, this.f3658e, dVar);
            cVar.f3655b = obj;
            return cVar;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            c cVar = new c(this.f3656c, this.f3657d, this.f3658e, (P5.d) obj2);
            cVar.f3655b = (LiveDataScope) obj;
            return cVar.invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f3654a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f3655b;
                t.b(obj);
                a8 = obj;
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f3655b;
                g gVar = m.f3646c;
                String j8 = O7.d.f7793a.m().j(N7.a.GPP_STRING);
                if (AbstractC3159y.d(this.f3656c, "STATE_AND_NATIONAL")) {
                    str = O7.d.f7806n;
                } else {
                    str = null;
                }
                String str2 = this.f3656c;
                H7.a aVar = this.f3657d;
                int i9 = this.f3658e;
                this.f3655b = liveDataScope;
                this.f3654a = 1;
                gVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(gVar.f3614g);
                j jVar = new j(arrayList, aVar.f3581a, H7.d.a(i9), null, j8, str, str2, null, null, 392);
                gVar.f3614g.clear();
                a8 = gVar.a(e.DONE, jVar, f.MSPA, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            this.f3655b = null;
            this.f3654a = 2;
            if (liveDataScope.emit((String) a8, this) == e8) {
                return e8;
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f3659a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f3660b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f3661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T t8, T t9, P5.d dVar) {
            super(2, dVar);
            this.f3660b = t8;
            this.f3661c = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f3660b, this.f3661c, dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new d(this.f3660b, this.f3661c, (P5.d) obj2).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f3659a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g gVar = m.f3646c;
                f fVar = (f) this.f3660b.f33747a;
                H7.c cVar = (H7.c) this.f3661c.f33747a;
                this.f3659a = 1;
                if (gVar.b(fVar, cVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    static {
        new LinkedHashMap();
        new LinkedHashMap();
    }

    public final LiveData a(n actionTag, H7.a acceptanceState) {
        String valueOf;
        int i8;
        AbstractC3159y.i(actionTag, "actionTag");
        AbstractC3159y.i(acceptanceState, "acceptanceState");
        int ordinal = actionTag.ordinal();
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    valueOf = String.valueOf(n.PARTIAL_CONSENT);
                } else {
                    valueOf = String.valueOf(n.REJECT_ALL);
                }
            } else {
                valueOf = String.valueOf(n.ACCEPT_ALL);
            }
        } else {
            valueOf = String.valueOf(n.SAVE_AND_EXIT);
        }
        int ordinal2 = acceptanceState.ordinal();
        if (ordinal2 != 0) {
            i8 = 2;
            if (ordinal2 != 2) {
                i8 = 3;
            }
        } else {
            i8 = 1;
        }
        f3646c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((P5.g) null, 0L, new c(O7.d.f7793a.m().j(N7.a.SAVED_MSPA_JURISDICTION), acceptanceState, i8, null), 3, (Object) null);
    }

    public final LiveData b(n actionTag, f regulation) {
        String valueOf;
        Boolean bool;
        Boolean bool2;
        AbstractC3159y.i(actionTag, "actionTag");
        AbstractC3159y.i(regulation, "regulation");
        int ordinal = actionTag.ordinal();
        String str = null;
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    bool2 = Boolean.FALSE;
                    valueOf = String.valueOf(n.PARTIAL_CONSENT);
                } else {
                    bool2 = Boolean.FALSE;
                    valueOf = String.valueOf(n.REJECT_ALL);
                }
            } else {
                bool2 = Boolean.TRUE;
                valueOf = String.valueOf(n.ACCEPT_ALL);
            }
            bool = bool2;
        } else {
            valueOf = String.valueOf(n.SAVE_AND_EXIT);
            bool = null;
        }
        if (a.f3647a[regulation.ordinal()] == 1) {
            str = O7.d.f7793a.m().j(N7.a.TC_STRING);
        }
        String str2 = str;
        String j8 = O7.d.f7793a.m().j(N7.a.GPP_STRING);
        f3646c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((P5.g) null, 0L, new b(str2, j8, bool, regulation, null), 3, (Object) null);
    }

    public final Object c(f fVar, int i8, P5.d dVar) {
        Object a8;
        f3646c.e("goToPage", String.valueOf(i8));
        g gVar = f3646c;
        if (gVar.f3614g.size() < 2) {
            a8 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(gVar.f3614g);
            k kVar = new k(arrayList);
            gVar.f3614g.clear();
            a8 = gVar.a(e.NAVIGATION, kVar, fVar, dVar);
        }
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6474a;
    }

    public final Object d(P5.d dVar) {
        String str;
        g gVar = f3646c;
        f fVar = f.GBC;
        C1895i c1895i = C1895i.f14826a;
        ArrayList arrayList = new ArrayList();
        C1895i.f14828c.forEach(new C1894h(arrayList));
        gVar.getClass();
        O o8 = new O();
        o8.f33743a = true;
        C1895i.f14828c.forEach(new C1896j(o8));
        if (o8.f33743a) {
            str = "All";
        } else {
            O o9 = new O();
            o9.f33743a = true;
            C1895i.f14828c.forEach(new C1897k(o9));
            if (o9.f33743a) {
                str = "Reject";
            } else {
                str = "Partial";
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(gVar.f3614g);
        l lVar = new l(arrayList2, str, arrayList);
        gVar.f3614g.clear();
        Object a8 = gVar.a(e.DONE, lVar, fVar, dVar);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6474a;
    }

    public final void e(f regulation, boolean z8) {
        H7.c cVar;
        H7.c cVar2;
        AbstractC3159y.i(regulation, "regulation");
        T t8 = new T();
        t8.f33747a = regulation;
        T t9 = new T();
        H7.c cVar3 = H7.c.TCF_CHANGE_OF_CONSENT;
        t9.f33747a = cVar3;
        int ordinal = regulation.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (z8) {
                                    cVar2 = H7.c.MSPA_MANDATORY;
                                } else if (O7.d.f7793a.m().h(N7.a.MSPA_SHOWN)) {
                                    cVar2 = H7.c.MSPA_CHANGE_OF_CONSENT;
                                } else {
                                    cVar2 = H7.c.MSPA_OPT_OUT;
                                }
                                t9.f33747a = cVar2;
                            }
                        } else {
                            t9.f33747a = H7.c.GBC_US_OPT_OUT;
                        }
                    } else {
                        if (z8) {
                            cVar = H7.c.GBC_MANDATORY;
                        } else {
                            cVar = H7.c.GBC_CHANGE_OF_CONSENT;
                        }
                        t9.f33747a = cVar;
                    }
                } else {
                    t9.f33747a = H7.c.GBC;
                }
            } else {
                if (z8) {
                    cVar3 = H7.c.TCF_MANDATORY;
                }
                t9.f33747a = cVar3;
            }
        } else {
            t9.f33747a = H7.c.USP;
        }
        if (regulation == f.GDPRWITHGBC || regulation == f.USPWITHGBC) {
            t8.f33747a = f.GBC;
        }
        f3646c.e("startOnPage", t8.f33747a + "_1");
        f3645b = UUID.randomUUID();
        AbstractC2829k.d(C2842q0.f31785a, C2812b0.b(), null, new d(t8, t9, null), 2, null);
    }

    public final void f(String identifier, String value) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(value, "value");
        f3646c.e(identifier, value);
    }
}
