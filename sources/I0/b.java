package I0;

import H0.AbstractC1176j;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3678a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f3679b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3680c;

    public b(int i8, int i9) {
        this.f3679b = i8;
        this.f3680c = i9;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f3680c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i8) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i8) {
                return trim.substring(0, i8);
            }
            return trim;
        }
        return str;
    }

    public synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f3678a));
    }

    public synchronized boolean d(String str, String str2) {
        String b8 = b(str);
        if (this.f3678a.size() >= this.f3679b && !this.f3678a.containsKey(b8)) {
            E0.f.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f3679b);
            return false;
        }
        String c8 = c(str2, this.f3680c);
        if (AbstractC1176j.B((String) this.f3678a.get(b8), c8)) {
            return false;
        }
        Map map = this.f3678a;
        if (str2 == null) {
            c8 = "";
        }
        map.put(b8, c8);
        return true;
    }

    public synchronized void e(Map map) {
        String c8;
        try {
            int i8 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b8 = b((String) entry.getKey());
                if (this.f3678a.size() >= this.f3679b && !this.f3678a.containsKey(b8)) {
                    i8++;
                }
                String str = (String) entry.getValue();
                Map map2 = this.f3678a;
                if (str == null) {
                    c8 = "";
                } else {
                    c8 = c(str, this.f3680c);
                }
                map2.put(b8, c8);
            }
            if (i8 > 0) {
                E0.f.f().k("Ignored " + i8 + " entries when adding custom keys. Maximum allowable: " + this.f3679b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
