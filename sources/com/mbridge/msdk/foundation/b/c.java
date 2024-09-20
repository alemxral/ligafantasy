package com.mbridge.msdk.foundation.b;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f19008a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f19009b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f19010c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f19011d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f19012e = 4;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f19013f;

    /* renamed from: g, reason: collision with root package name */
    private String f19014g;

    /* renamed from: h, reason: collision with root package name */
    private int f19015h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f19016i = f19009b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f19017j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f19018k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f19019l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f19020m = new ArrayList();

    public final CopyOnWriteArrayList<CampaignEx> a() {
        return this.f19013f;
    }

    public final String b() {
        return this.f19014g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f19017j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f19018k;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String e() {
        List<String> list = this.f19019l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f19020m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f19016i;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f19013f = copyOnWriteArrayList;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f19018k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f19017j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f19019l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f19014g = str;
    }

    public final void a(int i8) {
        this.f19016i = i8;
    }
}
