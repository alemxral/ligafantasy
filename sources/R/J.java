package R;

import P.g;
import R.AbstractC1318o;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import r0.C3679j;

/* loaded from: classes3.dex */
final class J implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P.g f8447a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3679j f8448b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1318o.a f8449c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f8450d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(P.g gVar, C3679j c3679j, AbstractC1318o.a aVar, L l8) {
        this.f8447a = gVar;
        this.f8448b = c3679j;
        this.f8449c = aVar;
        this.f8450d = l8;
    }

    @Override // P.g.a
    public final void a(Status status) {
        if (status.L()) {
            this.f8448b.c(this.f8449c.a(this.f8447a.b(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f8448b.b(AbstractC1305b.a(status));
        }
    }
}
