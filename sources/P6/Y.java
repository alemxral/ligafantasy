package P6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Y extends C1277c {

    /* renamed from: o, reason: collision with root package name */
    private final Socket f8014o;

    public Y(Socket socket) {
        AbstractC3159y.i(socket, "socket");
        this.f8014o = socket;
    }

    @Override // P6.C1277c
    protected void B() {
        Logger logger;
        Logger logger2;
        try {
            this.f8014o.close();
        } catch (AssertionError e8) {
            if (L.e(e8)) {
                logger2 = M.f7985a;
                logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f8014o, (Throwable) e8);
                return;
            }
            throw e8;
        } catch (Exception e9) {
            logger = M.f7985a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f8014o, (Throwable) e9);
        }
    }

    @Override // P6.C1277c
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
