package a4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1567k extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f13526a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputEditText f13527b;

    public /* synthetic */ C1567k(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    public final TextInputLayout getInfoLabel$3ds2sdk_release() {
        return this.f13526a;
    }

    public final TextInputEditText getTextEntryView$3ds2sdk_release() {
        return this.f13527b;
    }

    public String getUserEntry() {
        String str;
        Editable text = this.f13527b.getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void setText(String text) {
        AbstractC3159y.i(text, "text");
        this.f13527b.setText(text);
    }

    public final void setTextBoxCustomization(T3.o oVar) {
        if (oVar == null) {
            return;
        }
        String k8 = oVar.k();
        if (k8 != null) {
            this.f13527b.setTextColor(Color.parseColor(k8));
        }
        Integer valueOf = Integer.valueOf(oVar.o());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.f13527b.setTextSize(2, valueOf.intValue());
        }
        if (oVar.c() >= 0) {
            float c8 = oVar.c();
            this.f13526a.setBoxCornerRadii(c8, c8, c8, c8);
        }
        String n8 = oVar.n();
        if (n8 != null) {
            this.f13526a.setBoxBackgroundMode(2);
            this.f13526a.setBoxStrokeColor(Color.parseColor(n8));
        }
        String i8 = oVar.i();
        if (i8 != null) {
            this.f13526a.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(i8)));
        }
    }

    public final void setTextEntryLabel(String str) {
        this.f13526a.setHint(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567k(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        Q3.g c8 = Q3.g.c(LayoutInflater.from(context), this, true);
        AbstractC3159y.h(c8, "inflate(...)");
        TextInputLayout label = c8.f8222b;
        AbstractC3159y.h(label, "label");
        this.f13526a = label;
        TextInputEditText textEntry = c8.f8223c;
        AbstractC3159y.h(textEntry, "textEntry");
        this.f13527b = textEntry;
    }
}
