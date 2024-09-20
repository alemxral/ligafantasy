package z3;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import X5.n;
import androidx.recyclerview.widget.ItemTouchHelper;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import i6.AbstractC2829k;
import i6.M;
import i6.X;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.v;
import v4.g;
import z3.InterfaceC4021c;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4020b {

    /* renamed from: a, reason: collision with root package name */
    private final M f40051a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f40052b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f40053c;

    /* renamed from: d, reason: collision with root package name */
    private final v f40054d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f40055e;

    /* renamed from: z3.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40056a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4021c invoke(List it) {
            AbstractC3159y.i(it, "it");
            return (InterfaceC4021c) AbstractC1246t.y0(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0923b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f40057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f40058b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4020b f40059c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0923b(Function0 function0, C4020b c4020b, P5.d dVar) {
            super(2, dVar);
            this.f40058b = function0;
            this.f40059c = c4020b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0923b(this.f40058b, this.f40059c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0923b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f40057a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C2758a.C0756a c0756a = C2758a.f31395b;
                long s8 = AbstractC2760c.s(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, EnumC2761d.f31404d);
                this.f40057a = 1;
                if (X.c(s8, this) == e8) {
                    return e8;
                }
            }
            this.f40058b.invoke();
            this.f40059c.f40053c.set(false);
            return I.f6474a;
        }
    }

    /* renamed from: z3.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5627invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5627invoke() {
            C4020b.this.j();
        }
    }

    /* renamed from: z3.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4021c f40062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC4021c interfaceC4021c) {
            super(0);
            this.f40062b = interfaceC4021c;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5628invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5628invoke() {
            C4020b.this.n(this.f40062b);
        }
    }

    public C4020b(M coroutineScope, Function1 poppedScreenHandler) {
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        AbstractC3159y.i(poppedScreenHandler, "poppedScreenHandler");
        this.f40051a = coroutineScope;
        this.f40052b = poppedScreenHandler;
        this.f40053c = new AtomicBoolean(false);
        v a8 = AbstractC3351M.a(AbstractC1246t.e(InterfaceC4021c.g.f40114a));
        this.f40054d = a8;
        this.f40055e = g.m(a8, a.f40056a);
    }

    private final void g(Function0 function0) {
        if (!this.f40053c.getAndSet(true)) {
            AbstractC2829k.d(this.f40051a, null, null, new C0923b(function0, this, null), 3, null);
        }
    }

    private final void h(InterfaceC4021c interfaceC4021c) {
        if (interfaceC4021c instanceof Closeable) {
            ((Closeable) interfaceC4021c).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        Object value;
        List Z02;
        v vVar = this.f40054d;
        do {
            value = vVar.getValue();
            Z02 = AbstractC1246t.Z0((List) value);
            InterfaceC4021c interfaceC4021c = (InterfaceC4021c) AbstractC1246t.P(Z02);
            h(interfaceC4021c);
            this.f40052b.invoke(interfaceC4021c);
        } while (!vVar.a(value, AbstractC1246t.W0(Z02)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(InterfaceC4021c interfaceC4021c) {
        Object value;
        v vVar = this.f40054d;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, AbstractC1246t.H0(AbstractC1246t.E0((List) value, InterfaceC4021c.g.f40114a), interfaceC4021c)));
    }

    public final void d() {
        Iterator it = ((Iterable) this.f40054d.getValue()).iterator();
        while (it.hasNext()) {
            h((InterfaceC4021c) it.next());
        }
    }

    public final boolean e() {
        if (((List) this.f40054d.getValue()).size() > 1) {
            return true;
        }
        return false;
    }

    public final InterfaceC3349K f() {
        return this.f40055e;
    }

    public final void i() {
        if (!this.f40053c.get()) {
            j();
        }
    }

    public final void k() {
        g(new c());
    }

    public final void l(List screens) {
        AbstractC3159y.i(screens, "screens");
        if (!this.f40053c.get()) {
            List<InterfaceC4021c> list = (List) this.f40054d.getValue();
            this.f40054d.setValue(screens);
            for (InterfaceC4021c interfaceC4021c : list) {
                if (!screens.contains(interfaceC4021c)) {
                    h(interfaceC4021c);
                }
            }
        }
    }

    public final void m(InterfaceC4021c target) {
        AbstractC3159y.i(target, "target");
        if (!this.f40053c.get()) {
            n(target);
        }
    }

    public final void o(InterfaceC4021c target) {
        AbstractC3159y.i(target, "target");
        g(new d(target));
    }
}
