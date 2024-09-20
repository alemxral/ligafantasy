package j6;

import L5.I;
import P5.g;
import android.os.Handler;
import android.os.Looper;
import d6.m;
import i6.B0;
import i6.C2812b0;
import i6.InterfaceC2816d0;
import i6.InterfaceC2837o;
import i6.M0;
import i6.W;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: j6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3093d extends AbstractC3094e implements W {
    private volatile C3093d _immediate;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f33270a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33271b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33272c;

    /* renamed from: d, reason: collision with root package name */
    private final C3093d f33273d;

    /* renamed from: j6.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2837o f33274a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3093d f33275b;

        public a(InterfaceC2837o interfaceC2837o, C3093d c3093d) {
            this.f33274a = interfaceC2837o;
            this.f33275b = c3093d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33274a.w(this.f33275b, I.f6474a);
        }
    }

    /* renamed from: j6.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f33277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f33277b = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f6474a;
        }

        public final void invoke(Throwable th) {
            C3093d.this.f33270a.removeCallbacks(this.f33277b);
        }
    }

    private C3093d(Handler handler, String str, boolean z8) {
        super(null);
        this.f33270a = handler;
        this.f33271b = str;
        this.f33272c = z8;
        this._immediate = z8 ? this : null;
        C3093d c3093d = this._immediate;
        if (c3093d == null) {
            c3093d = new C3093d(handler, str, true);
            this._immediate = c3093d;
        }
        this.f33273d = c3093d;
    }

    private final void J(g gVar, Runnable runnable) {
        B0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2812b0.b().dispatch(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(C3093d c3093d, Runnable runnable) {
        c3093d.f33270a.removeCallbacks(runnable);
    }

    @Override // j6.AbstractC3094e
    /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C3093d G() {
        return this.f33273d;
    }

    @Override // i6.I
    public void dispatch(g gVar, Runnable runnable) {
        if (!this.f33270a.post(runnable)) {
            J(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3093d) && ((C3093d) obj).f33270a == this.f33270a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f33270a);
    }

    @Override // i6.I
    public boolean isDispatchNeeded(g gVar) {
        if (this.f33272c && AbstractC3159y.d(Looper.myLooper(), this.f33270a.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // i6.W
    public void o(long j8, InterfaceC2837o interfaceC2837o) {
        a aVar = new a(interfaceC2837o, this);
        if (this.f33270a.postDelayed(aVar, m.h(j8, 4611686018427387903L))) {
            interfaceC2837o.j(new b(aVar));
        } else {
            J(interfaceC2837o.getContext(), aVar);
        }
    }

    @Override // i6.I
    public String toString() {
        String F8 = F();
        if (F8 == null) {
            String str = this.f33271b;
            if (str == null) {
                str = this.f33270a.toString();
            }
            if (this.f33272c) {
                return str + ".immediate";
            }
            return str;
        }
        return F8;
    }

    @Override // i6.W
    public InterfaceC2816d0 w(long j8, final Runnable runnable, g gVar) {
        if (this.f33270a.postDelayed(runnable, m.h(j8, 4611686018427387903L))) {
            return new InterfaceC2816d0() { // from class: j6.c
                @Override // i6.InterfaceC2816d0
                public final void dispose() {
                    C3093d.L(C3093d.this, runnable);
                }
            };
        }
        J(gVar, runnable);
        return M0.f31704a;
    }

    public /* synthetic */ C3093d(Handler handler, String str, int i8, AbstractC3151p abstractC3151p) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    public C3093d(Handler handler, String str) {
        this(handler, str, false);
    }
}
