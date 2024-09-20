package com.mbridge.msdk.newinterstitial.out;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* loaded from: classes4.dex */
public class NewInterstitialListenerWrapper implements RewardVideoListener {

    /* renamed from: a, reason: collision with root package name */
    private final NewInterstitialListener f20680a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f20681b = new Handler(Looper.getMainLooper());

    public NewInterstitialListenerWrapper(NewInterstitialListener newInterstitialListener) {
        this.f20680a = newInterstitialListener;
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onAdClose(mBridgeIds, rewardInfo);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdCloseWithIVReward(final MBridgeIds mBridgeIds, final boolean z8, final int i8) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onAdCloseWithNIReward(mBridgeIds, new RewardInfo(z8, i8));
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdShow(final MBridgeIds mBridgeIds) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onAdShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onEndcardShow(final MBridgeIds mBridgeIds) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onEndcardShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onLoadSuccess(final MBridgeIds mBridgeIds) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onLoadCampaignSuccess(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onShowFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onAdClicked(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoComplete(final MBridgeIds mBridgeIds) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onVideoComplete(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onResourceLoadFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
        this.f20681b.post(new Runnable() { // from class: com.mbridge.msdk.newinterstitial.out.NewInterstitialListenerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (NewInterstitialListenerWrapper.this.f20680a != null) {
                    NewInterstitialListenerWrapper.this.f20680a.onResourceLoadSuccess(mBridgeIds);
                }
            }
        });
    }
}
