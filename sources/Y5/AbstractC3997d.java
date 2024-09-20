package y5;

import L5.I;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import r1.C3680a;
import v1.AbstractC3822c;

/* renamed from: y5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3997d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39869a = new a();

    /* renamed from: y5.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public final String a(s tcModel) {
            Integer num;
            int intValue;
            AbstractC3159y.i(tcModel, "tcModel");
            try {
                O7.d dVar = O7.d.f7793a;
                C3680a gppModel = dVar.g();
                SharedStorage m8 = dVar.m();
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38640a, Integer.valueOf(tcModel.f39921i));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38643d, Integer.valueOf(tcModel.f39925m));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38644e, Integer.valueOf(tcModel.f39926n));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38645f, Integer.valueOf(tcModel.f39922j));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38646g, tcModel.f39924l);
                String str = w1.h.f38943f;
                String str2 = AbstractC3822c.f38647h;
                B6.e eVar = tcModel.f39913a;
                if (eVar == null) {
                    num = null;
                } else {
                    num = eVar.f1036b;
                }
                if (num == null) {
                    intValue = tcModel.f39927o;
                } else {
                    intValue = num.intValue();
                }
                gppModel.k(str, str2, Integer.valueOf(intValue));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38648i, Integer.valueOf(tcModel.f()));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38649j, Boolean.valueOf(tcModel.f39917e));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38650k, Boolean.valueOf(tcModel.f39918f));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38651l, b(12, tcModel.f39929q));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38652m, b(24, tcModel.f39930r));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38653n, b(24, tcModel.f39931s));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38654o, Boolean.valueOf(tcModel.f39919g));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38655p, tcModel.f39920h);
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38656q, AbstractC1246t.W0(tcModel.f39938z.getAcceptedItems()));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38657r, AbstractC1246t.W0(tcModel.f39908C.getAcceptedItems()));
                String str3 = w1.h.f38943f;
                String str4 = AbstractC3822c.f38658s;
                ArrayList arrayList = new ArrayList();
                Iterator it = tcModel.f39912G.f39885c.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.addAll((Collection) ((Map.Entry) it.next()).getValue());
                }
                I i8 = I.f6474a;
                gppModel.k(str3, str4, arrayList);
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38660u, b(24, tcModel.f39934v));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38661v, b(24, tcModel.f39935w));
                int i9 = tcModel.f39928p;
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38662w, Integer.valueOf(i9));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38663x, b(i9, tcModel.f39936x));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38664y, b(i9, tcModel.f39937y));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38637A, AbstractC1246t.W0(tcModel.f39911F.getAcceptedItems()));
                gppModel.k(w1.h.f38943f, AbstractC3822c.f38639C, AbstractC1246t.W0(tcModel.f39910E.getAcceptedItems()));
                m8.e(N7.a.HDR_GPP_VERSION, String.valueOf(gppModel.e().g()));
                m8.e(N7.a.HDR_SECTION_LIST, gppModel.h().toString());
                N7.a aVar = N7.a.HDR_SECTION_ID;
                List h8 = gppModel.h();
                AbstractC3159y.h(h8, "gppModel.sectionIds");
                m8.e(aVar, AbstractC1246t.w0(h8, "_", null, null, 0, null, null, 62, null));
                String A8 = g6.n.A("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(w1.h.f38941d), false, 4, null);
                String b8 = gppModel.g(w1.h.f38943f).b();
                AbstractC3159y.h(b8, "gppModel.getSection(TcfEuV2.NAME).encode()");
                m8.g(A8, b8);
                ZonedDateTime zonedDateTime = tcModel.f39916d;
                if (zonedDateTime != null) {
                    gppModel.k(w1.h.f38943f, AbstractC3822c.f38641b, zonedDateTime);
                    gppModel.k(w1.h.f38943f, AbstractC3822c.f38642c, tcModel.f39916d);
                }
                O7.d dVar2 = O7.d.f7793a;
                AbstractC3159y.i(gppModel, "gppModel");
                O7.d.f7807o = gppModel;
                String gppString = gppModel.d();
                N7.a aVar2 = N7.a.HDR_GPP_STRING;
                AbstractC3159y.h(gppString, "gppString");
                m8.e(aVar2, gppString);
                return gppString;
            } catch (Exception unused) {
                ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
                if (callback != null) {
                    callback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
                    return "";
                }
                return "";
            }
        }

        public final List b(int i8, Vector vector) {
            boolean[] zArr = new boolean[i8];
            Iterator<T> it = vector.getAcceptedItems().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (1 <= intValue && intValue < i8 + 1) {
                    zArr[intValue - 1] = true;
                }
            }
            return AbstractC1239l.W0(zArr);
        }
    }
}
