package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.AbstractC2870i;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class q implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    private final k f31988a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f31989b;

    static {
        k kVar = k.f31973e;
        ZoneOffset zoneOffset = ZoneOffset.f31839g;
        kVar.getClass();
        D(kVar, zoneOffset);
        k kVar2 = k.f31974f;
        ZoneOffset zoneOffset2 = ZoneOffset.f31838f;
        kVar2.getClass();
        D(kVar2, zoneOffset2);
    }

    private q(k kVar, ZoneOffset zoneOffset) {
        this.f31988a = (k) Objects.requireNonNull(kVar, "time");
        this.f31989b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
    }

    public static q D(k kVar, ZoneOffset zoneOffset) {
        return new q(kVar, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q F(ObjectInput objectInput) {
        return new q(k.T(objectInput), ZoneOffset.O(objectInput));
    }

    private q G(k kVar, ZoneOffset zoneOffset) {
        return (this.f31988a == kVar && this.f31989b.equals(zoneOffset)) ? this : new q(kVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final q e(long j8, j$.time.temporal.u uVar) {
        return uVar instanceof j$.time.temporal.b ? G(this.f31988a.e(j8, uVar), this.f31989b) : (q) uVar.j(this, j8);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compare;
        q qVar = (q) obj;
        ZoneOffset zoneOffset = qVar.f31989b;
        ZoneOffset zoneOffset2 = this.f31989b;
        boolean equals = zoneOffset2.equals(zoneOffset);
        k kVar = qVar.f31988a;
        k kVar2 = this.f31988a;
        return (equals || (compare = Long.compare(kVar2.U() - (((long) zoneOffset2.J()) * C.NANOS_PER_SECOND), kVar.U() - (((long) qVar.f31989b.J()) * C.NANOS_PER_SECOND))) == 0) ? kVar2.compareTo(kVar) : compare;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (q) rVar.r(this, j8);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        k kVar = this.f31988a;
        return rVar == aVar ? G(kVar, ZoneOffset.M(((j$.time.temporal.a) rVar).z(j8))) : G(kVar.d(j8, rVar), this.f31989b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f31988a.equals(qVar.f31988a) && this.f31989b.equals(qVar.f31989b);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).E() || rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.m(this);
    }

    public final int hashCode() {
        return this.f31988a.hashCode() ^ this.f31989b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(h hVar) {
        return (q) AbstractC2870i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) rVar).j();
        }
        k kVar = this.f31988a;
        kVar.getClass();
        return j$.time.temporal.n.d(kVar, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS ? this.f31989b.J() : this.f31988a.r(rVar) : rVar.l(this);
    }

    public final String toString() {
        return this.f31988a.toString() + this.f31989b.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f31989b;
        }
        if (((tVar == j$.time.temporal.n.k()) || (tVar == j$.time.temporal.n.e())) || tVar == j$.time.temporal.n.f()) {
            return null;
        }
        return tVar == j$.time.temporal.n.g() ? this.f31988a : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(this.f31988a.U(), j$.time.temporal.a.NANO_OF_DAY).d(this.f31989b.J(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f31988a.Y(objectOutput);
        this.f31989b.P(objectOutput);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
