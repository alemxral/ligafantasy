package Q;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class s extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f8143a;

    /* renamed from: b, reason: collision with root package name */
    private final r f8144b;

    public s(r rVar) {
        this.f8144b = rVar;
    }

    public final void a(Context context) {
        this.f8143a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f8143a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f8143a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f8144b.a();
            b();
        }
    }
}
