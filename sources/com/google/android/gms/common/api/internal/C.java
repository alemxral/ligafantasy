package com.google.android.gms.common.api.internal;

import O.C1258b;
import O.C1263g;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class C extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f15103b;

    /* renamed from: c, reason: collision with root package name */
    protected final AtomicReference f15104c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f15105d;

    /* renamed from: e, reason: collision with root package name */
    protected final C1263g f15106e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(Q.e eVar, C1263g c1263g) {
        super(eVar);
        this.f15104c = new AtomicReference(null);
        this.f15105d = new e0.i(Looper.getMainLooper());
        this.f15106e = c1263g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C1258b c1258b, int i8) {
        this.f15104c.set(null);
        m(c1258b, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f15104c.set(null);
        n();
    }

    private static final int p(z zVar) {
        if (zVar == null) {
            return -1;
        }
        return zVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i8, int i9, Intent intent) {
        z zVar = (z) this.f15104c.get();
        if (i8 != 1) {
            if (i8 == 2) {
                int g8 = this.f15106e.g(b());
                if (g8 == 0) {
                    o();
                    return;
                } else if (zVar != null) {
                    if (zVar.b().s() == 18 && g8 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            if (i9 == -1) {
                o();
                return;
            }
            if (i9 == 0) {
                if (zVar != null) {
                    int i10 = 13;
                    if (intent != null) {
                        i10 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                    }
                    l(new C1258b(i10, null, zVar.b().toString()), p(zVar));
                    return;
                }
                return;
            }
        }
        if (zVar != null) {
            l(zVar.b(), zVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        z zVar;
        super.f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f15104c;
            if (bundle.getBoolean("resolving_error", false)) {
                zVar = new z(new C1258b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                zVar = null;
            }
            atomicReference.set(zVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        z zVar = (z) this.f15104c.get();
        if (zVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zVar.a());
        bundle.putInt("failed_status", zVar.b().s());
        bundle.putParcelable("failed_resolution", zVar.b().z());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f15103b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f15103b = false;
    }

    protected abstract void m(C1258b c1258b, int i8);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C1258b(13, null), p((z) this.f15104c.get()));
    }

    public final void s(C1258b c1258b, int i8) {
        AtomicReference atomicReference;
        z zVar = new z(c1258b, i8);
        do {
            atomicReference = this.f15104c;
            if (androidx.compose.animation.core.d.a(atomicReference, null, zVar)) {
                this.f15105d.post(new B(this, zVar));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
