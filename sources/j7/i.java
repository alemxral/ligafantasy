package J7;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y5.t;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5622b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5623c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5624d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5625e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5626f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5627g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5628h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5629i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5630j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5631k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5632l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5633m;

    /* renamed from: n, reason: collision with root package name */
    public final List f5634n;

    /* renamed from: o, reason: collision with root package name */
    public final List f5635o;

    public i(String doneLabel, String searchLabel, String cancelLabel, String showVendorsLabel, String showIabLabel, String consentLabel, String flexPurposesLabel, String cookieAccessBodyText, String noneLabel, String someLabel, String allLabel, String closeLabel, String allVendorsLabel, List summaryScreenBodyRejectService, List summaryScreenBodyTextReject) {
        AbstractC3159y.i(doneLabel, "doneLabel");
        AbstractC3159y.i(searchLabel, "searchLabel");
        AbstractC3159y.i(cancelLabel, "cancelLabel");
        AbstractC3159y.i(showVendorsLabel, "showVendorsLabel");
        AbstractC3159y.i(showIabLabel, "showIabLabel");
        AbstractC3159y.i(consentLabel, "consentLabel");
        AbstractC3159y.i(flexPurposesLabel, "flexPurposesLabel");
        AbstractC3159y.i(cookieAccessBodyText, "cookieAccessBodyText");
        AbstractC3159y.i(noneLabel, "noneLabel");
        AbstractC3159y.i(someLabel, "someLabel");
        AbstractC3159y.i(allLabel, "allLabel");
        AbstractC3159y.i(closeLabel, "closeLabel");
        AbstractC3159y.i(allVendorsLabel, "allVendorsLabel");
        AbstractC3159y.i(summaryScreenBodyRejectService, "summaryScreenBodyRejectService");
        AbstractC3159y.i(summaryScreenBodyTextReject, "summaryScreenBodyTextReject");
        this.f5621a = doneLabel;
        this.f5622b = searchLabel;
        this.f5623c = cancelLabel;
        this.f5624d = showVendorsLabel;
        this.f5625e = showIabLabel;
        this.f5626f = consentLabel;
        this.f5627g = flexPurposesLabel;
        this.f5628h = cookieAccessBodyText;
        this.f5629i = noneLabel;
        this.f5630j = someLabel;
        this.f5631k = allLabel;
        this.f5632l = closeLabel;
        this.f5633m = allVendorsLabel;
        this.f5634n = summaryScreenBodyRejectService;
        this.f5635o = summaryScreenBodyTextReject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3159y.d(this.f5621a, iVar.f5621a) && AbstractC3159y.d(this.f5622b, iVar.f5622b) && AbstractC3159y.d(this.f5623c, iVar.f5623c) && AbstractC3159y.d(this.f5624d, iVar.f5624d) && AbstractC3159y.d(this.f5625e, iVar.f5625e) && AbstractC3159y.d(this.f5626f, iVar.f5626f) && AbstractC3159y.d(this.f5627g, iVar.f5627g) && AbstractC3159y.d(this.f5628h, iVar.f5628h) && AbstractC3159y.d(this.f5629i, iVar.f5629i) && AbstractC3159y.d(this.f5630j, iVar.f5630j) && AbstractC3159y.d(this.f5631k, iVar.f5631k) && AbstractC3159y.d(this.f5632l, iVar.f5632l) && AbstractC3159y.d(this.f5633m, iVar.f5633m) && AbstractC3159y.d(this.f5634n, iVar.f5634n) && AbstractC3159y.d(this.f5635o, iVar.f5635o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5635o.hashCode() + C6.l.a(this.f5634n, t.a(this.f5633m, t.a(this.f5632l, t.a(this.f5631k, t.a(this.f5630j, t.a(this.f5629i, t.a(this.f5628h, t.a(this.f5627g, t.a(this.f5626f, t.a(this.f5625e, t.a(this.f5624d, t.a(this.f5623c, t.a(this.f5622b, this.f5621a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "MobileUiLabels(doneLabel=" + this.f5621a + ", searchLabel=" + this.f5622b + ", cancelLabel=" + this.f5623c + ", showVendorsLabel=" + this.f5624d + ", showIabLabel=" + this.f5625e + ", consentLabel=" + this.f5626f + ", flexPurposesLabel=" + this.f5627g + ", cookieAccessBodyText=" + this.f5628h + ", noneLabel=" + this.f5629i + ", someLabel=" + this.f5630j + ", allLabel=" + this.f5631k + ", closeLabel=" + this.f5632l + ", allVendorsLabel=" + this.f5633m + ", summaryScreenBodyRejectService=" + this.f5634n + ", summaryScreenBodyTextReject=" + this.f5635o + ')';
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : null, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? "" : null, (i8 & 32) != 0 ? "" : null, (i8 & 64) != 0 ? "" : null, (i8 & 128) != 0 ? "" : null, (i8 & 256) != 0 ? "" : null, (i8 & 512) != 0 ? "" : null, (i8 & 1024) != 0 ? "" : null, (i8 & 2048) != 0 ? "" : null, (i8 & 4096) == 0 ? null : "", (i8 & 8192) != 0 ? AbstractC1246t.m() : null, (i8 & 16384) != 0 ? AbstractC1246t.m() : null);
    }
}
