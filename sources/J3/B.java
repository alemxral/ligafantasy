package J3;

import b3.EnumC1870e;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3159y;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y4.AbstractC3993a;

/* loaded from: classes4.dex */
public abstract class B {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4758a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4759b;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f24519i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f24523m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f24509O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4758a = iArr;
            int[] iArr2 = new int[EnumC1870e.values().length];
            try {
                iArr2[EnumC1870e.f14425o.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC1870e.f14427q.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC1870e.f14428r.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC1870e.f14429s.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1870e.f14430t.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC1870e.f14426p.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC1870e.f14431u.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC1870e.f14432v.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC1870e.f14433w.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f4759b = iArr2;
        }
    }

    public static final InterfaceC3983b a(String str) {
        if (str == null) {
            return null;
        }
        return AbstractC3984c.f(q3.w.f37426U, new Object[]{str}, null, 4, null);
    }

    public static final int b(EnumC1870e enumC1870e) {
        AbstractC3159y.i(enumC1870e, "<this>");
        switch (a.f4759b[enumC1870e.ordinal()]) {
            case 1:
                return q3.t.f37391q;
            case 2:
                return q3.t.f37383i;
            case 3:
                return q3.t.f37386l;
            case 4:
                return q3.t.f37387m;
            case 5:
                return q3.t.f37385k;
            case 6:
                return q3.t.f37388n;
            case 7:
                return q3.t.f37389o;
            case 8:
                return q3.t.f37384j;
            case 9:
                return q3.t.f37390p;
            default:
                throw new L5.p();
        }
    }

    public static final int c(EnumC1870e enumC1870e) {
        AbstractC3159y.i(enumC1870e, "<this>");
        switch (a.f4759b[enumC1870e.ordinal()]) {
            case 1:
                return AbstractC3993a.f39838t;
            case 2:
                return AbstractC3993a.f39820b;
            case 3:
                return AbstractC3993a.f39828j;
            case 4:
                return AbstractC3993a.f39831m;
            case 5:
                return AbstractC3993a.f39826h;
            case 6:
                return AbstractC3993a.f39833o;
            case 7:
                return AbstractC3993a.f39835q;
            case 8:
                return AbstractC3993a.f39822d;
            case 9:
                return q3.t.f37390p;
            default:
                throw new L5.p();
        }
    }

    public static final InterfaceC3983b d(com.stripe.android.model.o oVar) {
        int i8;
        String str;
        String str2;
        AbstractC3159y.i(oVar, "<this>");
        o.p pVar = oVar.f24399e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f4758a[pVar.ordinal()];
        }
        String str3 = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return null;
                }
                int i9 = q3.w.f37426U;
                o.r rVar = oVar.f24412r;
                if (rVar != null) {
                    str2 = rVar.f24547e;
                } else {
                    str2 = null;
                }
                return AbstractC3984c.f(i9, new Object[]{str2}, null, 4, null);
            }
            int i10 = q3.w.f37426U;
            o.n nVar = oVar.f24406l;
            if (nVar != null) {
                str = nVar.f24493e;
            } else {
                str = null;
            }
            return AbstractC3984c.f(i10, new Object[]{str}, null, 4, null);
        }
        o.g gVar = oVar.f24402h;
        if (gVar != null) {
            str3 = gVar.f24469h;
        }
        return a(str3);
    }

    public static final Integer e(com.stripe.android.model.o oVar) {
        int i8;
        AbstractC3159y.i(oVar, "<this>");
        o.p pVar = oVar.f24399e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f4758a[pVar.ordinal()];
        }
        if (i8 == 3) {
            return Integer.valueOf(q3.t.f37382h);
        }
        return null;
    }

    public static final int f(com.stripe.android.model.o oVar, boolean z8) {
        int i8;
        String str;
        int b8;
        o.r rVar;
        String str2;
        AbstractC3159y.i(oVar, "<this>");
        o.p pVar = oVar.f24399e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f4758a[pVar.ordinal()];
        }
        Integer num = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3 && (rVar = oVar.f24412r) != null && (str2 = rVar.f24545c) != null) {
                    num = Integer.valueOf(B3.b.f741a.a(str2));
                }
            } else {
                num = Integer.valueOf(q3.t.f37398x);
            }
        } else {
            EnumC1870e.a aVar = EnumC1870e.f14423m;
            o.g gVar = oVar.f24402h;
            if (gVar != null) {
                str = gVar.f24473l;
            } else {
                str = null;
            }
            EnumC1870e b9 = aVar.b(str);
            if (b9 == EnumC1870e.f14433w) {
                b9 = null;
            }
            if (b9 == null) {
                o.g gVar2 = oVar.f24402h;
                if (gVar2 != null) {
                    b9 = gVar2.f24462a;
                } else {
                    b9 = null;
                }
            }
            if (z8) {
                if (b9 != null) {
                    b8 = c(b9);
                    num = Integer.valueOf(b8);
                }
            } else if (b9 != null) {
                b8 = b(b9);
                num = Integer.valueOf(b8);
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return q3.t.f37390p;
    }

    public static /* synthetic */ int g(com.stripe.android.model.o oVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return f(oVar, z8);
    }
}
