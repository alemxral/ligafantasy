package Q7;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class i extends Q7.a {

    /* renamed from: A */
    public static int f8395A;

    /* renamed from: B */
    public static R7.e f8396B;

    /* renamed from: y */
    public static final a f8397y = new a();

    /* renamed from: z */
    public static final String f8398z;

    /* renamed from: m */
    public ConstraintLayout f8399m;

    /* renamed from: n */
    public TextView f8400n;

    /* renamed from: o */
    public TextView f8401o;

    /* renamed from: p */
    public TextView f8402p;

    /* renamed from: q */
    public TextView f8403q;

    /* renamed from: r */
    public TextView f8404r;

    /* renamed from: s */
    public NestedScrollView f8405s;

    /* renamed from: t */
    public RecyclerView f8406t;

    /* renamed from: u */
    public s5.k f8407u;

    /* renamed from: v */
    public boolean f8408v;

    /* renamed from: w */
    public boolean f8409w;

    /* renamed from: x */
    public String f8410x;

    /* loaded from: classes5.dex */
    public static final class a {
        public final i b(String title, String description, String legalDescription, String legalDescriptionLabel, String closeLabel, int i8, R7.e switchItemType, boolean z8, B5.j vendorTypeSelected) {
            AbstractC3159y.i(title, "title");
            AbstractC3159y.i(description, "description");
            AbstractC3159y.i(legalDescription, "legalDescription");
            AbstractC3159y.i(legalDescriptionLabel, "legalDescriptionLabel");
            AbstractC3159y.i(closeLabel, "closeLabel");
            AbstractC3159y.i(switchItemType, "switchItemType");
            AbstractC3159y.i(vendorTypeSelected, "vendorTypeSelected");
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putString(CampaignEx.JSON_KEY_TITLE, title);
            bundle.putString("description", description);
            bundle.putString("legal_description", legalDescription);
            bundle.putString("legal_description_label", legalDescriptionLabel);
            bundle.putString("close_button_label", closeLabel);
            bundle.putBoolean("legitimate_interest", z8);
            bundle.putString("vendor_type_selected", vendorTypeSelected.name());
            i.f8395A = i8;
            i.f8396B = switchItemType;
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends Dialog {

        /* renamed from: a */
        public final /* synthetic */ i f8411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, i iVar, int i8) {
            super(context, i8);
            this.f8411a = iVar;
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            i iVar = this.f8411a;
            a aVar = i.f8397y;
            iVar.n();
        }
    }

    static {
        String simpleName = i.class.getSimpleName();
        AbstractC3159y.h(simpleName, "LegalDetailFragment::class.java.simpleName");
        f8398z = simpleName;
    }

    public static final void k(i this$0, View view) {
        B6.e eVar;
        Map map;
        B6.l lVar;
        R7.d a8;
        Map map2;
        R7.d a9;
        Map map3;
        R7.d a10;
        Map map4;
        AbstractC3159y.i(this$0, "this$0");
        NestedScrollView nestedScrollView = this$0.f8405s;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        RecyclerView recyclerView = this$0.f8406t;
        if (recyclerView != null) {
            s5.k kVar = this$0.f8407u;
            if (kVar == null) {
                AbstractC3159y.y("viewModel");
                kVar = null;
            }
            int i8 = f8395A;
            R7.e itemType = f8396B;
            if (itemType == null) {
                AbstractC3159y.y("localSwitchItemType");
                itemType = null;
            }
            boolean z8 = this$0.f8409w;
            String vendorTypeSelected = this$0.f8410x;
            if (vendorTypeSelected == null) {
                vendorTypeSelected = "";
            }
            kVar.getClass();
            AbstractC3159y.i(itemType, "itemType");
            AbstractC3159y.i(vendorTypeSelected, "vendorTypeSelected");
            ArrayList arrayList = new ArrayList();
            int ordinal = itemType.ordinal();
            if (ordinal == 4) {
                ArrayList arrayList2 = new ArrayList();
                if ((AbstractC3159y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3159y.d(vendorTypeSelected, "IAB_VENDORS")) && (eVar = kVar.f37998a.f39913a) != null && (map = eVar.f1043i) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((B6.l) entry.getValue()).f1061k == null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        B6.l lVar2 = (B6.l) ((Map.Entry) it.next()).getValue();
                        if (z8) {
                            Iterator it2 = lVar2.f1055e.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i8) {
                                    arrayList2.add(new R7.d(lVar2, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar2.f1048b, null, 82));
                                }
                            }
                        } else {
                            Iterator it3 = lVar2.f1054d.iterator();
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() == i8) {
                                    arrayList2.add(new R7.d(lVar2, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar2.f1048b, null, 82));
                                }
                            }
                        }
                    }
                }
                if (AbstractC3159y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3159y.d(vendorTypeSelected, "NON_IAB_VENDORS")) {
                    for (E6.d dVar : kVar.f37999b.f2374c.f2369a) {
                        if (z8) {
                            Iterator it4 = dVar.f2368g.iterator();
                            while (it4.hasNext()) {
                                if (((Number) it4.next()).intValue() == i8) {
                                    arrayList2.add(new R7.d(dVar.a(), null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, dVar.f2364c, null, 82));
                                }
                            }
                        } else {
                            Iterator it5 = dVar.f2367f.iterator();
                            while (it5.hasNext()) {
                                if (((Number) it5.next()).intValue() == i8) {
                                    arrayList2.add(new R7.d(dVar.a(), null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, dVar.f2364c, null, 82));
                                }
                            }
                        }
                    }
                    if (AbstractC3159y.d(vendorTypeSelected, "ALL_VENDORS") && (lVar = kVar.f38001d) != null) {
                        if (z8) {
                            Iterator it6 = lVar.f1055e.iterator();
                            while (it6.hasNext()) {
                                if (((Number) it6.next()).intValue() == i8) {
                                    arrayList2.add(new R7.d(lVar, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar.f1048b, null, 82));
                                }
                            }
                        } else {
                            Iterator it7 = lVar.f1054d.iterator();
                            while (it7.hasNext()) {
                                if (((Number) it7.next()).intValue() == i8) {
                                    arrayList2.add(new R7.d(lVar, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar.f1048b, null, 82));
                                }
                            }
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            } else if (ordinal != 5) {
                if (ordinal != 6) {
                    if (ordinal == 7 && (AbstractC3159y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3159y.d(vendorTypeSelected, "IAB_VENDORS"))) {
                        B6.e eVar2 = kVar.f37998a.f39913a;
                        if (eVar2 != null && (map4 = eVar2.f1043i) != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : map4.entrySet()) {
                                if (((B6.l) entry2.getValue()).f1061k == null) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Iterator it8 = linkedHashMap2.entrySet().iterator();
                            while (it8.hasNext()) {
                                B6.l lVar3 = (B6.l) ((Map.Entry) it8.next()).getValue();
                                Iterator it9 = lVar3.f1059i.iterator();
                                while (it9.hasNext()) {
                                    if (((Number) it9.next()).intValue() == i8) {
                                        arrayList.add(new R7.d(lVar3, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar3.f1048b, null, 82));
                                    }
                                }
                            }
                        }
                        B6.l lVar4 = kVar.f38001d;
                        if (lVar4 != null && (a10 = kVar.a(vendorTypeSelected, lVar4.f1059i, i8)) != null) {
                            arrayList.add(a10);
                        }
                    }
                } else if (AbstractC3159y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3159y.d(vendorTypeSelected, "IAB_VENDORS")) {
                    B6.e eVar3 = kVar.f37998a.f39913a;
                    if (eVar3 != null && (map3 = eVar3.f1043i) != null) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (((B6.l) entry3.getValue()).f1061k == null) {
                                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        Iterator it10 = linkedHashMap3.entrySet().iterator();
                        while (it10.hasNext()) {
                            B6.l lVar5 = (B6.l) ((Map.Entry) it10.next()).getValue();
                            Iterator it11 = lVar5.f1058h.iterator();
                            while (it11.hasNext()) {
                                if (((Number) it11.next()).intValue() == i8) {
                                    arrayList.add(new R7.d(lVar5, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar5.f1048b, null, 82));
                                }
                            }
                        }
                    }
                    B6.l lVar6 = kVar.f38001d;
                    if (lVar6 != null && (a9 = kVar.a(vendorTypeSelected, lVar6.f1058h, i8)) != null) {
                        arrayList.add(a9);
                    }
                }
            } else if (AbstractC3159y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3159y.d(vendorTypeSelected, "IAB_VENDORS")) {
                B6.e eVar4 = kVar.f37998a.f39913a;
                if (eVar4 != null && (map2 = eVar4.f1043i) != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry4 : map2.entrySet()) {
                        if (((B6.l) entry4.getValue()).f1061k == null) {
                            linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it12 = linkedHashMap4.entrySet().iterator();
                    while (it12.hasNext()) {
                        B6.l lVar7 = (B6.l) ((Map.Entry) it12.next()).getValue();
                        Iterator it13 = lVar7.f1057g.iterator();
                        while (it13.hasNext()) {
                            if (((Number) it13.next()).intValue() == i8) {
                                arrayList.add(new R7.d(lVar7, null, R7.f.NON_SWITCH, R7.e.PURPOSE_PARTNER, false, lVar7.f1048b, null, 82));
                            }
                        }
                    }
                }
                B6.l lVar8 = kVar.f38001d;
                if (lVar8 != null && (a8 = kVar.a(vendorTypeSelected, lVar8.f1057g, i8)) != null) {
                    arrayList.add(a8);
                }
            }
            j jVar = new j();
            J7.c cVar = this$0.f8369j;
            recyclerView.setAdapter(new R7.a(arrayList, jVar, null, null, cVar == null ? null : cVar.f5538i, null, null, cVar == null ? null : cVar.f5530a, null, this$0.f8371l, 364));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setVisibility(0);
        }
        this$0.f8408v = true;
    }

    public static final void m(i this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.n();
    }

    public final void l(View view) {
        this.f8399m = (ConstraintLayout) view.findViewById(I1.b.f3742H);
        this.f8400n = (TextView) view.findViewById(I1.b.f3842w);
        this.f8401o = (TextView) view.findViewById(I1.b.f3840v);
        this.f8402p = (TextView) view.findViewById(I1.b.f3838u);
        this.f8403q = (TextView) view.findViewById(I1.b.f3844x);
        this.f8404r = (TextView) view.findViewById(I1.b.f3797f1);
        this.f8405s = (NestedScrollView) view.findViewById(I1.b.f3784b0);
        this.f8406t = (RecyclerView) view.findViewById(I1.b.f3768U);
        s5.k kVar = this.f8407u;
        if (kVar == null) {
            AbstractC3159y.y("viewModel");
            kVar = null;
        }
        String str = kVar.f38003f.f().f5651p;
        if (str.length() > 0) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new UnderlineSpan(), 0, str.length(), 0);
            TextView textView = this.f8404r;
            if (textView != null) {
                textView.setText(spannableString);
            }
        }
        TextView textView2 = this.f8404r;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: Q7.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.k(i.this, view2);
                }
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView3 = this.f8403q;
            if (textView3 != null) {
                textView3.setText(arguments.getString(CampaignEx.JSON_KEY_TITLE, ""));
            }
            TextView textView4 = this.f8402p;
            if (textView4 != null) {
                textView4.setText(arguments.getString("description", ""));
            }
            TextView textView5 = this.f8401o;
            if (textView5 != null) {
                textView5.setText(arguments.getString("legal_description", ""));
            }
            TextView textView6 = this.f8400n;
            if (textView6 != null) {
                textView6.setText(arguments.getString("legal_description_label", ""));
            }
            this.f8409w = arguments.getBoolean("legitimate_interest", false);
            this.f8410x = arguments.getString("vendor_type_selected", "");
        }
    }

    public final void n() {
        if (this.f8408v) {
            NestedScrollView nestedScrollView = this.f8405s;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
            RecyclerView recyclerView = this.f8406t;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.f8408v = false;
            return;
        }
        H7.m mVar = H7.m.f3644a;
        StringBuilder sb = new StringBuilder();
        R7.e eVar = f8396B;
        if (eVar == null) {
            AbstractC3159y.y("localSwitchItemType");
            eVar = null;
        }
        int ordinal = eVar.ordinal();
        int i8 = 6;
        if (ordinal != 5) {
            if (ordinal != 6) {
                i8 = 7;
                if (ordinal != 7) {
                    i8 = 3;
                }
            } else {
                i8 = 1;
            }
        }
        sb.append(H7.b.a(i8));
        sb.append("-id:");
        sb.append(f8395A);
        mVar.f("collapseElement", sb.toString());
        dismiss();
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "it.viewModelStore");
            this.f8407u = (s5.k) new ViewModelProvider(viewModelStore, new s5.l()).get(s5.k.class);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        b bVar;
        Context context = getContext();
        if (context == null) {
            bVar = null;
        } else {
            bVar = new b(context, this, I1.f.f3892a);
        }
        if (bVar == null) {
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            AbstractC3159y.h(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        return inflater.inflate(I1.c.f3853d, viewGroup, false);
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        String str;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView2 = this.f8361b;
        s5.k kVar = null;
        if (textView2 != null) {
            R7.e eVar = f8396B;
            if (eVar == null) {
                AbstractC3159y.y("localSwitchItemType");
                eVar = null;
            }
            int ordinal = eVar.ordinal();
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        s5.k kVar2 = this.f8407u;
                        if (kVar2 == null) {
                            AbstractC3159y.y("viewModel");
                            kVar2 = null;
                        }
                        str = kVar2.f38003f.f().f5639d;
                    } else {
                        s5.k kVar3 = this.f8407u;
                        if (kVar3 == null) {
                            AbstractC3159y.y("viewModel");
                            kVar3 = null;
                        }
                        str = kVar3.f38003f.f().f5641f;
                    }
                } else {
                    s5.k kVar4 = this.f8407u;
                    if (kVar4 == null) {
                        AbstractC3159y.y("viewModel");
                        kVar4 = null;
                    }
                    str = kVar4.f38003f.f().f5641f;
                }
            } else {
                s5.k kVar5 = this.f8407u;
                if (kVar5 == null) {
                    AbstractC3159y.y("viewModel");
                    kVar5 = null;
                }
                str = kVar5.f38003f.f().f5639d;
            }
            textView2.setText(str);
        }
        ImageView imageView = this.f8362c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: Q7.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.m(i.this, view2);
                }
            });
            s5.k kVar6 = this.f8407u;
            if (kVar6 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                kVar = kVar6;
            }
            imageView.setContentDescription(kVar.f38003f.f().f5650o);
        }
        l(view);
        J7.c cVar = this.f8369j;
        if (cVar != null) {
            Integer num = cVar.f5538i;
            if (num != null) {
                int intValue = num.intValue();
                TextView textView3 = this.f8403q;
                if (textView3 != null) {
                    textView3.setTextColor(intValue);
                }
                TextView textView4 = this.f8402p;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                }
                TextView textView5 = this.f8401o;
                if (textView5 != null) {
                    textView5.setTextColor(intValue);
                }
                TextView textView6 = this.f8400n;
                if (textView6 != null) {
                    textView6.setTextColor(intValue);
                }
            }
            Integer num2 = cVar.f5541l;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView7 = this.f8404r;
                if (textView7 != null) {
                    textView7.setTextColor(intValue2);
                }
            }
            Integer num3 = cVar.f5536g;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                ConstraintLayout constraintLayout = this.f8399m;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue3);
                }
            }
        }
        Typeface typeface = this.f8370k;
        if (typeface != null && (textView = this.f8403q) != null) {
            textView.setTypeface(typeface);
        }
        Typeface typeface2 = this.f8371l;
        if (typeface2 != null) {
            TextView textView8 = this.f8404r;
            if (textView8 != null) {
                textView8.setTypeface(typeface2);
            }
            TextView textView9 = this.f8402p;
            if (textView9 != null) {
                textView9.setTypeface(typeface2);
            }
            TextView textView10 = this.f8401o;
            if (textView10 != null) {
                textView10.setTypeface(typeface2);
            }
            TextView textView11 = this.f8400n;
            if (textView11 != null) {
                textView11.setTypeface(typeface2);
            }
        }
    }
}
