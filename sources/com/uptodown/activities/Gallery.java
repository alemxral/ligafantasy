package com.uptodown.activities;

import L5.InterfaceC1227k;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Gallery;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class Gallery extends AbstractActivityC2489a {

    /* renamed from: R, reason: collision with root package name */
    public static final a f28235R = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f28237P;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28236O = L5.l.b(new c());

    /* renamed from: Q, reason: collision with root package name */
    private final e f28238Q = new e();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class b extends PagerAdapter {

        /* loaded from: classes4.dex */
        public static final class a implements com.squareup.picasso.A {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T4.C f28240a;

            a(T4.C c8) {
                this.f28240a = c8;
            }

            @Override // com.squareup.picasso.A
            public void a(Exception e8, Drawable drawable) {
                AbstractC3159y.i(e8, "e");
                this.f28240a.f10037c.setVisibility(8);
            }

            @Override // com.squareup.picasso.A
            public void b(Drawable drawable) {
            }

            @Override // com.squareup.picasso.A
            public void c(Bitmap bitmap, s.e from) {
                AbstractC3159y.i(bitmap, "bitmap");
                AbstractC3159y.i(from, "from");
                this.f28240a.f10036b.setImage(ImageSource.bitmap(bitmap));
                this.f28240a.f10037c.setVisibility(8);
            }
        }

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Gallery this$0, View view) {
            AbstractC3159y.i(this$0, "this$0");
            if (UptodownApp.f27990B.a0()) {
                if (this$0.d3().f10022c.getVisibility() == 0) {
                    this$0.d3().f10022c.startAnimation(AnimationUtils.loadAnimation(this$0, R.anim.slide_to_top_toolbar));
                    this$0.d3().f10022c.setVisibility(8);
                } else {
                    this$0.d3().f10022c.startAnimation(AnimationUtils.loadAnimation(this$0, R.anim.slide_in_top_toolbar));
                    this$0.d3().f10022c.setVisibility(0);
                }
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int i8, Object item) {
            AbstractC3159y.i(container, "container");
            AbstractC3159y.i(item, "item");
            container.removeView((RelativeLayout) item);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (Gallery.this.f28237P != null) {
                ArrayList arrayList = Gallery.this.f28237P;
                AbstractC3159y.f(arrayList);
                return arrayList.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int i8) {
            AbstractC3159y.i(container, "container");
            T4.C c8 = T4.C.c(LayoutInflater.from(container.getContext()), container, false);
            AbstractC3159y.h(c8, "inflate(LayoutInflater.f…ntext), container, false)");
            c8.f10037c.setVisibility(0);
            a aVar = new a(c8);
            c8.f10036b.setTag(aVar);
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            ArrayList arrayList = Gallery.this.f28237P;
            AbstractC3159y.f(arrayList);
            h8.l(((X4.L) arrayList.get(i8)).i()).l(R.drawable.shape_bg_placeholder).k(aVar);
            container.addView(c8.getRoot());
            SubsamplingScaleImageView subsamplingScaleImageView = c8.f10036b;
            final Gallery gallery = Gallery.this;
            subsamplingScaleImageView.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Gallery.b.b(Gallery.this, view);
                }
            });
            RelativeLayout root = c8.getRoot();
            AbstractC3159y.h(root, "itemViewBinding.root");
            return root;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object object) {
            AbstractC3159y.i(view, "view");
            AbstractC3159y.i(object, "object");
            return view == object;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.B invoke() {
            return T4.B.c(Gallery.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewPager.OnPageChangeListener {
        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            Gallery.this.g3(i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends OnBackPressedCallback {
        e() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            Gallery.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T4.B d3() {
        return (T4.B) this.f28236O.getValue();
    }

    private final void e3(int i8) {
        d3().f10024e.setAdapter(new b());
        if (i8 > 0) {
            d3().f10024e.setCurrentItem(i8);
        }
        d3().f10024e.addOnPageChangeListener(new d());
        g3(i8);
        d3().f10023d.setTypeface(E4.j.f2272g.t());
        d3().f10021b.setOnClickListener(new View.OnClickListener() { // from class: A4.F
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Gallery.f3(Gallery.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(Gallery this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f28238Q.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(int i8) {
        Integer num;
        TextView textView = d3().f10023d;
        Integer valueOf = Integer.valueOf(i8 + 1);
        ArrayList arrayList = this.f28237P;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        textView.setText(getString(R.string.gallery_item_count, valueOf, num));
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i8;
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        setContentView(d3().getRoot());
        Window window = getWindow();
        AbstractC3159y.h(window, "window");
        R2(window);
        getOnBackPressedDispatcher().addCallback(this, this.f28238Q);
        Intent intent = getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("bundle")) != null) {
            if (bundleExtra.containsKey("images")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images", X4.L.class);
                } else {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images");
                }
                this.f28237P = parcelableArrayList;
            }
            if (bundleExtra.containsKey("index")) {
                i8 = bundleExtra.getInt("index");
                e3(i8);
            }
        }
        i8 = 0;
        e3(i8);
    }
}
