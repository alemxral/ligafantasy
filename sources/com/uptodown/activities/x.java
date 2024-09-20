package com.uptodown.activities;

import X4.C1496f;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3319g;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class x extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29413a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29414b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29415a;

        public a(ArrayList positives) {
            AbstractC3159y.i(positives, "positives");
            this.f29415a = positives;
        }

        public final ArrayList a() {
            return this.f29415a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f29415a, ((a) obj).f29415a);
        }

        public int hashCode() {
            return this.f29415a.hashCode();
        }

        public String toString() {
            return "SecurityData(positives=" + this.f29415a + ')';
        }
    }

    public x() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34533a);
        this.f29413a = a8;
        this.f29414b = a8;
    }

    public final void a(Context context) {
        AbstractC3159y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        ArrayList A8 = new C3319g().A(context);
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.w() != null) {
            ArrayList w8 = aVar.w();
            AbstractC3159y.f(w8);
            Iterator it = w8.iterator();
            while (it.hasNext()) {
                X4.C c8 = (X4.C) it.next();
                Iterator it2 = A8.iterator();
                while (it2.hasNext()) {
                    C1496f c1496f = (C1496f) it2.next();
                    if (AbstractC3159y.d(c8.c(), c1496f.X())) {
                        c1496f.E0(c8);
                        arrayList.add(c1496f);
                    }
                }
            }
        }
        C3319g.f34476a.c(arrayList, context);
        this.f29413a.setValue(new AbstractC3337y.c(new a(arrayList)));
    }

    public final InterfaceC3349K b() {
        return this.f29414b;
    }
}
