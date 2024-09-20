package J7;

import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f5528a;

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f5529b;

    public b(Typeface typeface, Typeface typeface2) {
        this.f5528a = typeface;
        this.f5529b = typeface2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f5528a, bVar.f5528a) && AbstractC3159y.d(this.f5529b, bVar.f5529b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Typeface typeface = this.f5528a;
        int i8 = 0;
        if (typeface == null) {
            hashCode = 0;
        } else {
            hashCode = typeface.hashCode();
        }
        int i9 = hashCode * 31;
        Typeface typeface2 = this.f5529b;
        if (typeface2 != null) {
            i8 = typeface2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("ChoiceFonts(bold=");
        a8.append(this.f5528a);
        a8.append(", regular=");
        a8.append(this.f5529b);
        a8.append(')');
        return a8.toString();
    }
}
