package q3;

import M5.AbstractC1246t;
import androidx.lifecycle.SavedStateHandle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import y3.AbstractC3991f;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3649b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f37285f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f37286g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f37287a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f37288b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f37289c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f37290d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f37291e;

    /* renamed from: q3.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C3649b a(M3.a viewModel) {
            AbstractC3159y.i(viewModel, "viewModel");
            return new C3649b(viewModel.x(), viewModel.y());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: q3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0854b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0854b f37292a = new C0854b();

        C0854b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(I3.a aVar) {
            List f8;
            if (aVar == null || (f8 = aVar.f()) == null) {
                return AbstractC1246t.m();
            }
            return f8;
        }
    }

    public C3649b(SavedStateHandle savedStateHandle, InterfaceC3349K selection) {
        AbstractC3991f.C0916f c0916f;
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(selection, "selection");
        this.f37287a = savedStateHandle;
        this.f37288b = selection;
        InterfaceC3349K stateFlow = savedStateHandle.getStateFlow("customer_info", null);
        this.f37289c = stateFlow;
        this.f37290d = v4.g.m(stateFlow, C0854b.f37292a);
        Object value = selection.getValue();
        if (value instanceof AbstractC3991f.C0916f) {
            c0916f = (AbstractC3991f.C0916f) value;
        } else {
            c0916f = null;
        }
        this.f37291e = savedStateHandle.getStateFlow("saved_selection", c0916f != null ? c0916f.v() : null);
    }

    public final InterfaceC3349K a() {
        return this.f37289c;
    }

    public final InterfaceC3349K b() {
        return this.f37291e;
    }

    public final InterfaceC3349K c() {
        return this.f37290d;
    }

    public final void d(I3.a aVar) {
        this.f37287a.set("customer_info", aVar);
    }

    public final void e(com.stripe.android.model.o oVar) {
        this.f37287a.set("saved_selection", oVar);
    }
}
