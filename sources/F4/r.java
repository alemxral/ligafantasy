package F4;

import E4.j;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import com.uptodown.core.activities.FileExplorerActivity;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class r extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private AlertDialog f2617a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f2618b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f2619c;

    /* renamed from: d, reason: collision with root package name */
    private RadioButton f2620d;

    /* renamed from: e, reason: collision with root package name */
    private RadioButton f2621e;

    /* renamed from: f, reason: collision with root package name */
    private RadioButton f2622f;

    /* renamed from: g, reason: collision with root package name */
    private CheckBox f2623g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f2624h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f2625i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f2626j;

    /* renamed from: k, reason: collision with root package name */
    private String f2627k;

    /* renamed from: l, reason: collision with root package name */
    private final ActivityResultLauncher f2628l;

    /* renamed from: m, reason: collision with root package name */
    private final ActivityResultLauncher f2629m;

    /* renamed from: n, reason: collision with root package name */
    private final ActivityResultLauncher f2630n;

    /* renamed from: o, reason: collision with root package name */
    private ActivityResultLauncher f2631o;

    public r() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.j
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.Y(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…nDenied()\n        }\n    }");
        this.f2628l = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.s0(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.f2629m = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.l
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.v0(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult3, "registerForActivityResul…nownSourcesResult()\n    }");
        this.f2630n = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.P(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult4, "registerForActivityResul…        tmp(result)\n    }");
        this.f2631o = registerForActivityResult4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
        intent.putExtra("select_path", 1);
        this$0.f2631o.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(r this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(r this$0, RadioGroup radioGroup, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(r this$0, RadioGroup radioGroup, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        TextView textView = this$0.f2625i;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC3159y.y("tvErrorPath");
            textView = null;
        }
        if (textView.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this$0.getApplicationContext(), E4.a.f1997a);
            TextView textView3 = this$0.f2625i;
            if (textView3 == null) {
                AbstractC3159y.y("tvErrorPath");
            } else {
                textView2 = textView3;
            }
            textView2.startAnimation(loadAnimation);
            return;
        }
        if (this$0.f2626j != null) {
            new G4.a(this$0).E(AbstractC3159y.d(this$0.f2626j, Boolean.TRUE));
        }
        if (this$0.f2627k != null) {
            new G4.a(this$0).y(this$0.f2627k);
        }
        this$0.r0();
        AlertDialog alertDialog = this$0.f2617a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.f2617a = null;
        this$0.Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2617a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.f2617a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2617a;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2617a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2617a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2617a;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
        this$0.j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(r this$0, ActivityResult result) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.h(result, "result");
        this$0.u0(result);
    }

    private final String Q() {
        String string = getString(E4.h.f2230c);
        AbstractC3159y.h(string, "getString(R.string.app_name)");
        return string;
    }

    private final long S() {
        try {
            PackageManager packageManager = getPackageManager();
            AbstractC3159y.h(packageManager, "packageManager");
            String packageName = getPackageName();
            AbstractC3159y.h(packageName, "packageName");
            return new N4.f().m(N4.q.d(packageManager, packageName, 0));
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    private final void W() {
        G4.a aVar = new G4.a(this);
        RadioButton radioButton = this.f2619c;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            AbstractC3159y.y("rbAppName");
            radioButton = null;
        }
        radioButton.setChecked(aVar.i());
        RadioButton radioButton3 = this.f2620d;
        if (radioButton3 == null) {
            AbstractC3159y.y("rbPackagename");
            radioButton3 = null;
        }
        radioButton3.setChecked(aVar.j());
        CheckBox checkBox = this.f2623g;
        if (checkBox == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox = null;
        }
        checkBox.setChecked(aVar.k());
        String a8 = aVar.a();
        RadioButton radioButton4 = this.f2621e;
        if (radioButton4 == null) {
            AbstractC3159y.y("rbXapkExtension");
            radioButton4 = null;
        }
        radioButton4.setChecked(g6.n.s(a8, ".xapk", true));
        RadioButton radioButton5 = this.f2622f;
        if (radioButton5 == null) {
            AbstractC3159y.y("rbApksExtension");
            radioButton5 = null;
        }
        RadioButton radioButton6 = this.f2621e;
        if (radioButton6 == null) {
            AbstractC3159y.y("rbXapkExtension");
        } else {
            radioButton2 = radioButton6;
        }
        radioButton5.setChecked(!radioButton2.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(r this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.U()) {
            this$0.h0();
        } else {
            this$0.f0();
        }
    }

    private final void r0() {
        String str;
        G4.a aVar = new G4.a(this);
        RadioButton radioButton = this.f2619c;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            AbstractC3159y.y("rbAppName");
            radioButton = null;
        }
        aVar.u(radioButton.isChecked());
        RadioButton radioButton3 = this.f2620d;
        if (radioButton3 == null) {
            AbstractC3159y.y("rbPackagename");
            radioButton3 = null;
        }
        aVar.v(radioButton3.isChecked());
        CheckBox checkBox = this.f2623g;
        if (checkBox == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox = null;
        }
        aVar.w(checkBox.isChecked());
        RadioButton radioButton4 = this.f2621e;
        if (radioButton4 == null) {
            AbstractC3159y.y("rbXapkExtension");
        } else {
            radioButton2 = radioButton4;
        }
        if (radioButton2.isChecked()) {
            str = ".xapk";
        } else {
            str = ".apks";
        }
        aVar.x(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(r this$0, ActivityResult activityResult) {
        Uri uri;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Integer num = null;
            if (data != null) {
                uri = data.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                Intent data2 = activityResult.getData();
                if (data2 != null) {
                    num = Integer.valueOf(data2.getFlags());
                }
                if (num != null) {
                    num = Integer.valueOf(num.intValue() & 3);
                }
                ContentResolver contentResolver = this$0.getContentResolver();
                AbstractC3159y.f(num);
                contentResolver.takePersistableUriPermission(uri, num.intValue());
                if (new N4.f().q(uri)) {
                    this$0.d0();
                    return;
                } else {
                    this$0.e0();
                    return;
                }
            }
            this$0.c0();
        }
    }

    private final void u0(ActivityResult activityResult) {
        String str;
        Boolean bool;
        Uri uri;
        Boolean bool2;
        String str2;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        if (activityResult.getResultCode() == 145) {
            Intent data = activityResult.getData();
            TextView textView = null;
            if (data != null && (extras3 = data.getExtras()) != null) {
                str = extras3.getString("path_selected");
            } else {
                str = null;
            }
            this.f2627k = str;
            Intent data2 = activityResult.getData();
            if (data2 != null && (extras2 = data2.getExtras()) != null) {
                bool = Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
            } else {
                bool = null;
            }
            this.f2626j = bool;
            Intent data3 = activityResult.getData();
            if (data3 != null) {
                uri = data3.getData();
            } else {
                uri = null;
            }
            if (this.f2627k != null) {
                String str3 = this.f2627k;
                AbstractC3159y.f(str3);
                File file = new File(str3);
                TextView textView2 = this.f2624h;
                if (textView2 == null) {
                    AbstractC3159y.y("tvPath");
                    textView2 = null;
                }
                textView2.setText(this.f2627k);
                if (file.exists() && file.isDirectory() && file.canWrite()) {
                    TextView textView3 = this.f2625i;
                    if (textView3 == null) {
                        AbstractC3159y.y("tvErrorPath");
                    } else {
                        textView = textView3;
                    }
                    textView.setVisibility(8);
                    return;
                }
                TextView textView4 = this.f2625i;
                if (textView4 == null) {
                    AbstractC3159y.y("tvErrorPath");
                } else {
                    textView = textView4;
                }
                textView.setVisibility(0);
                return;
            }
            if (uri != null) {
                String lastPathSegment = uri.getLastPathSegment();
                Intent data4 = activityResult.getData();
                if (data4 != null && (extras = data4.getExtras()) != null) {
                    bool2 = Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                } else {
                    bool2 = null;
                }
                this.f2626j = bool2;
                if (lastPathSegment != null) {
                    str2 = lastPathSegment.substring(g6.n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                    AbstractC3159y.h(str2, "this as java.lang.String).substring(startIndex)");
                } else {
                    str2 = null;
                }
                this.f2627k = str2;
                if (AbstractC3159y.d(this.f2626j, Boolean.TRUE)) {
                    TextView textView5 = this.f2624h;
                    if (textView5 == null) {
                        AbstractC3159y.y("tvPath");
                        textView5 = null;
                    }
                    textView5.setText(getString(E4.h.f2247k0) + '/' + this.f2627k);
                } else {
                    TextView textView6 = this.f2624h;
                    if (textView6 == null) {
                        AbstractC3159y.y("tvPath");
                        textView6 = null;
                    }
                    textView6.setText(getString(E4.h.f2220U) + '/' + this.f2627k);
                }
                DocumentFile fromSingleUri = DocumentFile.fromSingleUri(this, uri);
                if (fromSingleUri != null && fromSingleUri.exists() && fromSingleUri.isDirectory() && fromSingleUri.canWrite()) {
                    TextView textView7 = this.f2625i;
                    if (textView7 == null) {
                        AbstractC3159y.y("tvErrorPath");
                    } else {
                        textView = textView7;
                    }
                    textView.setVisibility(8);
                    return;
                }
                TextView textView8 = this.f2625i;
                if (textView8 == null) {
                    AbstractC3159y.y("tvErrorPath");
                } else {
                    textView = textView8;
                }
                textView.setVisibility(0);
                return;
            }
            TextView textView9 = this.f2625i;
            if (textView9 == null) {
                AbstractC3159y.y("tvErrorPath");
            } else {
                textView = textView9;
            }
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(r this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.l0();
    }

    private final void w0() {
        String packageName;
        String str;
        RadioButton radioButton = this.f2619c;
        TextView textView = null;
        if (radioButton == null) {
            AbstractC3159y.y("rbAppName");
            radioButton = null;
        }
        if (radioButton.isChecked()) {
            packageName = Q();
        } else {
            packageName = getPackageName();
            AbstractC3159y.h(packageName, "packageName");
        }
        CheckBox checkBox = this.f2623g;
        if (checkBox == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox = null;
        }
        if (checkBox.isChecked()) {
            packageName = packageName + '_' + S();
        }
        RadioButton radioButton2 = this.f2621e;
        if (radioButton2 == null) {
            AbstractC3159y.y("rbXapkExtension");
            radioButton2 = null;
        }
        if (radioButton2.isChecked()) {
            str = packageName + ".xapk";
        } else {
            str = packageName + ".apks";
        }
        TextView textView2 = this.f2618b;
        if (textView2 == null) {
            AbstractC3159y.y("tvResult");
        } else {
            textView = textView2;
        }
        textView.setText(str);
    }

    public final void B() {
        Window window;
        AlertDialog alertDialog = this.f2617a;
        if (alertDialog != null && alertDialog != null) {
            alertDialog.dismiss();
        }
        CheckBox checkBox = null;
        View inflate = getLayoutInflater().inflate(E4.f.f2189m, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2083U1);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        View findViewById = inflate.findViewById(E4.e.f2041G1);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.tv_path_dialog_path)");
        TextView textView2 = (TextView) findViewById;
        this.f2624h = textView2;
        if (textView2 == null) {
            AbstractC3159y.y("tvPath");
            textView2 = null;
        }
        textView2.setTypeface(aVar.u());
        if (new G4.a(this).n()) {
            TextView textView3 = this.f2624h;
            if (textView3 == null) {
                AbstractC3159y.y("tvPath");
                textView3 = null;
            }
            textView3.setText(getString(E4.h.f2247k0) + '/' + new G4.a(this).c());
        } else {
            TextView textView4 = this.f2624h;
            if (textView4 == null) {
                AbstractC3159y.y("tvPath");
                textView4 = null;
            }
            textView4.setText(new G4.a(this).c());
        }
        View findViewById2 = inflate.findViewById(E4.e.f2113e1);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.tv_error_path)");
        TextView textView5 = (TextView) findViewById2;
        this.f2625i = textView5;
        if (textView5 == null) {
            AbstractC3159y.y("tvErrorPath");
            textView5 = null;
        }
        textView5.setTypeface(aVar.u());
        ImageView imageView = (ImageView) inflate.findViewById(E4.e.f2147q);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r.C(r.this, view);
                }
            });
        }
        ((TextView) inflate.findViewById(E4.e.f2029C1)).setTypeface(aVar.u());
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(E4.e.f2078T);
        View findViewById3 = inflate.findViewById(E4.e.f2060N);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.rb_option_appname)");
        RadioButton radioButton = (RadioButton) findViewById3;
        this.f2619c = radioButton;
        if (radioButton == null) {
            AbstractC3159y.y("rbAppName");
            radioButton = null;
        }
        radioButton.setTypeface(aVar.u());
        View findViewById4 = inflate.findViewById(E4.e.f2063O);
        AbstractC3159y.h(findViewById4, "view.findViewById(R.id.rb_option_packagename)");
        RadioButton radioButton2 = (RadioButton) findViewById4;
        this.f2620d = radioButton2;
        if (radioButton2 == null) {
            AbstractC3159y.y("rbPackagename");
            radioButton2 = null;
        }
        radioButton2.setTypeface(aVar.u());
        ((TextView) inflate.findViewById(E4.e.f2116f1)).setTypeface(aVar.u());
        RadioGroup radioGroup2 = (RadioGroup) inflate.findViewById(E4.e.f2075S);
        View findViewById5 = inflate.findViewById(E4.e.f2069Q);
        AbstractC3159y.h(findViewById5, "view.findViewById(R.id.rb_xapk_extension)");
        RadioButton radioButton3 = (RadioButton) findViewById5;
        this.f2621e = radioButton3;
        if (radioButton3 == null) {
            AbstractC3159y.y("rbXapkExtension");
            radioButton3 = null;
        }
        radioButton3.setTypeface(aVar.u());
        RadioButton radioButton4 = this.f2621e;
        if (radioButton4 == null) {
            AbstractC3159y.y("rbXapkExtension");
            radioButton4 = null;
        }
        radioButton4.setText(".xapk");
        View findViewById6 = inflate.findViewById(E4.e.f2045I);
        AbstractC3159y.h(findViewById6, "view.findViewById(R.id.rb_apks_extension)");
        RadioButton radioButton5 = (RadioButton) findViewById6;
        this.f2622f = radioButton5;
        if (radioButton5 == null) {
            AbstractC3159y.y("rbApksExtension");
            radioButton5 = null;
        }
        radioButton5.setTypeface(aVar.u());
        RadioButton radioButton6 = this.f2622f;
        if (radioButton6 == null) {
            AbstractC3159y.y("rbApksExtension");
            radioButton6 = null;
        }
        radioButton6.setText(".apks");
        View findViewById7 = inflate.findViewById(E4.e.f2135m);
        AbstractC3159y.h(findViewById7, "view.findViewById(R.id.cb_versioncode)");
        CheckBox checkBox2 = (CheckBox) findViewById7;
        this.f2623g = checkBox2;
        if (checkBox2 == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox2 = null;
        }
        checkBox2.setTypeface(aVar.u());
        ((TextView) inflate.findViewById(E4.e.f2059M1)).setTypeface(aVar.u());
        View findViewById8 = inflate.findViewById(E4.e.f2056L1);
        AbstractC3159y.h(findViewById8, "view.findViewById(R.id.tv_result_dialog_path)");
        TextView textView6 = (TextView) findViewById8;
        this.f2618b = textView6;
        if (textView6 == null) {
            AbstractC3159y.y("tvResult");
            textView6 = null;
        }
        textView6.setTypeface(aVar.t());
        W();
        w0();
        CheckBox checkBox3 = this.f2623g;
        if (checkBox3 == null) {
            AbstractC3159y.y("cbVersioncode");
        } else {
            checkBox = checkBox3;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                r.D(r.this, compoundButton, z8);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: F4.f
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i8) {
                r.E(r.this, radioGroup3, i8);
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: F4.g
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i8) {
                r.F(r.this, radioGroup3, i8);
            }
        });
        View findViewById9 = inflate.findViewById(E4.e.f2032D1);
        AbstractC3159y.h(findViewById9, "view.findViewById(R.id.tv_ok_dialog_path)");
        TextView textView7 = (TextView) findViewById9;
        textView7.setTypeface(aVar.t());
        textView7.setOnClickListener(new View.OnClickListener() { // from class: F4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.G(r.this, view);
            }
        });
        View findViewById10 = inflate.findViewById(E4.e.f2163v0);
        AbstractC3159y.h(findViewById10, "view.findViewById(R.id.tv_cancel_dialog_path)");
        TextView textView8 = (TextView) findViewById10;
        textView8.setTypeface(aVar.t());
        textView8.setOnClickListener(new View.OnClickListener() { // from class: F4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.H(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f2617a = create;
        if (create != null && (window = create.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f2617a;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
    }

    public final void I(String str) {
        AlertDialog alertDialog = this.f2617a;
        if (alertDialog != null) {
            AbstractC3159y.f(alertDialog);
            alertDialog.dismiss();
        }
        View inflate = getLayoutInflater().inflate(E4.f.f2181e, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2070Q0);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        if (str == null) {
            textView.setText(getString(E4.h.f2209J));
        } else {
            textView.setText(str);
        }
        TextView textView2 = (TextView) inflate.findViewById(E4.e.f2136m0);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.J(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        this.f2617a = builder.create();
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.f2617a;
            AbstractC3159y.f(alertDialog2);
            Window window = alertDialog2.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog alertDialog3 = this.f2617a;
            AbstractC3159y.f(alertDialog3);
            alertDialog3.show();
        }
    }

    public final void K() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f2617a;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        View inflate = getLayoutInflater().inflate(E4.f.f2181e, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2070Q0);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        textView.setText(getString(E4.h.f2231c0));
        TextView textView2 = (TextView) inflate.findViewById(E4.e.f2136m0);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.L(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        this.f2617a = builder.create();
        if (!isFinishing() && (alertDialog = this.f2617a) != null) {
            alertDialog.show();
        }
    }

    public final void M() {
        try {
            if (!X()) {
                AlertDialog alertDialog = this.f2617a;
                if (alertDialog != null) {
                    AbstractC3159y.f(alertDialog);
                    alertDialog.dismiss();
                }
                View inflate = getLayoutInflater().inflate(E4.f.f2193q, (ViewGroup) null, false);
                TextView textView = (TextView) inflate.findViewById(E4.e.f2097Z0);
                j.a aVar = E4.j.f2272g;
                textView.setTypeface(aVar.t());
                int i8 = E4.h.f2251m0;
                int i9 = E4.h.f2230c;
                textView.setText(getString(i8, getString(i9)));
                TextView textView2 = (TextView) inflate.findViewById(E4.e.f2088W0);
                textView2.setTypeface(aVar.u());
                textView2.setText(getString(E4.h.f2225Z, getString(i9)));
                TextView textView3 = (TextView) inflate.findViewById(E4.e.f2136m0);
                textView3.setTypeface(aVar.t());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r.N(r.this, view);
                    }
                });
                TextView textView4 = (TextView) inflate.findViewById(E4.e.f2175z0);
                textView4.setTypeface(aVar.t());
                textView4.setOnClickListener(new View.OnClickListener() { // from class: F4.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r.O(r.this, view);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setView(inflate);
                AlertDialog create = builder.create();
                this.f2617a = create;
                AbstractC3159y.f(create);
                Window window = create.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                if (!isFinishing()) {
                    AlertDialog alertDialog2 = this.f2617a;
                    AbstractC3159y.f(alertDialog2);
                    alertDialog2.show();
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final AlertDialog R() {
        return this.f2617a;
    }

    public final boolean T() {
        if (Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    public final boolean U() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        return T();
    }

    public final boolean V() {
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT >= 26) {
            canRequestPackageInstalls = getPackageManager().canRequestPackageInstalls();
            return canRequestPackageInstalls;
        }
        if (Settings.Secure.getInt(getContentResolver(), "install_non_market_apps", 0) != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (context != null) {
            context = E4.j.f2272g.a(context);
        }
        super.attachBaseContext(context);
    }

    public abstract void c0();

    public abstract void d0();

    public abstract void e0();

    public abstract void f0();

    public abstract void h0();

    public final void m0() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 646);
        new G4.a(this).D(true);
    }

    public final void n0() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(195);
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        intent.putExtra("android.content.extra.FANCY", true);
        intent.putExtra("android.content.extra.SHOW_FILESIZE", true);
        this.f2629m.launch(intent);
    }

    public final void o0() {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                this.f2630n.launch(new Intent("android.settings.SECURITY_SETTINGS"));
            } else {
                this.f2630n.launch(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName())));
            }
        } catch (ActivityNotFoundException e8) {
            e8.printStackTrace();
            k0();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
        boolean z8;
        boolean z9;
        AbstractC3159y.i(permissions, "permissions");
        AbstractC3159y.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i8, permissions, grantResults);
        if (i8 != 645) {
            if (i8 == 646) {
                if (grantResults.length == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((!z9) && grantResults[0] == 0) {
                    b0();
                    return;
                } else {
                    a0();
                    return;
                }
            }
            return;
        }
        if (grantResults.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((!z8) && grantResults[0] == 0) {
            i0();
        } else {
            g0();
        }
    }

    public final void p0() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                try {
                    this.f2628l.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + getPackageName())));
                    return;
                } catch (ActivityNotFoundException e8) {
                    e8.printStackTrace();
                    q0();
                    return;
                }
            }
            if (!T()) {
                q0();
                return;
            }
            return;
        }
        if (!T()) {
            q0();
        }
    }

    public final void q0() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
    }

    public final void t0(AlertDialog alertDialog) {
        this.f2617a = alertDialog;
    }

    public void Z() {
    }

    public void a0() {
    }

    public void b0() {
    }

    public void g0() {
    }

    public void i0() {
    }

    public void j0() {
    }

    public void k0() {
    }

    public void l0() {
    }
}
