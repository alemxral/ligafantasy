package m4;

import M5.AbstractC1246t;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3087m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35527a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f35529c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f35530d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35531e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35532f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, boolean z8, Set set, G g8, int i8, int i9) {
            super(2);
            this.f35527a = list;
            this.f35528b = z8;
            this.f35529c = set;
            this.f35530d = g8;
            this.f35531e = i8;
            this.f35532f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(272035656, i8, -1, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:52)");
            }
            List list = this.f35527a;
            boolean z8 = this.f35528b;
            Set set = this.f35529c;
            G g8 = this.f35530d;
            int i9 = this.f35531e;
            int i10 = this.f35532f;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l0.a(z8, (k0) it.next(), null, set, g8, i9, i10, composer, 4096, 4);
                i10 = i10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f35535c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f35536d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35537e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35538f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z8, Set set, G g8, int i8, int i9) {
            super(2);
            this.f35533a = list;
            this.f35534b = z8;
            this.f35535c = set;
            this.f35536d = g8;
            this.f35537e = i8;
            this.f35538f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1999432089, i8, -1, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:64)");
            }
            List list = this.f35533a;
            boolean z8 = this.f35534b;
            Set set = this.f35535c;
            G g8 = this.f35536d;
            int i9 = this.f35537e;
            int i10 = this.f35538f;
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC1246t.w();
                }
                int i13 = i11;
                int i14 = i10;
                int i15 = i9;
                G g9 = g8;
                l0.a(z8, (k0) obj, null, set, g8, i9, i10, composer, 4096, 4);
                composer.startReplaceableGroup(1380689524);
                if (i13 != AbstractC1246t.o(list)) {
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i16 = MaterialTheme.$stable;
                    DividerKt.m1213DivideroMI9zvI(PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, composer, i16).c()), 0.0f, 2, null), AbstractC3087m.n(materialTheme, composer, i16).f(), Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, composer, i16).c()), 0.0f, composer, 0, 8);
                }
                composer.endReplaceableGroup();
                i11 = i12;
                g8 = g9;
                i10 = i14;
                i9 = i15;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f35540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f35541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f35542d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35543e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35544f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f35545g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35546h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, h0 h0Var, Set set, G g8, int i8, int i9, int i10, int i11) {
            super(2);
            this.f35539a = z8;
            this.f35540b = h0Var;
            this.f35541c = set;
            this.f35542d = g8;
            this.f35543e = i8;
            this.f35544f = i9;
            this.f35545g = i10;
            this.f35546h = i11;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            i0.a(this.f35539a, this.f35540b, this.f35541c, this.f35542d, this.f35543e, this.f35544f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35545g | 1), this.f35546h);
        }
    }

    public static final void a(boolean z8, h0 element, Set hiddenIdentifiers, G g8, int i8, int i9, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        Composer composer2;
        AbstractC3159y.i(element, "element");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-939762920);
        if ((i11 & 16) != 0) {
            i13 = i10 & (-57345);
            i12 = FocusDirection.Companion.m2658getDowndhqQ8s();
        } else {
            i12 = i8;
            i13 = i10;
        }
        if ((i11 & 32) != 0) {
            i13 &= -458753;
            i14 = FocusDirection.Companion.m2665getUpdhqQ8s();
        } else {
            i14 = i9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-939762920, i13, -1, "com.stripe.android.uicore.elements.SectionElementUI (SectionElementUI.kt:27)");
        }
        if (!hiddenIdentifiers.contains(element.a())) {
            g0 f8 = element.f();
            C b8 = b(v4.f.a(f8.getError(), startRestartGroup, 8));
            startRestartGroup.startReplaceableGroup(-389236972);
            String str = null;
            if (b8 != null) {
                Object[] b9 = b8.b();
                startRestartGroup.startReplaceableGroup(-389235994);
                if (b9 != null) {
                    str = StringResources_androidKt.stringResource(b8.a(), Arrays.copyOf(b9, b9.length), startRestartGroup, 64);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-389236424);
                if (str == null) {
                    str = StringResources_androidKt.stringResource(b8.a(), startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
            }
            String str2 = str;
            startRestartGroup.endReplaceableGroup();
            List g9 = element.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : g9) {
                if (!((k0) obj).g()) {
                    arrayList.add(obj);
                }
            }
            List g10 = element.g();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : g10) {
                if (((k0) obj2).g()) {
                    arrayList2.add(obj2);
                }
            }
            int i15 = i12;
            int i16 = i14;
            composer2 = startRestartGroup;
            p0.a(f8.v(), str2, null, false, false, ComposableLambdaKt.composableLambda(startRestartGroup, 272035656, true, new a(arrayList2, z8, hiddenIdentifiers, g8, i15, i16)), ComposableLambdaKt.composableLambda(startRestartGroup, -1999432089, true, new b(arrayList, z8, hiddenIdentifiers, g8, i15, i16)), composer2, 1769472, 28);
        } else {
            composer2 = startRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, element, hiddenIdentifiers, g8, i12, i14, i10, i11));
        }
    }

    private static final C b(State state) {
        return (C) state.getValue();
    }
}
