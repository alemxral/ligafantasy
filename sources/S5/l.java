package s5;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.inmobi.cmp.ChoiceCmp;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class l implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
        return n.a(this, interfaceC2643c, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return n.c(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass) {
        AbstractC3159y.i(modelClass, "modelClass");
        O7.d dVar = O7.d.f7793a;
        return new k(dVar.n(), dVar.j(), ChoiceCmp.INSTANCE.getGoogleVendorList$app_release(), dVar.j().f2373b.b(), dVar.c(), dVar.p(), dVar.j().f2377f.f5685j, dVar.j().f2373b.f2342l, dVar.j().f2373b.f2339i, dVar.j().f2373b.f2356z, dVar.j().f2373b.f2319H, dVar.e());
    }
}
