package com.lws.ximalaya.contract;

import com.lws.ximalaya.base.BaseModel;
import com.lws.ximalaya.base.BaseView;
import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.bean.GatherBean;
import com.lws.ximalaya.bean.PlayDetailBean;

import io.reactivex.Observable;

/**
 * song on 2018/4/18 09:32
 */
public interface PlayDetailContract {
    interface View extends BaseView {
        void showError();
        void showLoading(PlayDetailBean playDetailBean);
    }
    interface Presenter {
        void getLatest(int id);

    }
    interface Model extends BaseModel {
        Observable<PlayDetailBean> getData(int id );
    }
}
