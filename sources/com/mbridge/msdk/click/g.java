package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* loaded from: classes4.dex */
public final class g extends AppletSchemeCallBack {

    /* renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f18125a;

    /* renamed from: b, reason: collision with root package name */
    private final CampaignEx f18126b;

    /* renamed from: c, reason: collision with root package name */
    private final AppletsModel f18127c;

    /* renamed from: d, reason: collision with root package name */
    private final a f18128d;

    public g(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f18125a = nativeTrackingListener;
        this.f18126b = campaignEx;
        this.f18127c = appletsModel;
        this.f18128d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestFailed(int i8, String str, String str2) {
        CampaignEx campaignEx = this.f18126b;
        if (campaignEx != null && this.f18127c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f18125a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f18127c.setUserClick(false);
                this.f18127c.setRequestingFinish();
                this.f18126b.setClickURL(str2);
                a aVar = this.f18128d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f18126b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f18126b;
        if (campaignEx != null && this.f18127c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f18125a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f18127c.setUserClick(false);
                this.f18127c.setRequestingFinish();
                this.f18126b.setDeepLinkUrl(str);
                a aVar = this.f18128d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f18126b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }
}
