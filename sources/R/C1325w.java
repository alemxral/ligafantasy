package R;

import P.a;
import android.os.Bundle;

/* renamed from: R.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1325w implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C1325w f8611b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f8612a;

    /* renamed from: R.w$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f8613a;

        /* synthetic */ a(AbstractC1327y abstractC1327y) {
        }

        public C1325w a() {
            return new C1325w(this.f8613a, null);
        }
    }

    /* synthetic */ C1325w(String str, AbstractC1328z abstractC1328z) {
        this.f8612a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f8612a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1325w)) {
            return false;
        }
        return AbstractC1317n.a(this.f8612a, ((C1325w) obj).f8612a);
    }

    public final int hashCode() {
        return AbstractC1317n.b(this.f8612a);
    }
}
