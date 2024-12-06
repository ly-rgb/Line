package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class GetKey {
    static final Logger logger = Logger.getLogger("line");
    public static String get_key(String timeStamp) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String verify_str = "Android_OS14.19.1--CN";
        String all_str = verify_str + "" + timeStamp;
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] verify_byte = all_str.getBytes("UTF-8");
        byte[] fixed_byte = {76, 96, 94, -1, -33, 61, -4, -95, 33, 125, 72, 23, 64, 32, 86, -111, -128, -36, 35, 56, -91, 119, 42, -128, -19, 10, -86, 1, -68, -48, -96, -113};

        md5.update(verify_byte);
        md5.update(fixed_byte);
        byte[] key_byte = md5.digest();

        // 将哈希值字节数组转换为十六进制字符串
        StringBuilder hexString = new StringBuilder();
        for (byte b : key_byte) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        if (hexString.toString().length() == 32){
            logger.log(Level.INFO, "Key successfully obtained");
        }else{
            logger.log(Level.WARNING, "Key generation failed");
        }

        return hexString.toString();
    }
}
