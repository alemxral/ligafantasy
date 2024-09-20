package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f18608a;

    /* renamed from: b, reason: collision with root package name */
    private String f18609b;

    /* renamed from: c, reason: collision with root package name */
    private String f18610c;

    /* renamed from: d, reason: collision with root package name */
    private String f18611d;

    /* renamed from: e, reason: collision with root package name */
    private String f18612e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f18613f;

    /* renamed from: g, reason: collision with root package name */
    private int f18614g;

    /* renamed from: h, reason: collision with root package name */
    private int f18615h;

    /* renamed from: i, reason: collision with root package name */
    private float f18616i;

    /* renamed from: j, reason: collision with root package name */
    private float f18617j;

    /* renamed from: k, reason: collision with root package name */
    private int f18618k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f18608a = dyOption;
        this.f18613f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f18610c;
    }

    public String getAppInfo() {
        return this.f18609b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public CampaignEx getBindData() {
        return this.f18613f;
    }

    public int getClickType() {
        return this.f18618k;
    }

    public String getCountDownText() {
        return this.f18611d;
    }

    public DyOption getDyOption() {
        return this.f18608a;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public DyOption getEffectData() {
        return this.f18608a;
    }

    public int getLogoImage() {
        return this.f18615h;
    }

    public String getLogoText() {
        return this.f18612e;
    }

    public int getNoticeImage() {
        return this.f18614g;
    }

    public float getxInScreen() {
        return this.f18616i;
    }

    public float getyInScreen() {
        return this.f18617j;
    }

    public void setAdClickText(String str) {
        this.f18610c = str;
    }

    public void setAppInfo(String str) {
        this.f18609b = str;
    }

    public void setClickType(int i8) {
        this.f18618k = i8;
    }

    public void setCountDownText(String str) {
        this.f18611d = str;
    }

    public void setLogoImage(int i8) {
        this.f18615h = i8;
    }

    public void setLogoText(String str) {
        this.f18612e = str;
    }

    public void setNoticeImage(int i8) {
        this.f18614g = i8;
    }

    public void setxInScreen(float f8) {
        this.f18616i = f8;
    }

    public void setyInScreen(float f8) {
        this.f18617j = f8;
    }
}
