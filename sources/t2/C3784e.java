package t2;

import androidx.core.os.EnvironmentCompat;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3784e extends AbstractC3790k {

    /* renamed from: f, reason: collision with root package name */
    private final String f38207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3784e(Throwable cause, String str) {
        super(null, null, 0, cause, cause.getMessage(), 7, null);
        AbstractC3159y.i(cause, "cause");
        this.f38207f = str;
    }

    @Override // t2.AbstractC3790k
    public String a() {
        String str = this.f38207f;
        if (str == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return str;
    }
}
