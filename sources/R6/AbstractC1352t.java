package R6;

/* renamed from: R6.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1352t extends AbstractC1351s {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f8835a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f8836b;

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f8837c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1352t(boolean z8, int i8, byte[] bArr) {
        this.f8835a = z8;
        this.f8836b = i8;
        this.f8837c = E7.a.d(bArr);
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        boolean z8 = this.f8835a;
        return ((z8 ? 1 : 0) ^ this.f8836b) ^ E7.a.k(this.f8837c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1352t)) {
            return false;
        }
        AbstractC1352t abstractC1352t = (AbstractC1352t) abstractC1351s;
        if (this.f8835a != abstractC1352t.f8835a || this.f8836b != abstractC1352t.f8836b || !E7.a.a(this.f8837c, abstractC1352t.f8837c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public int q() {
        return E0.b(this.f8836b) + E0.a(this.f8837c.length) + this.f8837c.length;
    }

    @Override // R6.AbstractC1351s
    public boolean t() {
        return this.f8835a;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (t()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(w()));
        stringBuffer.append("]");
        if (this.f8837c != null) {
            stringBuffer.append(" #");
            str = F7.b.c(this.f8837c);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public int w() {
        return this.f8836b;
    }
}
