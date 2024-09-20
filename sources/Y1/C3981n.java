package y1;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: y1.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3981n extends AbstractC3969b {

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f39716k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final C3971d f39717a;

    /* renamed from: b, reason: collision with root package name */
    private final C3970c f39718b;

    /* renamed from: d, reason: collision with root package name */
    private H1.a f39720d;

    /* renamed from: e, reason: collision with root package name */
    private D1.a f39721e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39725i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f39726j;

    /* renamed from: c, reason: collision with root package name */
    private final List f39719c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f39722f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39723g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f39724h = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3981n(C3970c c3970c, C3971d c3971d) {
        D1.a bVar;
        this.f39718b = c3970c;
        this.f39717a = c3971d;
        r(null);
        if (c3971d.c() != EnumC3972e.HTML && c3971d.c() != EnumC3972e.JAVASCRIPT) {
            bVar = new D1.c(c3971d.f(), c3971d.g());
        } else {
            bVar = new D1.b(c3971d.j());
        }
        this.f39721e = bVar;
        this.f39721e.w();
        B1.c.e().b(this);
        this.f39721e.j(c3970c);
    }

    private void h() {
        if (!this.f39725i) {
        } else {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void i(View view) {
        if (view != null) {
        } else {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void j(String str) {
        if (str != null) {
            if (str.length() <= 50) {
                if (!f39716k.matcher(str).matches()) {
                    throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        }
    }

    private B1.e m(View view) {
        for (B1.e eVar : this.f39719c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void n() {
        if (!this.f39726j) {
        } else {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void p(View view) {
        Collection<C3981n> c8 = B1.c.e().c();
        if (c8 != null && !c8.isEmpty()) {
            for (C3981n c3981n : c8) {
                if (c3981n != this && c3981n.o() == view) {
                    c3981n.f39720d.clear();
                }
            }
        }
    }

    private void r(View view) {
        this.f39720d = new H1.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        h();
        w().u();
        this.f39725i = true;
    }

    @Override // y1.AbstractC3969b
    public void a(View view, EnumC3975h enumC3975h, String str) {
        if (this.f39723g) {
            return;
        }
        i(view);
        j(str);
        if (m(view) == null) {
            this.f39719c.add(new B1.e(view, enumC3975h, str));
        }
    }

    @Override // y1.AbstractC3969b
    public void c() {
        if (this.f39723g) {
            return;
        }
        this.f39720d.clear();
        e();
        this.f39723g = true;
        w().t();
        B1.c.e().d(this);
        w().o();
        this.f39721e = null;
    }

    @Override // y1.AbstractC3969b
    public void d(View view) {
        if (this.f39723g) {
            return;
        }
        E1.g.b(view, "AdView is null");
        if (o() == view) {
            return;
        }
        r(view);
        w().a();
        p(view);
    }

    @Override // y1.AbstractC3969b
    public void e() {
        if (this.f39723g) {
            return;
        }
        this.f39719c.clear();
    }

    @Override // y1.AbstractC3969b
    public void f(View view) {
        if (this.f39723g) {
            return;
        }
        i(view);
        B1.e m8 = m(view);
        if (m8 != null) {
            this.f39719c.remove(m8);
        }
    }

    @Override // y1.AbstractC3969b
    public void g() {
        if (this.f39722f) {
            return;
        }
        this.f39722f = true;
        B1.c.e().f(this);
        this.f39721e.b(B1.h.d().c());
        this.f39721e.g(B1.a.a().c());
        this.f39721e.k(this, this.f39717a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(List list) {
        if (s()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((H1.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(JSONObject jSONObject) {
        n();
        w().h(jSONObject);
        this.f39726j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View o() {
        return (View) this.f39720d.get();
    }

    public List q() {
        return this.f39719c;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        if (this.f39722f && !this.f39723g) {
            return true;
        }
        return false;
    }

    public boolean u() {
        return this.f39723g;
    }

    public String v() {
        return this.f39724h;
    }

    public D1.a w() {
        return this.f39721e;
    }

    public boolean x() {
        return this.f39718b.b();
    }

    public boolean y() {
        return this.f39718b.c();
    }

    public boolean z() {
        return this.f39722f;
    }
}
