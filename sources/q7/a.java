package Q7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes5.dex */
public class a extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f8360a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f8361b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f8362c;

    /* renamed from: d, reason: collision with root package name */
    public ConstraintLayout f8363d;

    /* renamed from: e, reason: collision with root package name */
    public SearchView f8364e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f8365f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f8366g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f8367h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f8368i;

    /* renamed from: j, reason: collision with root package name */
    public J7.c f8369j;

    /* renamed from: k, reason: collision with root package name */
    public Typeface f8370k;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f8371l;

    public final void h() {
        int i8;
        SearchView searchView = this.f8364e;
        if (searchView != null) {
            int i9 = searchView.getContext().getResources().getConfiguration().uiMode & 48;
            Context context = searchView.getContext();
            if (i9 == 32) {
                i8 = I1.a.f3726e;
            } else {
                i8 = I1.a.f3727f;
            }
            searchView.setBackgroundTintList(ContextCompat.getColorStateList(context, i8));
        }
    }

    public final void i() {
        ImageView imageView = this.f8362c;
        if (imageView != null) {
            imageView.setImageTintList(j());
        }
        ImageView imageView2 = this.f8368i;
        if (imageView2 != null) {
            imageView2.setImageTintList(j());
        }
        TextView textView = this.f8361b;
        if (textView != null) {
            textView.setTextColor(j());
        }
    }

    public final ColorStateList j() {
        int i8;
        int i9 = requireContext().getResources().getConfiguration().uiMode & 48;
        Context requireContext = requireContext();
        if (i9 == 32) {
            i8 = I1.a.f3725d;
        } else {
            i8 = I1.a.f3722a;
        }
        return ContextCompat.getColorStateList(requireContext, i8);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i8;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 29) {
            i8 = R.style.Theme.DeviceDefault.DayNight;
        } else {
            i8 = R.style.Theme.Material.Light.DarkActionBar;
        }
        setStyle(1, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.a.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
