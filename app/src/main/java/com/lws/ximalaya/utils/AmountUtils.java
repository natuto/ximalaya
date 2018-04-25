package com.lws.ximalaya.utils;

/**
 * song on 2018/4/12 21:00
 */
public class AmountUtils {
    public static String getAmount(int count) {
       double d;

        if (count > 9999){
            if (count > 99999999) {
                d = count /100000000.0;
                return String.format("%.1f",d)+"亿";
            }
            d = count /10000.0;
            return String.format("%.1f",d)+"万";

        }else {
            return count+"";
        }
    }




}
