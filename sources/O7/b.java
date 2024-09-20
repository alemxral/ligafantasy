package O7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f7788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f7789b;

    public b(a aVar) {
        this.f7789b = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3159y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC3159y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3159y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC3159y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3159y.i(activity, "activity");
        WeakReference weakReference = this.f7788a;
        if (weakReference == null || !AbstractC3159y.d((Activity) weakReference.get(), activity)) {
            if (!c.f7790a) {
                this.f7789b.a();
                c.f7790a = true;
            }
            this.f7788a = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Activity activity2;
        AbstractC3159y.i(activity, "activity");
        WeakReference weakReference = this.f7788a;
        if (weakReference == null) {
            activity2 = null;
        } else {
            activity2 = (Activity) weakReference.get();
        }
        if (AbstractC3159y.d(activity2, activity)) {
            if (c.f7790a) {
                this.f7789b.b();
                c.f7790a = false;
            }
            this.f7788a = null;
        }
    }
}
