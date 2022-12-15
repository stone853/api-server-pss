package com.sk.web.utils;

/**
 * @Author jinshi
 * @Date 2021/9/6 11:59
 * @Version 1.0
 */
import org.apache.commons.lang3.ObjectUtils;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.encryption("Jin87520024"));
        //a5b1bd93e14d7eafc89210492ec6b82a


    }

    /**

     *

     * @param plainText

     * 明文

     * @return 32位密文

     */

    public String encryption(String plainText) {
        String re_md5 = new String();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(plainText.getBytes());

            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");

            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];

                if (i < 0)

                    i += 256;

                if (i < 16)

                    buf.append("0");

                buf.append(Integer.toHexString(i));

            }

            re_md5 = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }

        return re_md5;

    }

}