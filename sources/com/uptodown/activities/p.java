package com.uptodown.activities;

import M5.AbstractC1246t;
import X4.C1496f;
import X4.C1498h;
import X4.z;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.p;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l5.C3319g;
import l5.C3329q;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class p extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29281a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29282b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29283c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f29284d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29285e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29286f;

    /* renamed from: g, reason: collision with root package name */
    private int f29287g;

    /* renamed from: h, reason: collision with root package name */
    private int f29288h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C1496f f29289a;

        /* renamed from: b, reason: collision with root package name */
        private final C1498h f29290b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f29291c;

        public a(C1496f c1496f, C1498h appInfo, boolean z8) {
            AbstractC3159y.i(appInfo, "appInfo");
            this.f29289a = c1496f;
            this.f29290b = appInfo;
            this.f29291c = z8;
        }

        public final C1496f a() {
            return this.f29289a;
        }

        public final C1498h b() {
            return this.f29290b;
        }

        public final boolean c() {
            return this.f29291c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f29289a, aVar.f29289a) && AbstractC3159y.d(this.f29290b, aVar.f29290b) && this.f29291c == aVar.f29291c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            C1496f c1496f = this.f29289a;
            int hashCode = (((c1496f == null ? 0 : c1496f.hashCode()) * 31) + this.f29290b.hashCode()) * 31;
            boolean z8 = this.f29291c;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "OldVersionsData(app=" + this.f29289a + ", appInfo=" + this.f29290b + ", isOldVersionsAvailable=" + this.f29291c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f29294c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, p pVar, P5.d dVar) {
            super(2, dVar);
            this.f29293b = context;
            this.f29294c = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int h(X4.z zVar, X4.z zVar2) {
            if (zVar != null && zVar2 != null) {
                long j8 = zVar2.j() - zVar.j();
                if (j8 == 0 && zVar.b() != null && zVar2.b() != null) {
                    String b8 = zVar2.b();
                    AbstractC3159y.f(b8);
                    long parseLong = Long.parseLong(b8);
                    String b9 = zVar.b();
                    AbstractC3159y.f(b9);
                    j8 = parseLong - Long.parseLong(b9);
                }
                return (int) j8;
            }
            return 0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29293b, this.f29294c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Q5.b.e();
            if (this.f29292a == 0) {
                L5.t.b(obj);
                C3312F c3312f = new C3312F(this.f29293b);
                Object value = this.f29294c.d().getValue();
                AbstractC3159y.f(value);
                X4.I B02 = c3312f.B0(((C1498h) value).i(), 20, this.f29294c.h());
                if (!B02.b() && B02.d() != null) {
                    String d8 = B02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        C3319g c3319g = new C3319g();
                        Context context = this.f29293b;
                        C1498h c1498h = (C1498h) this.f29294c.d().getValue();
                        if (c1498h != null) {
                            str = c1498h.y0();
                        } else {
                            str = null;
                        }
                        C1496f z8 = c3319g.z(context, str);
                        z.b bVar = X4.z.f12727h;
                        String d9 = B02.d();
                        AbstractC3159y.f(d9);
                        ArrayList a8 = bVar.a(d9);
                        if (a8 == null || a8.size() <= 0) {
                            l6.v vVar = this.f29294c.f29281a;
                            Object value2 = this.f29294c.d().getValue();
                            AbstractC3159y.f(value2);
                            vVar.setValue(new AbstractC3337y.c(new a(z8, (C1498h) value2, false)));
                        } else {
                            AbstractC1246t.B(a8, new Comparator() { // from class: com.uptodown.activities.q
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int h8;
                                    h8 = p.b.h((X4.z) obj2, (X4.z) obj3);
                                    return h8;
                                }
                            });
                            Object value3 = this.f29294c.d().getValue();
                            AbstractC3159y.f(value3);
                            ((C1498h) value3).y1(a8);
                            l6.v vVar2 = this.f29294c.f29281a;
                            Object value4 = this.f29294c.d().getValue();
                            AbstractC3159y.f(value4);
                            vVar2.setValue(new AbstractC3337y.c(new a(z8, (C1498h) value4, true)));
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29295a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29297c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f29298d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Context context, P5.d dVar) {
            super(2, dVar);
            this.f29297c = str;
            this.f29298d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29297c, this.f29298d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29295a == 0) {
                L5.t.b(obj);
                Object value = p.this.d().getValue();
                AbstractC3159y.f(value);
                if (((C1498h) value).y0() != null) {
                    Object value2 = p.this.d().getValue();
                    AbstractC3159y.f(value2);
                    if (g6.n.s(((C1498h) value2).y0(), this.f29297c, true) && (d8 = SettingsPreferences.f29309b.d(this.f29298d)) != null) {
                        File file = new File(new C3329q().f(this.f29298d), d8);
                        UptodownApp.a aVar = UptodownApp.f27990B;
                        Context context = this.f29298d;
                        Object value3 = p.this.d().getValue();
                        AbstractC3159y.f(value3);
                        aVar.Y(file, context, ((C1498h) value3).t0());
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public p() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34533a);
        this.f29281a = a8;
        this.f29282b = a8;
        this.f29283c = AbstractC3351M.a(null);
        this.f29284d = AbstractC3351M.a(null);
    }

    public final void b(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, this, null), 2, null);
    }

    public final l6.v c() {
        return this.f29283c;
    }

    public final l6.v d() {
        return this.f29284d;
    }

    public final InterfaceC3349K e() {
        return this.f29282b;
    }

    public final boolean f() {
        return this.f29286f;
    }

    public final boolean g() {
        return this.f29285e;
    }

    public final int h() {
        return this.f29287g;
    }

    public final int i() {
        return this.f29288h;
    }

    public final void j(Context context, String packageName) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(packageName, "packageName");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(packageName, context, null), 2, null);
    }

    public final void k(boolean z8) {
        this.f29286f = z8;
    }

    public final void l(boolean z8) {
        this.f29285e = z8;
    }

    public final void m(int i8) {
        this.f29287g = i8;
    }

    public final void n(int i8) {
        this.f29288h = i8;
    }
}
