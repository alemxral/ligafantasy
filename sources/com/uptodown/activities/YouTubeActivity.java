package com.uptodown.activities;

import L5.InterfaceC1227k;
import T4.C0;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedCallback;
import d2.EnumC2539c;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import e2.InterfaceC2578b;
import f2.C2659a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class YouTubeActivity extends AbstractActivityC2489a {

    /* renamed from: R, reason: collision with root package name */
    public static final a f29087R = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private InterfaceC2541e f29089P;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f29088O = L5.l.b(new b());

    /* renamed from: Q, reason: collision with root package name */
    private final e f29090Q = new e();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0 invoke() {
            return C0.c(YouTubeActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2578b {
        c() {
        }

        @Override // e2.InterfaceC2578b
        public void a(View fullscreenView, Function0 exitFullscreen) {
            AbstractC3159y.i(fullscreenView, "fullscreenView");
            AbstractC3159y.i(exitFullscreen, "exitFullscreen");
            YouTubeActivity.this.b3().f10040c.setVisibility(8);
            YouTubeActivity.this.b3().f10039b.setVisibility(0);
            YouTubeActivity.this.b3().f10039b.addView(fullscreenView);
        }

        @Override // e2.InterfaceC2578b
        public void onExitFullscreen() {
            YouTubeActivity.this.b3().f10040c.setVisibility(0);
            YouTubeActivity.this.b3().f10039b.setVisibility(8);
            YouTubeActivity.this.b3().f10039b.removeAllViews();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2577a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29094b;

        d(String str) {
            this.f29094b = str;
        }

        @Override // e2.AbstractC2577a, e2.c
        public void c(InterfaceC2541e youTubePlayer, EnumC2539c error) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            AbstractC3159y.i(error, "error");
            super.c(youTubePlayer, error);
            YouTubeActivity.this.finish();
        }

        @Override // e2.AbstractC2577a, e2.c
        public void g(InterfaceC2541e youTubePlayer) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            YouTubeActivity.this.f29089P = youTubePlayer;
            youTubePlayer.e(this.f29094b, 0.0f);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends OnBackPressedCallback {
        e() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            YouTubeActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 b3() {
        return (C0) this.f29088O.getValue();
    }

    private final void c3(String str) {
        C2659a c8 = new C2659a.C0738a().e(1).f(1).c();
        b3().f10040c.e(new d(str), c8);
        b3().f10040c.c(new c());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        InterfaceC2541e interfaceC2541e;
        AbstractC3159y.i(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i8 = newConfig.orientation;
        if ((i8 == 1 || i8 == 2) && (interfaceC2541e = this.f29089P) != null) {
            AbstractC3159y.f(interfaceC2541e);
            interfaceC2541e.b();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(b3().getRoot());
        Window window = getWindow();
        AbstractC3159y.h(window, "window");
        R2(window);
        getOnBackPressedDispatcher().addCallback(this, this.f29090Q);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("id_youtube")) {
            str = extras.getString("id_youtube");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            c3(str);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b3().f10040c.h();
    }
}
