package com.stripe.android.paymentsheet.analytics;

import M5.AbstractC1246t;
import M5.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.EnvironmentCompat;
import b3.EnumC1870e;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.u;
import h6.C2758a;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m2.AbstractC3395a;
import q3.EnumC3653f;
import t3.AbstractC3792b;
import t3.AbstractC3793c;
import w4.AbstractC3849b;
import x2.InterfaceC3871a;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class c implements InterfaceC3871a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f25737a = new d(null);

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25738b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25739c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25740d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25741e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25742f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String type, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(type, "type");
            this.f25738b = z8;
            this.f25739c = z9;
            this.f25740d = z10;
            this.f25741e = "autofill_" + h(type);
            this.f25742f = Q.h();
        }

        private final String h(String str) {
            String lowerCase = new g6.j("(?<=.)(?=\\p{Upper})").f(str, "_").toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25741e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25742f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25740d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25739c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25738b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25743b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25744c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25745d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25746e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25747f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventReporter.Mode mode) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25746e = c.f25737a.d(mode, "cannot_return_from_link_and_lpms");
            this.f25747f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25746e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25747f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25745d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25743b;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25744c;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.analytics.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0602c extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25748b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25749c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25750d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25751e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25752f;

        public C0602c(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25748b = z8;
            this.f25749c = z9;
            this.f25750d = z10;
            this.f25751e = "mc_card_number_completed";
            this.f25752f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25751e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25752f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25750d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25749c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25748b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(AbstractC3991f abstractC3991f) {
            boolean z8;
            if (AbstractC3159y.d(abstractC3991f, AbstractC3991f.c.f39757a)) {
                return "googlepay";
            }
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                return "savedpm";
            }
            if (AbstractC3159y.d(abstractC3991f, AbstractC3991f.d.f39758a)) {
                z8 = true;
            } else {
                z8 = abstractC3991f instanceof AbstractC3991f.e.c;
            }
            if (z8) {
                return "link";
            }
            if (abstractC3991f instanceof AbstractC3991f.e) {
                return "newpm";
            }
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(EventReporter.Mode mode, String str) {
            return "mc_" + mode + "_" + str;
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25753b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25754c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25755d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25756e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25757f;

        public e(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25753b = z8;
            this.f25754c = z9;
            this.f25755d = z10;
            this.f25756e = "mc_dismiss";
            this.f25757f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25756e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25757f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25755d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25754c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25753b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25758b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25759c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25760d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25761e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25762f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(error, "error");
            this.f25758b = z8;
            this.f25759c = z9;
            this.f25760d = z10;
            this.f25761e = "mc_elements_session_load_failed";
            this.f25762f = Q.q(Q.e(L5.x.a("error_message", I3.k.a(error).a())), k3.i.f33380a.c(error));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25761e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25762f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25760d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25759c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25758b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25763b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25764c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25765d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25766e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25767f;

        public g(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25763b = z8;
            this.f25764c = z9;
            this.f25765d = z10;
            this.f25766e = "mc_cancel_edit_screen";
            this.f25767f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25766e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25767f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25765d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25764c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25763b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25768b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25769c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25770d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25771e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25772f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25773b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f25774c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f25775d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f25776e;

            /* renamed from: a, reason: collision with root package name */
            private final String f25777a;

            static {
                a[] a8 = a();
                f25775d = a8;
                f25776e = R5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f25777a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f25773b, f25774c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f25775d.clone();
            }

            public final String b() {
                return this.f25777a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a source, EnumC1870e enumC1870e, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(source, "source");
            this.f25768b = z8;
            this.f25769c = z9;
            this.f25770d = z10;
            this.f25771e = "mc_close_cbc_dropdown";
            this.f25772f = Q.k(L5.x.a("cbc_event_source", source.b()), L5.x.a("selected_card_brand", enumC1870e != null ? enumC1870e.f() : null));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25771e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25772f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25770d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25769c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25768b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends c {

        /* renamed from: b, reason: collision with root package name */
        private final EventReporter.Mode f25778b;

        /* renamed from: c, reason: collision with root package name */
        private final u.g f25779c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25780d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25781e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f25782f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EventReporter.Mode mode, u.g configuration, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(configuration, "configuration");
            this.f25778b = mode;
            this.f25779c = configuration;
            this.f25780d = z8;
            this.f25781e = z9;
            this.f25782f = z10;
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            String str;
            String str2;
            String str3;
            List list = null;
            if (this.f25779c.j() != null) {
                str = "customer";
            } else {
                str = null;
            }
            if (this.f25779c.o() != null) {
                str2 = "googlepay";
            } else {
                str2 = null;
            }
            List r8 = AbstractC1246t.r(str, str2);
            if (!r8.isEmpty()) {
                list = r8;
            }
            if (list == null || (str3 = AbstractC1246t.w0(list, "_", null, null, 0, null, null, 62, null)) == null) {
                str3 = "default";
            }
            return c.f25737a.d(this.f25778b, "init_" + str3);
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            boolean z8;
            String str;
            boolean z9;
            boolean z10;
            boolean z11;
            u.h b8;
            if (this.f25779c.j() != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            L5.r a8 = L5.x.a("customer", Boolean.valueOf(z8));
            u.i j8 = this.f25779c.j();
            if (j8 != null && (b8 = j8.b()) != null) {
                str = b8.h();
            } else {
                str = null;
            }
            L5.r a9 = L5.x.a("customer_access_provider", str);
            if (this.f25779c.o() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            L5.r a10 = L5.x.a("googlepay", Boolean.valueOf(z9));
            if (this.f25779c.I() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            L5.r a11 = L5.x.a("primary_button_color", Boolean.valueOf(z10));
            u.c k8 = this.f25779c.k();
            if (k8 != null && k8.i()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Q.e(L5.x.a("mpe_config", Q.k(a8, a9, a10, a11, L5.x.a("default_billing_details", Boolean.valueOf(z11)), L5.x.a("allows_delayed_payment_methods", Boolean.valueOf(this.f25779c.b())), L5.x.a("appearance", AbstractC3395a.b(this.f25779c.f())), L5.x.a("payment_method_order", this.f25779c.z()), L5.x.a("allows_payment_methods_requiring_shipping_address", Boolean.valueOf(this.f25779c.c())), L5.x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.f25779c.e())), L5.x.a("billing_details_collection_configuration", AbstractC3395a.c(this.f25779c.i())), L5.x.a("preferred_networks", AbstractC3395a.d(this.f25779c.G())), L5.x.a("external_payment_methods", AbstractC3395a.a(this.f25779c)))));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25782f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25781e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25780d;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25783b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25784c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25785d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25786e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25787f;

        public /* synthetic */ j(C2758a c2758a, Throwable th, boolean z8, boolean z9, boolean z10, AbstractC3151p abstractC3151p) {
            this(c2758a, th, z8, z9, z10);
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25786e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25787f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25785d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25784c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25783b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private j(C2758a c2758a, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(error, "error");
            this.f25783b = z8;
            this.f25784c = z9;
            this.f25785d = z10;
            this.f25786e = "mc_load_failed";
            this.f25787f = Q.q(Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("error_message", I3.k.a(error).a())), k3.i.f33380a.c(error));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25788b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25789c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25790d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25791e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25792f;

        public k(boolean z8, boolean z9, boolean z10, boolean z11) {
            super(null);
            this.f25788b = z8;
            this.f25789c = z9;
            this.f25790d = z10;
            this.f25791e = "mc_load_started";
            this.f25792f = Q.e(L5.x.a("compose", Boolean.valueOf(z11)));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25791e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25792f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25790d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25789c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25788b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25793b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25794c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25795d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25796e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25797f;

        public /* synthetic */ l(AbstractC3991f abstractC3991f, u.l lVar, List list, C2758a c2758a, b3.y yVar, boolean z8, boolean z9, AbstractC3151p abstractC3151p) {
            this(abstractC3991f, lVar, list, c2758a, yVar, z8, z9);
        }

        private final String h(u.l lVar) {
            if (lVar instanceof u.l.a) {
                u.m.d b8 = ((u.l.a) lVar).c().b();
                if (b8 instanceof u.m.d.a) {
                    return "deferred_payment_intent";
                }
                if (b8 instanceof u.m.d.b) {
                    return "deferred_setup_intent";
                }
                throw new L5.p();
            }
            if (lVar instanceof u.l.b) {
                return "payment_intent";
            }
            if (lVar instanceof u.l.c) {
                return "setup_intent";
            }
            throw new L5.p();
        }

        private final String i(AbstractC3991f abstractC3991f) {
            String str;
            if (abstractC3991f instanceof AbstractC3991f.c) {
                return "google_pay";
            }
            if (abstractC3991f instanceof AbstractC3991f.d) {
                return "link";
            }
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                o.p pVar = ((AbstractC3991f.C0916f) abstractC3991f).v().f24399e;
                if (pVar == null || (str = pVar.f24537a) == null) {
                    return "saved";
                }
                return str;
            }
            return "none";
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25795d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25797f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25794c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25796e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25793b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private l(AbstractC3991f abstractC3991f, u.l initializationMode, List orderedLpms, C2758a c2758a, b3.y yVar, boolean z8, boolean z9) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(initializationMode, "initializationMode");
            AbstractC3159y.i(orderedLpms, "orderedLpms");
            this.f25793b = z8;
            this.f25794c = z9;
            this.f25795d = "mc_load_succeeded";
            this.f25796e = yVar != null;
            Map k8 = Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("selected_lpm", i(abstractC3991f)), L5.x.a("intent_type", h(initializationMode)), L5.x.a("ordered_lpms", AbstractC1246t.w0(orderedLpms, ",", null, null, 0, null, null, 62, null)));
            Map e8 = yVar != null ? Q.e(L5.x.a("link_mode", yVar.b())) : null;
            this.f25797f = Q.q(k8, e8 == null ? Q.h() : e8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25798b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25799c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25800d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25801e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25802f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f25803g;

        public m(boolean z8, boolean z9, boolean z10, String str) {
            super(null);
            this.f25798b = z8;
            this.f25799c = z9;
            this.f25800d = z10;
            this.f25801e = str;
            this.f25802f = "luxe_serialize_failure";
            this.f25803g = Q.e(L5.x.a("error_message", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25802f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25803g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25800d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25799c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25798b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends c {

        /* renamed from: b, reason: collision with root package name */
        private final a f25804b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25805c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25806d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25807e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC3653f f25808f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25809g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f25810h;

        /* loaded from: classes4.dex */
        public interface a {

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0603a {
                public static String a(a aVar) {
                    if (aVar instanceof C0604c) {
                        return "success";
                    }
                    if (aVar instanceof b) {
                        return "failure";
                    }
                    throw new L5.p();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC3792b f25811a;

                public b(AbstractC3792b error) {
                    AbstractC3159y.i(error, "error");
                    this.f25811a = error;
                }

                public final AbstractC3792b a() {
                    return this.f25811a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC3159y.d(this.f25811a, ((b) obj).f25811a);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String h() {
                    return C0603a.a(this);
                }

                public int hashCode() {
                    return this.f25811a.hashCode();
                }

                public String toString() {
                    return "Failure(error=" + this.f25811a + ")";
                }
            }

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0604c implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0604c f25812a = new C0604c();

                private C0604c() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0604c);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String h() {
                    return C0603a.a(this);
                }

                public int hashCode() {
                    return 1616357393;
                }

                public String toString() {
                    return "Success";
                }
            }

            String h();
        }

        public /* synthetic */ n(EventReporter.Mode mode, a aVar, C2758a c2758a, AbstractC3991f abstractC3991f, String str, boolean z8, boolean z9, boolean z10, EnumC3653f enumC3653f, AbstractC3151p abstractC3151p) {
            this(mode, aVar, c2758a, abstractC3991f, str, z8, z9, z10, enumC3653f);
        }

        private final Map h() {
            Map map;
            EnumC3653f enumC3653f = this.f25808f;
            if (enumC3653f != null) {
                map = Q.e(L5.x.a("deferred_intent_confirmation_type", enumC3653f.b()));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        private final Map i() {
            a aVar = this.f25804b;
            if (aVar instanceof a.C0604c) {
                return Q.h();
            }
            if (aVar instanceof a.b) {
                return AbstractC3849b.a(Q.k(L5.x.a("error_message", ((a.b) aVar).a().a()), L5.x.a("error_code", ((a.b) this.f25804b).a().b())));
            }
            throw new L5.p();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25809g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25810h;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25807e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25806d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25805c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private n(EventReporter.Mode mode, a result, C2758a c2758a, AbstractC3991f abstractC3991f, String str, boolean z8, boolean z9, boolean z10, EnumC3653f enumC3653f) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(result, "result");
            this.f25804b = result;
            this.f25805c = z8;
            this.f25806d = z9;
            this.f25807e = z10;
            this.f25808f = enumC3653f;
            d dVar = c.f25737a;
            this.f25809g = dVar.d(mode, "payment_" + dVar.c(abstractC3991f) + "_" + result.h());
            this.f25810h = Q.q(Q.q(Q.q(Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("currency", str)), h()), AbstractC3793c.b(abstractC3991f)), i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25813b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25814c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25815d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25816e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25817f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f25813b = z8;
            this.f25814c = z9;
            this.f25815d = z10;
            this.f25816e = "mc_form_interacted";
            this.f25817f = Q.e(L5.x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25816e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25817f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25815d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25814c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25813b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25818b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25819c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25820d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25821e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25822f;

        public /* synthetic */ p(String str, C2758a c2758a, String str2, String str3, boolean z8, boolean z9, boolean z10, AbstractC3151p abstractC3151p) {
            this(str, c2758a, str2, str3, z8, z9, z10);
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25821e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25822f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25820d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25819c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25818b;
        }

        private p(String str, C2758a c2758a, String str2, String str3, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            this.f25818b = z8;
            this.f25819c = z9;
            this.f25820d = z10;
            this.f25821e = "mc_confirm_button_tapped";
            this.f25822f = AbstractC3849b.a(Q.k(L5.x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3793c.a(c2758a.L())) : null), L5.x.a("currency", str), L5.x.a("selected_lpm", str2), L5.x.a("link_context", str3)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25823b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25824c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25825d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25826e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25827f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String code, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f25823b = z8;
            this.f25824c = z9;
            this.f25825d = z10;
            this.f25826e = "mc_carousel_payment_method_tapped";
            this.f25827f = Q.k(L5.x.a("currency", str), L5.x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25826e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25827f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25825d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25824c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25823b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25828b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25829c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25830d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25831e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25832f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EventReporter.Mode mode, AbstractC3991f abstractC3991f, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25828b = z8;
            this.f25829c = z9;
            this.f25830d = z10;
            d dVar = c.f25737a;
            this.f25831e = dVar.d(mode, "paymentoption_" + dVar.c(abstractC3991f) + "_select");
            this.f25832f = Q.e(L5.x.a("currency", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25831e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25832f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25830d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25829c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25828b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25833b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25834c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25835d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25836e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25837f;

        public s(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f25833b = z8;
            this.f25834c = z9;
            this.f25835d = z10;
            this.f25836e = "mc_open_edit_screen";
            this.f25837f = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25836e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25837f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25835d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25834c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25833b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class t extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25838b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25839c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25840d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25841e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25842f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25838b = z8;
            this.f25839c = z9;
            this.f25840d = z10;
            this.f25841e = c.f25737a.d(mode, "sheet_savedpm_show");
            this.f25842f = Q.e(L5.x.a("currency", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25841e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25842f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25840d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25839c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25838b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class u extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25843b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25844c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25845d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25846e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(mode, "mode");
            this.f25843b = z8;
            this.f25844c = z9;
            this.f25845d = z10;
            this.f25846e = c.f25737a.d(mode, "sheet_newpm_show");
            this.f25847f = Q.e(L5.x.a("currency", str));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25846e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25847f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25845d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25844c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25843b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class v extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25848b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25849c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25850d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25851e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25852f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25853b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f25854c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f25855d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f25856e;

            /* renamed from: a, reason: collision with root package name */
            private final String f25857a;

            static {
                a[] a8 = a();
                f25855d = a8;
                f25856e = R5.b.a(a8);
            }

            private a(String str, int i8, String str2) {
                this.f25857a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f25853b, f25854c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f25855d.clone();
            }

            public final String b() {
                return this.f25857a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a source, EnumC1870e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(source, "source");
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            this.f25848b = z8;
            this.f25849c = z9;
            this.f25850d = z10;
            this.f25851e = "mc_open_cbc_dropdown";
            this.f25852f = Q.k(L5.x.a("cbc_event_source", source.b()), L5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25851e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25852f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25850d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25849c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25848b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class w extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25858b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25859c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25860d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25861e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25862f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f25858b = z8;
            this.f25859c = z9;
            this.f25860d = z10;
            this.f25861e = "mc_form_shown";
            this.f25862f = Q.e(L5.x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25861e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25862f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25860d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25859c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25858b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class x extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25863b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25864c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25865d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25866e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25867f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(EnumC1870e selectedBrand, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            AbstractC3159y.i(error, "error");
            this.f25863b = z8;
            this.f25864c = z9;
            this.f25865d = z10;
            this.f25866e = "mc_update_card_failed";
            this.f25867f = Q.q(Q.k(L5.x.a("selected_card_brand", selectedBrand.f()), L5.x.a("error_message", error.getMessage())), k3.i.f33380a.c(error));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25866e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25867f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25865d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25864c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25863b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class y extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25868b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25869c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25870d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25871e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f25872f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(EnumC1870e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3159y.i(selectedBrand, "selectedBrand");
            this.f25868b = z8;
            this.f25869c = z9;
            this.f25870d = z10;
            this.f25871e = "mc_update_card";
            this.f25872f = Q.e(L5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f25871e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f25872f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f25870d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f25869c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f25868b;
        }
    }

    private c() {
    }

    private final Map g(boolean z8, boolean z9, boolean z10) {
        return Q.k(L5.x.a("is_decoupled", Boolean.valueOf(z8)), L5.x.a("link_enabled", Boolean.valueOf(z9)), L5.x.a("google_pay_enabled", Boolean.valueOf(z10)));
    }

    protected abstract Map b();

    protected abstract boolean c();

    protected abstract boolean d();

    public final Map e() {
        return Q.q(g(f(), d(), c()), b());
    }

    protected abstract boolean f();

    public /* synthetic */ c(AbstractC3151p abstractC3151p) {
        this();
    }
}
