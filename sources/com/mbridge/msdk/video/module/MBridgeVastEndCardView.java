package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.widget.a;

/* loaded from: classes4.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f22413n;

    /* renamed from: o, reason: collision with root package name */
    private View f22414o;

    /* renamed from: p, reason: collision with root package name */
    private View f22415p;

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f22246f) {
            this.f22414o.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.f22245e.a(104, "");
                }
            });
            this.f22415p.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
                    mBridgeVastEndCardView.f22245e.a(108, mBridgeVastEndCardView.d());
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_vast");
        if (findLayout >= 0) {
            this.f22243c.inflate(findLayout, this);
            this.f22413n = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f22414o = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f22415p = findViewById;
            this.f22246f = isNotNULL(this.f22413n, this.f22414o, findViewById);
            c();
            if (this.f22246f) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f22413n.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.f22245e.a(111, "");
    }

    public void preLoadData(b bVar) {
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
