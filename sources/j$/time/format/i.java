package j$.time.format;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i implements f {

    /* renamed from: f, reason: collision with root package name */
    static final long[] f31927f = {0, 10, 100, 1000, WorkRequest.MIN_BACKOFF_MILLIS, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, 10000000000L};

    /* renamed from: a, reason: collision with root package name */
    final j$.time.temporal.r f31928a;

    /* renamed from: b, reason: collision with root package name */
    final int f31929b;

    /* renamed from: c, reason: collision with root package name */
    final int f31930c;

    /* renamed from: d, reason: collision with root package name */
    private final u f31931d;

    /* renamed from: e, reason: collision with root package name */
    final int f31932e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j$.time.temporal.r rVar, int i8, int i9, u uVar) {
        this.f31928a = rVar;
        this.f31929b = i8;
        this.f31930c = i9;
        this.f31931d = uVar;
        this.f31932e = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i(j$.time.temporal.r rVar, int i8, int i9, u uVar, int i10) {
        this.f31928a = rVar;
        this.f31929b = i8;
        this.f31930c = i9;
        this.f31931d = uVar;
        this.f31932e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i b() {
        if (this.f31932e == -1) {
            return this;
        }
        return new i(this.f31928a, this.f31929b, this.f31930c, this.f31931d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i c(int i8) {
        int i9 = this.f31932e + i8;
        return new i(this.f31928a, this.f31929b, this.f31930c, this.f31931d, i9);
    }

    @Override // j$.time.format.f
    public boolean j(p pVar, StringBuilder sb) {
        j$.time.temporal.r rVar = this.f31928a;
        Long e8 = pVar.e(rVar);
        if (e8 == null) {
            return false;
        }
        long longValue = e8.longValue();
        s b8 = pVar.b();
        String l8 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l8.length();
        int i8 = this.f31930c;
        if (length > i8) {
            throw new RuntimeException("Field " + rVar + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i8);
        }
        b8.getClass();
        int i9 = this.f31929b;
        u uVar = this.f31931d;
        if (longValue >= 0) {
            int i10 = c.f31922a[uVar.ordinal()];
            if (i10 == 1 ? !(i9 >= 19 || longValue < f31927f[i9]) : i10 == 2) {
                sb.append('+');
            }
        } else {
            int i11 = c.f31922a[uVar.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                sb.append('-');
            } else if (i11 == 4) {
                throw new RuntimeException("Field " + rVar + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i12 = 0; i12 < i9 - l8.length(); i12++) {
            sb.append('0');
        }
        sb.append(l8);
        return true;
    }

    public String toString() {
        int i8 = this.f31930c;
        j$.time.temporal.r rVar = this.f31928a;
        u uVar = this.f31931d;
        int i9 = this.f31929b;
        if (i9 == 1 && i8 == 19 && uVar == u.NORMAL) {
            return "Value(" + rVar + ")";
        }
        if (i9 == i8 && uVar == u.NOT_NEGATIVE) {
            return "Value(" + rVar + "," + i9 + ")";
        }
        return "Value(" + rVar + "," + i9 + "," + i8 + "," + uVar + ")";
    }
}
