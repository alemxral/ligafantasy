package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC2870i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    private final long f32042a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalDateTime f32043b;

    /* renamed from: c, reason: collision with root package name */
    private final ZoneOffset f32044c;

    /* renamed from: d, reason: collision with root package name */
    private final ZoneOffset f32045d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j8, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f32042a = j8;
        this.f32043b = LocalDateTime.P(j8, 0, zoneOffset);
        this.f32044c = zoneOffset;
        this.f32045d = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f32042a = AbstractC2870i.n(localDateTime, zoneOffset);
        this.f32043b = localDateTime;
        this.f32044c = zoneOffset;
        this.f32045d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final long C() {
        return this.f32042a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(DataOutput dataOutput) {
        a.c(this.f32042a, dataOutput);
        a.d(this.f32044c, dataOutput);
        a.d(this.f32045d, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f32042a, ((b) obj).f32042a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32042a == bVar.f32042a && this.f32044c.equals(bVar.f32044c) && this.f32045d.equals(bVar.f32045d);
    }

    public final int hashCode() {
        return (this.f32043b.hashCode() ^ this.f32044c.hashCode()) ^ Integer.rotateLeft(this.f32045d.hashCode(), 16);
    }

    public final LocalDateTime j() {
        return this.f32043b.R(this.f32045d.J() - this.f32044c.J());
    }

    public final LocalDateTime l() {
        return this.f32043b;
    }

    public final Duration m() {
        return Duration.r(this.f32045d.J() - this.f32044c.J());
    }

    public final ZoneOffset r() {
        return this.f32045d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(z() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f32043b);
        sb.append(this.f32044c);
        sb.append(" to ");
        sb.append(this.f32045d);
        sb.append(']');
        return sb.toString();
    }

    public final ZoneOffset u() {
        return this.f32044c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List v() {
        return z() ? Collections.emptyList() : j$.com.android.tools.r8.a.h(new Object[]{this.f32044c, this.f32045d});
    }

    public final boolean z() {
        return this.f32045d.J() > this.f32044c.J();
    }
}
