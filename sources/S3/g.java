package S3;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: i2, reason: collision with root package name */
    private static final /* synthetic */ g[] f9134i2;

    /* renamed from: j2, reason: collision with root package name */
    private static final /* synthetic */ R5.a f9137j2;

    /* renamed from: a, reason: collision with root package name */
    private final String f9181a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f9111b = new g("PARAM_PLATFORM", 0, "C001");

    /* renamed from: c, reason: collision with root package name */
    public static final g f9114c = new g("PARAM_DEVICE_MODEL", 1, "C002");

    /* renamed from: d, reason: collision with root package name */
    public static final g f9117d = new g("PARAM_OS_NAME", 2, "C003");

    /* renamed from: e, reason: collision with root package name */
    public static final g f9120e = new g("PARAM_OS_VERSION", 3, "C004");

    /* renamed from: f, reason: collision with root package name */
    public static final g f9123f = new g("PARAM_LOCALE", 4, "C005");

    /* renamed from: g, reason: collision with root package name */
    public static final g f9126g = new g("PARAM_TIME_ZONE", 5, "C006");

    /* renamed from: h, reason: collision with root package name */
    public static final g f9129h = new g("PARAM_HARDWARE_ID", 6, "C007");

    /* renamed from: i, reason: collision with root package name */
    public static final g f9132i = new g("PARAM_SCREEN_RESOLUTION", 7, "C008");

    /* renamed from: j, reason: collision with root package name */
    public static final g f9135j = new g("PARAM_DEVICE_NAME", 8, "C009");

    /* renamed from: k, reason: collision with root package name */
    public static final g f9138k = new g("PARAM_IP_ADDRESS", 9, "C010");

    /* renamed from: l, reason: collision with root package name */
    public static final g f9140l = new g("PARAM_LATITUDE", 10, "C011");

    /* renamed from: m, reason: collision with root package name */
    public static final g f9142m = new g("PARAM_LONGITUDE", 11, "C012");

    /* renamed from: n, reason: collision with root package name */
    public static final g f9144n = new g("PARAM_TELE_DEVICE_ID", 12, "A001");

    /* renamed from: o, reason: collision with root package name */
    public static final g f9146o = new g("PARAM_TELE_SUBSCRIBER_ID", 13, "A002");

    /* renamed from: p, reason: collision with root package name */
    public static final g f9148p = new g("PARAM_TELE_IMEI_SV", 14, "A003");

    /* renamed from: q, reason: collision with root package name */
    public static final g f9151q = new g("PARAM_TELE_GROUP_IDENTIFIER_L1", 15, "A004");

    /* renamed from: r, reason: collision with root package name */
    public static final g f9154r = new g("PARAM_TELE_LINE1_NUMBER", 16, "A005");

    /* renamed from: s, reason: collision with root package name */
    public static final g f9157s = new g("PARAM_TELE_MMS_UA_PROFILE_URL", 17, "A006");

    /* renamed from: t, reason: collision with root package name */
    public static final g f9160t = new g("PARAM_TELE_MMS_USER_AGENT", 18, "A007");

    /* renamed from: u, reason: collision with root package name */
    public static final g f9163u = new g("PARAM_TELE_NETWORK_COUNTRY_ISO", 19, "A008");

    /* renamed from: v, reason: collision with root package name */
    public static final g f9166v = new g("PARAM_TELE_NETWORK_OPERATOR", 20, "A009");

    /* renamed from: w, reason: collision with root package name */
    public static final g f9169w = new g("PARAM_TELE_NETWORK_OPERATOR_NAME", 21, "A010");

    /* renamed from: x, reason: collision with root package name */
    public static final g f9172x = new g("PARAM_TELE_NETWORK_TYPE", 22, "A011");

    /* renamed from: y, reason: collision with root package name */
    public static final g f9175y = new g("PARAM_TELE_PHONE_COUNT", 23, "A012");

    /* renamed from: z, reason: collision with root package name */
    public static final g f9178z = new g("PARAM_TELE_PHONE_TYPE", 24, "A013");

    /* renamed from: A, reason: collision with root package name */
    public static final g f9031A = new g("PARAM_TELE_SIM_COUNTRY_ISO", 25, "A014");

    /* renamed from: B, reason: collision with root package name */
    public static final g f9034B = new g("PARAM_TELE_SIM_OPERATOR", 26, "A015");

    /* renamed from: C, reason: collision with root package name */
    public static final g f9037C = new g("PARAM_TELE_SIM_OPERATOR_NAME", 27, "A016");

    /* renamed from: D, reason: collision with root package name */
    public static final g f9040D = new g("PARAM_TELE_SIM_SERIAL_NUMBER", 28, "A017");

    /* renamed from: E, reason: collision with root package name */
    public static final g f9043E = new g("PARAM_TELE_SIM_STATE", 29, "A018");

    /* renamed from: F, reason: collision with root package name */
    public static final g f9046F = new g("PARAM_TELE_VOICE_MAIL_ALPHA_TAG", 30, "A019");

    /* renamed from: G, reason: collision with root package name */
    public static final g f9049G = new g("PARAM_TELE_VOICE_MAIL_NUMBER", 31, "A020");

    /* renamed from: H, reason: collision with root package name */
    public static final g f9052H = new g("PARAM_TELE_HAS_ICC_CARD", 32, "A021");

    /* renamed from: I, reason: collision with root package name */
    public static final g f9055I = new g("PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED", 33, "A022");

    /* renamed from: J, reason: collision with root package name */
    public static final g f9058J = new g("PARAM_TELE_IS_NETWORK_ROAMING", 34, "A023");

    /* renamed from: K, reason: collision with root package name */
    public static final g f9061K = new g("PARAM_TELE_IS_SMS_CAPABLE", 35, "A024");

    /* renamed from: L, reason: collision with root package name */
    public static final g f9064L = new g("PARAM_TELE_IS_TTY_MODE_SUPPORTED", 36, "A025");

    /* renamed from: M, reason: collision with root package name */
    public static final g f9067M = new g("PARAM_TELE_IS_VOICE_CAPABLE", 37, "A026");

    /* renamed from: N, reason: collision with root package name */
    public static final g f9070N = new g("PARAM_TELE_IS_WORLD_PHONE", 38, "A027");

    /* renamed from: O, reason: collision with root package name */
    public static final g f9073O = new g("PARAM_WIFI_MAC", 39, "A028");

    /* renamed from: P, reason: collision with root package name */
    public static final g f9076P = new g("PARAM_WIFI_BSSID", 40, "A029");

    /* renamed from: Q, reason: collision with root package name */
    public static final g f9079Q = new g("PARAM_WIFI_SSID", 41, "A030");

    /* renamed from: R, reason: collision with root package name */
    public static final g f9082R = new g("PARAM_WIFI_NETWORK_ID", 42, "A031");

    /* renamed from: S, reason: collision with root package name */
    public static final g f9085S = new g("PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED", 43, "A032");

    /* renamed from: T, reason: collision with root package name */
    public static final g f9088T = new g("PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED", 44, "A033");

    /* renamed from: U, reason: collision with root package name */
    public static final g f9091U = new g("PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED", 45, "A034");

    /* renamed from: V, reason: collision with root package name */
    public static final g f9094V = new g("PARAM_WIFI_IS_P2P_SUPPORTED", 46, "A035");

    /* renamed from: W, reason: collision with root package name */
    public static final g f9097W = new g("PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED", 47, "A036");

    /* renamed from: X, reason: collision with root package name */
    public static final g f9100X = new g("PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE", 48, "A037");

    /* renamed from: Y, reason: collision with root package name */
    public static final g f9103Y = new g("PARAM_WIFI_IS_TDLS_SUPPORTED", 49, "A038");

    /* renamed from: Z, reason: collision with root package name */
    public static final g f9106Z = new g("PARAM_BLUETOOTH_ADDRESS", 50, "A039");

    /* renamed from: p0, reason: collision with root package name */
    public static final g f9149p0 = new g("PARAM_BLUETOOTH_BONDED_DEVICE", 51, "A040");

    /* renamed from: q0, reason: collision with root package name */
    public static final g f9152q0 = new g("PARAM_BLUETOOTH_IS_ENABLED", 52, "A041");

    /* renamed from: r0, reason: collision with root package name */
    public static final g f9155r0 = new g("PARAM_BUILD_BOARD", 53, "A042");

    /* renamed from: s0, reason: collision with root package name */
    public static final g f9158s0 = new g("PARAM_BUILD_BOOTLOADER", 54, "A043");

    /* renamed from: t0, reason: collision with root package name */
    public static final g f9161t0 = new g("PARAM_BUILD_BRAND", 55, "A044");

    /* renamed from: u0, reason: collision with root package name */
    public static final g f9164u0 = new g("PARAM_BUILD_DEVICE", 56, "A045");

    /* renamed from: v0, reason: collision with root package name */
    public static final g f9167v0 = new g("PARAM_BUILD_DISPLAY", 57, "A046");

    /* renamed from: w0, reason: collision with root package name */
    public static final g f9170w0 = new g("PARAM_BUILD_FINGERPRINT", 58, "A047");

    /* renamed from: x0, reason: collision with root package name */
    public static final g f9173x0 = new g("PARAM_BUILD_HARDWARE", 59, "A048");

    /* renamed from: y0, reason: collision with root package name */
    public static final g f9176y0 = new g("PARAM_BUILD_ID", 60, "A049");

    /* renamed from: z0, reason: collision with root package name */
    public static final g f9179z0 = new g("PARAM_BUILD_MANUFACTURER", 61, "A050");

    /* renamed from: A0, reason: collision with root package name */
    public static final g f9032A0 = new g("PARAM_BUILD_PRODUCT", 62, "A051");

    /* renamed from: B0, reason: collision with root package name */
    public static final g f9035B0 = new g("PARAM_BUILD_RADIO", 63, "A052");

    /* renamed from: C0, reason: collision with root package name */
    public static final g f9038C0 = new g("PARAM_BUILD_SERIAL", 64, "A053");

    /* renamed from: D0, reason: collision with root package name */
    public static final g f9041D0 = new g("PARAM_BUILD_SUPPORTED_32_BIT_ABIS", 65, "A054");

    /* renamed from: E0, reason: collision with root package name */
    public static final g f9044E0 = new g("PARAM_BUILD_SUPPORTED_64_BIT_ABIS", 66, "A055");

    /* renamed from: F0, reason: collision with root package name */
    public static final g f9047F0 = new g("PARAM_BUILD_TAGS", 67, "A056");

    /* renamed from: G0, reason: collision with root package name */
    public static final g f9050G0 = new g("PARAM_BUILD_TIME", 68, "A057");

    /* renamed from: H0, reason: collision with root package name */
    public static final g f9053H0 = new g("PARAM_BUILD_TYPE", 69, "A058");

    /* renamed from: I0, reason: collision with root package name */
    public static final g f9056I0 = new g("PARAM_BUILD_USER", 70, "A059");

    /* renamed from: J0, reason: collision with root package name */
    public static final g f9059J0 = new g("PARAM_BUILD_VERSION_CODENAME", 71, "A060");

    /* renamed from: K0, reason: collision with root package name */
    public static final g f9062K0 = new g("PARAM_BUILD_VERSION_INCREMENTAL", 72, "A061");

    /* renamed from: L0, reason: collision with root package name */
    public static final g f9065L0 = new g("PARAM_BUILD_VERSION_PREVIEW_SDK_INT", 73, "A062");

    /* renamed from: M0, reason: collision with root package name */
    public static final g f9068M0 = new g("PARAM_BUILD_VERSION_SDK_INT", 74, "A063");

    /* renamed from: N0, reason: collision with root package name */
    public static final g f9071N0 = new g("PARAM_BUILD_VERSION_SECURITY_PATCH", 75, "A064");

    /* renamed from: O0, reason: collision with root package name */
    public static final g f9074O0 = new g("PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED", 76, "A065");

    /* renamed from: P0, reason: collision with root package name */
    public static final g f9077P0 = new g("PARAM_SECURE_ACCESSIBILITY_ENABLED", 77, "A066");

    /* renamed from: Q0, reason: collision with root package name */
    public static final g f9080Q0 = new g("PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD", 78, "A067");

    /* renamed from: R0, reason: collision with root package name */
    public static final g f9083R0 = new g("PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS", 79, "A068");

    /* renamed from: S0, reason: collision with root package name */
    public static final g f9086S0 = new g("PARAM_SECURE_ANDROID_ID", 80, "A069");

    /* renamed from: T0, reason: collision with root package name */
    public static final g f9089T0 = new g("PARAM_SECURE_DATA_ROAMING", 81, "A070");

    /* renamed from: U0, reason: collision with root package name */
    public static final g f9092U0 = new g("PARAM_SECURE_DEFAULT_INPUT_METHOD", 82, "A071");

    /* renamed from: V0, reason: collision with root package name */
    public static final g f9095V0 = new g("PARAM_SECURE_DEVICE_PROVISIONED", 83, "A072");

    /* renamed from: W0, reason: collision with root package name */
    public static final g f9098W0 = new g("PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES", 84, "A073");

    /* renamed from: X0, reason: collision with root package name */
    public static final g f9101X0 = new g("PARAM_SECURE_ENABLED_INPUT_METHODS", 85, "A074");

    /* renamed from: Y0, reason: collision with root package name */
    public static final g f9104Y0 = new g("PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY", 86, "A075");

    /* renamed from: Z0, reason: collision with root package name */
    public static final g f9107Z0 = new g("PARAM_SECURE_INSTALL_NON_MARKET_APPS", 87, "A076");

    /* renamed from: a1, reason: collision with root package name */
    public static final g f9109a1 = new g("PARAM_SECURE_LOCATION_MODE", 88, "A077");

    /* renamed from: b1, reason: collision with root package name */
    public static final g f9112b1 = new g("PARAM_SECURE_SKIP_FIRST_USE_HINTS", 89, "A078");

    /* renamed from: c1, reason: collision with root package name */
    public static final g f9115c1 = new g("PARAM_SECURE_SYS_PROP_SETTING_VERSION", 90, "A079");

    /* renamed from: d1, reason: collision with root package name */
    public static final g f9118d1 = new g("PARAM_SECURE_TTS_DEFAULT_PITCH", 91, "A080");

    /* renamed from: e1, reason: collision with root package name */
    public static final g f9121e1 = new g("PARAM_SECURE_TTS_DEFAULT_RATE", 92, "A081");

    /* renamed from: f1, reason: collision with root package name */
    public static final g f9124f1 = new g("PARAM_SECURE_TTS_DEFAULT_SYNTH", 93, "A082");

    /* renamed from: g1, reason: collision with root package name */
    public static final g f9127g1 = new g("PARAM_SECURE_TTS_ENABLED_PLUGINS", 94, "A083");

    /* renamed from: h1, reason: collision with root package name */
    public static final g f9130h1 = new g("PARAM_GLOBAL_ADB_ENABLED", 95, "A084");

    /* renamed from: i1, reason: collision with root package name */
    public static final g f9133i1 = new g("PARAM_GLOBAL_AIRPLANE_MODE_RADIOS", 96, "A085");

    /* renamed from: j1, reason: collision with root package name */
    public static final g f9136j1 = new g("PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES", 97, "A086");

    /* renamed from: k1, reason: collision with root package name */
    public static final g f9139k1 = new g("PARAM_GLOBAL_ANIMATOR_DURATION_SCALE", 98, "A087");

    /* renamed from: l1, reason: collision with root package name */
    public static final g f9141l1 = new g("PARAM_GLOBAL_AUTO_TIME", 99, "A088");

    /* renamed from: m1, reason: collision with root package name */
    public static final g f9143m1 = new g("PARAM_GLOBAL_AUTO_TIME_ZONE", 100, "A089");

    /* renamed from: n1, reason: collision with root package name */
    public static final g f9145n1 = new g("PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED", 101, "A090");

    /* renamed from: o1, reason: collision with root package name */
    public static final g f9147o1 = new g("PARAM_GLOBAL_HTTP_PROXY", 102, "A091");

    /* renamed from: p1, reason: collision with root package name */
    public static final g f9150p1 = new g("PARAM_GLOBAL_NETWORK_PREFERENCE", 103, "A092");

    /* renamed from: q1, reason: collision with root package name */
    public static final g f9153q1 = new g("PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN", 104, "A093");

    /* renamed from: r1, reason: collision with root package name */
    public static final g f9156r1 = new g("PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE", 105, "A094");

    /* renamed from: s1, reason: collision with root package name */
    public static final g f9159s1 = new g("PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED", 106, "A095");

    /* renamed from: t1, reason: collision with root package name */
    public static final g f9162t1 = new g("PARAM_GLOBAL_USE_GOOGLE_MAIL", 107, "A096");

    /* renamed from: u1, reason: collision with root package name */
    public static final g f9165u1 = new g("PARAM_GLOBAL_WAIT_FOR_DEBUGGER", 108, "A097");

    /* renamed from: v1, reason: collision with root package name */
    public static final g f9168v1 = new g("PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON", 109, "A098");

    /* renamed from: w1, reason: collision with root package name */
    public static final g f9171w1 = new g("PARAM_SYSTEM_ACCELEROMETER_ROTATION", 110, "A099");

    /* renamed from: x1, reason: collision with root package name */
    public static final g f9174x1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY", 111, "A100");

    /* renamed from: y1, reason: collision with root package name */
    public static final g f9177y1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT", 112, "A101");

    /* renamed from: z1, reason: collision with root package name */
    public static final g f9180z1 = new g("PARAM_SYSTEM_DATE_FORMAT", 113, "A102");

    /* renamed from: A1, reason: collision with root package name */
    public static final g f9033A1 = new g("PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING", 114, "A103");

    /* renamed from: B1, reason: collision with root package name */
    public static final g f9036B1 = new g("PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING", 115, "A104");

    /* renamed from: C1, reason: collision with root package name */
    public static final g f9039C1 = new g("PARAM_SYSTEM_END_BUTTON_BEHAVIOR", 116, "A105");

    /* renamed from: D1, reason: collision with root package name */
    public static final g f9042D1 = new g("PARAM_SYSTEM_FONT_SCALE", 117, "A106");

    /* renamed from: E1, reason: collision with root package name */
    public static final g f9045E1 = new g("PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED", 118, "A107");

    /* renamed from: F1, reason: collision with root package name */
    public static final g f9048F1 = new g("PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED", 119, "A108");

    /* renamed from: G1, reason: collision with root package name */
    public static final g f9051G1 = new g("PARAM_SYSTEM_NOTIFICATION_SOUND", 120, "A109");

    /* renamed from: H1, reason: collision with root package name */
    public static final g f9054H1 = new g("PARAM_SYSTEM_MUTE_STREAMS_AFFECTED", 121, "A110");

    /* renamed from: I1, reason: collision with root package name */
    public static final g f9057I1 = new g("PARAM_SYSTEM_RINGTONE", 122, "A111");

    /* renamed from: J1, reason: collision with root package name */
    public static final g f9060J1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS", 123, "A112");

    /* renamed from: K1, reason: collision with root package name */
    public static final g f9063K1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE", 124, "A113");

    /* renamed from: L1, reason: collision with root package name */
    public static final g f9066L1 = new g("PARAM_SYSTEM_SCREEN_OFF_TIMEOUT", 125, "A114");

    /* renamed from: M1, reason: collision with root package name */
    public static final g f9069M1 = new g("PARAM_SYSTEM_SOUND_EFFECTS_ENABLED", 126, "A115");

    /* renamed from: N1, reason: collision with root package name */
    public static final g f9072N1 = new g("PARAM_SYSTEM_TEXT_AUTO_CAPS", 127, "A116");

    /* renamed from: O1, reason: collision with root package name */
    public static final g f9075O1 = new g("PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE", 128, "A117");

    /* renamed from: P1, reason: collision with root package name */
    public static final g f9078P1 = new g("PARAM_SYSTEM_TEXT_AUTO_REPLACE", TsExtractor.TS_STREAM_TYPE_AC3, "A118");

    /* renamed from: Q1, reason: collision with root package name */
    public static final g f9081Q1 = new g("PARAM_SYSTEM_TEXT_SHOW_PASSWORD", TsExtractor.TS_STREAM_TYPE_HDMV_DTS, "A119");

    /* renamed from: R1, reason: collision with root package name */
    public static final g f9084R1 = new g("PARAM_SYSTEM_TIME_12_24", 131, "A120");

    /* renamed from: S1, reason: collision with root package name */
    public static final g f9087S1 = new g("PARAM_SYSTEM_USER_ROTATION", 132, "A121");

    /* renamed from: T1, reason: collision with root package name */
    public static final g f9090T1 = new g("PARAM_SYSTEM_VIBRATE_ON", 133, "A122");

    /* renamed from: U1, reason: collision with root package name */
    public static final g f9093U1 = new g("PARAM_SYSTEM_VIBRATE_WHEN_RINGING", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, "A123");

    /* renamed from: V1, reason: collision with root package name */
    public static final g f9096V1 = new g("PARAM_PACKAGE_IS_SAFE_MODE", TsExtractor.TS_STREAM_TYPE_E_AC3, "A124");

    /* renamed from: W1, reason: collision with root package name */
    public static final g f9099W1 = new g("PARAM_PACKAGE_GET_INSTALLED_APPS", 136, "A125");

    /* renamed from: X1, reason: collision with root package name */
    public static final g f9102X1 = new g("PARAM_PACKAGE_INSTALLER_PACKAGE_NAME", 137, "A126");

    /* renamed from: Y1, reason: collision with root package name */
    public static final g f9105Y1 = new g("PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES", TsExtractor.TS_STREAM_TYPE_DTS, "A127");

    /* renamed from: Z1, reason: collision with root package name */
    public static final g f9108Z1 = new g("PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES", 139, "A128");

    /* renamed from: a2, reason: collision with root package name */
    public static final g f9110a2 = new g("PARAM_ENV_EXTERNAL_STORAGE_STATE", 140, "A129");

    /* renamed from: b2, reason: collision with root package name */
    public static final g f9113b2 = new g("PARAM_LOCALE_AVAILABLE_LOCALES", 141, "A130");

    /* renamed from: c2, reason: collision with root package name */
    public static final g f9116c2 = new g("PARAM_DISPLAY_DENSITY", 142, "A131");

    /* renamed from: d2, reason: collision with root package name */
    public static final g f9119d2 = new g("PARAM_DISPLAY_DENSITY_DPI", 143, "A132");

    /* renamed from: e2, reason: collision with root package name */
    public static final g f9122e2 = new g("PARAM_DISPLAY_SCALED_DENSITY", 144, "A133");

    /* renamed from: f2, reason: collision with root package name */
    public static final g f9125f2 = new g("PARAM_DISPLAY_XDPI", 145, "A134");

    /* renamed from: g2, reason: collision with root package name */
    public static final g f9128g2 = new g("PARAM_DISPLAY_YDPI", 146, "A135");

    /* renamed from: h2, reason: collision with root package name */
    public static final g f9131h2 = new g("PARAM_STAT_FS_TOTAL_BYTES", 147, "A136");

    static {
        g[] a8 = a();
        f9134i2 = a8;
        f9137j2 = R5.b.a(a8);
    }

    private g(String str, int i8, String str2) {
        this.f9181a = str2;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f9111b, f9114c, f9117d, f9120e, f9123f, f9126g, f9129h, f9132i, f9135j, f9138k, f9140l, f9142m, f9144n, f9146o, f9148p, f9151q, f9154r, f9157s, f9160t, f9163u, f9166v, f9169w, f9172x, f9175y, f9178z, f9031A, f9034B, f9037C, f9040D, f9043E, f9046F, f9049G, f9052H, f9055I, f9058J, f9061K, f9064L, f9067M, f9070N, f9073O, f9076P, f9079Q, f9082R, f9085S, f9088T, f9091U, f9094V, f9097W, f9100X, f9103Y, f9106Z, f9149p0, f9152q0, f9155r0, f9158s0, f9161t0, f9164u0, f9167v0, f9170w0, f9173x0, f9176y0, f9179z0, f9032A0, f9035B0, f9038C0, f9041D0, f9044E0, f9047F0, f9050G0, f9053H0, f9056I0, f9059J0, f9062K0, f9065L0, f9068M0, f9071N0, f9074O0, f9077P0, f9080Q0, f9083R0, f9086S0, f9089T0, f9092U0, f9095V0, f9098W0, f9101X0, f9104Y0, f9107Z0, f9109a1, f9112b1, f9115c1, f9118d1, f9121e1, f9124f1, f9127g1, f9130h1, f9133i1, f9136j1, f9139k1, f9141l1, f9143m1, f9145n1, f9147o1, f9150p1, f9153q1, f9156r1, f9159s1, f9162t1, f9165u1, f9168v1, f9171w1, f9174x1, f9177y1, f9180z1, f9033A1, f9036B1, f9039C1, f9042D1, f9045E1, f9048F1, f9051G1, f9054H1, f9057I1, f9060J1, f9063K1, f9066L1, f9069M1, f9072N1, f9075O1, f9078P1, f9081Q1, f9084R1, f9087S1, f9090T1, f9093U1, f9096V1, f9099W1, f9102X1, f9105Y1, f9108Z1, f9110a2, f9113b2, f9116c2, f9119d2, f9122e2, f9125f2, f9128g2, f9131h2};
    }

    public static R5.a b() {
        return f9137j2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f9134i2.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9181a;
    }
}
