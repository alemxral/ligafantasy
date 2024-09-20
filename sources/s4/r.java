package S4;

import L5.I;
import L5.t;
import W4.D;
import X4.C1496f;
import X4.C1498h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3312F;
import l5.C3326n;
import l5.C3330r;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private Context f9597a;

    /* renamed from: b, reason: collision with root package name */
    private C1498h f9598b;

    /* renamed from: c, reason: collision with root package name */
    private C1496f f9599c;

    /* renamed from: d, reason: collision with root package name */
    private D f9600d;

    /* renamed from: e, reason: collision with root package name */
    private M f9601e;

    /* renamed from: f, reason: collision with root package name */
    private String f9602f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9603a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9603a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                r rVar = r.this;
                this.f9603a = 1;
                if (rVar.l(this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f6474a;
        }

        public final void invoke(Throwable th) {
            if (r.this.f9599c == null) {
                if (r.this.f9598b != null) {
                    r rVar = r.this;
                    C1498h c1498h = rVar.f9598b;
                    AbstractC3159y.f(c1498h);
                    String s02 = c1498h.s0();
                    AbstractC3159y.f(s02);
                    C1498h c1498h2 = r.this.f9598b;
                    AbstractC3159y.f(c1498h2);
                    String y02 = c1498h2.y0();
                    AbstractC3159y.f(y02);
                    rVar.j(s02, y02, r.this.f9602f);
                    return;
                }
                return;
            }
            r rVar2 = r.this;
            C1496f c1496f = rVar2.f9599c;
            AbstractC3159y.f(c1496f);
            String I8 = c1496f.I();
            AbstractC3159y.f(I8);
            C1496f c1496f2 = r.this.f9599c;
            AbstractC3159y.f(c1496f2);
            String Q8 = c1496f2.Q();
            AbstractC3159y.f(Q8);
            rVar2.j(I8, Q8, r.this.f9602f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9606a;

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
            Q5.b.e();
            if (this.f9606a == 0) {
                t.b(obj);
                if (r.this.f9599c != null) {
                    C1496f c1496f = r.this.f9599c;
                    AbstractC3159y.f(c1496f);
                    if (c1496f.e0() == null) {
                        r rVar = r.this;
                        Context context = rVar.f9597a;
                        C1496f c1496f2 = r.this.f9599c;
                        AbstractC3159y.f(c1496f2);
                        String Q8 = c1496f2.Q();
                        AbstractC3159y.f(Q8);
                        C1496f c1496f3 = r.this.f9599c;
                        AbstractC3159y.f(c1496f3);
                        String z8 = c1496f3.z();
                        AbstractC3159y.f(z8);
                        rVar.f9602f = rVar.i(context, Q8, z8);
                        C1496f c1496f4 = r.this.f9599c;
                        AbstractC3159y.f(c1496f4);
                        c1496f4.M0(r.this.f9602f);
                        C3326n a8 = C3326n.f34490t.a(r.this.f9597a);
                        a8.a();
                        C1496f c1496f5 = r.this.f9599c;
                        AbstractC3159y.f(c1496f5);
                        a8.m1(c1496f5);
                        a8.g();
                    } else {
                        r rVar2 = r.this;
                        C1496f c1496f6 = rVar2.f9599c;
                        AbstractC3159y.f(c1496f6);
                        rVar2.f9602f = c1496f6.e0();
                    }
                } else if (r.this.f9598b != null) {
                    C1498h c1498h = r.this.f9598b;
                    AbstractC3159y.f(c1498h);
                    if (c1498h.e1() == null) {
                        r rVar3 = r.this;
                        Context context2 = rVar3.f9597a;
                        C1498h c1498h2 = r.this.f9598b;
                        AbstractC3159y.f(c1498h2);
                        String y02 = c1498h2.y0();
                        AbstractC3159y.f(y02);
                        C1498h c1498h3 = r.this.f9598b;
                        AbstractC3159y.f(c1498h3);
                        String q02 = c1498h3.q0();
                        AbstractC3159y.f(q02);
                        rVar3.f9602f = rVar3.i(context2, y02, q02);
                    } else {
                        r rVar4 = r.this;
                        C1498h c1498h4 = rVar4.f9598b;
                        AbstractC3159y.f(c1498h4);
                        rVar4.f9602f = c1498h4.e1();
                    }
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public r(Context context, C1498h c1498h, C1496f c1496f, D d8, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(scope, "scope");
        this.f9597a = context;
        this.f9598b = c1498h;
        this.f9599c = c1496f;
        this.f9600d = d8;
        this.f9601e = scope;
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(Context context, String str, String str2) {
        int i8;
        X4.I n02 = new C3312F(context).n0(str, str2);
        if (n02.d() != null) {
            String d8 = n02.d();
            AbstractC3159y.f(d8);
            if (d8.length() > 0) {
                String d9 = n02.d();
                AbstractC3159y.f(d9);
                JSONObject jSONObject = new JSONObject(d9);
                if (!jSONObject.isNull("success")) {
                    i8 = jSONObject.getInt("success");
                } else {
                    i8 = 0;
                }
                if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (!jSONObject2.isNull("app_url")) {
                        return jSONObject2.getString("app_url");
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(String str, String str2, String str3) {
        if (str3 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(524288);
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.f9597a.getString(R.string.share_app_details_msg, str));
            intent.putExtra("android.intent.extra.TEXT", str3);
            Context context = this.f9597a;
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.option_button_share)));
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str2);
            new C3330r(this.f9597a).b("share_app", bundle);
            return;
        }
        D d8 = this.f9600d;
        if (d8 != null) {
            d8.a(str);
        }
    }

    private final void k() {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(this.f9601e, null, null, new a(null), 3, null);
        d8.u(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }
}
