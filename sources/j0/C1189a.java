package J0;

import J0.B;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: J0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1189a implements T0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final T0.a f4325a = new C1189a();

    /* renamed from: J0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0088a implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0088a f4326a = new C0088a();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4327b = S0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4328c = S0.c.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4329d = S0.c.d("buildId");

        private C0088a() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.a.AbstractC0072a abstractC0072a, S0.e eVar) {
            eVar.a(f4327b, abstractC0072a.b());
            eVar.a(f4328c, abstractC0072a.d());
            eVar.a(f4329d, abstractC0072a.c());
        }
    }

    /* renamed from: J0.a$b */
    /* loaded from: classes3.dex */
    private static final class b implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f4330a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4331b = S0.c.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4332c = S0.c.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4333d = S0.c.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4334e = S0.c.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4335f = S0.c.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4336g = S0.c.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4337h = S0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4338i = S0.c.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4339j = S0.c.d("buildIdMappingForArch");

        private b() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.a aVar, S0.e eVar) {
            eVar.c(f4331b, aVar.d());
            eVar.a(f4332c, aVar.e());
            eVar.c(f4333d, aVar.g());
            eVar.c(f4334e, aVar.c());
            eVar.d(f4335f, aVar.f());
            eVar.d(f4336g, aVar.h());
            eVar.d(f4337h, aVar.i());
            eVar.a(f4338i, aVar.j());
            eVar.a(f4339j, aVar.b());
        }
    }

    /* renamed from: J0.a$c */
    /* loaded from: classes3.dex */
    private static final class c implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f4340a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4341b = S0.c.d(LeanbackPreferenceDialogFragment.ARG_KEY);

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4342c = S0.c.d("value");

        private c() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.c cVar, S0.e eVar) {
            eVar.a(f4341b, cVar.b());
            eVar.a(f4342c, cVar.c());
        }
    }

    /* renamed from: J0.a$d */
    /* loaded from: classes3.dex */
    private static final class d implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f4343a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4344b = S0.c.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4345c = S0.c.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4346d = S0.c.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4347e = S0.c.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4348f = S0.c.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4349g = S0.c.d("buildVersion");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4350h = S0.c.d("displayVersion");

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4351i = S0.c.d("session");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4352j = S0.c.d("ndkPayload");

        /* renamed from: k, reason: collision with root package name */
        private static final S0.c f4353k = S0.c.d("appExitInfo");

        private d() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B b8, S0.e eVar) {
            eVar.a(f4344b, b8.k());
            eVar.a(f4345c, b8.g());
            eVar.c(f4346d, b8.j());
            eVar.a(f4347e, b8.h());
            eVar.a(f4348f, b8.f());
            eVar.a(f4349g, b8.d());
            eVar.a(f4350h, b8.e());
            eVar.a(f4351i, b8.l());
            eVar.a(f4352j, b8.i());
            eVar.a(f4353k, b8.c());
        }
    }

    /* renamed from: J0.a$e */
    /* loaded from: classes3.dex */
    private static final class e implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f4354a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4355b = S0.c.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4356c = S0.c.d("orgId");

        private e() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.d dVar, S0.e eVar) {
            eVar.a(f4355b, dVar.b());
            eVar.a(f4356c, dVar.c());
        }
    }

    /* renamed from: J0.a$f */
    /* loaded from: classes3.dex */
    private static final class f implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f4357a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4358b = S0.c.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4359c = S0.c.d("contents");

        private f() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.d.b bVar, S0.e eVar) {
            eVar.a(f4358b, bVar.c());
            eVar.a(f4359c, bVar.b());
        }
    }

    /* renamed from: J0.a$g */
    /* loaded from: classes3.dex */
    private static final class g implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f4360a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4361b = S0.c.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4362c = S0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4363d = S0.c.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4364e = S0.c.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4365f = S0.c.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4366g = S0.c.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4367h = S0.c.d("developmentPlatformVersion");

        private g() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.a aVar, S0.e eVar) {
            eVar.a(f4361b, aVar.e());
            eVar.a(f4362c, aVar.h());
            eVar.a(f4363d, aVar.d());
            S0.c cVar = f4364e;
            aVar.g();
            eVar.a(cVar, null);
            eVar.a(f4365f, aVar.f());
            eVar.a(f4366g, aVar.b());
            eVar.a(f4367h, aVar.c());
        }
    }

    /* renamed from: J0.a$h */
    /* loaded from: classes3.dex */
    private static final class h implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final h f4368a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4369b = S0.c.d("clsId");

        private h() {
        }

        @Override // S0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (S0.e) obj2);
        }

        public void b(B.e.a.b bVar, S0.e eVar) {
            throw null;
        }
    }

    /* renamed from: J0.a$i */
    /* loaded from: classes3.dex */
    private static final class i implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final i f4370a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4371b = S0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4372c = S0.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4373d = S0.c.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4374e = S0.c.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4375f = S0.c.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4376g = S0.c.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4377h = S0.c.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4378i = S0.c.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4379j = S0.c.d("modelClass");

        private i() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.c cVar, S0.e eVar) {
            eVar.c(f4371b, cVar.b());
            eVar.a(f4372c, cVar.f());
            eVar.c(f4373d, cVar.c());
            eVar.d(f4374e, cVar.h());
            eVar.d(f4375f, cVar.d());
            eVar.e(f4376g, cVar.j());
            eVar.c(f4377h, cVar.i());
            eVar.a(f4378i, cVar.e());
            eVar.a(f4379j, cVar.g());
        }
    }

    /* renamed from: J0.a$j */
    /* loaded from: classes3.dex */
    private static final class j implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final j f4380a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4381b = S0.c.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4382c = S0.c.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4383d = S0.c.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4384e = S0.c.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4385f = S0.c.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4386g = S0.c.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4387h = S0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4388i = S0.c.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4389j = S0.c.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final S0.c f4390k = S0.c.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final S0.c f4391l = S0.c.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final S0.c f4392m = S0.c.d("generatorType");

        private j() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e eVar, S0.e eVar2) {
            eVar2.a(f4381b, eVar.g());
            eVar2.a(f4382c, eVar.j());
            eVar2.a(f4383d, eVar.c());
            eVar2.d(f4384e, eVar.l());
            eVar2.a(f4385f, eVar.e());
            eVar2.e(f4386g, eVar.n());
            eVar2.a(f4387h, eVar.b());
            eVar2.a(f4388i, eVar.m());
            eVar2.a(f4389j, eVar.k());
            eVar2.a(f4390k, eVar.d());
            eVar2.a(f4391l, eVar.f());
            eVar2.c(f4392m, eVar.h());
        }
    }

    /* renamed from: J0.a$k */
    /* loaded from: classes3.dex */
    private static final class k implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final k f4393a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4394b = S0.c.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4395c = S0.c.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4396d = S0.c.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4397e = S0.c.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4398f = S0.c.d("uiOrientation");

        private k() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a aVar, S0.e eVar) {
            eVar.a(f4394b, aVar.d());
            eVar.a(f4395c, aVar.c());
            eVar.a(f4396d, aVar.e());
            eVar.a(f4397e, aVar.b());
            eVar.c(f4398f, aVar.f());
        }
    }

    /* renamed from: J0.a$l */
    /* loaded from: classes3.dex */
    private static final class l implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final l f4399a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4400b = S0.c.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4401c = S0.c.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4402d = S0.c.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4403e = S0.c.d("uuid");

        private l() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0076a abstractC0076a, S0.e eVar) {
            eVar.d(f4400b, abstractC0076a.b());
            eVar.d(f4401c, abstractC0076a.d());
            eVar.a(f4402d, abstractC0076a.c());
            eVar.a(f4403e, abstractC0076a.f());
        }
    }

    /* renamed from: J0.a$m */
    /* loaded from: classes3.dex */
    private static final class m implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final m f4404a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4405b = S0.c.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4406c = S0.c.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4407d = S0.c.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4408e = S0.c.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4409f = S0.c.d("binaries");

        private m() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b bVar, S0.e eVar) {
            eVar.a(f4405b, bVar.f());
            eVar.a(f4406c, bVar.d());
            eVar.a(f4407d, bVar.b());
            eVar.a(f4408e, bVar.e());
            eVar.a(f4409f, bVar.c());
        }
    }

    /* renamed from: J0.a$n */
    /* loaded from: classes3.dex */
    private static final class n implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final n f4410a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4411b = S0.c.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4412c = S0.c.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4413d = S0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4414e = S0.c.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4415f = S0.c.d("overflowCount");

        private n() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.c cVar, S0.e eVar) {
            eVar.a(f4411b, cVar.f());
            eVar.a(f4412c, cVar.e());
            eVar.a(f4413d, cVar.c());
            eVar.a(f4414e, cVar.b());
            eVar.c(f4415f, cVar.d());
        }
    }

    /* renamed from: J0.a$o */
    /* loaded from: classes3.dex */
    private static final class o implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final o f4416a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4417b = S0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4418c = S0.c.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4419d = S0.c.d("address");

        private o() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0080d abstractC0080d, S0.e eVar) {
            eVar.a(f4417b, abstractC0080d.d());
            eVar.a(f4418c, abstractC0080d.c());
            eVar.d(f4419d, abstractC0080d.b());
        }
    }

    /* renamed from: J0.a$p */
    /* loaded from: classes3.dex */
    private static final class p implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final p f4420a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4421b = S0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4422c = S0.c.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4423d = S0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        private p() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0082e abstractC0082e, S0.e eVar) {
            eVar.a(f4421b, abstractC0082e.d());
            eVar.c(f4422c, abstractC0082e.c());
            eVar.a(f4423d, abstractC0082e.b());
        }
    }

    /* renamed from: J0.a$q */
    /* loaded from: classes3.dex */
    private static final class q implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final q f4424a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4425b = S0.c.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4426c = S0.c.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4427d = S0.c.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4428e = S0.c.d(TypedValues.CycleType.S_WAVE_OFFSET);

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4429f = S0.c.d("importance");

        private q() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0082e.AbstractC0084b abstractC0084b, S0.e eVar) {
            eVar.d(f4425b, abstractC0084b.e());
            eVar.a(f4426c, abstractC0084b.f());
            eVar.a(f4427d, abstractC0084b.b());
            eVar.d(f4428e, abstractC0084b.d());
            eVar.c(f4429f, abstractC0084b.c());
        }
    }

    /* renamed from: J0.a$r */
    /* loaded from: classes3.dex */
    private static final class r implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final r f4430a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4431b = S0.c.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4432c = S0.c.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4433d = S0.c.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4434e = S0.c.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4435f = S0.c.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4436g = S0.c.d("diskUsed");

        private r() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.c cVar, S0.e eVar) {
            eVar.a(f4431b, cVar.b());
            eVar.c(f4432c, cVar.c());
            eVar.e(f4433d, cVar.g());
            eVar.c(f4434e, cVar.e());
            eVar.d(f4435f, cVar.f());
            eVar.d(f4436g, cVar.d());
        }
    }

    /* renamed from: J0.a$s */
    /* loaded from: classes3.dex */
    private static final class s implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final s f4437a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4438b = S0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4439c = S0.c.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4440d = S0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4441e = S0.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4442f = S0.c.d("log");

        private s() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d dVar, S0.e eVar) {
            eVar.d(f4438b, dVar.e());
            eVar.a(f4439c, dVar.f());
            eVar.a(f4440d, dVar.b());
            eVar.a(f4441e, dVar.c());
            eVar.a(f4442f, dVar.d());
        }
    }

    /* renamed from: J0.a$t */
    /* loaded from: classes3.dex */
    private static final class t implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final t f4443a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4444b = S0.c.d("content");

        private t() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.AbstractC0086d abstractC0086d, S0.e eVar) {
            eVar.a(f4444b, abstractC0086d.b());
        }
    }

    /* renamed from: J0.a$u */
    /* loaded from: classes3.dex */
    private static final class u implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final u f4445a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4446b = S0.c.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4447c = S0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4448d = S0.c.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4449e = S0.c.d("jailbroken");

        private u() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.AbstractC0087e abstractC0087e, S0.e eVar) {
            eVar.c(f4446b, abstractC0087e.c());
            eVar.a(f4447c, abstractC0087e.d());
            eVar.a(f4448d, abstractC0087e.b());
            eVar.e(f4449e, abstractC0087e.e());
        }
    }

    /* renamed from: J0.a$v */
    /* loaded from: classes3.dex */
    private static final class v implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final v f4450a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4451b = S0.c.d("identifier");

        private v() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.f fVar, S0.e eVar) {
            eVar.a(f4451b, fVar.b());
        }
    }

    private C1189a() {
    }

    @Override // T0.a
    public void a(T0.b bVar) {
        d dVar = d.f4343a;
        bVar.a(B.class, dVar);
        bVar.a(C1190b.class, dVar);
        j jVar = j.f4380a;
        bVar.a(B.e.class, jVar);
        bVar.a(J0.h.class, jVar);
        g gVar = g.f4360a;
        bVar.a(B.e.a.class, gVar);
        bVar.a(J0.i.class, gVar);
        h hVar = h.f4368a;
        bVar.a(B.e.a.b.class, hVar);
        bVar.a(J0.j.class, hVar);
        v vVar = v.f4450a;
        bVar.a(B.e.f.class, vVar);
        bVar.a(w.class, vVar);
        u uVar = u.f4445a;
        bVar.a(B.e.AbstractC0087e.class, uVar);
        bVar.a(J0.v.class, uVar);
        i iVar = i.f4370a;
        bVar.a(B.e.c.class, iVar);
        bVar.a(J0.k.class, iVar);
        s sVar = s.f4437a;
        bVar.a(B.e.d.class, sVar);
        bVar.a(J0.l.class, sVar);
        k kVar = k.f4393a;
        bVar.a(B.e.d.a.class, kVar);
        bVar.a(J0.m.class, kVar);
        m mVar = m.f4404a;
        bVar.a(B.e.d.a.b.class, mVar);
        bVar.a(J0.n.class, mVar);
        p pVar = p.f4420a;
        bVar.a(B.e.d.a.b.AbstractC0082e.class, pVar);
        bVar.a(J0.r.class, pVar);
        q qVar = q.f4424a;
        bVar.a(B.e.d.a.b.AbstractC0082e.AbstractC0084b.class, qVar);
        bVar.a(J0.s.class, qVar);
        n nVar = n.f4410a;
        bVar.a(B.e.d.a.b.c.class, nVar);
        bVar.a(J0.p.class, nVar);
        b bVar2 = b.f4330a;
        bVar.a(B.a.class, bVar2);
        bVar.a(C1191c.class, bVar2);
        C0088a c0088a = C0088a.f4326a;
        bVar.a(B.a.AbstractC0072a.class, c0088a);
        bVar.a(C1192d.class, c0088a);
        o oVar = o.f4416a;
        bVar.a(B.e.d.a.b.AbstractC0080d.class, oVar);
        bVar.a(J0.q.class, oVar);
        l lVar = l.f4399a;
        bVar.a(B.e.d.a.b.AbstractC0076a.class, lVar);
        bVar.a(J0.o.class, lVar);
        c cVar = c.f4340a;
        bVar.a(B.c.class, cVar);
        bVar.a(J0.e.class, cVar);
        r rVar = r.f4430a;
        bVar.a(B.e.d.c.class, rVar);
        bVar.a(J0.t.class, rVar);
        t tVar = t.f4443a;
        bVar.a(B.e.d.AbstractC0086d.class, tVar);
        bVar.a(J0.u.class, tVar);
        e eVar = e.f4354a;
        bVar.a(B.d.class, eVar);
        bVar.a(J0.f.class, eVar);
        f fVar = f.f4357a;
        bVar.a(B.d.b.class, fVar);
        bVar.a(J0.g.class, fVar);
    }
}
