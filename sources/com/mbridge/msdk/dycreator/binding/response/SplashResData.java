package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* loaded from: classes4.dex */
public class SplashResData extends BaseRespData {

    /* renamed from: a, reason: collision with root package name */
    private a f18606a;

    /* renamed from: b, reason: collision with root package name */
    private EAction f18607b;

    public a getBaseViewData() {
        return this.f18606a;
    }

    public EAction geteAction() {
        return this.f18607b;
    }

    public void setBaseViewData(a aVar) {
        this.f18606a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f18607b = eAction;
    }
}
