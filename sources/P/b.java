package P;

import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected final Status f7822a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.z()
            java.lang.String r1 = r4.G()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r4.G()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.f7822a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.b.<init>(com.google.android.gms.common.api.Status):void");
    }

    public Status a() {
        return this.f7822a;
    }
}
