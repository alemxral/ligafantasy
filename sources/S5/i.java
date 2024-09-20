package s5;

import H7.n;
import J7.p;
import M5.AbstractC1246t;
import Q7.i;
import Q7.m;
import R7.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.AbstractC1832c;
import c.C1890d;
import c.C1891e;
import c.C1893g;
import c.C1895i;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import o.AbstractC3505a;
import o.AbstractC3506b;
import o.C3514j;

/* loaded from: classes5.dex */
public final class i extends Q7.a implements a.b, m.a {

    /* renamed from: E, reason: collision with root package name */
    public static final a f37976E = new a();

    /* renamed from: F, reason: collision with root package name */
    public static final String f37977F = i.class.getName();

    /* renamed from: A, reason: collision with root package name */
    public TextView f37978A;

    /* renamed from: B, reason: collision with root package name */
    public FrameLayout f37979B;

    /* renamed from: C, reason: collision with root package name */
    public k f37980C;

    /* renamed from: D, reason: collision with root package name */
    public m f37981D;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f37982m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f37983n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f37984o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f37985p;

    /* renamed from: q, reason: collision with root package name */
    public ConstraintLayout f37986q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f37987r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f37988s;

    /* renamed from: t, reason: collision with root package name */
    public Button f37989t;

    /* renamed from: u, reason: collision with root package name */
    public Button f37990u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f37991v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f37992w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f37993x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f37994y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f37995z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(i this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void l(i this$0, Boolean bool) {
        AbstractC3159y.i(this$0, "this$0");
        m mVar = this$0.f37981D;
        k kVar = null;
        if (mVar == null) {
            AbstractC3159y.y("stacksAdapter");
            mVar = null;
        }
        k kVar2 = this$0.f37980C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        List items = kVar.d();
        mVar.getClass();
        AbstractC3159y.i(items, "items");
        mVar.f8420a = items;
        mVar.notifyDataSetChanged();
    }

    public static final void m(i this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void n(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new B5.h(), B5.h.f1007r)) != null) {
            add.commit();
        }
    }

    public static final void o(i this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q();
    }

    public static final void p(i this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new C3514j(), C3514j.f36307u)) != null) {
            add.commit();
        }
    }

    public static final void r(final i this$0, View view) {
        C1893g c1893g;
        AbstractC3159y.i(this$0, "this$0");
        C1895i c1895i = C1895i.f14826a;
        k kVar = null;
        if (C1895i.f14827b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1893g.f14818h);
            if (findFragmentByTag instanceof C1893g) {
                c1893g = (C1893g) findFragmentByTag;
            } else {
                c1893g = null;
            }
            if (c1893g != null) {
                C1891e c1891e = c1893g.f14821c;
                if (c1891e == null) {
                    AbstractC3159y.y("viewModel");
                    c1891e = null;
                }
                c1891e.getClass();
                if (C1895i.f14827b) {
                    C1895i.f14828c.setAllOwnedItems();
                    SharedStorage sharedStorage = c1891e.f14813a;
                    N7.a aVar = N7.a.GBC_CONSENT_STRING;
                    sharedStorage.d(aVar, c1895i.a(sharedStorage.k(aVar), C1895i.f14828c));
                    ChoiceCmpCallback choiceCmpCallback = c1891e.f14814b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onGoogleBasicConsentChange(c1895i.b());
                    }
                    AbstractC2829k.d(C2842q0.f31785a, C2812b0.b(), null, new C1890d(null), 2, null);
                }
            }
        }
        k kVar2 = this$0.f37980C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.f37998a.x();
        kVar.e();
        H7.m.f3644a.b(n.ACCEPT_ALL, H7.f.GDPR).observe(this$0, new Observer() { // from class: s5.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.m(i.this, (String) obj);
            }
        });
    }

    public static final void t(final i this$0, View view) {
        C1893g c1893g;
        AbstractC3159y.i(this$0, "this$0");
        k kVar = null;
        if (C1895i.f14827b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1893g.f14818h);
            if (findFragmentByTag instanceof C1893g) {
                c1893g = (C1893g) findFragmentByTag;
            } else {
                c1893g = null;
            }
            if (c1893g != null) {
                c1893g.h();
            }
        }
        k kVar2 = this$0.f37980C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            kVar = kVar2;
        }
        kVar.e();
        H7.m.f3644a.b(n.SAVE_AND_EXIT, H7.f.GDPR).observe(this$0, new Observer() { // from class: s5.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.o(i.this, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R7.a.b
    public void b(R7.d item) {
        AbstractC3159y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f8899a instanceof B6.g)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            i.a aVar = Q7.i.f8397y;
            String str = Q7.i.f8398z;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                B6.f fVar = item.f8899a;
                String str2 = fVar.f1048b;
                String a8 = ((B6.g) fVar).a();
                String b8 = ((B6.g) item.f8899a).b();
                k kVar = this.f37980C;
                k kVar2 = null;
                if (kVar == null) {
                    AbstractC3159y.y("viewModel");
                    kVar = null;
                }
                String str3 = kVar.f38003f.f().f5644i;
                k kVar3 = this.f37980C;
                if (kVar3 == null) {
                    AbstractC3159y.y("viewModel");
                } else {
                    kVar2 = kVar3;
                }
                beginTransaction.add(i.a.a(aVar, str2, a8, b8, str3, kVar2.f38003f.f().f5649n, item.f8899a.f1047a, item.f8902d, false, null, 384), str).commit();
            }
        }
    }

    @Override // Q7.m.a
    public void c(p item) {
        AbstractC3159y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            String str = F5.d.f2659w;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                int i8 = item.f5688a;
                F5.d dVar = new F5.d();
                Bundle bundle = new Bundle();
                bundle.putInt("stack_id", i8);
                dVar.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().add(dVar, str).commit();
            }
        }
    }

    @Override // R7.a.b
    public void d(R7.d item) {
        AbstractC3159y.i(item, "item");
        k kVar = this.f37980C;
        if (kVar == null) {
            AbstractC3159y.y("viewModel");
            kVar = null;
        }
        kVar.getClass();
        AbstractC3159y.i(item, "item");
        B6.f fVar = item.f8899a;
        if (fVar instanceof B6.i) {
            Boolean bool = item.f8900b;
            Boolean bool2 = Boolean.TRUE;
            if (AbstractC3159y.d(bool, bool2)) {
                kVar.f37998a.f39930r.set(item.f8899a.f1047a);
            } else {
                kVar.f37998a.f39930r.unset(item.f8899a.f1047a);
            }
            H7.m mVar = H7.m.f3644a;
            StringBuilder a8 = AbstractC3505a.a("Purposes", '_');
            a8.append(item.f8899a.f1047a);
            AbstractC3506b.a(item.f8900b, bool2, mVar, a8.toString());
            return;
        }
        if (fVar instanceof B6.d) {
            Boolean bool3 = item.f8900b;
            Boolean bool4 = Boolean.TRUE;
            if (AbstractC3159y.d(bool3, bool4)) {
                kVar.f37998a.f39929q.set(item.f8899a.f1047a);
            } else {
                kVar.f37998a.f39929q.unset(item.f8899a.f1047a);
            }
            H7.m mVar2 = H7.m.f3644a;
            StringBuilder a9 = AbstractC3505a.a("Special Features", '_');
            a9.append(item.f8899a.f1047a);
            AbstractC3506b.a(item.f8900b, bool4, mVar2, a9.toString());
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "it.viewModelStore");
            k kVar = (k) new ViewModelProvider(viewModelStore, new l()).get(k.class);
            this.f37980C = kVar;
            if (kVar == null) {
                AbstractC3159y.y("viewModel");
                kVar = null;
            }
            kVar.f38012o.observe(this, new Observer() { // from class: s5.a
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    i.l(i.this, (Boolean) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3856g, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…ptions, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentActivity activity;
        AbstractC3159y.i(item, "item");
        if (item.getItemId() == 16908332 && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        Integer num;
        k kVar;
        String str;
        Map map;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f37982m = (RecyclerView) view.findViewById(I1.b.f3766T);
        this.f37983n = (RecyclerView) view.findViewById(I1.b.f3774X);
        this.f37984o = (RecyclerView) view.findViewById(I1.b.f3770V);
        this.f37985p = (RecyclerView) view.findViewById(I1.b.f3776Y);
        this.f37986q = (ConstraintLayout) view.findViewById(I1.b.f3748K);
        this.f37987r = (LinearLayout) view.findViewById(I1.b.f3787c0);
        this.f37988s = (LinearLayout) view.findViewById(I1.b.f3790d0);
        this.f37990u = (Button) view.findViewById(I1.b.f3786c);
        this.f37989t = (Button) view.findViewById(I1.b.f3813l);
        this.f37991v = (TextView) view.findViewById(I1.b.f3777Y0);
        this.f37992w = (TextView) view.findViewById(I1.b.f3809j1);
        this.f37993x = (TextView) view.findViewById(I1.b.f3788c1);
        this.f37994y = (TextView) view.findViewById(I1.b.f3755N0);
        this.f37995z = (TextView) view.findViewById(I1.b.f3775X0);
        this.f37978A = (TextView) view.findViewById(I1.b.f3773W0);
        int i9 = I1.b.f3848z;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i9);
        this.f37979B = frameLayout;
        if (C1895i.f14827b) {
            getChildFragmentManager().beginTransaction().add(i9, new C1893g(), C1893g.f14818h).addToBackStack(null).commit();
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        k kVar2 = this.f37980C;
        if (kVar2 == null) {
            AbstractC3159y.y("viewModel");
            kVar2 = null;
        }
        kVar2.getClass();
        AbstractC2829k.d(ViewModelKt.getViewModelScope(kVar2), C2812b0.b(), null, new j(kVar2, null), 2, null);
        k kVar3 = this.f37980C;
        if (kVar3 == null) {
            AbstractC3159y.y("viewModel");
            kVar3 = null;
        }
        B6.e eVar = kVar3.f37998a.f39913a;
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
        List list = kVar3.f37999b.f2374c.f2369a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set b12 = AbstractC1246t.b1(((E6.d) obj).f2367f);
            List list2 = kVar3.f37999b.f2373b.f2338h;
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
        String valueOf = String.valueOf(kVar3.f38000c.f39870a.size() + arrayList.size() + i8 + (kVar3.f38001d == null ? 0 : 1));
        k kVar4 = this.f37980C;
        if (kVar4 == null) {
            AbstractC3159y.y("viewModel");
            kVar4 = null;
        }
        String str2 = kVar4.f38003f.f().f5637b;
        TextView textView = this.f37978A;
        if (textView != null) {
            textView.setText(g6.n.y(str2, "${partners}", valueOf, true));
        }
        TextView textView2 = this.f37978A;
        if (textView2 != null) {
            k kVar5 = this.f37980C;
            if (kVar5 == null) {
                AbstractC3159y.y("viewModel");
                kVar5 = null;
            }
            kVar5.getClass();
            if (C1895i.f14827b) {
                str = kVar5.f38008k.f3203b.f3198c;
            } else {
                str = "";
            }
            textView2.append(str);
        }
        TextView textView3 = this.f37995z;
        if (textView3 != null) {
            k kVar6 = this.f37980C;
            if (kVar6 == null) {
                AbstractC3159y.y("viewModel");
                kVar6 = null;
            }
            textView3.setText(I7.b.a(kVar6.f38003f.f().f5640e));
        }
        TextView textView4 = this.f37994y;
        if (textView4 != null) {
            k kVar7 = this.f37980C;
            if (kVar7 == null) {
                AbstractC3159y.y("viewModel");
                kVar7 = null;
            }
            textView4.setText(I7.b.a(kVar7.f38003f.f().f5638c));
        }
        TextView textView5 = this.f37993x;
        if (textView5 != null) {
            k kVar8 = this.f37980C;
            if (kVar8 == null) {
                AbstractC3159y.y("viewModel");
                kVar8 = null;
            }
            textView5.setText(kVar8.f38003f.f().f5639d);
        }
        TextView textView6 = this.f37992w;
        if (textView6 != null) {
            k kVar9 = this.f37980C;
            if (kVar9 == null) {
                AbstractC3159y.y("viewModel");
                kVar9 = null;
            }
            textView6.setText(kVar9.f38003f.f().f5641f);
        }
        TextView textView7 = this.f37991v;
        if (textView7 != null) {
            k kVar10 = this.f37980C;
            if (kVar10 == null) {
                AbstractC3159y.y("viewModel");
                kVar10 = null;
            }
            textView7.setText(kVar10.f38003f.f().f5645j);
        }
        TextView textView8 = this.f8361b;
        if (textView8 != null) {
            k kVar11 = this.f37980C;
            if (kVar11 == null) {
                AbstractC3159y.y("viewModel");
                kVar11 = null;
            }
            textView8.setText(kVar11.f38003f.f().f5636a);
        }
        ImageView imageView = this.f8362c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: s5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.k(i.this, view2);
                }
            });
            k kVar12 = this.f37980C;
            if (kVar12 == null) {
                AbstractC3159y.y("viewModel");
                kVar12 = null;
            }
            imageView.setContentDescription(kVar12.f38003f.f().f5650o);
        }
        k kVar13 = this.f37980C;
        if (kVar13 == null) {
            AbstractC3159y.y("viewModel");
            kVar13 = null;
        }
        List d8 = kVar13.d();
        J7.c cVar = this.f8369j;
        this.f37981D = new m(d8, this, cVar == null ? null : cVar.f5538i, cVar == null ? null : cVar.f5530a, this.f8371l);
        RecyclerView recyclerView = this.f37985p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            m mVar = this.f37981D;
            if (mVar == null) {
                AbstractC3159y.y("stacksAdapter");
                mVar = null;
            }
            recyclerView.setAdapter(mVar);
        }
        RecyclerView recyclerView2 = this.f37984o;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            k kVar14 = this.f37980C;
            if (kVar14 == null) {
                AbstractC3159y.y("viewModel");
                kVar14 = null;
            }
            List b8 = kVar14.b();
            J7.c cVar2 = this.f8369j;
            recyclerView2.setAdapter(new R7.a(b8, this, null, null, cVar2 == null ? null : cVar2.f5538i, cVar2 == null ? null : cVar2.f5534e, cVar2 == null ? null : cVar2.f5535f, cVar2 == null ? null : cVar2.f5530a, null, this.f8371l, 268));
        }
        RecyclerView recyclerView3 = this.f37983n;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
            k kVar15 = this.f37980C;
            if (kVar15 == null) {
                AbstractC3159y.y("viewModel");
                kVar15 = null;
            }
            List c8 = kVar15.c();
            J7.c cVar3 = this.f8369j;
            recyclerView3.setAdapter(new R7.a(c8, this, null, null, cVar3 == null ? null : cVar3.f5538i, cVar3 == null ? null : cVar3.f5534e, cVar3 == null ? null : cVar3.f5535f, cVar3 == null ? null : cVar3.f5530a, null, this.f8371l, 268));
        }
        RecyclerView recyclerView4 = this.f37982m;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext()));
            k kVar16 = this.f37980C;
            if (kVar16 == null) {
                AbstractC3159y.y("viewModel");
                kVar16 = null;
            }
            List list3 = kVar16.f38004g;
            Context context = recyclerView4.getContext();
            AbstractC3159y.h(context, "context");
            J7.c cVar4 = this.f8369j;
            recyclerView4.setAdapter(new Q7.l(list3, context, cVar4 == null ? null : cVar4.f5541l, this.f8371l));
        }
        s();
        TextView textView9 = this.f37993x;
        if (textView9 != null) {
            k kVar17 = this.f37980C;
            if (kVar17 == null) {
                AbstractC3159y.y("viewModel");
                kVar17 = null;
            }
            k kVar18 = this.f37980C;
            if (kVar18 == null) {
                AbstractC3159y.y("viewModel");
                kVar18 = null;
            }
            List itemsList = kVar18.b();
            kVar17.getClass();
            AbstractC3159y.i(itemsList, "itemsList");
            textView9.setVisibility(((ArrayList) itemsList).isEmpty() ^ true ? 0 : 8);
        }
        TextView textView10 = this.f37992w;
        if (textView10 != null) {
            k kVar19 = this.f37980C;
            if (kVar19 == null) {
                AbstractC3159y.y("viewModel");
                kVar19 = null;
            }
            k kVar20 = this.f37980C;
            if (kVar20 == null) {
                AbstractC3159y.y("viewModel");
                kVar = null;
            } else {
                kVar = kVar20;
            }
            List itemsList2 = kVar.c();
            kVar19.getClass();
            AbstractC3159y.i(itemsList2, "itemsList");
            textView10.setVisibility(((ArrayList) itemsList2).isEmpty() ^ true ? 0 : 8);
        }
        J7.c cVar5 = this.f8369j;
        if (cVar5 != null) {
            Integer num2 = cVar5.f5536g;
            if (num2 != null) {
                int intValue = num2.intValue();
                ConstraintLayout constraintLayout = this.f37986q;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num3 = cVar5.f5538i;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView11 = this.f37993x;
                if (textView11 != null) {
                    textView11.setTextColor(intValue2);
                }
                TextView textView12 = this.f37992w;
                if (textView12 != null) {
                    textView12.setTextColor(intValue2);
                }
                TextView textView13 = this.f37991v;
                if (textView13 != null) {
                    textView13.setTextColor(intValue2);
                }
                TextView textView14 = this.f37995z;
                if (textView14 != null) {
                    textView14.setTextColor(intValue2);
                }
                TextView textView15 = this.f37994y;
                if (textView15 != null) {
                    textView15.setTextColor(intValue2);
                }
                TextView textView16 = this.f37978A;
                if (textView16 != null) {
                    textView16.setTextColor(intValue2);
                }
            }
            Integer num4 = cVar5.f5530a;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                TextView textView17 = this.f37978A;
                if (textView17 != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue3);
                    textView17.setBackground(gradientDrawable);
                }
            }
            Integer num5 = cVar5.f5542m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button = this.f37990u;
                if (button != null) {
                    button.setTextColor(intValue4);
                }
                Button button2 = this.f37989t;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num6 = cVar5.f5544o;
            if (num6 != null) {
                int intValue5 = num6.intValue();
                Button button3 = this.f37990u;
                if (button3 != null) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
                Button button4 = this.f37989t;
                if (button4 != null) {
                    button4.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
            }
        }
        J7.c cVar6 = this.f8369j;
        if (cVar6 != null && (num = cVar6.f5530a) != null) {
            int intValue6 = num.intValue();
            View findViewById = view.findViewById(I1.b.f3756O);
            if (findViewById != null) {
                findViewById.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById2 = view.findViewById(I1.b.f3796f0);
            if (findViewById2 != null) {
                findViewById2.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById3 = view.findViewById(I1.b.f3752M);
            if (findViewById3 != null) {
                findViewById3.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById4 = view.findViewById(I1.b.f3825p);
            if (findViewById4 != null) {
                findViewById4.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
            View findViewById5 = view.findViewById(I1.b.f3740G);
            if (findViewById5 != null) {
                findViewById5.setBackgroundTintList(ColorStateList.valueOf(intValue6));
            }
        }
        Typeface typeface = this.f8370k;
        if (typeface != null) {
            TextView textView18 = this.f37993x;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            TextView textView19 = this.f37992w;
            if (textView19 != null) {
                textView19.setTypeface(typeface);
            }
            TextView textView20 = this.f37991v;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f8371l;
        if (typeface2 == null) {
            return;
        }
        TextView textView21 = this.f37978A;
        if (textView21 != null) {
            textView21.setTypeface(typeface2);
        }
        TextView textView22 = this.f37995z;
        if (textView22 != null) {
            textView22.setTypeface(typeface2);
        }
        TextView textView23 = this.f37994y;
        if (textView23 != null) {
            textView23.setTypeface(typeface2);
        }
        Button button5 = this.f37990u;
        if (button5 != null) {
            button5.setTypeface(typeface2);
        }
        Button button6 = this.f37989t;
        if (button6 == null) {
            return;
        }
        button6.setTypeface(typeface2);
    }

    public final void q() {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = supportFragmentManager.findFragmentByTag(D5.f.f1840m);
        }
        BottomSheetDialogFragment bottomSheetDialogFragment = (BottomSheetDialogFragment) fragment;
        if (bottomSheetDialogFragment != null) {
            bottomSheetDialogFragment.dismiss();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void s() {
        Button button = this.f37990u;
        k kVar = null;
        if (button != null) {
            k kVar2 = this.f37980C;
            if (kVar2 == null) {
                AbstractC3159y.y("viewModel");
                kVar2 = null;
            }
            button.setText(kVar2.f38003f.f().f5642g);
            button.setOnClickListener(new View.OnClickListener() { // from class: s5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.r(i.this, view);
                }
            });
        }
        Button button2 = this.f37989t;
        if (button2 != null) {
            k kVar3 = this.f37980C;
            if (kVar3 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                kVar = kVar3;
            }
            button2.setText(kVar.f38003f.f().f5643h);
            button2.setOnClickListener(new View.OnClickListener() { // from class: s5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.t(i.this, view);
                }
            });
        }
        LinearLayout linearLayout = this.f37988s;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: s5.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.n(i.this, view);
                }
            });
        }
        LinearLayout linearLayout2 = this.f37987r;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: s5.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.p(i.this, view);
                }
            });
        }
    }
}
