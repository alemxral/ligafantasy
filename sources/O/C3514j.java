package o;

import Q7.i;
import R7.a;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import z5.C4027a;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3514j extends Q7.a implements a.b {

    /* renamed from: t, reason: collision with root package name */
    public static final a f36306t = new a();

    /* renamed from: u, reason: collision with root package name */
    public static final String f36307u = C3514j.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public ConstraintLayout f36308m;

    /* renamed from: n, reason: collision with root package name */
    public Button f36309n;

    /* renamed from: o, reason: collision with root package name */
    public Button f36310o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f36311p;

    /* renamed from: q, reason: collision with root package name */
    public C3517m f36312q;

    /* renamed from: r, reason: collision with root package name */
    public s5.k f36313r;

    /* renamed from: s, reason: collision with root package name */
    public R7.a f36314s;

    /* renamed from: o.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static final void k(PopupWindow mypopupWindow, C3514j this$0, View view) {
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3159y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f8361b;
        if (textView != null) {
            textView.setText(this$0.getString(I1.e.f3885j));
        }
        C3517m c3517m = this$0.f36312q;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        c3517m.e(B5.j.ALL_VENDORS);
        this$0.v();
    }

    public static final void m(C3514j this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void n(C3514j this$0, PopupWindow mypopupWindow, ImageView imageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, View view) {
        Integer num;
        Integer num2;
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        J7.c cVar = this$0.f8369j;
        if (cVar != null && (num2 = cVar.f5536g) != null) {
            cardView.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
        }
        J7.c cVar2 = this$0.f8369j;
        if (cVar2 != null && (num = cVar2.f5540k) != null) {
            int intValue = num.intValue();
            if (textView != null) {
                textView.setTextColor(ColorStateList.valueOf(intValue));
            }
            if (textView2 != null) {
                textView2.setTextColor(ColorStateList.valueOf(intValue));
            }
            if (textView3 != null) {
                textView3.setTextColor(ColorStateList.valueOf(intValue));
            }
        }
        mypopupWindow.showAsDropDown(imageView);
    }

    public static final void o(PopupWindow mypopupWindow, C3514j this$0, View view) {
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3159y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f8361b;
        if (textView != null) {
            textView.setText(this$0.getString(I1.e.f3886k));
        }
        C3517m c3517m = this$0.f36312q;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        c3517m.e(B5.j.IAB_VENDORS);
        this$0.v();
    }

    public static final void p(C3514j this$0, View view) {
        B6.f fVar;
        Map map;
        AbstractC3159y.i(this$0, "this$0");
        C3517m c3517m = this$0.f36312q;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        B6.e eVar = c3517m.f36318a.f39913a;
        if (eVar != null && (map = eVar.f1043i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!((B6.l) entry.getValue()).f1055e.isEmpty()) {
                    c3517m.f36318a.f39908C.unset(((B6.l) entry.getValue()).f1047a);
                }
            }
        }
        for (E6.d dVar : c3517m.f36320c.f2369a) {
            if (!dVar.f2368g.isEmpty()) {
                c3517m.f36318a.f39909D.unset(dVar.f2362a);
            }
        }
        Map i8 = c3517m.i();
        if (i8 != null) {
            Iterator it = i8.entrySet().iterator();
            while (it.hasNext()) {
                c3517m.f36318a.f39931s.unset(Integer.parseInt((String) ((Map.Entry) it.next()).getKey()));
            }
        }
        R7.d h8 = c3517m.h();
        if (h8 != null && (fVar = h8.f8899a) != null) {
            c3517m.f36318a.f39933u.unset(fVar.f1047a);
        }
        H7.m mVar = H7.m.f3644a;
        H7.n navigationTag = H7.n.OBJECT_ALL_LEGITIMATE;
        AbstractC3159y.i(navigationTag, "navigationTag");
        O7.d.f7793a.n().getClass();
        H7.m.f3646c.e(String.valueOf(navigationTag), "_legitimatePurposesConsents");
        this$0.u();
    }

    public static final void q(PopupWindow mypopupWindow, C3514j this$0, View view) {
        AbstractC3159y.i(mypopupWindow, "$mypopupWindow");
        AbstractC3159y.i(this$0, "this$0");
        mypopupWindow.dismiss();
        TextView textView = this$0.f8361b;
        if (textView != null) {
            textView.setText(this$0.getString(I1.e.f3887l));
        }
        C3517m c3517m = this$0.f36312q;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        c3517m.e(B5.j.NON_IAB_VENDORS);
        this$0.v();
    }

    public static final void r(C3514j this$0, View view) {
        B6.f fVar;
        Map map;
        AbstractC3159y.i(this$0, "this$0");
        C3517m c3517m = this$0.f36312q;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        B6.e eVar = c3517m.f36318a.f39913a;
        if (eVar != null && (map = eVar.f1043i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!((B6.l) entry.getValue()).f1055e.isEmpty()) {
                    c3517m.f36318a.f39908C.set(((B6.l) entry.getValue()).f1047a);
                }
            }
        }
        for (E6.d dVar : c3517m.f36320c.f2369a) {
            if (!dVar.f2368g.isEmpty()) {
                c3517m.f36318a.f39909D.set(dVar.f2362a);
            }
        }
        Map i8 = c3517m.i();
        if (i8 != null) {
            Iterator it = i8.entrySet().iterator();
            while (it.hasNext()) {
                c3517m.f36318a.f39931s.set(Integer.parseInt((String) ((Map.Entry) it.next()).getKey()));
            }
        }
        R7.d h8 = c3517m.h();
        if (h8 != null && (fVar = h8.f8899a) != null) {
            c3517m.f36318a.f39933u.set(fVar.f1047a);
        }
        H7.m mVar = H7.m.f3644a;
        H7.n navigationTag = H7.n.ACCEPT_ALL_LEGITIMATE;
        AbstractC3159y.i(navigationTag, "navigationTag");
        O7.d.f7793a.n().getClass();
        H7.m.f3646c.e(String.valueOf(navigationTag), "_legitimatePurposesConsents");
        this$0.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R7.a.b
    public void b(R7.d item) {
        String str;
        z5.f fVar;
        String str2;
        String str3;
        String str4;
        B6.c cVar;
        String str5;
        String num;
        AbstractC3159y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            B6.f fVar2 = item.f8899a;
            if (fVar2 instanceof B6.l) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                String str6 = z5.f.f40432I;
                if (supportFragmentManager.findFragmentByTag(str6) == null) {
                    B6.f fVar3 = item.f8899a;
                    if (fVar3 instanceof B6.l) {
                        String str7 = fVar3.f1048b;
                        String str8 = ((B6.l) fVar3).f1053c;
                        C3517m c3517m = this.f36312q;
                        if (c3517m == null) {
                            AbstractC3159y.y("viewModel");
                            c3517m = null;
                        }
                        String a8 = c3517m.a(((B6.l) item.f8899a).f1055e, B5.a.PURPOSE);
                        C3517m c3517m2 = this.f36312q;
                        if (c3517m2 == null) {
                            AbstractC3159y.y("viewModel");
                            c3517m2 = null;
                        }
                        String a9 = c3517m2.a(((B6.l) item.f8899a).f1057g, B5.a.SPECIAL_PURPOSE);
                        C3517m c3517m3 = this.f36312q;
                        if (c3517m3 == null) {
                            AbstractC3159y.y("viewModel");
                            c3517m3 = null;
                        }
                        String a10 = c3517m3.a(((B6.l) item.f8899a).f1058h, B5.a.FEATURE);
                        C3517m c3517m4 = this.f36312q;
                        if (c3517m4 == null) {
                            AbstractC3159y.y("viewModel");
                            c3517m4 = null;
                        }
                        String a11 = c3517m4.a(((B6.l) item.f8899a).f1059i, B5.a.SPECIAL_FEATURE);
                        C3517m c3517m5 = this.f36312q;
                        if (c3517m5 == null) {
                            AbstractC3159y.y("viewModel");
                            c3517m5 = null;
                        }
                        String a12 = c3517m5.a(((B6.l) item.f8899a).f1064n, B5.a.DATA_DECLARATION);
                        String str9 = ((B6.l) item.f8899a).f1060j;
                        C3517m c3517m6 = this.f36312q;
                        if (c3517m6 == null) {
                            AbstractC3159y.y("viewModel");
                            c3517m6 = null;
                        }
                        int i8 = ((B6.l) item.f8899a).f1062l;
                        c3517m6.getClass();
                        if (i8 < 0) {
                            str = str6;
                            str2 = "";
                        } else {
                            float f8 = i8 / 86400.0f;
                            str = str6;
                            if (f8 >= 1.0f) {
                                str2 = Z5.a.d(f8) + ' ' + c3517m6.f36321d.g().f5660i;
                            } else {
                                str2 = i8 + ' ' + c3517m6.f36321d.g().f5661j;
                            }
                        }
                        C3517m c3517m7 = this.f36312q;
                        if (c3517m7 == null) {
                            AbstractC3159y.y("viewModel");
                            c3517m7 = null;
                        }
                        Boolean bool = ((B6.l) item.f8899a).f1063m;
                        c3517m7.getClass();
                        if (AbstractC3159y.d(bool, Boolean.TRUE)) {
                            str4 = c3517m7.f36321d.g().f5664m;
                        } else if (!AbstractC3159y.d(bool, Boolean.FALSE)) {
                            str3 = "";
                            cVar = ((B6.l) item.f8899a).f1065o;
                            if (cVar == null || (num = Integer.valueOf(cVar.f1032a).toString()) == null) {
                                str5 = "";
                            } else {
                                str5 = num;
                            }
                            B6.f fVar4 = item.f8899a;
                            C4027a args = new C4027a(str7, str8, null, a8, a9, a10, a11, a12, str9, str2, str3, str5, fVar4.f1047a, item.f8902d, ((B6.l) fVar4).f1066p, "Error: cannot load vendor file", 4);
                            AbstractC3159y.i(args, "args");
                            fVar = new z5.f();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("partner_detail_args", args);
                            fVar.setArguments(bundle);
                        } else {
                            str4 = c3517m7.f36321d.g().f5665n;
                        }
                        str3 = str4;
                        cVar = ((B6.l) item.f8899a).f1065o;
                        if (cVar == null) {
                            str5 = num;
                            B6.f fVar42 = item.f8899a;
                            C4027a args2 = new C4027a(str7, str8, null, a8, a9, a10, a11, a12, str9, str2, str3, str5, fVar42.f1047a, item.f8902d, ((B6.l) fVar42).f1066p, "Error: cannot load vendor file", 4);
                            AbstractC3159y.i(args2, "args");
                            fVar = new z5.f();
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("partner_detail_args", args2);
                            fVar.setArguments(bundle2);
                        }
                        str5 = "";
                        B6.f fVar422 = item.f8899a;
                        C4027a args22 = new C4027a(str7, str8, null, a8, a9, a10, a11, a12, str9, str2, str3, str5, fVar422.f1047a, item.f8902d, ((B6.l) fVar422).f1066p, "Error: cannot load vendor file", 4);
                        AbstractC3159y.i(args22, "args");
                        fVar = new z5.f();
                        Bundle bundle22 = new Bundle();
                        bundle22.putParcelable("partner_detail_args", args22);
                        fVar.setArguments(bundle22);
                    } else {
                        str = str6;
                        fVar = null;
                    }
                    if (fVar != null) {
                        activity.getSupportFragmentManager().beginTransaction().add(fVar, str).commit();
                        return;
                    }
                    return;
                }
                return;
            }
            if (fVar2 instanceof B6.g) {
                FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
                i.a aVar = Q7.i.f8397y;
                String str10 = Q7.i.f8398z;
                if (supportFragmentManager2.findFragmentByTag(str10) == null) {
                    FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                    B6.f fVar5 = item.f8899a;
                    String str11 = fVar5.f1048b;
                    String a13 = ((B6.g) fVar5).a();
                    String b8 = ((B6.g) item.f8899a).b();
                    s5.k kVar = this.f36313r;
                    if (kVar == null) {
                        AbstractC3159y.y("optionsViewModel");
                        kVar = null;
                    }
                    String str12 = kVar.f38003f.f().f5644i;
                    s5.k kVar2 = this.f36313r;
                    if (kVar2 == null) {
                        AbstractC3159y.y("optionsViewModel");
                        kVar2 = null;
                    }
                    String str13 = kVar2.f38003f.f().f5649n;
                    int i9 = item.f8899a.f1047a;
                    R7.e eVar = item.f8902d;
                    C3517m c3517m8 = this.f36312q;
                    if (c3517m8 == null) {
                        AbstractC3159y.y("viewModel");
                        c3517m8 = null;
                    }
                    beginTransaction.add(aVar.b(str11, a13, b8, str12, str13, i9, eVar, true, c3517m8.f36327j), str10).commit();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01de  */
    @Override // R7.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(R7.d r9) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3514j.d(R7.d):void");
    }

    public final void l(Set set) {
        boolean z8;
        Button button = this.f36310o;
        boolean z9 = false;
        if (button != null) {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z8 = true;
                        break;
                    }
                }
            }
            z8 = false;
            button.setEnabled(z8);
        }
        Button button2 = this.f36309n;
        if (button2 != null) {
            if (!set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((Boolean) it2.next()).booleanValue()) {
                        z9 = true;
                        break;
                    }
                }
            }
            button2.setEnabled(z9);
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f36312q = (C3517m) new ViewModelProvider(viewModelStore, new C3518n()).get(C3517m.class);
            ViewModelStore viewModelStore2 = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore2, "it.viewModelStore");
            this.f36313r = (s5.k) new ViewModelProvider(viewModelStore2, new s5.l()).get(s5.k.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3852c, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…terest, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        boolean hasFocus;
        super.onPause();
        C3517m c3517m = this.f36312q;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        SearchView searchView = this.f8364e;
        if (searchView == null) {
            hasFocus = false;
        } else {
            hasFocus = searchView.hasFocus();
        }
        c3517m.f36328k = hasFocus;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        SearchView searchView;
        Integer num5;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f36308m = (ConstraintLayout) view.findViewById(I1.b.f3738F);
        this.f36309n = (Button) view.findViewById(I1.b.f3810k);
        this.f36310o = (Button) view.findViewById(I1.b.f3804i);
        this.f36311p = (RecyclerView) view.findViewById(I1.b.f3781a0);
        C3517m c3517m = this.f36312q;
        C3517m c3517m2 = null;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        c3517m.getClass();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(c3517m), C2812b0.b(), null, new C3516l(c3517m, null), 2, null);
        TextView textView = this.f8361b;
        if (textView != null) {
            C3517m c3517m3 = this.f36312q;
            if (c3517m3 == null) {
                AbstractC3159y.y("viewModel");
                c3517m3 = null;
            }
            textView.setText(c3517m3.f36321d.e().f5610a);
        }
        ImageView imageView = this.f8362c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3514j.m(C3514j.this, view2);
                }
            });
            C3517m c3517m4 = this.f36312q;
            if (c3517m4 == null) {
                AbstractC3159y.y("viewModel");
                c3517m4 = null;
            }
            imageView.setContentDescription(c3517m4.f36321d.e().f5620k);
        }
        x();
        SearchView searchView2 = this.f8364e;
        if (searchView2 != null) {
            searchView2.setVisibility(0);
        }
        SearchView searchView3 = this.f8364e;
        if (searchView3 != null) {
            C3517m c3517m5 = this.f36312q;
            if (c3517m5 == null) {
                AbstractC3159y.y("viewModel");
                c3517m5 = null;
            }
            searchView3.setQueryHint(c3517m5.f36321d.e().f5615f);
        }
        SearchView searchView4 = this.f8364e;
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(new C3515k(this));
        }
        C3517m c3517m6 = this.f36312q;
        if (c3517m6 == null) {
            AbstractC3159y.y("viewModel");
            c3517m6 = null;
        }
        List c8 = C3517m.c(c3517m6, null, 1);
        C3517m c3517m7 = this.f36312q;
        if (c3517m7 == null) {
            AbstractC3159y.y("viewModel");
            c3517m7 = null;
        }
        String str = c3517m7.f36321d.e().f5611b;
        C3517m c3517m8 = this.f36312q;
        if (c3517m8 == null) {
            AbstractC3159y.y("viewModel");
            c3517m8 = null;
        }
        String str2 = c3517m8.f36321d.e().f5612c;
        J7.c cVar = this.f8369j;
        if (cVar == null) {
            num = null;
        } else {
            num = cVar.f5538i;
        }
        if (cVar == null) {
            num2 = null;
        } else {
            num2 = cVar.f5534e;
        }
        if (cVar == null) {
            num3 = null;
        } else {
            num3 = cVar.f5535f;
        }
        if (cVar == null) {
            num4 = null;
        } else {
            num4 = cVar.f5530a;
        }
        this.f36314s = new R7.a(c8, this, str, str2, num, num2, num3, num4, this.f8370k, this.f8371l);
        RecyclerView recyclerView = this.f36311p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            R7.a aVar = this.f36314s;
            if (aVar == null) {
                AbstractC3159y.y("switchAdapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
        }
        w();
        J7.c cVar2 = this.f8369j;
        if (cVar2 != null && (num5 = cVar2.f5536g) != null) {
            int intValue = num5.intValue();
            ConstraintLayout constraintLayout = this.f36308m;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(intValue);
            }
        }
        Button button = this.f36310o;
        if (button != null) {
            ColorStateList t8 = t();
            if (t8 != null) {
                button.setTextColor(t8);
            }
            ColorStateList s8 = s();
            if (s8 != null) {
                button.setBackgroundTintList(s8);
            }
        }
        Button button2 = this.f36309n;
        if (button2 != null) {
            ColorStateList t9 = t();
            if (t9 != null) {
                button2.setTextColor(t9);
            }
            ColorStateList s9 = s();
            if (s9 != null) {
                button2.setBackgroundTintList(s9);
            }
        }
        Typeface typeface = this.f8371l;
        if (typeface != null) {
            Button button3 = this.f36310o;
            if (button3 != null) {
                button3.setTypeface(typeface);
            }
            Button button4 = this.f36309n;
            if (button4 != null) {
                button4.setTypeface(typeface);
            }
        }
        C3517m c3517m9 = this.f36312q;
        if (c3517m9 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            c3517m2 = c3517m9;
        }
        if (c3517m2.f36328k && (searchView = this.f8364e) != null) {
            searchView.requestFocus();
        }
    }

    public final ColorStateList s() {
        Integer num;
        J7.c cVar = this.f8369j;
        if (cVar == null || (num = cVar.f5544o) == null || cVar.f5545p == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f5545p.intValue()});
    }

    public final ColorStateList t() {
        Integer num;
        J7.c cVar = this.f8369j;
        if (cVar == null || (num = cVar.f5542m) == null || cVar.f5543n == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f5543n.intValue()});
    }

    public final void u() {
        R7.a aVar = this.f36314s;
        C3517m c3517m = null;
        if (aVar == null) {
            AbstractC3159y.y("switchAdapter");
            aVar = null;
        }
        C3517m c3517m2 = this.f36312q;
        if (c3517m2 == null) {
            AbstractC3159y.y("viewModel");
            c3517m2 = null;
        }
        aVar.b(C3517m.c(c3517m2, null, 1), false);
        SearchView searchView = this.f8364e;
        if (searchView != null) {
            searchView.setQuery("", false);
        }
        C3517m c3517m3 = this.f36312q;
        if (c3517m3 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            c3517m = c3517m3;
        }
        l(c3517m.d());
    }

    public final void v() {
        CharSequence query;
        boolean z8;
        SearchView searchView = this.f8364e;
        if (searchView != null && (query = searchView.getQuery()) != null) {
            R7.a aVar = this.f36314s;
            C3517m c3517m = null;
            if (aVar == null) {
                AbstractC3159y.y("switchAdapter");
                aVar = null;
            }
            C3517m c3517m2 = this.f36312q;
            if (c3517m2 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                c3517m = c3517m2;
            }
            List b8 = c3517m.b(query.toString());
            if (query.length() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            aVar.b(b8, z8);
        }
    }

    public final void w() {
        Button button = this.f36310o;
        C3517m c3517m = null;
        if (button != null) {
            C3517m c3517m2 = this.f36312q;
            if (c3517m2 == null) {
                AbstractC3159y.y("viewModel");
                c3517m2 = null;
            }
            button.setText(c3517m2.f36321d.e().f5614e);
        }
        C3517m c3517m3 = this.f36312q;
        if (c3517m3 == null) {
            AbstractC3159y.y("viewModel");
            c3517m3 = null;
        }
        l(c3517m3.d());
        Button button2 = this.f36310o;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: o.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3514j.p(C3514j.this, view);
                }
            });
        }
        Button button3 = this.f36309n;
        if (button3 != null) {
            C3517m c3517m4 = this.f36312q;
            if (c3517m4 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                c3517m = c3517m4;
            }
            button3.setText(c3517m.f36321d.e().f5613d);
        }
        Button button4 = this.f36309n;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: o.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3514j.r(C3514j.this, view);
                }
            });
        }
    }

    public final void x() {
        ImageView imageView;
        C3517m c3517m = this.f36312q;
        if (c3517m == null) {
            AbstractC3159y.y("viewModel");
            c3517m = null;
        }
        if (!c3517m.f36320c.f2369a.isEmpty()) {
            Toolbar toolbar = this.f8360a;
            if (toolbar == null) {
                imageView = null;
            } else {
                imageView = (ImageView) toolbar.findViewById(I1.b.f3817m0);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View inflate = LayoutInflater.from(getContext()).inflate(I1.c.f3870u, (ViewGroup) null);
            final CardView cardView = (CardView) inflate.findViewById(I1.b.f3836t);
            final TextView textView = (TextView) inflate.findViewById(I1.b.f3761Q0);
            final TextView textView2 = (TextView) inflate.findViewById(I1.b.f3765S0);
            final TextView textView3 = (TextView) inflate.findViewById(I1.b.f3767T0);
            final PopupWindow popupWindow = new PopupWindow(inflate, 600, -2, true);
            popupWindow.setElevation(10.0f);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3514j.k(popupWindow, this, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3514j.o(popupWindow, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3514j.q(popupWindow, this, view);
                }
            });
            if (imageView != null) {
                final ImageView imageView2 = imageView;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: o.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3514j.n(C3514j.this, popupWindow, imageView2, cardView, textView, textView2, textView3, view);
                    }
                });
            }
        }
    }
}
