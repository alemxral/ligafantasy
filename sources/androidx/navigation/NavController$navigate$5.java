package androidx.navigation;

import L5.I;
import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.O;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$navigate$5 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Bundle $finalArgs;
    final /* synthetic */ O $navigated;
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$navigate$5(O o8, NavController navController, NavDestination navDestination, Bundle bundle) {
        super(1);
        this.$navigated = o8;
        this.this$0 = navController;
        this.$node = navDestination;
        this.$finalArgs = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return I.f6474a;
    }

    public final void invoke(NavBackStackEntry it) {
        AbstractC3159y.i(it, "it");
        this.$navigated.f33743a = true;
        NavController.addEntryToBackStack$default(this.this$0, this.$node, this.$finalArgs, it, null, 8, null);
    }
}
