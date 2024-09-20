package o0;

import P.a;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3522d {

    /* renamed from: a, reason: collision with root package name */
    public static final a.g f36340a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.g f36341b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0166a f36342c;

    /* renamed from: d, reason: collision with root package name */
    static final a.AbstractC0166a f36343d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f36344e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f36345f;

    /* renamed from: g, reason: collision with root package name */
    public static final P.a f36346g;

    /* renamed from: h, reason: collision with root package name */
    public static final P.a f36347h;

    static {
        a.g gVar = new a.g();
        f36340a = gVar;
        a.g gVar2 = new a.g();
        f36341b = gVar2;
        C3520b c3520b = new C3520b();
        f36342c = c3520b;
        C3521c c3521c = new C3521c();
        f36343d = c3521c;
        f36344e = new Scope("profile");
        f36345f = new Scope(NotificationCompat.CATEGORY_EMAIL);
        f36346g = new P.a("SignIn.API", c3520b, gVar);
        f36347h = new P.a("SignIn.INTERNAL_API", c3521c, gVar2);
    }
}
