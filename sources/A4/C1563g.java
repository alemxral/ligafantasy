package a4;

import X3.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1563g extends FragmentFactory {

    /* renamed from: a, reason: collision with root package name */
    private final T3.m f13501a;

    /* renamed from: b, reason: collision with root package name */
    private final v f13502b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f13503c;

    /* renamed from: d, reason: collision with root package name */
    private final U3.c f13504d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f13505e;

    /* renamed from: f, reason: collision with root package name */
    private final Y3.g f13506f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f13507g;

    /* renamed from: h, reason: collision with root package name */
    private final P5.g f13508h;

    public C1563g(T3.m uiCustomization, v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, U3.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, Y3.g gVar, com.stripe.android.stripe3ds2.transaction.n intentData, P5.g workContext) {
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        AbstractC3159y.i(transactionTimer, "transactionTimer");
        AbstractC3159y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3159y.i(intentData, "intentData");
        AbstractC3159y.i(workContext, "workContext");
        this.f13501a = uiCustomization;
        this.f13502b = transactionTimer;
        this.f13503c = errorRequestExecutor;
        this.f13504d = errorReporter;
        this.f13505e = challengeActionHandler;
        this.f13506f = gVar;
        this.f13507g = intentData;
        this.f13508h = workContext;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public Fragment instantiate(ClassLoader classLoader, String className) {
        AbstractC3159y.i(classLoader, "classLoader");
        AbstractC3159y.i(className, "className");
        if (AbstractC3159y.d(className, com.stripe.android.stripe3ds2.views.c.class.getName())) {
            return new com.stripe.android.stripe3ds2.views.c(this.f13501a, this.f13502b, this.f13503c, this.f13504d, this.f13505e, this.f13506f, this.f13507g, this.f13508h);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        AbstractC3159y.f(instantiate);
        return instantiate;
    }
}
