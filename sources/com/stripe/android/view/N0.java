package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class N0 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f27423g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f27424h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f27425a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27426b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27427c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27428d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27429e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27430f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(int i8) {
            if ((((Color.red(i8) * 0.299d) + (Color.green(i8) * 0.587d)) + (Color.blue(i8) * 0.114d)) / 255 <= 0.5d) {
                return true;
            }
            return false;
        }

        public final boolean b(int i8) {
            if (Color.alpha(i8) < 16) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public N0(Context context) {
        AbstractC3159y.i(context, "context");
        this.f27425a = context;
        this.f27426b = g(R.attr.colorAccent).data;
        this.f27427c = g(R.attr.colorControlNormal).data;
        this.f27428d = g(R.attr.textColorPrimary).data;
        this.f27429e = g(R.attr.textColorSecondary).data;
        this.f27430f = g(R.attr.colorPrimary).data;
    }

    private final TypedValue g(int i8) {
        TypedValue typedValue = new TypedValue();
        this.f27425a.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue;
    }

    public final int a() {
        return this.f27426b;
    }

    public final int b() {
        return this.f27427c;
    }

    public final int c() {
        return this.f27430f;
    }

    public final int d() {
        return this.f27428d;
    }

    public final int e() {
        return this.f27429e;
    }

    public final Drawable f(Resources.Theme theme, int i8, int i9) {
        AbstractC3159y.i(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i8, typedValue, true);
        int i10 = typedValue.data;
        Drawable drawable = ContextCompat.getDrawable(this.f27425a, i9);
        AbstractC3159y.f(drawable);
        Drawable wrap = DrawableCompat.wrap(drawable);
        AbstractC3159y.h(wrap, "wrap(...)");
        DrawableCompat.setTint(wrap.mutate(), i10);
        return wrap;
    }
}
