package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20325a = "b";

    /* renamed from: b, reason: collision with root package name */
    private Context f20326b;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.a.c f20328d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f20329e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f20330f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.d f20331g;

    /* renamed from: c, reason: collision with root package name */
    private int f20327c = 0;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f20332h = false;

    /* renamed from: i, reason: collision with root package name */
    private Timer f20333i = new Timer();

    /* renamed from: j, reason: collision with root package name */
    private volatile List<String> f20334j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f20335k = false;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f20336l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f20337m = false;

    /* renamed from: n, reason: collision with root package name */
    private String f20338n = "";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        private b f20350a;

        /* renamed from: b, reason: collision with root package name */
        private String f20351b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f20352c;

        public a(b bVar, String str, CampaignEx campaignEx) {
            this.f20350a = bVar;
            this.f20351b = str;
            this.f20352c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.f20325a, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f20350a;
            if (bVar != null) {
                bVar.a(this.f20351b, 1, str2, false, this.f20352c);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (MBridgeConstans.DEBUG) {
                ad.c(b.f20325a, "DownloadImageListener campaign image success");
            }
            b bVar = this.f20350a;
            if (bVar != null) {
                bVar.a(this.f20351b, 1, str, true, this.f20352c);
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.a.c cVar, com.mbridge.msdk.mbbanner.common.b.b bVar, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.f20326b = context.getApplicationContext();
        this.f20328d = cVar;
        this.f20330f = bVar;
        this.f20329e = aVar;
    }

    private int b(String str) {
        try {
            int b8 = this.f20328d.b();
            if (b8 > this.f20328d.c()) {
                return 0;
            }
            return b8;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    private void a(String str) {
        if (this.f20337m) {
            return;
        }
        if ((this.f20335k || this.f20336l) && this.f20334j.size() == 0) {
            ad.c(f20325a, "在子线程处理业务逻辑 完成");
            this.f20332h = true;
            this.f20337m = true;
            this.f20333i.cancel();
            this.f20329e.a(this.f20330f, str);
            this.f20331g.a(str);
        }
    }

    public final void a(String str, int i8, String str2, boolean z8, CampaignEx campaignEx) {
        if (z8) {
            if (i8 == 1) {
                ad.c(f20325a, "downloadResource--> Success Image");
                synchronized (this) {
                    try {
                        this.f20334j.remove(str2);
                        if (this.f20334j.size() == 0) {
                            a(str);
                        }
                    } finally {
                    }
                }
                return;
            }
            if (i8 == 2) {
                ad.c(f20325a, "downloadResource--> Success banner_html");
                this.f20336l = true;
                a(str);
                return;
            } else {
                if (i8 == 3) {
                    ad.c(f20325a, "downloadResource--> Success banner_url");
                    this.f20335k = true;
                    a(str);
                    return;
                }
                return;
            }
        }
        if (i8 == -1) {
            ad.b(f20325a, " unitId =" + str + " --> time out!");
        }
        this.f20333i.cancel();
        String str3 = f20325a;
        ad.c(str3, "在子线程处理业务逻辑 完成");
        ad.c(str3, "downloadResource--> Fail");
        this.f20332h = true;
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.a(campaignEx);
        this.f20329e.b(this.f20330f, bVar);
        this.f20331g.a(str);
    }

    public final void a(String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.d dVar) {
        boolean z8;
        try {
            ad.c(f20325a, "requestCampaign--> started");
            this.f20331g = dVar;
            com.mbridge.msdk.mbbanner.common.f.a aVar = new com.mbridge.msdk.mbbanner.common.f.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.2
                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(CampaignUnit campaignUnit) {
                    try {
                        ad.c(b.f20325a, "requestCampaign--> Succeed");
                        b.this.f20329e.a(b.this.f20330f, campaignUnit, this.unitId);
                        b.a(b.this, this.unitId, campaignUnit);
                    } catch (Exception e8) {
                        ad.c(b.f20325a, "requestCampaign--> Fail with exception = " + e8.getMessage());
                        com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880000);
                        bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                        bVar2.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                        bVar2.a((Throwable) e8);
                        b.this.f20329e.a(b.this.f20330f, bVar2);
                        b.this.f20331g.a(this.unitId);
                    }
                }

                @Override // com.mbridge.msdk.mbbanner.common.f.a
                public final void a(int i8, String str3) {
                    ad.c(b.f20325a, "requestCampaign--> Fail errorCode:" + i8 + " msg:" + str3);
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
                    bVar2.a(i8 + "#" + str3);
                    bVar2.a(new MBridgeIds(this.placementId, this.unitId));
                    b.this.f20329e.a(b.this.f20330f, bVar2);
                    b.this.f20331g.a(this.unitId);
                }
            };
            aVar.setUnitId(str2);
            aVar.setPlacementId(str);
            aVar.setAdType(296);
            com.mbridge.msdk.mbbanner.common.e.a aVar2 = new com.mbridge.msdk.mbbanner.common.e.a(this.f20326b);
            this.f20327c = b(str2);
            e a8 = com.mbridge.msdk.mbbanner.common.a.d.a(false, this.f20326b, str2, this.f20328d.a(), this.f20327c, bVar);
            String d8 = ai.d(str2);
            if (!TextUtils.isEmpty(d8)) {
                a8.a("j", d8);
            }
            String c8 = bVar.c();
            if (TextUtils.isEmpty(c8)) {
                z8 = false;
            } else {
                aVar.a(c8);
                z8 = true;
            }
            this.f20329e.a(z8);
            aVar2.choiceV3OrV5BySetting(1, a8, aVar, c8);
        } catch (Exception e8) {
            ad.b(f20325a, e8.getMessage());
            com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880002);
            bVar2.a(new MBridgeIds(str, str2));
            this.f20329e.a(this.f20330f, bVar2);
            this.f20331g.a(str2);
        }
    }

    private List<CampaignEx> a(final String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    ad.c(f20325a, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    for (int i8 = 0; i8 < ads.size(); i8++) {
                        final CampaignEx campaignEx = ads.get(i8);
                        if (campaignEx != null) {
                            if (campaignEx.getOfferType() != 99) {
                                if (TextUtils.isEmpty(campaignEx.getBannerUrl()) && TextUtils.isEmpty(campaignEx.getBannerHtml()) && TextUtils.isEmpty(campaignEx.getImageUrl())) {
                                }
                                if (ai.c(campaignEx)) {
                                    campaignEx.setRtinsType(ai.c(this.f20326b, campaignEx.getPackageName()) ? 1 : 2);
                                }
                                if (com.mbridge.msdk.foundation.same.c.a(this.f20326b, campaignEx)) {
                                    arrayList.add(campaignEx);
                                } else {
                                    ai.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f19423x);
                                    this.f20338n = "APP ALREADY INSTALLED";
                                }
                                final Context context = this.f20326b;
                                try {
                                    final com.mbridge.msdk.foundation.same.report.d.a.a aVar = null;
                                    com.mbridge.msdk.foundation.same.c.a(campaignEx, context, null, new c.a() { // from class: com.mbridge.msdk.mbbanner.common.c.b.3
                                        @Override // com.mbridge.msdk.foundation.same.c.a
                                        public final void a(String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                                            if (!TextUtils.isEmpty(str2)) {
                                                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                                                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                                                bVar.a(str2, dVar);
                                                try {
                                                    com.mbridge.msdk.foundation.same.report.d.c.a().a(str2, bVar, campaignEx, context, aVar);
                                                } catch (Exception e8) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        e8.printStackTrace();
                                                    }
                                                }
                                            }
                                        }
                                    });
                                } catch (Exception e8) {
                                    if (MBridgeConstans.DEBUG) {
                                        e8.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                    ad.c(f20325a, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return arrayList;
    }

    private void a(String str, List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f20334j.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.c.b.a(this.f20326b).a(campaignEx.getImageUrl(), new a(this, str, campaignEx));
            }
        }
    }

    private String a(String str, String str2, CampaignEx campaignEx) {
        File file;
        Throwable th;
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        String a8 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(ao.b(str2));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        File file2 = new File(a8, md5.concat(".html"));
                        Uri.parse(str2).getPath();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        try {
                            fileOutputStream2.write(str2.getBytes());
                            fileOutputStream2.flush();
                            str3 = file2.getAbsolutePath();
                            fileOutputStream2.close();
                        } catch (Exception e8) {
                            e = e8;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            file = new File(str3);
                            if (!file.exists()) {
                            }
                            a(str, 2, str2, false, campaignEx);
                            return str3;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            file = new File(str3);
            if (!file.exists() && file.isFile() && file.canRead()) {
                a(str, 2, str2, true, campaignEx);
            } else {
                a(str, 2, str2, false, campaignEx);
            }
        }
        return str3;
    }

    static /* synthetic */ void a(b bVar, final String str, final CampaignUnit campaignUnit) {
        com.mbridge.msdk.foundation.c.b bVar2;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar3.a(mBridgeIds);
            bVar.f20329e.a(bVar.f20330f, bVar3);
            bVar.f20331g.a(str);
            return;
        }
        List<CampaignEx> a8 = bVar.a(str, campaignUnit);
        new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                ad.c(b.f20325a, "在单独子线程保存数据库 开始");
                k.a(h.a(b.this.f20326b)).a();
                CampaignUnit campaignUnit2 = campaignUnit;
                if (campaignUnit2 != null && campaignUnit2.getAds() != null && campaignUnit.getAds().size() > 0) {
                    BannerUtils.uisList(b.this.f20326b, campaignUnit.getAds());
                }
                ad.c(b.f20325a, "在单独子线程保存数据库 完成");
            }
        }).start();
        int i8 = 0;
        if (a8 != null && a8.size() != 0) {
            String str2 = f20325a;
            ad.c(str2, "在子线程处理业务逻辑 开始");
            final CampaignEx campaignEx2 = a8.get(0);
            bVar.f20333i.schedule(new TimerTask() { // from class: com.mbridge.msdk.mbbanner.common.c.b.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    if (!b.this.f20332h) {
                        b.this.f20332h = true;
                        b.this.a(str, -1, "", false, campaignEx2);
                    }
                }
            }, MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
            bVar.f20328d.a(campaignUnit.getSessionId());
            int i9 = bVar.f20327c;
            try {
                if (a8.size() > 0) {
                    i9 += a8.size();
                }
                if (i9 > bVar.f20328d.c()) {
                    ad.c(str2, "saveNextOffset 重置offset为0");
                    i9 = 0;
                }
                ad.c(str2, "saveNextOffset 算出 下次的offset是:" + i9);
                if (an.b(str)) {
                    bVar.f20328d.a(i9);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            String trim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!TextUtils.isEmpty(trim)) {
                    com.mbridge.msdk.mbbanner.common.b.e eVar = new com.mbridge.msdk.mbbanner.common.b.e(bVar, str, campaignEx2);
                    com.mbridge.msdk.foundation.same.report.d.b bVar4 = new com.mbridge.msdk.foundation.same.report.d.b();
                    bVar4.a(campaignEx2);
                    H5DownLoadManager.getInstance().download(bVar4, trim, eVar);
                }
                if (a8.size() > 0) {
                    while (i8 < a8.size()) {
                        a8.get(i8).setBannerUrl(campaignEx2.getBannerUrl());
                        a8.get(i8).setHasMBTplMark(true);
                        i8++;
                    }
                }
            } else {
                String trim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    String a9 = bVar.a(str, trim2, campaignEx2);
                    if (a8.size() > 0) {
                        while (i8 < a8.size()) {
                            a8.get(i8).setBannerHtml(a9);
                            a8.get(i8).setHasMBTplMark(trim2.contains("<MBTPLMARK>"));
                            i8++;
                        }
                    }
                } else {
                    bVar.f20336l = true;
                    bVar.f20335k = true;
                }
            }
            bVar.a(str, a8);
            return;
        }
        ad.c(f20325a, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (bVar.f20338n.contains("INSTALLED")) {
            bVar2 = new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        mBridgeIds2.setUnitId(str);
        bVar2.a(mBridgeIds2);
        if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
            bVar2.a(campaignEx);
        }
        bVar.f20329e.a(bVar.f20330f, bVar2);
        bVar.f20331g.a(str);
    }
}
