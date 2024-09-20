package D5;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3159y;
import v5.C3832b;

/* loaded from: classes5.dex */
public final class j extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1859a;

    public j(f fVar) {
        this.f1859a = fVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        AbstractC3159y.i(view, "view");
        try {
            l lVar = this.f1859a.f1848h;
            l lVar2 = null;
            if (lVar == null) {
                AbstractC3159y.y("viewModel");
                lVar = null;
            }
            if (lVar.f1871h.f5608g.length() > 0) {
                f fVar = this.f1859a;
                Intent intent = new Intent("android.intent.action.VIEW");
                l lVar3 = this.f1859a.f1848h;
                if (lVar3 == null) {
                    AbstractC3159y.y("viewModel");
                } else {
                    lVar2 = lVar3;
                }
                intent.setData(Uri.parse(lVar2.f1871h.f5608g));
                fVar.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            C3832b.b(C3832b.f38857a, ChoiceError.INVALID_URL, null, null, null, null, 30);
        }
    }
}
