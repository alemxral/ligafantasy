package J7;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f5676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5677b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5678c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5679d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5680e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5681f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5682g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5683h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5684i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5685j;

    public n(String linksTitle, String nonIabVendorsLabel, String uspDnsTitle, List uspDnsText, String uspDoNotSellToggleText, String uspPrivacyPolicyLinkText, String uspDeleteDataLinkText, String uspAccessDataLinkText, String uspAcceptButton, List initScreenCustomLinks) {
        AbstractC3159y.i(linksTitle, "linksTitle");
        AbstractC3159y.i(nonIabVendorsLabel, "nonIabVendorsLabel");
        AbstractC3159y.i(uspDnsTitle, "uspDnsTitle");
        AbstractC3159y.i(uspDnsText, "uspDnsText");
        AbstractC3159y.i(uspDoNotSellToggleText, "uspDoNotSellToggleText");
        AbstractC3159y.i(uspPrivacyPolicyLinkText, "uspPrivacyPolicyLinkText");
        AbstractC3159y.i(uspDeleteDataLinkText, "uspDeleteDataLinkText");
        AbstractC3159y.i(uspAccessDataLinkText, "uspAccessDataLinkText");
        AbstractC3159y.i(uspAcceptButton, "uspAcceptButton");
        AbstractC3159y.i(initScreenCustomLinks, "initScreenCustomLinks");
        this.f5676a = linksTitle;
        this.f5677b = nonIabVendorsLabel;
        this.f5678c = uspDnsTitle;
        this.f5679d = uspDnsText;
        this.f5680e = uspDoNotSellToggleText;
        this.f5681f = uspPrivacyPolicyLinkText;
        this.f5682g = uspDeleteDataLinkText;
        this.f5683h = uspAccessDataLinkText;
        this.f5684i = uspAcceptButton;
        this.f5685j = initScreenCustomLinks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3159y.d(this.f5676a, nVar.f5676a) && AbstractC3159y.d(this.f5677b, nVar.f5677b) && AbstractC3159y.d(this.f5678c, nVar.f5678c) && AbstractC3159y.d(this.f5679d, nVar.f5679d) && AbstractC3159y.d(this.f5680e, nVar.f5680e) && AbstractC3159y.d(this.f5681f, nVar.f5681f) && AbstractC3159y.d(this.f5682g, nVar.f5682g) && AbstractC3159y.d(this.f5683h, nVar.f5683h) && AbstractC3159y.d(this.f5684i, nVar.f5684i) && AbstractC3159y.d(this.f5685j, nVar.f5685j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5685j.hashCode() + t.a(this.f5684i, t.a(this.f5683h, t.a(this.f5682g, t.a(this.f5681f, t.a(this.f5680e, C6.l.a(this.f5679d, t.a(this.f5678c, t.a(this.f5677b, this.f5676a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("PremiumUiLabels(linksTitle=");
        a8.append(this.f5676a);
        a8.append(", nonIabVendorsLabel=");
        a8.append(this.f5677b);
        a8.append(", uspDnsTitle=");
        a8.append(this.f5678c);
        a8.append(", uspDnsText=");
        a8.append(this.f5679d);
        a8.append(", uspDoNotSellToggleText=");
        a8.append(this.f5680e);
        a8.append(", uspPrivacyPolicyLinkText=");
        a8.append(this.f5681f);
        a8.append(", uspDeleteDataLinkText=");
        a8.append(this.f5682g);
        a8.append(", uspAccessDataLinkText=");
        a8.append(this.f5683h);
        a8.append(", uspAcceptButton=");
        a8.append(this.f5684i);
        a8.append(", initScreenCustomLinks=");
        a8.append(this.f5685j);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ n(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? AbstractC1246t.m() : list, (i8 & 16) != 0 ? "" : str4, (i8 & 32) != 0 ? "" : str5, (i8 & 64) != 0 ? "" : str6, (i8 & 128) != 0 ? "" : str7, (i8 & 256) == 0 ? str8 : "", (i8 & 512) != 0 ? new ArrayList() : list2);
    }
}
