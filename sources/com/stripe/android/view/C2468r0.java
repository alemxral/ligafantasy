package com.stripe.android.view;

import M5.AbstractC1246t;
import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import b3.C1858C;
import b3.C1859D;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2468r0 extends PagerAdapter {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27896j = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(C2468r0.class, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(C2468r0.class, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final int f27897k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f27898a;

    /* renamed from: b, reason: collision with root package name */
    private final j2.u f27899b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f27900c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f27901d;

    /* renamed from: e, reason: collision with root package name */
    private C1858C f27902e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27903f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27904g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1580e f27905h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1580e f27906i;

    /* renamed from: com.stripe.android.view.r0$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends RecyclerView.ViewHolder {
        public /* synthetic */ a(View view, AbstractC3151p abstractC3151p) {
            this(view);
        }

        /* renamed from: com.stripe.android.view.r0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0694a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final ShippingInfoWidget f27907a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C0694a(G2.r r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.widget.ScrollView r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.ShippingInfoWidget r3 = r3.f3159b
                    java.lang.String r0 = "shippingInfoWidget"
                    kotlin.jvm.internal.AbstractC3159y.h(r3, r0)
                    r2.f27907a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2468r0.a.C0694a.<init>(G2.r):void");
            }

            public final void a(j2.u paymentSessionConfig, C1858C c1858c, Set allowedShippingCountryCodes) {
                AbstractC3159y.i(paymentSessionConfig, "paymentSessionConfig");
                AbstractC3159y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
                this.f27907a.setHiddenFields(paymentSessionConfig.c());
                this.f27907a.setOptionalFields(paymentSessionConfig.e());
                this.f27907a.setAllowedCountryCodes(allowedShippingCountryCodes);
                this.f27907a.h(c1858c);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C0694a(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    G2.r r3 = G2.r.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2468r0.a.C0694a.<init>(android.view.ViewGroup):void");
            }
        }

        /* renamed from: com.stripe.android.view.r0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final SelectShippingMethodWidget f27908a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public b(G2.s r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.SelectShippingMethodWidget r3 = r3.f3161b
                    java.lang.String r0 = "selectShippingMethodWidget"
                    kotlin.jvm.internal.AbstractC3159y.h(r3, r0)
                    r2.f27908a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2468r0.a.b.<init>(G2.s):void");
            }

            public final void a(List shippingMethods, C1859D c1859d, Function1 onShippingMethodSelectedCallback) {
                AbstractC3159y.i(shippingMethods, "shippingMethods");
                AbstractC3159y.i(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
                this.f27908a.setShippingMethods(shippingMethods);
                this.f27908a.setShippingMethodSelectedCallback(onShippingMethodSelectedCallback);
                if (c1859d != null) {
                    this.f27908a.setSelectedShippingMethod(c1859d);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public b(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    G2.s r3 = G2.s.c(r0, r3, r1)
                    java.lang.String r0 = "inflate(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r3, r0)
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2468r0.a.b.<init>(android.view.ViewGroup):void");
            }
        }

        private a(View view) {
            super(view);
        }
    }

    /* renamed from: com.stripe.android.view.r0$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27909a;

        static {
            int[] iArr = new int[EnumC2467q0.values().length];
            try {
                iArr[EnumC2467q0.f27891b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2467q0.f27892c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27909a = iArr;
        }
    }

    /* renamed from: com.stripe.android.view.r0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2468r0 f27910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, C2468r0 c2468r0) {
            super(obj);
            this.f27910b = c2468r0;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27910b.f27904g = !AbstractC3159y.d((List) obj2, (List) obj);
        }
    }

    /* renamed from: com.stripe.android.view.r0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2468r0 f27911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, C2468r0 c2468r0) {
            super(obj);
            this.f27911b = c2468r0;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27911b.f27904g = !AbstractC3159y.d((C1859D) obj2, (C1859D) obj);
        }
    }

    public C2468r0(Context context, j2.u paymentSessionConfig, Set allowedShippingCountryCodes, Function1 onShippingMethodSelectedCallback) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(paymentSessionConfig, "paymentSessionConfig");
        AbstractC3159y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        AbstractC3159y.i(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
        this.f27898a = context;
        this.f27899b = paymentSessionConfig;
        this.f27900c = allowedShippingCountryCodes;
        this.f27901d = onShippingMethodSelectedCallback;
        C1576a c1576a = C1576a.f13550a;
        this.f27905h = new c(AbstractC1246t.m(), this);
        this.f27906i = new d(null, this);
    }

    private final List c() {
        EnumC2467q0 enumC2467q0 = EnumC2467q0.f27891b;
        EnumC2467q0 enumC2467q02 = null;
        if (!this.f27899b.k()) {
            enumC2467q0 = null;
        }
        EnumC2467q0 enumC2467q03 = EnumC2467q0.f27892c;
        if (this.f27899b.n() && (!this.f27899b.k() || this.f27903f)) {
            enumC2467q02 = enumC2467q03;
        }
        return AbstractC1246t.r(enumC2467q0, enumC2467q02);
    }

    public final EnumC2467q0 b(int i8) {
        return (EnumC2467q0) AbstractC1246t.p0(c(), i8);
    }

    public final C1859D d() {
        return (C1859D) this.f27906i.getValue(this, f27896j[1]);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup collection, int i8, Object view) {
        AbstractC3159y.i(collection, "collection");
        AbstractC3159y.i(view, "view");
        collection.removeView((View) view);
    }

    public final List e() {
        return (List) this.f27905h.getValue(this, f27896j[0]);
    }

    public final void f(C1859D c1859d) {
        this.f27906i.setValue(this, f27896j[1], c1859d);
    }

    public final void g(boolean z8) {
        this.f27903f = z8;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return c().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        AbstractC3159y.i(obj, "obj");
        if ((obj instanceof View) && ((View) obj).getTag() == EnumC2467q0.f27892c && this.f27904g) {
            this.f27904g = false;
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i8) {
        return this.f27898a.getString(((EnumC2467q0) c().get(i8)).b());
    }

    public final void h(C1858C c1858c) {
        this.f27902e = c1858c;
        notifyDataSetChanged();
    }

    public final void i(List list) {
        AbstractC3159y.i(list, "<set-?>");
        this.f27905h.setValue(this, f27896j[0], list);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup collection, int i8) {
        RecyclerView.ViewHolder c0694a;
        AbstractC3159y.i(collection, "collection");
        EnumC2467q0 enumC2467q0 = (EnumC2467q0) c().get(i8);
        int i9 = b.f27909a[enumC2467q0.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                c0694a = new a.b(collection);
            } else {
                throw new L5.p();
            }
        } else {
            c0694a = new a.C0694a(collection);
        }
        if (c0694a instanceof a.C0694a) {
            ((a.C0694a) c0694a).a(this.f27899b, this.f27902e, this.f27900c);
        } else if (c0694a instanceof a.b) {
            ((a.b) c0694a).a(e(), d(), this.f27901d);
        }
        collection.addView(c0694a.itemView);
        c0694a.itemView.setTag(enumC2467q0);
        View itemView = c0694a.itemView;
        AbstractC3159y.h(itemView, "itemView");
        return itemView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object o8) {
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(o8, "o");
        return view == o8;
    }
}
