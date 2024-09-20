package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.view.InterfaceC2462o;
import com.stripe.android.view.InterfaceC2464p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface c extends InterfaceC2462o {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2464p f25198a;

        public a(InterfaceC2464p host) {
            AbstractC3159y.i(host, "host");
            this.f25198a = host;
        }

        @Override // com.stripe.android.view.InterfaceC2462o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.a args) {
            AbstractC3159y.i(args, "args");
            this.f25198a.a(Stripe3ds2TransactionActivity.class, args.u(), com.stripe.android.b.f23453q.c(args.s()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f25199a;

        public b(ActivityResultLauncher launcher) {
            AbstractC3159y.i(launcher, "launcher");
            this.f25199a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2462o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.a args) {
            AbstractC3159y.i(args, "args");
            this.f25199a.launch(args);
        }
    }
}
