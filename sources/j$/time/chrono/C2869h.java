package j$.time.chrono;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2869h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31866e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    private final m f31867a;

    /* renamed from: b, reason: collision with root package name */
    final int f31868b;

    /* renamed from: c, reason: collision with root package name */
    final int f31869c;

    /* renamed from: d, reason: collision with root package name */
    final int f31870d;

    static {
        j$.com.android.tools.r8.a.h(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2869h(m mVar, int i8, int i9, int i10) {
        Objects.requireNonNull(mVar, "chrono");
        this.f31867a = mVar;
        this.f31868b = i8;
        this.f31869c = i9;
        this.f31870d = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f31867a.i());
        dataOutput.writeInt(this.f31868b);
        dataOutput.writeInt(this.f31869c);
        dataOutput.writeInt(this.f31870d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2869h)) {
            return false;
        }
        C2869h c2869h = (C2869h) obj;
        if (this.f31868b == c2869h.f31868b && this.f31869c == c2869h.f31869c && this.f31870d == c2869h.f31870d) {
            if (((AbstractC2862a) this.f31867a).equals(c2869h.f31867a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC2862a) this.f31867a).hashCode() ^ (Integer.rotateLeft(this.f31870d, 16) + (Integer.rotateLeft(this.f31869c, 8) + this.f31868b));
    }

    public final String toString() {
        m mVar = this.f31867a;
        int i8 = this.f31870d;
        int i9 = this.f31869c;
        int i10 = this.f31868b;
        if (i10 == 0 && i9 == 0 && i8 == 0) {
            return ((AbstractC2862a) mVar).i() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC2862a) mVar).i());
        sb.append(" P");
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        if (i8 != 0) {
            sb.append(i8);
            sb.append('D');
        }
        return sb.toString();
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }
}
