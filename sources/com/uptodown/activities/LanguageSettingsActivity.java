package com.uptodown.activities;

import D4.C1108q;
import L5.InterfaceC1227k;
import X4.C1511v;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.activities.LanguageSettingsActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2829k;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3326n;

/* loaded from: classes4.dex */
public final class LanguageSettingsActivity extends AbstractActivityC2489a {

    /* renamed from: O, reason: collision with root package name */
    private C1108q f28346O;

    /* renamed from: P, reason: collision with root package name */
    private b f28347P = new b();

    /* renamed from: Q, reason: collision with root package name */
    private final InterfaceC1227k f28348Q = L5.l.b(new a());

    /* renamed from: R, reason: collision with root package name */
    private final LifecycleCoroutineScope f28349R = LifecycleOwnerKt.getLifecycleScope(this);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.J invoke() {
            return T4.J.c(LanguageSettingsActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements W4.u {
        b() {
        }

        @Override // W4.u
        public void a(C1511v lang) {
            AbstractC3159y.i(lang, "lang");
            if (lang.a() != null) {
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                String a8 = lang.a();
                AbstractC3159y.f(a8);
                languageSettingsActivity.h3(a8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28352a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28353b;

        /* renamed from: d, reason: collision with root package name */
        int f28355d;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28353b = obj;
            this.f28355d |= Integer.MIN_VALUE;
            return LanguageSettingsActivity.this.j3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28356a;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28356a == 0) {
                L5.t.b(obj);
                LanguageSettingsActivity.this.i3().f10167b.f10172b.setVisibility(0);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28358a;

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28358a == 0) {
                L5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                String[] stringArray = LanguageSettingsActivity.this.getResources().getStringArray(R.array.languages);
                AbstractC3159y.h(stringArray, "resources.getStringArray(R.array.languages)");
                String[] stringArray2 = LanguageSettingsActivity.this.getResources().getStringArray(R.array.languageCodes);
                AbstractC3159y.h(stringArray2, "resources.getStringArray(R.array.languageCodes)");
                String[] stringArray3 = LanguageSettingsActivity.this.getResources().getStringArray(R.array.localizedLang);
                AbstractC3159y.h(stringArray3, "resources.getStringArray(R.array.localizedLang)");
                int length = stringArray.length;
                for (int i8 = 0; i8 < length; i8++) {
                    String str = stringArray[i8];
                    C1511v c1511v = new C1511v();
                    c1511v.f(str);
                    c1511v.e(stringArray3[i8]);
                    c1511v.d(stringArray2[i8]);
                    arrayList.add(c1511v);
                }
                String q8 = SettingsPreferences.f29309b.q(LanguageSettingsActivity.this);
                if (q8 == null) {
                    q8 = "en";
                }
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                languageSettingsActivity.f28346O = new C1108q(arrayList, languageSettingsActivity.f28347P, q8);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28360a;

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28360a == 0) {
                L5.t.b(obj);
                RecyclerView recyclerView = LanguageSettingsActivity.this.i3().f10168c;
                C1108q c1108q = LanguageSettingsActivity.this.f28346O;
                if (c1108q == null) {
                    AbstractC3159y.y("adapter");
                    c1108q = null;
                }
                recyclerView.setAdapter(c1108q);
                LanguageSettingsActivity.this.i3().f10167b.f10172b.setVisibility(8);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28362a;

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28362a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                this.f28362a = 1;
                if (languageSettingsActivity.j3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h3(String str) {
        C3326n a8 = C3326n.f34490t.a(this);
        a8.a();
        a8.h1();
        a8.g();
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        aVar.K0(applicationContext, str);
        setResult(PointerIconCompat.TYPE_HELP);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T4.J i3() {
        return (T4.J) this.f28348Q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j3(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.LanguageSettingsActivity.c
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.LanguageSettingsActivity$c r0 = (com.uptodown.activities.LanguageSettingsActivity.c) r0
            int r1 = r0.f28355d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28355d = r1
            goto L18
        L13:
            com.uptodown.activities.LanguageSettingsActivity$c r0 = new com.uptodown.activities.LanguageSettingsActivity$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f28353b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f28355d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            L5.t.b(r8)
            goto L88
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.f28352a
            com.uptodown.activities.LanguageSettingsActivity r2 = (com.uptodown.activities.LanguageSettingsActivity) r2
            L5.t.b(r8)
            goto L74
        L40:
            java.lang.Object r2 = r0.f28352a
            com.uptodown.activities.LanguageSettingsActivity r2 = (com.uptodown.activities.LanguageSettingsActivity) r2
            L5.t.b(r8)
            goto L60
        L48:
            L5.t.b(r8)
            i6.J0 r8 = i6.C2812b0.c()
            com.uptodown.activities.LanguageSettingsActivity$d r2 = new com.uptodown.activities.LanguageSettingsActivity$d
            r2.<init>(r6)
            r0.f28352a = r7
            r0.f28355d = r5
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r2, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r2 = r7
        L60:
            i6.I r8 = i6.C2812b0.b()
            com.uptodown.activities.LanguageSettingsActivity$e r5 = new com.uptodown.activities.LanguageSettingsActivity$e
            r5.<init>(r6)
            r0.f28352a = r2
            r0.f28355d = r4
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r5, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            i6.J0 r8 = i6.C2812b0.c()
            com.uptodown.activities.LanguageSettingsActivity$f r4 = new com.uptodown.activities.LanguageSettingsActivity$f
            r4.<init>(r6)
            r0.f28352a = r6
            r0.f28355d = r3
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r4, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            L5.I r8 = L5.I.f6474a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.LanguageSettingsActivity.j3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(LanguageSettingsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(View view) {
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(i3().getRoot());
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                i3().f10169d.setNavigationIcon(drawable);
                i3().f10169d.setNavigationContentDescription(getString(R.string.back));
            }
            i3().f10170e.setTypeface(E4.j.f2272g.t());
            i3().f10169d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.S
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageSettingsActivity.k3(LanguageSettingsActivity.this, view);
                }
            });
            i3().f10167b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.T
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageSettingsActivity.l3(view);
                }
            });
            i3().f10168c.setLayoutManager(new LinearLayoutManager(this, 1, false));
            i3().f10168c.setItemAnimator(new DefaultItemAnimator());
            AbstractC2829k.d(this.f28349R, null, null, new g(null), 3, null);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
