package com.lws.ximalaya.utils;



import com.lws.ximalaya.App;

import java.io.File;

import okhttp3.Cache;

/**
 * Created by song on 2018/2/10.
 */

public class CasheUtils {
    public static Cache getCache() {
        File fileCacheDirectory = new File(App.getContext().getCacheDir(),"ximalaya");
        int cacheSize = 10 * 1024 * 1024;
        return new Cache(fileCacheDirectory,cacheSize);
    }
}
