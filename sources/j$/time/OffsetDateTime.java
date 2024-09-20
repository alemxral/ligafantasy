package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.chrono.AbstractC2870i;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.p, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    private final LocalDateTime f31833a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset f31834b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f31829c;
        ZoneOffset zoneOffset = ZoneOffset.f31839g;
        localDateTime.getClass();
        D(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f31830d;
        ZoneOffset zoneOffset2 = ZoneOffset.f31838f;
        localDateTime2.getClass();
        D(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f31833a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f31834b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
    }

    public static OffsetDateTime D(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime E(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d8 = zoneId.D().d(instant);
        return new OffsetDateTime(LocalDateTime.P(instant.E(), instant.F(), d8), d8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime G(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f31829c;
        h hVar = h.f31965d;
        return new OffsetDateTime(LocalDateTime.O(h.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.T(objectInput)), ZoneOffset.O(objectInput));
    }

    private OffsetDateTime H(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f31833a == localDateTime && this.f31834b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j8, j$.time.temporal.u uVar) {
        return uVar instanceof j$.time.temporal.b ? H(this.f31833a.e(j8, uVar), this.f31834b) : (OffsetDateTime) uVar.j(this, j8);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int I8;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f31834b;
        ZoneOffset zoneOffset2 = this.f31834b;
        if (zoneOffset2.equals(zoneOffset)) {
            I8 = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f31833a;
            localDateTime.getClass();
            long n8 = AbstractC2870i.n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f31833a;
            localDateTime2.getClass();
            int compare = Long.compare(n8, AbstractC2870i.n(localDateTime2, offsetDateTime2.f31834b));
            I8 = compare == 0 ? localDateTime.b().I() - localDateTime2.b().I() : compare;
        }
        return I8 == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : I8;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) rVar.r(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = p.f31987a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.f31834b;
        LocalDateTime localDateTime = this.f31833a;
        return i8 != 1 ? i8 != 2 ? H(localDateTime.d(j8, rVar), zoneOffset) : H(localDateTime, ZoneOffset.M(aVar.z(j8))) : E(Instant.H(j8, localDateTime.H()), zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f31833a.equals(offsetDateTime.f31833a) && this.f31834b.equals(offsetDateTime.f31834b);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.m(this));
    }

    public final int hashCode() {
        return this.f31833a.hashCode() ^ this.f31834b.hashCode();
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(this, rVar);
        }
        int i8 = p.f31987a[((j$.time.temporal.a) rVar).ordinal()];
        if (i8 != 1) {
            return i8 != 2 ? this.f31833a.j(rVar) : this.f31834b.J();
        }
        throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(h hVar) {
        return H(this.f31833a.V(hVar), this.f31834b);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) rVar).j() : this.f31833a.m(rVar) : rVar.u(this);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = p.f31987a[((j$.time.temporal.a) rVar).ordinal()];
        ZoneOffset zoneOffset = this.f31834b;
        LocalDateTime localDateTime = this.f31833a;
        if (i8 != 1) {
            return i8 != 2 ? localDateTime.r(rVar) : zoneOffset.J();
        }
        localDateTime.getClass();
        return AbstractC2870i.n(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f31833a;
    }

    public final String toString() {
        return this.f31833a.toString() + this.f31834b.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f31834b;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return null;
        }
        j$.time.temporal.t f8 = j$.time.temporal.n.f();
        LocalDateTime localDateTime = this.f31833a;
        return tVar == f8 ? localDateTime.T() : tVar == j$.time.temporal.n.g() ? localDateTime.b() : tVar == j$.time.temporal.n.e() ? j$.time.chrono.t.f31895d : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f31833a;
        return mVar.d(localDateTime.T().s(), aVar).d(localDateTime.b().U(), j$.time.temporal.a.NANO_OF_DAY).d(this.f31834b.J(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f31833a.X(objectOutput);
        this.f31834b.P(objectOutput);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
