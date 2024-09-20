package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1370f0;
import X4.C1498h;
import X4.K;
import X4.Q;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.snackbar.Snackbar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.t;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3307A;
import l5.C3330r;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class ReviewsActivity extends AbstractActivityC2489a implements W4.A {

    /* renamed from: S, reason: collision with root package name */
    public static final a f28762S = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28763O = L5.l.b(new b());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28764P = new ViewModelLazy(U.b(t.class), new g(this), new f(this), new h(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private D4.B f28765Q;

    /* renamed from: R, reason: collision with root package name */
    private final ActivityResultLauncher f28766R;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1370f0 invoke() {
            return C1370f0.c(ReviewsActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28768a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f28770a;

            a(ReviewsActivity reviewsActivity) {
                this.f28770a = reviewsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    this.f28770a.s3().r(true);
                    if (this.f28770a.f28765Q == null) {
                        this.f28770a.q3().f10559k.f10172b.setVisibility(0);
                    }
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    this.f28770a.s3().r(false);
                    if (this.f28770a.f28765Q == null) {
                        this.f28770a.H3(((t.a) ((AbstractC3337y.c) abstractC3337y).a()).a());
                        this.f28770a.q3().f10562n.setAdapter(this.f28770a.f28765Q);
                    } else {
                        Iterator it = ((t.a) ((AbstractC3337y.c) abstractC3337y).a()).a().iterator();
                        while (it.hasNext()) {
                            X4.K review = (X4.K) it.next();
                            D4.B b8 = this.f28770a.f28765Q;
                            AbstractC3159y.f(b8);
                            AbstractC3159y.h(review, "review");
                            b8.a(review);
                        }
                    }
                    D4.B b9 = this.f28770a.f28765Q;
                    if (b9 != null) {
                        b9.c(false);
                    }
                    this.f28770a.q3().f10559k.f10172b.setVisibility(8);
                } else {
                    AbstractC3159y.d(abstractC3337y, AbstractC3337y.b.f34534a);
                }
                return L5.I.f6474a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28768a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K f8 = ReviewsActivity.this.s3().f();
                a aVar = new a(ReviewsActivity.this);
                this.f28768a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28771a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f28773a;

            a(ReviewsActivity reviewsActivity) {
                this.f28773a = reviewsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    this.f28773a.s3().r(true);
                    this.f28773a.q3().f10559k.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((t.b) cVar.a()).b() == 1) {
                        ReviewsActivity reviewsActivity = this.f28773a;
                        Toast.makeText(reviewsActivity, reviewsActivity.getString(R.string.review_sended), 0).show();
                        this.f28773a.q3().f10550b.setText("");
                        Bundle bundle = new Bundle();
                        bundle.putString(CampaignEx.JSON_KEY_STAR, String.valueOf(((Number) this.f28773a.s3().m().getValue()).intValue()));
                        Object value = this.f28773a.s3().e().getValue();
                        AbstractC3159y.f(value);
                        bundle.putString("packagename", ((C1498h) value).y0());
                        C3330r u22 = this.f28773a.u2();
                        if (u22 != null) {
                            u22.b("app_rated", bundle);
                        }
                    } else if (((t.b) cVar.a()).a() == 403) {
                        Toast.makeText(this.f28773a, R.string.email_validation_msg, 1).show();
                    } else if (((t.b) cVar.a()).b() == 0 && ((t.b) cVar.a()).a() == 0) {
                        Toast.makeText(this.f28773a, R.string.error_review_already_submitted, 1).show();
                    } else {
                        ReviewsActivity reviewsActivity2 = this.f28773a;
                        Toast.makeText(reviewsActivity2, reviewsActivity2.getString(R.string.error_generico), 0).show();
                    }
                } else {
                    AbstractC3159y.d(abstractC3337y, AbstractC3337y.b.f34534a);
                }
                return L5.I.f6474a;
            }
        }

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
            Object e8 = Q5.b.e();
            int i8 = this.f28771a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K n8 = ReviewsActivity.this.s3().n();
                a aVar = new a(ReviewsActivity.this);
                this.f28771a = 1;
                if (n8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28774a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f28776a;

            a(ReviewsActivity reviewsActivity) {
                this.f28776a = reviewsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (!AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    if (abstractC3337y instanceof AbstractC3337y.c) {
                        AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                        if (((K.c) cVar.a()).b() == 1) {
                            D4.B b8 = this.f28776a.f28765Q;
                            if (b8 != null) {
                                b8.d(((K.c) cVar.a()).a());
                            }
                        } else {
                            Snackbar.make(this.f28776a.q3().f10562n, R.string.error_generico, -1).show();
                        }
                    } else {
                        boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                    }
                }
                return L5.I.f6474a;
            }
        }

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
            Object e8 = Q5.b.e();
            int i8 = this.f28774a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K l8 = ReviewsActivity.this.s3().l();
                a aVar = new a(ReviewsActivity.this);
                this.f28774a = 1;
                if (l8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f28777a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28777a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28778a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f28778a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28778a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28780b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28779a = function0;
            this.f28780b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28779a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28780b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ReviewsActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.N2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ReviewsActivity.G3(ReviewsActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f28766R = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.s3().m().setValue(3);
            this$0.q3().f10552d.setImageDrawable(drawable);
            this$0.q3().f10553e.setImageDrawable(drawable);
            this$0.q3().f10554f.setImageDrawable(drawable);
            this$0.q3().f10555g.setImageDrawable(drawable2);
            this$0.q3().f10556h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.s3().m().setValue(4);
            this$0.q3().f10552d.setImageDrawable(drawable);
            this$0.q3().f10553e.setImageDrawable(drawable);
            this$0.q3().f10554f.setImageDrawable(drawable);
            this$0.q3().f10555g.setImageDrawable(drawable);
            this$0.q3().f10556h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(ReviewsActivity this$0, Drawable drawable, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.s3().m().setValue(5);
            this$0.q3().f10552d.setImageDrawable(drawable);
            this$0.q3().f10553e.setImageDrawable(drawable);
            this$0.q3().f10554f.setImageDrawable(drawable);
            this$0.q3().f10555g.setImageDrawable(drawable);
            this$0.q3().f10556h.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(ReviewsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!AbstractC3159y.d(this$0.s3().k().getValue(), "date")) {
            this$0.s3().k().setValue("date");
            this$0.q3().f10568t.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_blue_primary_button));
            this$0.q3().f10568t.setTextColor(ContextCompat.getColor(this$0, R.color.white));
            this$0.q3().f10567s.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.q3().f10567s.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.q3().f10569u.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.q3().f10569u.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.J3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(ReviewsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!AbstractC3159y.d(this$0.s3().k().getValue(), "best")) {
            this$0.s3().k().setValue("best");
            this$0.q3().f10567s.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_blue_primary_button));
            this$0.q3().f10567s.setTextColor(ContextCompat.getColor(this$0, R.color.white));
            this$0.q3().f10568t.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.q3().f10568t.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.q3().f10569u.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.q3().f10569u.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.J3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(ReviewsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!AbstractC3159y.d(this$0.s3().k().getValue(), "most")) {
            this$0.s3().k().setValue("most");
            this$0.q3().f10569u.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_blue_primary_button));
            this$0.q3().f10569u.setTextColor(ContextCompat.getColor(this$0, R.color.white));
            this$0.q3().f10567s.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.q3().f10567s.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.q3().f10568t.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.q3().f10568t.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.J3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(ReviewsActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q e8 = Q.f12424k.e(this$0);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.z(this$0)) {
                UptodownApp.a aVar = UptodownApp.f27990B;
                aVar.j0(this$0);
                aVar.i0(this$0);
                this$0.K3(this$0.q3().f10550b.getText().toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(ArrayList arrayList) {
        this.f28765Q = new D4.B(arrayList, this, this);
    }

    private final void I3() {
        this.f28766R.launch(new Intent(this, (Class<?>) LoginActivity.class), UptodownApp.f27990B.b(this));
    }

    private final void J3() {
        q3().f10562n.setAdapter(null);
        this.f28765Q = null;
        s3().q(true);
        s3().s(0);
        r3();
    }

    private final void K3(String str) {
        int intValue = ((Number) s3().m().getValue()).intValue();
        if (1 <= intValue && intValue < 6) {
            s3().p(this, str);
        } else {
            Toast.makeText(this, getString(R.string.error_review_no_valoration), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1370f0 q3() {
        return (C1370f0) this.f28763O.getValue();
    }

    private final void r3() {
        if (s3().g()) {
            s3().d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t s3() {
        return (t) this.f28764P.getValue();
    }

    private final void t3() {
        String str;
        String str2;
        String str3;
        String str4;
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            q3().f10563o.setNavigationIcon(drawable);
            q3().f10563o.setNavigationContentDescription(getString(R.string.back));
        }
        q3().f10563o.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.R2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.u3(ReviewsActivity.this, view);
            }
        });
        C3307A c3307a = C3307A.f34459a;
        C1498h c1498h = (C1498h) s3().e().getValue();
        String str5 = null;
        if (c1498h != null) {
            str = c1498h.y0();
        } else {
            str = null;
        }
        Drawable j8 = c3307a.j(this, str);
        if (j8 != null) {
            q3().f10551c.setImageDrawable(j8);
        } else {
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            C1498h c1498h2 = (C1498h) s3().e().getValue();
            if (c1498h2 != null) {
                str2 = c1498h2.m0();
            } else {
                str2 = null;
            }
            h8.l(str2).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f27990B.f0(this)).i(q3().f10551c);
        }
        TextView textView = q3().f10571w;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        q3().f10565q.setTypeface(aVar.t());
        TextView textView2 = q3().f10565q;
        C1498h c1498h3 = (C1498h) s3().e().getValue();
        if (c1498h3 != null) {
            str3 = c1498h3.s0();
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        q3().f10566r.setTypeface(aVar.u());
        TextView textView3 = q3().f10566r;
        C1498h c1498h4 = (C1498h) s3().e().getValue();
        if (c1498h4 != null) {
            str4 = c1498h4.g1();
        } else {
            str4 = null;
        }
        textView3.setText(str4);
        q3().f10564p.setTypeface(aVar.u());
        TextView textView4 = q3().f10564p;
        C1498h c1498h5 = (C1498h) s3().e().getValue();
        if (c1498h5 != null) {
            str5 = c1498h5.k();
        }
        textView4.setText(str5);
        q3().f10550b.setTypeface(aVar.u());
        q3().f10570v.setTypeface(aVar.t());
        q3().f10570v.setOnClickListener(new View.OnClickListener() { // from class: A4.U2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.v3(ReviewsActivity.this, view);
            }
        });
        final Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_star_on);
        final Drawable drawable3 = ContextCompat.getDrawable(this, R.drawable.vector_star_off);
        if (s3().i().getValue() != null) {
            Object value = s3().i().getValue();
            AbstractC3159y.f(value);
            if (((X4.K) value).n() >= 1) {
                q3().f10552d.setImageDrawable(drawable2);
            }
            Object value2 = s3().i().getValue();
            AbstractC3159y.f(value2);
            if (((X4.K) value2).n() >= 2) {
                q3().f10553e.setImageDrawable(drawable2);
            }
            Object value3 = s3().i().getValue();
            AbstractC3159y.f(value3);
            if (((X4.K) value3).n() >= 3) {
                q3().f10554f.setImageDrawable(drawable2);
            }
            Object value4 = s3().i().getValue();
            AbstractC3159y.f(value4);
            if (((X4.K) value4).n() >= 4) {
                q3().f10555g.setImageDrawable(drawable2);
            }
            Object value5 = s3().i().getValue();
            AbstractC3159y.f(value5);
            if (((X4.K) value5).n() == 5) {
                q3().f10556h.setImageDrawable(drawable2);
            }
            Object value6 = s3().i().getValue();
            AbstractC3159y.f(value6);
            String o8 = ((X4.K) value6).o();
            if (o8 != null && o8.length() != 0) {
                EditText editText = q3().f10550b;
                Object value7 = s3().i().getValue();
                AbstractC3159y.f(value7);
                editText.setText(String.valueOf(((X4.K) value7).o()));
            }
            q3().f10570v.setText(getString(R.string.edit_your_review));
        }
        q3().f10552d.setOnClickListener(new View.OnClickListener() { // from class: A4.V2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.y3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        q3().f10553e.setOnClickListener(new View.OnClickListener() { // from class: A4.W2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.z3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        q3().f10554f.setOnClickListener(new View.OnClickListener() { // from class: A4.X2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.A3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        q3().f10555g.setOnClickListener(new View.OnClickListener() { // from class: A4.Y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.B3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        q3().f10556h.setOnClickListener(new View.OnClickListener() { // from class: A4.Z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.C3(ReviewsActivity.this, drawable2, view);
            }
        });
        q3().f10568t.setTypeface(aVar.t());
        q3().f10568t.setOnClickListener(new View.OnClickListener() { // from class: A4.O2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.D3(ReviewsActivity.this, view);
            }
        });
        q3().f10567s.setTypeface(aVar.t());
        q3().f10567s.setOnClickListener(new View.OnClickListener() { // from class: A4.P2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.E3(ReviewsActivity.this, view);
            }
        });
        q3().f10569u.setTypeface(aVar.t());
        q3().f10569u.setOnClickListener(new View.OnClickListener() { // from class: A4.Q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.F3(ReviewsActivity.this, view);
            }
        });
        q3().f10562n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        q3().f10562n.addItemDecoration(new n5.r(dimension, dimension, dimension, dimension));
        q3().f10560l.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: A4.S2
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
                ReviewsActivity.w3(ReviewsActivity.this, nestedScrollView, i8, i9, i10, i11);
            }
        });
        q3().f10559k.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.T2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.x3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(ReviewsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(ReviewsActivity this$0, View view) {
        String str;
        AbstractC3159y.i(this$0, "this$0");
        Object systemService = this$0.getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.q3().f10550b.getWindowToken(), 0);
        this$0.q3().f10550b.clearFocus();
        Q e8 = Q.f12424k.e(this$0);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            Editable text = this$0.q3().f10550b.getText();
            AbstractC3159y.h(text, "binding.etReview.text");
            this$0.K3(g6.n.M0(text).toString());
            return;
        }
        this$0.I3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(ReviewsActivity this$0, NestedScrollView v8, int i8, int i9, int i10, int i11) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(v8, "v");
        if (i9 == v8.getChildAt(0).getMeasuredHeight() - v8.getMeasuredHeight() && !this$0.s3().h() && this$0.s3().g()) {
            this$0.s3().r(true);
            D4.B b8 = this$0.f28765Q;
            if (b8 != null) {
                b8.c(true);
            }
            this$0.r3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.s3().m().setValue(1);
            this$0.q3().f10552d.setImageDrawable(drawable);
            this$0.q3().f10553e.setImageDrawable(drawable2);
            this$0.q3().f10554f.setImageDrawable(drawable2);
            this$0.q3().f10555g.setImageDrawable(drawable2);
            this$0.q3().f10556h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.s3().m().setValue(2);
            this$0.q3().f10552d.setImageDrawable(drawable);
            this$0.q3().f10553e.setImageDrawable(drawable);
            this$0.q3().f10554f.setImageDrawable(drawable2);
            this$0.q3().f10555g.setImageDrawable(drawable2);
            this$0.q3().f10556h.setImageDrawable(drawable2);
        }
    }

    @Override // W4.A
    public void b(int i8) {
        X4.K k8;
        ArrayList b8;
        D4.B b9 = this.f28765Q;
        if (b9 != null && (b8 = b9.b()) != null) {
            k8 = (X4.K) b8.get(i8);
        } else {
            k8 = null;
        }
        if (UptodownApp.f27990B.a0() && k8 != null && !C3307A.f34459a.i(k8.j())) {
            s3().o(this, k8);
        }
    }

    @Override // W4.A
    public void d(int i8) {
        X4.K k8;
        ArrayList b8;
        D4.B b9 = this.f28765Q;
        if (b9 != null && (b8 = b9.b()) != null) {
            k8 = (X4.K) b8.get(i8);
        } else {
            k8 = null;
        }
        Intent intent = new Intent(this, (Class<?>) UserCommentsActivity.class);
        if (k8 != null) {
            intent.putExtra("userID", k8.z());
        }
        startActivity(intent, UptodownApp.f27990B.a(this));
    }

    @Override // W4.A
    public void e(int i8) {
        X4.K k8;
        ArrayList b8;
        D4.B b9 = this.f28765Q;
        String str = null;
        if (b9 != null && (b8 = b9.b()) != null) {
            k8 = (X4.K) b8.get(i8);
        } else {
            k8 = null;
        }
        Intent intent = new Intent(this, (Class<?>) RepliesActivity.class);
        intent.putExtra("review", k8);
        C1498h c1498h = (C1498h) s3().e().getValue();
        if (c1498h != null) {
            str = c1498h.s0();
        }
        if (str != null && str.length() != 0) {
            Object value = s3().e().getValue();
            AbstractC3159y.f(value);
            intent.putExtra("appName", ((C1498h) value).s0());
        }
        startActivity(intent, UptodownApp.f27990B.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        setContentView(q3().getRoot());
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appInfo")) {
                l6.v e8 = s3().e();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable("appInfo", C1498h.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable("appInfo");
                }
                AbstractC3159y.f(parcelable3);
                e8.setValue(parcelable3);
            }
            if (extras.containsKey("myReview")) {
                l6.v i8 = s3().i();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("myReview", X4.K.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("myReview");
                }
                i8.setValue(parcelable);
                if (s3().i().getValue() != null) {
                    l6.v m8 = s3().m();
                    Object value = s3().i().getValue();
                    AbstractC3159y.f(value);
                    m8.setValue(Integer.valueOf(((X4.K) value).n()));
                }
            }
        }
        t3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new d(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
        r3();
    }
}
