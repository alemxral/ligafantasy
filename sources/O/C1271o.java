package O;

import R.AbstractC1319p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: O.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1271o extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f7667a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f7668b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f7669c;

    public static C1271o h(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1271o c1271o = new C1271o();
        Dialog dialog2 = (Dialog) AbstractC1319p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1271o.f7667a = dialog2;
        if (onCancelListener != null) {
            c1271o.f7668b = onCancelListener;
        }
        return c1271o;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7668b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7667a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f7669c == null) {
                this.f7669c = new AlertDialog.Builder((Context) AbstractC1319p.l(getContext())).create();
            }
            return this.f7669c;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
