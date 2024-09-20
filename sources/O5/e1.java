package o5;

import X4.C1496f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;

/* loaded from: classes5.dex */
public final class e1 extends AbstractC3554k {

    /* renamed from: d, reason: collision with root package name */
    private final T4.H0 f36753d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f36754e;

    /* renamed from: f, reason: collision with root package name */
    private final W4.M f36755f;

    /* renamed from: g, reason: collision with root package name */
    private a f36756g;

    /* loaded from: classes5.dex */
    public enum a {
        DOWNLOAD,
        OPEN,
        INSTALLING
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36761a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.INSTALLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36761a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e1(T4.H0 r3, android.content.Context r4, W4.M r5) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
            android.widget.RelativeLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
            r2.<init>(r0, r4)
            r2.f36753d = r3
            r2.f36754e = r4
            r2.f36755f = r5
            o5.e1$a r4 = o5.e1.a.DOWNLOAD
            r2.f36756g = r4
            android.widget.RelativeLayout r4 = r3.f10120h
            o5.b1 r5 = new o5.b1
            r5.<init>()
            r4.setOnClickListener(r5)
            android.widget.RelativeLayout r4 = r3.f10120h
            o5.c1 r5 = new o5.c1
            r5.<init>()
            r4.setOnLongClickListener(r5)
            android.widget.RelativeLayout r4 = r3.f10118f
            o5.d1 r5 = new o5.d1
            r5.<init>()
            r4.setOnClickListener(r5)
            android.widget.TextView r4 = r3.f10122j
            E4.j$a r5 = E4.j.f2272g
            android.graphics.Typeface r0 = r5.t()
            r4.setTypeface(r0)
            android.widget.TextView r4 = r3.f10123k
            android.graphics.Typeface r0 = r5.t()
            r4.setTypeface(r0)
            android.widget.TextView r4 = r3.f10126n
            android.graphics.Typeface r0 = r5.u()
            r4.setTypeface(r0)
            android.widget.TextView r3 = r3.f10125m
            android.graphics.Typeface r4 = r5.t()
            r3.setTypeface(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.e1.<init>(T4.H0, android.content.Context, W4.M):void");
    }

    private final boolean A(X4.O o8) {
        if (o8.j() != null) {
            File g8 = new C3329q().g(this.f36754e);
            String j8 = o8.j();
            AbstractC3159y.f(j8);
            return new File(g8, j8).exists();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(e1 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36755f != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36755f.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(e1 this$0, View it) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36755f != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            W4.M m8 = this$0.f36755f;
            AbstractC3159y.h(it, "it");
            m8.b(it, bindingAdapterPosition);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(e1 this$0, View view) {
        W4.M m8;
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            int i8 = b.f36761a[this$0.f36756g.ordinal()];
            if (i8 != 1) {
                if (i8 == 2 && (m8 = this$0.f36755f) != null) {
                    m8.d(this$0.getBindingAdapterPosition());
                    return;
                }
                return;
            }
            W4.M m9 = this$0.f36755f;
            if (m9 != null) {
                m9.c(this$0.getBindingAdapterPosition());
            }
        }
    }

    private final boolean m(C1496f c1496f) {
        PackageManager packageManager = this.f36754e.getPackageManager();
        AbstractC3159y.h(packageManager, "context.packageManager");
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        ApplicationInfo a8 = N4.q.a(packageManager, Q8, 0);
        if (c1496f.i() != 0 || !a8.enabled) {
            return false;
        }
        return true;
    }

    private final void o(ProgressBar progressBar) {
        progressBar.setVisibility(8);
    }

    private final void p(X4.O o8, TextView textView) {
        if (o8 != null && o8.f() == 0) {
            textView.setText(this.f36754e.getString(R.string.status_download_update));
            textView.setTypeface(E4.j.f2272g.t());
            textView.setTextColor(ContextCompat.getColor(this.f36754e, R.color.white));
            textView.setBackground(ContextCompat.getDrawable(this.f36754e, R.drawable.ripple_install_button));
        } else {
            textView.setText(this.f36754e.getString(R.string.status_download_installed));
            textView.setTextColor(ContextCompat.getColor(this.f36754e, R.color.download_installed_status));
            textView.setBackground(ContextCompat.getDrawable(this.f36754e, R.drawable.bg_status_download_installed));
        }
        textView.setVisibility(0);
    }

    private final void q(String str, TextView textView) {
        if (new C3319g().r(str, this.f36754e)) {
            C3326n a8 = C3326n.f34490t.a(this.f36754e);
            a8.a();
            X4.O u02 = a8.u0(str);
            C1496f S7 = a8.S(str);
            a8.g();
            if (S7 != null) {
                if (m(S7)) {
                    p(u02, textView);
                } else {
                    textView.setVisibility(8);
                }
            }
        }
    }

    private final void r() {
        this.f36753d.f10119g.setVisibility(0);
        this.f36753d.f10114b.setVisibility(0);
        this.f36753d.f10124l.setVisibility(0);
        this.f36753d.f10122j.setVisibility(8);
        this.f36753d.f10126n.setVisibility(0);
    }

    private final void s() {
        this.f36756g = a.DOWNLOAD;
        this.f36753d.f10122j.setVisibility(0);
        this.f36753d.f10122j.setText(this.f36754e.getString(R.string.updates_button_download_app));
        this.f36753d.f10122j.setBackground(ContextCompat.getDrawable(this.f36754e, R.drawable.ripple_blue_primary_button));
        this.f36753d.f10122j.setTextColor(ContextCompat.getColor(this.f36754e, R.color.white));
        this.f36753d.f10119g.setVisibility(8);
        this.f36753d.f10126n.setVisibility(8);
    }

    private final void t() {
        ProgressBar progressBar = this.f36753d.f10117e;
        AbstractC3159y.h(progressBar, "binding.pbProgressWishlistItem");
        ImageView imageView = this.f36753d.f10115c;
        AbstractC3159y.h(imageView, "binding.ivIconWishlistItem");
        e(progressBar, imageView);
        this.f36753d.f10119g.setVisibility(0);
        this.f36753d.f10114b.setVisibility(0);
        this.f36753d.f10124l.setVisibility(8);
        this.f36753d.f10122j.setVisibility(8);
        this.f36753d.f10126n.setVisibility(0);
        this.f36753d.f10125m.setVisibility(8);
    }

    private final void u() {
        this.f36753d.f10122j.setVisibility(0);
        this.f36753d.f10122j.setText(this.f36754e.getString(R.string.option_button_install));
        this.f36753d.f10122j.setVisibility(0);
        this.f36753d.f10122j.setBackground(ContextCompat.getDrawable(this.f36754e, R.drawable.ripple_install_button));
        this.f36753d.f10119g.setVisibility(8);
        this.f36753d.f10126n.setVisibility(8);
    }

    private final void v() {
        this.f36756g = a.INSTALLING;
        this.f36753d.f10122j.setText(this.f36754e.getString(R.string.installing));
        this.f36753d.f10122j.setVisibility(0);
        this.f36753d.f10122j.setBackground(ContextCompat.getDrawable(this.f36754e, R.drawable.bg_status_download_installed));
        this.f36753d.f10122j.setTextColor(ContextCompat.getColor(this.f36754e, R.color.download_installed_status));
        this.f36753d.f10119g.setVisibility(8);
        this.f36753d.f10126n.setVisibility(8);
    }

    private final void w() {
        this.f36756g = a.OPEN;
        this.f36753d.f10122j.setVisibility(0);
        this.f36753d.f10122j.setText(this.f36754e.getString(R.string.open));
        this.f36753d.f10122j.setBackground(ContextCompat.getDrawable(this.f36754e, R.drawable.ripple_blue_primary_button));
        this.f36753d.f10122j.setTextColor(ContextCompat.getColor(this.f36754e, R.color.white));
        this.f36753d.f10119g.setVisibility(8);
        this.f36753d.f10126n.setVisibility(8);
    }

    private final void x() {
        this.f36753d.f10122j.setVisibility(0);
        this.f36753d.f10119g.setVisibility(8);
        this.f36753d.f10122j.setText(this.f36754e.getString(R.string.updates_button_resume));
        this.f36753d.f10122j.setTextColor(ContextCompat.getColor(this.f36754e, R.color.white));
        this.f36753d.f10122j.setBackground(ContextCompat.getDrawable(this.f36754e, R.drawable.ripple_blue_primary_button));
        this.f36753d.f10126n.setVisibility(8);
    }

    private final void y(ProgressBar progressBar) {
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
    }

    private final void z(ProgressBar progressBar, int i8) {
        progressBar.setIndeterminate(false);
        progressBar.setProgress(i8);
        progressBar.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
    
        if (com.uptodown.workers.DownloadApkWorker.f29987k.d(r11.f(), r11.e0()) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(X4.U r17) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.e1.n(X4.U):void");
    }
}
