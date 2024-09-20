package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.download.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static d f23089c;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f23090a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f23091b;

    /* renamed from: d, reason: collision with root package name */
    private g f23092d;

    /* renamed from: e, reason: collision with root package name */
    private e f23093e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23094f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23095g = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: h, reason: collision with root package name */
    private final String f23096h = "down_type";

    private d() {
        this.f23094f = false;
        try {
            this.f23092d = g.a();
            this.f23093e = e.a.f23099a;
            this.f23090a = new CopyOnWriteArrayList<>();
            this.f23091b = new ConcurrentHashMap();
            com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 != null) {
                this.f23094f = b8.y(1);
            }
        } catch (Throwable th) {
            ad.a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f23089c == null) {
                    f23089c = new d();
                }
                dVar = f23089c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final String a(String str) {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            if (URLUtil.isValidUrl(str)) {
            }
            return str;
        }
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
            return str;
        }
        if (path.toLowerCase().endsWith(".zip")) {
            g gVar = this.f23092d;
            if (gVar != null) {
                return gVar.a(str);
            }
            return null;
        }
        e eVar = this.f23093e;
        return eVar != null ? eVar.a(str) : str;
    }
}
