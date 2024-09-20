package com.uptodown.activities;

import E4.j;
import L5.InterfaceC1227k;
import T4.I0;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import com.inmobi.cmp.ChoiceCmp;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3311E;
import l5.C3323k;
import l5.C3330r;

/* loaded from: classes4.dex */
public final class GdprPrivacySettings extends AbstractActivityC2489a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28244O = L5.l.b(new a());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0 invoke() {
            return I0.c(GdprPrivacySettings.this.getLayoutInflater());
        }
    }

    private final I0 i3() {
        return (I0) this.f28244O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(GdprPrivacySettings this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.i3().f10150k;
        AbstractC3159y.h(switchCompat, "binding.sAnalyticsWizardPrivacy");
        TextView textView = this$0.i3().f10157r;
        AbstractC3159y.h(textView, "binding.tvDescriptionAnalyticsWizardPrivacy");
        this$0.v3(switchCompat, textView, z8);
        this$0.t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(GdprPrivacySettings this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.i3().f10152m;
        AbstractC3159y.h(switchCompat, "binding.sErrorLogWizardPrivacy");
        TextView textView = this$0.i3().f10159t;
        AbstractC3159y.h(textView, "binding.tvDescriptionErrorLogWizardPrivacy");
        this$0.v3(switchCompat, textView, z8);
        this$0.t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.r3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(GdprPrivacySettings this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.i3().f10151l;
        AbstractC3159y.h(switchCompat, "binding.sDeviceAnalysisWizardPrivacy");
        TextView textView = this$0.i3().f10158s;
        AbstractC3159y.h(textView, "binding.tvDescriptionDeviceAnalysisWizardPrivacy");
        this$0.v3(switchCompat, textView, z8);
        this$0.t3();
        if (!this$0.i3().f10151l.isChecked()) {
            this$0.i3().f10139C.setVisibility(0);
        } else {
            this$0.i3().f10139C.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!this$0.isFinishing()) {
            C3323k c3323k = new C3323k();
            String string = this$0.getString(R.string.url_contact);
            AbstractC3159y.h(string, "getString(R.string.url_contact)");
            C3323k.r(c3323k, this$0, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        new C3311E().a(this$0, true);
        new C3311E().b(false);
        this$0.i3().f10151l.setChecked(true);
        this$0.i3().f10150k.setChecked(true);
        this$0.i3().f10152m.setChecked(true);
        this$0.s3();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.t3();
        this$0.i3().f10151l.setChecked(false);
        this$0.i3().f10150k.setChecked(false);
        this$0.i3().f10152m.setChecked(false);
    }

    private final void r3() {
        ChoiceCmp.forceDisplayUI(this);
        ChoiceCmp.showUSRegulationScreen(this);
    }

    private final void s3() {
        boolean isChecked = i3().f10152m.isChecked();
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        if (aVar.Q(this) != isChecked) {
            aVar.A0(this, isChecked);
            new C3330r(this).f();
        }
        boolean isChecked2 = i3().f10150k.isChecked();
        if (aVar.M(this) != isChecked2) {
            aVar.u0(this, isChecked2);
        }
        boolean isChecked3 = i3().f10151l.isChecked();
        if (aVar.k0(this) != isChecked3) {
            aVar.e1(this, isChecked3);
        }
        if (aVar.k0(this)) {
            UptodownApp.a aVar2 = UptodownApp.f27990B;
            UptodownApp.a.N0(aVar2, this, false, false, 6, null);
            aVar2.K(this);
            setResult(-1);
            return;
        }
        setResult(0);
    }

    private final void t3() {
        if (i3().f10155p.getVisibility() == 0) {
            i3().f10153n.setText(R.string.save_gdpr);
            i3().f10153n.setOnClickListener(new View.OnClickListener() { // from class: A4.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GdprPrivacySettings.u3(GdprPrivacySettings.this, view);
                }
            });
            i3().f10155p.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.s3();
        this$0.finish();
    }

    private final void v3(SwitchCompat switchCompat, TextView textView, boolean z8) {
        if (z8) {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
            textView.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        } else {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
            textView.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i3().getRoot());
        i3().f10141b.setOnClickListener(new View.OnClickListener() { // from class: A4.G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.j3(GdprPrivacySettings.this, view);
            }
        });
        TextView textView = i3().f10161v;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        i3().f10138B.setTypeface(aVar.t());
        i3().f10154o.setTypeface(aVar.u());
        i3().f10164y.setTypeface(aVar.t());
        i3().f10158s.setTypeface(aVar.u());
        i3().f10163x.setTypeface(aVar.t());
        i3().f10157r.setTypeface(aVar.u());
        i3().f10165z.setTypeface(aVar.t());
        i3().f10159t.setTypeface(aVar.u());
        i3().f10162w.setTypeface(aVar.t());
        i3().f10156q.setTypeface(aVar.u());
        i3().f10137A.setTypeface(aVar.t());
        i3().f10160u.setTypeface(aVar.u());
        i3().f10153n.setTypeface(aVar.t());
        i3().f10155p.setTypeface(aVar.t());
        i3().f10139C.setText("⚠ " + getString(R.string.tracking_disabled_warning_gdpr) + " ⚠");
        i3().f10139C.setTypeface(aVar.u());
        SwitchCompat switchCompat = i3().f10150k;
        SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
        switchCompat.setChecked(aVar2.M(this));
        i3().f10152m.setChecked(aVar2.Q(this));
        i3().f10151l.setChecked(aVar2.k0(this));
        if (aVar2.V(this)) {
            SwitchCompat switchCompat2 = i3().f10150k;
            AbstractC3159y.h(switchCompat2, "binding.sAnalyticsWizardPrivacy");
            TextView textView2 = i3().f10157r;
            AbstractC3159y.h(textView2, "binding.tvDescriptionAnalyticsWizardPrivacy");
            v3(switchCompat2, textView2, i3().f10150k.isChecked());
            SwitchCompat switchCompat3 = i3().f10152m;
            AbstractC3159y.h(switchCompat3, "binding.sErrorLogWizardPrivacy");
            TextView textView3 = i3().f10159t;
            AbstractC3159y.h(textView3, "binding.tvDescriptionErrorLogWizardPrivacy");
            v3(switchCompat3, textView3, i3().f10152m.isChecked());
            SwitchCompat switchCompat4 = i3().f10151l;
            AbstractC3159y.h(switchCompat4, "binding.sDeviceAnalysisWizardPrivacy");
            TextView textView4 = i3().f10158s;
            AbstractC3159y.h(textView4, "binding.tvDescriptionDeviceAnalysisWizardPrivacy");
            v3(switchCompat4, textView4, i3().f10151l.isChecked());
        } else {
            SwitchCompat switchCompat5 = i3().f10150k;
            AbstractC3159y.h(switchCompat5, "binding.sAnalyticsWizardPrivacy");
            TextView textView5 = i3().f10157r;
            AbstractC3159y.h(textView5, "binding.tvDescriptionAnalyticsWizardPrivacy");
            v3(switchCompat5, textView5, true);
            SwitchCompat switchCompat6 = i3().f10152m;
            AbstractC3159y.h(switchCompat6, "binding.sErrorLogWizardPrivacy");
            TextView textView6 = i3().f10159t;
            AbstractC3159y.h(textView6, "binding.tvDescriptionErrorLogWizardPrivacy");
            v3(switchCompat6, textView6, true);
            SwitchCompat switchCompat7 = i3().f10151l;
            AbstractC3159y.h(switchCompat7, "binding.sDeviceAnalysisWizardPrivacy");
            TextView textView7 = i3().f10158s;
            AbstractC3159y.h(textView7, "binding.tvDescriptionDeviceAnalysisWizardPrivacy");
            v3(switchCompat7, textView7, true);
            i3().f10150k.setChecked(true);
            i3().f10152m.setChecked(true);
            i3().f10151l.setChecked(true);
        }
        if (!i3().f10151l.isChecked()) {
            i3().f10139C.setVisibility(0);
        } else {
            i3().f10139C.setVisibility(8);
        }
        i3().f10150k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A4.H
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.k3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        i3().f10152m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A4.I
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.l3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        i3().f10143d.setOnClickListener(new View.OnClickListener() { // from class: A4.J
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.m3(GdprPrivacySettings.this, view);
            }
        });
        i3().f10151l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A4.K
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.n3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        i3().f10148i.setOnClickListener(new View.OnClickListener() { // from class: A4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.o3(GdprPrivacySettings.this, view);
            }
        });
        i3().f10153n.setOnClickListener(new View.OnClickListener() { // from class: A4.M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.p3(GdprPrivacySettings.this, view);
            }
        });
        i3().f10155p.setOnClickListener(new View.OnClickListener() { // from class: A4.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.q3(GdprPrivacySettings.this, view);
            }
        });
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        if (!aVar.V(this)) {
            aVar.G0(this, true);
            aVar.u0(this, true);
            aVar.A0(this, true);
            aVar.e1(this, true);
        }
    }
}
