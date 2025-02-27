package j$.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class r implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final r f31990d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    private final int f31991a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31992b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31993c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.h(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    private r(int i8, int i9, int i10) {
        this.f31991a = i8;
        this.f31992b = i9;
        this.f31993c = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r a(DataInput dataInput) {
        int readInt = dataInput.readInt();
        int readInt2 = dataInput.readInt();
        int readInt3 = dataInput.readInt();
        return ((readInt | readInt2) | readInt3) == 0 ? f31990d : new r(readInt, readInt2, readInt3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(DataOutput dataOutput) {
        dataOutput.writeInt(this.f31991a);
        dataOutput.writeInt(this.f31992b);
        dataOutput.writeInt(this.f31993c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f31991a == rVar.f31991a && this.f31992b == rVar.f31992b && this.f31993c == rVar.f31993c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f31993c, 16) + Integer.rotateLeft(this.f31992b, 8) + this.f31991a;
    }

    public final String toString() {
        if (this == f31990d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i8 = this.f31991a;
        if (i8 != 0) {
            sb.append(i8);
            sb.append('Y');
        }
        int i9 = this.f31992b;
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        int i10 = this.f31993c;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('D');
        }
        return sb.toString();
    }
}
