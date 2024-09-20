package l5;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import com.uptodown.activities.MainActivity;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3334v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34529a;

    /* renamed from: b, reason: collision with root package name */
    private final a f34530b;

    /* renamed from: l5.v$a */
    /* loaded from: classes5.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC3159y.i(network, "network");
            C3332t c3332t = C3332t.f34516a;
            if (!c3332t.d()) {
                c3332t.h(true);
                UptodownApp.a aVar = UptodownApp.f27990B;
                if (aVar.Q()) {
                    aVar.e(C3334v.this.f34529a);
                    C3307A c3307a = C3307A.f34459a;
                    if (c3307a.d().size() > 0) {
                        Object obj = c3307a.d().get(c3307a.d().size() - 1);
                        AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                        Activity activity = (Activity) obj;
                        if (activity instanceof AbstractActivityC2489a) {
                            ((AbstractActivityC2489a) activity).z2();
                        }
                        if (activity instanceof MainActivity) {
                            MainActivity mainActivity = (MainActivity) activity;
                            if (mainActivity.U5()) {
                                activity.runOnUiThread(new MainActivity.RunnableC2480c());
                            }
                        }
                    }
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC3159y.i(network, "network");
            AbstractC3159y.i(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            C3332t c3332t = C3332t.f34516a;
            if (c3332t.a() != networkCapabilities.getLinkDownstreamBandwidthKbps() || c3332t.b() != networkCapabilities.getLinkUpstreamBandwidthKbps()) {
                c3332t.g(networkCapabilities.getLinkDownstreamBandwidthKbps());
                c3332t.i(networkCapabilities.getLinkUpstreamBandwidthKbps());
                c3332t.j(networkCapabilities.hasTransport(1));
                UptodownApp.f27990B.e(C3334v.this.f34529a);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC3159y.i(network, "network");
            C3332t c3332t = C3332t.f34516a;
            c3332t.h(false);
            c3332t.g(0);
            c3332t.i(0);
            c3332t.j(false);
        }
    }

    public C3334v(Context context) {
        AbstractC3159y.i(context, "context");
        this.f34529a = context;
        this.f34530b = new a();
    }

    public final void b() {
        Object systemService = this.f34529a.getSystemService("connectivity");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        if (Build.VERSION.SDK_INT >= 24) {
            connectivityManager.registerDefaultNetworkCallback(this.f34530b);
        } else {
            connectivityManager.registerNetworkCallback(builder.build(), this.f34530b);
        }
    }

    public final void c() {
        Object systemService = this.f34529a.getSystemService("connectivity");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).unregisterNetworkCallback(new ConnectivityManager.NetworkCallback());
    }
}
