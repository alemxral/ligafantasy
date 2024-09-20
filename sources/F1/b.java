package F1;

import B1.e;
import E1.h;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import y1.C3981n;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f2421a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f2422b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f2423c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f2424d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f2425e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f2426f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f2427g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map f2428h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f2429i;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final e f2430a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f2431b = new ArrayList();

        public a(e eVar, String str) {
            this.f2430a = eVar;
            b(str);
        }

        public e a() {
            return this.f2430a;
        }

        public void b(String str) {
            this.f2431b.add(str);
        }

        public ArrayList c() {
            return this.f2431b;
        }
    }

    private String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a8 = h.a(view);
            if (a8 != null) {
                return a8;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        this.f2424d.addAll(hashSet);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(e eVar, C3981n c3981n) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = (a) this.f2422b.get(view);
        if (aVar != null) {
            aVar.b(c3981n.v());
        } else {
            this.f2422b.put(view, new a(eVar, c3981n.v()));
        }
    }

    private void e(C3981n c3981n) {
        Iterator it = c3981n.q().iterator();
        while (it.hasNext()) {
            d((e) it.next(), c3981n);
        }
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f2428h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f2428h.containsKey(view)) {
            return (Boolean) this.f2428h.get(view);
        }
        Map map = this.f2428h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return (View) this.f2423c.get(str);
    }

    public void c() {
        this.f2421a.clear();
        this.f2422b.clear();
        this.f2423c.clear();
        this.f2424d.clear();
        this.f2425e.clear();
        this.f2426f.clear();
        this.f2427g.clear();
        this.f2429i = false;
    }

    public String g(String str) {
        return (String) this.f2427g.get(str);
    }

    public HashSet h() {
        return this.f2426f;
    }

    public a i(View view) {
        a aVar = (a) this.f2422b.get(view);
        if (aVar != null) {
            this.f2422b.remove(view);
        }
        return aVar;
    }

    public HashSet j() {
        return this.f2425e;
    }

    public String k(View view) {
        if (this.f2421a.size() == 0) {
            return null;
        }
        String str = (String) this.f2421a.get(view);
        if (str != null) {
            this.f2421a.remove(view);
        }
        return str;
    }

    public void l() {
        this.f2429i = true;
    }

    public d m(View view) {
        if (this.f2424d.contains(view)) {
            return d.PARENT_VIEW;
        }
        if (this.f2429i) {
            return d.OBSTRUCTION_VIEW;
        }
        return d.UNDERLYING_VIEW;
    }

    public void n() {
        B1.c e8 = B1.c.e();
        if (e8 != null) {
            for (C3981n c3981n : e8.a()) {
                View o8 = c3981n.o();
                if (c3981n.t()) {
                    String v8 = c3981n.v();
                    if (o8 != null) {
                        String b8 = b(o8);
                        if (b8 == null) {
                            this.f2425e.add(v8);
                            this.f2421a.put(o8, v8);
                            e(c3981n);
                        } else if (b8 != "noWindowFocus") {
                            this.f2426f.add(v8);
                            this.f2423c.put(v8, o8);
                            this.f2427g.put(v8, b8);
                        }
                    } else {
                        this.f2426f.add(v8);
                        this.f2427g.put(v8, "noAdView");
                    }
                }
            }
        }
    }

    public boolean o(View view) {
        if (this.f2428h.containsKey(view)) {
            this.f2428h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
