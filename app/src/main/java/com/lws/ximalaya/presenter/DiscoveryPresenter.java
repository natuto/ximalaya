package com.lws.ximalaya.presenter;

import com.lws.ximalaya.base.BasePresenter;
import com.lws.ximalaya.bean.DiscoveryBean;
import com.lws.ximalaya.contract.DiscoverContract;
import com.lws.ximalaya.model.DiscoveryModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * song on 2018/5/8 18:15
 */
public class DiscoveryPresenter extends BasePresenter<DiscoverContract.View> implements DiscoverContract.Presenter {
    private DiscoveryModel mDiscoveryModel;
    public DiscoveryPresenter() {
        mDiscoveryModel = new DiscoveryModel();

    }

    @Override
    public void getLatest(int id) {
        mDiscoveryModel.getData(id).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DiscoveryBean>() {
                    @Override
                    public void accept(DiscoveryBean discoveryBean) throws Exception {

                                view.showLoading(discoveryBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        view.showError();
                    }
                });
    }
}
