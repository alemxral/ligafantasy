package O;

import R.AbstractC1319p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: O.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class DialogFragmentC1259c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f7643a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f7644b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f7645c;

    public static DialogFragmentC1259c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1259c dialogFragmentC1259c = new DialogFragmentC1259c();
        Dialog dialog2 = (Dialog) AbstractC1319p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1259c.f7643a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1259c.f7644b = onCancelListener;
        }
        return dialogFragmentC1259c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7644b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7643a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f7645c == null) {
                this.f7645c = new AlertDialog.Builder((Context) AbstractC1319p.l(getActivity())).create();
            }
            return this.f7645c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
