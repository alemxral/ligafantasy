package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class MBAdChoice extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23147a;

    /* renamed from: b, reason: collision with root package name */
    private String f23148b;

    /* renamed from: c, reason: collision with root package name */
    private String f23149c;

    /* renamed from: d, reason: collision with root package name */
    private String f23150d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f23151e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.d.a f23152f;

    public MBAdChoice(Context context) {
        super(context);
        this.f23148b = "";
        this.f23149c = "";
        this.f23150d = "";
        this.f23147a = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f23152f == null) {
            this.f23152f = new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.widget.MBAdChoice.1
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                }
            };
        }
        ai.a(this.f23151e, this.f23152f, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        boolean z8;
        if (campaign instanceof CampaignEx) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            this.f23151e = campaignEx;
            g b8 = h.a().b(c.m().k());
            this.f23151e = campaignEx;
            if (campaignEx != null) {
                String privacyUrl = campaignEx.getPrivacyUrl();
                this.f23149c = privacyUrl;
                if (TextUtils.isEmpty(privacyUrl)) {
                    CampaignEx.a adchoice = campaignEx.getAdchoice();
                    if (adchoice != null) {
                        this.f23149c = adchoice.c();
                    }
                    if (TextUtils.isEmpty(this.f23149c) && b8 != null) {
                        this.f23149c = b8.g();
                    }
                    if (TextUtils.isEmpty(this.f23149c)) {
                        this.f23149c = d.f().f19686f;
                    }
                }
            } else if (b8 != null) {
                this.f23149c = b8.g();
            }
            this.f23151e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice2 = campaignEx.getAdchoice();
                if (adchoice2 != null) {
                    this.f23148b = adchoice2.b();
                }
                if (TextUtils.isEmpty(this.f23148b) && b8 != null) {
                    this.f23148b = b8.f();
                }
            } else if (b8 != null) {
                this.f23148b = b8.f();
            }
            this.f23151e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice3 = campaignEx.getAdchoice();
                if (adchoice3 != null) {
                    this.f23150d = adchoice3.d();
                }
                if (TextUtils.isEmpty(this.f23150d) && b8 != null) {
                    this.f23150d = b8.h();
                }
            } else if (b8 != null) {
                this.f23150d = b8.h();
            }
            if (!TextUtils.isEmpty(this.f23148b) && !TextUtils.isEmpty(this.f23149c) && !TextUtils.isEmpty(this.f23150d)) {
                z8 = true;
            } else {
                z8 = false;
            }
            setImageUrl(this.f23148b);
            if (z8 && this.f23147a != null) {
                b.a(c.m().c()).a(this.f23148b, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.widget.MBAdChoice.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        MBAdChoice.this.setImageBitmap(bitmap);
                    }
                });
                return;
            }
            return;
        }
        this.f23151e = null;
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.d.a aVar) {
        this.f23152f = aVar;
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23148b = "";
        this.f23149c = "";
        this.f23150d = "";
        this.f23147a = context;
        a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f23148b = "";
        this.f23149c = "";
        this.f23150d = "";
        this.f23147a = context;
        a();
    }
}
