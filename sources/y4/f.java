package Y4;

import L5.I;
import L5.t;
import X4.C1496f;
import X5.n;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class f extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13218a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13219a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f13220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13221c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13222d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, int i8, String str, P5.d dVar) {
            super(2, dVar);
            this.f13220b = activity;
            this.f13221c = i8;
            this.f13222d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f13220b, this.f13221c, this.f13222d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f13219a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = (AppInstalledDetailsActivity) this.f13220b;
                int i9 = this.f13221c;
                String str = this.f13222d;
                this.f13219a = 1;
                if (appInstalledDetailsActivity.n5(i9, str, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f13223a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f13224b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f13225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, T t8, P5.d dVar) {
            super(2, dVar);
            this.f13224b = activity;
            this.f13225c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f13224b, this.f13225c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f13223a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                AppDetailActivity appDetailActivity = (AppDetailActivity) this.f13224b;
                Object obj2 = this.f13225c.f33747a;
                AbstractC3159y.f(obj2);
                this.f13223a = 1;
                if (appDetailActivity.w3((String) obj2, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public f(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        String str;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        if (UptodownApp.f27990B.Q()) {
            C3307A c3307a = C3307A.f34459a;
            if (c3307a.d().size() > 0) {
                Object obj = c3307a.d().get(c3307a.d().size() - 1);
                AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                Activity activity = (Activity) obj;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList = null;
                String str4 = null;
                ArrayList arrayList2 = null;
                String str5 = null;
                if (activity instanceof Updates) {
                    if (i8 != 104) {
                        if (i8 != 105) {
                            if (i8 != 110) {
                                if (bundle != null) {
                                    str3 = bundle.getString("packagename");
                                }
                                Updates updates = (Updates) activity;
                                updates.l5(i8, str3);
                                if (updates.j4()) {
                                    updates.w4(i8);
                                    return;
                                }
                                return;
                            }
                            activity.runOnUiThread(new AbstractActivityC2489a.b());
                            return;
                        }
                        if (bundle != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelableArrayList2 = bundle.getParcelableArrayList("apps_parcelable", C1496f.class);
                            } else {
                                parcelableArrayList2 = bundle.getParcelableArrayList("apps_parcelable");
                            }
                            arrayList = parcelableArrayList2;
                        }
                        if (arrayList != null) {
                            ((Updates) activity).i5(arrayList);
                            return;
                        }
                        return;
                    }
                    ((Updates) activity).l5(104, null);
                    return;
                }
                if (activity instanceof MyApps) {
                    if (i8 != 105) {
                        if (i8 != 110) {
                            MyApps myApps = (MyApps) activity;
                            if (myApps.j4()) {
                                myApps.w4(i8);
                                return;
                            }
                            if (bundle != null) {
                                str4 = bundle.getString("packagename");
                            }
                            myApps.b5(i8, str4);
                            return;
                        }
                        activity.runOnUiThread(new AbstractActivityC2489a.b());
                        return;
                    }
                    if (bundle != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelableArrayList = bundle.getParcelableArrayList("apps_parcelable", C1496f.class);
                        } else {
                            parcelableArrayList = bundle.getParcelableArrayList("apps_parcelable");
                        }
                        arrayList2 = parcelableArrayList;
                    }
                    if (arrayList2 != null) {
                        ((MyApps) activity).V4(arrayList2);
                        return;
                    }
                    return;
                }
                if (activity instanceof AppInstalledDetailsActivity) {
                    if (i8 != 105 && i8 != 110) {
                        if (bundle != null) {
                            str = bundle.getString("packagename");
                        } else {
                            str = null;
                        }
                        AbstractC2829k.d(N.a(C2812b0.c()), null, null, new b(activity, i8, str, null), 3, null);
                        return;
                    }
                    activity.runOnUiThread(new AbstractActivityC2489a.b());
                    return;
                }
                if (activity instanceof MainActivity) {
                    if (i8 == 103) {
                        ((MainActivity) activity).I7();
                    }
                    if (bundle != null) {
                        str5 = bundle.getString("packagename");
                    }
                    MainActivity mainActivity = (MainActivity) activity;
                    activity.runOnUiThread(new MainActivity.RunnableC2482e(i8, str5));
                    mainActivity.K7(str5);
                    return;
                }
                if (activity instanceof AppDetailActivity) {
                    T t8 = new T();
                    if (bundle != null) {
                        t8.f33747a = bundle.getString("packagename");
                    }
                    activity.runOnUiThread(new AppDetailActivity.b(i8, (String) t8.f33747a));
                    if (t8.f33747a != null) {
                        AbstractC2829k.d(N.a(C2812b0.c()), null, null, new c(activity, t8, null), 3, null);
                        return;
                    }
                    return;
                }
                if (activity instanceof WishlistActivity) {
                    if (bundle != null) {
                        str2 = bundle.getString("packagename");
                    }
                    ((WishlistActivity) activity).V4(str2);
                }
            }
        }
    }
}
