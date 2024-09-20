package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1364c0;
import X4.K;
import X4.Q;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.s;
import com.uptodown.util.views.UsernameTextView;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l5.AbstractC3337y;
import l5.C3307A;
import l5.C3323k;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class RepliesActivity extends AbstractActivityC2489a {

    /* renamed from: Q, reason: collision with root package name */
    private D4.A f28742Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28740O = L5.l.b(new a());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28741P = new ViewModelLazy(U.b(s.class), new h(this), new g(this), new i(null, this));

    /* renamed from: R, reason: collision with root package name */
    private final f f28743R = new f();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1364c0 invoke() {
            return C1364c0.c(RepliesActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28745a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f28747a;

            a(RepliesActivity repliesActivity) {
                this.f28747a = repliesActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28747a.o3().f10461d.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (!((s.a) cVar.a()).a().isEmpty()) {
                        RepliesActivity repliesActivity = this.f28747a;
                        ArrayList a8 = ((s.a) cVar.a()).a();
                        Context applicationContext = this.f28747a.getApplicationContext();
                        AbstractC3159y.h(applicationContext, "applicationContext");
                        repliesActivity.f28742Q = new D4.A(a8, applicationContext, this.f28747a.f28743R);
                        this.f28747a.o3().f10467j.setAdapter(this.f28747a.f28742Q);
                    } else {
                        this.f28747a.o3().f10470m.setVisibility(0);
                    }
                    this.f28747a.o3().f10463f.setVisibility(0);
                    this.f28747a.o3().f10461d.f10172b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6474a;
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28745a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K g8 = RepliesActivity.this.q3().g();
                a aVar = new a(RepliesActivity.this);
                this.f28745a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28748a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f28750a;

            a(RepliesActivity repliesActivity) {
                this.f28750a = repliesActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (!AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    if (abstractC3337y instanceof AbstractC3337y.c) {
                        AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                        if (((K.c) cVar.a()).b() == 1) {
                            this.f28750a.o3().f10464g.f10489p.setText(String.valueOf(((K.c) cVar.a()).a().k()));
                        } else {
                            Snackbar.make(this.f28750a.o3().f10467j, R.string.error_generico, -1).show();
                        }
                    } else {
                        boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                    }
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
            int i8 = this.f28748a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K i9 = RepliesActivity.this.q3().i();
                a aVar = new a(RepliesActivity.this);
                this.f28748a = 1;
                if (i9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28751a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f28753a;

            a(RepliesActivity repliesActivity) {
                this.f28753a = repliesActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (!AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    if (abstractC3337y instanceof AbstractC3337y.c) {
                        AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                        if (((s.b) cVar.a()).a() == 1) {
                            D4.A a8 = this.f28753a.f28742Q;
                            if (a8 != null) {
                                a8.c(((s.b) cVar.a()).b());
                            }
                        } else {
                            Snackbar.make(this.f28753a.o3().f10467j, R.string.error_generico, -1).show();
                        }
                    } else {
                        boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                    }
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
            int i8 = this.f28751a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K h8 = RepliesActivity.this.q3().h();
                a aVar = new a(RepliesActivity.this);
                this.f28751a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28754a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f28756a;

            a(RepliesActivity repliesActivity) {
                this.f28756a = repliesActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (!AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    if (abstractC3337y instanceof AbstractC3337y.c) {
                        AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                        if (((s.c) cVar.a()).c() == 1) {
                            X4.K k8 = new X4.K();
                            Q e8 = Q.f12424k.e(this.f28756a);
                            if (e8 != null) {
                                k8.g0(e8.n());
                                k8.Y(e8.f());
                            }
                            k8.c0(((s.c) cVar.a()).d());
                            this.f28756a.o3().f10459b.setText("");
                            RepliesActivity repliesActivity = this.f28756a;
                            Toast.makeText(repliesActivity, repliesActivity.getString(R.string.review_sended), 1).show();
                        } else if (((s.c) cVar.a()).b() == 401) {
                            this.f28756a.x3();
                        } else if (((s.c) cVar.a()).b() == 403) {
                            Toast.makeText(this.f28756a, R.string.email_validation_msg, 1).show();
                        } else {
                            Toast.makeText(this.f28756a, ((s.c) cVar.a()).a(), 1).show();
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
            int i8 = this.f28754a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K k8 = RepliesActivity.this.q3().k();
                a aVar = new a(RepliesActivity.this);
                this.f28754a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements W4.z {
        f() {
        }

        @Override // W4.z
        public void a(X4.G reply) {
            AbstractC3159y.i(reply, "reply");
            if (UptodownApp.f27990B.a0()) {
                if (!C3307A.f34459a.h(reply.e())) {
                    RepliesActivity.this.q3().m(RepliesActivity.this, reply);
                } else {
                    Snackbar.make(RepliesActivity.this.o3().f10467j, R.string.review_already_liked, -1).show();
                }
            }
        }

        @Override // W4.z
        public void b(String userID) {
            AbstractC3159y.i(userID, "userID");
            RepliesActivity.this.A3(userID);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f28758a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28758a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28759a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28759a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28759a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28760a = function0;
            this.f28761b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28760a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28761b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(String str) {
        Intent intent = new Intent(this, (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", str);
        startActivity(intent, UptodownApp.f27990B.a(this));
    }

    private final void B3(final X4.K k8) {
        if (k8.L()) {
            o3().f10465h.f10531l.setVisibility(8);
            o3().f10465h.f10530k.setOnClickListener(new View.OnClickListener() { // from class: A4.H2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RepliesActivity.C3(RepliesActivity.this, k8, view);
                }
            });
            if (C3307A.f34459a.i(k8.j())) {
                o3().f10465h.f10523d.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
            }
            TextView textView = o3().f10465h.f10535p;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            o3().f10465h.f10535p.setText(String.valueOf(k8.k()));
            o3().f10465h.f10524e.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            o3().f10465h.f10525f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            o3().f10465h.f10526g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            o3().f10465h.f10527h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            o3().f10465h.f10528i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            if (k8.n() >= 2) {
                o3().f10465h.f10525f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (k8.n() >= 3) {
                o3().f10465h.f10526g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (k8.n() >= 4) {
                o3().f10465h.f10527h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (k8.n() == 5) {
                o3().f10465h.f10528i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            o3().f10465h.f10539t.setTypeface(aVar.t());
            o3().f10465h.f10534o.setTypeface(aVar.u());
            o3().f10465h.f10533n.setTypeface(aVar.u());
            o3().f10465h.f10536q.setTypeface(aVar.u());
            Q.b bVar = Q.f12424k;
            String c8 = bVar.c(k8.i());
            if (c8 != null && c8.length() != 0) {
                com.squareup.picasso.s.h().l(bVar.c(k8.i())).n(UptodownApp.f27990B.f0(this)).i(o3().f10465h.f10522c);
            } else {
                com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f27990B.f0(this)).i(o3().f10465h.f10522c);
            }
            String G8 = k8.G();
            if (G8 != null && G8.length() != 0) {
                o3().f10465h.f10539t.setText(k8.G());
                UsernameTextView.a aVar2 = UsernameTextView.f29975k;
                UsernameTextView usernameTextView = o3().f10465h.f10539t;
                AbstractC3159y.h(usernameTextView, "binding.reviewTurbo.tvUsernameReview");
                aVar2.a(usernameTextView, k8.L(), k8.I());
            } else {
                CharSequence charSequence = (CharSequence) q3().l().getValue();
                if (charSequence != null && charSequence.length() != 0) {
                    o3().f10465h.f10539t.setText((CharSequence) q3().l().getValue());
                    UsernameTextView.a aVar3 = UsernameTextView.f29975k;
                    UsernameTextView usernameTextView2 = o3().f10465h.f10539t;
                    AbstractC3159y.h(usernameTextView2, "binding.reviewTurbo.tvUsernameReview");
                    aVar3.a(usernameTextView2, k8.L(), k8.I());
                }
            }
            String u8 = k8.u();
            if (u8 != null && u8.length() != 0) {
                o3().f10465h.f10534o.setText(k8.u());
            }
            String o8 = k8.o();
            if (o8 != null && o8.length() != 0) {
                o3().f10465h.f10533n.setMaxLines(Integer.MAX_VALUE);
                TextView textView2 = o3().f10465h.f10533n;
                Spanned s8 = k8.s();
                textView2.setText(s8 != null ? g6.n.M0(s8) : null);
                if (k8.b() == 1) {
                    TextView textView3 = o3().f10465h.f10536q;
                    Y y8 = Y.f33752a;
                    String string = getString(R.string.replies_counter_single);
                    AbstractC3159y.h(string, "getString(R.string.replies_counter_single)");
                    String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                    AbstractC3159y.h(format, "format(...)");
                    textView3.setText(format);
                } else if (k8.b() > 1) {
                    TextView textView4 = o3().f10465h.f10536q;
                    Y y9 = Y.f33752a;
                    String string2 = getString(R.string.replies_counter_multiple);
                    AbstractC3159y.h(string2, "getString(R.string.replies_counter_multiple)");
                    String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(k8.b())}, 1));
                    AbstractC3159y.h(format2, "format(...)");
                    textView4.setText(format2);
                }
            } else {
                o3().f10465h.f10533n.setVisibility(8);
            }
            if (k8.f() == 1) {
                o3().f10465h.f10521b.setVisibility(0);
            }
            String z8 = k8.z();
            if (z8 != null && z8.length() != 0) {
                o3().f10465h.f10539t.setOnClickListener(new View.OnClickListener() { // from class: A4.I2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RepliesActivity.D3(RepliesActivity.this, k8, view);
                    }
                });
                o3().f10465h.f10522c.setOnClickListener(new View.OnClickListener() { // from class: A4.J2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RepliesActivity.E3(RepliesActivity.this, k8, view);
                    }
                });
            }
            o3().f10465h.f10529j.setVisibility(0);
            C3323k.a aVar4 = C3323k.f34483a;
            ImageView imageView = o3().f10465h.f10522c;
            AbstractC3159y.h(imageView, "binding.reviewTurbo.ivAvatarReview");
            aVar4.a(imageView);
            o3().f10465h.getRoot().setVisibility(0);
            o3().f10464g.getRoot().setVisibility(8);
            return;
        }
        o3().f10464g.f10485l.setVisibility(8);
        o3().f10464g.f10484k.setOnClickListener(new View.OnClickListener() { // from class: A4.K2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.F3(RepliesActivity.this, k8, view);
            }
        });
        if (C3307A.f34459a.i(k8.j())) {
            o3().f10464g.f10477d.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
        }
        TextView textView5 = o3().f10464g.f10489p;
        j.a aVar5 = E4.j.f2272g;
        textView5.setTypeface(aVar5.u());
        o3().f10464g.f10489p.setText(String.valueOf(k8.k()));
        o3().f10464g.f10478e.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        o3().f10464g.f10479f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        o3().f10464g.f10480g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        o3().f10464g.f10481h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        o3().f10464g.f10482i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        if (k8.n() >= 2) {
            o3().f10464g.f10479f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (k8.n() >= 3) {
            o3().f10464g.f10480g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (k8.n() >= 4) {
            o3().f10464g.f10481h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (k8.n() == 5) {
            o3().f10464g.f10482i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        o3().f10464g.f10493t.setTypeface(aVar5.t());
        o3().f10464g.f10488o.setTypeface(aVar5.u());
        o3().f10464g.f10487n.setTypeface(aVar5.u());
        o3().f10464g.f10490q.setTypeface(aVar5.u());
        Q.b bVar2 = Q.f12424k;
        String c9 = bVar2.c(k8.i());
        if (c9 != null && c9.length() != 0) {
            com.squareup.picasso.s.h().l(bVar2.c(k8.i())).n(UptodownApp.f27990B.f0(this)).i(o3().f10464g.f10476c);
        } else {
            com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f27990B.f0(this)).i(o3().f10464g.f10476c);
        }
        String G9 = k8.G();
        if (G9 != null && G9.length() != 0) {
            o3().f10464g.f10493t.setText(k8.G());
            UsernameTextView.a aVar6 = UsernameTextView.f29975k;
            UsernameTextView usernameTextView3 = o3().f10464g.f10493t;
            AbstractC3159y.h(usernameTextView3, "binding.review.tvUsernameReview");
            aVar6.a(usernameTextView3, k8.L(), k8.I());
        } else {
            CharSequence charSequence2 = (CharSequence) q3().l().getValue();
            if (charSequence2 != null && charSequence2.length() != 0) {
                o3().f10464g.f10493t.setText((CharSequence) q3().l().getValue());
                UsernameTextView.a aVar7 = UsernameTextView.f29975k;
                UsernameTextView usernameTextView4 = o3().f10464g.f10493t;
                AbstractC3159y.h(usernameTextView4, "binding.review.tvUsernameReview");
                aVar7.a(usernameTextView4, k8.L(), k8.I());
            }
        }
        String u9 = k8.u();
        if (u9 != null && u9.length() != 0) {
            o3().f10464g.f10488o.setText(k8.u());
        }
        String o9 = k8.o();
        if (o9 != null && o9.length() != 0) {
            TextView textView6 = o3().f10464g.f10487n;
            Spanned s9 = k8.s();
            textView6.setText(s9 != null ? g6.n.M0(s9) : null);
            if (k8.b() == 1) {
                TextView textView7 = o3().f10464g.f10490q;
                Y y10 = Y.f33752a;
                String string3 = getString(R.string.replies_counter_single);
                AbstractC3159y.h(string3, "getString(R.string.replies_counter_single)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[0], 0));
                AbstractC3159y.h(format3, "format(...)");
                textView7.setText(format3);
            } else if (k8.b() > 1) {
                TextView textView8 = o3().f10464g.f10490q;
                Y y11 = Y.f33752a;
                String string4 = getString(R.string.replies_counter_multiple);
                AbstractC3159y.h(string4, "getString(R.string.replies_counter_multiple)");
                String format4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(k8.b())}, 1));
                AbstractC3159y.h(format4, "format(...)");
                textView8.setText(format4);
            }
        } else {
            o3().f10464g.f10487n.setVisibility(8);
        }
        if (k8.f() == 1) {
            o3().f10464g.f10475b.setVisibility(0);
        }
        String z9 = k8.z();
        if (z9 == null || z9.length() == 0) {
            return;
        }
        o3().f10464g.f10493t.setOnClickListener(new View.OnClickListener() { // from class: A4.L2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.G3(RepliesActivity.this, k8, view);
            }
        });
        o3().f10464g.f10476c.setOnClickListener(new View.OnClickListener() { // from class: A4.M2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.H3(RepliesActivity.this, k8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(RepliesActivity this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        if (UptodownApp.f27990B.a0()) {
            ImageView imageView = this$0.o3().f10465h.f10523d;
            AbstractC3159y.h(imageView, "binding.reviewTurbo.ivLikesCounterReview");
            n5.k.a(this$0, imageView);
            if (!C3307A.f34459a.i(review.j())) {
                this$0.q3().n(this$0, review);
                this$0.o3().f10465h.f10535p.setText(String.valueOf(review.k() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(RepliesActivity this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.A3(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(RepliesActivity this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.A3(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(RepliesActivity this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        if (UptodownApp.f27990B.a0()) {
            ImageView imageView = this$0.o3().f10464g.f10477d;
            AbstractC3159y.h(imageView, "binding.review.ivLikesCounterReview");
            n5.k.a(this$0, imageView);
            if (!C3307A.f34459a.i(review.j())) {
                this$0.q3().n(this$0, review);
                this$0.o3().f10464g.f10489p.setText(String.valueOf(review.k() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(RepliesActivity this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.A3(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(RepliesActivity this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.A3(z8);
    }

    private final void I3() {
        String str;
        Q.b bVar = Q.f12424k;
        Q e8 = bVar.e(this);
        if (e8 != null) {
            str = e8.c();
        } else {
            str = null;
        }
        if (str != null) {
            com.squareup.picasso.s.h().l(bVar.c(e8.c())).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f27990B.f0(this)).i(o3().f10460c);
            if (e8.G()) {
                C3323k.a aVar = C3323k.f34483a;
                ImageView imageView = o3().f10460c;
                AbstractC3159y.h(imageView, "binding.ivUserAvatarReply");
                aVar.b(imageView);
                return;
            }
            return;
        }
        o3().f10460c.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_user_default));
    }

    private final void J3() {
        String str;
        Q e8 = Q.f12424k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            String id = e8.getId();
            AbstractC3159y.f(id);
            if (id.length() > 0) {
                o3().f10462e.setVisibility(8);
                return;
            }
        }
        o3().f10462e.setVisibility(0);
    }

    private final void p3(long j8) {
        q3().e(this, j8);
    }

    private final void r3() {
        Object systemService = getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(o3().f10459b.getWindowToken(), 0);
    }

    private final void s3() {
        String str;
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            o3().f10468k.setNavigationIcon(drawable);
            o3().f10468k.setNavigationContentDescription(getString(R.string.back));
        }
        o3().f10468k.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.D2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.t3(RepliesActivity.this, view);
            }
        });
        TextView textView = o3().f10469l;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        X4.K k8 = (X4.K) q3().j().getValue();
        String str2 = null;
        if (k8 != null) {
            str = k8.e();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView2 = o3().f10469l;
            X4.K k9 = (X4.K) q3().j().getValue();
            if (k9 != null) {
                str2 = k9.e();
            }
            textView2.setText(str2);
        } else {
            CharSequence charSequence = (CharSequence) q3().f().getValue();
            if (charSequence != null && charSequence.length() != 0) {
                o3().f10469l.setText((CharSequence) q3().f().getValue());
            }
        }
        o3().f10470m.setTypeface(aVar.u());
        I3();
        o3().f10471n.setTypeface(aVar.t());
        o3().f10471n.setOnClickListener(new View.OnClickListener() { // from class: A4.E2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.u3(RepliesActivity.this, view);
            }
        });
        o3().f10462e.setOnClickListener(new View.OnClickListener() { // from class: A4.F2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.v3(RepliesActivity.this, view);
            }
        });
        o3().f10459b.setTypeface(aVar.u());
        o3().f10459b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: A4.G2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i8, KeyEvent keyEvent) {
                boolean w32;
                w32 = RepliesActivity.w3(RepliesActivity.this, textView3, i8, keyEvent);
                return w32;
            }
        });
        J3();
        o3().f10467j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        o3().f10467j.setItemAnimator(new DefaultItemAnimator());
        if (q3().j().getValue() != null) {
            Object value = q3().j().getValue();
            AbstractC3159y.f(value);
            p3(((X4.K) value).j());
            Object value2 = q3().j().getValue();
            AbstractC3159y.f(value2);
            B3((X4.K) value2);
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(RepliesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(RepliesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.y3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(RepliesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w3(RepliesActivity this$0, TextView textView, int i8, KeyEvent keyEvent) {
        AbstractC3159y.i(this$0, "this$0");
        if (i8 == 6) {
            this$0.y3();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3() {
        Q.f12424k.a(this);
        z3();
    }

    private final void y3() {
        r3();
        if (o3().f10459b.getText() != null && g6.n.M0(o3().f10459b.getText().toString()).toString().length() > 0) {
            if (!X4.K.f12368o.b(this, o3().f10459b.getText().toString())) {
                SettingsPreferences.a aVar = SettingsPreferences.f29309b;
                Context applicationContext = getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                aVar.N0(applicationContext, o3().f10459b.getText().toString());
                Context applicationContext2 = getApplicationContext();
                AbstractC3159y.h(applicationContext2, "applicationContext");
                aVar.O0(applicationContext2, String.valueOf(System.currentTimeMillis()));
                s q32 = q3();
                String obj = o3().f10459b.getText().toString();
                Object value = q3().j().getValue();
                AbstractC3159y.f(value);
                q32.o(this, obj, ((X4.K) value).j());
                return;
            }
            o3().f10459b.setText("");
            return;
        }
        if (g6.n.M0(o3().f10459b.getText().toString()).toString().length() == 0) {
            String string = getString(R.string.empty_answer_error);
            AbstractC3159y.h(string, "getString(R.string.empty_answer_error)");
            e2(string);
        }
    }

    private final void z3() {
        if (!isFinishing()) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) LoginActivity.class), UptodownApp.f27990B.a(this));
        }
    }

    public final C1364c0 o3() {
        return (C1364c0) this.f28740O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        setContentView(o3().getRoot());
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("review")) {
                l6.v j8 = q3().j();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("review", X4.K.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("review");
                }
                j8.setValue(parcelable);
            }
            if (extras.containsKey("appName")) {
                q3().f().setValue(extras.getString("appName"));
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_USERNAME)) {
                q3().l().setValue(extras.getString(HintConstants.AUTOFILL_HINT_USERNAME));
            }
        }
        s3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new b(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new d(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        J3();
        I3();
    }

    public final s q3() {
        return (s) this.f28741P.getValue();
    }
}
