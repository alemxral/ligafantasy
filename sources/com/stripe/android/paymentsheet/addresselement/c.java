package com.stripe.android.paymentsheet.addresselement;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import e6.InterfaceC2643c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import x3.AbstractC3905f;

/* loaded from: classes4.dex */
public final class c extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f25564a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f25565b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f25566c;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f25567a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f25568b;

        public a(Function0 applicationSupplier, Function0 starterArgsSupplier) {
            AbstractC3159y.i(applicationSupplier, "applicationSupplier");
            AbstractC3159y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f25567a = applicationSupplier;
            this.f25568b = starterArgsSupplier;
        }

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
            c a8 = AbstractC3905f.a().a((Context) this.f25567a.invoke()).b((AddressElementActivityContract.a) this.f25568b.invoke()).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AddressElementViewModel.Factory.create");
            return a8;
        }
    }

    public c(com.stripe.android.paymentsheet.addresselement.a navigator, I5.a inputAddressViewModelSubcomponentBuilderProvider, I5.a autoCompleteViewModelSubcomponentBuilderProvider) {
        AbstractC3159y.i(navigator, "navigator");
        AbstractC3159y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        AbstractC3159y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        this.f25564a = navigator;
        this.f25565b = inputAddressViewModelSubcomponentBuilderProvider;
        this.f25566c = autoCompleteViewModelSubcomponentBuilderProvider;
    }

    public final I5.a a() {
        return this.f25566c;
    }

    public final I5.a b() {
        return this.f25565b;
    }

    public final com.stripe.android.paymentsheet.addresselement.a c() {
        return this.f25564a;
    }
}
