package P7;

import J7.n;
import M5.AbstractC1246t;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f8115a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f8116b;

    /* renamed from: c, reason: collision with root package name */
    public final J7.a f8117c;

    /* renamed from: d, reason: collision with root package name */
    public final E6.f f8118d;

    /* renamed from: e, reason: collision with root package name */
    public final H7.g f8119e;

    /* renamed from: f, reason: collision with root package name */
    public final G5.c f8120f;

    public f(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback, J7.a screenTexts, E6.f fVar, H7.g tracking, G5.c gbcPurposeResponse) {
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(screenTexts, "screenTexts");
        AbstractC3159y.i(tracking, "tracking");
        AbstractC3159y.i(gbcPurposeResponse, "gbcPurposeResponse");
        this.f8115a = sharedStorage;
        this.f8116b = choiceCmpCallback;
        this.f8117c = screenTexts;
        this.f8118d = fVar;
        this.f8119e = tracking;
        this.f8120f = gbcPurposeResponse;
    }

    public final String a() {
        E6.a aVar;
        String str;
        E6.f fVar = this.f8118d;
        if (fVar == null || (aVar = fVar.f2373b) == null || (str = aVar.f2316E) == null) {
            return "";
        }
        return str;
    }

    public final String b() {
        n nVar;
        String str;
        E6.f fVar = this.f8118d;
        if (fVar == null || (nVar = fVar.f2377f) == null || (str = nVar.f5683h) == null) {
            return "";
        }
        return str;
    }

    public final boolean c() {
        E6.f fVar;
        E6.a aVar;
        String str;
        if (b().length() > 0 && (fVar = this.f8118d) != null && (aVar = fVar.f2373b) != null && (str = aVar.f2316E) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String d() {
        if (!this.f8117c.f5523b.isEmpty()) {
            return (String) AbstractC1246t.m0(this.f8117c.f5523b);
        }
        return "";
    }

    public final boolean e() {
        boolean z8;
        E6.a aVar;
        E6.f fVar = this.f8118d;
        if (fVar != null && (aVar = fVar.f2373b) != null && aVar.f2314C) {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    public final String f() {
        E6.a aVar;
        String str;
        E6.f fVar = this.f8118d;
        if (fVar == null || (aVar = fVar.f2373b) == null || (str = aVar.f2315D) == null) {
            return "";
        }
        return str;
    }

    public final String g() {
        n nVar;
        String str;
        E6.f fVar = this.f8118d;
        if (fVar == null || (nVar = fVar.f2377f) == null || (str = nVar.f5682g) == null) {
            return "";
        }
        return str;
    }

    public final boolean h() {
        E6.f fVar;
        E6.a aVar;
        String str;
        if (g().length() > 0 && (fVar = this.f8118d) != null && (aVar = fVar.f2373b) != null && (str = aVar.f2315D) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String i() {
        E6.a aVar;
        String str;
        E6.f fVar = this.f8118d;
        if (fVar == null || (aVar = fVar.f2373b) == null || (str = aVar.f2317F) == null) {
            return "";
        }
        return str;
    }

    public final String j() {
        n nVar;
        String str;
        E6.f fVar = this.f8118d;
        if (fVar == null || (nVar = fVar.f2377f) == null || (str = nVar.f5681f) == null) {
            return "";
        }
        return str;
    }

    public final boolean k() {
        E6.f fVar;
        E6.a aVar;
        String str;
        if (j().length() > 0 && (fVar = this.f8118d) != null && (aVar = fVar.f2373b) != null && (str = aVar.f2317F) != null && str.length() > 0) {
            return true;
        }
        return false;
    }
}
