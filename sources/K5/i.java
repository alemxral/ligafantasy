package k5;

import E4.j;
import X4.C1505o;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import g6.n;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import l5.C3326n;

/* loaded from: classes5.dex */
public final class i extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f33532a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f33533b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f33534c;

    /* renamed from: d, reason: collision with root package name */
    private ProgressBar f33535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View itemView) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.tv_nombre_app);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.tv_nombre_app)");
        this.f33532a = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_size_download);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_size_download)");
        this.f33533b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_date_download);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_date_download)");
        this.f33534c = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.progressbar_downloading);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.….progressbar_downloading)");
        this.f33535d = (ProgressBar) findViewById4;
        TextView textView = this.f33532a;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        this.f33533b.setTypeface(aVar.u());
        this.f33534c.setTypeface(aVar.u());
    }

    public final void a(File item, Context context) {
        AbstractC3159y.i(item, "item");
        if (context != null) {
            C3326n a8 = C3326n.f34490t.a(context);
            a8.a();
            String name = item.getName();
            AbstractC3159y.h(name, "item.name");
            C1505o Y7 = a8.Y(name);
            a8.g();
            this.f33532a.setText(item.getName());
            this.f33533b.setText(new N4.g().c(item.length()));
            if (Y7 != null && Y7.k() == 0) {
                this.f33532a.setTypeface(E4.j.f2272g.u());
            } else {
                this.f33532a.setTypeface(E4.j.f2272g.u());
            }
            TextView textView = this.f33533b;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            this.f33534c.setTypeface(aVar.u());
            if (Y7 != null && Y7.Z() > 0 && Y7.Z() < 100) {
                TextView textView2 = this.f33533b;
                Y y8 = Y.f33752a;
                Locale locale = Locale.getDefault();
                AbstractC3159y.f(Y7);
                String format = String.format(locale, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Y7.Z())}, 1));
                AbstractC3159y.h(format, "format(...)");
                textView2.setText(format);
                this.f33534c.setVisibility(8);
                this.f33535d.setProgress(Y7.Z());
                this.f33535d.setVisibility(0);
                return;
            }
            K4.a h8 = aVar.h();
            if (h8 != null && Y7 != null && n.s(h8.b(), Y7.Y(), true) && Y7.e0() > 0 && h8.e() == Y7.e0()) {
                this.f33535d.setIndeterminate(true);
                this.f33535d.setVisibility(0);
                this.f33534c.setText(R.string.installing);
                this.f33533b.setText("");
                return;
            }
            long lastModified = item.lastModified();
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
            this.f33534c.setVisibility(0);
            this.f33534c.setText(dateTimeInstance.format(new Date(lastModified)));
            this.f33533b.setText(new N4.g().c(item.length()));
            this.f33535d.setVisibility(4);
        }
    }
}
