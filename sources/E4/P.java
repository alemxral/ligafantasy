package e4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import b3.EnumC1870e;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3159y;
import m4.A0;
import m4.z0;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final int f30460a = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f30461b = "cvc";

    /* renamed from: c, reason: collision with root package name */
    private final int f30462c = AbstractC3053E.f32863e0;

    /* renamed from: d, reason: collision with root package name */
    private final int f30463d = KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f30464e = VisualTransformation.Companion.getNone();

    public String a(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        return rawValue;
    }

    public String b(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    public m4.y0 c(EnumC1870e brand, String number, int i8) {
        boolean z8;
        AbstractC3159y.i(brand, "brand");
        AbstractC3159y.i(number, "number");
        if (brand.m() != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (number.length() == 0) {
            return z0.a.f35843c;
        }
        if (brand == EnumC1870e.f14433w) {
            if (number.length() == i8) {
                return A0.a.f34928a;
            }
            return A0.b.f34929a;
        }
        if (z8 && number.length() < i8) {
            return new z0.b(AbstractC3053E.f32897v0);
        }
        if (z8 && number.length() > i8) {
            return new z0.c(AbstractC3053E.f32897v0, null, false, 6, null);
        }
        if (z8 && number.length() == i8) {
            return A0.a.f34928a;
        }
        return new z0.c(AbstractC3053E.f32897v0, null, false, 6, null);
    }

    public String d(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public int e() {
        return this.f30460a;
    }

    public String f() {
        return this.f30461b;
    }

    public int g() {
        return this.f30463d;
    }

    public VisualTransformation h() {
        return this.f30464e;
    }
}
