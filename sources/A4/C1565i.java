package a4;

import L5.InterfaceC1227k;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: a4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1565i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13512a;

    /* renamed from: b, reason: collision with root package name */
    private final T3.q f13513b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends Dialog {

        /* renamed from: a, reason: collision with root package name */
        private final T3.q f13514a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1227k f13515b;

        /* renamed from: a4.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0261a extends AbstractC3160z implements Function0 {
            C0261a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Q3.d invoke() {
                Q3.d c8 = Q3.d.c(a.this.getLayoutInflater());
                AbstractC3159y.h(c8, "inflate(...)");
                return c8;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, T3.q uiCustomization) {
            super(context);
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(uiCustomization, "uiCustomization");
            this.f13514a = uiCustomization;
            this.f13515b = L5.l.b(new C0261a());
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final Q3.d a() {
            return (Q3.d) this.f13515b.getValue();
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            setContentView(a().getRoot());
            Z3.a aVar = Z3.a.f13387a;
            CircularProgressIndicator progressBar = a().f8214b;
            AbstractC3159y.h(progressBar, "progressBar");
            aVar.a(progressBar, this.f13514a);
        }
    }

    public C1565i(Context context, T3.q uiCustomization) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        this.f13512a = context;
        this.f13513b = uiCustomization;
    }

    public Dialog a() {
        return new a(this.f13512a, this.f13513b);
    }
}
