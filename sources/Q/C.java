package Q;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f8128a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f8129b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D f8130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(D d8, LifecycleCallback lifecycleCallback, String str) {
        this.f8130c = d8;
        this.f8128a = lifecycleCallback;
        this.f8129b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        D d8 = this.f8130c;
        i8 = d8.f8133b;
        if (i8 > 0) {
            LifecycleCallback lifecycleCallback = this.f8128a;
            bundle = d8.f8134c;
            if (bundle != null) {
                String str = this.f8129b;
                bundle3 = d8.f8134c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i9 = this.f8130c.f8133b;
        if (i9 >= 2) {
            this.f8128a.j();
        }
        i10 = this.f8130c.f8133b;
        if (i10 >= 3) {
            this.f8128a.h();
        }
        i11 = this.f8130c.f8133b;
        if (i11 >= 4) {
            this.f8128a.k();
        }
        i12 = this.f8130c.f8133b;
        if (i12 >= 5) {
            this.f8128a.g();
        }
    }
}
