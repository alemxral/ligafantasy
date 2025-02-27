package P7;

import E6.h;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import c.C1893g;
import c.C1895i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class d extends Q7.a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f8099x = new a();

    /* renamed from: y, reason: collision with root package name */
    public static final String f8100y;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f8101m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f8102n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f8103o;

    /* renamed from: p, reason: collision with root package name */
    public CheckBox f8104p;

    /* renamed from: q, reason: collision with root package name */
    public Button f8105q;

    /* renamed from: r, reason: collision with root package name */
    public CardView f8106r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f8107s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f8108t;

    /* renamed from: u, reason: collision with root package name */
    public NestedScrollView f8109u;

    /* renamed from: v, reason: collision with root package name */
    public FrameLayout f8110v;

    /* renamed from: w, reason: collision with root package name */
    public f f8111w;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = d.class.getSimpleName();
        AbstractC3159y.h(simpleName, "CCPAPrivacyFragment::class.java.simpleName");
        f8100y = simpleName;
    }

    public static final void k(d this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void l(d this$0, String link, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(link, "$link");
        this$0.getClass();
        try {
            if (link.length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(link));
                this$0.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.e(f8100y, "No a valid URL has been passed");
        }
    }

    public static final void n(d this$0, View view) {
        boolean isChecked;
        h hVar;
        String str;
        h hVar2;
        E6.a aVar;
        AbstractC3159y.i(this$0, "this$0");
        f fVar = this$0.f8111w;
        C1893g c1893g = null;
        if (fVar == null) {
            AbstractC3159y.y("viewModel");
            fVar = null;
        }
        CheckBox checkBox = this$0.f8104p;
        if (checkBox == null) {
            isChecked = false;
        } else {
            isChecked = checkBox.isChecked();
        }
        SharedStorage sharedStorage = fVar.f8115a;
        if (isChecked) {
            hVar = h.YES;
        } else {
            hVar = h.NO;
        }
        h hVar3 = hVar;
        E6.f fVar2 = fVar.f8118d;
        if (fVar2 == null || (aVar = fVar2.f2373b) == null) {
            str = null;
        } else {
            str = aVar.f2334d;
        }
        if (AbstractC3159y.d(str, "Y")) {
            hVar2 = h.YES;
        } else {
            hVar2 = h.NO;
        }
        SharedStorage.f(sharedStorage, 0, h.YES, hVar3, hVar2, 1, null);
        ChoiceCmpCallback choiceCmpCallback = fVar.f8116b;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCCPAConsentGiven(fVar.f8115a.j(N7.a.PRIVACY_STRING));
        }
        AbstractC2829k.d(C2842q0.f31785a, C2812b0.b(), null, new e(fVar, isChecked, null), 2, null);
        if (C1895i.f14827b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1893g.f14818h);
            if (findFragmentByTag instanceof C1893g) {
                c1893g = (C1893g) findFragmentByTag;
            }
            if (c1893g != null) {
                c1893g.h();
            }
        }
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void m(TextView textView, final String str, String str2, boolean z8) {
        if (textView != null) {
            textView.setText(str2);
            H5.a.a(textView, z8);
            textView.setOnClickListener(new View.OnClickListener() { // from class: P7.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.l(d.this, str, view);
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        AbstractC3159y.i(dialog, "dialog");
        super.onCancel(dialog);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f8111w = (f) new ViewModelProvider(viewModelStore, new g()).get(f.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3851b, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…rivacy, container, false)");
        return inflate;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h hVar;
        h hVar2;
        E6.a aVar;
        TextView textView;
        String str;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f8101m = (LinearLayout) view.findViewById(I1.b.f3828q);
        this.f8102n = (TextView) view.findViewById(I1.b.f3779Z0);
        this.f8103o = (TextView) view.findViewById(I1.b.f3843w0);
        this.f8104p = (CheckBox) view.findViewById(I1.b.f3819n);
        this.f8105q = (Button) view.findViewById(I1.b.f3789d);
        this.f8106r = (CardView) view.findViewById(I1.b.f3780a);
        this.f8107s = (TextView) view.findViewById(I1.b.f3829q0);
        this.f8108t = (TextView) view.findViewById(I1.b.f3826p0);
        this.f8109u = (NestedScrollView) view.findViewById(I1.b.f3802h0);
        int i8 = I1.b.f3848z;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i8);
        this.f8110v = frameLayout;
        String str2 = null;
        if (C1895i.f14827b) {
            getChildFragmentManager().beginTransaction().add(i8, new C1893g(), C1893g.f14818h).addToBackStack(null).commit();
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        TextView textView2 = this.f8361b;
        if (textView2 != null) {
            f fVar = this.f8111w;
            if (fVar == null) {
                AbstractC3159y.y("viewModel");
                fVar = null;
            }
            String str3 = fVar.f8117c.f5522a;
            if (str3.length() == 0) {
                str3 = getString(I1.e.f3878c);
                AbstractC3159y.h(str3, "getString(R.string.ccpa_privacy_title)");
            }
            textView2.setText(str3);
        }
        f fVar2 = this.f8111w;
        if (fVar2 == null) {
            AbstractC3159y.y("viewModel");
            fVar2 = null;
        }
        if (fVar2.d().length() > 0) {
            TextView textView3 = this.f8107s;
            if (textView3 != null) {
                f fVar3 = this.f8111w;
                if (fVar3 == null) {
                    AbstractC3159y.y("viewModel");
                    fVar3 = null;
                }
                textView3.setText(K5.a.a(fVar3.d()));
            }
        } else {
            TextView textView4 = this.f8107s;
            if (textView4 != null) {
                textView4.setText(I1.e.f3877b);
            }
        }
        TextView textView5 = this.f8107s;
        if (textView5 != null) {
            f fVar4 = this.f8111w;
            if (fVar4 == null) {
                AbstractC3159y.y("viewModel");
                fVar4 = null;
            }
            fVar4.getClass();
            if (C1895i.f14827b) {
                str = fVar4.f8120f.f3203b.f3198c;
            } else {
                str = "";
            }
            textView5.append(str);
        }
        TextView textView6 = this.f8107s;
        if (textView6 != null) {
            textView6.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView = this.f8107s) != null) {
            textView.setLinkTextColor(ContextCompat.getColor(context, I1.a.f3723b));
        }
        LinearLayout linearLayout = this.f8101m;
        if (linearLayout != null) {
            f fVar5 = this.f8111w;
            if (fVar5 == null) {
                AbstractC3159y.y("viewModel");
                fVar5 = null;
            }
            H5.a.a(linearLayout, fVar5.e());
        }
        TextView textView7 = this.f8103o;
        f fVar6 = this.f8111w;
        if (fVar6 == null) {
            AbstractC3159y.y("viewModel");
            fVar6 = null;
        }
        String f8 = fVar6.f();
        f fVar7 = this.f8111w;
        if (fVar7 == null) {
            AbstractC3159y.y("viewModel");
            fVar7 = null;
        }
        String g8 = fVar7.g();
        f fVar8 = this.f8111w;
        if (fVar8 == null) {
            AbstractC3159y.y("viewModel");
            fVar8 = null;
        }
        m(textView7, f8, g8, fVar8.h());
        TextView textView8 = this.f8108t;
        f fVar9 = this.f8111w;
        if (fVar9 == null) {
            AbstractC3159y.y("viewModel");
            fVar9 = null;
        }
        String a8 = fVar9.a();
        f fVar10 = this.f8111w;
        if (fVar10 == null) {
            AbstractC3159y.y("viewModel");
            fVar10 = null;
        }
        String b8 = fVar10.b();
        f fVar11 = this.f8111w;
        if (fVar11 == null) {
            AbstractC3159y.y("viewModel");
            fVar11 = null;
        }
        m(textView8, a8, b8, fVar11.c());
        TextView textView9 = this.f8102n;
        f fVar12 = this.f8111w;
        if (fVar12 == null) {
            AbstractC3159y.y("viewModel");
            fVar12 = null;
        }
        String i9 = fVar12.i();
        f fVar13 = this.f8111w;
        if (fVar13 == null) {
            AbstractC3159y.y("viewModel");
            fVar13 = null;
        }
        String j8 = fVar13.j();
        f fVar14 = this.f8111w;
        if (fVar14 == null) {
            AbstractC3159y.y("viewModel");
            fVar14 = null;
        }
        m(textView9, i9, j8, fVar14.k());
        ImageView imageView = this.f8362c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: P7.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.k(d.this, view2);
                }
            });
            f fVar15 = this.f8111w;
            if (fVar15 == null) {
                AbstractC3159y.y("viewModel");
                fVar15 = null;
            }
            imageView.setContentDescription(fVar15.f8117c.f5527f);
        }
        CheckBox checkBox = this.f8104p;
        if (checkBox != null) {
            f fVar16 = this.f8111w;
            if (fVar16 == null) {
                AbstractC3159y.y("viewModel");
                fVar16 = null;
            }
            checkBox.setChecked(AbstractC3159y.d(fVar16.f8115a.a(2, 3), "Y"));
        }
        Button button = this.f8105q;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: P7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.n(d.this, view2);
                }
            });
        }
        J7.c cVar = this.f8369j;
        if (cVar != null) {
            Integer num = cVar.f5536g;
            if (num != null) {
                int intValue = num.intValue();
                view.setBackgroundColor(intValue);
                CardView cardView = this.f8106r;
                if (cardView != null) {
                    cardView.setCardBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f5530a;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                NestedScrollView nestedScrollView = this.f8109u;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue2);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = cVar.f5538i;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView10 = this.f8107s;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
                CheckBox checkBox2 = this.f8104p;
                if (checkBox2 != null) {
                    checkBox2.setTextColor(intValue3);
                }
                CheckBox checkBox3 = this.f8104p;
                if (checkBox3 != null) {
                    checkBox3.setButtonTintList(ColorStateList.valueOf(intValue3));
                }
            }
            Integer num4 = cVar.f5541l;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                TextView textView11 = this.f8107s;
                if (textView11 != null) {
                    textView11.setLinkTextColor(intValue4);
                }
                TextView textView12 = this.f8108t;
                if (textView12 != null) {
                    textView12.setTextColor(intValue4);
                }
                TextView textView13 = this.f8103o;
                if (textView13 != null) {
                    textView13.setTextColor(intValue4);
                }
                TextView textView14 = this.f8102n;
                if (textView14 != null) {
                    textView14.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f5544o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button2 = this.f8105q;
                if (button2 != null) {
                    button2.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f5542m;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button3 = this.f8105q;
                if (button3 != null) {
                    button3.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f8371l;
        if (typeface != null) {
            TextView textView15 = this.f8107s;
            if (textView15 != null) {
                textView15.setTypeface(typeface);
            }
            TextView textView16 = this.f8108t;
            if (textView16 != null) {
                textView16.setTypeface(typeface);
            }
            TextView textView17 = this.f8103o;
            if (textView17 != null) {
                textView17.setTypeface(typeface);
            }
            TextView textView18 = this.f8102n;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            CheckBox checkBox4 = this.f8104p;
            if (checkBox4 != null) {
                checkBox4.setTypeface(typeface);
            }
            Button button4 = this.f8105q;
            if (button4 != null) {
                button4.setTypeface(typeface);
            }
        }
        f fVar17 = this.f8111w;
        if (fVar17 == null) {
            AbstractC3159y.y("viewModel");
            fVar17 = null;
        }
        SharedStorage sharedStorage = fVar17.f8115a;
        if (AbstractC3159y.d(sharedStorage.a(2, 3), "Y")) {
            hVar = h.YES;
        } else {
            hVar = h.NO;
        }
        h hVar3 = hVar;
        E6.f fVar18 = fVar17.f8118d;
        if (fVar18 != null && (aVar = fVar18.f2373b) != null) {
            str2 = aVar.f2334d;
        }
        if (AbstractC3159y.d(str2, "Y")) {
            hVar2 = h.YES;
        } else {
            hVar2 = h.NO;
        }
        SharedStorage.f(sharedStorage, 0, h.YES, hVar3, hVar2, 1, null);
    }
}
