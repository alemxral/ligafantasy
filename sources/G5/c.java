package G5;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3203b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3204c;

    public c(String str, a banner, List purposes) {
        AbstractC3159y.i(banner, "banner");
        AbstractC3159y.i(purposes, "purposes");
        this.f3202a = str;
        this.f3203b = banner;
        this.f3204c = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3159y.d(this.f3202a, cVar.f3202a) && AbstractC3159y.d(this.f3203b, cVar.f3203b) && AbstractC3159y.d(this.f3204c, cVar.f3204c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f3202a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f3204c.hashCode() + ((this.f3203b.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GBCPurposeResponse(language=");
        a8.append((Object) this.f3202a);
        a8.append(", banner=");
        a8.append(this.f3203b);
        a8.append(", purposes=");
        a8.append(this.f3204c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ c(String str, a aVar, List list, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? new a(null, null, null, null, 15) : null, (i8 & 4) != 0 ? AbstractC1246t.m() : null);
    }
}
