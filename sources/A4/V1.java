package A4;

import E4.j;
import T4.C1391y;
import W4.InterfaceC1485h;
import X4.C1496f;
import X4.C1498h;
import X4.C1505o;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.nsd.NsdServiceInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.GenerateQueueWorker;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3313a;
import l5.C3326n;
import l5.C3329q;

/* loaded from: classes4.dex */
public abstract class V1 extends AbstractActivityC2489a {

    /* renamed from: O, reason: collision with root package name */
    private ProgressBar f237O;

    /* renamed from: P, reason: collision with root package name */
    private TextView f238P;

    /* renamed from: Q, reason: collision with root package name */
    private TextView f239Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f240R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f241S;

    /* renamed from: T, reason: collision with root package name */
    private InterfaceC2855x0 f242T;

    /* renamed from: V, reason: collision with root package name */
    private boolean f244V;

    /* renamed from: W, reason: collision with root package name */
    private C1391y f245W;

    /* renamed from: X, reason: collision with root package name */
    private HashMap f246X;

    /* renamed from: Y, reason: collision with root package name */
    private File f247Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f248Z;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f243U = new ArrayList();

    /* renamed from: p0, reason: collision with root package name */
    private e f249p0 = new e();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1485h {
        a() {
        }

        @Override // W4.InterfaceC1485h
        public void a(ArrayList positives) {
            AbstractC3159y.i(positives, "positives");
            UptodownApp.f27990B.B0(positives);
            V1.this.p4();
            V1.this.f240R = false;
        }

        @Override // W4.InterfaceC1485h
        public void b() {
            UptodownApp.f27990B.B0(new ArrayList());
            V1.this.p4();
            V1.this.f240R = false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1496f f255b;

        c(C1496f c1496f) {
            this.f255b = c1496f;
        }

        @Override // W4.r
        public void c(int i8) {
            V1 v12 = V1.this;
            String string = v12.getString(R.string.rollback_not_available, this.f255b.I());
            AbstractC3159y.h(string, "getString(R.string.rollb…_not_available, app.name)");
            v12.e2(string);
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (appInfo.c()) {
                Intent intent = new Intent(V1.this.getApplicationContext(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f255b);
                intent.putExtra("appInfo", appInfo);
                V1 v12 = V1.this;
                v12.startActivity(intent, UptodownApp.f27990B.a(v12));
                return;
            }
            V1 v13 = V1.this;
            String string = v13.getString(R.string.rollback_not_available, appInfo.s0());
            AbstractC3159y.h(string, "getString(R.string.rollb…_available, appInfo.name)");
            v13.e2(string);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements W4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1496f f257b;

        d(C1496f c1496f) {
            this.f257b = c1496f;
        }

        @Override // W4.K
        public void a(X4.H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            Intent intent = new Intent(V1.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("app_selected", this.f257b);
            intent.putExtra("appReportVT", reportVT);
            V1 v12 = V1.this;
            v12.startActivity(intent, UptodownApp.f27990B.a(v12));
        }

        @Override // W4.K
        public void b() {
            V1.this.J2(this.f257b.X());
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements W4.D {
        e() {
        }

        @Override // W4.D
        public void a(String appName) {
            AbstractC3159y.i(appName, "appName");
            V1.this.e2(appName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f260b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ V1 f261c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i8, V1 v12, P5.d dVar) {
            super(2, dVar);
            this.f260b = i8;
            this.f261c = v12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f260b, this.f261c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f259a == 0) {
                L5.t.b(obj);
                C1391y c1391y = null;
                switch (this.f260b) {
                    case 106:
                        C1391y c1391y2 = this.f261c.f245W;
                        if (c1391y2 == null) {
                            AbstractC3159y.y("dialogBinding");
                        } else {
                            c1391y = c1391y2;
                        }
                        c1391y.f10974n.setText(this.f261c.getString(R.string.action_update));
                        break;
                    case 107:
                        C1391y c1391y3 = this.f261c.f245W;
                        if (c1391y3 == null) {
                            AbstractC3159y.y("dialogBinding");
                        } else {
                            c1391y = c1391y3;
                        }
                        c1391y.f10974n.setText(this.f261c.getString(R.string.action_cancel_download));
                        break;
                    case 108:
                        C1391y c1391y4 = this.f261c.f245W;
                        if (c1391y4 == null) {
                            AbstractC3159y.y("dialogBinding");
                        } else {
                            c1391y = c1391y4;
                        }
                        c1391y.f10974n.setText(this.f261c.getString(R.string.notification_msg_update_uptodown));
                        break;
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void C3() {
        new S4.a(this, new a(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(String str, int i8) {
        Window window;
        if (i8 == 0) {
            AlertDialog s22 = s2();
            if (s22 != null) {
                s22.dismiss();
            }
            View inflate = getLayoutInflater().inflate(R.layout.dialog_backup_app, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog_backup_app);
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_name_dialog_backup_app);
            this.f238P = textView2;
            if (textView2 != null) {
                textView2.setTypeface(aVar.u());
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_percentage_dialog_backup_app);
            this.f239Q = textView3;
            if (textView3 != null) {
                textView3.setTypeface(aVar.u());
            }
            this.f237O = (ProgressBar) inflate.findViewById(R.id.progressbar_dialog_backup_app);
            View findViewById = inflate.findViewById(R.id.tv_cancel_dialog_backup_app);
            AbstractC3159y.h(findViewById, "view.findViewById(R.id.t…cancel_dialog_backup_app)");
            TextView textView4 = (TextView) findViewById;
            textView4.setTypeface(aVar.t());
            textView4.setOnClickListener(new View.OnClickListener() { // from class: A4.M1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.E3(V1.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(inflate);
            builder.setCancelable(false);
            O2(builder.create());
            AlertDialog s23 = s2();
            if (s23 != null && (window = s23.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog s24 = s2();
            if (s24 != null) {
                s24.show();
            }
        }
        TextView textView5 = this.f238P;
        if (textView5 != null) {
            textView5.setText(str);
        }
        TextView textView6 = this.f239Q;
        if (textView6 != null) {
            textView6.setText("0%");
        }
        ProgressBar progressBar = this.f237O;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(V1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            InterfaceC2855x0 interfaceC2855x0 = this$0.f242T;
            if (interfaceC2855x0 == null) {
                AbstractC3159y.y("jobBackup");
                interfaceC2855x0 = null;
            }
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
            AlertDialog s22 = this$0.s2();
            if (s22 != null) {
                s22.dismiss();
            }
            this$0.O2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3(String str, final String str2) {
        AlertDialog s22 = s2();
        if (s22 != null) {
            s22.dismiss();
        }
        View inflate = getLayoutInflater().inflate(R.layout.dialog_backup_result, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog_backup_result);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_msg_dialog_backup_result);
        textView2.setTypeface(aVar.u());
        textView2.setText(str);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_ok_dialog_backup_result);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.I1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V1.G3(V1.this, view);
            }
        });
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_browse_dialog_backup_result);
        textView4.setTypeface(aVar.t());
        textView4.setOnClickListener(new View.OnClickListener() { // from class: A4.J1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V1.H3(V1.this, view);
            }
        });
        if (str2 != null && str2.length() != 0) {
            TextView textView5 = (TextView) inflate.findViewById(R.id.tv_share_dialog_backup_result);
            textView5.setTypeface(aVar.t());
            textView5.setOnClickListener(new View.OnClickListener() { // from class: A4.K1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.I3(V1.this, str2, view);
                }
            });
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        O2(builder.create());
        AlertDialog s23 = s2();
        AbstractC3159y.f(s23);
        Window window = s23.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog s24 = s2();
        AbstractC3159y.f(s24);
        s24.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(V1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog s22 = this$0.s2();
            if (s22 != null) {
                s22.dismiss();
            }
            this$0.O2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(V1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            Intent intent = new Intent(this$0, (Class<?>) FileExplorerActivity.class);
            intent.putExtra("subdir", new G4.a(this$0).c());
            intent.putExtra("subdir_sd", new G4.a(this$0).n());
            this$0.startActivity(intent);
            AlertDialog s22 = this$0.s2();
            if (s22 != null) {
                s22.dismiss();
            }
            this$0.O2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(V1 this$0, String str, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            Intent intent = new Intent("android.intent.action.SEND");
            Object b8 = new G4.a(this$0).b();
            if (b8 instanceof File) {
                File file = new File((File) b8, str);
                if (file.exists()) {
                    intent.setType("application/vnd.android.package-archive");
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(this$0, this$0.getPackageName() + ".provider", file));
                    this$0.startActivity(Intent.createChooser(intent, this$0.getString(R.string.intent_chooser_title_share_file)));
                    return;
                }
                return;
            }
            if (b8 instanceof DocumentFile) {
                intent.putExtra("android.intent.extra.STREAM", ((DocumentFile) b8).getUri());
                this$0.startActivity(Intent.createChooser(intent, this$0.getString(R.string.intent_chooser_title_share_file)));
            }
        }
    }

    private final void J3(C1496f c1496f, X4.O o8) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = getLayoutInflater();
        AbstractC3159y.h(layoutInflater, "layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.version_details_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_vd);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        ((TextView) inflate.findViewById(R.id.tv_label_app_name_vd)).setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_app_name_vd);
        textView2.setTypeface(aVar.t());
        textView2.setText(c1496f.I());
        ((TextView) inflate.findViewById(R.id.tv_label_installed_version_vd)).setTypeface(aVar.u());
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_installed_version_vd);
        textView3.setTypeface(aVar.t());
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
        String format = String.format("%s(%s)", Arrays.copyOf(new Object[]{c1496f.h0(), Long.valueOf(c1496f.f0())}, 2));
        AbstractC3159y.h(format, "format(...)");
        textView3.setText(format);
        ((TextView) inflate.findViewById(R.id.tv_label_update_version_vd)).setTypeface(aVar.u());
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_update_version_vd);
        textView4.setTypeface(aVar.t());
        String format2 = String.format("%s(%s)", Arrays.copyOf(new Object[]{o8.z(), Long.valueOf(o8.u())}, 2));
        AbstractC3159y.h(format2, "format(...)");
        textView4.setText(format2);
        ((TextView) inflate.findViewById(R.id.tv_label_packagename_vd)).setTypeface(aVar.u());
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_packagename_vd);
        textView5.setTypeface(aVar.t());
        textView5.setText(c1496f.Q());
        ((TextView) inflate.findViewById(R.id.tv_label_size_vd)).setTypeface(aVar.u());
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_size_vd);
        textView6.setTypeface(aVar.t());
        textView6.setText(new N4.g().c(o8.s()));
        ((TextView) inflate.findViewById(R.id.tv_label_filename_vd)).setTypeface(aVar.u());
        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_filename_vd);
        textView7.setTypeface(aVar.t());
        String j8 = o8.j();
        if (j8 != null && j8.length() != 0) {
            textView7.setText(o8.j());
        } else {
            textView7.setText(getString(R.string.version_details_filename_not_found, c1496f.I()));
        }
        TextView textView8 = (TextView) inflate.findViewById(R.id.tv_version_details_accept);
        textView8.setTypeface(aVar.t());
        textView8.setOnClickListener(new View.OnClickListener() { // from class: A4.H1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V1.K3(V1.this, view);
            }
        });
        builder.setView(inflate);
        O2(builder.create());
        if (!isFinishing()) {
            AlertDialog s22 = s2();
            AbstractC3159y.f(s22);
            Window window = s22.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog s23 = s2();
            AbstractC3159y.f(s23);
            s23.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(V1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.G2(c1496f.c());
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.m4(c1496f);
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(C1496f c1496f, V1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            String Q8 = c1496f.Q();
            if (Q8 != null && Q8.length() != 0) {
                PackageManager packageManager = this$0.getPackageManager();
                String Q9 = c1496f.Q();
                AbstractC3159y.f(Q9);
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(Q9);
                if (launchIntentForPackage != null) {
                    this$0.startActivity(launchIntentForPackage);
                } else {
                    String string = this$0.getString(R.string.error_open_app, c1496f.I());
                    AbstractC3159y.h(string, "getString(R.string.error…en_app, appSelected.name)");
                    this$0.e2(string);
                }
            }
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(C1496f c1496f, V1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            String Q8 = c1496f.Q();
            if (Q8 != null && Q8.length() != 0) {
                E4.i iVar = new E4.i(this$0);
                String Q9 = c1496f.Q();
                AbstractC3159y.f(Q9);
                iVar.h(Q9);
            }
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.a0()) {
            Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) B4.b.class);
            intent.putExtra("AppIndex", c1496f.Q());
            this$0.startActivity(intent, aVar.a(this$0));
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            new S4.r(this$0, null, c1496f, this$0.f249p0, LifecycleOwnerKt.getLifecycleScope(this$0));
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
            this$0.f248Z = true;
            this$0.f243U = new ArrayList();
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            String I8 = c1496f.I();
            AbstractC3159y.f(I8);
            this$0.f243U.add(new K4.b(Q8, I8));
            this$0.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.n4(c1496f);
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        this$0.c4(s22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(V1 this$0, C3326n dbManager, C1496f c1496f, W4.E listener, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dbManager, "$dbManager");
        AbstractC3159y.i(listener, "$listener");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
            dbManager.a();
            if (c1496f.i() == 0) {
                c1496f.t0(1);
                c1496f.J0(C1496f.c.UPDATED);
                C3329q c3329q = new C3329q();
                Context applicationContext = this$0.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                c3329q.c(applicationContext);
            } else {
                c1496f.t0(0);
                c1496f.J0(C1496f.c.OUTDATED);
            }
            dbManager.j1(c1496f);
            dbManager.g();
            listener.d(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(C3326n dbManager, X4.O o8, V1 this$0, View view) {
        AbstractC3159y.i(dbManager, "$dbManager");
        AbstractC3159y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.a0()) {
            dbManager.a();
            o8.X(0);
            dbManager.r1(o8);
            dbManager.g();
            aVar.c0(o8.n(), this$0);
            C3313a c3313a = new C3313a();
            Context applicationContext = this$0.getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            c3313a.b(applicationContext, o8.j());
            UptodownApp.a.N0(aVar, this$0, false, false, 6, null);
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(V1 this$0, C1496f c1496f, X4.O o8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
            this$0.J3(c1496f, o8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(V1 this$0, X4.O o8, C3326n dbManager, W4.E listener, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dbManager, "$dbManager");
        AbstractC3159y.i(listener, "$listener");
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
            if (o8.f() == 1) {
                o8.L(0);
            } else {
                o8.L(1);
            }
            dbManager.a();
            dbManager.r1(o8);
            dbManager.g();
            C3313a c3313a = new C3313a();
            Context applicationContext = this$0.getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            c3313a.b(applicationContext, o8.j());
            listener.d(i8);
            UptodownApp.a.N0(aVar, this$0, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
            this$0.f243U = new ArrayList();
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            String I8 = c1496f.I();
            AbstractC3159y.f(I8);
            this$0.f243U.add(new K4.b(Q8, I8));
            this$0.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
            this$0.o4(c1496f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(V1 this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.a0()) {
            AlertDialog s22 = this$0.s2();
            AbstractC3159y.f(s22);
            this$0.c4(s22);
            Intent intent = new Intent(this$0, (Class<?>) AppInstalledDetailsActivity.class);
            intent.putExtra("appInstalled", c1496f);
            this$0.startActivity(intent, aVar.a(this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(V1 this$0, DialogInterface dialogInterface) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f244V = false;
    }

    private final void c4(AlertDialog alertDialog) {
        alertDialog.dismiss();
        this.f244V = false;
    }

    private final void e4(C1496f c1496f) {
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.c(c1496f).size() < 2 && aVar.F().size() < 2) {
            u4();
        }
    }

    private final void o4(C1496f c1496f) {
        if (!isFinishing()) {
            new S4.m(this, null, c1496f.X(), new d(c1496f), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void u4() {
        Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", false).build();
        AbstractC3159y.h(build, "Builder()\n            .p…lse)\n            .build()");
        WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
    }

    public final void B3(int i8, boolean z8, Toolbar toolbar) {
        AbstractC3159y.i(toolbar, "toolbar");
        if (toolbar.getMenu() != null) {
            Menu menu = toolbar.getMenu();
            AbstractC3159y.f(menu);
            menu.findItem(i8).setChecked(z8);
        }
    }

    public final void L3(final C1496f c1496f, final int i8, final W4.E listener) {
        C1391y c1391y;
        Window window;
        NsdServiceInfo e8;
        String z8;
        AbstractC3159y.i(listener, "listener");
        if (isFinishing() || c1496f == null) {
            return;
        }
        C1391y c8 = C1391y.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        this.f245W = c8;
        if (c8 == null) {
            AbstractC3159y.y("dialogBinding");
            c8 = null;
        }
        TextView textView = c8.f10972l;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        C1391y c1391y2 = this.f245W;
        if (c1391y2 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y2 = null;
        }
        c1391y2.f10972l.setText(c1496f.I());
        String Q8 = c1496f.Q();
        if (Q8 != null && Q8.length() != 0 && (z8 = c1496f.z()) != null && z8.length() != 0 && c1496f.c() != 0) {
            C1391y c1391y3 = this.f245W;
            if (c1391y3 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y3 = null;
            }
            c1391y3.f10970j.setTypeface(aVar.u());
            C1391y c1391y4 = this.f245W;
            if (c1391y4 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y4 = null;
            }
            c1391y4.f10970j.setOnClickListener(new View.OnClickListener() { // from class: A4.A1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.M3(V1.this, c1496f, view);
                }
            });
        } else {
            C1391y c1391y5 = this.f245W;
            if (c1391y5 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y5 = null;
            }
            c1391y5.f10970j.setVisibility(8);
        }
        C3326n.a aVar2 = C3326n.f34490t;
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        final C3326n a8 = aVar2.a(applicationContext);
        a8.a();
        String Q9 = c1496f.Q();
        AbstractC3159y.f(Q9);
        final X4.O u02 = a8.u0(Q9);
        a8.g();
        if (u02 != null) {
            C1391y c1391y6 = this.f245W;
            if (c1391y6 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y6 = null;
            }
            c1391y6.f10974n.setTypeface(aVar.u());
            if (u02.b()) {
                C1391y c1391y7 = this.f245W;
                if (c1391y7 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y7 = null;
                }
                c1391y7.f10974n.setText(getString(R.string.action_cancel_download));
            } else if (u02.o() == 100) {
                C1391y c1391y8 = this.f245W;
                if (c1391y8 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y8 = null;
                }
                c1391y8.f10974n.setText(getString(R.string.notification_msg_update_uptodown));
            } else if (u02.o() > 0) {
                C1391y c1391y9 = this.f245W;
                if (c1391y9 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y9 = null;
                }
                c1391y9.f10974n.setText(getString(R.string.updates_button_resume));
            } else {
                C1391y c1391y10 = this.f245W;
                if (c1391y10 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y10 = null;
                }
                c1391y10.f10974n.setText(getString(R.string.action_update));
            }
            C1391y c1391y11 = this.f245W;
            if (c1391y11 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y11 = null;
            }
            c1391y11.f10974n.setOnClickListener(new View.OnClickListener() { // from class: A4.S1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.N3(V1.this, c1496f, view);
                }
            });
        } else {
            C1391y c1391y12 = this.f245W;
            if (c1391y12 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y12 = null;
            }
            c1391y12.f10974n.setVisibility(8);
        }
        if (!g6.n.s(getPackageName(), c1496f.Q(), true)) {
            C1391y c1391y13 = this.f245W;
            if (c1391y13 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y13 = null;
            }
            c1391y13.f10969i.setTypeface(aVar.u());
            C1391y c1391y14 = this.f245W;
            if (c1391y14 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y14 = null;
            }
            c1391y14.f10969i.setOnClickListener(new View.OnClickListener() { // from class: A4.T1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.O3(C1496f.this, this, view);
                }
            });
            C1391y c1391y15 = this.f245W;
            if (c1391y15 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y15 = null;
            }
            c1391y15.f10973m.setTypeface(aVar.u());
            C1391y c1391y16 = this.f245W;
            if (c1391y16 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y16 = null;
            }
            c1391y16.f10973m.setOnClickListener(new View.OnClickListener() { // from class: A4.U1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.P3(C1496f.this, this, view);
                }
            });
        } else {
            C1391y c1391y17 = this.f245W;
            if (c1391y17 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y17 = null;
            }
            c1391y17.f10969i.setVisibility(8);
            C1391y c1391y18 = this.f245W;
            if (c1391y18 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y18 = null;
            }
            c1391y18.f10973m.setVisibility(8);
        }
        if (UptodownApp.f27990B.M()) {
            C1391y c1391y19 = this.f245W;
            if (c1391y19 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y19 = null;
            }
            c1391y19.f10969i.setText(R.string.debug_title_info_app);
            C1391y c1391y20 = this.f245W;
            if (c1391y20 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y20 = null;
            }
            c1391y20.f10969i.setOnClickListener(new View.OnClickListener() { // from class: A4.B1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.Q3(V1.this, c1496f, view);
                }
            });
            C1391y c1391y21 = this.f245W;
            if (c1391y21 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y21 = null;
            }
            c1391y21.f10969i.setVisibility(0);
        }
        String e02 = c1496f.e0();
        if (e02 != null && e02.length() != 0) {
            C1391y c1391y22 = this.f245W;
            if (c1391y22 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y22 = null;
            }
            c1391y22.f10971k.setTypeface(aVar.u());
            C1391y c1391y23 = this.f245W;
            if (c1391y23 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y23 = null;
            }
            c1391y23.f10971k.setOnClickListener(new View.OnClickListener() { // from class: A4.C1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.R3(V1.this, c1496f, view);
                }
            });
        } else {
            C1391y c1391y24 = this.f245W;
            if (c1391y24 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y24 = null;
            }
            c1391y24.f10971k.setVisibility(8);
        }
        C1391y c1391y25 = this.f245W;
        if (c1391y25 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y25 = null;
        }
        c1391y25.f10967g.setTypeface(aVar.u());
        C1391y c1391y26 = this.f245W;
        if (c1391y26 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y26 = null;
        }
        c1391y26.f10967g.setOnClickListener(new View.OnClickListener() { // from class: A4.D1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V1.S3(V1.this, c1496f, view);
            }
        });
        L4.c o8 = aVar.o();
        if (o8 != null && o8.j()) {
            L4.h l8 = aVar.l();
            String serviceName = (l8 == null || (e8 = l8.e()) == null) ? null : e8.getServiceName();
            if (serviceName != null) {
                C1391y c1391y27 = this.f245W;
                if (c1391y27 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y27 = null;
                }
                TextView textView2 = c1391y27.f10967g;
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
                String format = String.format("%s%s", Arrays.copyOf(new Object[]{getString(R.string.nsd_option_send_to), L4.h.f6447h.c(serviceName)}, 2));
                AbstractC3159y.h(format, "format(...)");
                textView2.setText(format);
            } else {
                C1391y c1391y28 = this.f245W;
                if (c1391y28 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y28 = null;
                }
                c1391y28.f10967g.setVisibility(8);
            }
        }
        if (c1496f.n() == 1 && c1496f.c() != 0) {
            C1391y c1391y29 = this.f245W;
            if (c1391y29 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y29 = null;
            }
            c1391y29.f10968h.setTypeface(aVar.u());
            C1391y c1391y30 = this.f245W;
            if (c1391y30 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y30 = null;
            }
            c1391y30.f10968h.setOnClickListener(new View.OnClickListener() { // from class: A4.E1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.T3(V1.this, c1496f, view);
                }
            });
        } else {
            C1391y c1391y31 = this.f245W;
            if (c1391y31 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y31 = null;
            }
            c1391y31.f10968h.setVisibility(8);
        }
        C1391y c1391y32 = this.f245W;
        if (c1391y32 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y32 = null;
        }
        c1391y32.f10965e.setTypeface(aVar.u());
        if (c1496f.i() == 0) {
            C1391y c1391y33 = this.f245W;
            if (c1391y33 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y33 = null;
            }
            c1391y33.f10965e.setText(getString(R.string.not_offer_updates));
        } else {
            C1391y c1391y34 = this.f245W;
            if (c1391y34 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y34 = null;
            }
            c1391y34.f10965e.setText(getString(R.string.offer_updates_again));
        }
        C1391y c1391y35 = this.f245W;
        if (c1391y35 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y35 = null;
        }
        c1391y35.f10965e.setOnClickListener(new View.OnClickListener() { // from class: A4.F1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V1.U3(V1.this, a8, c1496f, listener, i8, view);
            }
        });
        if (u02 != null && c1496f.c0() == C1496f.c.OUTDATED && c1496f.i() == 0) {
            C1391y c1391y36 = this.f245W;
            if (c1391y36 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y36 = null;
            }
            c1391y36.f10964d.setTypeface(aVar.u());
            C1391y c1391y37 = this.f245W;
            if (c1391y37 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y37 = null;
            }
            c1391y37.f10964d.setOnClickListener(new View.OnClickListener() { // from class: A4.G1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.V3(C3326n.this, u02, this, view);
                }
            });
            C1391y c1391y38 = this.f245W;
            if (c1391y38 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y38 = null;
            }
            c1391y38.f10975o.setTypeface(aVar.u());
            C1391y c1391y39 = this.f245W;
            if (c1391y39 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y39 = null;
            }
            c1391y39.f10975o.setOnClickListener(new View.OnClickListener() { // from class: A4.L1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.W3(V1.this, c1496f, u02, view);
                }
            });
        } else {
            C1391y c1391y40 = this.f245W;
            if (c1391y40 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y40 = null;
            }
            c1391y40.f10964d.setVisibility(8);
            C1391y c1391y41 = this.f245W;
            if (c1391y41 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y41 = null;
            }
            c1391y41.f10975o.setVisibility(8);
        }
        if (u02 != null) {
            C1391y c1391y42 = this.f245W;
            if (c1391y42 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y42 = null;
            }
            c1391y42.f10966f.setVisibility(0);
            C1391y c1391y43 = this.f245W;
            if (c1391y43 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y43 = null;
            }
            c1391y43.f10966f.setTypeface(aVar.u());
            if (u02.f() == 1) {
                C1391y c1391y44 = this.f245W;
                if (c1391y44 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y44 = null;
                }
                c1391y44.f10966f.setText(R.string.reactivate_skipped_update);
            } else {
                C1391y c1391y45 = this.f245W;
                if (c1391y45 == null) {
                    AbstractC3159y.y("dialogBinding");
                    c1391y45 = null;
                }
                c1391y45.f10966f.setText(R.string.skip_update);
            }
            C1391y c1391y46 = this.f245W;
            if (c1391y46 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y46 = null;
            }
            c1391y46.f10966f.setOnClickListener(new View.OnClickListener() { // from class: A4.N1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.X3(V1.this, u02, a8, listener, i8, view);
                }
            });
        } else {
            C1391y c1391y47 = this.f245W;
            if (c1391y47 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y47 = null;
            }
            c1391y47.f10966f.setVisibility(8);
        }
        if (c1496f.Q() != null) {
            C1391y c1391y48 = this.f245W;
            if (c1391y48 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y48 = null;
            }
            c1391y48.f10963c.setVisibility(0);
            C1391y c1391y49 = this.f245W;
            if (c1391y49 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y49 = null;
            }
            c1391y49.f10963c.setTypeface(aVar.u());
            C1391y c1391y50 = this.f245W;
            if (c1391y50 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y50 = null;
            }
            c1391y50.f10963c.setOnClickListener(new View.OnClickListener() { // from class: A4.O1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.Y3(V1.this, c1496f, view);
                }
            });
        }
        if (c1496f.X() != null) {
            C1391y c1391y51 = this.f245W;
            if (c1391y51 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y51 = null;
            }
            c1391y51.f10976p.setVisibility(0);
            C1391y c1391y52 = this.f245W;
            if (c1391y52 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y52 = null;
            }
            c1391y52.f10976p.setTypeface(aVar.u());
            C1391y c1391y53 = this.f245W;
            if (c1391y53 == null) {
                AbstractC3159y.y("dialogBinding");
                c1391y53 = null;
            }
            c1391y53.f10976p.setOnClickListener(new View.OnClickListener() { // from class: A4.P1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    V1.Z3(V1.this, c1496f, view);
                }
            });
        }
        C1391y c1391y54 = this.f245W;
        if (c1391y54 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y54 = null;
        }
        c1391y54.f10962b.setTypeface(aVar.u());
        C1391y c1391y55 = this.f245W;
        if (c1391y55 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y55 = null;
        }
        c1391y55.f10962b.setOnClickListener(new View.OnClickListener() { // from class: A4.Q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V1.a4(V1.this, c1496f, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        C1391y c1391y56 = this.f245W;
        if (c1391y56 == null) {
            AbstractC3159y.y("dialogBinding");
            c1391y = null;
        } else {
            c1391y = c1391y56;
        }
        builder.setView(c1391y.getRoot());
        O2(builder.create());
        AlertDialog s22 = s2();
        if (s22 != null) {
            s22.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: A4.R1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    V1.b4(V1.this, dialogInterface);
                }
            });
            L5.I i9 = L5.I.f6474a;
        }
        if (isFinishing()) {
            return;
        }
        AlertDialog s23 = s2();
        if (s23 != null && (window = s23.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            L5.I i10 = L5.I.f6474a;
        }
        AlertDialog s24 = s2();
        if (s24 != null) {
            s24.show();
            L5.I i11 = L5.I.f6474a;
        }
        this.f244V = true;
    }

    @Override // F4.r
    public void Z() {
        this.f242T = new I4.a(this, new b()).t(this.f243U);
        this.f243U = new ArrayList();
    }

    @Override // F4.a1
    public void a1() {
        File file;
        super.a1();
        L4.h l8 = E4.j.f2272g.l();
        AbstractC3159y.f(l8);
        if (l8.e() != null && (file = this.f247Y) != null) {
            AbstractC3159y.f(file);
            if (!file.isDirectory()) {
                UptodownApp uptodownApp = new UptodownApp();
                File file2 = this.f247Y;
                AbstractC3159y.f(file2);
                uptodownApp.R(file2);
            }
        }
    }

    public final void d4(int i8, boolean z8, Toolbar toolbar) {
        AbstractC3159y.i(toolbar, "toolbar");
        if (toolbar.getMenu() != null) {
            Menu menu = toolbar.getMenu();
            AbstractC3159y.f(menu);
            menu.findItem(i8).setEnabled(z8);
        }
    }

    public final HashMap f4() {
        return this.f246X;
    }

    public final File g4() {
        return this.f247Y;
    }

    public final boolean h4() {
        return this.f241S;
    }

    public final boolean i4() {
        return this.f248Z;
    }

    public final boolean j4() {
        return this.f244V;
    }

    public final void k4() {
        if (!this.f240R) {
            this.f240R = true;
            C3();
        }
    }

    public final void l4(C1496f c1496f) {
        String str;
        String str2 = null;
        if (c1496f != null) {
            str = c1496f.Q();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (c1496f != null) {
                str2 = c1496f.Q();
            }
            AbstractC3159y.f(str2);
            aVar.c0(str2, this);
            C3326n a8 = C3326n.f34490t.a(this);
            a8.a();
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            C1505o a02 = a8.a0(Q8);
            a8.g();
            if (a02 != null) {
                DownloadApkWorker.a aVar2 = DownloadApkWorker.f29987k;
                if (aVar2.d(c1496f.c(), a02.e0()) || a02.h0()) {
                    aVar2.a(c1496f.c());
                    new C3313a().a(this, a02.X());
                    a02.n0(this);
                }
            }
        }
    }

    public final void m4(C1496f c1496f) {
        String str;
        C1505o c1505o;
        String str2 = null;
        if (c1496f != null) {
            str = c1496f.Q();
        } else {
            str = null;
        }
        if (str != null) {
            C3326n.a aVar = C3326n.f34490t;
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            C3326n a8 = aVar.a(applicationContext);
            a8.a();
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            X4.O u02 = a8.u0(Q8);
            if (u02 != null) {
                String Q9 = c1496f.Q();
                AbstractC3159y.f(Q9);
                c1505o = a8.b0(Q9, u02.u());
            } else {
                c1505o = null;
            }
            if (u02 != null && u02.b()) {
                UptodownApp.a aVar2 = UptodownApp.f27990B;
                if (aVar2.O(this)) {
                    C3313a c3313a = new C3313a();
                    Context applicationContext2 = getApplicationContext();
                    AbstractC3159y.h(applicationContext2, "applicationContext");
                    if (!c3313a.b(applicationContext2, u02.j())) {
                        aVar2.c0(u02.n(), this);
                    } else {
                        u02.X(0);
                        a8.r1(u02);
                        DownloadUpdatesWorker.a aVar3 = DownloadUpdatesWorker.f29995k;
                        String Q10 = c1496f.Q();
                        AbstractC3159y.f(Q10);
                        aVar3.a(Q10);
                    }
                } else {
                    v4(c1496f.Q(), false);
                }
            } else {
                if (u02 != null) {
                    str2 = u02.j();
                }
                if (str2 != null) {
                    if (c1505o != null) {
                        DownloadApkWorker.a aVar4 = DownloadApkWorker.f29987k;
                        if (!aVar4.d(c1496f.c(), c1505o.e0()) && !c1505o.h0()) {
                            C3329q c3329q = new C3329q();
                            Context applicationContext3 = getApplicationContext();
                            AbstractC3159y.h(applicationContext3, "applicationContext");
                            UptodownApp.f27990B.Y(new File(c3329q.f(applicationContext3), c1505o.X()), this, c1496f.g0());
                        } else {
                            aVar4.a(c1496f.c());
                            new C3313a().a(this, c1505o.X());
                            c1505o.n0(this);
                        }
                    } else {
                        C3329q c3329q2 = new C3329q();
                        Context applicationContext4 = getApplicationContext();
                        AbstractC3159y.h(applicationContext4, "applicationContext");
                        File g8 = c3329q2.g(applicationContext4);
                        String j8 = u02.j();
                        AbstractC3159y.f(j8);
                        File file = new File(g8, j8);
                        if (file.exists() && u02.o() == 100) {
                            if (g6.n.s(u02.n(), getApplicationContext().getPackageName(), true)) {
                                d2(file);
                            } else {
                                UptodownApp.f27990B.Y(file, this, c1496f.g0());
                            }
                        } else {
                            UptodownApp.a aVar5 = UptodownApp.f27990B;
                            if (!aVar5.O(this)) {
                                v4(c1496f.Q(), false);
                            } else {
                                String Q11 = c1496f.Q();
                                AbstractC3159y.f(Q11);
                                if (aVar5.R(Q11)) {
                                    String Q12 = c1496f.Q();
                                    AbstractC3159y.f(Q12);
                                    aVar5.c0(Q12, this);
                                } else {
                                    e4(c1496f);
                                }
                            }
                        }
                    }
                } else if (c1505o != null) {
                    DownloadApkWorker.a aVar6 = DownloadApkWorker.f29987k;
                    if (!aVar6.d(c1496f.c(), c1505o.e0()) && !c1505o.h0()) {
                        C3329q c3329q3 = new C3329q();
                        Context applicationContext5 = getApplicationContext();
                        AbstractC3159y.h(applicationContext5, "applicationContext");
                        UptodownApp.f27990B.Y(new File(c3329q3.f(applicationContext5), c1505o.X()), this, c1496f.g0());
                    } else {
                        aVar6.a(c1496f.c());
                        new C3313a().a(this, c1505o.X());
                        c1505o.n0(this);
                    }
                } else if (!UptodownApp.f27990B.O(this)) {
                    v4(c1496f.Q(), false);
                } else {
                    e4(c1496f);
                }
            }
            a8.g();
        }
    }

    public final void n4(C1496f app) {
        AbstractC3159y.i(app, "app");
        new S4.i(this, app.c(), new c(app), LifecycleOwnerKt.getLifecycleScope(this));
    }

    protected abstract void p4();

    public final void q4(HashMap hashMap) {
        this.f246X = hashMap;
    }

    public final void r4(File file) {
        this.f247Y = file;
    }

    public final void s4(boolean z8) {
        this.f248Z = z8;
    }

    public final void t4(boolean z8) {
        this.f241S = z8;
    }

    public final void v4(String str, boolean z8) {
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (!aVar.W("GenerateQueueWorker", this) && !aVar.W("downloadApkWorker", this)) {
            boolean z9 = true;
            this.f241S = true;
            if (str != null && str.length() != 0) {
                z9 = false;
            }
            aVar.t0(z9);
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", z8).putString("packagename", str).build();
            AbstractC3159y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
            return;
        }
        String string = getString(R.string.error_download_in_progress_wait);
        AbstractC3159y.h(string, "getString(R.string.error…ownload_in_progress_wait)");
        e2(string);
    }

    public final void w4(int i8) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(i8, this, null), 2, null);
    }

    /* loaded from: classes4.dex */
    public static final class b implements J4.b {
        b() {
        }

        @Override // J4.b
        public void a(K4.b app, int i8) {
            AbstractC3159y.i(app, "app");
            V1.this.D3(app.b(), i8);
        }

        @Override // J4.b
        public void b(K4.b app) {
            AbstractC3159y.i(app, "app");
            V1 v12 = V1.this;
            v12.I(v12.getString(R.string.core_msg_cannot_write_path));
        }

        @Override // J4.b
        public void c(K4.b app) {
            AbstractC3159y.i(app, "app");
            V1 v12 = V1.this;
            v12.I(v12.getString(R.string.backup_no_free_space));
        }

        @Override // J4.b
        public void d(ArrayList apps) {
            AbstractC3159y.i(apps, "apps");
            NsdServiceInfo nsdServiceInfo = null;
            if (apps.size() == 1) {
                if (!V1.this.i4()) {
                    V1.this.F3(((K4.b) apps.get(0)).b(), ((K4.b) apps.get(0)).a());
                    return;
                }
                AlertDialog s22 = V1.this.s2();
                if (s22 != null) {
                    s22.dismiss();
                }
                V1.this.s4(false);
                Object b8 = new G4.a(V1.this).b();
                if (b8 instanceof File) {
                    V1 v12 = V1.this;
                    String a8 = ((K4.b) apps.get(0)).a();
                    AbstractC3159y.f(a8);
                    v12.r4(new File((File) b8, a8));
                    L4.h l8 = E4.j.f2272g.l();
                    if (l8 != null) {
                        nsdServiceInfo = l8.e();
                    }
                    if (nsdServiceInfo == null) {
                        V1.this.S0();
                        return;
                    }
                    File g42 = V1.this.g4();
                    if (g42 != null && g42.exists()) {
                        File g43 = V1.this.g4();
                        AbstractC3159y.f(g43);
                        if (!g43.isDirectory()) {
                            UptodownApp uptodownApp = new UptodownApp();
                            File g44 = V1.this.g4();
                            AbstractC3159y.f(g44);
                            uptodownApp.R(g44);
                            return;
                        }
                    }
                    V1 v13 = V1.this;
                    v13.I(v13.getString(R.string.error_generico));
                    return;
                }
                if (b8 instanceof DocumentFile) {
                    String a9 = ((K4.b) apps.get(0)).a();
                    AbstractC3159y.f(a9);
                    DocumentFile findFile = ((DocumentFile) b8).findFile(a9);
                    if (findFile != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(findFile);
                        new I4.b(arrayList, new N4.f().g(V1.this), new a(V1.this, apps), false, V1.this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (apps.size() > 0) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
                String string = V1.this.getString(R.string.msg_backup_x_apps);
                AbstractC3159y.h(string, "getString(R.string.msg_backup_x_apps)");
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(apps.size())}, 1));
                AbstractC3159y.h(format, "format(...)");
                V1.this.F3(format, null);
            }
        }

        @Override // J4.b
        public void e(String appName) {
            AbstractC3159y.i(appName, "appName");
            TextView textView = V1.this.f238P;
            if (textView != null) {
                textView.setText(appName);
            }
            TextView textView2 = V1.this.f239Q;
            if (textView2 != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
                String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{0}, 1));
                AbstractC3159y.h(format, "format(...)");
                textView2.setText(format);
            }
            ProgressBar progressBar = V1.this.f237O;
            if (progressBar != null) {
                progressBar.setProgress(0);
            }
        }

        @Override // J4.b
        public void f(int i8) {
            TextView textView = V1.this.f239Q;
            if (textView != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
                String format = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3159y.h(format, "format(...)");
                textView.setText(format);
            }
            ProgressBar progressBar = V1.this.f237O;
            if (progressBar != null) {
                progressBar.setProgress(i8);
            }
        }

        @Override // J4.b
        public void g(K4.b app) {
            AbstractC3159y.i(app, "app");
            V1 v12 = V1.this;
            v12.I(v12.getString(R.string.core_msg_cannot_write_path));
        }

        /* loaded from: classes4.dex */
        public static final class a implements J4.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V1 f252a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f253b;

            a(V1 v12, ArrayList arrayList) {
                this.f252a = v12;
                this.f253b = arrayList;
            }

            @Override // J4.d
            public void a(DocumentFile docFile) {
                AbstractC3159y.i(docFile, "docFile");
            }

            @Override // J4.d
            public void c(File file) {
                AbstractC3159y.i(file, "file");
            }

            @Override // J4.d
            public void d(DocumentFile docFile) {
                AbstractC3159y.i(docFile, "docFile");
            }

            @Override // J4.d
            public void e(File file) {
                AbstractC3159y.i(file, "file");
            }

            @Override // J4.d
            public void f(Object file, int i8) {
                AbstractC3159y.i(file, "file");
            }

            @Override // J4.d
            public void h(Object file) {
                AbstractC3159y.i(file, "file");
            }

            @Override // J4.d
            public void i() {
                NsdServiceInfo nsdServiceInfo;
                V1 v12 = this.f252a;
                File g8 = new N4.f().g(this.f252a);
                String a8 = ((K4.b) this.f253b.get(0)).a();
                AbstractC3159y.f(a8);
                v12.r4(new File(g8, a8));
                L4.h l8 = E4.j.f2272g.l();
                if (l8 != null) {
                    nsdServiceInfo = l8.e();
                } else {
                    nsdServiceInfo = null;
                }
                if (nsdServiceInfo == null) {
                    this.f252a.S0();
                    return;
                }
                File g42 = this.f252a.g4();
                if (g42 != null && g42.exists()) {
                    File g43 = this.f252a.g4();
                    AbstractC3159y.f(g43);
                    if (!g43.isDirectory()) {
                        UptodownApp uptodownApp = new UptodownApp();
                        File g44 = this.f252a.g4();
                        AbstractC3159y.f(g44);
                        uptodownApp.R(g44);
                        return;
                    }
                }
                V1 v13 = this.f252a;
                v13.I(v13.getString(R.string.error_generico));
            }

            @Override // J4.d
            public void g() {
            }

            @Override // J4.d
            public void b(int i8) {
            }
        }
    }
}
