package com.mbridge.msdk.video.dynview.ordercamp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.dynview.h.b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22188a = false;

    /* renamed from: b, reason: collision with root package name */
    private C0434a f22189b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f22190c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0434a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f22194a;

        /* renamed from: b, reason: collision with root package name */
        MBRotationView f22195b;

        /* renamed from: c, reason: collision with root package name */
        MBridgeImageView f22196c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f22197d;

        /* renamed from: e, reason: collision with root package name */
        TextView f22198e;

        /* renamed from: f, reason: collision with root package name */
        TextView f22199f;

        /* renamed from: g, reason: collision with root package name */
        TextView f22200g;

        /* renamed from: h, reason: collision with root package name */
        TextView f22201h;

        /* renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f22202i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f22203j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f22204k;

        /* renamed from: l, reason: collision with root package name */
        MBCusRoundImageView f22205l;

        /* renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f22206m;

        /* renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f22207n;

        /* renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f22208o;

        /* renamed from: p, reason: collision with root package name */
        MBFrameLayout f22209p;

        C0434a() {
        }
    }

    public a(List<CampaignEx> list) {
        this.f22190c = list;
    }

    private View a(int i8) {
        View view;
        String str;
        String str2;
        try {
            List<CampaignEx> list = this.f22190c;
            str = "";
            if (list != null && list.get(i8) != null) {
                str2 = this.f22190c.get(i8).getMof_tplid() + "";
                str = this.f22190c.get(i8).getCMPTEntryUrl();
            } else {
                str2 = "501";
            }
        } catch (Exception e8) {
            ad.b("OrderCampAdapter", e8.getMessage());
            view = null;
        }
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        int r8 = z.r(c.m().c());
        String a8 = n.a(0, str2, str);
        if (TextUtils.isEmpty(a8)) {
            return a();
        }
        File file = new File(a8 + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> a9 = ab.a(a8, "template_" + str2 + "_" + r8 + "_item");
            if (a9 == null) {
                return a();
            }
            int r9 = z.r(c.m().c());
            h.a().b(c.m().k());
            view = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f22190c.get(i8)).fileDirs(a9).dyAdType(DyAdType.REWARD).orientation(r9).adChoiceLink(ai.a(this.f22190c.get(i8))).build());
            if (view != null) {
                this.f22188a = true;
                C0434a c0434a = new C0434a();
                this.f22189b = c0434a;
                c0434a.f22205l = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_iv"));
                this.f22189b.f22204k = (ImageView) view.findViewById(c("mbridge_lv_iv_burl"));
                this.f22189b.f22206m = (MBCusRoundImageView) view.findViewById(c("mbridge_lv_icon_iv"));
                this.f22189b.f22207n = (MBStarLevelLayoutView) view.findViewById(c("mbridge_lv_sv_starlevel"));
                this.f22189b.f22209p = (MBFrameLayout) view.findViewById(c("mbridge_lv_ration"));
                view.setTag(this.f22189b);
            }
            return this.f22188a ? view : a();
        }
        return a();
    }

    private int b(String str) {
        return v.a(c.m().c().getApplicationContext(), str, "id");
    }

    private int c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    private int d(String str) {
        if (this.f22188a) {
            return c(str);
        }
        return b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<CampaignEx> list = this.f22190c;
        if (list != null && list.size() > 0) {
            return this.f22190c.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i8) {
        List<CampaignEx> list = this.f22190c;
        if (list != null) {
            return list.get(i8);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.Adapter
    public final View getView(int i8, View view, ViewGroup viewGroup) {
        View view2;
        try {
            if (view == null) {
                view2 = a(i8);
            } else {
                this.f22189b = (C0434a) view.getTag();
                view2 = view;
            }
            try {
                this.f22189b.f22194a = (RelativeLayout) view2.findViewById(d("mbridge_lv_item_rl"));
                this.f22189b.f22198e = (TextView) view2.findViewById(d("mbridge_lv_title_tv"));
                this.f22189b.f22200g = (TextView) view2.findViewById(d("mbridge_lv_tv_install"));
                this.f22189b.f22208o = (MBHeatLevelLayoutView) view2.findViewById(d("mbridge_lv_sv_heat_level"));
                this.f22189b.f22199f = (TextView) view2.findViewById(d("mbridge_lv_desc_tv"));
                this.f22189b.f22203j = (ImageView) view2.findViewById(d("mbridge_iv_flag"));
                this.f22189b.f22201h = (TextView) view2.findViewById(d("mbridge_order_viewed_tv"));
                double d8 = 5.0d;
                if (this.f22188a) {
                    List<CampaignEx> list = this.f22190c;
                    if (list != null && this.f22189b != null && list.size() != 0) {
                        MBCusRoundImageView mBCusRoundImageView = this.f22189b.f22205l;
                        if (mBCusRoundImageView != null && (mBCusRoundImageView instanceof MBCusRoundImageView)) {
                            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                            a(this.f22189b.f22205l, this.f22190c.get(i8).getImageUrl(), false);
                        }
                        ImageView imageView = this.f22189b.f22204k;
                        if (imageView != null) {
                            a(imageView, this.f22190c.get(i8).getImageUrl(), false);
                        }
                        MBCusRoundImageView mBCusRoundImageView2 = this.f22189b.f22206m;
                        if (mBCusRoundImageView2 != null && (mBCusRoundImageView2 instanceof MBCusRoundImageView)) {
                            mBCusRoundImageView2.setBorder(50, 20, -1);
                            a(this.f22189b.f22206m, this.f22190c.get(i8).getIconUrl(), true);
                        }
                        double rating = this.f22190c.get(i8).getRating();
                        if (rating > 0.0d) {
                            d8 = rating;
                        }
                        MBStarLevelLayoutView mBStarLevelLayoutView = this.f22189b.f22207n;
                        if (mBStarLevelLayoutView != null) {
                            mBStarLevelLayoutView.setRating((int) d8);
                            this.f22189b.f22207n.setOrientation(0);
                        }
                        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f22189b.f22208o;
                        if (mBHeatLevelLayoutView != null) {
                            mBHeatLevelLayoutView.setHeatCount(this.f22190c.get(i8).getNumberRating());
                        }
                    }
                } else {
                    List<CampaignEx> list2 = this.f22190c;
                    if (list2 != null && this.f22189b != null && list2.size() != 0) {
                        MBridgeImageView mBridgeImageView = this.f22189b.f22196c;
                        if (mBridgeImageView != null) {
                            a(mBridgeImageView, this.f22190c.get(i8).getImageUrl(), false);
                        }
                        ImageView imageView2 = this.f22189b.f22204k;
                        if (imageView2 != null) {
                            a(imageView2, this.f22190c.get(i8).getImageUrl(), false);
                        }
                        RoundImageView roundImageView = this.f22189b.f22197d;
                        if (roundImageView != null) {
                            roundImageView.setBorderRadius(25);
                            a(this.f22189b.f22197d, this.f22190c.get(i8).getIconUrl(), true);
                        }
                        double rating2 = this.f22190c.get(i8).getRating();
                        if (rating2 > 0.0d) {
                            d8 = rating2;
                        }
                        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f22189b.f22202i;
                        if (mBridgeLevelLayoutView != null) {
                            mBridgeLevelLayoutView.setRatingAndUser(d8, this.f22190c.get(i8).getNumberRating());
                            this.f22189b.f22202i.setOrientation(0);
                        }
                        MBRotationView mBRotationView = this.f22189b.f22195b;
                        if (mBRotationView != null) {
                            mBRotationView.setWidthRatio(1.0f);
                            this.f22189b.f22195b.setHeightRatio(1.0f);
                            this.f22189b.f22195b.setAutoscroll(false);
                        }
                        MBridgeImageView mBridgeImageView2 = this.f22189b.f22196c;
                        if (mBridgeImageView2 != null) {
                            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                        }
                    }
                }
                C0434a c0434a = this.f22189b;
                if (c0434a != null) {
                    if (c0434a.f22198e != null) {
                        this.f22189b.f22198e.setText(this.f22190c.get(i8).getAppName());
                    }
                    if (this.f22189b.f22199f != null) {
                        this.f22189b.f22199f.setText(this.f22190c.get(i8).getAppDesc());
                    }
                    if (this.f22189b.f22200g != null) {
                        String adCall = this.f22190c.get(i8).getAdCall();
                        if (this.f22189b.f22200g instanceof MBridgeTextView) {
                            ((MBridgeTextView) this.f22189b.f22200g).setObjectAnimator(new b().c(this.f22189b.f22200g));
                        }
                        this.f22189b.f22200g.setText(adCall);
                    }
                    if (this.f22189b.f22203j != null) {
                        try {
                            String language = Locale.getDefault().getLanguage();
                            Context c8 = c.m().c();
                            if (c8 != null) {
                                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                                    this.f22189b.f22203j.setImageDrawable(c8.getResources().getDrawable(c8.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                                } else {
                                    this.f22189b.f22203j.setImageDrawable(c8.getResources().getDrawable(c8.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                                }
                            }
                        } catch (Exception e8) {
                            ad.b("OrderCampAdapter", e8.getMessage());
                        }
                        ai.a(2, this.f22189b.f22203j, this.f22190c.get(i8), c.m().c(), false, null);
                    }
                    if (this.f22189b.f22201h != null) {
                        try {
                            this.f22189b.f22201h.setText(c.m().c().getResources().getString(c.m().c().getResources().getIdentifier("mbridge_reward_viewed_text_str", TypedValues.Custom.S_STRING, c.m().g())));
                            this.f22189b.f22201h.setVisibility(0);
                        } catch (Exception e9) {
                            ad.b("OrderCampAdapter", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                e = e10;
                ad.b("OrderCampAdapter", e.getMessage());
                return view2;
            }
        } catch (Exception e11) {
            e = e11;
            view2 = view;
        }
        return view2;
    }

    private View a() {
        View inflate = LayoutInflater.from(c.m().c()).inflate(a("mbridge_order_layout_item"), (ViewGroup) null);
        C0434a c0434a = new C0434a();
        this.f22189b = c0434a;
        c0434a.f22196c = (MBridgeImageView) inflate.findViewById(b("mbridge_lv_iv"));
        this.f22189b.f22204k = (ImageView) inflate.findViewById(b("mbridge_lv_iv_burl"));
        this.f22189b.f22197d = (RoundImageView) inflate.findViewById(b("mbridge_lv_icon_iv"));
        this.f22189b.f22202i = (MBridgeLevelLayoutView) inflate.findViewById(b("mbridge_lv_sv_starlevel"));
        this.f22189b.f22195b = (MBRotationView) inflate.findViewById(b("mbridge_lv_ration"));
        inflate.setTag(this.f22189b);
        return inflate;
    }

    private void a(final ImageView imageView, String str, final boolean z8) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.ordercamp.a.a.1
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str2, String str3) {
                    if (z8) {
                        imageView.setVisibility(8);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str2) {
                    try {
                        if (!bitmap.isRecycled()) {
                            imageView.setImageBitmap(bitmap);
                        }
                    } catch (Throwable th) {
                        ad.b("OrderCampAdapter", th.getMessage());
                    }
                }
            });
        } else if (z8) {
            imageView.setVisibility(8);
        }
    }

    private int a(String str) {
        return v.a(c.m().c().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }
}
