package D4;

import D4.U;
import E4.j;
import U4.S0;
import W4.InterfaceC1478a;
import X4.C1498h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import d2.EnumC2540d;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import f2.C2659a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import n5.C3480h;
import o5.AbstractC3548h;
import p5.C3609g;

/* loaded from: classes4.dex */
public final class U extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f1614a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f1615b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1616c;

    /* renamed from: d, reason: collision with root package name */
    private String f1617d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f1618e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1619f;

    /* renamed from: g, reason: collision with root package name */
    private YouTubePlayerView f1620g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC2541e f1621h;

    /* renamed from: i, reason: collision with root package name */
    private String f1622i;

    /* renamed from: j, reason: collision with root package name */
    private int f1623j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1624k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1625l;

    /* renamed from: m, reason: collision with root package name */
    private C3480h f1626m;

    /* renamed from: n, reason: collision with root package name */
    private int f1627n;

    /* loaded from: classes4.dex */
    public final class a extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private W4.s f1628b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1478a f1629c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1630d;

        /* renamed from: e, reason: collision with root package name */
        private String f1631e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f1632f;

        /* renamed from: g, reason: collision with root package name */
        private final RelativeLayout f1633g;

        /* renamed from: h, reason: collision with root package name */
        private final ProgressBar f1634h;

        /* renamed from: i, reason: collision with root package name */
        private final ImageView f1635i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f1636j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1637k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f1638l;

        /* renamed from: m, reason: collision with root package name */
        private final TextView f1639m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f1640n;

        /* renamed from: o, reason: collision with root package name */
        private final LinearLayout f1641o;

        /* renamed from: p, reason: collision with root package name */
        private final CardView f1642p;

        /* renamed from: q, reason: collision with root package name */
        private final View f1643q;

        /* renamed from: r, reason: collision with root package name */
        private final int f1644r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ U f1645s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U u8, View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context, String fragmentName) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(actionsClickListener, "actionsClickListener");
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(fragmentName, "fragmentName");
            this.f1645s = u8;
            this.f1628b = listener;
            this.f1629c = actionsClickListener;
            this.f1630d = context;
            this.f1631e = fragmentName;
            View findViewById = itemView.findViewById(R.id.iv_image_video_featured_item);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…mage_video_featured_item)");
            this.f1632f = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.rl_video_card_info);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.rl_video_card_info)");
            this.f1633g = (RelativeLayout) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.pb_progress_video_featured_item);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…ress_video_featured_item)");
            this.f1634h = (ProgressBar) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.iv_logo_video_featured_item);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…logo_video_featured_item)");
            this.f1635i = (ImageView) findViewById4;
            View findViewById5 = itemView.findViewById(R.id.tv_name_video_featured_item);
            AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…name_video_featured_item)");
            TextView textView = (TextView) findViewById5;
            this.f1636j = textView;
            View findViewById6 = itemView.findViewById(R.id.tv_desc_video_featured_item);
            AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…desc_video_featured_item)");
            TextView textView2 = (TextView) findViewById6;
            this.f1637k = textView2;
            View findViewById7 = itemView.findViewById(R.id.tv_status_video_featured_item);
            AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…atus_video_featured_item)");
            this.f1638l = (TextView) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.tv_progress_video_featured_item);
            AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…ress_video_featured_item)");
            TextView textView3 = (TextView) findViewById8;
            this.f1639m = textView3;
            View findViewById9 = itemView.findViewById(R.id.tv_verified_video_featured_item);
            AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…fied_video_featured_item)");
            TextView textView4 = (TextView) findViewById9;
            this.f1640n = textView4;
            View findViewById10 = itemView.findViewById(R.id.ll_progress_video_featured_item);
            AbstractC3159y.h(findViewById10, "itemView.findViewById(R.…ress_video_featured_item)");
            this.f1641o = (LinearLayout) findViewById10;
            View findViewById11 = itemView.findViewById(R.id.cv_youtube_player_view);
            AbstractC3159y.h(findViewById11, "itemView.findViewById(R.id.cv_youtube_player_view)");
            this.f1642p = (CardView) findViewById11;
            View findViewById12 = itemView.findViewById(R.id.v_player_controller);
            AbstractC3159y.h(findViewById12, "itemView.findViewById(R.id.v_player_controller)");
            this.f1643q = findViewById12;
            this.f1644r = UptodownApp.f27990B.H();
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1629c.a(app, i8);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(U this$0, View view) {
            AbstractC3159y.i(this$0, "this$0");
            if (this$0.q()) {
                InterfaceC2541e interfaceC2541e = this$0.f1621h;
                if (interfaceC2541e != null) {
                    interfaceC2541e.pause();
                    return;
                }
                return;
            }
            InterfaceC2541e interfaceC2541e2 = this$0.f1621h;
            if (interfaceC2541e2 != null) {
                interfaceC2541e2.play();
            }
        }

        private final void r(C1498h c1498h) {
            i(c1498h, this.f1636j, this.f1637k);
            c(this.f1633g, this.f1628b, c1498h);
            C3609g c3609g = new C3609g((int) this.f1630d.getResources().getDimension(R.dimen.border_radius_m), null, 2, null);
            String e02 = c1498h.e0();
            if (e02 != null && e02.length() != 0) {
                UptodownApp.a aVar = UptodownApp.f27990B;
                if (aVar.A() > 0) {
                    this.f1632f.setLayoutParams(new RelativeLayout.LayoutParams(-1, aVar.A()));
                    com.squareup.picasso.s.h().l(c1498h.c0()).m(aVar.B(), aVar.A()).n(c3609g).i(this.f1632f);
                } else {
                    this.f1632f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    com.squareup.picasso.s.h().l(c1498h.c0()).f().n(c3609g).i(this.f1632f);
                }
            } else {
                this.f1632f.setImageDrawable(ContextCompat.getDrawable(this.f1630d, R.drawable.shape_bg_placeholder));
            }
            h(this.f1635i, c1498h.m0());
        }

        public final void n(final C1498h app, final int i8) {
            AbstractC3159y.i(app, "app");
            this.f1642p.setVisibility(8);
            this.f1643q.setVisibility(8);
            this.f1632f.setVisibility(0);
            r(app);
            e(app, this.f1634h, this.f1635i, this.f1637k, this.f1639m, this.f1638l, this.f1641o);
            this.f1633g.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.T
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean o8;
                    o8 = U.a.o(U.a.this, app, i8, view);
                    return o8;
                }
            });
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f1644r, -1), this.f1630d, i8, this.f1645s.f1627n));
            c(this.f1632f, this.f1628b, app);
        }

        public final void p(C1498h app, int i8) {
            ArrayList i12;
            AbstractC3159y.i(app, "app");
            if (this.f1645s.f1620g != null) {
                YouTubePlayerView youTubePlayerView = this.f1645s.f1620g;
                AbstractC3159y.f(youTubePlayerView);
                if (youTubePlayerView.getParent() != null) {
                    YouTubePlayerView youTubePlayerView2 = this.f1645s.f1620g;
                    AbstractC3159y.f(youTubePlayerView2);
                    ViewParent parent = youTubePlayerView2.getParent();
                    AbstractC3159y.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this.f1645s.f1620g);
                }
                this.f1642p.addView(this.f1645s.f1620g);
                this.f1642p.setVisibility(0);
                this.f1643q.setVisibility(0);
                this.f1632f.setVisibility(8);
                r(app);
                View view = this.f1643q;
                final U u8 = this.f1645s;
                view.setOnClickListener(new View.OnClickListener() { // from class: D4.S
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        U.a.q(U.this, view2);
                    }
                });
                this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f1644r, -1), this.f1630d, i8, this.f1645s.f1627n));
                if (this.f1645s.p() && this.f1645s.f1621h != null && (i12 = app.i1()) != null && !i12.isEmpty()) {
                    ArrayList i13 = app.i1();
                    AbstractC3159y.f(i13);
                    if (((X4.T) i13.get(0)).getId() != null) {
                        U u9 = this.f1645s;
                        StringBuilder sb = new StringBuilder();
                        String s02 = app.s0();
                        AbstractC3159y.f(s02);
                        sb.append(s02);
                        sb.append(this.f1631e);
                        u9.f1622i = sb.toString();
                        if (AbstractC3159y.d(this.f1631e, kotlin.jvm.internal.U.b(S0.class).b())) {
                            UptodownApp.f27990B.o0(this.f1645s.f1621h);
                        } else {
                            UptodownApp.f27990B.p0(this.f1645s.f1621h);
                        }
                        UptodownApp.a aVar = UptodownApp.f27990B;
                        if (aVar.f(this.f1630d) && SettingsPreferences.f29309b.l(this.f1630d) > 0) {
                            if (aVar.J().containsKey(this.f1645s.f1622i)) {
                                InterfaceC2541e interfaceC2541e = this.f1645s.f1621h;
                                AbstractC3159y.f(interfaceC2541e);
                                ArrayList i14 = app.i1();
                                AbstractC3159y.f(i14);
                                String id = ((X4.T) i14.get(0)).getId();
                                AbstractC3159y.f(id);
                                Object obj = aVar.J().get(this.f1645s.f1622i);
                                AbstractC3159y.f(obj);
                                interfaceC2541e.e(id, ((Number) obj).floatValue());
                            } else {
                                InterfaceC2541e interfaceC2541e2 = this.f1645s.f1621h;
                                AbstractC3159y.f(interfaceC2541e2);
                                ArrayList i15 = app.i1();
                                AbstractC3159y.f(i15);
                                String id2 = ((X4.T) i15.get(0)).getId();
                                AbstractC3159y.f(id2);
                                interfaceC2541e2.e(id2, 0.0f);
                                aVar.J().put(this.f1645s.f1622i, Float.valueOf(0.0f));
                            }
                            if (this.f1645s.n()) {
                                InterfaceC2541e interfaceC2541e3 = this.f1645s.f1621h;
                                AbstractC3159y.f(interfaceC2541e3);
                                interfaceC2541e3.play();
                                return;
                            } else {
                                InterfaceC2541e interfaceC2541e4 = this.f1645s.f1621h;
                                AbstractC3159y.f(interfaceC2541e4);
                                interfaceC2541e4.pause();
                                return;
                            }
                        }
                        if (aVar.J().containsKey(this.f1645s.f1622i)) {
                            InterfaceC2541e interfaceC2541e5 = this.f1645s.f1621h;
                            AbstractC3159y.f(interfaceC2541e5);
                            ArrayList i16 = app.i1();
                            AbstractC3159y.f(i16);
                            String id3 = ((X4.T) i16.get(0)).getId();
                            AbstractC3159y.f(id3);
                            Object obj2 = aVar.J().get(this.f1645s.f1622i);
                            AbstractC3159y.f(obj2);
                            interfaceC2541e5.d(id3, ((Number) obj2).floatValue());
                        } else {
                            InterfaceC2541e interfaceC2541e6 = this.f1645s.f1621h;
                            AbstractC3159y.f(interfaceC2541e6);
                            ArrayList i17 = app.i1();
                            AbstractC3159y.f(i17);
                            String id4 = ((X4.T) i17.get(0)).getId();
                            AbstractC3159y.f(id4);
                            interfaceC2541e6.d(id4, 0.0f);
                            aVar.J().put(this.f1645s.f1622i, Float.valueOf(0.0f));
                        }
                        String e02 = app.e0();
                        if (e02 != null && e02.length() != 0) {
                            C3480h c3480h = this.f1645s.f1626m;
                            AbstractC3159y.f(c3480h);
                            c3480h.l().setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
                ArrayList i18 = app.i1();
                if (i18 == null || i18.isEmpty()) {
                    n(app, i8);
                }
                if (this.f1645s.f1621h == null) {
                    this.f1645s.o();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2577a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1647b;

        b(View view) {
            this.f1647b = view;
        }

        @Override // e2.AbstractC2577a, e2.c
        public void g(InterfaceC2541e youTubePlayer) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            super.g(youTubePlayer);
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.A() == 0) {
                YouTubePlayerView youTubePlayerView = U.this.f1620g;
                AbstractC3159y.f(youTubePlayerView);
                if (youTubePlayerView.getHeight() != 0) {
                    YouTubePlayerView youTubePlayerView2 = U.this.f1620g;
                    AbstractC3159y.f(youTubePlayerView2);
                    aVar.F0(youTubePlayerView2.getHeight());
                    YouTubePlayerView youTubePlayerView3 = U.this.f1620g;
                    AbstractC3159y.f(youTubePlayerView3);
                    aVar.G0(youTubePlayerView3.getWidth());
                }
            }
            U u8 = U.this;
            u8.f1626m = new C3480h(this.f1647b, youTubePlayer, u8.f1616c);
            C3480h c3480h = U.this.f1626m;
            AbstractC3159y.f(c3480h);
            youTubePlayer.a(c3480h);
            youTubePlayer.f();
            U.this.f1621h = youTubePlayer;
            U.this.v(true);
            U.this.notifyItemChanged(0);
        }

        @Override // e2.AbstractC2577a, e2.c
        public void i(InterfaceC2541e youTubePlayer, float f8) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            super.i(youTubePlayer, f8);
            UptodownApp.f27990B.J().put(U.this.f1622i, Float.valueOf(f8));
        }

        @Override // e2.AbstractC2577a, e2.c
        public void j(InterfaceC2541e youTubePlayer, EnumC2540d state) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            AbstractC3159y.i(state, "state");
            super.j(youTubePlayer, state);
            EnumC2540d enumC2540d = EnumC2540d.BUFFERING;
            if (state == enumC2540d && U.this.n()) {
                youTubePlayer.play();
            }
            if (state == enumC2540d && AbstractC3159y.d(U.this.f1617d, kotlin.jvm.internal.U.b(S0.class).b())) {
                youTubePlayer.play();
            }
            if (state == EnumC2540d.PAUSED) {
                U.this.x(false);
            }
            if (state == EnumC2540d.PLAYING) {
                U.this.x(true);
            }
        }
    }

    public U(W4.s listener, InterfaceC1478a actionsClickListener, Context context, String fragmentName) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(fragmentName, "fragmentName");
        this.f1614a = listener;
        this.f1615b = actionsClickListener;
        this.f1616c = context;
        this.f1617d = fragmentName;
        this.f1618e = new ArrayList();
        this.f1622i = "";
        this.f1625l = true;
        this.f1627n = 8;
        if (!SettingsPreferences.f29309b.L(this.f1616c)) {
            try {
                YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this.f1616c);
                youTubePlayerView.setEnableAutomaticInitialization(false);
                this.f1620g = youTubePlayerView;
                o();
            } catch (Exception e8) {
                SettingsPreferences.f29309b.F0(this.f1616c, true);
                this.f1620g = null;
                e8.printStackTrace();
            } catch (UnsatisfiedLinkError e9) {
                SettingsPreferences.f29309b.F0(this.f1616c, true);
                this.f1620g = null;
                e9.printStackTrace();
            }
        }
        if (AbstractC3159y.d(this.f1617d, kotlin.jvm.internal.U.b(S0.class).b())) {
            this.f1627n = 8;
        } else {
            this.f1627n = 20;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        YouTubePlayerView youTubePlayerView = this.f1620g;
        if (youTubePlayerView != null) {
            AbstractC3159y.f(youTubePlayerView);
            View d8 = youTubePlayerView.d(R.layout.home_youtube_player_layout);
            C2659a c8 = new C2659a.C0738a().e(0).h(0).g(3).d(1).c();
            YouTubePlayerView youTubePlayerView2 = this.f1620g;
            AbstractC3159y.f(youTubePlayerView2);
            youTubePlayerView2.e(new b(d8), c8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1618e.size();
    }

    public final ArrayList l() {
        return this.f1618e;
    }

    public final int m() {
        return this.f1623j;
    }

    public final boolean n() {
        return this.f1619f;
    }

    public final boolean p() {
        return this.f1624k;
    }

    public final boolean q() {
        return this.f1625l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        int i9 = i8 + 1;
        if (!SettingsPreferences.f29309b.L(this.f1616c) && i8 == this.f1623j) {
            Object obj = this.f1618e.get(i8);
            AbstractC3159y.h(obj, "apps[position]");
            holder.p((C1498h) obj, i9);
        } else {
            Object obj2 = this.f1618e.get(i8);
            AbstractC3159y.h(obj2, "apps[position]");
            holder.n((C1498h) obj2, i9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_video_featured_item, parent, false);
        AbstractC3159y.h(itemView, "itemView");
        return new a(this, itemView, this.f1614a, this.f1615b, this.f1616c, this.f1617d);
    }

    public final void t(int i8) {
        this.f1623j = i8;
    }

    public final void u(ArrayList appList) {
        AbstractC3159y.i(appList, "appList");
        ArrayList arrayList = this.f1618e;
        arrayList.clear();
        arrayList.addAll(appList);
    }

    public final void v(boolean z8) {
        this.f1624k = z8;
    }

    public final void w(boolean z8) {
        this.f1619f = z8;
    }

    public final void x(boolean z8) {
        this.f1625l = z8;
    }
}
