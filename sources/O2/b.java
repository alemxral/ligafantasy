package O2;

import b3.o;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final o f7754a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7755b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7756c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7757d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7758e;

    /* renamed from: f, reason: collision with root package name */
    private final a f7759f;

    public b(o consumerSession) {
        boolean z8;
        a aVar;
        AbstractC3159y.i(consumerSession, "consumerSession");
        this.f7754a = consumerSession;
        this.f7755b = consumerSession.e();
        this.f7756c = consumerSession.d();
        this.f7757d = consumerSession.c();
        if (!b(consumerSession) && !f(consumerSession)) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f7758e = z8;
        if (z8) {
            aVar = a.f7747a;
        } else if (a(consumerSession)) {
            aVar = a.f7749c;
        } else {
            aVar = a.f7748b;
        }
        this.f7759f = aVar;
    }

    private final boolean a(o oVar) {
        Object obj;
        Iterator it = oVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.e() == o.d.e.f14512f && dVar.c() == o.d.EnumC0358d.f14500d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean b(o oVar) {
        Object obj;
        Iterator it = oVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.e() == o.d.e.f14512f && dVar.c() == o.d.EnumC0358d.f14502f) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final boolean f(o oVar) {
        Object obj;
        Iterator it = oVar.f().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                o.d dVar = (o.d) obj;
                if (dVar.e() == o.d.e.f14510d && dVar.c() == o.d.EnumC0358d.f14500d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final a c() {
        return this.f7759f;
    }

    public final String d() {
        return this.f7756c;
    }

    public final String e() {
        return this.f7757d;
    }
}
