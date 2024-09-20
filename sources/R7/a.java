package R7;

import R7.a;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f8861a;

    /* renamed from: b, reason: collision with root package name */
    public b f8862b;

    /* renamed from: c, reason: collision with root package name */
    public String f8863c;

    /* renamed from: d, reason: collision with root package name */
    public String f8864d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f8865e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f8866f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f8867g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f8868h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f8869i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f8870j;

    /* renamed from: R7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0182a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f8871a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8872b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f8873c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f8874d;

        /* renamed from: e, reason: collision with root package name */
        public final View f8875e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0182a(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            this.f8871a = num;
            this.f8872b = num2;
            this.f8873c = typeface;
            View findViewById = rootView.findViewById(I1.b.f3771V0);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_non_switch_label)");
            this.f8874d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(I1.b.f3732C);
            AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f8875e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void b(R7.d dVar);

        void d(R7.d dVar);
    }

    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f8876a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8877b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f8878c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f8879d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            this.f8876a = num;
            this.f8877b = num2;
            this.f8878c = typeface;
            View findViewById = rootView.findViewById(I1.b.f3821n1);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_switch_description)");
            this.f8879d = (TextView) findViewById;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f8880a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8881b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f8882c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f8883d;

        /* renamed from: e, reason: collision with root package name */
        public final View f8884e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            this.f8880a = num;
            this.f8881b = num2;
            this.f8882c = typeface;
            View findViewById = rootView.findViewById(I1.b.f3824o1);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_switch_label)");
            this.f8883d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(I1.b.f3732C);
            AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f8884e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final b f8885a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8886b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f8887c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f8888d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f8889e;

        /* renamed from: f, reason: collision with root package name */
        public final Typeface f8890f;

        /* renamed from: g, reason: collision with root package name */
        public final TextView f8891g;

        /* renamed from: h, reason: collision with root package name */
        public final SwitchCompat f8892h;

        /* renamed from: i, reason: collision with root package name */
        public final View f8893i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View rootView, b listener, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            AbstractC3159y.i(listener, "listener");
            this.f8885a = listener;
            this.f8886b = num;
            this.f8887c = num2;
            this.f8888d = num3;
            this.f8889e = num4;
            this.f8890f = typeface;
            View findViewById = rootView.findViewById(I1.b.f3827p1);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_switch_name)");
            this.f8891g = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(I1.b.f3805i0);
            AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.switch_item)");
            this.f8892h = (SwitchCompat) findViewById2;
            View findViewById3 = rootView.findViewById(I1.b.f3744I);
            AbstractC3159y.h(findViewById3, "rootView.findViewById(R.id.line_item)");
            this.f8893i = findViewById3;
        }

        public static final void a(e this$0, R7.d switchItem, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(switchItem, "$switchItem");
            this$0.f8885a.b(switchItem);
        }

        public static final void b(R7.d switchItem, e this$0, String tag, CompoundButton compoundButton, boolean z8) {
            AbstractC3159y.i(switchItem, "$switchItem");
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(tag, "$tag");
            switchItem.f8900b = Boolean.valueOf(z8);
            this$0.f8885a.d(switchItem);
            boolean z9 = switchItem.f8903e;
            SwitchCompat switchCompat = this$0.f8892h;
            if (switchCompat.isChecked() || !z9) {
                tag = "";
            }
            switchCompat.setText(tag);
        }

        public final void c(final R7.d switchItem, final String tag) {
            boolean booleanValue;
            String str;
            AbstractC3159y.i(switchItem, "switchItem");
            AbstractC3159y.i(tag, "tag");
            TextView textView = this.f8891g;
            String name = switchItem.f8899a.f1048b;
            Integer num = switchItem.f8905g;
            String noun = switchItem.f8904f;
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(noun, "noun");
            if (num != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(" (");
                sb.append(num);
                sb.append(' ');
                String lowerCase = noun.toLowerCase(Locale.ROOT);
                AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
                sb.append(')');
                name = sb.toString();
            }
            textView.setText(name);
            Integer num2 = this.f8886b;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: R7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.e.a(a.e.this, switchItem, view);
                }
            });
            Typeface typeface = this.f8890f;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            SwitchCompat switchCompat = this.f8892h;
            if (switchItem.f8900b == null) {
                switchCompat.setVisibility(8);
            } else {
                switchCompat.setVisibility(0);
                Boolean bool = switchItem.f8900b;
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                switchCompat.setChecked(booleanValue);
            }
            switchCompat.setContentDescription(switchItem.f8899a.f1048b);
            boolean z8 = switchItem.f8903e;
            SwitchCompat switchCompat2 = this.f8892h;
            if (!switchCompat2.isChecked() && z8) {
                str = tag;
            } else {
                str = "";
            }
            switchCompat2.setText(str);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: R7.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                    a.e.b(d.this, this, tag, compoundButton, z9);
                }
            });
            Integer num3 = this.f8887c;
            if (num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = this.f8888d;
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{intValue, intValue2}));
                    switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{ColorUtils.setAlphaComponent(intValue, 128), ColorUtils.setAlphaComponent(intValue2, 128)}));
                }
            }
            Integer num5 = this.f8886b;
            if (num5 != null) {
                switchCompat.setTextColor(num5.intValue());
            }
            Typeface typeface2 = this.f8890f;
            if (typeface2 != null) {
                switchCompat.setTypeface(typeface2);
            }
            Integer num6 = this.f8889e;
            if (num6 != null) {
                this.f8893i.setBackgroundColor(num6.intValue());
            }
        }
    }

    public /* synthetic */ a(List list, b bVar, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2, int i8) {
        this(list, bVar, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? null : num2, (i8 & 64) != 0 ? null : num3, (i8 & 128) != 0 ? null : num4, (i8 & 256) != 0 ? null : typeface, (i8 & 512) != 0 ? null : typeface2);
    }

    public final void a() {
        this.f8861a.add(0, new R7.d(new B6.f(0, null, 3), null, f.DESCRIPTION, null, false, null, null, 122));
    }

    public final void b(List switchItems, boolean z8) {
        AbstractC3159y.i(switchItems, "switchItems");
        this.f8861a = switchItems;
        if (!z8) {
            a();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8861a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return ((R7.d) this.f8861a.get(i8)).f8901c.f8926a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).c((R7.d) this.f8861a.get(i8), this.f8864d);
            return;
        }
        if (holder instanceof c) {
            c cVar = (c) holder;
            String descriptionText = this.f8863c;
            cVar.getClass();
            AbstractC3159y.i(descriptionText, "descriptionText");
            TextView textView = cVar.f8879d;
            textView.setText(descriptionText);
            Integer num = cVar.f8876a;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Typeface typeface = cVar.f8878c;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            Integer num2 = cVar.f8877b;
            if (num2 != null) {
                int intValue = num2.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(2.0f);
                gradientDrawable.setStroke(4, intValue);
                textView.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        if (holder instanceof d) {
            d dVar = (d) holder;
            String labelText = ((R7.d) this.f8861a.get(i8)).f8904f;
            dVar.getClass();
            AbstractC3159y.i(labelText, "labelText");
            TextView textView2 = dVar.f8883d;
            textView2.setText(labelText);
            Integer num3 = dVar.f8880a;
            if (num3 != null) {
                textView2.setTextColor(num3.intValue());
            }
            Typeface typeface2 = dVar.f8882c;
            if (typeface2 != null) {
                textView2.setTypeface(typeface2);
            }
            Integer num4 = dVar.f8881b;
            if (num4 != null) {
                dVar.f8884e.setBackgroundColor(num4.intValue());
                return;
            }
            return;
        }
        if (holder instanceof C0182a) {
            C0182a c0182a = (C0182a) holder;
            String labelText2 = ((R7.d) this.f8861a.get(i8)).f8904f;
            c0182a.getClass();
            AbstractC3159y.i(labelText2, "labelText");
            TextView textView3 = c0182a.f8874d;
            textView3.setText(labelText2);
            Integer num5 = c0182a.f8871a;
            if (num5 != null) {
                textView3.setTextColor(num5.intValue());
            }
            Typeface typeface3 = c0182a.f8873c;
            if (typeface3 != null) {
                textView3.setTypeface(typeface3);
            }
            Integer num6 = c0182a.f8872b;
            if (num6 != null) {
                c0182a.f8875e.setBackgroundColor(num6.intValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        if (i8 == 1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3868s, parent, false);
            AbstractC3159y.h(view, "view");
            return new c(view, this.f8865e, this.f8868h, this.f8870j);
        }
        if (i8 == 2) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3869t, parent, false);
            AbstractC3159y.h(view2, "view");
            return new d(view2, this.f8865e, this.f8868h, this.f8869i);
        }
        if (i8 == 3) {
            View view3 = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3865p, parent, false);
            AbstractC3159y.h(view3, "view");
            return new C0182a(view3, this.f8865e, this.f8868h, this.f8870j);
        }
        View view4 = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3867r, parent, false);
        AbstractC3159y.h(view4, "view");
        return new e(view4, this.f8862b, this.f8865e, this.f8866f, this.f8867g, this.f8868h, this.f8870j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).f8892h.setOnCheckedChangeListener(null);
        }
        super.onViewRecycled(holder);
    }

    public a(List switchItems, b listener, String descriptionItemText, String switchTagText, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2) {
        AbstractC3159y.i(switchItems, "switchItems");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(descriptionItemText, "descriptionItemText");
        AbstractC3159y.i(switchTagText, "switchTagText");
        this.f8861a = switchItems;
        this.f8862b = listener;
        this.f8863c = descriptionItemText;
        this.f8864d = switchTagText;
        this.f8865e = num;
        this.f8866f = num2;
        this.f8867g = num3;
        this.f8868h = num4;
        this.f8869i = typeface;
        this.f8870j = typeface2;
        if (descriptionItemText.length() > 0) {
            a();
        }
    }
}
