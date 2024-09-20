package J3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: J3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1208p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.p$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f5346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5347c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5348d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5345a = str;
            this.f5346b = modifier;
            this.f5347c = i8;
            this.f5348d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1208p.a(this.f5345a, this.f5346b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5347c | 1), this.f5348d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.AbstractC1208p.a(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
