package j$.time;

import com.mbridge.msdk.MBridgeConstans;
import j$.time.chrono.AbstractC2862a;
import j$.time.chrono.AbstractC2870i;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements j$.time.temporal.o, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    private final int f31985a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31986b;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.f("--");
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.v();
    }

    private o(int i8, int i9) {
        this.f31985a = i8;
        this.f31986b = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o D(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        byte readByte2 = dataInput.readByte();
        m G8 = m.G(readByte);
        Objects.requireNonNull(G8, "month");
        j$.time.temporal.a.DAY_OF_MONTH.D(readByte2);
        if (readByte2 <= G8.F()) {
            return new o(G8.getValue(), readByte2);
        }
        throw new RuntimeException("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + G8.name());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(DataOutput dataOutput) {
        dataOutput.writeByte(this.f31985a);
        dataOutput.writeByte(this.f31986b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i8 = this.f31985a - oVar.f31985a;
        return i8 == 0 ? this.f31986b - oVar.f31986b : i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f31985a == oVar.f31985a && this.f31986b == oVar.f31986b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH : rVar != null && rVar.m(this);
    }

    public final int hashCode() {
        return (this.f31985a << 6) + this.f31986b;
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return m(rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.j();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, rVar);
        }
        m G8 = m.G(this.f31985a);
        G8.getClass();
        int i8 = l.f31981a[G8.ordinal()];
        return j$.time.temporal.w.k(i8 != 1 ? (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) ? 30 : 31 : 28, m.G(r5).F());
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        int i8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i9 = n.f31984a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 == 1) {
            i8 = this.f31986b;
        } else {
            if (i9 != 2) {
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
            }
            i8 = this.f31985a;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i8 = this.f31985a;
        sb.append(i8 < 10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "");
        sb.append(i8);
        int i9 = this.f31986b;
        sb.append(i9 < 10 ? "-0" : "-");
        sb.append(i9);
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.t.f31895d : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        if (!((AbstractC2862a) AbstractC2870i.p(mVar)).equals(j$.time.chrono.t.f31895d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m d8 = mVar.d(this.f31985a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return d8.d(Math.min(d8.m(aVar).d(), this.f31986b), aVar);
    }
}
