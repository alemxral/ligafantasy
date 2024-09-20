package J3;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.stripe.android.model.o;
import e4.I0;
import j2.AbstractC3053E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;
import t4.AbstractC3794a;

/* loaded from: classes4.dex */
public abstract class Q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f4864a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f4865b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4866c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4867d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3654g c3654g, Function0 function0, Function0 function02, int i8) {
            super(2);
            this.f4864a = c3654g;
            this.f4865b = function0;
            this.f4866c = function02;
            this.f4867d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            Q.a(this.f4864a, this.f4865b, this.f4866c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4867d | 1));
        }
    }

    public static final void a(C3654g paymentMethod, Function0 onConfirmListener, Function0 onDismissListener, Composer composer, int i8) {
        String str;
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        AbstractC3159y.i(onConfirmListener, "onConfirmListener");
        AbstractC3159y.i(onDismissListener, "onDismissListener");
        Composer startRestartGroup = composer.startRestartGroup(-404084240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404084240, i8, -1, "com.stripe.android.paymentsheet.ui.RemovePaymentMethodDialogUI (RemovePaymentMethodDialogUI.kt:17)");
        }
        Resources resources = ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        String stringResource = StringResources_androidKt.stringResource(q3.w.f37430Y, new Object[]{AbstractC3794a.a(paymentMethod.b(), startRestartGroup, 8)}, startRestartGroup, 64);
        o.p pVar = paymentMethod.d().f24399e;
        startRestartGroup.startReplaceableGroup(1201397555);
        if (pVar == o.p.f24519i) {
            str = AbstractC3794a.a(paymentMethod.a(), startRestartGroup, 8);
        } else {
            String str2 = null;
            if (pVar == o.p.f24509O) {
                int i9 = q3.w.f37445g0;
                o.r rVar = paymentMethod.d().f24412r;
                if (rVar != null) {
                    str2 = rVar.f24547e;
                }
                str = resources.getString(i9, str2);
                AbstractC3159y.h(str, "getString(...)");
            } else if (pVar == o.p.f24523m) {
                int i10 = q3.w.f37445g0;
                o.n nVar = paymentMethod.d().f24406l;
                if (nVar != null) {
                    str2 = nVar.f24493e;
                }
                str = resources.getString(i10, str2);
                AbstractC3159y.h(str, "getString(...)");
            } else {
                str = "";
            }
        }
        String str3 = str;
        startRestartGroup.endReplaceableGroup();
        int i11 = i8 << 12;
        I0.a(stringResource, str3, StringResources_androidKt.stringResource(AbstractC3053E.f32825F0, startRestartGroup, 0), StringResources_androidKt.stringResource(AbstractC3053E.f32849V, startRestartGroup, 0), true, onConfirmListener, onDismissListener, startRestartGroup, (458752 & i11) | 24576 | (i11 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(paymentMethod, onConfirmListener, onDismissListener, i8));
        }
    }
}
