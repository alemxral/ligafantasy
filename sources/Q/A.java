package Q;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f8121a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f8122b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B f8123c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(B b8, LifecycleCallback lifecycleCallback, String str) {
        this.f8123c = b8;
        this.f8121a = lifecycleCallback;
        this.f8122b = str;
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
        B b8 = this.f8123c;
        i8 = b8.f8126b;
        if (i8 > 0) {
            LifecycleCallback lifecycleCallback = this.f8121a;
            bundle = b8.f8127c;
            if (bundle != null) {
                String str = this.f8122b;
                bundle3 = b8.f8127c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i9 = this.f8123c.f8126b;
        if (i9 >= 2) {
            this.f8121a.j();
        }
        i10 = this.f8123c.f8126b;
        if (i10 >= 3) {
            this.f8121a.h();
        }
        i11 = this.f8123c.f8126b;
        if (i11 >= 4) {
            this.f8121a.k();
        }
        i12 = this.f8123c.f8126b;
        if (i12 >= 5) {
            this.f8121a.g();
        }
    }
}
