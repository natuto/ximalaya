package com.lws.ximalaya.contract;

import com.lws.ximalaya.base.BaseModel;
import com.lws.ximalaya.base.BaseView;
import com.lws.ximalaya.bean.DiscoveryBean;
import com.lws.ximalaya.bean.Ximalayabaen;

import io.reactivex.Observable;

/**
 * song on 2018/5/8 17:48
 */
public interface DiscoverContract {
    interface View extends BaseView {
        void showError();
        void showLoading(DiscoveryBean discoveryBean);
    }
    interface Presenter {
        void getLatest(int id);
    }
    interface Model extends BaseModel {
        Observable<DiscoveryBean> getData(int id);


    }
}
