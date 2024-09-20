package com.uptodown.receivers;

import L5.I;
import L5.t;
import P5.d;
import X4.O;
import X5.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3313a;
import l5.C3326n;
import l5.C3330r;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class MyAppUpdatedReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f29801a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29802a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f29804c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.receivers.MyAppUpdatedReceiver$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0711a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29805a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f29806b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0711a(BroadcastReceiver.PendingResult pendingResult, d dVar) {
                super(2, dVar);
                this.f29806b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0711a(this.f29806b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((C0711a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29805a == 0) {
                    t.b(obj);
                    this.f29806b.finish();
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BroadcastReceiver.PendingResult pendingResult, d dVar) {
            super(2, dVar);
            this.f29804c = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(this.f29804c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = Q5.b.e();
            int i8 = this.f29802a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    Context context = MyAppUpdatedReceiver.this.f29801a;
                    AbstractC3159y.f(context);
                    String myPackagename = context.getPackageName();
                    C3326n.a aVar = C3326n.f34490t;
                    Context context2 = MyAppUpdatedReceiver.this.f29801a;
                    AbstractC3159y.f(context2);
                    C3326n a8 = aVar.a(context2);
                    a8.a();
                    AbstractC3159y.h(myPackagename, "myPackagename");
                    O u02 = a8.u0(myPackagename);
                    if (u02 != null) {
                        str = u02.j();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
                        Context context3 = MyAppUpdatedReceiver.this.f29801a;
                        AbstractC3159y.f(context3);
                        if (aVar2.R(context3)) {
                            C3313a c3313a = new C3313a();
                            Context context4 = MyAppUpdatedReceiver.this.f29801a;
                            AbstractC3159y.f(context4);
                            c3313a.a(context4, u02.j());
                            C3313a c3313a2 = new C3313a();
                            Context context5 = MyAppUpdatedReceiver.this.f29801a;
                            AbstractC3159y.f(context5);
                            c3313a2.b(context5, u02.j());
                        }
                        a8.M(myPackagename);
                        String j8 = u02.j();
                        AbstractC3159y.f(j8);
                        a8.A(j8);
                    }
                    a8.t(myPackagename);
                    a8.g();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C2812b0.c();
                C0711a c0711a = new C0711a(this.f29804c, null);
                this.f29802a = 1;
                if (AbstractC2825i.g(c8, c0711a, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29807a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f29809c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BroadcastReceiver.PendingResult pendingResult, d dVar) {
            super(2, dVar);
            this.f29809c = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(this.f29809c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29807a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                MyAppUpdatedReceiver myAppUpdatedReceiver = MyAppUpdatedReceiver.this;
                BroadcastReceiver.PendingResult pendingResult = this.f29809c;
                AbstractC3159y.h(pendingResult, "pendingResult");
                this.f29807a = 1;
                if (myAppUpdatedReceiver.c(pendingResult, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(BroadcastReceiver.PendingResult pendingResult, d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new a(pendingResult, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context != null) {
            this.f29801a = context;
            Bundle bundle = new Bundle();
            bundle.putString("packagename", context.getPackageName());
            bundle.putString("type", "success");
            bundle.putInt("update", 1);
            new C3330r(context).b("install", bundle);
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            aVar.X0(context, false);
            aVar.c1(context, false);
            aVar.i1(context, null);
            C3335w.f34532a.f(context);
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new b(goAsync(), null), 3, null);
        }
    }
}
