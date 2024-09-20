package z5;

import B6.i;
import H7.m;
import M5.AbstractC1246t;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import w5.C3851a;

/* loaded from: classes5.dex */
public final class f extends Q7.a {

    /* renamed from: H, reason: collision with root package name */
    public static final a f40431H = new a();

    /* renamed from: I, reason: collision with root package name */
    public static final String f40432I;

    /* renamed from: A, reason: collision with root package name */
    public TextView f40433A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f40434B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f40435C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f40436D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f40437E;

    /* renamed from: F, reason: collision with root package name */
    public C4027a f40438F;

    /* renamed from: G, reason: collision with root package name */
    public g f40439G;

    /* renamed from: m, reason: collision with root package name */
    public TextView f40440m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f40441n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f40442o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f40443p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f40444q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f40445r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f40446s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f40447t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f40448u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f40449v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f40450w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f40451x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f40452y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f40453z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = f.class.getSimpleName();
        AbstractC3159y.h(simpleName, "PartnersDetailFragment::class.java.simpleName");
        f40432I = simpleName;
    }

    public static final void n(f this$0, J7.d cookieDisclosure) {
        g gVar;
        Iterator it;
        Map map;
        i iVar;
        AbstractC3159y.i(this$0, "this$0");
        g gVar2 = this$0.f40439G;
        if (gVar2 == null) {
            AbstractC3159y.y("viewModel");
            gVar2 = null;
        }
        AbstractC3159y.h(cookieDisclosure, "it");
        gVar2.getClass();
        AbstractC3159y.i(cookieDisclosure, "cookieDisclosure");
        gVar2.f40457d.clear();
        Iterator it2 = cookieDisclosure.f5546a.iterator();
        while (it2.hasNext()) {
            J7.f fVar = (J7.f) it2.next();
            List list = gVar2.f40457d;
            String str = fVar.f5597a;
            String str2 = fVar.f5598b;
            String valueOf = String.valueOf(fVar.f5599c);
            String str3 = fVar.f5600d;
            List list2 = fVar.f5601e;
            String str4 = "";
            int i8 = 0;
            for (Object obj : list2) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1246t.w();
                }
                int intValue = ((Number) obj).intValue();
                B6.e eVar = gVar2.f40454a.f39913a;
                if (eVar == null || (map = eVar.f1038d) == null || (iVar = (i) map.get(String.valueOf(intValue))) == null) {
                    it = it2;
                } else {
                    Y y8 = Y.f33752a;
                    it = it2;
                    String format = String.format("• %s.", Arrays.copyOf(new Object[]{iVar.f1048b}, 1));
                    AbstractC3159y.h(format, "format(format, *args)");
                    str4 = AbstractC3159y.q(str4, format);
                    if (i8 != list2.size() - 1) {
                        str4 = AbstractC3159y.q(str4, "\n");
                    }
                }
                it2 = it;
                i8 = i9;
            }
            list.add(new Q7.e(str, str2, valueOf, str3, str4));
        }
        g gVar3 = this$0.f40439G;
        if (gVar3 == null) {
            AbstractC3159y.y("viewModel");
            gVar3 = null;
        }
        if (!gVar3.f40457d.isEmpty()) {
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                String str5 = w5.e.f39037p;
                if (supportFragmentManager.findFragmentByTag(str5) == null) {
                    FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                    g gVar4 = this$0.f40439G;
                    if (gVar4 == null) {
                        AbstractC3159y.y("viewModel");
                        gVar = null;
                    } else {
                        gVar = gVar4;
                    }
                    C3851a args = new C3851a(gVar.f40457d);
                    AbstractC3159y.i(args, "args");
                    w5.e eVar2 = new w5.e();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("partner_disclosure_args", args);
                    eVar2.setArguments(bundle);
                    beginTransaction.add(eVar2, str5).commit();
                    return;
                }
                return;
            }
            return;
        }
        this$0.r();
    }

    public static final void o(f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        m mVar = m.f3644a;
        StringBuilder sb = new StringBuilder();
        g gVar = this$0.f40439G;
        C4027a c4027a = null;
        if (gVar == null) {
            AbstractC3159y.y("viewModel");
            gVar = null;
        }
        C4027a c4027a2 = this$0.f40438F;
        if (c4027a2 == null) {
            AbstractC3159y.y("args");
            c4027a2 = null;
        }
        sb.append(H7.b.a(gVar.a(c4027a2.f40423n)));
        sb.append("-id:");
        C4027a c4027a3 = this$0.f40438F;
        if (c4027a3 == null) {
            AbstractC3159y.y("args");
        } else {
            c4027a = c4027a3;
        }
        sb.append(c4027a.f40422m);
        mVar.f("collapseElement", sb.toString());
        this$0.dismiss();
    }

    public static final void p(f this$0, String link, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(link, "$link");
        Context context = this$0.getContext();
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(link));
            context.startActivity(intent);
        }
    }

    public static final void q(final f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C4027a c4027a = this$0.f40438F;
        C4027a c4027a2 = null;
        if (c4027a == null) {
            AbstractC3159y.y("args");
            c4027a = null;
        }
        if (c4027a.f40424o.length() > 0) {
            g gVar = this$0.f40439G;
            if (gVar == null) {
                AbstractC3159y.y("viewModel");
                gVar = null;
            }
            C4027a c4027a3 = this$0.f40438F;
            if (c4027a3 == null) {
                AbstractC3159y.y("args");
            } else {
                c4027a2 = c4027a3;
            }
            String url = c4027a2.f40424o;
            gVar.getClass();
            AbstractC3159y.i(url, "url");
            gVar.f40455b.a(url).observe(this$0, new Observer() { // from class: z5.e
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    f.n(f.this, (J7.d) obj);
                }
            });
            return;
        }
        this$0.r();
    }

    public final void k(View view) {
        this.f40437E = (ImageView) view.findViewById(I1.b.f3814l0);
        this.f40436D = (TextView) view.findViewById(I1.b.f3745I0);
        this.f40435C = (TextView) view.findViewById(I1.b.f3845x0);
        this.f40434B = (TextView) view.findViewById(I1.b.f3785b1);
        this.f40433A = (TextView) view.findViewById(I1.b.f3757O0);
        this.f40453z = (TextView) view.findViewById(I1.b.f3806i1);
        this.f40452y = (TextView) view.findViewById(I1.b.f3747J0);
        this.f40451x = (TextView) view.findViewById(I1.b.f3800g1);
        this.f40450w = (TextView) view.findViewById(I1.b.f3788c1);
        this.f40449v = (TextView) view.findViewById(I1.b.f3759P0);
        this.f40448u = (TextView) view.findViewById(I1.b.f3812k1);
        this.f40447t = (TextView) view.findViewById(I1.b.f3749K0);
        this.f40446s = (TextView) view.findViewById(I1.b.f3803h1);
        this.f40445r = (TextView) view.findViewById(I1.b.f3835s0);
        this.f40443p = (TextView) view.findViewById(I1.b.f3833r1);
        this.f40444q = (TextView) view.findViewById(I1.b.f3841v0);
        this.f40442o = (TextView) view.findViewById(I1.b.f3837t0);
        this.f40441n = (TextView) view.findViewById(I1.b.f3839u0);
        this.f40440m = (TextView) view.findViewById(I1.b.f3779Z0);
        ImageView imageView = this.f40437E;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: z5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.o(f.this, view2);
                }
            });
            g gVar = this.f40439G;
            if (gVar == null) {
                AbstractC3159y.y("viewModel");
                gVar = null;
            }
            imageView.setContentDescription(gVar.f40456c.g().f5666o);
        }
        TextView textView = this.f40436D;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: z5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.q(f.this, view2);
                }
            });
        }
        J7.c cVar = this.f8369j;
        if (cVar != null) {
            Integer num = cVar.f5536g;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            Integer num2 = cVar.f5538i;
            if (num2 != null) {
                int intValue = num2.intValue();
                TextView textView2 = this.f40435C;
                if (textView2 != null) {
                    textView2.setTextColor(intValue);
                }
                TextView textView3 = this.f40434B;
                if (textView3 != null) {
                    textView3.setTextColor(intValue);
                }
                TextView textView4 = this.f40433A;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                }
                TextView textView5 = this.f40453z;
                if (textView5 != null) {
                    textView5.setTextColor(intValue);
                }
                TextView textView6 = this.f40452y;
                if (textView6 != null) {
                    textView6.setTextColor(intValue);
                }
                TextView textView7 = this.f40451x;
                if (textView7 != null) {
                    textView7.setTextColor(intValue);
                }
                TextView textView8 = this.f40450w;
                if (textView8 != null) {
                    textView8.setTextColor(intValue);
                }
                TextView textView9 = this.f40449v;
                if (textView9 != null) {
                    textView9.setTextColor(intValue);
                }
                TextView textView10 = this.f40448u;
                if (textView10 != null) {
                    textView10.setTextColor(intValue);
                }
                TextView textView11 = this.f40447t;
                if (textView11 != null) {
                    textView11.setTextColor(intValue);
                }
                TextView textView12 = this.f40446s;
                if (textView12 != null) {
                    textView12.setTextColor(intValue);
                }
                TextView textView13 = this.f40445r;
                if (textView13 != null) {
                    textView13.setTextColor(intValue);
                }
                TextView textView14 = this.f40443p;
                if (textView14 != null) {
                    textView14.setTextColor(intValue);
                }
                TextView textView15 = this.f40444q;
                if (textView15 != null) {
                    textView15.setTextColor(intValue);
                }
                TextView textView16 = this.f40442o;
                if (textView16 != null) {
                    textView16.setTextColor(intValue);
                }
                TextView textView17 = this.f40441n;
                if (textView17 != null) {
                    textView17.setTextColor(intValue);
                }
            }
            Integer num3 = cVar.f5541l;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView18 = this.f40436D;
                if (textView18 != null) {
                    textView18.setTextColor(intValue2);
                }
                TextView textView19 = this.f40440m;
                if (textView19 != null) {
                    textView19.setTextColor(intValue2);
                }
            }
        }
        Typeface typeface = this.f8370k;
        if (typeface != null) {
            TextView textView20 = this.f40450w;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
            TextView textView21 = this.f40449v;
            if (textView21 != null) {
                textView21.setTypeface(typeface);
            }
            TextView textView22 = this.f40448u;
            if (textView22 != null) {
                textView22.setTypeface(typeface);
            }
            TextView textView23 = this.f40447t;
            if (textView23 != null) {
                textView23.setTypeface(typeface);
            }
            TextView textView24 = this.f40446s;
            if (textView24 != null) {
                textView24.setTypeface(typeface);
            }
            TextView textView25 = this.f40441n;
            if (textView25 != null) {
                textView25.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f8371l;
        if (typeface2 != null) {
            TextView textView26 = this.f40435C;
            if (textView26 != null) {
                textView26.setTypeface(typeface2);
            }
            TextView textView27 = this.f40434B;
            if (textView27 != null) {
                textView27.setTypeface(typeface2);
            }
            TextView textView28 = this.f40433A;
            if (textView28 != null) {
                textView28.setTypeface(typeface2);
            }
            TextView textView29 = this.f40453z;
            if (textView29 != null) {
                textView29.setTypeface(typeface2);
            }
            TextView textView30 = this.f40452y;
            if (textView30 != null) {
                textView30.setTypeface(typeface2);
            }
            TextView textView31 = this.f40451x;
            if (textView31 != null) {
                textView31.setTypeface(typeface2);
            }
            TextView textView32 = this.f40436D;
            if (textView32 != null) {
                textView32.setTypeface(typeface2);
            }
            TextView textView33 = this.f40440m;
            if (textView33 != null) {
                textView33.setTypeface(typeface2);
            }
            TextView textView34 = this.f40445r;
            if (textView34 != null) {
                textView34.setTypeface(typeface2);
            }
            TextView textView35 = this.f40443p;
            if (textView35 != null) {
                textView35.setTypeface(typeface2);
            }
            TextView textView36 = this.f40444q;
            if (textView36 != null) {
                textView36.setTypeface(typeface2);
            }
            TextView textView37 = this.f40442o;
            if (textView37 != null) {
                textView37.setTypeface(typeface2);
            }
        }
    }

    public final void l(TextView textView, TextView textView2, String str, String str2) {
        if (str.length() > 0 && textView != null) {
            textView.setText(str);
        }
        if (str2.length() > 0) {
            if (textView2 != null) {
                textView2.setText(str2);
            }
        } else {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    public final void m(String str, final String str2) {
        TextView textView;
        if (str.length() > 0 && (textView = this.f40440m) != null) {
            textView.setText(str);
        }
        if (URLUtil.isValidUrl(str2)) {
            TextView textView2 = this.f40440m;
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: z5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        f.p(f.this, str2, view);
                    }
                });
                return;
            }
            return;
        }
        TextView textView3 = this.f40440m;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C4027a c4027a;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            c4027a = null;
        } else {
            c4027a = (C4027a) arguments.getParcelable("partner_detail_args");
        }
        if (c4027a == null) {
            c4027a = new C4027a(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 65535);
        }
        this.f40438F = c4027a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f40439G = (g) new ViewModelProvider(viewModelStore, new h()).get(g.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3858i, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…detail, container, false)");
        return inflate;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        int i8 = 0;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        m mVar = m.f3644a;
        StringBuilder sb = new StringBuilder();
        g gVar = this.f40439G;
        g gVar2 = null;
        if (gVar == null) {
            AbstractC3159y.y("viewModel");
            gVar = null;
        }
        C4027a c4027a = this.f40438F;
        if (c4027a == null) {
            AbstractC3159y.y("args");
            c4027a = null;
        }
        sb.append(H7.b.a(gVar.a(c4027a.f40423n)));
        sb.append("-id:");
        C4027a c4027a2 = this.f40438F;
        if (c4027a2 == null) {
            AbstractC3159y.y("args");
            c4027a2 = null;
        }
        sb.append(c4027a2.f40422m);
        mVar.f("expandElement", sb.toString());
        k(view);
        C4027a c4027a3 = this.f40438F;
        if (c4027a3 == null) {
            AbstractC3159y.y("args");
            c4027a3 = null;
        }
        TextView textView = this.f8361b;
        if (textView != null) {
            textView.setText(c4027a3.f40410a);
        }
        String str = c4027a3.f40411b;
        if (str != null && !AbstractC3159y.d(str, "null")) {
            TextView textView2 = this.f40435C;
            if (textView2 != null) {
                textView2.setText(str);
            }
            TextView textView3 = this.f40435C;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        if (c4027a3.f40419j.length() == 0) {
            TextView textView4 = this.f40445r;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            TextView textView5 = this.f40445r;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.f40445r;
            if (textView6 != null) {
                Context context = getContext();
                if (context == null) {
                    string = null;
                } else {
                    int i9 = I1.e.f3890o;
                    g gVar3 = this.f40439G;
                    if (gVar3 == null) {
                        AbstractC3159y.y("viewModel");
                        gVar3 = null;
                    }
                    string = context.getString(i9, gVar3.f40456c.g().f5659h, c4027a3.f40419j);
                }
                textView6.setText(string);
            }
        }
        if (c4027a3.f40420k.length() == 0) {
            TextView textView7 = this.f40443p;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        } else {
            TextView textView8 = this.f40443p;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            TextView textView9 = this.f40443p;
            if (textView9 != null) {
                Context context2 = getContext();
                if (context2 == null) {
                    string2 = null;
                } else {
                    int i10 = I1.e.f3890o;
                    g gVar4 = this.f40439G;
                    if (gVar4 == null) {
                        AbstractC3159y.y("viewModel");
                        gVar4 = null;
                    }
                    string2 = context2.getString(i10, gVar4.f40456c.g().f5663l, c4027a3.f40420k);
                }
                textView9.setText(string2);
            }
        }
        if (c4027a3.f40421l.length() == 0) {
            TextView textView10 = this.f40444q;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
        } else {
            TextView textView11 = this.f40444q;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            TextView textView12 = this.f40444q;
            if (textView12 != null) {
                Context context3 = getContext();
                if (context3 == null) {
                    string3 = null;
                } else {
                    string3 = context3.getString(I1.e.f3879d, c4027a3.f40421l);
                }
                textView12.setText(string3);
            }
        }
        TextView textView13 = this.f40436D;
        if (textView13 != null) {
            g gVar5 = this.f40439G;
            if (gVar5 == null) {
                AbstractC3159y.y("viewModel");
                gVar5 = null;
            }
            textView13.setText(gVar5.f40456c.g().f5662k);
        }
        TextView textView14 = this.f40436D;
        if (textView14 != null) {
            if (c4027a3.f40424o.length() <= 0) {
                i8 = 8;
            }
            textView14.setVisibility(i8);
        }
        TextView textView15 = this.f40450w;
        TextView textView16 = this.f40434B;
        g gVar6 = this.f40439G;
        if (gVar6 == null) {
            AbstractC3159y.y("viewModel");
            gVar6 = null;
        }
        l(textView15, textView16, gVar6.f40456c.g().f5652a, c4027a3.f40412c);
        TextView textView17 = this.f40449v;
        TextView textView18 = this.f40433A;
        g gVar7 = this.f40439G;
        if (gVar7 == null) {
            AbstractC3159y.y("viewModel");
            gVar7 = null;
        }
        l(textView17, textView18, gVar7.f40456c.g().f5653b, c4027a3.f40413d);
        TextView textView19 = this.f40448u;
        TextView textView20 = this.f40453z;
        g gVar8 = this.f40439G;
        if (gVar8 == null) {
            AbstractC3159y.y("viewModel");
            gVar8 = null;
        }
        l(textView19, textView20, gVar8.f40456c.g().f5654c, c4027a3.f40414e);
        TextView textView21 = this.f40447t;
        TextView textView22 = this.f40452y;
        g gVar9 = this.f40439G;
        if (gVar9 == null) {
            AbstractC3159y.y("viewModel");
            gVar9 = null;
        }
        l(textView21, textView22, gVar9.f40456c.g().f5655d, c4027a3.f40415f);
        TextView textView23 = this.f40446s;
        TextView textView24 = this.f40451x;
        g gVar10 = this.f40439G;
        if (gVar10 == null) {
            AbstractC3159y.y("viewModel");
            gVar10 = null;
        }
        l(textView23, textView24, gVar10.f40456c.g().f5656e, c4027a3.f40416g);
        TextView textView25 = this.f40441n;
        TextView textView26 = this.f40442o;
        g gVar11 = this.f40439G;
        if (gVar11 == null) {
            AbstractC3159y.y("viewModel");
            gVar11 = null;
        }
        l(textView25, textView26, gVar11.f40456c.g().f5657f, c4027a3.f40417h);
        g gVar12 = this.f40439G;
        if (gVar12 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            gVar2 = gVar12;
        }
        m(gVar2.f40456c.g().f5658g, c4027a3.f40418i);
    }

    public final void r() {
        TextView textView;
        TextView textView2 = this.f40436D;
        if (textView2 != null) {
            C4027a c4027a = this.f40438F;
            if (c4027a == null) {
                AbstractC3159y.y("args");
                c4027a = null;
            }
            textView2.setText(c4027a.f40425p);
        }
        Context context = getContext();
        if (context != null && (textView = this.f40436D) != null) {
            textView.setTextColor(ContextCompat.getColor(context, I1.a.f3724c));
        }
    }
}
