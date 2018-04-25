package com.lws.ximalaya.model;

import com.lws.ximalaya.api.Constants;
import com.lws.ximalaya.api.Ximalaya;
import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.bean.GatherBean;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.contract.HomeContract;
import com.lws.ximalaya.contract.HomeGatherContract;
import com.lws.ximalaya.utils.RetrofitUtils;
import com.lws.ximalaya.utils.TimeUtils;
import com.orhanobut.logger.Logger;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

/**
 * song on 2018/4/8 03:12
 */
public class HomeGatherModel implements HomeGatherContract.Model {


    @Override
    public Observable<GatherBean> getData(int id, int page) {


        return RetrofitUtils.createApi(Ximalaya.class,Constants.HOST ).getGarher(TimeUtils.getTimesamp(),id ,page);

    }

    @Override
    public Observable<GarhetMoreBean> getMoreData(int id, int page) {
//        Logger.d(TimeUtils.getTimesamp());
        return RetrofitUtils.createApi(Ximalaya.class,Constants.HOST ).getGarhetMore(TimeUtils.getTimesamp(),id ,page);
    }
}
