package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@Immutable
/* loaded from: classes.dex */
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, 63, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ ImeOptions(boolean z8, int i8, boolean z9, int i9, int i10, PlatformImeOptions platformImeOptions, AbstractC3151p abstractC3151p) {
        this(z8, i8, z9, i9, i10, platformImeOptions);
    }

    /* renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m4875copyYTHSh70$default(ImeOptions imeOptions, boolean z8, int i8, boolean z9, int i9, int i10, PlatformImeOptions platformImeOptions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z8 = imeOptions.singleLine;
        }
        if ((i11 & 2) != 0) {
            i8 = imeOptions.capitalization;
        }
        int i12 = i8;
        if ((i11 & 4) != 0) {
            z9 = imeOptions.autoCorrect;
        }
        boolean z10 = z9;
        if ((i11 & 8) != 0) {
            i9 = imeOptions.keyboardType;
        }
        int i13 = i9;
        if ((i11 & 16) != 0) {
            i10 = imeOptions.imeAction;
        }
        int i14 = i10;
        if ((i11 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        return imeOptions.m4877copyYTHSh70(z8, i12, z10, i13, i14, platformImeOptions);
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m4876copyuxg59PA$default(ImeOptions imeOptions, boolean z8, int i8, boolean z9, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z8 = imeOptions.singleLine;
        }
        if ((i11 & 2) != 0) {
            i8 = imeOptions.capitalization;
        }
        int i12 = i8;
        if ((i11 & 4) != 0) {
            z9 = imeOptions.autoCorrect;
        }
        boolean z10 = z9;
        if ((i11 & 8) != 0) {
            i9 = imeOptions.keyboardType;
        }
        int i13 = i9;
        if ((i11 & 16) != 0) {
            i10 = imeOptions.imeAction;
        }
        return imeOptions.m4878copyuxg59PA(z8, i12, z10, i13, i10);
    }

    /* renamed from: copy-YTHSh70, reason: not valid java name */
    public final ImeOptions m4877copyYTHSh70(boolean z8, int i8, boolean z9, int i9, int i10, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(z8, i8, z9, i9, i10, platformImeOptions, (AbstractC3151p) null);
    }

    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m4878copyuxg59PA(boolean z8, int i8, boolean z9, int i9, int i10) {
        return new ImeOptions(z8, i8, z9, i9, i10, this.platformImeOptions, (AbstractC3151p) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        if (this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m4887equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m4902equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m4855equalsimpl0(this.imeAction, imeOptions.imeAction) && AbstractC3159y.d(this.platformImeOptions, imeOptions.platformImeOptions)) {
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m4879getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m4880getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m4881getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        int i8;
        int a8 = ((((((((androidx.compose.foundation.a.a(this.singleLine) * 31) + KeyboardCapitalization.m4888hashCodeimpl(this.capitalization)) * 31) + androidx.compose.foundation.a.a(this.autoCorrect)) * 31) + KeyboardType.m4903hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m4856hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions != null) {
            i8 = platformImeOptions.hashCode();
        } else {
            i8 = 0;
        }
        return a8 + i8;
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m4889toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m4904toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m4857toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ')';
    }

    public /* synthetic */ ImeOptions(boolean z8, int i8, boolean z9, int i9, int i10, AbstractC3151p abstractC3151p) {
        this(z8, i8, z9, i9, i10);
    }

    private ImeOptions(boolean z8, int i8, boolean z9, int i9, int i10, PlatformImeOptions platformImeOptions) {
        this.singleLine = z8;
        this.capitalization = i8;
        this.autoCorrect = z9;
        this.keyboardType = i9;
        this.imeAction = i10;
        this.platformImeOptions = platformImeOptions;
    }

    public /* synthetic */ ImeOptions(boolean z8, int i8, boolean z9, int i9, int i10, PlatformImeOptions platformImeOptions, int i11, AbstractC3151p abstractC3151p) {
        this((i11 & 1) != 0 ? false : z8, (i11 & 2) != 0 ? KeyboardCapitalization.Companion.m4896getNoneIUNYP9k() : i8, (i11 & 4) != 0 ? true : z9, (i11 & 8) != 0 ? KeyboardType.Companion.m4922getTextPjHm6EE() : i9, (i11 & 16) != 0 ? ImeAction.Companion.m4867getDefaulteUduSuo() : i10, (i11 & 32) != 0 ? null : platformImeOptions, (AbstractC3151p) null);
    }

    public /* synthetic */ ImeOptions(boolean z8, int i8, boolean z9, int i9, int i10, int i11, AbstractC3151p abstractC3151p) {
        this((i11 & 1) != 0 ? false : z8, (i11 & 2) != 0 ? KeyboardCapitalization.Companion.m4896getNoneIUNYP9k() : i8, (i11 & 4) != 0 ? true : z9, (i11 & 8) != 0 ? KeyboardType.Companion.m4922getTextPjHm6EE() : i9, (i11 & 16) != 0 ? ImeAction.Companion.m4867getDefaulteUduSuo() : i10, (AbstractC3151p) null);
    }

    private ImeOptions(boolean z8, int i8, boolean z9, int i9, int i10) {
        this(z8, i8, z9, i9, i10, (PlatformImeOptions) null, (AbstractC3151p) null);
    }
}
