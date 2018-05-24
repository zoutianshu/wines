package com.alex.service.deciphering;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.Security;
import java.util.Arrays;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

@Service("decipherimpl")
public class decipherimpl implements deciphering {
    @Override
    @Async("asyncTaskExecutor")
    public String AES_128_CBC_Decipher(byte[] key, byte[] iv, byte[] encryptedData) {
        String decipherData=null;
        int base = 16;
        if (key.length % base != 0) {
            int groups = key.length / base + (key.length % base != 0 ? 1 : 0);
            byte[] temp = new byte[groups * base];
            Arrays.fill(temp, (byte) 0);
            System.arraycopy(key, 0, temp, 0, key.length);
            key = temp;
        }
        Security.addProvider(new BouncyCastleProvider());
        Key realKey=new SecretKeySpec(key, "AES");
        try {
            Cipher cipher=Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            cipher.init(Cipher.DECRYPT_MODE, realKey, new IvParameterSpec(iv));
            decipherData=new String(cipher.doFinal(encryptedData));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return decipherData;
    }

    @Override
    @Async("asyncTaskExecutor")
    public String AES_128_CBC_Encryption(byte[] key, byte[] iv, byte[] decipherData) {
        String encryptedData=null;
        int base = 16;
        if (key.length % base != 0) {
            int groups = key.length / base + (key.length % base != 0 ? 1 : 0);
            byte[] temp = new byte[groups * base];
            Arrays.fill(temp, (byte) 0);
            System.arraycopy(key, 0, temp, 0, key.length);
            key = temp;
        }
        Security.addProvider(new BouncyCastleProvider());
        Key realKey=new SecretKeySpec(key, "AES");
        try {
            Cipher cipher=Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            cipher.init(Cipher.ENCRYPT_MODE, realKey, new IvParameterSpec(iv));
            encryptedData=new String(cipher.doFinal(decipherData));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return encryptedData;
    }

    @Override
    @Async("asyncTaskExecutor")
    public byte[] BASE64Decoder(String data) {
        byte[] decipherData=Base64.decodeBase64(data);
        return decipherData;
    }

    @Override
    @Async("asyncTaskExecutor")
    public byte[] BASE64Encoder(byte[] data) {
        byte[] encryptionData=Base64.encodeBase64(data);
        return encryptionData;
    }
}
