package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class aa {

    /* renamed from: b, reason: collision with root package name */
    protected static MessageDigest f19955b;

    /* renamed from: a, reason: collision with root package name */
    protected static char[] f19954a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    private static String f19956c = "SameFileMD5";

    static {
        f19955b = null;
        try {
            f19955b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e8) {
            System.err.println(aa.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e8.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        if (file == null || !file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
            try {
                byte[] bArr = new byte[10485760];
                while (true) {
                    int read = randomAccessFile2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                byte[] digest = messageDigest.digest();
                String a8 = a(digest, 0, digest.length);
                try {
                    randomAccessFile2.close();
                } catch (IOException e8) {
                    ad.b(f19956c, e8.getMessage());
                }
                return a8;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                try {
                    ad.b(f19956c, th.getMessage());
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e9) {
                            ad.b(f19956c, e9.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String a(byte[] bArr, int i8, int i9) {
        StringBuffer stringBuffer = new StringBuffer(i9 * 2);
        int i10 = i9 + i8;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            char[] cArr = f19954a;
            char c8 = cArr[(b8 & 240) >> 4];
            char c9 = cArr[b8 & 15];
            stringBuffer.append(c8);
            stringBuffer.append(c9);
            i8++;
        }
        return stringBuffer.toString();
    }
}
