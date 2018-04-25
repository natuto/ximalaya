package com.lws.ximalaya.model;

import com.lws.ximalaya.api.Constants;
import com.lws.ximalaya.api.Ximalaya;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.contract.HomeContract;
import com.lws.ximalaya.utils.RetrofitUtils;
import com.lws.ximalaya.utils.TimeUtils;

import io.reactivex.Observable;

/**
 * song on 2018/4/8 03:12
 */
public class HomeModel implements HomeContract.Model {


   /* @Override
    public Observable<Ximalayabaen> getData() {
        return RetrofitUtils.createApi(Ximalaya.class, Constants.HOST).getXimalaya();
    }*/
     @Override
    public Observable<Ximalayabaen> getData() {
        return RetrofitUtils.createApi(Ximalaya.class, Constants.HOST).getXimalaya(TimeUtils.getTimesamp());
    }
}
