package L;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g extends AsyncTaskLoader implements Q.j {

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f6013a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f6014b;

    public g(Context context, Set set) {
        super(context);
        this.f6013a = new Semaphore(0);
        this.f6014b = set;
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Iterator it = this.f6014b.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((P.f) it.next()).d(this)) {
                i8++;
            }
        }
        try {
            this.f6013a.tryAcquire(i8, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e8) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e8);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // androidx.loader.content.Loader
    protected final void onStartLoading() {
        this.f6013a.drainPermits();
        forceLoad();
    }
}
