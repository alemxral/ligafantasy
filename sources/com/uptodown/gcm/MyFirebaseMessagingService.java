package com.uptodown.gcm;

import L5.I;
import L5.t;
import P5.d;
import X4.x;
import X5.n;
import android.app.Activity;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.O;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.S;
import l5.C3307A;
import l5.C3319g;

/* loaded from: classes5.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f29785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29786c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MyFirebaseMessagingService f29787d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29788e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f29789f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.gcm.MyFirebaseMessagingService$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0710a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29790a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f29791b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29792c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f29793d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0710a(String str, String str2, long j8, d dVar) {
                super(2, dVar);
                this.f29791b = str;
                this.f29792c = str2;
                this.f29793d = j8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0710a(this.f29791b, this.f29792c, this.f29793d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((C0710a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29790a == 0) {
                    t.b(obj);
                    if (UptodownApp.f27990B.Q()) {
                        C3307A c3307a = C3307A.f34459a;
                        if (c3307a.d().size() > 0) {
                            Object obj2 = c3307a.d().get(c3307a.d().size() - 1);
                            AbstractC3159y.h(obj2, "StaticResources.activity….activity_stack.size - 1]");
                            Activity activity = (Activity) obj2;
                            if (activity instanceof AbstractActivityC2489a) {
                                ((AbstractActivityC2489a) activity).g2(this.f29791b, this.f29792c, this.f29793d);
                            }
                        }
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, String str, MyFirebaseMessagingService myFirebaseMessagingService, String str2, String str3, d dVar) {
            super(2, dVar);
            this.f29785b = j8;
            this.f29786c = str;
            this.f29787d = myFirebaseMessagingService;
            this.f29788e = str2;
            this.f29789f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(this.f29785b, this.f29786c, this.f29787d, this.f29788e, this.f29789f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29784a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                x xVar = new x();
                xVar.j(this.f29785b);
                xVar.m(this.f29786c);
                Context applicationContext = this.f29787d.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                xVar.n(applicationContext);
                J0 c8 = C2812b0.c();
                C0710a c0710a = new C0710a(this.f29788e, this.f29789f, this.f29785b, null);
                this.f29784a = 1;
                if (AbstractC2825i.g(c8, c0710a, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29794a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29796c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29797d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S f29798e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f29799f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, S s8, String str3, d dVar) {
            super(2, dVar);
            this.f29796c = str;
            this.f29797d = str2;
            this.f29798e = s8;
            this.f29799f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(this.f29796c, this.f29797d, this.f29798e, this.f29799f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29794a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                MyFirebaseMessagingService myFirebaseMessagingService = MyFirebaseMessagingService.this;
                String str = this.f29796c;
                String str2 = this.f29797d;
                long j8 = this.f29798e.f33746a;
                String str3 = this.f29799f;
                this.f29794a = 1;
                if (myFirebaseMessagingService.w(str, str2, j8, str3, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(String str, String str2, long j8, String str3, d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new a(j8, str3, this, str, str2, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    private final void x(String str) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(O remoteMessage) {
        String str;
        AbstractC3159y.i(remoteMessage, "remoteMessage");
        AbstractC3159y.h(remoteMessage.s(), "remoteMessage.data");
        if ((!r0.isEmpty()) && (str = (String) remoteMessage.s().get("appId")) != null) {
            S s8 = new S();
            s8.f33746a = -1L;
            try {
                s8.f33746a = Long.parseLong(str);
            } catch (NumberFormatException e8) {
                e8.printStackTrace();
            }
            if (s8.f33746a > 0) {
                String str2 = (String) remoteMessage.s().get("packageName");
                if (!new C3319g().r(str2, getApplicationContext()) && remoteMessage.u() != null) {
                    O.b u8 = remoteMessage.u();
                    AbstractC3159y.f(u8);
                    String a8 = u8.a();
                    O.b u9 = remoteMessage.u();
                    AbstractC3159y.f(u9);
                    AbstractC2829k.d(N.a(C2812b0.b()), null, null, new b(u9.c(), a8, s8, str2, null), 3, null);
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String token) {
        AbstractC3159y.i(token, "token");
        x(token);
    }
}
