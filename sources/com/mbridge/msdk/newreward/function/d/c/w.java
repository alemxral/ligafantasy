package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class w extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f21131a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f21132b;

    /* renamed from: c, reason: collision with root package name */
    private final l f21133c;

    public w(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, l lVar) {
        this.f21131a = bVar;
        this.f21132b = aVar;
        this.f21133c = lVar;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        CampaignEx g8 = this.f21132b.g();
        if (TextUtils.isEmpty(g8.getMraid())) {
            xVar.b(this.f21131a, this.f21132b, this);
            return;
        }
        String a8 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(g8.getMraid());
        if (TextUtils.isEmpty(md5)) {
            md5 = String.valueOf(System.currentTimeMillis());
        }
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(a8, md5.concat(".html"));
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(("<script>" + com.mbridge.msdk.c.b.a.a().b() + "</script>" + g8.getMraid()).getBytes());
                fileOutputStream2.flush();
                g8.setMraid(file.getAbsolutePath());
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                g8.setMraid("");
                xVar.b(this.f21131a, this.f21132b, this);
            }
        } catch (Exception unused3) {
        }
        xVar.b(this.f21131a, this.f21132b, this);
    }
}
