package R7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final B6.f f8899a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f8900b;

    /* renamed from: c, reason: collision with root package name */
    public final f f8901c;

    /* renamed from: d, reason: collision with root package name */
    public e f8902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8903e;

    /* renamed from: f, reason: collision with root package name */
    public String f8904f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f8905g;

    public d(B6.f value, Boolean bool, f viewType, e itemType, boolean z8, String text, Integer num) {
        AbstractC3159y.i(value, "value");
        AbstractC3159y.i(viewType, "viewType");
        AbstractC3159y.i(itemType, "itemType");
        AbstractC3159y.i(text, "text");
        this.f8899a = value;
        this.f8900b = bool;
        this.f8901c = viewType;
        this.f8902d = itemType;
        this.f8903e = z8;
        this.f8904f = text;
        this.f8905g = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f8899a, dVar.f8899a) && AbstractC3159y.d(this.f8900b, dVar.f8900b) && this.f8901c == dVar.f8901c && this.f8902d == dVar.f8902d && this.f8903e == dVar.f8903e && AbstractC3159y.d(this.f8904f, dVar.f8904f) && AbstractC3159y.d(this.f8905g, dVar.f8905g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f8899a.hashCode() * 31;
        Boolean bool = this.f8900b;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode3 = (this.f8902d.hashCode() + ((this.f8901c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31;
        boolean z8 = this.f8903e;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        int a8 = t.a(this.f8904f, (hashCode3 + i9) * 31, 31);
        Integer num = this.f8905g;
        if (num != null) {
            i8 = num.hashCode();
        }
        return a8 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("SwitchItemData(value=");
        a8.append(this.f8899a);
        a8.append(", selectedState=");
        a8.append(this.f8900b);
        a8.append(", viewType=");
        a8.append(this.f8901c);
        a8.append(", itemType=");
        a8.append(this.f8902d);
        a8.append(", isTagEnabled=");
        a8.append(this.f8903e);
        a8.append(", text=");
        a8.append(this.f8904f);
        a8.append(", counter=");
        a8.append(this.f8905g);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ d(B6.f fVar, Boolean bool, f fVar2, e eVar, boolean z8, String str, Integer num, int i8) {
        this((i8 & 1) != 0 ? new B6.f(0, null, 3) : fVar, (i8 & 2) != 0 ? null : bool, (i8 & 4) != 0 ? f.NORMAL : fVar2, (i8 & 8) != 0 ? e.IAB_VENDOR : eVar, (i8 & 16) != 0 ? true : z8, (i8 & 32) != 0 ? "" : str, (i8 & 64) == 0 ? num : null);
    }
}
