package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f19258a;

    /* renamed from: b, reason: collision with root package name */
    private String f19259b;

    /* renamed from: c, reason: collision with root package name */
    private String f19260c;

    /* renamed from: d, reason: collision with root package name */
    private int f19261d;

    /* renamed from: e, reason: collision with root package name */
    private int f19262e;

    /* renamed from: f, reason: collision with root package name */
    private String f19263f;

    /* renamed from: g, reason: collision with root package name */
    private String f19264g;

    /* renamed from: h, reason: collision with root package name */
    private String f19265h;

    /* renamed from: i, reason: collision with root package name */
    private int f19266i;

    /* renamed from: j, reason: collision with root package name */
    private String f19267j;

    /* renamed from: k, reason: collision with root package name */
    private int f19268k;

    /* renamed from: l, reason: collision with root package name */
    private int f19269l;

    /* renamed from: m, reason: collision with root package name */
    private String f19270m;

    /* renamed from: n, reason: collision with root package name */
    private int f19271n;

    /* renamed from: o, reason: collision with root package name */
    private String f19272o;

    /* renamed from: p, reason: collision with root package name */
    private String f19273p;

    /* renamed from: q, reason: collision with root package name */
    private int f19274q;

    /* renamed from: r, reason: collision with root package name */
    private String f19275r;

    public e() {
    }

    public static String a(List<e> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            e next = it.next();
            String str = next.f19275r;
            if (!TextUtils.isEmpty(str)) {
                String str2 = com.mbridge.msdk.foundation.controller.a.f19040b.get(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append("&");
                sb.append(sb2.toString());
            }
            Iterator<e> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.f19272o);
                sb.append("&rid_n=" + next.f19273p);
                sb.append("&network_type=" + next.f19271n);
                sb.append("&network_str=" + next.f19270m);
                sb.append("&cid=" + next.f19258a);
                sb.append("&click_type=" + next.f19261d);
                sb.append("&type=" + next.f19274q);
                sb.append("&click_duration=" + next.f19259b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f19275r);
                sb.append("&last_url=" + next.f19267j);
                sb.append("&content=" + next.f19263f);
                sb.append("&code=" + next.f19262e);
                sb.append("&exception=" + next.f19264g);
                sb.append("&header=" + next.f19265h);
                sb.append("&landing_type=" + next.f19266i);
                sb.append("&link_type=" + next.f19268k);
                sb.append("&click_time=" + next.f19260c + "\n");
            } else {
                sb.append("rid=" + next.f19272o);
                sb.append("&rid_n=" + next.f19273p);
                sb.append("&cid=" + next.f19258a);
                sb.append("&click_type=" + next.f19261d);
                sb.append("&type=" + next.f19274q);
                sb.append("&click_duration=" + next.f19259b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f19275r);
                sb.append("&last_url=" + next.f19267j);
                sb.append("&content=" + next.f19263f);
                sb.append("&code=" + next.f19262e);
                sb.append("&exception=" + next.f19264g);
                sb.append("&header=" + next.f19265h);
                sb.append("&landing_type=" + next.f19266i);
                sb.append("&link_type=" + next.f19268k);
                sb.append("&click_time=" + next.f19260c + "\n");
            }
            it = it2;
        }
        return sb.toString();
    }

    public final void b(String str) {
        this.f19272o = str;
    }

    public final void c(String str) {
        this.f19270m = str;
    }

    public final void d(String str) {
        this.f19264g = str;
    }

    public final void e(int i8) {
        this.f19268k = i8;
    }

    public final void f(String str) {
        this.f19265h = str;
    }

    public final void g(String str) {
        this.f19263f = str;
    }

    public final void h(String str) {
        this.f19267j = str;
    }

    public final void i(String str) {
        this.f19259b = str;
    }

    public final void j(String str) {
        this.f19258a = str;
    }

    public final void k(String str) {
        this.f19273p = str;
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f19258a + ", click_duration=" + this.f19259b + ", lastUrl=" + this.f19267j + ", code=" + this.f19262e + ", excepiton=" + this.f19264g + ", header=" + this.f19265h + ", content=" + this.f19263f + ", type=" + this.f19274q + ", click_type=" + this.f19261d + "]";
    }

    public e(String str, String str2, String str3, String str4, String str5, int i8, String str6, String str7, String str8, int i9, int i10, String str9, int i11, int i12, String str10, int i13, int i14, String str11) {
        this.f19272o = str;
        this.f19273p = str2;
        this.f19258a = str3;
        this.f19259b = str4;
        this.f19267j = str5;
        this.f19262e = i8;
        this.f19264g = str6;
        this.f19265h = str7;
        this.f19263f = str8;
        this.f19274q = i9;
        this.f19261d = i10;
        this.f19275r = str9;
        this.f19266i = i11;
        this.f19268k = i12;
        this.f19260c = str10;
        this.f19271n = i13;
        this.f19270m = str11;
        this.f19269l = i14;
    }

    public final void b(int i8) {
        this.f19261d = i8;
    }

    public final void c(int i8) {
        this.f19274q = i8;
    }

    public final void d(int i8) {
        this.f19266i = i8;
    }

    public final void e(String str) {
        this.f19260c = str;
    }

    public final void f(int i8) {
        this.f19262e = i8;
    }

    public final void a(String str) {
        this.f19275r = str;
    }

    public final void a(int i8) {
        this.f19271n = i8;
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = eVar.f19267j;
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + eVar.f19272o);
            sb.append("&rid_n=" + eVar.f19273p);
            sb.append("&network_type=" + eVar.f19271n);
            sb.append("&network_str=" + eVar.f19270m);
            sb.append("&click_type=" + eVar.f19261d);
            sb.append("&type=" + eVar.f19274q);
            sb.append("&cid=" + eVar.f19258a);
            sb.append("&click_duration=" + eVar.f19259b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f19275r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f19262e);
            sb.append("&exception=" + eVar.f19264g);
            sb.append("&landing_type=" + eVar.f19266i);
            sb.append("&link_type=" + eVar.f19268k);
            sb.append("&click_time=" + eVar.f19260c + "\n");
        } else {
            sb.append("rid=" + eVar.f19272o);
            sb.append("&rid_n=" + eVar.f19273p);
            sb.append("&click_type=" + eVar.f19261d);
            sb.append("&type=" + eVar.f19274q);
            sb.append("&cid=" + eVar.f19258a);
            sb.append("&click_duration=" + eVar.f19259b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f19275r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f19262e);
            sb.append("&exception=" + eVar.f19264g);
            sb.append("&landing_type=" + eVar.f19266i);
            sb.append("&link_type=" + eVar.f19268k);
            sb.append("&click_time=" + eVar.f19260c + "\n");
        }
        return sb.toString();
    }
}
