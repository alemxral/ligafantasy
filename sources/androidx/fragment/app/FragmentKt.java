package androidx.fragment.app;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class FragmentKt {
    public static final void clearFragmentResult(Fragment fragment, String requestKey) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(requestKey);
    }

    public static final void clearFragmentResultListener(Fragment fragment, String requestKey) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(requestKey);
    }

    public static final void setFragmentResult(Fragment fragment, String requestKey, Bundle result) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(requestKey, "requestKey");
        AbstractC3159y.i(result, "result");
        fragment.getParentFragmentManager().setFragmentResult(requestKey, result);
    }

    public static final void setFragmentResultListener(Fragment fragment, String requestKey, final X5.n listener) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(requestKey, "requestKey");
        AbstractC3159y.i(listener, "listener");
        fragment.getParentFragmentManager().setFragmentResultListener(requestKey, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.n
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                FragmentKt.setFragmentResultListener$lambda$0(X5.n.this, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$0(X5.n tmp0, String p02, Bundle p12) {
        AbstractC3159y.i(tmp0, "$tmp0");
        AbstractC3159y.i(p02, "p0");
        AbstractC3159y.i(p12, "p1");
        tmp0.invoke(p02, p12);
    }
}
