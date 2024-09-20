package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.f.a;
import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* loaded from: classes4.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* renamed from: a, reason: collision with root package name */
    private d f18685a;

    /* renamed from: b, reason: collision with root package name */
    private c f18686b;

    /* renamed from: c, reason: collision with root package name */
    private f f18687c;

    /* renamed from: d, reason: collision with root package name */
    private h f18688d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f18689e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f18690f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f18690f = dyOption;
        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f18689e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f18686b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f18685a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f18689e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f18687c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        a aVar = new a(this.f18690f);
        d dVar = this.f18685a;
        if (dVar != null) {
            dVar.a(aVar);
        }
        c cVar = this.f18686b;
        if (cVar != null) {
            cVar.a(aVar);
        }
        f fVar = this.f18687c;
        if (fVar != null) {
            fVar.a(aVar);
        }
        h hVar = this.f18688d;
        if (hVar != null) {
            hVar.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f18688d = hVar;
        }
    }
}
