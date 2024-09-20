package F5;

import B5.j;
import B6.g;
import Q7.i;
import R7.a;
import android.R;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import s5.k;
import s5.l;

/* loaded from: classes5.dex */
public final class d extends Q7.a implements a.b {

    /* renamed from: v, reason: collision with root package name */
    public static final a f2658v = new a();

    /* renamed from: w, reason: collision with root package name */
    public static final String f2659w = d.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public Button f2660m;

    /* renamed from: n, reason: collision with root package name */
    public Button f2661n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f2662o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f2663p;

    /* renamed from: q, reason: collision with root package name */
    public ConstraintLayout f2664q;

    /* renamed from: r, reason: collision with root package name */
    public int f2665r;

    /* renamed from: s, reason: collision with root package name */
    public R7.a f2666s;

    /* renamed from: t, reason: collision with root package name */
    public e f2667t;

    /* renamed from: u, reason: collision with root package name */
    public k f2668u;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(d this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void m(d this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        e eVar = this$0.f2667t;
        if (eVar == null) {
            AbstractC3159y.y("viewModel");
            eVar = null;
        }
        int i8 = this$0.f2665r;
        Iterator it = ((ArrayList) eVar.c(i8)).iterator();
        while (it.hasNext()) {
            eVar.f2669a.f39930r.unset(((R7.d) it.next()).f8899a.f1047a);
        }
        Iterator it2 = ((ArrayList) eVar.d(i8)).iterator();
        while (it2.hasNext()) {
            eVar.f2669a.f39929q.unset(((R7.d) it2.next()).f8899a.f1047a);
        }
        this$0.q();
    }

    public static final void n(d this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        e eVar = this$0.f2667t;
        if (eVar == null) {
            AbstractC3159y.y("viewModel");
            eVar = null;
        }
        int i8 = this$0.f2665r;
        Iterator it = ((ArrayList) eVar.c(i8)).iterator();
        while (it.hasNext()) {
            eVar.f2669a.f39930r.set(((R7.d) it.next()).f8899a.f1047a);
        }
        Iterator it2 = ((ArrayList) eVar.d(i8)).iterator();
        while (it2.hasNext()) {
            eVar.f2669a.f39929q.set(((R7.d) it2.next()).f8899a.f1047a);
        }
        this$0.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R7.a.b
    public void b(R7.d item) {
        i b8;
        AbstractC3159y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f8899a instanceof g)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            i.a aVar = i.f8397y;
            String str = i.f8398z;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                B6.f fVar = item.f8899a;
                String str2 = fVar.f1048b;
                String a8 = ((g) fVar).a();
                String b9 = ((g) item.f8899a).b();
                e eVar = this.f2667t;
                e eVar2 = null;
                if (eVar == null) {
                    AbstractC3159y.y("viewModel");
                    eVar = null;
                }
                String str3 = eVar.f2671c.h().f5692b;
                e eVar3 = this.f2667t;
                if (eVar3 == null) {
                    AbstractC3159y.y("viewModel");
                } else {
                    eVar2 = eVar3;
                }
                b8 = aVar.b((r23 & 1) != 0 ? "" : str2, (r23 & 2) != 0 ? "" : a8, (r23 & 4) != 0 ? "" : b9, (r23 & 8) != 0 ? "" : str3, (r23 & 16) != 0 ? "" : eVar2.f2671c.h().f5695e, item.f8899a.f1047a, item.f8902d, (r23 & 128) != 0 ? false : false, (r23 & 256) != 0 ? j.ALL_VENDORS : null);
                beginTransaction.add(b8, str).commit();
            }
        }
    }

    @Override // R7.a.b
    public void d(R7.d switchItem) {
        AbstractC3159y.i(switchItem, "item");
        e eVar = this.f2667t;
        e eVar2 = null;
        if (eVar == null) {
            AbstractC3159y.y("viewModel");
            eVar = null;
        }
        eVar.getClass();
        AbstractC3159y.i(switchItem, "switchItem");
        int ordinal = switchItem.f8902d.ordinal();
        if (ordinal != 4) {
            if (ordinal == 7) {
                if (AbstractC3159y.d(switchItem.f8900b, Boolean.TRUE)) {
                    eVar.f2669a.f39929q.set(switchItem.f8899a.f1047a);
                } else {
                    eVar.f2669a.f39929q.unset(switchItem.f8899a.f1047a);
                }
            }
        } else if (AbstractC3159y.d(switchItem.f8900b, Boolean.TRUE)) {
            eVar.f2669a.f39930r.set(switchItem.f8899a.f1047a);
        } else {
            eVar.f2669a.f39930r.unset(switchItem.f8899a.f1047a);
        }
        e eVar3 = this.f2667t;
        if (eVar3 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            eVar2 = eVar3;
        }
        l(eVar2.b(this.f2665r));
    }

    public final void l(Set set) {
        boolean z8;
        Button button = this.f2661n;
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
        Button button2 = this.f2660m;
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

    public final ColorStateList o() {
        Integer num;
        J7.c cVar = this.f8369j;
        if (cVar == null || (num = cVar.f5544o) == null || cVar.f5545p == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f5545p.intValue()});
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f2667t = (e) new ViewModelProvider(viewModelStore, new f()).get(e.class);
            ViewModelStore viewModelStore2 = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore2, "it.viewModelStore");
            this.f2668u = (k) new ViewModelProvider(viewModelStore2, new l()).get(k.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3860k, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…stacks, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC3159y.i(dialog, "dialog");
        super.onDismiss(dialog);
        k kVar = this.f2668u;
        if (kVar == null) {
            AbstractC3159y.y("optionsViewModel");
            kVar = null;
        }
        kVar.f38012o.postValue(Boolean.TRUE);
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
        Integer num2;
        Integer num3;
        Integer num4;
        String str;
        Map map;
        B6.j jVar;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f2660m = (Button) view.findViewById(I1.b.f3786c);
        this.f2661n = (Button) view.findViewById(I1.b.f3798g);
        this.f2662o = (RecyclerView) view.findViewById(I1.b.f3778Z);
        this.f2663p = (TextView) view.findViewById(I1.b.f3815l1);
        this.f2664q = (ConstraintLayout) view.findViewById(I1.b.f3799g0);
        Bundle arguments = getArguments();
        if (arguments == null) {
            i8 = 0;
        } else {
            i8 = arguments.getInt("stack_id");
        }
        this.f2665r = i8;
        TextView textView = this.f2663p;
        R7.a aVar = null;
        if (textView != null) {
            e eVar = this.f2667t;
            if (eVar == null) {
                AbstractC3159y.y("viewModel");
                eVar = null;
            }
            int i9 = this.f2665r;
            B6.e eVar2 = eVar.f2669a.f39913a;
            if (eVar2 == null || (map = eVar2.f1044j) == null || (jVar = (B6.j) map.get(String.valueOf(i9))) == null) {
                str = null;
            } else {
                str = jVar.f1048b;
            }
            textView.setText(str);
        }
        TextView textView2 = this.f8361b;
        if (textView2 != null) {
            e eVar3 = this.f2667t;
            if (eVar3 == null) {
                AbstractC3159y.y("viewModel");
                eVar3 = null;
            }
            textView2.setText(eVar3.f2671c.h().f5691a);
        }
        ImageView imageView = this.f8362c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: F5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.k(d.this, view2);
                }
            });
            e eVar4 = this.f2667t;
            if (eVar4 == null) {
                AbstractC3159y.y("viewModel");
                eVar4 = null;
            }
            imageView.setContentDescription(eVar4.f2671c.h().f5696f);
        }
        J7.c cVar = this.f8369j;
        if (cVar != null) {
            Integer num5 = cVar.f5536g;
            if (num5 != null) {
                int intValue = num5.intValue();
                ConstraintLayout constraintLayout = this.f2664q;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num6 = cVar.f5538i;
            if (num6 != null) {
                int intValue2 = num6.intValue();
                TextView textView3 = this.f2663p;
                if (textView3 != null) {
                    textView3.setTextColor(intValue2);
                }
            }
            Typeface typeface = this.f8371l;
            if (typeface != null) {
                TextView textView4 = this.f2663p;
                if (textView4 != null) {
                    textView4.setTypeface(typeface);
                }
                Button button = this.f2660m;
                if (button != null) {
                    button.setTypeface(typeface);
                }
                Button button2 = this.f2661n;
                if (button2 != null) {
                    button2.setTypeface(typeface);
                }
            }
            Button button3 = this.f2660m;
            if (button3 != null) {
                ColorStateList p8 = p();
                if (p8 != null) {
                    button3.setTextColor(p8);
                }
                ColorStateList o8 = o();
                if (o8 != null) {
                    button3.setBackgroundTintList(o8);
                }
            }
            Button button4 = this.f2661n;
            if (button4 != null) {
                ColorStateList p9 = p();
                if (p9 != null) {
                    button4.setTextColor(p9);
                }
                ColorStateList o9 = o();
                if (o9 != null) {
                    button4.setBackgroundTintList(o9);
                }
            }
        }
        e eVar5 = this.f2667t;
        if (eVar5 == null) {
            AbstractC3159y.y("viewModel");
            eVar5 = null;
        }
        List a8 = eVar5.a(this.f2665r);
        J7.c cVar2 = this.f8369j;
        if (cVar2 == null) {
            num = null;
        } else {
            num = cVar2.f5538i;
        }
        if (cVar2 == null) {
            num2 = null;
        } else {
            num2 = cVar2.f5534e;
        }
        if (cVar2 == null) {
            num3 = null;
        } else {
            num3 = cVar2.f5535f;
        }
        if (cVar2 == null) {
            num4 = null;
        } else {
            num4 = cVar2.f5530a;
        }
        this.f2666s = new R7.a(a8, this, null, null, num, num2, num3, num4, null, this.f8371l, 268);
        RecyclerView recyclerView = this.f2662o;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            R7.a aVar2 = this.f2666s;
            if (aVar2 == null) {
                AbstractC3159y.y("switchAdapter");
            } else {
                aVar = aVar2;
            }
            recyclerView.setAdapter(aVar);
        }
        r();
    }

    public final ColorStateList p() {
        Integer num;
        J7.c cVar = this.f8369j;
        if (cVar == null || (num = cVar.f5542m) == null || cVar.f5543n == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f5543n.intValue()});
    }

    public final void q() {
        R7.a aVar = this.f2666s;
        e eVar = null;
        if (aVar == null) {
            AbstractC3159y.y("switchAdapter");
            aVar = null;
        }
        e eVar2 = this.f2667t;
        if (eVar2 == null) {
            AbstractC3159y.y("viewModel");
            eVar2 = null;
        }
        aVar.b(eVar2.a(this.f2665r), true);
        e eVar3 = this.f2667t;
        if (eVar3 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            eVar = eVar3;
        }
        l(eVar.b(this.f2665r));
    }

    public final void r() {
        Button button = this.f2661n;
        if (button != null) {
            button.setText(getString(I1.e.f3880e));
        }
        e eVar = this.f2667t;
        e eVar2 = null;
        if (eVar == null) {
            AbstractC3159y.y("viewModel");
            eVar = null;
        }
        l(eVar.b(this.f2665r));
        Button button2 = this.f2661n;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: F5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.m(d.this, view);
                }
            });
        }
        Button button3 = this.f2660m;
        if (button3 != null) {
            e eVar3 = this.f2667t;
            if (eVar3 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                eVar2 = eVar3;
            }
            button3.setText(eVar2.f2671c.h().f5693c);
        }
        Button button4 = this.f2660m;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: F5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.n(d.this, view);
                }
            });
        }
    }
}
