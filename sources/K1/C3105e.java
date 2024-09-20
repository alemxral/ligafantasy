package k1;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3105e {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f33313a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f33314b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f33315c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f33316d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f33317e;

    public C3105e(Boolean bool, Double d8, Integer num, Integer num2, Long l8) {
        this.f33313a = bool;
        this.f33314b = d8;
        this.f33315c = num;
        this.f33316d = num2;
        this.f33317e = l8;
    }

    public final Integer a() {
        return this.f33316d;
    }

    public final Long b() {
        return this.f33317e;
    }

    public final Boolean c() {
        return this.f33313a;
    }

    public final Integer d() {
        return this.f33315c;
    }

    public final Double e() {
        return this.f33314b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105e)) {
            return false;
        }
        C3105e c3105e = (C3105e) obj;
        if (AbstractC3159y.d(this.f33313a, c3105e.f33313a) && AbstractC3159y.d(this.f33314b, c3105e.f33314b) && AbstractC3159y.d(this.f33315c, c3105e.f33315c) && AbstractC3159y.d(this.f33316d, c3105e.f33316d) && AbstractC3159y.d(this.f33317e, c3105e.f33317e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Boolean bool = this.f33313a;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i9 = hashCode * 31;
        Double d8 = this.f33314b;
        if (d8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d8.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Integer num = this.f33315c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num2 = this.f33316d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l8 = this.f33317e;
        if (l8 != null) {
            i8 = l8.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f33313a + ", sessionSamplingRate=" + this.f33314b + ", sessionRestartTimeout=" + this.f33315c + ", cacheDuration=" + this.f33316d + ", cacheUpdatedTime=" + this.f33317e + ')';
    }
}
