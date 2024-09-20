package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14185d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f14186a;

    /* renamed from: b, reason: collision with root package name */
    private final Typeface f14187b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14188c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public final SpannableString a(String text) {
            Spanned fromHtml;
            AbstractC3159y.i(text, "text");
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml(text, 0);
                return new SpannableString(fromHtml);
            }
            return new SpannableString(Html.fromHtml(text));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public b(float f8, Typeface typeface, int i8) {
        AbstractC3159y.i(typeface, "typeface");
        this.f14186a = f8;
        this.f14187b = typeface;
        this.f14188c = i8;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint p8) {
        AbstractC3159y.i(p8, "p");
        p8.setTextSize(this.f14186a);
        p8.setTypeface(this.f14187b);
        p8.setColor(this.f14188c);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint p8) {
        AbstractC3159y.i(p8, "p");
        p8.setTextSize(this.f14186a);
        p8.setTypeface(this.f14187b);
        p8.setColor(this.f14188c);
    }
}
