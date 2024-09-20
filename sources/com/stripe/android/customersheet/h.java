package com.stripe.android.customersheet;

import com.stripe.android.model.j;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final j f23744a;

    /* renamed from: b, reason: collision with root package name */
    private final Y2.d f23745b;

    public h(j elementsSession, Y2.d metadata) {
        AbstractC3159y.i(elementsSession, "elementsSession");
        AbstractC3159y.i(metadata, "metadata");
        this.f23744a = elementsSession;
        this.f23745b = metadata;
    }

    public final j a() {
        return this.f23744a;
    }

    public final Y2.d b() {
        return this.f23745b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC3159y.d(this.f23744a, hVar.f23744a) && AbstractC3159y.d(this.f23745b, hVar.f23745b);
    }

    public int hashCode() {
        return (this.f23744a.hashCode() * 31) + this.f23745b.hashCode();
    }

    public String toString() {
        return "ElementsSessionWithMetadata(elementsSession=" + this.f23744a + ", metadata=" + this.f23745b + ")";
    }
}
