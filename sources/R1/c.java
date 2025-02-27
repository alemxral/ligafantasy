package R1;

import com.mbridge.msdk.MBridgeConstans;
import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: classes4.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ECParameterSpec f8646a = new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951")), new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853948"), new BigInteger("41058363725152142129326129780047268409114441015993725554835256314039467401291")), new ECPoint(new BigInteger("48439561293906451759052585252797914202762949526041747995844080717082404635286"), new BigInteger("36134250956749795798585127919587881956611106672985015071877198253568414405109")), new BigInteger("115792089210356248762697446949407573529996955224135760342422259061068512044369"), 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ECParameterSpec f8647b = new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("115792089237316195423570985008687907853269984665640564039457584007908834671663")), new BigInteger(MBridgeConstans.ENDCARD_URL_TYPE_PL), new BigInteger("7")), new ECPoint(new BigInteger("55066263022277343669578718895168534326250603453777594175500187360389116729240"), new BigInteger("32670510020758816978083085130507043184471273380659243275938904335757337482424")), new BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), 1);

    /* renamed from: c, reason: collision with root package name */
    private static final ECParameterSpec f8648c = new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319")), new BigInteger("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112316"), new BigInteger("27580193559959705877849011840389048093056905856361568521428707301988689241309860865136260764883745107765439761230575")), new ECPoint(new BigInteger("26247035095799689268623156744566981891852923491109213387815615900925518854738050089022388053975719786650872476732087"), new BigInteger("8325710961489029985546751289520108179287853048861315594709205902480503199884419224438643760392947333078086511627871")), new BigInteger("39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643"), 1);

    /* renamed from: d, reason: collision with root package name */
    private static final ECParameterSpec f8649d = new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151")), new BigInteger("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057148"), new BigInteger("1093849038073734274511112390766805569936207598951683748994586394495953116150735016013708737573759623248592132296706313309438452531591012912142327488478985984")), new ECPoint(new BigInteger("2661740802050217063228768716723360960729859168756973147706671368418802944996427808491545080627771902352094241225065558662157113545570916814161637315895999846"), new BigInteger("3757180025770020463545507224491183603594455134769762486694567779615544477440556316691234405012945539562144444537289428522585666729196580810124344277578376784")), new BigInteger("6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449"), 1);

    public static a a(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            return null;
        }
        int fieldSize = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec2 = f8646a;
        if (fieldSize == eCParameterSpec2.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec2.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec2.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec2.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec2.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor()) {
            return a.f8614d;
        }
        int fieldSize2 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec3 = f8647b;
        if (fieldSize2 == eCParameterSpec3.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec3.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec3.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec3.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec3.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec3.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec3.getCofactor()) {
            return a.f8615e;
        }
        int fieldSize3 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec4 = f8648c;
        if (fieldSize3 == eCParameterSpec4.getCurve().getField().getFieldSize() && eCParameterSpec.getCurve().getA().equals(eCParameterSpec4.getCurve().getA()) && eCParameterSpec.getCurve().getB().equals(eCParameterSpec4.getCurve().getB()) && eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec4.getGenerator().getAffineX()) && eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec4.getGenerator().getAffineY()) && eCParameterSpec.getOrder().equals(eCParameterSpec4.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec4.getCofactor()) {
            return a.f8617g;
        }
        int fieldSize4 = eCParameterSpec.getCurve().getField().getFieldSize();
        ECParameterSpec eCParameterSpec5 = f8649d;
        if (fieldSize4 != eCParameterSpec5.getCurve().getField().getFieldSize() || !eCParameterSpec.getCurve().getA().equals(eCParameterSpec5.getCurve().getA()) || !eCParameterSpec.getCurve().getB().equals(eCParameterSpec5.getCurve().getB()) || !eCParameterSpec.getGenerator().getAffineX().equals(eCParameterSpec5.getGenerator().getAffineX()) || !eCParameterSpec.getGenerator().getAffineY().equals(eCParameterSpec5.getGenerator().getAffineY()) || !eCParameterSpec.getOrder().equals(eCParameterSpec5.getOrder()) || eCParameterSpec.getCofactor() != eCParameterSpec5.getCofactor()) {
            return null;
        }
        return a.f8618h;
    }

    public static ECParameterSpec b(a aVar) {
        if (a.f8614d.equals(aVar)) {
            return f8646a;
        }
        if (a.f8615e.equals(aVar)) {
            return f8647b;
        }
        if (a.f8617g.equals(aVar)) {
            return f8648c;
        }
        if (a.f8618h.equals(aVar)) {
            return f8649d;
        }
        return null;
    }
}
