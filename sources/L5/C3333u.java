package l5;

import L5.I;
import X4.Q;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3333u {

    /* renamed from: a, reason: collision with root package name */
    private Q f34521a;

    /* renamed from: b, reason: collision with root package name */
    private String f34522b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34523c;

    /* renamed from: l5.u$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f34525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34526c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f34527d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3333u f34528e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, String str2, C3333u c3333u, P5.d dVar) {
            super(2, dVar);
            this.f34525b = context;
            this.f34526c = str;
            this.f34527d = str2;
            this.f34528e = c3333u;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f34525b, this.f34526c, this.f34527d, this.f34528e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
        
            if (r3 != false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
        
            if (r3 != false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0122, code lost:
        
            if (r3 != false) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[Catch: all -> 0x0053, JSONException -> 0x0056, TryCatch #1 {JSONException -> 0x0056, blocks: (B:5:0x0014, B:7:0x0029, B:9:0x002f, B:11:0x003c, B:13:0x004e, B:15:0x005c, B:17:0x0062, B:19:0x0088, B:24:0x0094, B:38:0x00a0, B:40:0x00ac), top: B:4:0x0014, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l5.C3333u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context, String str, X4.I i8) {
        this.f34523c = true;
        Q.f12424k.b(context);
        this.f34521a = null;
        if (str != null) {
            this.f34522b = str;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "fail");
        bundle.putString("loginSource", "google");
        if (i8 != null) {
            bundle.putString("responseCode", String.valueOf(i8.e()));
            if (i8.c() != null) {
                String c8 = i8.c();
                AbstractC3159y.f(c8);
                bundle.putString("exception", c8);
            }
        }
        new C3330r(context).b("login", bundle);
    }

    public final String b() {
        return this.f34522b;
    }

    public final Q c() {
        return this.f34521a;
    }

    public final com.google.android.gms.auth.api.signin.b d(Context context) {
        AbstractC3159y.i(context, "context");
        GoogleSignInOptions a8 = new GoogleSignInOptions.a(GoogleSignInOptions.f15028l).b().d("699621046070-qajra0rrsahiqmumvkg7fagujfd78tm8.apps.googleusercontent.com").a();
        AbstractC3159y.h(a8, "Builder(GoogleSignInOpti…om\")\n            .build()");
        com.google.android.gms.auth.api.signin.b a9 = com.google.android.gms.auth.api.signin.a.a(context, a8);
        AbstractC3159y.h(a9, "getClient(context, gso)");
        return a9;
    }

    public final boolean e() {
        return this.f34523c;
    }

    public final void f(Context context) {
        AbstractC3159y.i(context, "context");
        new C3333u().d(context).u();
    }

    public final Object g(String str, String str2, Context context, P5.d dVar) {
        this.f34521a = new Q();
        Object g8 = AbstractC2825i.g(C2812b0.b(), new a(context, str, str2, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    public final void i(boolean z8) {
        this.f34523c = z8;
    }

    public final void j(String str) {
        this.f34522b = str;
    }

    public final void k(Q q8) {
        this.f34521a = q8;
    }
}
