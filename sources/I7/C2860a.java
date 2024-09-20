package i7;

import B7.f;
import B7.g;
import R6.C1347n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import f7.InterfaceC2692a;
import g7.AbstractC2730a;
import h7.InterfaceC2764a;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import k7.e;
import z7.c;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2860a extends Provider {

    /* renamed from: a, reason: collision with root package name */
    private static String f31798a = "BouncyCastle Security Provider v1.69";

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC2692a f31799b = new C2861b();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f31800c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Class f31801d = AbstractC2730a.a(C2860a.class, "java.security.cert.PKIXRevocationChecker");

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f31802e = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f31803f = {"SipHash", "SipHash128", "Poly1305"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f31804g = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f31805h = {"X509", "IES", "COMPOSITE"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f31806i = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f31807j = {"GOST3411", "Keccak", "MD2", "MD4", SameMD5.TAG, "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f31808k = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f31809l = {"DRBG"};

    /* renamed from: i7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0762a implements PrivilegedAction {
        C0762a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            C2860a.this.f();
            return null;
        }
    }

    public C2860a() {
        super("BC", 1.69d, f31798a);
        AccessController.doPrivileged(new C0762a());
    }

    private void c(String str, String[] strArr) {
        for (int i8 = 0; i8 != strArr.length; i8++) {
            Class a8 = AbstractC2730a.a(C2860a.class, str + strArr[i8] + "$Mappings");
            if (a8 != null) {
                try {
                    android.support.v4.media.a.a(a8.newInstance());
                    throw null;
                } catch (Exception e8) {
                    throw new InternalError("cannot create instance of " + str + strArr[i8] + "$Mappings : " + e8);
                }
            }
        }
    }

    private void e() {
        b(e.f33681r, new c());
        b(e.f33685v, new w7.c());
        b(e.f33686w, new f());
        b(T6.a.f11034a, new f());
        b(e.f33644F, new g());
        b(T6.a.f11035b, new g());
        b(e.f33676m, new v7.f());
        b(e.f33677n, new v7.e());
        b(e.f33664a, new y7.c());
        b(e.f33662X, new x7.c());
        b(e.f33663Y, new x7.c());
        b(W6.a.f12021I0, new u7.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String str;
        String str2;
        c("org.bouncycastle.jcajce.provider.digest.", f31807j);
        c("org.bouncycastle.jcajce.provider.symmetric.", f31802e);
        c("org.bouncycastle.jcajce.provider.symmetric.", f31803f);
        c("org.bouncycastle.jcajce.provider.symmetric.", f31804g);
        c("org.bouncycastle.jcajce.provider.asymmetric.", f31805h);
        c("org.bouncycastle.jcajce.provider.asymmetric.", f31806i);
        c("org.bouncycastle.jcajce.provider.keystore.", f31808k);
        c("org.bouncycastle.jcajce.provider.drbg.", f31809l);
        e();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = f31801d;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public void b(C1347n c1347n, InterfaceC2764a interfaceC2764a) {
        Map map = f31800c;
        synchronized (map) {
            map.put(c1347n, interfaceC2764a);
        }
    }
}
