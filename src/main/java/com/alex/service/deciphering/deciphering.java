package com.alex.service.deciphering;

public interface deciphering {
    public String AES_128_CBC_Decipher(byte[] key,byte[] iv,byte[] encryptedData);
    public String AES_128_CBC_Encryption(byte[] key,byte[] iv,byte[] decipherData);
    public byte[] BASE64Decoder(String data);
    public byte[] BASE64Encoder(byte[] data);
}
