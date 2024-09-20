package com.stripe.android.view;

import M5.AbstractC1246t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class StripeEditText extends TextInputEditText {

    /* renamed from: a, reason: collision with root package name */
    private boolean f27602a;

    /* renamed from: b, reason: collision with root package name */
    private a f27603b;

    /* renamed from: c, reason: collision with root package name */
    private b f27604c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f27605d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f27606e;

    /* renamed from: f, reason: collision with root package name */
    private int f27607f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f27608g;

    /* renamed from: h, reason: collision with root package name */
    private List f27609h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27610i;

    /* renamed from: j, reason: collision with root package name */
    private String f27611j;

    /* renamed from: k, reason: collision with root package name */
    private c f27612k;

    /* renamed from: l, reason: collision with root package name */
    private final f f27613l;

    /* renamed from: m, reason: collision with root package name */
    private final List f27614m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnFocusChangeListener f27615n;

    /* renamed from: o, reason: collision with root package name */
    private final String f27616o;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(String str);
    }

    /* loaded from: classes4.dex */
    private static final class d extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final b f27617a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InputConnection target, boolean z8, b bVar) {
            super(target, z8);
            AbstractC3159y.i(target, "target");
            this.f27617a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i8, int i9) {
            b bVar;
            CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
            if (textBeforeCursor != null && textBeforeCursor.length() == 0 && (bVar = this.f27617a) != null) {
                bVar.a();
            }
            return super.deleteSurroundingText(i8, i9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f27618a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27619b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27620c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readParcelable(e.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(Parcelable parcelable, String str, boolean z8) {
            this.f27618a = parcelable;
            this.f27619b = str;
            this.f27620c = z8;
        }

        public final String b() {
            return this.f27619b;
        }

        public final boolean c() {
            return this.f27620c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Parcelable e() {
            return this.f27618a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f27618a, eVar.f27618a) && AbstractC3159y.d(this.f27619b, eVar.f27619b) && this.f27620c == eVar.f27620c;
        }

        public int hashCode() {
            Parcelable parcelable = this.f27618a;
            int hashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            String str = this.f27619b;
            return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f27620c);
        }

        public String toString() {
            return "StripeEditTextState(superState=" + this.f27618a + ", errorMessage=" + this.f27619b + ", shouldShowError=" + this.f27620c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f27618a, i8);
            out.writeString(this.f27619b);
            out.writeInt(this.f27620c ? 1 : 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends Q0 {
        f() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            boolean z8;
            StripeEditText stripeEditText = StripeEditText.this;
            if (i10 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            stripeEditText.setLastKeyDelete$payments_core_release(z8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String str;
            a aVar = StripeEditText.this.f27603b;
            if (aVar != null) {
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                aVar.a(str);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final void d() {
        int i8;
        Context context = getContext();
        if (N0.f27423g.a(this.f27605d.getDefaultColor())) {
            i8 = j2.x.f33090g;
        } else {
            i8 = j2.x.f33089f;
        }
        this.f27607f = ContextCompat.getColor(context, i8);
    }

    private final boolean e(int i8) {
        return i8 == 67;
    }

    private final void g() {
        List list = this.f27609h;
        if (list == null) {
            list = AbstractC1246t.m();
        }
        if (!list.contains(this.f27613l)) {
            addTextChangedListener(this.f27613l);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: com.stripe.android.view.O0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
                boolean h8;
                h8 = StripeEditText.h(StripeEditText.this, view, i8, keyEvent);
                return h8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(StripeEditText this$0, View view, int i8, KeyEvent keyEvent) {
        b bVar;
        AbstractC3159y.i(this$0, "this$0");
        if (keyEvent.getAction() == 0) {
            boolean e8 = this$0.e(i8);
            this$0.f27602a = e8;
            if (e8 && this$0.length() == 0 && (bVar = this$0.f27604c) != null) {
                bVar.a();
                return false;
            }
            return false;
        }
        return false;
    }

    private final void i() {
        addTextChangedListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(StripeEditText this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        Iterator it = this$0.f27614m.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z8);
        }
        View.OnFocusChangeListener onFocusChangeListener = this$0.f27615n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z8);
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        List list;
        super.addTextChangedListener(textWatcher);
        if (textWatcher != null && (list = this.f27609h) != null) {
            list.add(textWatcher);
        }
    }

    public final boolean f() {
        return this.f27602a;
    }

    protected String getAccessibilityText() {
        return this.f27616o;
    }

    public final ColorStateList getDefaultColorStateList$payments_core_release() {
        return this.f27605d;
    }

    @ColorInt
    public final int getDefaultErrorColorInt() {
        d();
        return this.f27607f;
    }

    public final String getErrorMessage$payments_core_release() {
        return this.f27611j;
    }

    public final String getFieldText$payments_core_release() {
        String str;
        Editable text = getText();
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

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.f27614m;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f27615n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.f27610i;
    }

    public final void j() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        AbstractC3159y.i(outAttrs, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection != null) {
            return new d(onCreateInputConnection, true, this.f27604c);
        }
        return null;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        AbstractC3159y.i(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.f27610i);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.f27611j;
        if (!this.f27610i) {
            str = null;
        }
        info.setError(str);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        AbstractC3159y.g(parcelable, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState");
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.e());
        this.f27611j = eVar.b();
        setShouldShowError(eVar.c());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new e(super.onSaveInstanceState(), this.f27611j, this.f27610i);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        List list;
        super.removeTextChangedListener(textWatcher);
        if (textWatcher != null && (list = this.f27609h) != null) {
            list.remove(textWatcher);
        }
    }

    public final void setAfterTextChangedListener(a aVar) {
        this.f27603b = aVar;
    }

    @VisibleForTesting
    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        AbstractC3159y.i(colorStateList, "<set-?>");
        this.f27605d = colorStateList;
    }

    public final void setDeleteEmptyListener(b bVar) {
        this.f27604c = bVar;
    }

    public final void setErrorColor(@ColorInt int i8) {
        this.f27608g = Integer.valueOf(i8);
    }

    public final void setErrorMessage(String str) {
        this.f27611j = str;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.f27611j = str;
    }

    public final void setErrorMessageListener(c cVar) {
        this.f27612k = cVar;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z8) {
        this.f27602a = z8;
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.P0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                StripeEditText.k(StripeEditText.this, view, z8);
            }
        });
        this.f27615n = onFocusChangeListener;
    }

    public final void setShouldShowError(boolean z8) {
        int i8;
        c cVar;
        String str = this.f27611j;
        if (str != null && (cVar = this.f27612k) != null) {
            if (!z8) {
                str = null;
            }
            cVar.a(str);
        }
        if (this.f27610i != z8) {
            if (z8) {
                Integer num = this.f27608g;
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = this.f27607f;
                }
                super.setTextColor(i8);
            } else {
                ColorStateList colorStateList = this.f27606e;
                if (colorStateList == null) {
                    colorStateList = this.f27605d;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.f27610i = z8;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f27606e = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence charSequence) {
        List list = this.f27609h;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener((TextWatcher) it.next());
            }
        }
        setText(charSequence);
        List list2 = this.f27609h;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                super.addTextChangedListener((TextWatcher) it2.next());
            }
        }
    }

    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i8) {
        setTextColor(ColorStateList.valueOf(i8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27613l = new f();
        this.f27609h = new ArrayList();
        setMaxLines(1);
        i();
        g();
        ColorStateList textColors = getTextColors();
        AbstractC3159y.h(textColors, "getTextColors(...)");
        this.f27605d = textColors;
        d();
        setOnFocusChangeListener(null);
        this.f27614m = new ArrayList();
    }
}
