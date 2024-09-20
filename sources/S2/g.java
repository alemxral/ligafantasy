package S2;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9002a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9003b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f9004c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9005d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9006e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9007f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, boolean z9, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f9002a = z8;
            this.f9003b = z9;
            this.f9004c = modifier;
            this.f9005d = i8;
            this.f9006e = i9;
            this.f9007f = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f9002a, this.f9003b, this.f9004c, this.f9005d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9006e | 1), this.f9007f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r53, boolean r54, androidx.compose.ui.Modifier r55, int r56, androidx.compose.runtime.Composer r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.g.a(boolean, boolean, androidx.compose.ui.Modifier, int, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String b(String str) {
        return g6.n.A(g6.n.A(g6.n.A(g6.n.A(str, "<terms>", "<a href=\"https://link.co/terms\">", false, 4, null), "</terms>", "</a>", false, 4, null), "<privacy>", "<a href=\"https://link.co/privacy\">", false, 4, null), "</privacy>", "</a>", false, 4, null);
    }
}
