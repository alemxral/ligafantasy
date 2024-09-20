package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class DyOption {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f18699a;

    /* renamed from: b, reason: collision with root package name */
    private File f18700b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f18701c;

    /* renamed from: d, reason: collision with root package name */
    private DyAdType f18702d;

    /* renamed from: e, reason: collision with root package name */
    private String f18703e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18704f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18705g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18706h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18707i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18708j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18709k;

    /* renamed from: l, reason: collision with root package name */
    private int f18710l;

    /* renamed from: m, reason: collision with root package name */
    private int f18711m;

    /* renamed from: n, reason: collision with root package name */
    private int f18712n;

    /* renamed from: o, reason: collision with root package name */
    private int f18713o;

    /* renamed from: p, reason: collision with root package name */
    private int f18714p;

    /* renamed from: q, reason: collision with root package name */
    private int f18715q;

    /* renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f18716r;

    /* loaded from: classes4.dex */
    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f18717a;

        /* renamed from: b, reason: collision with root package name */
        private File f18718b;

        /* renamed from: c, reason: collision with root package name */
        private CampaignEx f18719c;

        /* renamed from: d, reason: collision with root package name */
        private DyAdType f18720d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f18721e;

        /* renamed from: f, reason: collision with root package name */
        private String f18722f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f18723g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f18724h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f18725i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f18726j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18727k;

        /* renamed from: l, reason: collision with root package name */
        private int f18728l;

        /* renamed from: m, reason: collision with root package name */
        private int f18729m;

        /* renamed from: n, reason: collision with root package name */
        private int f18730n;

        /* renamed from: o, reason: collision with root package name */
        private int f18731o;

        /* renamed from: p, reason: collision with root package name */
        private int f18732p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f18722f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f18719c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z8) {
            this.f18721e = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i8) {
            this.f18731o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f18720d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f18718b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f18717a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z8) {
            this.f18726j = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z8) {
            this.f18724h = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z8) {
            this.f18727k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z8) {
            this.f18723g = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z8) {
            this.f18725i = z8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i8) {
            this.f18730n = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i8) {
            this.f18728l = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i8) {
            this.f18729m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i8) {
            this.f18732p = i8;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z8);

        IViewOptionBuilder countDownTime(int i8);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z8);

        IViewOptionBuilder isClickButtonVisible(boolean z8);

        IViewOptionBuilder isLogoVisible(boolean z8);

        IViewOptionBuilder isScreenClick(boolean z8);

        IViewOptionBuilder isShakeVisible(boolean z8);

        IViewOptionBuilder orientation(int i8);

        IViewOptionBuilder shakeStrenght(int i8);

        IViewOptionBuilder shakeTime(int i8);

        IViewOptionBuilder templateType(int i8);
    }

    public DyOption(Builder builder) {
        this.f18699a = builder.f18717a;
        this.f18700b = builder.f18718b;
        this.f18701c = builder.f18719c;
        this.f18702d = builder.f18720d;
        this.f18705g = builder.f18721e;
        this.f18703e = builder.f18722f;
        this.f18704f = builder.f18723g;
        this.f18706h = builder.f18724h;
        this.f18708j = builder.f18726j;
        this.f18707i = builder.f18725i;
        this.f18709k = builder.f18727k;
        this.f18710l = builder.f18728l;
        this.f18711m = builder.f18729m;
        this.f18712n = builder.f18730n;
        this.f18713o = builder.f18731o;
        this.f18715q = builder.f18732p;
    }

    public String getAdChoiceLink() {
        return this.f18703e;
    }

    public CampaignEx getCampaignEx() {
        return this.f18701c;
    }

    public int getCountDownTime() {
        return this.f18713o;
    }

    public int getCurrentCountDown() {
        return this.f18714p;
    }

    public DyAdType getDyAdType() {
        return this.f18702d;
    }

    public File getFile() {
        return this.f18700b;
    }

    public List<String> getFileDirs() {
        return this.f18699a;
    }

    public int getOrientation() {
        return this.f18712n;
    }

    public int getShakeStrenght() {
        return this.f18710l;
    }

    public int getShakeTime() {
        return this.f18711m;
    }

    public int getTemplateType() {
        return this.f18715q;
    }

    public boolean isApkInfoVisible() {
        return this.f18708j;
    }

    public boolean isCanSkip() {
        return this.f18705g;
    }

    public boolean isClickButtonVisible() {
        return this.f18706h;
    }

    public boolean isClickScreen() {
        return this.f18704f;
    }

    public boolean isLogoVisible() {
        return this.f18709k;
    }

    public boolean isShakeVisible() {
        return this.f18707i;
    }

    public void setDyCountDownListener(int i8) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f18716r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i8);
        }
        this.f18714p = i8;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f18716r = dyCountDownListenerWrapper;
    }
}
