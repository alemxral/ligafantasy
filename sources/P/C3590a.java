package p;

import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import java.util.LinkedHashMap;
import y5.s;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3590a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3590a f36945a = new C3590a();

    /* renamed from: b, reason: collision with root package name */
    public static CmpStatus f36946b;

    /* renamed from: c, reason: collision with root package name */
    public static s f36947c;

    /* renamed from: d, reason: collision with root package name */
    public static String f36948d;

    /* renamed from: e, reason: collision with root package name */
    public static String f36949e;

    static {
        new LinkedHashMap();
        f36946b = CmpStatus.LOADING;
        DisplayStatus displayStatus = DisplayStatus.VISIBLE;
    }

    public final CmpStatus a() {
        return f36946b;
    }

    public final void b(String str) {
        f36949e = str;
    }

    public final void c(s sVar) {
        f36947c = sVar;
    }

    public final String d() {
        return f36949e;
    }

    public final void e(String str) {
        f36948d = str;
    }

    public final s f() {
        return f36947c;
    }

    public final String g() {
        return f36948d;
    }
}
