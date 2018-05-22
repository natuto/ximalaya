package com.lws.ximalaya.model;

import com.lws.ximalaya.api.Constants;
import com.lws.ximalaya.api.Ximalaya;
import com.lws.ximalaya.bean.DiscoveryBean;
import com.lws.ximalaya.contract.DiscoverContract;
import com.lws.ximalaya.utils.RetrofitUtils;
import com.lws.ximalaya.utils.TimeUtils;

import io.reactivex.Observable;

/**
 * song on 2018/5/8 18:12
 */
public class DiscoveryModel implements DiscoverContract.Model {
    @Override
    public Observable<DiscoveryBean> getData(int id) {
        return RetrofitUtils.createApi(Ximalaya.class, Constants.HOST).getDiscover(TimeUtils.getTimesamp(),id );
    }
}
