package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.s;
import i2.InterfaceC2777e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: u, reason: collision with root package name */
    private static final long f23350u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f23351a;

    /* renamed from: b, reason: collision with root package name */
    long f23352b;

    /* renamed from: c, reason: collision with root package name */
    int f23353c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f23354d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23355e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23356f;

    /* renamed from: g, reason: collision with root package name */
    public final List f23357g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23358h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23359i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f23360j;

    /* renamed from: k, reason: collision with root package name */
    public final int f23361k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23362l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23363m;

    /* renamed from: n, reason: collision with root package name */
    public final float f23364n;

    /* renamed from: o, reason: collision with root package name */
    public final float f23365o;

    /* renamed from: p, reason: collision with root package name */
    public final float f23366p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23367q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f23368r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f23369s;

    /* renamed from: t, reason: collision with root package name */
    public final s.f f23370t;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f23371a;

        /* renamed from: b, reason: collision with root package name */
        private int f23372b;

        /* renamed from: c, reason: collision with root package name */
        private String f23373c;

        /* renamed from: d, reason: collision with root package name */
        private int f23374d;

        /* renamed from: e, reason: collision with root package name */
        private int f23375e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f23376f;

        /* renamed from: g, reason: collision with root package name */
        private int f23377g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f23378h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f23379i;

        /* renamed from: j, reason: collision with root package name */
        private float f23380j;

        /* renamed from: k, reason: collision with root package name */
        private float f23381k;

        /* renamed from: l, reason: collision with root package name */
        private float f23382l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f23383m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f23384n;

        /* renamed from: o, reason: collision with root package name */
        private List f23385o;

        /* renamed from: p, reason: collision with root package name */
        private Bitmap.Config f23386p;

        /* renamed from: q, reason: collision with root package name */
        private s.f f23387q;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Uri uri, int i8, Bitmap.Config config) {
            this.f23371a = uri;
            this.f23372b = i8;
            this.f23386p = config;
        }

        public v a() {
            boolean z8 = this.f23378h;
            if (z8 && this.f23376f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f23376f && this.f23374d == 0 && this.f23375e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z8 && this.f23374d == 0 && this.f23375e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f23387q == null) {
                this.f23387q = s.f.NORMAL;
            }
            return new v(this.f23371a, this.f23372b, this.f23373c, this.f23385o, this.f23374d, this.f23375e, this.f23376f, this.f23378h, this.f23377g, this.f23379i, this.f23380j, this.f23381k, this.f23382l, this.f23383m, this.f23384n, this.f23386p, this.f23387q);
        }

        public b b(int i8) {
            if (!this.f23378h) {
                this.f23376f = true;
                this.f23377g = i8;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c() {
            if (this.f23371a == null && this.f23372b == 0) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d() {
            if (this.f23387q != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e() {
            if (this.f23374d == 0 && this.f23375e == 0) {
                return false;
            }
            return true;
        }

        public b f(s.f fVar) {
            if (fVar != null) {
                if (this.f23387q == null) {
                    this.f23387q = fVar;
                    return this;
                }
                throw new IllegalStateException("Priority already set.");
            }
            throw new IllegalArgumentException("Priority invalid.");
        }

        public b g(int i8, int i9) {
            if (i8 >= 0) {
                if (i9 >= 0) {
                    if (i9 == 0 && i8 == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.f23374d = i8;
                    this.f23375e = i9;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public b h(InterfaceC2777e interfaceC2777e) {
            if (interfaceC2777e != null) {
                if (interfaceC2777e.key() != null) {
                    if (this.f23385o == null) {
                        this.f23385o = new ArrayList(2);
                    }
                    this.f23385o.add(interfaceC2777e);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f23354d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f23355e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.f23357g != null) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f23358h == 0 && this.f23359i == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        long nanoTime = System.nanoTime() - this.f23352b;
        if (nanoTime > f23350u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        if (!c() && this.f23364n == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (!e() && !b()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.f23351a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i8 = this.f23355e;
        if (i8 > 0) {
            sb.append(i8);
        } else {
            sb.append(this.f23354d);
        }
        List list = this.f23357g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC2777e interfaceC2777e : this.f23357g) {
                sb.append(' ');
                sb.append(interfaceC2777e.key());
            }
        }
        if (this.f23356f != null) {
            sb.append(" stableKey(");
            sb.append(this.f23356f);
            sb.append(')');
        }
        if (this.f23358h > 0) {
            sb.append(" resize(");
            sb.append(this.f23358h);
            sb.append(',');
            sb.append(this.f23359i);
            sb.append(')');
        }
        if (this.f23360j) {
            sb.append(" centerCrop");
        }
        if (this.f23362l) {
            sb.append(" centerInside");
        }
        if (this.f23364n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f23364n);
            if (this.f23367q) {
                sb.append(" @ ");
                sb.append(this.f23365o);
                sb.append(',');
                sb.append(this.f23366p);
            }
            sb.append(')');
        }
        if (this.f23368r) {
            sb.append(" purgeable");
        }
        if (this.f23369s != null) {
            sb.append(' ');
            sb.append(this.f23369s);
        }
        sb.append('}');
        return sb.toString();
    }

    private v(Uri uri, int i8, String str, List list, int i9, int i10, boolean z8, boolean z9, int i11, boolean z10, float f8, float f9, float f10, boolean z11, boolean z12, Bitmap.Config config, s.f fVar) {
        this.f23354d = uri;
        this.f23355e = i8;
        this.f23356f = str;
        if (list == null) {
            this.f23357g = null;
        } else {
            this.f23357g = DesugarCollections.unmodifiableList(list);
        }
        this.f23358h = i9;
        this.f23359i = i10;
        this.f23360j = z8;
        this.f23362l = z9;
        this.f23361k = i11;
        this.f23363m = z10;
        this.f23364n = f8;
        this.f23365o = f9;
        this.f23366p = f10;
        this.f23367q = z11;
        this.f23368r = z12;
        this.f23369s = config;
        this.f23370t = fVar;
    }
}
