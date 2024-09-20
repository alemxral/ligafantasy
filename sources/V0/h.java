package V0;

import V0.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11828a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f11829b;

    /* renamed from: c, reason: collision with root package name */
    private final S0.d f11830c;

    /* loaded from: classes3.dex */
    public static final class a implements T0.b {

        /* renamed from: d, reason: collision with root package name */
        private static final S0.d f11831d = new S0.d() { // from class: V0.g
            @Override // S0.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (S0.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f11832a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f11833b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private S0.d f11834c = f11831d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, S0.e eVar) {
            throw new S0.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f11832a), new HashMap(this.f11833b), this.f11834c);
        }

        public a d(T0.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // T0.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, S0.d dVar) {
            this.f11832a.put(cls, dVar);
            this.f11833b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, S0.d dVar) {
        this.f11828a = map;
        this.f11829b = map2;
        this.f11830c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f11828a, this.f11829b, this.f11830c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
