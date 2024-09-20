package D5;

import H7.n;
import M5.AbstractC1246t;
import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import b.AbstractC1832c;
import c.C1895i;
import com.inmobi.cmp.core.model.Vector;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import n.AbstractC3448a;
import y5.p;
import y5.q;
import y5.r;
import y5.s;

/* loaded from: classes5.dex */
public final class f extends AbstractC3448a {

    /* renamed from: l, reason: collision with root package name */
    public static final a f1839l = new a();

    /* renamed from: m, reason: collision with root package name */
    public static String f1840m;

    /* renamed from: a, reason: collision with root package name */
    public ConstraintLayout f1841a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1842b;

    /* renamed from: c, reason: collision with root package name */
    public Button f1843c;

    /* renamed from: d, reason: collision with root package name */
    public Button f1844d;

    /* renamed from: e, reason: collision with root package name */
    public Button f1845e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1846f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f1847g;

    /* renamed from: h, reason: collision with root package name */
    public l f1848h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f1849i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f1850j;

    /* renamed from: k, reason: collision with root package name */
    public J7.c f1851k;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = f.class.getSimpleName();
        AbstractC3159y.h(simpleName, "PrivacyBottomSheet::class.java.simpleName");
        f1840m = simpleName;
    }

    public static final void l(final f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        l lVar = this$0.f1848h;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        s sVar = lVar.f1864a;
        sVar.f39938z.forEach(new r(sVar));
        sVar.f39908C.forEach(new p(sVar));
        Vector vector = sVar.f39907B;
        vector.unset(vector.getKeys());
        sVar.f39906A.unsetAllOwnedItems();
        sVar.f39929q.unsetAllOwnedItems();
        sVar.f39930r.unsetAllOwnedItems();
        sVar.f39931s.setAllOwnedItems();
        sVar.f39908C.forEach(new q(sVar));
        lVar.a();
        lVar.f1873j.b();
        H7.m.f3644a.b(n.REJECT_ALL, H7.f.GDPR).observe(this$0, new Observer() { // from class: D5.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                f.m(f.this, (String) obj);
            }
        });
    }

    public static final void m(f this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void o(f this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new s5.i(), s5.i.f37977F)) != null) {
            add.commit();
        }
    }

    public static final void p(f this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void q(final f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        l lVar = this$0.f1848h;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.f1864a.x();
        lVar.a();
        lVar.f1873j.a();
        H7.m.f3644a.b(n.ACCEPT_ALL, H7.f.GDPR).observe(this$0, new Observer() { // from class: D5.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                f.p(f.this, (String) obj);
            }
        });
    }

    @Override // n.AbstractC3448a
    public void i(ViewStub viewStub) {
        AbstractC3159y.i(viewStub, "viewStub");
        viewStub.setLayoutResource(I1.c.f3863n);
        View inflatedView = viewStub.inflate();
        AbstractC3159y.h(inflatedView, "inflatedView");
        this.f1841a = (ConstraintLayout) inflatedView.findViewById(I1.b.f3754N);
        this.f1842b = (ImageView) inflatedView.findViewById(I1.b.f3734D);
        this.f1843c = (Button) inflatedView.findViewById(I1.b.f3801h);
        this.f1844d = (Button) inflatedView.findViewById(I1.b.f3795f);
        this.f1845e = (Button) inflatedView.findViewById(I1.b.f3783b);
        this.f1846f = (TextView) inflatedView.findViewById(I1.b.f3769U0);
        this.f1847g = (TextView) inflatedView.findViewById(I1.b.f3830q1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.SpannableString k(java.lang.String r7, android.text.SpannableString r8, java.lang.String r9, android.text.style.ClickableSpan r10, boolean r11) {
        /*
            r6 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            java.lang.String r3 = "subString"
            kotlin.jvm.internal.AbstractC3159y.i(r9, r3)
            r3 = 0
            if (r7 != 0) goto Lc
            goto L25
        Lc:
            g6.j r4 = new g6.j
            g6.l r5 = g6.l.f31310c
            r4.<init>(r9, r5)
            f6.g r7 = g6.j.d(r4, r7, r2, r1, r3)
            java.util.Iterator r4 = r7.iterator()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L22
            goto L23
        L22:
            r7 = r3
        L23:
            if (r7 != 0) goto L27
        L25:
            r7 = r3
            goto L58
        L27:
            if (r11 == 0) goto L30
            java.lang.Object r7 = f6.AbstractC2683j.x(r7)
        L2d:
            g6.h r7 = (g6.h) r7
            goto L35
        L30:
            java.lang.Object r7 = f6.AbstractC2683j.r(r7)
            goto L2d
        L35:
            d6.i r7 = r7.b()
            int r11 = r7.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r7 = r7.g()
            int r9 = r9.length()
            int r9 = r9 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[r1]
            r9[r2] = r11
            r9[r0] = r7
            java.util.List r7 = M5.AbstractC1246t.p(r9)
        L58:
            if (r7 != 0) goto L5e
            java.util.List r7 = M5.AbstractC1246t.m()
        L5e:
            boolean r9 = r7.isEmpty()
            r9 = r9 ^ r0
            if (r9 == 0) goto Lb5
            java.lang.Object r9 = M5.AbstractC1246t.m0(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r11 = M5.AbstractC1246t.y0(r7)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0 = 33
            r8.setSpan(r10, r9, r11, r0)
            android.content.Context r9 = r6.getContext()
            if (r9 != 0) goto L85
            goto Lb5
        L85:
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            J7.c r11 = r6.f1851k
            if (r11 != 0) goto L8c
            goto L8e
        L8c:
            java.lang.Integer r3 = r11.f5541l
        L8e:
            if (r3 != 0) goto L97
            int r11 = I1.a.f3723b
            int r9 = androidx.core.content.ContextCompat.getColor(r9, r11)
            goto L9b
        L97:
            int r9 = r3.intValue()
        L9b:
            r10.<init>(r9)
            java.lang.Object r9 = M5.AbstractC1246t.m0(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r7 = M5.AbstractC1246t.y0(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8.setSpan(r10, r9, r7, r0)
        Lb5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.f.k(java.lang.String, android.text.SpannableString, java.lang.String, android.text.style.ClickableSpan, boolean):android.text.SpannableString");
    }

    public final void n() {
        int i8;
        Button button = this.f1845e;
        l lVar = null;
        if (button != null) {
            l lVar2 = this.f1848h;
            if (lVar2 == null) {
                AbstractC3159y.y("viewModel");
                lVar2 = null;
            }
            button.setText(lVar2.f1871h.f5605d);
            button.setOnClickListener(new View.OnClickListener() { // from class: D5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.q(f.this, view);
                }
            });
        }
        Button button2 = this.f1844d;
        if (button2 != null) {
            l lVar3 = this.f1848h;
            if (lVar3 == null) {
                AbstractC3159y.y("viewModel");
                lVar3 = null;
            }
            button2.setText(lVar3.f1871h.f5606e);
            l lVar4 = this.f1848h;
            if (lVar4 == null) {
                AbstractC3159y.y("viewModel");
                lVar4 = null;
            }
            if (lVar4.f1870g) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            button2.setVisibility(i8);
            button2.setOnClickListener(new View.OnClickListener() { // from class: D5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.l(f.this, view);
                }
            });
        }
        Button button3 = this.f1843c;
        if (button3 != null) {
            l lVar5 = this.f1848h;
            if (lVar5 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                lVar = lVar5;
            }
            button3.setText(I7.b.a(lVar.f1871h.f5604c));
            button3.setOnClickListener(new View.OnClickListener() { // from class: D5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.o(f.this, view);
                }
            });
        }
    }

    @Override // n.AbstractC3448a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "it.viewModelStore");
            this.f1848h = (l) new ViewModelProvider(viewModelStore, new m()).get(l.class);
        }
    }

    @Override // n.AbstractC3448a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        TextView textView;
        Map map;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        int i9 = 0;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        j(false);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        J7.b bVar = O7.d.f7797e;
        if (bVar != null) {
            this.f1849i = bVar.f5528a;
            this.f1850j = bVar.f5529b;
        }
        this.f1851k = O7.d.f7798f;
        TextView textView2 = this.f1847g;
        if (textView2 != null) {
            l lVar = this.f1848h;
            if (lVar == null) {
                AbstractC3159y.y("viewModel");
                lVar = null;
            }
            textView2.setText(lVar.f1871h.f5602a);
        }
        l lVar2 = this.f1848h;
        if (lVar2 == null) {
            AbstractC3159y.y("viewModel");
            lVar2 = null;
        }
        B6.e eVar = lVar2.f1864a.f39913a;
        if (eVar == null || (map = eVar.f1043i) == null) {
            i8 = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((B6.l) entry.getValue()).f1061k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            i8 = linkedHashMap.size();
        }
        List list = lVar2.f1865b.f2374c.f2369a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set b12 = AbstractC1246t.b1(((E6.d) obj).f2367f);
            List list2 = lVar2.f1865b.f2373b.f2338h;
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator it = b12.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1832c.a((Number) it.next(), list2)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        int size = lVar2.f1866c.f39870a.size() + arrayList.size() + i8;
        if (lVar2.f1867d != null) {
            i9 = 1;
        }
        String valueOf = String.valueOf(size + i9);
        l lVar3 = this.f1848h;
        if (lVar3 == null) {
            AbstractC3159y.y("viewModel");
            lVar3 = null;
        }
        String str = lVar3.f1871h.f5603b;
        if (C1895i.f14827b) {
            str = AbstractC3159y.q(str, lVar3.f1872i.f3203b.f3198c);
        }
        String y8 = g6.n.y(str, "${partners}", valueOf, true);
        SpannableString spannableString = new SpannableString(y8);
        l lVar4 = this.f1848h;
        if (lVar4 == null) {
            AbstractC3159y.y("viewModel");
            lVar4 = null;
        }
        k(y8, spannableString, lVar4.f1871h.f5607f, new i(this), false);
        l lVar5 = this.f1848h;
        if (lVar5 == null) {
            AbstractC3159y.y("viewModel");
            lVar5 = null;
        }
        k(y8, spannableString, lVar5.f1871h.f5609h, new j(this), true);
        TextView textView3 = this.f1846f;
        if (textView3 != null) {
            textView3.setText(spannableString);
        }
        TextView textView4 = this.f1846f;
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        n();
        J7.c cVar = this.f1851k;
        if (cVar != null) {
            Integer num = cVar.f5536g;
            if (num != null) {
                int intValue = num.intValue();
                ConstraintLayout constraintLayout = this.f1841a;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f5537h;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView5 = this.f1847g;
                if (textView5 != null) {
                    textView5.setTextColor(intValue2);
                }
            }
            Integer num3 = cVar.f5538i;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView6 = this.f1846f;
                if (textView6 != null) {
                    textView6.setTextColor(intValue3);
                }
            }
            Integer num4 = cVar.f5542m;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                Button button = this.f1845e;
                if (button != null) {
                    button.setTextColor(intValue4);
                }
                Button button2 = this.f1844d;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f5544o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button3 = this.f1845e;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue5);
                }
                Button button4 = this.f1844d;
                if (button4 != null) {
                    button4.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f5541l;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button5 = this.f1843c;
                if (button5 != null) {
                    button5.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f1849i;
        if (typeface != null) {
            TextView textView7 = this.f1847g;
            if (textView7 != null) {
                textView7.setTypeface(typeface);
            }
            Button button6 = this.f1845e;
            if (button6 != null) {
                button6.setTypeface(typeface);
            }
            Button button7 = this.f1844d;
            if (button7 != null) {
                button7.setTypeface(typeface);
            }
            Button button8 = this.f1843c;
            if (button8 != null) {
                button8.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f1850j;
        if (typeface2 != null && (textView = this.f1846f) != null) {
            textView.setTypeface(typeface2);
        }
        l lVar6 = this.f1848h;
        if (lVar6 == null) {
            AbstractC3159y.y("viewModel");
            lVar6 = null;
        }
        h result = new h(this);
        lVar6.getClass();
        AbstractC3159y.i(result, "result");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(lVar6), C2812b0.b(), null, new k(result, lVar6, null), 2, null);
    }
}
