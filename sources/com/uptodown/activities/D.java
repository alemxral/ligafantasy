package com.uptodown.activities;

import X4.C1496f;
import X4.O;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.UptodownApp;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3319g;
import l5.C3326n;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class D extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28172a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28173b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28174a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28175b;

        public a(boolean z8, boolean z9) {
            this.f28174a = z8;
            this.f28175b = z9;
        }

        public final boolean a() {
            return this.f28175b;
        }

        public final boolean b() {
            return this.f28174a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28174a == aVar.f28174a && this.f28175b == aVar.f28175b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z8 = this.f28174a;
            ?? r02 = z8;
            if (z8) {
                r02 = 1;
            }
            int i8 = r02 * 31;
            boolean z9 = this.f28175b;
            return i8 + (z9 ? 1 : z9 ? 1 : 0);
        }

        public String toString() {
            return "DownloadAllButtonData(hasUpdates=" + this.f28174a + ", allCompleted=" + this.f28175b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f28176a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f28177b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f28178c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f28179d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList f28180e;

        /* renamed from: f, reason: collision with root package name */
        private final a f28181f;

        public b(ArrayList updates, ArrayList disabled, ArrayList ignored, ArrayList recentlyUpdated, ArrayList positives, a downloadAllButtonData) {
            AbstractC3159y.i(updates, "updates");
            AbstractC3159y.i(disabled, "disabled");
            AbstractC3159y.i(ignored, "ignored");
            AbstractC3159y.i(recentlyUpdated, "recentlyUpdated");
            AbstractC3159y.i(positives, "positives");
            AbstractC3159y.i(downloadAllButtonData, "downloadAllButtonData");
            this.f28176a = updates;
            this.f28177b = disabled;
            this.f28178c = ignored;
            this.f28179d = recentlyUpdated;
            this.f28180e = positives;
            this.f28181f = downloadAllButtonData;
        }

        public final ArrayList a() {
            return this.f28177b;
        }

        public final a b() {
            return this.f28181f;
        }

        public final ArrayList c() {
            return this.f28178c;
        }

        public final ArrayList d() {
            return this.f28180e;
        }

        public final ArrayList e() {
            return this.f28179d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f28176a, bVar.f28176a) && AbstractC3159y.d(this.f28177b, bVar.f28177b) && AbstractC3159y.d(this.f28178c, bVar.f28178c) && AbstractC3159y.d(this.f28179d, bVar.f28179d) && AbstractC3159y.d(this.f28180e, bVar.f28180e) && AbstractC3159y.d(this.f28181f, bVar.f28181f);
        }

        public final ArrayList f() {
            return this.f28176a;
        }

        public int hashCode() {
            return (((((((((this.f28176a.hashCode() * 31) + this.f28177b.hashCode()) * 31) + this.f28178c.hashCode()) * 31) + this.f28179d.hashCode()) * 31) + this.f28180e.hashCode()) * 31) + this.f28181f.hashCode();
        }

        public String toString() {
            return "UpdatesData(updates=" + this.f28176a + ", disabled=" + this.f28177b + ", ignored=" + this.f28178c + ", recentlyUpdated=" + this.f28179d + ", positives=" + this.f28180e + ", downloadAllButtonData=" + this.f28181f + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28183b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28184c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f28185d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, Context context, ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f28183b = z8;
            this.f28184c = context;
            this.f28185d = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28183b, this.f28184c, this.f28185d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        
            r5 = false;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                Q5.b.e()
                int r0 = r10.f28182a
                if (r0 != 0) goto Lc4
                L5.t.b(r11)
                boolean r11 = r10.f28183b
                r0 = 1
                if (r11 == 0) goto Lbf
                l5.n$a r11 = l5.C3326n.f34490t
                android.content.Context r1 = r10.f28184c
                l5.n r11 = r11.a(r1)
                r11.a()
                l5.q r1 = new l5.q
                r1.<init>()
                android.content.Context r2 = r10.f28184c
                java.util.ArrayList r1 = r1.e(r2)
                java.util.ArrayList r2 = r10.f28185d
                java.util.Iterator r2 = r2.iterator()
            L2b:
                r3 = 1
            L2c:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lbb
                java.lang.Object r4 = r2.next()
                X4.O r4 = (X4.O) r4
                java.lang.String r5 = r4.j()
                r6 = 0
                if (r5 == 0) goto Lb8
                java.util.Iterator r5 = r1.iterator()
            L43:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L87
                java.lang.Object r7 = r5.next()
                java.io.File r7 = (java.io.File) r7
                java.lang.String r8 = r4.j()
                java.lang.String r9 = r7.getName()
                boolean r8 = g6.n.s(r8, r9, r0)
                if (r8 == 0) goto L43
                int r5 = r4.o()
                r8 = 100
                if (r5 != r8) goto L67
                r5 = 1
                goto L68
            L67:
                r5 = 0
            L68:
                if (r5 == 0) goto L88
                java.lang.String r8 = r4.e()
                if (r8 == 0) goto L88
                N4.d r8 = N4.d.f7188a
                java.lang.String r9 = r7.getAbsolutePath()
                java.lang.String r8 = r8.e(r9)
                java.lang.String r9 = r4.e()
                boolean r8 = g6.n.s(r9, r8, r0)
                if (r8 != 0) goto L88
                r7.delete()
            L87:
                r5 = 0
            L88:
                if (r5 != 0) goto Lb2
                l5.q r7 = new l5.q
                r7.<init>()
                android.content.Context r8 = r10.f28184c
                java.io.File r7 = r7.g(r8)
                java.io.File r8 = new java.io.File
                java.lang.String r9 = r4.j()
                kotlin.jvm.internal.AbstractC3159y.f(r9)
                r8.<init>(r7, r9)
                boolean r7 = r8.exists()
                if (r7 != 0) goto Lb2
                r4.X(r6)
                java.lang.String r7 = "u"
                kotlin.jvm.internal.AbstractC3159y.h(r4, r7)
                r11.r1(r4)
            Lb2:
                if (r3 == 0) goto Lb8
                if (r5 == 0) goto Lb8
                goto L2b
            Lb8:
                r3 = 0
                goto L2c
            Lbb:
                r11.g()
                r0 = r3
            Lbf:
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r0)
                return r11
            Lc4:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.D.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f28186a;

        /* renamed from: b, reason: collision with root package name */
        Object f28187b;

        /* renamed from: c, reason: collision with root package name */
        Object f28188c;

        /* renamed from: d, reason: collision with root package name */
        Object f28189d;

        /* renamed from: e, reason: collision with root package name */
        Object f28190e;

        /* renamed from: f, reason: collision with root package name */
        Object f28191f;

        /* renamed from: g, reason: collision with root package name */
        boolean f28192g;

        /* renamed from: h, reason: collision with root package name */
        int f28193h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f28194i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ D f28195j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Context f28196k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, D d8, Context context, P5.d dVar) {
            super(2, dVar);
            this.f28194i = z8;
            this.f28195j = d8;
            this.f28196k = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f28194i, this.f28195j, this.f28196k, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Object g8;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Object d8;
            boolean z8;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            Object e8 = Q5.b.e();
            int i8 = this.f28193h;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        z8 = this.f28192g;
                        ArrayList arrayList12 = (ArrayList) this.f28190e;
                        ArrayList arrayList13 = (ArrayList) this.f28189d;
                        ArrayList arrayList14 = (ArrayList) this.f28188c;
                        ArrayList arrayList15 = (ArrayList) this.f28187b;
                        ArrayList arrayList16 = (ArrayList) this.f28186a;
                        L5.t.b(obj);
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList10 = arrayList14;
                        d8 = obj;
                        arrayList11 = arrayList15;
                        arrayList7 = arrayList16;
                        this.f28195j.f28172a.setValue(new AbstractC3337y.c(new b(arrayList7, arrayList11, arrayList10, arrayList8, arrayList9, new a(z8, ((Boolean) d8).booleanValue()))));
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ArrayList arrayList17 = (ArrayList) this.f28191f;
                arrayList4 = (ArrayList) this.f28190e;
                ArrayList arrayList18 = (ArrayList) this.f28189d;
                arrayList6 = (ArrayList) this.f28188c;
                arrayList = (ArrayList) this.f28187b;
                arrayList5 = (ArrayList) this.f28186a;
                L5.t.b(obj);
                arrayList2 = arrayList18;
                arrayList3 = arrayList17;
                g8 = obj;
            } else {
                L5.t.b(obj);
                if (this.f28194i) {
                    this.f28195j.f28172a.setValue(AbstractC3337y.a.f34533a);
                }
                ArrayList A8 = new C3319g().A(this.f28196k);
                C3326n a8 = C3326n.f34490t.a(this.f28196k);
                a8.a();
                ArrayList arrayList19 = new ArrayList();
                arrayList = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                arrayList2 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                Iterator it = A8.iterator();
                while (it.hasNext()) {
                    C1496f c1496f = (C1496f) it.next();
                    if (c1496f.i0(this.f28196k)) {
                        if (c1496f.i() == 1) {
                            c1496f.J0(C1496f.c.OUTDATED);
                            arrayList20.add(c1496f);
                        } else {
                            String Q8 = c1496f.Q();
                            AbstractC3159y.f(Q8);
                            O u02 = a8.u0(Q8);
                            if (u02 == null) {
                                if (c1496f.j0()) {
                                    c1496f.J0(C1496f.c.UPDATED);
                                    arrayList2.add(c1496f);
                                }
                            } else if (u02.f() == 1) {
                                arrayList20.add(c1496f);
                            } else {
                                c1496f.J0(C1496f.c.OUTDATED);
                                N4.f fVar = new N4.f();
                                Context context = this.f28196k;
                                String Q9 = c1496f.Q();
                                AbstractC3159y.f(Q9);
                                if (fVar.p(context, Q9)) {
                                    arrayList.add(c1496f);
                                } else {
                                    arrayList19.add(c1496f);
                                }
                            }
                            if (u02 != null && u02.k() == 0) {
                                u02.V(1);
                                a8.r1(u02);
                            }
                        }
                    }
                    UptodownApp.a aVar = UptodownApp.f27990B;
                    if (aVar.w() != null) {
                        ArrayList w8 = aVar.w();
                        AbstractC3159y.f(w8);
                        Iterator it2 = w8.iterator();
                        while (it2.hasNext()) {
                            X4.C c8 = (X4.C) it2.next();
                            if (AbstractC3159y.d(c8.c(), c1496f.X())) {
                                c1496f.E0(c8);
                                arrayList21.add(c1496f);
                            }
                        }
                    }
                }
                C3319g.a aVar2 = C3319g.f34476a;
                aVar2.c(arrayList19, this.f28196k);
                aVar2.e(arrayList2);
                aVar2.c(arrayList20, this.f28196k);
                aVar2.c(arrayList, this.f28196k);
                ArrayList<O> v02 = a8.v0();
                a8.g();
                arrayList3 = new ArrayList();
                for (O o8 : v02) {
                    Iterator it3 = arrayList19.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC3159y.d(o8.n(), ((C1496f) it3.next()).Q())) {
                            arrayList3.add(o8);
                        }
                    }
                }
                D d9 = this.f28195j;
                this.f28186a = arrayList19;
                this.f28187b = arrayList;
                this.f28188c = arrayList20;
                this.f28189d = arrayList2;
                this.f28190e = arrayList21;
                this.f28191f = arrayList3;
                this.f28193h = 1;
                g8 = d9.g(v02, arrayList19, this);
                if (g8 == e8) {
                    return e8;
                }
                arrayList4 = arrayList21;
                arrayList5 = arrayList19;
                arrayList6 = arrayList20;
            }
            boolean booleanValue = ((Boolean) g8).booleanValue();
            D d10 = this.f28195j;
            Context context2 = this.f28196k;
            this.f28186a = arrayList5;
            this.f28187b = arrayList;
            this.f28188c = arrayList6;
            this.f28189d = arrayList2;
            this.f28190e = arrayList4;
            this.f28191f = null;
            this.f28192g = booleanValue;
            this.f28193h = 2;
            d8 = d10.d(context2, arrayList3, booleanValue, this);
            if (d8 == e8) {
                return e8;
            }
            z8 = booleanValue;
            arrayList7 = arrayList5;
            arrayList8 = arrayList2;
            arrayList9 = arrayList4;
            ArrayList arrayList22 = arrayList;
            arrayList10 = arrayList6;
            arrayList11 = arrayList22;
            this.f28195j.f28172a.setValue(new AbstractC3337y.c(new b(arrayList7, arrayList11, arrayList10, arrayList8, arrayList9, new a(z8, ((Boolean) d8).booleanValue()))));
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f28198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ArrayList arrayList, ArrayList arrayList2, P5.d dVar) {
            super(2, dVar);
            this.f28198b = arrayList;
            this.f28199c = arrayList2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28198b, this.f28199c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28197a == 0) {
                L5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(this.f28198b);
                int size = arrayList2.size();
                boolean z8 = false;
                for (int i8 = 0; i8 < size; i8++) {
                    Iterator it = this.f28199c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            O o8 = (O) it.next();
                            String Q8 = ((C1496f) arrayList2.get(i8)).Q();
                            if (Q8 != null && g6.n.s(Q8, o8.n(), true) && ((C1496f) arrayList2.get(i8)).i() == 0) {
                                arrayList.add(o8);
                                break;
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    z8 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public D() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34533a);
        this.f28172a = a8;
        this.f28173b = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Context context, ArrayList arrayList, boolean z8, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new c(z8, context, arrayList, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(ArrayList arrayList, ArrayList arrayList2, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new e(arrayList2, arrayList, null), dVar);
    }

    public final void e(Context context, boolean z8) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(z8, this, context, null), 2, null);
    }

    public final InterfaceC3349K f() {
        return this.f28173b;
    }
}
