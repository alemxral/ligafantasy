package a4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragment;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1564h extends FragmentFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f13509a;

    /* renamed from: b, reason: collision with root package name */
    private final X3.q f13510b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f13511c;

    public C1564h(String directoryServerName, X3.q sdkTransactionId, Integer num) {
        AbstractC3159y.i(directoryServerName, "directoryServerName");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        this.f13509a = directoryServerName;
        this.f13510b = sdkTransactionId;
        this.f13511c = num;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public Fragment instantiate(ClassLoader classLoader, String className) {
        AbstractC3159y.i(classLoader, "classLoader");
        AbstractC3159y.i(className, "className");
        if (AbstractC3159y.d(className, ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.f13509a, this.f13510b, this.f13511c);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        AbstractC3159y.f(instantiate);
        return instantiate;
    }
}
