package com.inmobi.cmp.presentation.components;

import H7.f;
import H7.m;
import J7.g;
import L5.I;
import L5.t;
import P5.d;
import Q7.c;
import X5.n;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import c.C1889c;
import c.C1895i;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.data.model.ChoiceColor;
import com.inmobi.cmp.data.model.ThemeMode;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import q.C3632f;
import v5.C3832b;

/* loaded from: classes3.dex */
public final class CmpActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17835b = 0;

    /* renamed from: a, reason: collision with root package name */
    public c f17836a;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17837a;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            iArr[ThemeMode.LIGHT.ordinal()] = 1;
            iArr[ThemeMode.DARK.ordinal()] = 2;
            f17837a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        public int f17838a;

        public b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new b((d) obj2).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            boolean z8;
            Object e8 = Q5.b.e();
            int i8 = this.f17838a;
            c cVar = null;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar2 = CmpActivity.this.f17836a;
                if (cVar2 != null) {
                    this.f17838a = 1;
                    obj = AbstractC2825i.g(C2812b0.b(), new Q7.b(cVar2, null), this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
            O7.d dVar = O7.d.f7793a;
            O7.d.f7798f = (J7.c) obj;
            CmpActivity cmpActivity = CmpActivity.this;
            int i9 = CmpActivity.f17835b;
            Bundle extras = cmpActivity.getIntent().getExtras();
            if (extras == null) {
                string = null;
            } else {
                string = extras.getString("EXTRA_ACTION");
            }
            if (string != null) {
                int hashCode = string.hashCode();
                boolean z9 = false;
                if (hashCode != -2113348999) {
                    if (hashCode != -1969243076) {
                        if (hashCode != 1166950650) {
                            if (hashCode == 1517267649 && string.equals("ACTION_SHOW_CCPA_SCREEN")) {
                                if (!cmpActivity.isFinishing()) {
                                    FragmentManager supportFragmentManager = cmpActivity.getSupportFragmentManager();
                                    AbstractC3159y.h(supportFragmentManager, "supportFragmentManager");
                                    if (!supportFragmentManager.isDestroyed() && !supportFragmentManager.isStateSaved()) {
                                        if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                            m mVar = m.f3644a;
                                            mVar.e(f.CCPA, false);
                                            if (C1895i.f14827b) {
                                                mVar.e(f.USPWITHGBC, false);
                                            }
                                            supportFragmentManager.beginTransaction().add(new P7.d(), P7.d.f8100y).commit();
                                        } else {
                                            C3832b.b(C3832b.f38857a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                            cmpActivity.finish();
                                        }
                                    }
                                }
                            }
                        } else if (string.equals("ACTION_SHOW_CMP_DIALOG")) {
                            Bundle extras2 = cmpActivity.getIntent().getExtras();
                            if (extras2 != null) {
                                z9 = extras2.getBoolean("EXTRA_FORCE", false);
                            }
                            g c8 = dVar.p().c();
                            if (c8.f5602a.length() > 0 && c8.f5603b.length() > 0 && c8.f5604c.length() > 0 && c8.f5605d.length() > 0) {
                                m mVar2 = m.f3644a;
                                boolean z10 = !z9;
                                mVar2.e(f.GDPR, z10);
                                if (C1895i.f14827b) {
                                    mVar2.e(f.GDPRWITHGBC, z10);
                                }
                                D5.f fVar = new D5.f();
                                String simpleName = D5.f.class.getSimpleName();
                                AbstractC3159y.h(simpleName, "PrivacyBottomSheet::class.java.simpleName");
                                if (!cmpActivity.isFinishing()) {
                                    FragmentManager supportFragmentManager2 = cmpActivity.getSupportFragmentManager();
                                    AbstractC3159y.h(supportFragmentManager2, "supportFragmentManager");
                                    if (!supportFragmentManager2.isDestroyed() && !supportFragmentManager2.isStateSaved()) {
                                        fVar.show(supportFragmentManager2, simpleName);
                                    }
                                }
                                ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                                ChoiceCmpCallback callback = choiceCmp.getCallback();
                                if (callback != null) {
                                    callback.onCmpUIShown(choiceCmp.ping$app_release(true, CmpStatus.LOADED, DisplayStatus.VISIBLE));
                                }
                            } else {
                                C3832b.b(C3832b.f38857a, ChoiceError.MISSING_INIT_SCREEN_TEXTS, null, null, null, null, 30);
                                cmpActivity.finish();
                            }
                        }
                    } else if (string.equals("ACTION_SHOW_GBC_SCREEN")) {
                        if (!cmpActivity.isFinishing()) {
                            FragmentManager supportFragmentManager3 = cmpActivity.getSupportFragmentManager();
                            AbstractC3159y.h(supportFragmentManager3, "supportFragmentManager");
                            if (!supportFragmentManager3.isDestroyed() && !supportFragmentManager3.isStateSaved()) {
                                if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                    m.f3644a.e(f.GBC, false);
                                    supportFragmentManager3.beginTransaction().add(new C1889c(), C1889c.f14807r).commit();
                                } else {
                                    C3832b.b(C3832b.f38857a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                    cmpActivity.finish();
                                }
                            }
                        }
                    }
                } else if (string.equals("ACTION_SHOW_US_REGULATION_SCREEN")) {
                    Bundle extras3 = cmpActivity.getIntent().getExtras();
                    if (extras3 == null) {
                        z8 = false;
                    } else {
                        z8 = extras3.getBoolean("EXTRA_FORCE", false);
                    }
                    if (!cmpActivity.isFinishing()) {
                        FragmentManager supportFragmentManager4 = cmpActivity.getSupportFragmentManager();
                        AbstractC3159y.h(supportFragmentManager4, "supportFragmentManager");
                        if (!supportFragmentManager4.isDestroyed() && !supportFragmentManager4.isStateSaved()) {
                            if (ChoiceCmp.INSTANCE.isViewModelAvailable$app_release()) {
                                if (C1895i.f14827b) {
                                    m.f3644a.e(f.USPWITHGBC, false);
                                }
                                c cVar3 = cmpActivity.f17836a;
                                if (cVar3 != null) {
                                    cVar = cVar3;
                                } else {
                                    AbstractC3159y.y("viewModel");
                                }
                                if (cVar.f8375b.f2373b.f2324M) {
                                    String str = O7.d.f7806n;
                                    C6.g state = C6.g.CALIFORNIA;
                                    AbstractC3159y.i(state, "state");
                                    if (AbstractC3159y.d(str, DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                                        m.f3644a.e(f.CCPA, false);
                                        supportFragmentManager4.beginTransaction().add(new P7.d(), P7.d.f8100y).commit();
                                    }
                                }
                                m.f3644a.e(f.MSPA, !z8);
                                supportFragmentManager4.beginTransaction().add(new C3632f(), C3632f.f37131y).commit();
                            } else {
                                C3832b.b(C3832b.f38857a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
                                cmpActivity.finish();
                            }
                        }
                    }
                }
                return I.f6474a;
            }
            cmpActivity.finish();
            return I.f6474a;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i8;
        ChoiceColor darkModeColors;
        super.onCreate(bundle);
        O7.d dVar = O7.d.f7793a;
        ThemeMode themeMode = O7.d.f7796d.getThemeMode();
        if (themeMode == null) {
            i8 = -1;
        } else {
            i8 = a.f17837a[themeMode.ordinal()];
        }
        if (i8 != 1) {
            if (i8 == 2) {
                getDelegate().setLocalNightMode(2);
            }
        } else {
            getDelegate().setLocalNightMode(1);
        }
        AbstractC3159y.i(this, "context");
        AbstractC3159y.i(this, "context");
        if (O7.d.f7818z == null) {
            if (O7.d.f7796d.getThemeMode() == ThemeMode.LIGHT) {
                darkModeColors = O7.d.f7796d.getLightModeColors();
            } else if (O7.d.f7796d.getThemeMode() == ThemeMode.DARK) {
                darkModeColors = O7.d.f7796d.getDarkModeColors();
            } else if (O7.d.f7796d.getLightModeColors() != null && O7.d.f7796d.getDarkModeColors() != null) {
                int i9 = getResources().getConfiguration().uiMode & 48;
                if (i9 != 16) {
                    if (i9 == 32) {
                        darkModeColors = O7.d.f7796d.getDarkModeColors();
                    }
                    darkModeColors = O7.d.f7796d.getLightModeColors();
                } else {
                    darkModeColors = O7.d.f7796d.getLightModeColors();
                }
            } else {
                if (O7.d.f7796d.getLightModeColors() == null) {
                    darkModeColors = O7.d.f7796d.getDarkModeColors();
                }
                darkModeColors = O7.d.f7796d.getLightModeColors();
            }
            O7.d.f7818z = new L7.b(darkModeColors, new M7.a());
        }
        L7.a aVar = O7.d.f7818z;
        if (aVar == null) {
            AbstractC3159y.y("choiceStyleSheetRepository");
            aVar = null;
        }
        c cVar = new c(aVar, dVar.j());
        AbstractC3159y.i(cVar, "<set-?>");
        this.f17836a = cVar;
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }
}
