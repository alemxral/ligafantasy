package z5;

import L7.w;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y5.s;

/* loaded from: classes5.dex */
public final class g extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f40454a;

    /* renamed from: b, reason: collision with root package name */
    public final L7.g f40455b;

    /* renamed from: c, reason: collision with root package name */
    public final w f40456c;

    /* renamed from: d, reason: collision with root package name */
    public final List f40457d;

    public g(s tcModel, L7.g disclosureRepository, w translationsTextRepository) {
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(disclosureRepository, "disclosureRepository");
        AbstractC3159y.i(translationsTextRepository, "translationsTextRepository");
        this.f40454a = tcModel;
        this.f40455b = disclosureRepository;
        this.f40456c = translationsTextRepository;
        this.f40457d = new ArrayList();
    }

    public final int a(R7.e switchItemType) {
        AbstractC3159y.i(switchItemType, "switchItemType");
        int ordinal = switchItemType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 2;
            }
            if (ordinal == 2) {
                return 10;
            }
        }
        return 8;
    }
}
