package X2;

import M5.AbstractC1246t;
import Y2.h;
import com.stripe.android.paymentsheet.u;
import e4.C2597a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import m4.D;
import m4.h0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f12202a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12203b;

    /* renamed from: c, reason: collision with root package name */
    private final List f12204c;

    /* renamed from: d, reason: collision with root package name */
    private final List f12205d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f12206e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12207f;

    /* renamed from: g, reason: collision with root package name */
    private Set f12208g;

    public b(h.a arguments) {
        AbstractC3159y.i(arguments, "arguments");
        this.f12202a = arguments;
        this.f12203b = new ArrayList();
        this.f12204c = new ArrayList();
        this.f12205d = new ArrayList();
        this.f12206e = new LinkedHashSet();
        this.f12208g = v2.d.f38765a.h();
        for (a aVar : a.d()) {
            if (aVar.f(this.f12202a.a())) {
                e(aVar);
            }
        }
        if (this.f12202a.a().b() == u.d.a.f26380c) {
            d(this, null, 1, null);
        }
    }

    public static /* synthetic */ b d(b bVar, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = bVar.f12208g;
        }
        return bVar.c(set);
    }

    public final List a() {
        h0 n8;
        List c8 = AbstractC1246t.c();
        c8.addAll(this.f12203b);
        Iterator it = this.f12206e.iterator();
        while (it.hasNext()) {
            c8.add(((a) it.next()).c(this.f12202a.d()));
        }
        c8.addAll(this.f12204c);
        if (this.f12207f && (n8 = new C2597a(null, this.f12208g, null, false, null, false, 61, null).n(this.f12202a.d(), this.f12202a.j())) != null) {
            c8.add(n8);
        }
        c8.addAll(this.f12205d);
        return AbstractC1246t.a(c8);
    }

    public final b b(D formElement) {
        AbstractC3159y.i(formElement, "formElement");
        this.f12204c.add(formElement);
        return this;
    }

    public final b c(Set availableCountries) {
        AbstractC3159y.i(availableCountries, "availableCountries");
        if (this.f12202a.a().b() != u.d.a.f26379b) {
            this.f12207f = true;
            this.f12208g = availableCountries;
        }
        return this;
    }

    public final b e(a type) {
        AbstractC3159y.i(type, "type");
        if (type.e(this.f12202a.a())) {
            this.f12206e.add(type);
        }
        return this;
    }
}
