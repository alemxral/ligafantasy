package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f19335a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f19336b;

    /* renamed from: A, reason: collision with root package name */
    private String f19337A;

    /* renamed from: B, reason: collision with root package name */
    private String f19338B;

    /* renamed from: C, reason: collision with root package name */
    private String f19339C;

    /* renamed from: D, reason: collision with root package name */
    private String f19340D;

    /* renamed from: E, reason: collision with root package name */
    private int f19341E;

    /* renamed from: F, reason: collision with root package name */
    private String f19342F;

    /* renamed from: G, reason: collision with root package name */
    private String f19343G;

    /* renamed from: I, reason: collision with root package name */
    private String f19345I;

    /* renamed from: J, reason: collision with root package name */
    private String f19346J;

    /* renamed from: K, reason: collision with root package name */
    private String f19347K;

    /* renamed from: L, reason: collision with root package name */
    private int f19348L;

    /* renamed from: M, reason: collision with root package name */
    private long f19349M;

    /* renamed from: N, reason: collision with root package name */
    private String f19350N;

    /* renamed from: O, reason: collision with root package name */
    private int f19351O;

    /* renamed from: d, reason: collision with root package name */
    private String f19353d;

    /* renamed from: e, reason: collision with root package name */
    private int f19354e;

    /* renamed from: g, reason: collision with root package name */
    private int f19356g;

    /* renamed from: h, reason: collision with root package name */
    private String f19357h;

    /* renamed from: i, reason: collision with root package name */
    private String f19358i;

    /* renamed from: j, reason: collision with root package name */
    private String f19359j;

    /* renamed from: k, reason: collision with root package name */
    private String f19360k;

    /* renamed from: l, reason: collision with root package name */
    private String f19361l;

    /* renamed from: m, reason: collision with root package name */
    private String f19362m;

    /* renamed from: n, reason: collision with root package name */
    private String f19363n;

    /* renamed from: o, reason: collision with root package name */
    private String f19364o;

    /* renamed from: p, reason: collision with root package name */
    private String f19365p;

    /* renamed from: q, reason: collision with root package name */
    private String f19366q;

    /* renamed from: r, reason: collision with root package name */
    private int f19367r;

    /* renamed from: s, reason: collision with root package name */
    private String f19368s;

    /* renamed from: t, reason: collision with root package name */
    private String f19369t;

    /* renamed from: u, reason: collision with root package name */
    private String f19370u;

    /* renamed from: w, reason: collision with root package name */
    private int f19372w;

    /* renamed from: x, reason: collision with root package name */
    private String f19373x;

    /* renamed from: y, reason: collision with root package name */
    private String f19374y;

    /* renamed from: z, reason: collision with root package name */
    private String f19375z;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19352c = null;

    /* renamed from: f, reason: collision with root package name */
    private int f19355f = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f19371v = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f19344H = 0;

    public n(String str, int i8, int i9, int i10, int i11, String str2, String str3, int i12, String str4, int i13, String str5) {
        this.f19368s = str;
        this.f19372w = i8;
        this.f19373x = str5;
        this.f19367r = i9;
        this.f19351O = i10;
        this.f19348L = i11;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f19374y = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f19375z = str3;
        this.f19341E = i12;
        this.f19360k = str4;
        this.f19349M = i13;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.f19339C != null) {
                stringBuffer.append("resource_type=" + next.f19339C + "&");
            }
            if (next.f19358i != null) {
                stringBuffer.append("creative=" + next.f19358i + "&");
            }
            Iterator<n> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f19368s + "&");
                stringBuffer.append("network_type=" + next.f19372w + "&");
                stringBuffer.append("network_str=" + next.f19373x + "&");
                stringBuffer.append("result=" + next.f19341E + "&");
                stringBuffer.append("duration=" + next.f19360k + "&");
                stringBuffer.append("video_size=" + next.f19349M + "&");
                stringBuffer.append("video_length=" + next.f19348L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f19357h + "&");
                stringBuffer.append("video_url=" + next.f19350N + "&");
                stringBuffer.append("rid=" + next.f19337A + "&");
                stringBuffer.append("rid_n=" + next.f19338B + "&");
                stringBuffer.append("unit_id=" + next.f19347K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.f19374y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f19368s + "&");
                stringBuffer.append("result=" + next.f19341E + "&");
                stringBuffer.append("duration=" + next.f19360k + "&");
                stringBuffer.append("video_size=" + next.f19349M + "&");
                stringBuffer.append("video_length=" + next.f19348L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f19357h + "&");
                stringBuffer.append("video_url=" + next.f19350N + "&");
                stringBuffer.append("rid=" + next.f19337A + "&");
                stringBuffer.append("rid_n=" + next.f19338B + "&");
                stringBuffer.append("unit_id=" + next.f19347K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.f19374y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
            it = it2;
        }
        return stringBuffer.toString();
    }

    public static String b(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("key=" + nVar.f19368s + "&");
            stringBuffer.append("result=" + nVar.f19341E + "&");
            stringBuffer.append("duration=" + nVar.f19360k + "&");
            stringBuffer.append("endcard_url=" + nVar.f19362m + "&");
            stringBuffer.append("cid=" + nVar.f19357h + "&");
            stringBuffer.append("unit_id=" + nVar.f19347K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("ad_type=" + nVar.f19353d + "&");
            stringBuffer.append("rid=" + nVar.f19337A + "&");
            stringBuffer.append("rid_n=" + nVar.f19338B + "&");
            stringBuffer.append("type=" + nVar.f19361l + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(nVar.f19354e);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static String c(List<n> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().f19365p);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            ad.a("VideoReportData", th.getMessage(), th);
            return null;
        }
    }

    public static String d(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("network_type=" + nVar.f19372w + "&");
                stringBuffer.append("cid=" + nVar.f19357h + "&");
                stringBuffer.append("image_url=" + nVar.f19366q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19337A + "&");
                stringBuffer.append("rid_n=" + nVar.f19338B + "&");
                stringBuffer.append("unit_id=" + nVar.f19347K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("cid=" + nVar.f19357h + "&");
                stringBuffer.append("image_url=" + nVar.f19366q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19337A + "&");
                stringBuffer.append("rid_n=" + nVar.f19338B + "&");
                stringBuffer.append("unit_id=" + nVar.f19347K + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String e(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("network_type=" + nVar.f19372w + "&");
                stringBuffer.append("network_str=" + nVar.f19373x + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f19357h + "&");
                stringBuffer.append("video_url=" + nVar.f19350N + "&");
                stringBuffer.append("rid=" + nVar.f19337A + "&");
                stringBuffer.append("rid_n=" + nVar.f19338B + "&");
                stringBuffer.append("unit_id=" + nVar.f19347K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(nVar.f19374y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f19357h + "&");
                stringBuffer.append("video_url=" + nVar.f19350N + "&");
                stringBuffer.append("rid=" + nVar.f19337A + "&");
                stringBuffer.append("rid_n=" + nVar.f19338B + "&");
                stringBuffer.append("unit_id=" + nVar.f19347K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(nVar.f19374y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String f(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19368s + "&");
        stringBuffer.append("cid=" + nVar.f19357h + "&");
        stringBuffer.append("unit_id=" + nVar.f19347K + "&");
        stringBuffer.append("network_type=" + nVar.f19372w + "&");
        stringBuffer.append("mraid_type=" + nVar.f19371v + "&");
        stringBuffer.append("rid_n=" + nVar.f19338B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f19337A);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public static String g(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19368s + "&");
        stringBuffer.append("result=" + nVar.f19341E + "&");
        stringBuffer.append("duration=" + nVar.f19360k + "&");
        stringBuffer.append("cid=" + nVar.f19357h + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f19353d + "&");
        stringBuffer.append("unit_id=" + nVar.f19347K + "&");
        stringBuffer.append("devid=" + nVar.f19359j + "&");
        stringBuffer.append("mraid_type=" + nVar.f19371v + "&");
        stringBuffer.append("network_type=" + nVar.f19372w + "&");
        if (!TextUtils.isEmpty(nVar.f19362m)) {
            stringBuffer.append("endcard_url=" + nVar.f19362m + "&");
        }
        if (!TextUtils.isEmpty(nVar.f19361l)) {
            stringBuffer.append("type=" + nVar.f19361l + "&");
        }
        if (nVar.f19339C != null) {
            stringBuffer.append("resource_type=" + nVar.f19339C + "&");
        }
        stringBuffer.append("rid_n=" + nVar.f19338B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f19337A);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static String h(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f19363n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f19345I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19347K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19357h) + "&");
                stringBuffer.append("network_str=" + nVar.f19373x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f19372w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f19363n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f19345I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19347K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19357h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final int A() {
        return this.f19344H;
    }

    public final String i() {
        return this.f19358i;
    }

    public final String j() {
        return this.f19359j;
    }

    public final int k() {
        return this.f19372w;
    }

    public final String l() {
        return this.f19373x;
    }

    public final int m() {
        return this.f19341E;
    }

    public final String n() {
        return this.f19360k;
    }

    public final long o() {
        return this.f19349M;
    }

    public final int p() {
        return this.f19348L;
    }

    public final String q() {
        return this.f19350N;
    }

    public final String r() {
        return this.f19374y;
    }

    public final String s() {
        return this.f19362m;
    }

    public final String t() {
        return this.f19361l;
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f19368s + ", networkType=" + this.f19372w + ", isCompleteView=" + this.f19367r + ", watchedMillis=" + this.f19351O + ", videoLength=" + this.f19348L + ", offerUrl=" + this.f19374y + ", reason=" + this.f19375z + ", result=" + this.f19341E + ", duration=" + this.f19360k + ", videoSize=" + this.f19349M + "]";
    }

    public final int u() {
        return this.f19354e;
    }

    public final String v() {
        return this.f19366q;
    }

    public final int w() {
        return this.f19367r;
    }

    public final int x() {
        return this.f19351O;
    }

    public final int y() {
        return this.f19371v;
    }

    public final String z() {
        return this.f19345I;
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19358i = URLEncoder.encode(str);
    }

    public final void j(String str) {
        this.f19359j = str;
    }

    public final void k(String str) {
        this.f19373x = str;
    }

    public final void l(String str) {
        this.f19360k = str;
    }

    public final void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19350N = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19362m = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void o(String str) {
        this.f19361l = str;
    }

    public final void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19366q = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19345I = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
    }

    public final void r(String str) {
        this.f19363n = str;
    }

    public final void s(String str) {
        this.f19370u = str;
    }

    public final void t(String str) {
        this.f19340D = str;
    }

    public final void u(String str) {
        this.f19342F = str;
    }

    public final void v(String str) {
        this.f19343G = str;
    }

    public static String c(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f19368s + "&");
            stringBuffer.append("cid=" + nVar.f19357h + "&");
            stringBuffer.append("rid=" + nVar.f19337A + "&");
            stringBuffer.append("rid_n=" + nVar.f19338B + "&");
            stringBuffer.append("unit_id=" + nVar.f19347K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("case=" + nVar.f19356g + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("network_type=");
            sb.append(nVar.f19372w);
            stringBuffer.append(sb.toString());
            return stringBuffer.toString();
        }
        return "";
    }

    public static String f(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("network_type=" + nVar.f19372w + "&");
                stringBuffer.append("result=" + nVar.f19341E + "&");
                stringBuffer.append("cid=" + nVar.f19357h + "&");
                stringBuffer.append("template_url=" + nVar.f19345I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19337A + "&");
                stringBuffer.append("rid_n=" + nVar.f19338B + "&");
                stringBuffer.append("unit_id=" + nVar.f19347K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("result=" + nVar.f19341E + "&");
                stringBuffer.append("cid=" + nVar.f19357h + "&");
                stringBuffer.append("template_url=" + nVar.f19345I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19337A + "&");
                stringBuffer.append("rid_n=" + nVar.f19338B + "&");
                stringBuffer.append("unit_id=" + nVar.f19347K + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public n() {
    }

    public n(String str, int i8, String str2, String str3, String str4) {
        this.f19368s = str;
        this.f19373x = str4;
        this.f19372w = i8;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f19374y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f19375z = str3;
    }

    public final String c() {
        return this.f19347K;
    }

    public final void c(String str) {
        this.f19347K = str;
    }

    public static String b(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f19368s + "&");
            stringBuffer.append("cid=" + nVar.f19357h + "&");
            stringBuffer.append("rid=" + nVar.f19337A + "&");
            stringBuffer.append("rid_n=" + nVar.f19338B + "&");
            stringBuffer.append("unit_id=" + nVar.f19347K + "&");
            stringBuffer.append("network_type=" + nVar.f19372w + "&");
            stringBuffer.append("mraid_type=" + nVar.f19371v + "&");
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    public final void c(int i8) {
        this.f19354e = i8;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f19375z) ? "" : this.f19375z;
    }

    public final void h(String str) {
        this.f19375z = str;
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19368s + "&");
        stringBuffer.append("cid=" + nVar.f19357h + "&");
        stringBuffer.append("unit_id=" + nVar.f19347K + "&");
        stringBuffer.append("network_type=" + nVar.f19372w + "&");
        stringBuffer.append("rid=" + nVar.f19337A + "&");
        stringBuffer.append("rid_n=" + nVar.f19338B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(nVar.h());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public n(String str, int i8, int i9, String str2, int i10, String str3, int i11, String str4) {
        this.f19368s = str;
        this.f19372w = i8;
        this.f19373x = str4;
        this.f19348L = i9;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f19374y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f19341E = i10;
        this.f19360k = str3;
        this.f19349M = i11;
    }

    public static String e(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19368s + "&");
        stringBuffer.append("result=" + nVar.f19341E + "&");
        stringBuffer.append("duration=" + nVar.f19360k + "&");
        stringBuffer.append("cid=" + nVar.f19357h + "&");
        stringBuffer.append("unit_id=" + nVar.f19347K + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f19353d + "&");
        stringBuffer.append("rid=" + nVar.f19337A + "&");
        stringBuffer.append("rid_n=" + nVar.f19338B + "&");
        stringBuffer.append("network_type=" + nVar.f19372w + "&");
        stringBuffer.append("mraid_type=" + nVar.f19371v + "&");
        stringBuffer.append("devid=" + nVar.f19359j + "&");
        if (nVar.f19339C != null) {
            stringBuffer.append("resource_type=" + nVar.f19339C + "&");
        }
        if (!TextUtils.isEmpty(nVar.f19362m)) {
            stringBuffer.append("endcard_url=" + nVar.f19362m + "&");
        }
        stringBuffer.append("type=" + nVar.f19361l);
        return stringBuffer.toString();
    }

    public final String g() {
        return this.f19338B;
    }

    public final void g(String str) {
        this.f19338B = str;
    }

    public final String b() {
        return this.f19339C;
    }

    public final void b(String str) {
        this.f19339C = str;
    }

    public final void b(int i8) {
        this.f19341E = i8;
    }

    public final String b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f19352c) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public final String d() {
        return this.f19353d;
    }

    public final void d(String str) {
        this.f19353d = str;
    }

    public n(Context context, CampaignEx campaignEx, int i8, String str, long j8, int i9) {
        if (i9 == 1 || i9 == 287 || i9 == 94) {
            this.f19368s = "m_download_end";
        } else if (i9 == 95) {
            this.f19368s = "2000025";
        }
        int l8 = z.l(context);
        this.f19372w = l8;
        this.f19373x = z.a(context, l8);
        this.f19348L = campaignEx.getVideoLength();
        this.f19337A = campaignEx.getRequestId();
        this.f19338B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f19374y)) {
            try {
                this.f19374y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f19341E = i8;
        this.f19360k = str;
        this.f19349M = j8 == 0 ? campaignEx.getVideoSize() : j8;
    }

    public final void d(int i8) {
        this.f19371v = i8;
    }

    public final String f() {
        return this.f19337A;
    }

    public final void f(String str) {
        this.f19337A = str;
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f19364o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f19346J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f19369t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19347K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19357h) + "&");
                stringBuffer.append("network_str=" + nVar.f19373x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f19372w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f19368s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f19364o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f19346J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f19369t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19347K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19357h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i8, String str7) {
        this.f19368s = str;
        this.f19364o = str2;
        this.f19346J = str3;
        this.f19369t = str4;
        this.f19347K = str5;
        this.f19357h = str6;
        this.f19372w = i8;
        this.f19373x = str7;
    }

    public final String e() {
        return this.f19357h;
    }

    public final void e(String str) {
        this.f19357h = str;
    }

    public final void e(int i8) {
        this.f19344H = i8;
    }

    public n(String str) {
        this.f19365p = str;
    }

    public n(String str, int i8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f19368s = str;
        this.f19341E = i8;
        this.f19360k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f19362m = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f19357h = str4;
        this.f19347K = str5;
        this.f19375z = str6;
        this.f19361l = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.f19387K) {
            this.f19341E = 2;
        }
    }

    public final String a() {
        return this.f19368s;
    }

    public final void a(String str) {
        this.f19368s = str;
    }

    public final void a(int i8) {
        this.f19372w = i8;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f19352c == null) {
            this.f19352c = new HashMap();
        }
        try {
            this.f19352c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8) {
        this.f19368s = str;
        this.f19357h = str2;
        this.f19337A = str3;
        this.f19338B = str4;
        this.f19347K = str5;
        this.f19372w = i8;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8, int i9, String str6) {
        this.f19368s = str;
        this.f19357h = str2;
        this.f19337A = str3;
        this.f19338B = str4;
        this.f19347K = str5;
        this.f19372w = i8;
        this.f19375z = str6;
        this.f19356g = i9;
    }
}
