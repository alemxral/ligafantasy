package F4;

import E4.j;
import L4.h;
import android.R;
import android.app.AlertDialog;
import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.net.nsd.NsdServiceInfo;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a1 extends r {

    /* renamed from: p, reason: collision with root package name */
    private TextView f2569p;

    /* renamed from: q, reason: collision with root package name */
    private ProgressBar f2570q;

    /* renamed from: r, reason: collision with root package name */
    private AlertDialog f2571r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f2572s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f2573t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f2574u;

    /* renamed from: v, reason: collision with root package name */
    private LinearLayout f2575v;

    /* renamed from: w, reason: collision with root package name */
    private LinearLayout.LayoutParams f2576w;

    /* loaded from: classes4.dex */
    public static final class a implements J4.j {
        a() {
        }

        @Override // J4.j
        public void a(View view, int i8) {
            a1.this.Y0();
            j.a aVar = E4.j.f2272g;
            L4.h l8 = aVar.l();
            AbstractC3159y.f(l8);
            int size = l8.g().size();
            if (size > 0 && size > i8) {
                L4.h l9 = aVar.l();
                AbstractC3159y.f(l9);
                Object obj = l9.g().get(i8);
                AbstractC3159y.h(obj, "UptodownCoreApplication.…esInfoAvailable[position]");
                L4.h l10 = aVar.l();
                AbstractC3159y.f(l10);
                l10.l((NsdServiceInfo) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(a1 this$0, K4.c fileTransferInfo) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(fileTransferInfo, "$fileTransferInfo");
        this$0.j1(fileTransferInfo);
    }

    private final void Q0() {
        View view = View.inflate(this, E4.f.f2191o, null);
        TextView textView = (TextView) view.findViewById(E4.e.f2044H1);
        this.f2569p = textView;
        if (textView != null) {
            textView.setTypeface(E4.j.f2272g.t());
        }
        ProgressBar progressBar = (ProgressBar) view.findViewById(E4.e.f2042H);
        this.f2570q = progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView2 = (TextView) view.findViewById(E4.e.f2166w0);
        this.f2574u = textView2;
        AbstractC3159y.f(textView2);
        j.a aVar = E4.j.f2272g;
        textView2.setTypeface(aVar.t());
        TextView textView3 = this.f2574u;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a1.R0(a1.this, view2);
                }
            });
        }
        TextView textView4 = (TextView) view.findViewById(E4.e.f2068P1);
        this.f2572s = textView4;
        if (textView4 != null) {
            textView4.setTypeface(aVar.u());
        }
        TextView textView5 = (TextView) view.findViewById(E4.e.f2067P0);
        this.f2573t = textView5;
        if (textView5 != null) {
            textView5.setTypeface(aVar.t());
        }
        AbstractC3159y.h(view, "view");
        i1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(a1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Y0();
        L4.c o8 = E4.j.f2272g.o();
        AbstractC3159y.f(o8);
        o8.r();
        this$0.d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(a1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Y0();
        this$0.d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(a1 this$0, String filename, String str) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(filename, "$filename");
        this$0.Y0();
        if (new N4.f().o(filename)) {
            this$0.m1(filename);
            return;
        }
        this$0.I(this$0.getString(E4.h.f2224Y) + filename + ' ' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(a1 this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Y0();
        this$0.p1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0() {
        LinearLayout linearLayout = this.f2575v;
        if (linearLayout == null) {
            AlertDialog alertDialog = this.f2571r;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.f2571r = null;
            return;
        }
        AbstractC3159y.f(linearLayout);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f2575v;
        AbstractC3159y.f(linearLayout2);
        linearLayout2.setVisibility(8);
    }

    private final boolean Z0() {
        AlertDialog alertDialog = this.f2571r;
        if (alertDialog != null && alertDialog.isShowing()) {
            return true;
        }
        LinearLayout linearLayout = this.f2575v;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(a1 this$0, String msg) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(msg, "$msg");
        this$0.Y0();
        this$0.I(msg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(a1 this$0, NsdServiceInfo nsdServiceInfo) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(nsdServiceInfo, "$nsdServiceInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.getString(E4.h.f2222W));
        h.a aVar = L4.h.f6447h;
        String serviceName = nsdServiceInfo.getServiceName();
        AbstractC3159y.h(serviceName, "nsdServiceInfo.serviceName");
        sb.append(aVar.c(serviceName));
        Toast.makeText(this$0, sb.toString(), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(a1 this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Y0();
        this$0.I(str);
        this$0.d1();
    }

    private final void i1(View view) {
        Window window;
        AlertDialog alertDialog;
        LinearLayout linearLayout = this.f2575v;
        if (linearLayout == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(view);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            this.f2571r = create;
            if (create != null) {
                window = create.getWindow();
            } else {
                window = null;
            }
            AbstractC3159y.f(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (!isFinishing() && (alertDialog = this.f2571r) != null) {
                alertDialog.show();
                return;
            }
            return;
        }
        AbstractC3159y.f(linearLayout);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f2575v;
        AbstractC3159y.f(linearLayout2);
        linearLayout2.addView(view, this.f2576w);
        LinearLayout linearLayout3 = this.f2575v;
        AbstractC3159y.f(linearLayout3);
        linearLayout3.setVisibility(0);
    }

    private final void j1(final K4.c cVar) {
        Y0();
        View view = View.inflate(this, E4.f.f2184h, null);
        View findViewById = view.findViewById(E4.e.f2170x1);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.tv_msg_confirm)");
        TextView textView = (TextView) findViewById;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
        String string = getString(E4.h.f2221V);
        AbstractC3159y.h(string, "getString(R.string.msg_confirm_receive_file)");
        String format = String.format(string, Arrays.copyOf(new Object[]{cVar.f(), cVar.e()}, 2));
        AbstractC3159y.h(format, "format(format, *args)");
        textView.setText(format);
        View findViewById2 = view.findViewById(E4.e.f2034E0);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.tv_confirm_receive)");
        TextView textView2 = (TextView) findViewById2;
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.k1(a1.this, cVar, view2);
            }
        });
        View findViewById3 = view.findViewById(E4.e.f2160u0);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView3 = (TextView) findViewById3;
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.l1(a1.this, view2);
            }
        });
        AbstractC3159y.h(view, "view");
        i1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(a1 this$0, K4.c fileTransferInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(fileTransferInfo, "$fileTransferInfo");
        this$0.Y0();
        this$0.r1(fileTransferInfo.e());
        L4.c o8 = E4.j.f2272g.o();
        AbstractC3159y.f(o8);
        o8.o(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(a1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Y0();
        L4.c o8 = E4.j.f2272g.o();
        AbstractC3159y.f(o8);
        o8.o(false);
        this$0.d1();
    }

    private final void m1(final String str) {
        Y0();
        View view = View.inflate(this, E4.f.f2190n, null);
        View findViewById = view.findViewById(E4.e.f2053K1);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.tv_receiving_finished)");
        TextView textView = (TextView) findViewById;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        textView.setText(str);
        View findViewById2 = view.findViewById(E4.e.f2128j1);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.tv_install)");
        TextView textView2 = (TextView) findViewById2;
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.n1(a1.this, str, view2);
            }
        });
        View findViewById3 = view.findViewById(E4.e.f2160u0);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView3 = (TextView) findViewById3;
        textView3.setTypeface(aVar.t());
        textView3.setText(getString(R.string.ok));
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.o1(a1.this, view2);
            }
        });
        AbstractC3159y.h(view, "view");
        i1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(a1 this$0, String filename, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(filename, "$filename");
        E4.i.f(new E4.i(this$0), new File(new N4.f().f(this$0), filename), null, false, 6, null);
        this$0.Y0();
        this$0.d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(a1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Y0();
        this$0.d1();
    }

    private final void p1() {
        Y0();
        View view = View.inflate(this, E4.f.f2190n, null);
        View findViewById = view.findViewById(E4.e.f2053K1);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.tv_receiving_finished)");
        TextView textView = (TextView) findViewById;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        textView.setText(getString(E4.h.f2235e0));
        View findViewById2 = view.findViewById(E4.e.f2128j1);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.tv_install)");
        ((TextView) findViewById2).setVisibility(8);
        View findViewById3 = view.findViewById(E4.e.f2160u0);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.tv_cancel)");
        TextView textView2 = (TextView) findViewById3;
        textView2.setTypeface(aVar.t());
        textView2.setText(getString(R.string.ok));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a1.q1(a1.this, view2);
            }
        });
        AbstractC3159y.h(view, "view");
        i1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q1(a1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Y0();
        this$0.d1();
    }

    private final void r1(String str) {
        TextView textView;
        Q0();
        TextView textView2 = this.f2572s;
        if (textView2 != null) {
            textView2.setText(getString(E4.h.f2229b0));
        }
        if (str != null && (textView = this.f2573t) != null) {
            textView.setText(str);
        }
    }

    private final void s1() {
        String str;
        TextView textView;
        NsdServiceInfo e8;
        Q0();
        TextView textView2 = this.f2572s;
        if (textView2 != null) {
            textView2.setText(getString(E4.h.f2249l0));
        }
        L4.h l8 = E4.j.f2272g.l();
        if (l8 != null && (e8 = l8.e()) != null) {
            str = e8.getServiceName();
        } else {
            str = null;
        }
        if (str != null && (textView = this.f2573t) != null) {
            textView.setText(L4.h.f6447h.c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u1(a1 this$0, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        TextView textView = this$0.f2569p;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        ProgressBar progressBar = this$0.f2570q;
        if (progressBar != null) {
            progressBar.setIndeterminate(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(a1 this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.s1();
        ProgressBar progressBar = this$0.f2570q;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(a1 this$0, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        ProgressBar progressBar = this$0.f2570q;
        if (progressBar != null) {
            progressBar.setProgress(i8);
        }
        TextView textView = this$0.f2569p;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i8);
            sb.append('%');
            textView.setText(sb.toString());
        }
    }

    public final void O0(final K4.c fileTransferInfo) {
        AbstractC3159y.i(fileTransferInfo, "fileTransferInfo");
        runOnUiThread(new Runnable() { // from class: F4.X0
            @Override // java.lang.Runnable
            public final void run() {
                a1.P0(a1.this, fileTransferInfo);
            }
        });
    }

    public final void S0() {
        Integer num;
        ArrayList g8;
        j.a aVar = E4.j.f2272g;
        L4.h l8 = aVar.l();
        if (l8 != null && (g8 = l8.g()) != null) {
            num = Integer.valueOf(g8.size());
        } else {
            num = null;
        }
        AbstractC3159y.f(num);
        if (num.intValue() > 0) {
            a aVar2 = new a();
            View view = View.inflate(this, E4.f.f2180d, null);
            L4.h l9 = aVar.l();
            AbstractC3159y.f(l9);
            H4.a aVar3 = new H4.a(l9.g(), aVar2);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(E4.e.f2096Z);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
            }
            recyclerView.setAdapter(aVar3);
            View findViewById = view.findViewById(E4.e.f2160u0);
            AbstractC3159y.h(findViewById, "view.findViewById(R.id.tv_cancel)");
            TextView textView = (TextView) findViewById;
            textView.setTypeface(aVar.t());
            textView.setOnClickListener(new View.OnClickListener() { // from class: F4.P0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a1.T0(a1.this, view2);
                }
            });
            AbstractC3159y.h(view, "view");
            i1(view);
            return;
        }
        I(getString(E4.h.f2237f0));
    }

    public final void U0(final String filename, final String str) {
        AbstractC3159y.i(filename, "filename");
        runOnUiThread(new Runnable() { // from class: F4.V0
            @Override // java.lang.Runnable
            public final void run() {
                a1.V0(a1.this, filename, str);
            }
        });
    }

    public final void W0() {
        runOnUiThread(new Runnable() { // from class: F4.S0
            @Override // java.lang.Runnable
            public final void run() {
                a1.X0(a1.this);
            }
        });
        E4.j.f2272g.b();
    }

    public final void b1(final String msg) {
        AbstractC3159y.i(msg, "msg");
        runOnUiThread(new Runnable() { // from class: F4.R0
            @Override // java.lang.Runnable
            public final void run() {
                a1.c1(a1.this, msg);
            }
        });
    }

    public abstract void d1();

    public void e1(final NsdServiceInfo nsdServiceInfo) {
        AbstractC3159y.i(nsdServiceInfo, "nsdServiceInfo");
        runOnUiThread(new Runnable() { // from class: F4.Q0
            @Override // java.lang.Runnable
            public final void run() {
                a1.f1(a1.this, nsdServiceInfo);
            }
        });
    }

    public final void g1(final String str) {
        runOnUiThread(new Runnable() { // from class: F4.U0
            @Override // java.lang.Runnable
            public final void run() {
                a1.h1(a1.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        L4.h l8;
        super.onResume();
        j.a aVar = E4.j.f2272g;
        L4.c o8 = aVar.o();
        if (o8 != null && !o8.j()) {
            Application application = getApplication();
            AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
            if (!((E4.j) application).I().get() && (l8 = aVar.l()) != null) {
                l8.d();
            }
        }
        if (Z0()) {
            if (aVar.p()) {
                aVar.F(false);
                W0();
                return;
            }
            if (aVar.i() != null) {
                String i8 = aVar.i();
                AbstractC3159y.f(i8);
                U0(i8, aVar.j());
                aVar.y(null);
                aVar.z(null);
                return;
            }
            if (aVar.r() != null) {
                g1(aVar.r());
                aVar.H(null);
            } else if (aVar.q() != null) {
                String q8 = aVar.q();
                AbstractC3159y.f(q8);
                b1(q8);
                aVar.G(null);
            }
        }
    }

    public final void t1(final boolean z8) {
        runOnUiThread(new Runnable() { // from class: F4.W0
            @Override // java.lang.Runnable
            public final void run() {
                a1.u1(a1.this, z8);
            }
        });
    }

    public final void v1() {
        runOnUiThread(new Runnable() { // from class: F4.K0
            @Override // java.lang.Runnable
            public final void run() {
                a1.w1(a1.this);
            }
        });
    }

    public final void x1(final int i8) {
        runOnUiThread(new Runnable() { // from class: F4.T0
            @Override // java.lang.Runnable
            public final void run() {
                a1.y1(a1.this, i8);
            }
        });
    }

    public void a1() {
    }
}
