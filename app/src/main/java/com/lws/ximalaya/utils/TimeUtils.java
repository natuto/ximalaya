package com.lws.ximalaya.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * song on 2018/4/14 08:33
 */
public class TimeUtils {
    public static String getUpdataTime(long time){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd ");
        Date date = new Date(time);
        res = simpleDateFormat.format(date);
        return res+"更新";

    }
    public static String getCreateTime( long l){
        long time=System.currentTimeMillis();
        long year = 31536000;
        long day = 86400;
        long hour = 3600;
        long minute = 60;
        time = time - l;
        time = time /60000;
        if (time> 60){
            if (time > year)
                return time /year+"年前";
            if (time > day)
                return time/day +"天前";
            if (time > hour)
                return time/hour+"小时前";
            if (time >minute)
            return time/minute+"分钟前";


        }

            return time+"秒前";



    }
    public  static String getPlayTime(int second ){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        Date date = new Date(second*1000);
        res = simpleDateFormat.format(date);
        return res;

    }
    public static String getTimesamp(){
        return   System.currentTimeMillis()+"";
    }
}
