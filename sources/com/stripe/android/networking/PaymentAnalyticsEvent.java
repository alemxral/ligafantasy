package com.stripe.android.networking;

import R5.b;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC3151p;
import x2.InterfaceC3871a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PaymentAnalyticsEvent implements InterfaceC3871a {

    /* renamed from: E0, reason: collision with root package name */
    private static final /* synthetic */ PaymentAnalyticsEvent[] f24802E0;

    /* renamed from: F0, reason: collision with root package name */
    private static final /* synthetic */ R5.a f24804F0;

    /* renamed from: b, reason: collision with root package name */
    private static final a f24825b;

    /* renamed from: a, reason: collision with root package name */
    private final String f24861a;

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24826c = new PaymentAnalyticsEvent("TokenCreate", 0, "token_creation");

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24827d = new PaymentAnalyticsEvent("PaymentMethodCreate", 1, "payment_method_creation");

    /* renamed from: e, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24828e = new PaymentAnalyticsEvent("PaymentMethodUpdate", 2, "payment_method_update");

    /* renamed from: f, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24829f = new PaymentAnalyticsEvent("CustomerRetrieve", 3, "retrieve_customer");

    /* renamed from: g, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24830g = new PaymentAnalyticsEvent("CustomerRetrievePaymentMethods", 4, "retrieve_payment_methods");

    /* renamed from: h, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24831h = new PaymentAnalyticsEvent("CustomerAttachPaymentMethod", 5, "attach_payment_method");

    /* renamed from: i, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24832i = new PaymentAnalyticsEvent("CustomerDetachPaymentMethod", 6, "detach_payment_method");

    /* renamed from: j, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24833j = new PaymentAnalyticsEvent("CustomerDeleteSource", 7, "delete_source");

    /* renamed from: k, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24834k = new PaymentAnalyticsEvent("CustomerSetShippingInfo", 8, "set_shipping_info");

    /* renamed from: l, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24835l = new PaymentAnalyticsEvent("CustomerAddSource", 9, "add_source");

    /* renamed from: m, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24836m = new PaymentAnalyticsEvent("CustomerSetDefaultSource", 10, "default_source");

    /* renamed from: n, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24837n = new PaymentAnalyticsEvent("IssuingRetrievePin", 11, "issuing_retrieve_pin");

    /* renamed from: o, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24838o = new PaymentAnalyticsEvent("IssuingUpdatePin", 12, "issuing_update_pin");

    /* renamed from: p, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24839p = new PaymentAnalyticsEvent("SourceCreate", 13, "source_creation");

    /* renamed from: q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24841q = new PaymentAnalyticsEvent("SourceRetrieve", 14, "retrieve_source");

    /* renamed from: r, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24843r = new PaymentAnalyticsEvent("PaymentIntentConfirm", 15, "payment_intent_confirmation");

    /* renamed from: s, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24845s = new PaymentAnalyticsEvent("PaymentIntentRetrieve", 16, "payment_intent_retrieval");

    /* renamed from: t, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24847t = new PaymentAnalyticsEvent("PaymentIntentRetrieveOrdered", 17, "payment_intent_retrieval_ordered");

    /* renamed from: u, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24849u = new PaymentAnalyticsEvent("PaymentIntentCancelSource", 18, "payment_intent_cancel_source");

    /* renamed from: v, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24851v = new PaymentAnalyticsEvent("PaymentIntentRefresh", 19, "payment_intent_refresh");

    /* renamed from: w, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24853w = new PaymentAnalyticsEvent("SetupIntentConfirm", 20, "setup_intent_confirmation");

    /* renamed from: x, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24855x = new PaymentAnalyticsEvent("SetupIntentRetrieve", 21, "setup_intent_retrieval");

    /* renamed from: y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24857y = new PaymentAnalyticsEvent("SetupIntentRetrieveOrdered", 22, "setup_intent_retrieval_ordered");

    /* renamed from: z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24859z = new PaymentAnalyticsEvent("SetupIntentCancelSource", 23, "setup_intent_cancel_source");

    /* renamed from: A, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24793A = new PaymentAnalyticsEvent("SetupIntentRefresh", 24, "setup_intent_refresh");

    /* renamed from: B, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24795B = new PaymentAnalyticsEvent("PaymentLauncherConfirmStarted", 25, "paymenthandler.confirm.started");

    /* renamed from: C, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24797C = new PaymentAnalyticsEvent("PaymentLauncherConfirmFinished", 26, "paymenthandler.confirm.finished");

    /* renamed from: D, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24799D = new PaymentAnalyticsEvent("PaymentLauncherNextActionStarted", 27, "paymenthandler.handle_next_action.started");

    /* renamed from: E, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24801E = new PaymentAnalyticsEvent("PaymentLauncherNextActionFinished", 28, "paymenthandler.handle_next_action.finished");

    /* renamed from: F, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24803F = new PaymentAnalyticsEvent("FileCreate", 29, "create_file");

    /* renamed from: G, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24805G = new PaymentAnalyticsEvent("Auth3ds1Sdk", 30, "3ds1_sdk");

    /* renamed from: H, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24806H = new PaymentAnalyticsEvent("Auth3ds1ChallengeStart", 31, "3ds1_challenge_start");

    /* renamed from: I, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24807I = new PaymentAnalyticsEvent("Auth3ds1ChallengeError", 32, "3ds1_challenge_error");

    /* renamed from: J, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24808J = new PaymentAnalyticsEvent("Auth3ds1ChallengeComplete", 33, "3ds1_challenge_complete");

    /* renamed from: K, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24809K = new PaymentAnalyticsEvent("AuthWithWebView", 34, "auth_with_webview");

    /* renamed from: L, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24810L = new PaymentAnalyticsEvent("AuthWithCustomTabs", 35, "auth_with_customtabs");

    /* renamed from: M, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24811M = new PaymentAnalyticsEvent("AuthWithDefaultBrowser", 36, "auth_with_defaultbrowser");

    /* renamed from: N, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24812N = new PaymentAnalyticsEvent("ConfirmReturnUrlNull", 37, "confirm_returnurl_null");

    /* renamed from: O, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24813O = new PaymentAnalyticsEvent("ConfirmReturnUrlDefault", 38, "confirm_returnurl_default");

    /* renamed from: P, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24814P = new PaymentAnalyticsEvent("ConfirmReturnUrlCustom", 39, "confirm_returnurl_custom");

    /* renamed from: Q, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24815Q = new PaymentAnalyticsEvent("FpxBankStatusesRetrieve", 40, "retrieve_fpx_bank_statuses");

    /* renamed from: R, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24816R = new PaymentAnalyticsEvent("StripeUrlRetrieve", 41, "retrieve_stripe_url");

    /* renamed from: S, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24817S = new PaymentAnalyticsEvent("Auth3ds2RequestParamsFailed", 42, "3ds2_authentication_request_params_failed");

    /* renamed from: T, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24818T = new PaymentAnalyticsEvent("Auth3ds2Fingerprint", 43, "3ds2_fingerprint");

    /* renamed from: U, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24819U = new PaymentAnalyticsEvent("Auth3ds2Start", 44, "3ds2_authenticate");

    /* renamed from: V, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24820V = new PaymentAnalyticsEvent("Auth3ds2Frictionless", 45, "3ds2_frictionless_flow");

    /* renamed from: W, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24821W = new PaymentAnalyticsEvent("Auth3ds2ChallengePresented", 46, "3ds2_challenge_flow_presented");

    /* renamed from: X, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24822X = new PaymentAnalyticsEvent("Auth3ds2ChallengeCanceled", 47, "3ds2_challenge_flow_canceled");

    /* renamed from: Y, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24823Y = new PaymentAnalyticsEvent("Auth3ds2ChallengeCompleted", 48, "3ds2_challenge_flow_completed");

    /* renamed from: Z, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24824Z = new PaymentAnalyticsEvent("Auth3ds2ChallengeErrored", 49, "3ds2_challenge_flow_errored");

    /* renamed from: p0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24840p0 = new PaymentAnalyticsEvent("Auth3ds2ChallengeTimedOut", 50, "3ds2_challenge_flow_timed_out");

    /* renamed from: q0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24842q0 = new PaymentAnalyticsEvent("Auth3ds2Fallback", 51, "3ds2_fallback");

    /* renamed from: r0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24844r0 = new PaymentAnalyticsEvent("AuthRedirect", 52, "url_redirect_next_action");

    /* renamed from: s0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24846s0 = new PaymentAnalyticsEvent("AuthError", 53, "auth_error");

    /* renamed from: t0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24848t0 = new PaymentAnalyticsEvent("AuthSourceStart", 54, "auth_source_start");

    /* renamed from: u0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24850u0 = new PaymentAnalyticsEvent("AuthSourceRedirect", 55, "auth_source_redirect");

    /* renamed from: v0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24852v0 = new PaymentAnalyticsEvent("AuthSourceResult", 56, "auth_source_result");

    /* renamed from: w0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24854w0 = new PaymentAnalyticsEvent("RadarSessionCreate", 57, "radar_session_create");

    /* renamed from: x0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24856x0 = new PaymentAnalyticsEvent("GooglePayLauncherInit", 58, "googlepaylauncher_init");

    /* renamed from: y0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24858y0 = new PaymentAnalyticsEvent("GooglePayPaymentMethodLauncherInit", 59, "googlepaypaymentmethodlauncher_init");

    /* renamed from: z0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24860z0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyAvailable", 60, "card_metadata_pk_available");

    /* renamed from: A0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24794A0 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyUnavailable", 61, "card_metadata_pk_unavailable");

    /* renamed from: B0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24796B0 = new PaymentAnalyticsEvent("CardMetadataLoadedTooSlow", 62, "card_metadata_loaded_too_slow");

    /* renamed from: C0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24798C0 = new PaymentAnalyticsEvent("CardMetadataLoadFailure", 63, "card_metadata_load_failure");

    /* renamed from: D0, reason: collision with root package name */
    public static final PaymentAnalyticsEvent f24800D0 = new PaymentAnalyticsEvent("CardMetadataMissingRange", 64, "card_metadata_missing_range");

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        PaymentAnalyticsEvent[] b8 = b();
        f24802E0 = b8;
        f24804F0 = b.a(b8);
        f24825b = new a(null);
    }

    private PaymentAnalyticsEvent(String str, int i8, String str2) {
        this.f24861a = str2;
    }

    private static final /* synthetic */ PaymentAnalyticsEvent[] b() {
        return new PaymentAnalyticsEvent[]{f24826c, f24827d, f24828e, f24829f, f24830g, f24831h, f24832i, f24833j, f24834k, f24835l, f24836m, f24837n, f24838o, f24839p, f24841q, f24843r, f24845s, f24847t, f24849u, f24851v, f24853w, f24855x, f24857y, f24859z, f24793A, f24795B, f24797C, f24799D, f24801E, f24803F, f24805G, f24806H, f24807I, f24808J, f24809K, f24810L, f24811M, f24812N, f24813O, f24814P, f24815Q, f24816R, f24817S, f24818T, f24819U, f24820V, f24821W, f24822X, f24823Y, f24824Z, f24840p0, f24842q0, f24844r0, f24846s0, f24848t0, f24850u0, f24852v0, f24854w0, f24856x0, f24858y0, f24860z0, f24794A0, f24796B0, f24798C0, f24800D0};
    }

    public static PaymentAnalyticsEvent valueOf(String str) {
        return (PaymentAnalyticsEvent) Enum.valueOf(PaymentAnalyticsEvent.class, str);
    }

    public static PaymentAnalyticsEvent[] values() {
        return (PaymentAnalyticsEvent[]) f24802E0.clone();
    }

    @Override // x2.InterfaceC3871a
    public String a() {
        return toString();
    }

    @Override // java.lang.Enum
    @Keep
    public String toString() {
        return "stripe_android." + this.f24861a;
    }
}
