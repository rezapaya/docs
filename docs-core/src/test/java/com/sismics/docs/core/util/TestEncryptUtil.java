package com.sismics.docs.core.util;

import java.io.InputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

import junit.framework.Assert;

import org.junit.Test;

import com.google.common.base.Strings;
import com.google.common.io.ByteStreams;

/**
 * Test of the encryption utilities.
 * 
 * @author bgamard
 */
public class TestEncryptUtil {

    /**
     * Test private key.
     */
    String pk = "OnceUponATime";
    
    @Test
    public void generatePrivateKeyTest() throws Exception {
        String key = EncryptionUtil.generatePrivateKey();
        System.out.println(key);
        Assert.assertFalse(Strings.isNullOrEmpty(key));
    }
    
    @Test
    public void encryptStreamTest() throws Exception {
        try {
            EncryptionUtil.getEncryptionCipher("");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            // NOP
        }
        Cipher cipher = EncryptionUtil.getEncryptionCipher(pk);
        InputStream inputStream = new CipherInputStream(this.getClass().getResourceAsStream("/file/udhr.pdf"), cipher);
        byte[] encryptedData = ByteStreams.toByteArray(inputStream);
        byte[] assertData = ByteStreams.toByteArray(this.getClass().getResourceAsStream("/file/udhr_encrypted.pdf"));
        Assert.assertTrue(ByteStreams.equal(
                ByteStreams.newInputStreamSupplier(encryptedData),
                ByteStreams.newInputStreamSupplier(assertData)));
    }
    
    @Test
    public void decryptStreamTest() throws Exception {
        InputStream inputStream = EncryptionUtil.decryptInputStream(this.getClass().getResourceAsStream("/file/udhr_encrypted.pdf"), pk);
        byte[] encryptedData = ByteStreams.toByteArray(inputStream);
        byte[] assertData = ByteStreams.toByteArray(this.getClass().getResourceAsStream("/file/udhr.pdf"));
        Assert.assertTrue(ByteStreams.equal(
                ByteStreams.newInputStreamSupplier(encryptedData),
                ByteStreams.newInputStreamSupplier(assertData)));
    }
}
