package com.utils;

import com.sun.istack.internal.NotNull;
import net.sourceforge.pinyin4j.PinyinHelper;

public class ChineseToTransHelper {

    /*汉字转拼音并且获取首字母*/
    @NotNull public static String getHanYuPinYinHeader(@NotNull String str){
        /*变量.var可以自动生成所需变量*/
        StringBuilder strbul = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if(pinyinArray != null){
                strbul.append(pinyinArray[0].charAt(0));
            } else {
                strbul.append(word);
            }
        }
        return strbul.toString();

    }

    /*将字符串转成ASCII码*/
    @NotNull public static String getCnASCII(@NotNull String cnStr){
        StringBuilder strBul = new StringBuilder();
        byte[] bGBK = cnStr.getBytes();
        for (int i = 0; i < bGBK.length; i++) {
            strBul.append(Integer.toHexString(bGBK[i] & 0xff));
        }
        return strBul.toString();
    }



}
