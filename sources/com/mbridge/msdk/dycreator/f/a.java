package com.mbridge.msdk.dycreator.f;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class a implements com.mbridge.msdk.dycreator.f.a.a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f18675a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f18676b;

    public a(DyOption dyOption) {
        this.f18675a = dyOption;
        this.f18676b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final CampaignEx getBindData() {
        return this.f18676b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final DyOption getEffectData() {
        return this.f18675a;
    }
}
