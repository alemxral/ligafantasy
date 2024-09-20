package com.mbridge.msdk.foundation.same.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.k;
import java.io.File;

/* loaded from: classes4.dex */
public final class e extends com.mbridge.msdk.foundation.same.e.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19520a;

    /* renamed from: b, reason: collision with root package name */
    private String f19521b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19522c;

    /* renamed from: d, reason: collision with root package name */
    private String f19523d;

    /* renamed from: e, reason: collision with root package name */
    private a f19524e;

    /* renamed from: f, reason: collision with root package name */
    private String f19525f;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public e(String str, String str2, String str3) {
        this.f19520a = false;
        this.f19522c = false;
        this.f19523d = str;
        this.f19521b = str2;
        this.f19525f = str3;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z8) {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        if (!this.f19522c) {
            if (TextUtils.isEmpty(this.f19525f)) {
                a(this.f19521b, "save path is null.");
                return;
            }
            File file = new File(this.f19525f);
            if (file.exists() && file.length() > 0) {
                a();
                return;
            } else {
                b();
                return;
            }
        }
        b();
    }

    private void b() {
        try {
            File file = new File(this.f19525f);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.mbridge.msdk.foundation.same.net.h.c.downloadFile(file, this.f19521b, new com.mbridge.msdk.foundation.same.net.f<Void>() { // from class: com.mbridge.msdk.foundation.same.c.e.1
                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onError(final com.mbridge.msdk.foundation.same.net.b.a aVar) {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.e.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar = e.this;
                            eVar.a(eVar.f19521b, "load image from http faild because http return code: " + aVar.f19588a + ".image url is " + e.this.f19521b);
                        }
                    };
                    if (e.this.f19520a) {
                        com.mbridge.msdk.foundation.same.f.b.c().execute(runnable);
                    } else {
                        runnable.run();
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onFinish() {
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onProgressChange(long j8, long j9) {
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onSuccess(k kVar) {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.e.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            String unused = e.this.f19525f;
                            e.this.a();
                        }
                    };
                    if (e.this.f19520a) {
                        com.mbridge.msdk.foundation.same.f.b.c().execute(runnable);
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (Exception e8) {
            a(this.f19521b, e8.getMessage());
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        } catch (OutOfMemoryError e9) {
            a(this.f19521b, e9.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        a aVar = this.f19524e;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    public final void a(a aVar) {
        this.f19524e = aVar;
    }

    public final void a(boolean z8) {
        this.f19522c = z8;
    }

    public e(String str, String str2, String str3, h hVar) {
        this.f19522c = false;
        this.f19523d = str;
        this.f19521b = str2;
        this.f19525f = str3;
        this.f19520a = true;
    }

    protected final void a() {
        if (new File(this.f19525f).exists()) {
            String str = this.f19521b;
            String str2 = this.f19525f;
            a aVar = this.f19524e;
            if (aVar != null) {
                aVar.a(str, str2);
                return;
            }
            return;
        }
        a(this.f19521b, "load image faild.because file[" + this.f19525f + "] is not exist!");
    }
}
