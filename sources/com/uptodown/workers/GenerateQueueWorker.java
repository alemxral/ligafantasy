package com.uptodown.workers;

import E4.j;
import X4.C1496f;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import g6.n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3319g;
import l5.C3332t;

/* loaded from: classes5.dex */
public final class GenerateQueueWorker extends Worker {

    /* renamed from: f, reason: collision with root package name */
    public static final a f30013f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f30014a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30015b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30016c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30017d;

    /* renamed from: e, reason: collision with root package name */
    private String f30018e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateQueueWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30014a = context;
        this.f30015b = params.getInputData().getBoolean("downloadAnyway", false);
        this.f30016c = params.getInputData().getBoolean("downloadUptodown", false);
        this.f30017d = params.getInputData().getInt("downloadAutostartedInBackground", 0);
        this.f30018e = params.getInputData().getString("packagename");
        this.f30014a = j.f2272g.a(this.f30014a);
    }

    private final void b(ArrayList arrayList) {
        if (!UptodownApp.f27990B.O(this.f30014a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", this.f30017d).putBoolean("downloadAnyway", this.f30015b).build();
            AbstractC3159y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this.f30014a).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
            if (arrayList.size() > 1) {
                WorkManager.getInstance(this.f30014a).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.lang.String r18, boolean r19, android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.GenerateQueueWorker.c(java.lang.String, boolean, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(C1496f app1, C1496f app2) {
        AbstractC3159y.i(app1, "app1");
        AbstractC3159y.i(app2, "app2");
        if (app1.I() == null) {
            return 1;
        }
        if (app2.I() == null) {
            return -1;
        }
        String I8 = app1.I();
        AbstractC3159y.f(I8);
        String I9 = app2.I();
        AbstractC3159y.f(I9);
        return n.m(I8, I9, true);
    }

    private final boolean e(C1496f c1496f, String str) {
        String str2;
        if (AbstractC3159y.d(str, "1")) {
            if (c1496f.Q() != null) {
                C3319g c3319g = new C3319g();
                Context context = this.f30014a;
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                str2 = c3319g.h(context, Q8);
            } else {
                str2 = null;
            }
            if (str2 != null && n.s(str2, this.f30014a.getPackageName(), true)) {
                return true;
            }
            return false;
        }
        return AbstractC3159y.d(str, "2");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (!aVar.O(this.f30014a)) {
            c(this.f30018e, this.f30016c, this.f30014a);
            ArrayList<? extends Parcelable> G8 = aVar.G();
            if (G8 != null && G8.size() > 0) {
                if (SettingsPreferences.f29309b.c0(this.f30014a)) {
                    if (!C3332t.f34516a.f() && !this.f30015b) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("apps_parcelable", G8);
                        C3307A.f34459a.g().send(105, bundle);
                    } else {
                        b(G8);
                    }
                } else {
                    b(G8);
                }
            } else {
                InstallUpdatesWorker.f30028b.b(this.f30014a);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        return success;
    }
}
