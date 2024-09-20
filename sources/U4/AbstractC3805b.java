package u4;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3805b {

    /* renamed from: u4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3805b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f38476d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f38477a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38478b;

        /* renamed from: c, reason: collision with root package name */
        private final ColorFilter f38479c;

        public /* synthetic */ a(int i8, int i9, ColorFilter colorFilter, int i10, AbstractC3151p abstractC3151p) {
            this(i8, i9, (i10 & 4) != 0 ? null : colorFilter);
        }

        public final ColorFilter a() {
            return this.f38479c;
        }

        public final int b() {
            return this.f38478b;
        }

        public final int c() {
            return this.f38477a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f38477a == aVar.f38477a && this.f38478b == aVar.f38478b && AbstractC3159y.d(this.f38479c, aVar.f38479c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = ((this.f38477a * 31) + this.f38478b) * 31;
            ColorFilter colorFilter = this.f38479c;
            if (colorFilter == null) {
                hashCode = 0;
            } else {
                hashCode = colorFilter.hashCode();
            }
            return i8 + hashCode;
        }

        public String toString() {
            return "Drawable(id=" + this.f38477a + ", contentDescription=" + this.f38478b + ", colorFilter=" + this.f38479c + ")";
        }

        public a(int i8, int i9, ColorFilter colorFilter) {
            super(null);
            this.f38477a = i8;
            this.f38478b = i9;
            this.f38479c = colorFilter;
        }
    }

    public /* synthetic */ AbstractC3805b(AbstractC3151p abstractC3151p) {
        this();
    }

    private AbstractC3805b() {
    }
}
