package Q7;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class f extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final View f8382a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f8383b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8384c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8385d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8386e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8387f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f8388g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f8389h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f8390i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f8391j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f8392k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View rootView) {
        super(rootView);
        AbstractC3159y.i(rootView, "rootView");
        View findViewById = rootView.findViewById(I1.b.f3846y);
        AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.disclosure_divider)");
        this.f8382a = findViewById;
        View findViewById2 = rootView.findViewById(I1.b.f3739F0);
        AbstractC3159y.h(findViewById2, "rootView.findViewById(R.…isclosure_purposes_label)");
        this.f8383b = (TextView) findViewById2;
        View findViewById3 = rootView.findViewById(I1.b.f3849z0);
        AbstractC3159y.h(findViewById3, "rootView.findViewById(R.…_disclosure_domain_label)");
        this.f8384c = (TextView) findViewById3;
        View findViewById4 = rootView.findViewById(I1.b.f3731B0);
        AbstractC3159y.h(findViewById4, "rootView.findViewById(R.…disclosure_max_age_label)");
        this.f8385d = (TextView) findViewById4;
        View findViewById5 = rootView.findViewById(I1.b.f3743H0);
        AbstractC3159y.h(findViewById5, "rootView.findViewById(R.…tv_disclosure_type_label)");
        this.f8386e = (TextView) findViewById5;
        View findViewById6 = rootView.findViewById(I1.b.f3735D0);
        AbstractC3159y.h(findViewById6, "rootView.findViewById(R.…tv_disclosure_name_label)");
        this.f8387f = (TextView) findViewById6;
        View findViewById7 = rootView.findViewById(I1.b.f3737E0);
        AbstractC3159y.h(findViewById7, "rootView.findViewById(R.id.tv_disclosure_purposes)");
        this.f8388g = (TextView) findViewById7;
        View findViewById8 = rootView.findViewById(I1.b.f3847y0);
        AbstractC3159y.h(findViewById8, "rootView.findViewById(R.id.tv_disclosure_domain)");
        this.f8389h = (TextView) findViewById8;
        View findViewById9 = rootView.findViewById(I1.b.f3729A0);
        AbstractC3159y.h(findViewById9, "rootView.findViewById(R.id.tv_disclosure_max_age)");
        this.f8390i = (TextView) findViewById9;
        View findViewById10 = rootView.findViewById(I1.b.f3741G0);
        AbstractC3159y.h(findViewById10, "rootView.findViewById(R.id.tv_disclosure_type)");
        this.f8391j = (TextView) findViewById10;
        View findViewById11 = rootView.findViewById(I1.b.f3733C0);
        AbstractC3159y.h(findViewById11, "rootView.findViewById(R.id.tv_disclosure_name)");
        this.f8392k = (TextView) findViewById11;
    }
}
