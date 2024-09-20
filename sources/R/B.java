package R;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
final class B extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f8438a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f8439b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f8440c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Intent intent, Activity activity, int i8) {
        this.f8438a = intent;
        this.f8439b = activity;
        this.f8440c = i8;
    }

    @Override // R.D
    public final void a() {
        Intent intent = this.f8438a;
        if (intent != null) {
            this.f8439b.startActivityForResult(intent, this.f8440c);
        }
    }
}
