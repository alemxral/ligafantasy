package F3;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
final class c implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.paymentdatacollection.polling.b f2463a;

    public c(com.stripe.android.paymentsheet.paymentdatacollection.polling.b viewModel) {
        AbstractC3159y.i(viewModel, "viewModel");
        this.f2463a = viewModel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        AbstractC3159y.i(owner, "owner");
        androidx.lifecycle.c.e(this, owner);
        this.f2463a.r();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        AbstractC3159y.i(owner, "owner");
        this.f2463a.p();
        androidx.lifecycle.c.f(this, owner);
    }
}
