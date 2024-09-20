package R;

import android.content.Intent;

/* loaded from: classes3.dex */
final class C extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f8441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q.e f8442b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(Intent intent, Q.e eVar, int i8) {
        this.f8441a = intent;
        this.f8442b = eVar;
    }

    @Override // R.D
    public final void a() {
        Intent intent = this.f8441a;
        if (intent != null) {
            this.f8442b.startActivityForResult(intent, 2);
        }
    }
}
