package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.A0;
import T4.Z;
import X4.Q;
import X4.S;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
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
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.uptodown.R;
import com.uptodown.activities.J;
import com.uptodown.activities.UserCredentialsEditActivity;
import com.uptodown.util.views.UsernameTextView;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class UserCredentialsEditActivity extends AbstractActivityC2489a {

    /* renamed from: O, reason: collision with root package name */
    private Q f29013O;

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f29014P = new ViewModelLazy(U.b(J.class), new e(this), new d(this), new f(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private Z f29015Q;

    /* renamed from: R, reason: collision with root package name */
    private A0 f29016R;

    /* loaded from: classes4.dex */
    public static final class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A0 f29017a;

        public a(A0 a02) {
            this.f29017a = a02;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f29017a.f10016o.setText(charSequence);
            this.f29017a.f10017p.setText(charSequence);
            this.f29017a.f10018q.setText(charSequence);
            this.f29017a.f10019r.setText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29018a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A0 f29020c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f29021d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f29022e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A0 f29023a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f29024b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f29025c;

            a(A0 a02, kotlin.jvm.internal.Q q8, T t8) {
                this.f29023a = a02;
                this.f29024b = q8;
                this.f29025c = t8;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ArrayList arrayList, P5.d dVar) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    S s8 = (S) it.next();
                    int b8 = s8.b();
                    if (b8 != 0) {
                        if (b8 != 1) {
                            if (b8 != 2) {
                                if (b8 == 3) {
                                    this.f29023a.f10011j.setChecked(s8.d());
                                    UsernameTextView.a aVar = UsernameTextView.f29975k;
                                    UsernameTextView usernameTextView = this.f29023a.f10019r;
                                    AbstractC3159y.h(usernameTextView, "binding.tvUsernameType3");
                                    aVar.a(usernameTextView, s8.e(), s8.c());
                                }
                            } else {
                                this.f29023a.f10010i.setChecked(s8.d());
                                UsernameTextView.a aVar2 = UsernameTextView.f29975k;
                                UsernameTextView usernameTextView2 = this.f29023a.f10018q;
                                AbstractC3159y.h(usernameTextView2, "binding.tvUsernameType2");
                                aVar2.a(usernameTextView2, s8.e(), s8.c());
                            }
                        } else {
                            this.f29023a.f10009h.setChecked(s8.d());
                            UsernameTextView.a aVar3 = UsernameTextView.f29975k;
                            UsernameTextView usernameTextView3 = this.f29023a.f10017p;
                            AbstractC3159y.h(usernameTextView3, "binding.tvUsernameType1");
                            aVar3.a(usernameTextView3, s8.e(), s8.c());
                        }
                    } else {
                        this.f29023a.f10008g.setChecked(s8.d());
                        UsernameTextView.a aVar4 = UsernameTextView.f29975k;
                        UsernameTextView usernameTextView4 = this.f29023a.f10016o;
                        AbstractC3159y.h(usernameTextView4, "binding.tvUsernameType0");
                        aVar4.a(usernameTextView4, s8.e(), s8.c());
                    }
                    if (s8.d()) {
                        this.f29024b.f33745a = s8.b();
                        T t8 = this.f29025c;
                        String c8 = s8.c();
                        AbstractC3159y.f(c8);
                        if (c8.length() == 0) {
                            c8 = "type0";
                        }
                        t8.f33747a = c8;
                    }
                }
                return L5.I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(A0 a02, kotlin.jvm.internal.Q q8, T t8, P5.d dVar) {
            super(2, dVar);
            this.f29020c = a02;
            this.f29021d = q8;
            this.f29022e = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29020c, this.f29021d, this.f29022e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29018a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K g8 = UserCredentialsEditActivity.this.n3().g();
                a aVar = new a(this.f29020c, this.f29021d, this.f29022e);
                this.f29018a = 1;
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
        int f29026a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCredentialsEditActivity f29028a;

            /* renamed from: com.uptodown.activities.UserCredentialsEditActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0699a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f29029a;

                static {
                    int[] iArr = new int[J.a.values().length];
                    try {
                        iArr[J.a.USERNAME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[J.a.PASSWORD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f29029a = iArr;
                }
            }

            a(UserCredentialsEditActivity userCredentialsEditActivity) {
                this.f29028a = userCredentialsEditActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                Z z8 = null;
                A0 a02 = null;
                Z z9 = null;
                A0 a03 = null;
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    if (this.f29028a.f29016R != null) {
                        A0 a04 = this.f29028a.f29016R;
                        if (a04 == null) {
                            AbstractC3159y.y("usernameEditBinding");
                        } else {
                            a02 = a04;
                        }
                        a02.f10007f.f10172b.setVisibility(0);
                    } else if (this.f29028a.f29015Q != null) {
                        Z z10 = this.f29028a.f29015Q;
                        if (z10 == null) {
                            AbstractC3159y.y("passwordEditBinding");
                        } else {
                            z9 = z10;
                        }
                        z9.f10369f.f10172b.setVisibility(0);
                    }
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    int i8 = C0699a.f29029a[((J.b) cVar.a()).a().ordinal()];
                    if (i8 != 1) {
                        if (i8 == 2) {
                            if (((J.b) cVar.a()).d() != 0 && !((J.b) cVar.a()).b()) {
                                UserCredentialsEditActivity userCredentialsEditActivity = this.f29028a;
                                String string = userCredentialsEditActivity.getString(R.string.password_edit_complete);
                                AbstractC3159y.h(string, "getString(R.string.password_edit_complete)");
                                userCredentialsEditActivity.B3(string);
                                this.f29028a.finish();
                            } else {
                                String c8 = ((J.b) cVar.a()).c();
                                if (c8 != null && c8.length() != 0) {
                                    this.f29028a.B3(((J.b) cVar.a()).c());
                                } else {
                                    UserCredentialsEditActivity userCredentialsEditActivity2 = this.f29028a;
                                    String string2 = userCredentialsEditActivity2.getString(R.string.error_generico);
                                    AbstractC3159y.h(string2, "getString(R.string.error_generico)");
                                    userCredentialsEditActivity2.B3(string2);
                                }
                            }
                        }
                    } else if (((J.b) cVar.a()).d() != 0 && !((J.b) cVar.a()).b()) {
                        UserCredentialsEditActivity userCredentialsEditActivity3 = this.f29028a;
                        String string3 = userCredentialsEditActivity3.getString(R.string.username_edit_complete);
                        AbstractC3159y.h(string3, "getString(R.string.username_edit_complete)");
                        userCredentialsEditActivity3.B3(string3);
                        this.f29028a.finish();
                    } else {
                        String c9 = ((J.b) cVar.a()).c();
                        if (c9 != null && c9.length() != 0) {
                            this.f29028a.B3(((J.b) cVar.a()).c());
                        } else {
                            UserCredentialsEditActivity userCredentialsEditActivity4 = this.f29028a;
                            String string4 = userCredentialsEditActivity4.getString(R.string.error_generico);
                            AbstractC3159y.h(string4, "getString(R.string.error_generico)");
                            userCredentialsEditActivity4.B3(string4);
                        }
                    }
                    if (this.f29028a.f29016R != null) {
                        A0 a05 = this.f29028a.f29016R;
                        if (a05 == null) {
                            AbstractC3159y.y("usernameEditBinding");
                        } else {
                            a03 = a05;
                        }
                        a03.f10007f.f10172b.setVisibility(0);
                    } else if (this.f29028a.f29015Q != null) {
                        Z z11 = this.f29028a.f29015Q;
                        if (z11 == null) {
                            AbstractC3159y.y("passwordEditBinding");
                        } else {
                            z8 = z11;
                        }
                        z8.f10369f.f10172b.setVisibility(0);
                    }
                } else {
                    boolean z12 = abstractC3337y instanceof AbstractC3337y.b;
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
            int i8 = this.f29026a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K f8 = UserCredentialsEditActivity.this.n3().f();
                a aVar = new a(UserCredentialsEditActivity.this);
                this.f29026a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f29030a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29030a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29031a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f29031a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29031a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29032a = function0;
            this.f29033b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29032a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29033b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    private final void A3(EditText editText, ImageView imageView) {
        if (editText.getInputType() == 129) {
            editText.setInputType(145);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_show_password));
            editText.setSelection(editText.length());
        } else {
            editText.setInputType(TsExtractor.TS_STREAM_TYPE_AC3);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_hide_password));
            editText.setSelection(editText.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(String str) {
        Toast makeText = Toast.makeText(this, str, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J n3() {
        return (J) this.f29014P.getValue();
    }

    private final void o3(final Z z8) {
        setContentView(z8.getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            z8.f10370g.setNavigationIcon(drawable);
            z8.f10370g.setNavigationContentDescription(getString(R.string.back));
            z8.f10370g.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.g4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserCredentialsEditActivity.q3(UserCredentialsEditActivity.this, view);
                }
            });
        }
        TextView textView = z8.f10372i;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        z8.f10366c.setTypeface(aVar.u());
        z8.f10365b.setTypeface(aVar.u());
        z8.f10371h.setTypeface(aVar.t());
        z8.f10368e.setOnClickListener(new View.OnClickListener() { // from class: A4.h4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.r3(UserCredentialsEditActivity.this, z8, view);
            }
        });
        z8.f10367d.setOnClickListener(new View.OnClickListener() { // from class: A4.i4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.s3(UserCredentialsEditActivity.this, z8, view);
            }
        });
        z8.f10371h.setOnClickListener(new View.OnClickListener() { // from class: A4.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.p3(UserCredentialsEditActivity.this, z8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(UserCredentialsEditActivity this$0, Z binding, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(binding, "$binding");
        E4.j.f2272g.d(this$0, binding.f10366c);
        if (!g6.n.s(binding.f10366c.getText().toString(), "", true) && !g6.n.s(binding.f10365b.getText().toString(), "", true)) {
            if (!g6.n.s(binding.f10366c.getText().toString(), binding.f10365b.getText().toString(), true)) {
                String string = this$0.getString(R.string.password_edit_not_match);
                AbstractC3159y.h(string, "getString(R.string.password_edit_not_match)");
                this$0.B3(string);
                return;
            }
            this$0.n3().c(this$0, binding.f10366c.getText().toString(), binding.f10365b.getText().toString());
            return;
        }
        String string2 = this$0.getString(R.string.error_email_vacio_recuperar_pass);
        AbstractC3159y.h(string2, "getString(R.string.error…ail_vacio_recuperar_pass)");
        this$0.B3(string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(UserCredentialsEditActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(UserCredentialsEditActivity this$0, Z binding, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(binding, "$binding");
        EditText editText = binding.f10366c;
        AbstractC3159y.h(editText, "binding.etPasswordEdit");
        ImageView imageView = binding.f10368e;
        AbstractC3159y.h(imageView, "binding.ivPasswordEdit");
        this$0.A3(editText, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(UserCredentialsEditActivity this$0, Z binding, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(binding, "$binding");
        EditText editText = binding.f10365b;
        AbstractC3159y.h(editText, "binding.etConfirmPasswordEdit");
        ImageView imageView = binding.f10367d;
        AbstractC3159y.h(imageView, "binding.ivConfirmPasswordEdit");
        this$0.A3(editText, imageView);
    }

    private final void t3(final A0 a02) {
        setContentView(a02.getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            a02.f10012k.setNavigationIcon(drawable);
            a02.f10012k.setNavigationContentDescription(getString(R.string.back));
            a02.f10012k.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.a4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserCredentialsEditActivity.u3(UserCredentialsEditActivity.this, view);
                }
            });
        }
        TextView textView = a02.f10013l;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        a02.f10014m.setTypeface(aVar.t());
        a02.f10003b.setTypeface(aVar.u());
        EditText editText = a02.f10003b;
        Q q8 = this.f29013O;
        AbstractC3159y.f(q8);
        editText.setText(q8.n());
        a02.f10015n.setTypeface(aVar.t());
        a02.f10016o.setTypeface(aVar.t());
        a02.f10017p.setTypeface(aVar.t());
        a02.f10018q.setTypeface(aVar.t());
        a02.f10019r.setTypeface(aVar.t());
        UsernameTextView usernameTextView = a02.f10016o;
        Q q9 = this.f29013O;
        AbstractC3159y.f(q9);
        usernameTextView.setText(q9.n());
        UsernameTextView usernameTextView2 = a02.f10017p;
        Q q10 = this.f29013O;
        AbstractC3159y.f(q10);
        usernameTextView2.setText(q10.n());
        UsernameTextView usernameTextView3 = a02.f10018q;
        Q q11 = this.f29013O;
        AbstractC3159y.f(q11);
        usernameTextView3.setText(q11.n());
        UsernameTextView usernameTextView4 = a02.f10019r;
        Q q12 = this.f29013O;
        AbstractC3159y.f(q12);
        usernameTextView4.setText(q12.n());
        final kotlin.jvm.internal.Q q13 = new kotlin.jvm.internal.Q();
        final T t8 = new T();
        t8.f33747a = "type0";
        a02.f10008g.setOnClickListener(new View.OnClickListener() { // from class: A4.b4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.v3(T4.A0.this, q13, t8, view);
            }
        });
        a02.f10009h.setOnClickListener(new View.OnClickListener() { // from class: A4.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.w3(T4.A0.this, q13, t8, view);
            }
        });
        a02.f10010i.setOnClickListener(new View.OnClickListener() { // from class: A4.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.x3(T4.A0.this, q13, t8, view);
            }
        });
        a02.f10011j.setOnClickListener(new View.OnClickListener() { // from class: A4.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.y3(T4.A0.this, q13, t8, view);
            }
        });
        Q q14 = this.f29013O;
        AbstractC3159y.f(q14);
        if (!q14.G()) {
            a02.f10008g.setChecked(true);
            a02.f10009h.setEnabled(false);
            a02.f10010i.setEnabled(false);
            a02.f10011j.setEnabled(false);
        }
        a02.f10015n.setOnClickListener(new View.OnClickListener() { // from class: A4.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.z3(UserCredentialsEditActivity.this, a02, q13, t8, view);
            }
        });
        EditText editText2 = a02.f10003b;
        AbstractC3159y.h(editText2, "binding.etUsernameEdit");
        editText2.addTextChangedListener(new a(a02));
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new b(a02, q13, t8, null), 2, null);
        n3().e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(UserCredentialsEditActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3159y.i(binding, "$binding");
        AbstractC3159y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3159y.i(usernameFormatName, "$usernameFormatName");
        binding.f10009h.setChecked(false);
        binding.f10010i.setChecked(false);
        binding.f10011j.setChecked(false);
        usernameFormatID.f33745a = 0;
        usernameFormatName.f33747a = "type0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3159y.i(binding, "$binding");
        AbstractC3159y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3159y.i(usernameFormatName, "$usernameFormatName");
        binding.f10008g.setChecked(false);
        binding.f10010i.setChecked(false);
        binding.f10011j.setChecked(false);
        usernameFormatID.f33745a = 1;
        usernameFormatName.f33747a = "type1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3159y.i(binding, "$binding");
        AbstractC3159y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3159y.i(usernameFormatName, "$usernameFormatName");
        binding.f10008g.setChecked(false);
        binding.f10009h.setChecked(false);
        binding.f10011j.setChecked(false);
        usernameFormatID.f33745a = 2;
        usernameFormatName.f33747a = "type2";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3159y.i(binding, "$binding");
        AbstractC3159y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3159y.i(usernameFormatName, "$usernameFormatName");
        binding.f10008g.setChecked(false);
        binding.f10009h.setChecked(false);
        binding.f10010i.setChecked(false);
        usernameFormatID.f33745a = 3;
        usernameFormatName.f33747a = "type3";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(UserCredentialsEditActivity this$0, A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(binding, "$binding");
        AbstractC3159y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3159y.i(usernameFormatName, "$usernameFormatName");
        E4.j.f2272g.d(this$0, binding.f10003b);
        if (g6.n.s(binding.f10003b.getText().toString(), "", true)) {
            String string = this$0.getString(R.string.error_email_vacio_recuperar_pass);
            AbstractC3159y.h(string, "getString(R.string.error…ail_vacio_recuperar_pass)");
            this$0.B3(string);
        } else {
            if (binding.f10003b.getText().toString().length() >= 3 && binding.f10003b.getText().toString().length() <= 99) {
                this$0.n3().d(this$0, binding.f10003b.getText().toString(), this$0.f29013O, usernameFormatID.f33745a, (String) usernameFormatName.f33747a);
                return;
            }
            String string2 = this$0.getString(R.string.username_not_valid);
            AbstractC3159y.h(string2, "getString(R.string.username_not_valid)");
            this$0.B3(string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Object parcelable;
        super.onCreate(bundle);
        if (getIntent() != null && (extras = getIntent().getExtras()) != null) {
            if (extras.containsKey("user")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable("user", Q.class);
                    this.f29013O = (Q) parcelable;
                } else {
                    this.f29013O = (Q) extras.getParcelable("user");
                }
                A0 c8 = A0.c(getLayoutInflater());
                AbstractC3159y.h(c8, "inflate(layoutInflater)");
                this.f29016R = c8;
                if (c8 == null) {
                    AbstractC3159y.y("usernameEditBinding");
                    c8 = null;
                }
                t3(c8);
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_PASSWORD)) {
                Z c9 = Z.c(getLayoutInflater());
                AbstractC3159y.h(c9, "inflate(layoutInflater)");
                this.f29015Q = c9;
                if (c9 == null) {
                    AbstractC3159y.y("passwordEditBinding");
                    c9 = null;
                }
                o3(c9);
            }
        }
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
    }
}
