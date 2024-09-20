package com.uptodown.activities;

import E4.j;
import L5.InterfaceC1227k;
import X4.C1503m;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.activities.InformationActivity;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3323k;

/* loaded from: classes4.dex */
public final class InformationActivity extends AbstractActivityC2489a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28285O = L5.l.b(new a());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.I invoke() {
            return T4.I.c(InformationActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(InformationActivity.this, R.color.main_blue));
            ds.setTypeface(E4.j.f2272g.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28288a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    private final T4.I b3() {
        return (T4.I) this.f28285O.getValue();
    }

    private final void c3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            b3().f10129c.setNavigationIcon(drawable);
            b3().f10129c.setNavigationContentDescription(getString(R.string.back));
        }
        b3().f10129c.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.d3(InformationActivity.this, view);
            }
        });
        TextView textView = b3().f10136j;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        b3().f10130d.setTypeface(aVar.u());
        b3().f10131e.setTypeface(aVar.u());
        b3().f10132f.setTypeface(aVar.u());
        b3().f10134h.setTypeface(aVar.u());
        b3().f10135i.setTypeface(aVar.u());
        b3().f10133g.setTypeface(aVar.u());
        TextView textView2 = b3().f10133g;
        String string = getString(R.string.information_activity_dev_on_board_more_info);
        AbstractC3159y.h(string, "getString(R.string.infor…y_dev_on_board_more_info)");
        textView2.setText(f3(string));
        b3().f10133g.setOnClickListener(new View.OnClickListener() { // from class: A4.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.e3(InformationActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(InformationActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(InformationActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        String string = this$0.getString(R.string.url_dev_on_board);
        AbstractC3159y.h(string, "getString(R.string.url_dev_on_board)");
        String string2 = this$0.getString(R.string.support_title);
        AbstractC3159y.h(string2, "getString(R.string.support_title)");
        new C3323k().q(this$0, string, string2);
    }

    private final SpannableStringBuilder f3(String str) {
        List<C1503m> a8 = C1503m.f12631f.a(str, "\\[a](.*?)\\[/a]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new g6.j("\\[a](.*?)\\[/a]").g(str, c.f28288a));
        for (C1503m c1503m : a8) {
            int S7 = g6.n.S(spannableStringBuilder, c1503m.d(), 0, false, 6, null);
            int length = c1503m.d().length() + S7;
            if (S7 >= 0) {
                spannableStringBuilder.setSpan(new b(), S7, length, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(b3().getRoot());
        c3();
    }
}
