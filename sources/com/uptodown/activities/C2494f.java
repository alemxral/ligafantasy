package com.uptodown.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.AbstractC3337y;
import l5.C3312F;
import l5.C3330r;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONObject;

/* renamed from: com.uptodown.activities.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2494f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29194a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29195b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29196c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f29197d;

    /* renamed from: com.uptodown.activities.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f29198a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29199b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29200c;

        public a(int i8, String str, String str2) {
            this.f29198a = i8;
            this.f29199b = str;
            this.f29200c = str2;
        }

        public final String a() {
            return this.f29199b;
        }

        public final String b() {
            return this.f29200c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29198a == aVar.f29198a && AbstractC3159y.d(this.f29199b, aVar.f29199b) && AbstractC3159y.d(this.f29200c, aVar.f29200c);
        }

        public int hashCode() {
            int i8 = this.f29198a * 31;
            String str = this.f29199b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f29200c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "LoginData(loginResult=" + this.f29198a + ", loginMessage=" + this.f29199b + ", regErrors=" + this.f29200c + ')';
        }
    }

    /* renamed from: com.uptodown.activities.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f29201a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29202b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29203c;

        public b(int i8, String str, String str2) {
            this.f29201a = i8;
            this.f29202b = str;
            this.f29203c = str2;
        }

        public final String a() {
            return this.f29203c;
        }

        public final String b() {
            return this.f29202b;
        }

        public final int c() {
            return this.f29201a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f29201a == bVar.f29201a && AbstractC3159y.d(this.f29202b, bVar.f29202b) && AbstractC3159y.d(this.f29203c, bVar.f29203c);
        }

        public int hashCode() {
            int i8 = this.f29201a * 31;
            String str = this.f29202b;
            int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f29203c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SignUpData(success=" + this.f29201a + ", signUpMessage=" + this.f29202b + ", regErrors=" + this.f29203c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29204a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29206c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29207d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29208e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f29209f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29210g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f29211h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f29212i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, T t8, Q q8, T t9, T t10, P5.d dVar) {
            super(2, dVar);
            this.f29206c = context;
            this.f29207d = str;
            this.f29208e = str2;
            this.f29209f = t8;
            this.f29210g = q8;
            this.f29211h = t9;
            this.f29212i = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29206c, this.f29207d, this.f29208e, this.f29209f, this.f29210g, this.f29211h, this.f29212i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29204a == 0) {
                L5.t.b(obj);
                C2494f.this.f29194a.setValue(AbstractC3337y.a.f34533a);
                X4.I A02 = new C3312F(this.f29206c).A0(this.f29207d, this.f29208e);
                if (!A02.b() && (d8 = A02.d()) != null && d8.length() != 0) {
                    T t8 = new T();
                    String d9 = A02.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    t8.f33747a = jSONObject;
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = ((JSONObject) t8.f33747a).getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                        t8.f33747a = jSONObject2;
                        T t9 = this.f29209f;
                        X4.Q q8 = new X4.Q();
                        q8.j(this.f29206c, (JSONObject) t8.f33747a);
                        t9.f33747a = q8;
                        String J8 = SettingsPreferences.f29309b.J(this.f29206c);
                        if (J8 != null && J8.length() != 0) {
                            X4.Q q9 = (X4.Q) this.f29209f.f33747a;
                            if (q9 != null) {
                                q9.L(this.f29206c);
                            }
                            this.f29210g.f33745a = 1;
                        } else {
                            X4.Q.f12424k.b(this.f29206c);
                        }
                        if (!((JSONObject) t8.f33747a).isNull("message")) {
                            this.f29211h.f33747a = ((JSONObject) t8.f33747a).getString("message");
                        }
                    }
                    this.f29212i.f33747a = A02.g((JSONObject) t8.f33747a);
                }
                if (this.f29209f.f33747a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signin");
                    new C3330r(this.f29206c).b("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("responseCode", String.valueOf(A02.e()));
                    String c8 = A02.c();
                    if (c8 != null && c8.length() != 0) {
                        String c9 = A02.c();
                        AbstractC3159y.f(c9);
                        bundle2.putString("exception", c9);
                    }
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signin");
                    new C3330r(this.f29206c).b("login", bundle2);
                }
                C2494f.this.f29194a.setValue(new AbstractC3337y.c(new a(this.f29210g.f33745a, (String) this.f29211h.f33747a, (String) this.f29212i.f33747a)));
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.f$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29213a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29215c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29216d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29217e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f29218f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f29219g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f29220h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ T f29221i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, String str2, String str3, Q q8, T t8, T t9, P5.d dVar) {
            super(2, dVar);
            this.f29215c = context;
            this.f29216d = str;
            this.f29217e = str2;
            this.f29218f = str3;
            this.f29219g = q8;
            this.f29220h = t8;
            this.f29221i = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29215c, this.f29216d, this.f29217e, this.f29218f, this.f29219g, this.f29220h, this.f29221i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29213a == 0) {
                L5.t.b(obj);
                C2494f.this.f29196c.setValue(AbstractC3337y.a.f34533a);
                X4.I R02 = new C3312F(this.f29215c).R0(this.f29216d, this.f29217e, this.f29218f);
                if (!R02.b() && (d8 = R02.d()) != null && d8.length() != 0) {
                    String d9 = R02.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success")) {
                        this.f29219g.f33745a = jSONObject.getInt("success");
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("message")) {
                            this.f29220h.f33747a = jSONObject2.getString("message");
                        }
                    }
                    this.f29221i.f33747a = R02.g(jSONObject);
                }
                if (this.f29219g.f33745a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "success");
                    bundle.putString("loginSource", "signup");
                    new C3330r(this.f29215c).b("login", bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "fail");
                    bundle2.putString("loginSource", "signup");
                    bundle2.putString("responseCode", String.valueOf(R02.e()));
                    if (R02.c() != null) {
                        String c8 = R02.c();
                        AbstractC3159y.f(c8);
                        bundle2.putString("exception", c8);
                    }
                    new C3330r(this.f29215c).b("login", bundle2);
                }
                C2494f.this.f29196c.setValue(new AbstractC3337y.c(new b(this.f29219g.f33745a, (String) this.f29220h.f33747a, (String) this.f29221i.f33747a)));
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C2494f() {
        AbstractC3337y.b bVar = AbstractC3337y.b.f34534a;
        l6.v a8 = AbstractC3351M.a(bVar);
        this.f29194a = a8;
        this.f29195b = a8;
        l6.v a9 = AbstractC3351M.a(bVar);
        this.f29196c = a9;
        this.f29197d = a9;
    }

    public final void c(Context context, String username, String password) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(password, "password");
        Q q8 = new Q();
        q8.f33745a = -2;
        T t8 = new T();
        T t9 = new T();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, username, password, new T(), q8, t8, t9, null), 2, null);
    }

    public final void d(Context context, String username, String email, String pass) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(pass, "pass");
        T t8 = new T();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(context, username, pass, email, new Q(), t8, new T(), null), 2, null);
    }

    public final InterfaceC3349K e() {
        return this.f29195b;
    }

    public final InterfaceC3349K f() {
        return this.f29197d;
    }

    public final boolean g(String username, String password) {
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(password, "password");
        if (username.length() > 0 && password.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean h(String username, String email, String password) {
        AbstractC3159y.i(username, "username");
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(password, "password");
        if (username.length() > 0 && email.length() > 0 && password.length() > 5) {
            return true;
        }
        return false;
    }

    public final boolean i(String email) {
        AbstractC3159y.i(email, "email");
        return Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(email).matches();
    }
}
