package com.mbridge.msdk.foundation.same.f;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f19549a;

    /* renamed from: b, reason: collision with root package name */
    private String f19550b;

    public a(String str, String str2) {
        this.f19549a = str;
        this.f19550b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ad.b("ReportTask", "start report");
            new com.mbridge.msdk.foundation.same.report.e.a(c.m().c()).post(0, d.f().f19683c, k.a(this.f19549a, c.m().c(), this.f19550b), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.f.a.1
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str) {
                    ad.b("ReportTask", str);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str) {
                    ad.b("ReportTask", str);
                }
            });
        } catch (Throwable th) {
            ad.b("ReportTask", th.getMessage());
        }
    }
}
