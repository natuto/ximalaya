package com.lws.ximalaya.model;

import com.lws.ximalaya.api.Constants;
import com.lws.ximalaya.api.Ximalaya;
import com.lws.ximalaya.bean.PlayDetailBean;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.contract.HomeContract;
import com.lws.ximalaya.contract.PlayDetailContract;
import com.lws.ximalaya.utils.RetrofitUtils;
import com.lws.ximalaya.utils.TimeUtils;

import io.reactivex.Observable;

/**
 * song on 2018/4/8 03:12
 */
public class PlayDetailModel implements PlayDetailContract.Model {


    @Override
    public Observable<PlayDetailBean> getData(int id) {
        return RetrofitUtils.createApi(Ximalaya.class,Constants.HOST ).getPlayData(TimeUtils.getTimesamp(),id);
    }
}
