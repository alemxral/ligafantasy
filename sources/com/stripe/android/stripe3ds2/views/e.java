package com.stripe.android.stripe3ds2.views;

import Q3.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.stripe.android.stripe3ds2.views.f;
import g6.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    private static final a f27084d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f27085e = Pattern.compile("method=\"post\"", 10);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f27086f = Pattern.compile("action=\"(.+?)\"", 10);

    /* renamed from: a, reason: collision with root package name */
    private final ThreeDS2WebView f27087a;

    /* renamed from: b, reason: collision with root package name */
    private String f27088b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnClickListener f27089c;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(e this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        if (str == null) {
            str = "";
        }
        this$0.f27088b = str;
        View.OnClickListener onClickListener = this$0.f27089c;
        if (onClickListener != null) {
            onClickListener.onClick(this$0);
        }
    }

    private final String d(String str) {
        String group;
        Matcher matcher = f27086f.matcher(str);
        if (matcher.find() && (group = matcher.group(1)) != null && !AbstractC3159y.d("https://emv3ds/challenge", group)) {
            return new j(group).f(str, "https://emv3ds/challenge");
        }
        return str;
    }

    private final String e(String str) {
        String replaceAll = f27085e.matcher(str).replaceAll("method=\"get\"");
        AbstractC3159y.h(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final void c(String str) {
        if (str == null) {
            return;
        }
        this.f27087a.loadDataWithBaseURL(null, f(str), "text/html", C.UTF8_NAME, null);
    }

    public final String f(String html) {
        AbstractC3159y.i(html, "html");
        return d(e(html));
    }

    public final View.OnClickListener getOnClickListener$3ds2sdk_release() {
        return this.f27089c;
    }

    public String getUserEntry() {
        return this.f27088b;
    }

    public final ThreeDS2WebView getWebView() {
        return this.f27087a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f27089c = onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.f27089c = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27088b = "";
        i b8 = i.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        ThreeDS2WebView webView = b8.f8235b;
        AbstractC3159y.h(webView, "webView");
        this.f27087a = webView;
        webView.setOnHtmlSubmitListener$3ds2sdk_release(new f.b() { // from class: a4.l
            @Override // com.stripe.android.stripe3ds2.views.f.b
            public final void a(String str) {
                com.stripe.android.stripe3ds2.views.e.b(com.stripe.android.stripe3ds2.views.e.this, str);
            }
        });
    }
}
