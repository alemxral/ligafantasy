package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import L5.I;
import L5.t;
import M5.AbstractC1246t;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.c;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.d;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3340B;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.u;
import l6.v;
import l6.z;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final u f26156a;

    /* renamed from: b, reason: collision with root package name */
    private final z f26157b;

    /* renamed from: c, reason: collision with root package name */
    private final v f26158c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f26159d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f26160a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26161b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26162c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26163d;

        public a(String email, String nameOnAccount, String sortCode, String accountNumber) {
            AbstractC3159y.i(email, "email");
            AbstractC3159y.i(nameOnAccount, "nameOnAccount");
            AbstractC3159y.i(sortCode, "sortCode");
            AbstractC3159y.i(accountNumber, "accountNumber");
            this.f26160a = email;
            this.f26161b = nameOnAccount;
            this.f26162c = sortCode;
            this.f26163d = accountNumber;
        }

        public final String a() {
            return this.f26163d;
        }

        public final String b() {
            return this.f26160a;
        }

        public final String c() {
            return this.f26161b;
        }

        public final String d() {
            return this.f26162c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26160a, aVar.f26160a) && AbstractC3159y.d(this.f26161b, aVar.f26161b) && AbstractC3159y.d(this.f26162c, aVar.f26162c) && AbstractC3159y.d(this.f26163d, aVar.f26163d);
        }

        public int hashCode() {
            return (((((this.f26160a.hashCode() * 31) + this.f26161b.hashCode()) * 31) + this.f26162c.hashCode()) * 31) + this.f26163d.hashCode();
        }

        public String toString() {
            return "Args(email=" + this.f26160a + ", nameOnAccount=" + this.f26161b + ", sortCode=" + this.f26162c + ", accountNumber=" + this.f26163d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final BacsMandateConfirmationContract.a f26164a;

        public b(BacsMandateConfirmationContract.a args) {
            AbstractC3159y.i(args, "args");
            this.f26164a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            return new e(new a(this.f26164a.e(), this.f26164a.f(), this.f26164a.i(), this.f26164a.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26165a;

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26165a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                u uVar = e.this.f26156a;
                c.a aVar = c.a.f26149a;
                this.f26165a = 1;
                if (uVar.emit(aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26167a;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26167a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                u uVar = e.this.f26156a;
                c.C0627c c0627c = c.C0627c.f26151a;
                this.f26167a = 1;
                if (uVar.emit(c0627c, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0628e extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26169a;

        C0628e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0628e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0628e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26169a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                u uVar = e.this.f26156a;
                c.d dVar = c.d.f26152a;
                this.f26169a = 1;
                if (uVar.emit(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public e(a args) {
        AbstractC3159y.i(args, "args");
        u b8 = AbstractC3340B.b(0, 0, null, 7, null);
        this.f26156a = b8;
        this.f26157b = AbstractC3360h.a(b8);
        v a8 = AbstractC3351M.a(new D3.e(args.b(), args.c(), AbstractC1246t.w0(g6.n.O0(args.d(), 2), "-", null, null, 0, null, null, 62, null), args.a(), d(), b(), c()));
        this.f26158c = a8;
        this.f26159d = AbstractC3360h.b(a8);
    }

    private final InterfaceC3983b b() {
        int i8 = w.f37470y;
        InterfaceC3983b a8 = AbstractC3984c.a(w.f37471z);
        InterfaceC3983b a9 = AbstractC3984c.a(w.f37406A);
        int i9 = w.f37407B;
        return AbstractC3984c.f(i8, new Object[]{a8, a9, AbstractC3984c.a(i9), AbstractC3984c.a(i9)}, null, 4, null);
    }

    private final InterfaceC3983b c() {
        return AbstractC3984c.f(w.f37463r, new Object[]{AbstractC3984c.a(w.f37464s), AbstractC3984c.a(w.f37462q)}, null, 4, null);
    }

    private final InterfaceC3983b d() {
        return AbstractC3984c.a(w.f37467v);
    }

    private final void h() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    private final void i() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    private final void j() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new C0628e(null), 3, null);
    }

    public final z e() {
        return this.f26157b;
    }

    public final InterfaceC3349K f() {
        return this.f26159d;
    }

    public final void g(com.stripe.android.paymentsheet.paymentdatacollection.bacs.d action) {
        AbstractC3159y.i(action, "action");
        if (action instanceof d.b) {
            i();
        } else if (action instanceof d.c) {
            j();
        } else if (action instanceof d.a) {
            h();
        }
    }
}
