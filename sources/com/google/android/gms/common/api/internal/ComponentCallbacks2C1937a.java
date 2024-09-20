package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C1937a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C1937a f15108e = new ComponentCallbacks2C1937a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f15109a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f15110b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f15111c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f15112d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0376a {
        void a(boolean z8);
    }

    private ComponentCallbacks2C1937a() {
    }

    public static ComponentCallbacks2C1937a b() {
        return f15108e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C1937a componentCallbacks2C1937a = f15108e;
        synchronized (componentCallbacks2C1937a) {
            try {
                if (!componentCallbacks2C1937a.f15112d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1937a);
                    application.registerComponentCallbacks(componentCallbacks2C1937a);
                    componentCallbacks2C1937a.f15112d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z8) {
        synchronized (f15108e) {
            try {
                Iterator it = this.f15111c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0376a) it.next()).a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0376a interfaceC0376a) {
        synchronized (f15108e) {
            this.f15111c.add(interfaceC0376a);
        }
    }

    public boolean d() {
        return this.f15109a.get();
    }

    public boolean e(boolean z8) {
        if (!this.f15110b.get()) {
            if (W.k.b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f15110b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f15109a.set(true);
                }
            } else {
                return z8;
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f15110b;
        boolean compareAndSet = this.f15109a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f15110b;
        boolean compareAndSet = this.f15109a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f15109a.compareAndSet(false, true)) {
            this.f15110b.set(true);
            f(true);
        }
    }
}
